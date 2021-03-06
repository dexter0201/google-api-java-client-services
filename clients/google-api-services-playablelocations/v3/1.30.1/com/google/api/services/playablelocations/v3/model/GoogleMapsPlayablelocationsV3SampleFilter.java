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

package com.google.api.services.playablelocations.v3.model;

/**
 * Specifies the filters to use when searching for playable locations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Playable Locations API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleMapsPlayablelocationsV3SampleFilter extends com.google.api.client.json.GenericJson {

  /**
   * Restricts the set of playable locations to just the
   * [types](/maps/documentation/gaming/tt/types) that you want.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> includedTypes;

  /**
   * Specifies the maximum number of playable locations to return. This value must not be greater
   * than 1000. The default value is 100. Only the top-ranking playable locations are returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxLocationCount;

  /**
   * A set of options that control the spacing between playable locations. By default the minimum
   * distance between locations is 200m.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleMapsPlayablelocationsV3SampleSpacingOptions spacing;

  /**
   * Restricts the set of playable locations to just the
   * [types](/maps/documentation/gaming/tt/types) that you want.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIncludedTypes() {
    return includedTypes;
  }

  /**
   * Restricts the set of playable locations to just the
   * [types](/maps/documentation/gaming/tt/types) that you want.
   * @param includedTypes includedTypes or {@code null} for none
   */
  public GoogleMapsPlayablelocationsV3SampleFilter setIncludedTypes(java.util.List<java.lang.String> includedTypes) {
    this.includedTypes = includedTypes;
    return this;
  }

  /**
   * Specifies the maximum number of playable locations to return. This value must not be greater
   * than 1000. The default value is 100. Only the top-ranking playable locations are returned.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxLocationCount() {
    return maxLocationCount;
  }

  /**
   * Specifies the maximum number of playable locations to return. This value must not be greater
   * than 1000. The default value is 100. Only the top-ranking playable locations are returned.
   * @param maxLocationCount maxLocationCount or {@code null} for none
   */
  public GoogleMapsPlayablelocationsV3SampleFilter setMaxLocationCount(java.lang.Integer maxLocationCount) {
    this.maxLocationCount = maxLocationCount;
    return this;
  }

  /**
   * A set of options that control the spacing between playable locations. By default the minimum
   * distance between locations is 200m.
   * @return value or {@code null} for none
   */
  public GoogleMapsPlayablelocationsV3SampleSpacingOptions getSpacing() {
    return spacing;
  }

  /**
   * A set of options that control the spacing between playable locations. By default the minimum
   * distance between locations is 200m.
   * @param spacing spacing or {@code null} for none
   */
  public GoogleMapsPlayablelocationsV3SampleFilter setSpacing(GoogleMapsPlayablelocationsV3SampleSpacingOptions spacing) {
    this.spacing = spacing;
    return this;
  }

  @Override
  public GoogleMapsPlayablelocationsV3SampleFilter set(String fieldName, Object value) {
    return (GoogleMapsPlayablelocationsV3SampleFilter) super.set(fieldName, value);
  }

  @Override
  public GoogleMapsPlayablelocationsV3SampleFilter clone() {
    return (GoogleMapsPlayablelocationsV3SampleFilter) super.clone();
  }

}
