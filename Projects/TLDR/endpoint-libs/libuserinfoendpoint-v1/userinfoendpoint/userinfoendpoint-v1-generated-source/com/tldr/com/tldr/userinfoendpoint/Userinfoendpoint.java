/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2013-06-26 16:27:34 UTC)
 * on 2013-07-07 at 16:25:39 UTC 
 * Modify at your own risk.
 */

package com.tldr.com.tldr.userinfoendpoint;

/**
 * Service definition for Userinfoendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link UserinfoendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Userinfoendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION == 14,
        "You are currently running with version %s of google-api-client. " +
        "You need version 1.14 of google-api-client to run version " +
        "1.14.2-beta of the  library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://swp-tldr.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "userinfoendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Userinfoendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Userinfoendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getUserInfo".
   *
   * This request holds the parameters needed by the the userinfoendpoint server.  After setting any
   * optional parameters, call the {@link GetUserInfo#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public GetUserInfo getUserInfo(java.lang.Long id) throws java.io.IOException {
    GetUserInfo result = new GetUserInfo(id);
    initialize(result);
    return result;
  }

  public class GetUserInfo extends UserinfoendpointRequest<com.tldr.com.tldr.userinfoendpoint.model.UserInfo> {

    private static final String REST_PATH = "userinfo/{id}";

    /**
     * Create a request for the method "getUserInfo".
     *
     * This request holds the parameters needed by the the userinfoendpoint server.  After setting any
     * optional parameters, call the {@link GetUserInfo#execute()} method to invoke the remote
     * operation. <p> {@link
     * GetUserInfo#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetUserInfo(java.lang.Long id) {
      super(Userinfoendpoint.this, "GET", REST_PATH, null, com.tldr.com.tldr.userinfoendpoint.model.UserInfo.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetUserInfo setAlt(java.lang.String alt) {
      return (GetUserInfo) super.setAlt(alt);
    }

    @Override
    public GetUserInfo setFields(java.lang.String fields) {
      return (GetUserInfo) super.setFields(fields);
    }

    @Override
    public GetUserInfo setKey(java.lang.String key) {
      return (GetUserInfo) super.setKey(key);
    }

    @Override
    public GetUserInfo setOauthToken(java.lang.String oauthToken) {
      return (GetUserInfo) super.setOauthToken(oauthToken);
    }

    @Override
    public GetUserInfo setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetUserInfo) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetUserInfo setQuotaUser(java.lang.String quotaUser) {
      return (GetUserInfo) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetUserInfo setUserIp(java.lang.String userIp) {
      return (GetUserInfo) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetUserInfo setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetUserInfo set(String parameterName, Object value) {
      return (GetUserInfo) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listUserInfo".
   *
   * This request holds the parameters needed by the the userinfoendpoint server.  After setting any
   * optional parameters, call the {@link ListUserInfo#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public ListUserInfo listUserInfo() throws java.io.IOException {
    ListUserInfo result = new ListUserInfo();
    initialize(result);
    return result;
  }

  public class ListUserInfo extends UserinfoendpointRequest<com.tldr.com.tldr.userinfoendpoint.model.CollectionResponseUserInfo> {

    private static final String REST_PATH = "userinfo";

    /**
     * Create a request for the method "listUserInfo".
     *
     * This request holds the parameters needed by the the userinfoendpoint server.  After setting any
     * optional parameters, call the {@link ListUserInfo#execute()} method to invoke the remote
     * operation. <p> {@link
     * ListUserInfo#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListUserInfo() {
      super(Userinfoendpoint.this, "GET", REST_PATH, null, com.tldr.com.tldr.userinfoendpoint.model.CollectionResponseUserInfo.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListUserInfo setAlt(java.lang.String alt) {
      return (ListUserInfo) super.setAlt(alt);
    }

    @Override
    public ListUserInfo setFields(java.lang.String fields) {
      return (ListUserInfo) super.setFields(fields);
    }

    @Override
    public ListUserInfo setKey(java.lang.String key) {
      return (ListUserInfo) super.setKey(key);
    }

    @Override
    public ListUserInfo setOauthToken(java.lang.String oauthToken) {
      return (ListUserInfo) super.setOauthToken(oauthToken);
    }

    @Override
    public ListUserInfo setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListUserInfo) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListUserInfo setQuotaUser(java.lang.String quotaUser) {
      return (ListUserInfo) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListUserInfo setUserIp(java.lang.String userIp) {
      return (ListUserInfo) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListUserInfo setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListUserInfo setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListUserInfo set(String parameterName, Object value) {
      return (ListUserInfo) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "registerUserInfo".
   *
   * This request holds the parameters needed by the the userinfoendpoint server.  After setting any
   * optional parameters, call the {@link RegisterUserInfo#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.tldr.com.tldr.userinfoendpoint.model.UserInfo}
   * @return the request
   */
  public RegisterUserInfo registerUserInfo(com.tldr.com.tldr.userinfoendpoint.model.UserInfo content) throws java.io.IOException {
    RegisterUserInfo result = new RegisterUserInfo(content);
    initialize(result);
    return result;
  }

  public class RegisterUserInfo extends UserinfoendpointRequest<com.tldr.com.tldr.userinfoendpoint.model.UserInfo> {

    private static final String REST_PATH = "register";

    /**
     * Create a request for the method "registerUserInfo".
     *
     * This request holds the parameters needed by the the userinfoendpoint server.  After setting any
     * optional parameters, call the {@link RegisterUserInfo#execute()} method to invoke the remote
     * operation. <p> {@link RegisterUserInfo#initialize(com.google.api.client.googleapis.services.Abs
     * tractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param content the {@link com.tldr.com.tldr.userinfoendpoint.model.UserInfo}
     * @since 1.13
     */
    protected RegisterUserInfo(com.tldr.com.tldr.userinfoendpoint.model.UserInfo content) {
      super(Userinfoendpoint.this, "POST", REST_PATH, content, com.tldr.com.tldr.userinfoendpoint.model.UserInfo.class);
    }

    @Override
    public RegisterUserInfo setAlt(java.lang.String alt) {
      return (RegisterUserInfo) super.setAlt(alt);
    }

    @Override
    public RegisterUserInfo setFields(java.lang.String fields) {
      return (RegisterUserInfo) super.setFields(fields);
    }

    @Override
    public RegisterUserInfo setKey(java.lang.String key) {
      return (RegisterUserInfo) super.setKey(key);
    }

    @Override
    public RegisterUserInfo setOauthToken(java.lang.String oauthToken) {
      return (RegisterUserInfo) super.setOauthToken(oauthToken);
    }

    @Override
    public RegisterUserInfo setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RegisterUserInfo) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RegisterUserInfo setQuotaUser(java.lang.String quotaUser) {
      return (RegisterUserInfo) super.setQuotaUser(quotaUser);
    }

    @Override
    public RegisterUserInfo setUserIp(java.lang.String userIp) {
      return (RegisterUserInfo) super.setUserIp(userIp);
    }

    @Override
    public RegisterUserInfo set(String parameterName, Object value) {
      return (RegisterUserInfo) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeUserInfo".
   *
   * This request holds the parameters needed by the the userinfoendpoint server.  After setting any
   * optional parameters, call the {@link RemoveUserInfo#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public RemoveUserInfo removeUserInfo(java.lang.Long id) throws java.io.IOException {
    RemoveUserInfo result = new RemoveUserInfo(id);
    initialize(result);
    return result;
  }

  public class RemoveUserInfo extends UserinfoendpointRequest<com.tldr.com.tldr.userinfoendpoint.model.UserInfo> {

    private static final String REST_PATH = "userinfo/{id}";

    /**
     * Create a request for the method "removeUserInfo".
     *
     * This request holds the parameters needed by the the userinfoendpoint server.  After setting any
     * optional parameters, call the {@link RemoveUserInfo#execute()} method to invoke the remote
     * operation. <p> {@link RemoveUserInfo#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveUserInfo(java.lang.Long id) {
      super(Userinfoendpoint.this, "DELETE", REST_PATH, null, com.tldr.com.tldr.userinfoendpoint.model.UserInfo.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveUserInfo setAlt(java.lang.String alt) {
      return (RemoveUserInfo) super.setAlt(alt);
    }

    @Override
    public RemoveUserInfo setFields(java.lang.String fields) {
      return (RemoveUserInfo) super.setFields(fields);
    }

    @Override
    public RemoveUserInfo setKey(java.lang.String key) {
      return (RemoveUserInfo) super.setKey(key);
    }

    @Override
    public RemoveUserInfo setOauthToken(java.lang.String oauthToken) {
      return (RemoveUserInfo) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveUserInfo setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveUserInfo) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveUserInfo setQuotaUser(java.lang.String quotaUser) {
      return (RemoveUserInfo) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveUserInfo setUserIp(java.lang.String userIp) {
      return (RemoveUserInfo) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemoveUserInfo setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveUserInfo set(String parameterName, Object value) {
      return (RemoveUserInfo) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateUserInfo".
   *
   * This request holds the parameters needed by the the userinfoendpoint server.  After setting any
   * optional parameters, call the {@link UpdateUserInfo#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.tldr.com.tldr.userinfoendpoint.model.UserInfo}
   * @return the request
   */
  public UpdateUserInfo updateUserInfo(com.tldr.com.tldr.userinfoendpoint.model.UserInfo content) throws java.io.IOException {
    UpdateUserInfo result = new UpdateUserInfo(content);
    initialize(result);
    return result;
  }

  public class UpdateUserInfo extends UserinfoendpointRequest<com.tldr.com.tldr.userinfoendpoint.model.UserInfo> {

    private static final String REST_PATH = "userinfo";

    /**
     * Create a request for the method "updateUserInfo".
     *
     * This request holds the parameters needed by the the userinfoendpoint server.  After setting any
     * optional parameters, call the {@link UpdateUserInfo#execute()} method to invoke the remote
     * operation. <p> {@link UpdateUserInfo#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.tldr.com.tldr.userinfoendpoint.model.UserInfo}
     * @since 1.13
     */
    protected UpdateUserInfo(com.tldr.com.tldr.userinfoendpoint.model.UserInfo content) {
      super(Userinfoendpoint.this, "PUT", REST_PATH, content, com.tldr.com.tldr.userinfoendpoint.model.UserInfo.class);
    }

    @Override
    public UpdateUserInfo setAlt(java.lang.String alt) {
      return (UpdateUserInfo) super.setAlt(alt);
    }

    @Override
    public UpdateUserInfo setFields(java.lang.String fields) {
      return (UpdateUserInfo) super.setFields(fields);
    }

    @Override
    public UpdateUserInfo setKey(java.lang.String key) {
      return (UpdateUserInfo) super.setKey(key);
    }

    @Override
    public UpdateUserInfo setOauthToken(java.lang.String oauthToken) {
      return (UpdateUserInfo) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateUserInfo setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateUserInfo) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateUserInfo setQuotaUser(java.lang.String quotaUser) {
      return (UpdateUserInfo) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateUserInfo setUserIp(java.lang.String userIp) {
      return (UpdateUserInfo) super.setUserIp(userIp);
    }

    @Override
    public UpdateUserInfo set(String parameterName, Object value) {
      return (UpdateUserInfo) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Userinfoendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Userinfoendpoint}. */
    @Override
    public Userinfoendpoint build() {
      return new Userinfoendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link UserinfoendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setUserinfoendpointRequestInitializer(
        UserinfoendpointRequestInitializer userinfoendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(userinfoendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
