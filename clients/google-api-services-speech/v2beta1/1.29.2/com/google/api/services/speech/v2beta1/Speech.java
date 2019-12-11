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
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.speech.v2beta1;

/**
 * Service definition for Speech (v2beta1).
 *
 * <p>
 * Converts audio to text by applying powerful neural network models.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://cloud.google.com/speech-to-text/docs/quickstart-protocol" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link SpeechRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Speech extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.29.2 of the Cloud Speech-to-Text API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://speech.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

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
  public Speech(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Speech(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Projects collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Speech speech = new Speech(...);}
   *   {@code Speech.Projects.List request = speech.projects().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Projects projects() {
    return new Projects();
  }

  /**
   * The "projects" collection of methods.
   */
  public class Projects {

    /**
     * An accessor for creating requests from the Locations collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code Speech speech = new Speech(...);}
     *   {@code Speech.Locations.List request = speech.locations().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Locations locations() {
      return new Locations();
    }

    /**
     * The "locations" collection of methods.
     */
    public class Locations {

      /**
       * An accessor for creating requests from the Operations collection.
       *
       * <p>The typical use is:</p>
       * <pre>
       *   {@code Speech speech = new Speech(...);}
       *   {@code Speech.Operations.List request = speech.operations().list(parameters ...)}
       * </pre>
       *
       * @return the resource collection
       */
      public Operations operations() {
        return new Operations();
      }

      /**
       * The "operations" collection of methods.
       */
      public class Operations {

        /**
         * Gets the latest state of a long-running operation.  Clients can use this method to poll the
         * operation result at intervals as recommended by the API service.
         *
         * Create a request for the method "operations.get".
         *
         * This request holds the parameters needed by the speech server.  After setting any optional
         * parameters, call the {@link Get#execute()} method to invoke the remote operation.
         *
         * @param name The name of the operation resource.
         * @return the request
         */
        public Get get(java.lang.String name) throws java.io.IOException {
          Get result = new Get(name);
          initialize(result);
          return result;
        }

        public class Get extends SpeechRequest<com.google.api.services.speech.v2beta1.model.Operation> {

          private static final String REST_PATH = "v2beta1/{+name}";

          private final java.util.regex.Pattern NAME_PATTERN =
              java.util.regex.Pattern.compile("^projects/[^/]+/locations/[^/]+/operations/[^/]+$");

          /**
           * Gets the latest state of a long-running operation.  Clients can use this method to poll the
           * operation result at intervals as recommended by the API service.
           *
           * Create a request for the method "operations.get".
           *
           * This request holds the parameters needed by the the speech server.  After setting any optional
           * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
           * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
           * called to initialize this instance immediately after invoking the constructor. </p>
           *
           * @param name The name of the operation resource.
           * @since 1.13
           */
          protected Get(java.lang.String name) {
            super(Speech.this, "GET", REST_PATH, null, com.google.api.services.speech.v2beta1.model.Operation.class);
            this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
            if (!getSuppressPatternChecks()) {
              com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                  "Parameter name must conform to the pattern " +
                  "^projects/[^/]+/locations/[^/]+/operations/[^/]+$");
            }
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
          public Get set$Xgafv(java.lang.String $Xgafv) {
            return (Get) super.set$Xgafv($Xgafv);
          }

          @Override
          public Get setAccessToken(java.lang.String accessToken) {
            return (Get) super.setAccessToken(accessToken);
          }

          @Override
          public Get setAlt(java.lang.String alt) {
            return (Get) super.setAlt(alt);
          }

          @Override
          public Get setCallback(java.lang.String callback) {
            return (Get) super.setCallback(callback);
          }

          @Override
          public Get setFields(java.lang.String fields) {
            return (Get) super.setFields(fields);
          }

          @Override
          public Get setKey(java.lang.String key) {
            return (Get) super.setKey(key);
          }

          @Override
          public Get setOauthToken(java.lang.String oauthToken) {
            return (Get) super.setOauthToken(oauthToken);
          }

          @Override
          public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
            return (Get) super.setPrettyPrint(prettyPrint);
          }

          @Override
          public Get setQuotaUser(java.lang.String quotaUser) {
            return (Get) super.setQuotaUser(quotaUser);
          }

          @Override
          public Get setUploadType(java.lang.String uploadType) {
            return (Get) super.setUploadType(uploadType);
          }

          @Override
          public Get setUploadProtocol(java.lang.String uploadProtocol) {
            return (Get) super.setUploadProtocol(uploadProtocol);
          }

          /** The name of the operation resource. */
          @com.google.api.client.util.Key
          private java.lang.String name;

          /** The name of the operation resource.
           */
          public java.lang.String getName() {
            return name;
          }

          /** The name of the operation resource. */
          public Get setName(java.lang.String name) {
            if (!getSuppressPatternChecks()) {
              com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                  "Parameter name must conform to the pattern " +
                  "^projects/[^/]+/locations/[^/]+/operations/[^/]+$");
            }
            this.name = name;
            return this;
          }

          @Override
          public Get set(String parameterName, Object value) {
            return (Get) super.set(parameterName, value);
          }
        }
        /**
         * Lists operations that match the specified filter in the request. If the server doesn't support
         * this method, it returns `UNIMPLEMENTED`.
         *
         * NOTE: the `name` binding allows API services to override the binding to use different resource
         * name schemes, such as `users/operations`. To override the binding, API services can add a binding
         * such as `"/v1/{name=users}/operations"` to their service configuration. For backwards
         * compatibility, the default name includes the operations collection id, however overriding users
         * must ensure the name binding is the parent resource, without the operations collection id.
         *
         * Create a request for the method "operations.list".
         *
         * This request holds the parameters needed by the speech server.  After setting any optional
         * parameters, call the {@link List#execute()} method to invoke the remote operation.
         *
         * @param name The name of the operation's parent resource.
         * @return the request
         */
        public List list(java.lang.String name) throws java.io.IOException {
          List result = new List(name);
          initialize(result);
          return result;
        }

        public class List extends SpeechRequest<com.google.api.services.speech.v2beta1.model.ListOperationsResponse> {

          private static final String REST_PATH = "v2beta1/{+name}/operations";

          private final java.util.regex.Pattern NAME_PATTERN =
              java.util.regex.Pattern.compile("^projects/[^/]+/locations/[^/]+$");

          /**
           * Lists operations that match the specified filter in the request. If the server doesn't support
           * this method, it returns `UNIMPLEMENTED`.
           *
           * NOTE: the `name` binding allows API services to override the binding to use different resource
           * name schemes, such as `users/operations`. To override the binding, API services can add a
           * binding such as `"/v1/{name=users}/operations"` to their service configuration. For backwards
           * compatibility, the default name includes the operations collection id, however overriding users
           * must ensure the name binding is the parent resource, without the operations collection id.
           *
           * Create a request for the method "operations.list".
           *
           * This request holds the parameters needed by the the speech server.  After setting any optional
           * parameters, call the {@link List#execute()} method to invoke the remote operation. <p> {@link
           * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
           * called to initialize this instance immediately after invoking the constructor. </p>
           *
           * @param name The name of the operation's parent resource.
           * @since 1.13
           */
          protected List(java.lang.String name) {
            super(Speech.this, "GET", REST_PATH, null, com.google.api.services.speech.v2beta1.model.ListOperationsResponse.class);
            this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
            if (!getSuppressPatternChecks()) {
              com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                  "Parameter name must conform to the pattern " +
                  "^projects/[^/]+/locations/[^/]+$");
            }
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
          public List set$Xgafv(java.lang.String $Xgafv) {
            return (List) super.set$Xgafv($Xgafv);
          }

          @Override
          public List setAccessToken(java.lang.String accessToken) {
            return (List) super.setAccessToken(accessToken);
          }

          @Override
          public List setAlt(java.lang.String alt) {
            return (List) super.setAlt(alt);
          }

          @Override
          public List setCallback(java.lang.String callback) {
            return (List) super.setCallback(callback);
          }

          @Override
          public List setFields(java.lang.String fields) {
            return (List) super.setFields(fields);
          }

          @Override
          public List setKey(java.lang.String key) {
            return (List) super.setKey(key);
          }

          @Override
          public List setOauthToken(java.lang.String oauthToken) {
            return (List) super.setOauthToken(oauthToken);
          }

          @Override
          public List setPrettyPrint(java.lang.Boolean prettyPrint) {
            return (List) super.setPrettyPrint(prettyPrint);
          }

          @Override
          public List setQuotaUser(java.lang.String quotaUser) {
            return (List) super.setQuotaUser(quotaUser);
          }

          @Override
          public List setUploadType(java.lang.String uploadType) {
            return (List) super.setUploadType(uploadType);
          }

          @Override
          public List setUploadProtocol(java.lang.String uploadProtocol) {
            return (List) super.setUploadProtocol(uploadProtocol);
          }

          /** The name of the operation's parent resource. */
          @com.google.api.client.util.Key
          private java.lang.String name;

          /** The name of the operation's parent resource.
           */
          public java.lang.String getName() {
            return name;
          }

          /** The name of the operation's parent resource. */
          public List setName(java.lang.String name) {
            if (!getSuppressPatternChecks()) {
              com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                  "Parameter name must conform to the pattern " +
                  "^projects/[^/]+/locations/[^/]+$");
            }
            this.name = name;
            return this;
          }

          /** The standard list filter. */
          @com.google.api.client.util.Key
          private java.lang.String filter;

          /** The standard list filter.
           */
          public java.lang.String getFilter() {
            return filter;
          }

          /** The standard list filter. */
          public List setFilter(java.lang.String filter) {
            this.filter = filter;
            return this;
          }

          /** The standard list page size. */
          @com.google.api.client.util.Key
          private java.lang.Integer pageSize;

          /** The standard list page size.
           */
          public java.lang.Integer getPageSize() {
            return pageSize;
          }

          /** The standard list page size. */
          public List setPageSize(java.lang.Integer pageSize) {
            this.pageSize = pageSize;
            return this;
          }

          /** The standard list page token. */
          @com.google.api.client.util.Key
          private java.lang.String pageToken;

          /** The standard list page token.
           */
          public java.lang.String getPageToken() {
            return pageToken;
          }

          /** The standard list page token. */
          public List setPageToken(java.lang.String pageToken) {
            this.pageToken = pageToken;
            return this;
          }

          @Override
          public List set(String parameterName, Object value) {
            return (List) super.set(parameterName, value);
          }
        }

      }
    }
  }

  /**
   * Builder for {@link Speech}.
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
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link Speech}. */
    @Override
    public Speech build() {
      return new Speech(this);
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
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
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
     * Set the {@link SpeechRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setSpeechRequestInitializer(
        SpeechRequestInitializer speechRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(speechRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
