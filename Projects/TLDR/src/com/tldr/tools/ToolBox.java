package com.tldr.tools;

import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.EditText;

public final class ToolBox {
	public final static String TAG_REAL_DISTANCE="real_distance";
	
	public static void showErrorMessage(EditText view, String message) {
		int ecolor = Color.RED; // whatever color you want
		ForegroundColorSpan fgcspan = new ForegroundColorSpan(ecolor);
		SpannableStringBuilder ssbuilder;
		ssbuilder = new SpannableStringBuilder(message);
		ssbuilder.setSpan(fgcspan, 0, message.length(), 0);
		view.setError(ssbuilder);
	}

	
	public static void showAlert(Activity context, String title, String message, String closeButtonText, OnClickListener l) {
		AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title)
        .setMessage(message)
        .setCancelable(false)
        .setNegativeButton(closeButtonText,l);
        AlertDialog alert = builder.create();
        alert.show();
	}
	
	public static void addInRealDistanceOrder(List<HashMap<String, String>> list, HashMap<String, String> element){
		float new_distance=Float.parseFloat(element.get("real_distance"));
		boolean added=false;
		for(int i=0; i<list.size(); i++){
			float d1=Float.parseFloat(list.get(i).get("real_distance"));
			if(!added&&new_distance<d1){
				list.add(i, element);
				added=true;
			}
		}
		if(!added)
			list.add(element);
	}
}
