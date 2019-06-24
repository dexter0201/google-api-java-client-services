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

package com.google.api.services.servicecontrol.v1.model;

/**
 * Exemplars are example points that may be used to annotate aggregated distribution values. They
 * are metadata that gives information about a particular value added to a Distribution bucket, such
 * as a trace ID that was active when a value was added. They may contain further information, such
 * as a example values and timestamps, origin, etc.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Control API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Exemplar extends com.google.api.client.json.GenericJson {

  /**
   * Contextual information about the example value. Examples are:
   *
   *   Trace: type.googleapis.com/google.monitoring.v3.SpanContext
   *
   *   Literal string: type.googleapis.com/google.protobuf.StringValue
   *
   *   Labels dropped during aggregation:     type.googleapis.com/google.monitoring.v3.DroppedLabels
   *
   * There may be only a single attachment of any given message type in a single exemplar, and this
   * is enforced by the system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.util.Map<String, java.lang.Object>> attachments;

  /**
   * The observation (sampling) time of the above value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timestamp;

  /**
   * Value of the exemplar point. This value determines to which bucket the exemplar belongs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double value;

  /**
   * Contextual information about the example value. Examples are:
   *
   *   Trace: type.googleapis.com/google.monitoring.v3.SpanContext
   *
   *   Literal string: type.googleapis.com/google.protobuf.StringValue
   *
   *   Labels dropped during aggregation:     type.googleapis.com/google.monitoring.v3.DroppedLabels
   *
   * There may be only a single attachment of any given message type in a single exemplar, and this
   * is enforced by the system.
   * @return value or {@code null} for none
   */
  public java.util.List<java.util.Map<String, java.lang.Object>> getAttachments() {
    return attachments;
  }

  /**
   * Contextual information about the example value. Examples are:
   *
   *   Trace: type.googleapis.com/google.monitoring.v3.SpanContext
   *
   *   Literal string: type.googleapis.com/google.protobuf.StringValue
   *
   *   Labels dropped during aggregation:     type.googleapis.com/google.monitoring.v3.DroppedLabels
   *
   * There may be only a single attachment of any given message type in a single exemplar, and this
   * is enforced by the system.
   * @param attachments attachments or {@code null} for none
   */
  public Exemplar setAttachments(java.util.List<java.util.Map<String, java.lang.Object>> attachments) {
    this.attachments = attachments;
    return this;
  }

  /**
   * The observation (sampling) time of the above value.
   * @return value or {@code null} for none
   */
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * The observation (sampling) time of the above value.
   * @param timestamp timestamp or {@code null} for none
   */
  public Exemplar setTimestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Value of the exemplar point. This value determines to which bucket the exemplar belongs.
   * @return value or {@code null} for none
   */
  public java.lang.Double getValue() {
    return value;
  }

  /**
   * Value of the exemplar point. This value determines to which bucket the exemplar belongs.
   * @param value value or {@code null} for none
   */
  public Exemplar setValue(java.lang.Double value) {
    this.value = value;
    return this;
  }

  @Override
  public Exemplar set(String fieldName, Object value) {
    return (Exemplar) super.set(fieldName, value);
  }

  @Override
  public Exemplar clone() {
    return (Exemplar) super.clone();
  }

}
