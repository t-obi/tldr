package com.tldr.gamelogic;

import java.util.Map;

import android.annotation.SuppressLint;
import android.util.Log;

import com.tldr.exlap.TriggerRegister;
import com.tldr.exlap.TriggerRegister.TriggerDomains;
import com.tldr.gamelogic.GoalRegister.OnTrue;

@SuppressLint("DefaultLocale")
public class ConditionCheck {

	public enum Data {
		NONE, DISPLAYEDVEHICLESPEED, CURRENTGEAR
	}

	public enum Operator {
		NONE, LE, EQ
	}

	public enum CLAZZ {
		Double
	}

	private DataParser parser;
	private DataChecker checker;

	private TriggerRegister.TriggerDomains domain;
	private String identifier;
	private OnTrue onTrue;

	public ConditionCheck(Map<String, String> contidion, OnTrue onTrue) {
		if (contidion.containsKey("data")) {
			this.onTrue = onTrue;
			setIdentifier(contidion.get("data"));
			Data data = null;
			if (containsData(contidion.get("data").toUpperCase())) {
				data = Data.valueOf(contidion.get("data").toUpperCase());
			}
			Operator operator = null;
			if (containsOperator(contidion.get("operator").toUpperCase())) {
				operator = Operator.valueOf(contidion.get("operator")
						.toUpperCase());
			}
			if (data != null && operator != null) {
				Log.i("TLDR",
						"Condition registation failed due to lag of coding!");
			}
			this.setParser(data);
			if (this.parser != null) {
				this.setChecker(this.parser.getDataClassName(), operator);
				this.checker.setValue(parser.parseData(contidion.get("value")));
			}

		}
	}

	private void setParser(Data data) {
		if (data == Data.NONE || data == Data.DISPLAYEDVEHICLESPEED
				|| data == Data.CURRENTGEAR) {
			this.setDomain(TriggerDomains.EXLAP);
			this.parser = new DataParser<Double>() {

				@Override
				public Double parseData(Object object) {
					String dString = (String) object;
					double rtn = Double.parseDouble(dString);
					return rtn;
				}

				@Override
				public CLAZZ getDataClassName() {
					return CLAZZ.valueOf(Double.class.getSimpleName());
				}

			};
		}

	}

	private void setChecker(CLAZZ clazz, Operator operator) {
		if (clazz == CLAZZ.Double && operator == Operator.LE) {
			this.checker = new DataChecker<Double>() {
				double value;

				@Override
				public void setValue(Double value) {
					this.value = value;
				}

				@Override
				public boolean checkData(Double data) {
					return data < this.value;
				}

			};
		}
		if (clazz == CLAZZ.Double && operator == Operator.EQ) {
			this.checker = new DataChecker<Double>() {
				double value;

				@Override
				public void setValue(Double value) {
					this.value = value;
				}

				@Override
				public boolean checkData(Double data) {
					return data == this.value;
				}

			};
		}

	}

	public boolean successfullyInitialized() {
		return this.parser != null && this.checker != null;
	}

	@SuppressWarnings("unchecked")
	public boolean updateData(Object data) {
		boolean result = false;
		try {
			result = this.checker.checkData(parser.parseData(data));
		} catch (Exception e) {
			// e.printStackTrace();
		}
		if (result && this.onTrue != null) {
			this.onTrue.onTrue();
		}
		return result;
	}

	public TriggerRegister.TriggerDomains getDomain() {
		return domain;
	}

	public void setDomain(TriggerRegister.TriggerDomains domain) {
		this.domain = domain;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public interface DataParser<T> {
		public CLAZZ getDataClassName();

		public T parseData(Object object);
	}

	public interface DataChecker<T> {
		public void setValue(T value);

		public boolean checkData(T data);
	}

	public static boolean containsData(String test) {

		for (Data c : Data.values()) {
			if (c.name().equals(test)) {
				return true;
			}
		}

		return false;
	}

	public static boolean containsOperator(String test) {

		for (Operator c : Operator.values()) {
			if (c.name().equals(test)) {
				return true;
			}
		}
		return false;
	}

}
