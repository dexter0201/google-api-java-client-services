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

package com.google.api.services.compute.model;

/**
 * Model definition for ManagedInstanceInstanceHealth.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ManagedInstanceInstanceHealth extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] The current detailed instance health state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String detailedHealthState;

  /**
   * [Output Only] The URL for the health check that verifies whether the instance is healthy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String healthCheck;

  /**
   * [Output Only] The current detailed instance health state.
   * @return value or {@code null} for none
   */
  public java.lang.String getDetailedHealthState() {
    return detailedHealthState;
  }

  /**
   * [Output Only] The current detailed instance health state.
   * @param detailedHealthState detailedHealthState or {@code null} for none
   */
  public ManagedInstanceInstanceHealth setDetailedHealthState(java.lang.String detailedHealthState) {
    this.detailedHealthState = detailedHealthState;
    return this;
  }

  /**
   * [Output Only] The URL for the health check that verifies whether the instance is healthy.
   * @return value or {@code null} for none
   */
  public java.lang.String getHealthCheck() {
    return healthCheck;
  }

  /**
   * [Output Only] The URL for the health check that verifies whether the instance is healthy.
   * @param healthCheck healthCheck or {@code null} for none
   */
  public ManagedInstanceInstanceHealth setHealthCheck(java.lang.String healthCheck) {
    this.healthCheck = healthCheck;
    return this;
  }

  @Override
  public ManagedInstanceInstanceHealth set(String fieldName, Object value) {
    return (ManagedInstanceInstanceHealth) super.set(fieldName, value);
  }

  @Override
  public ManagedInstanceInstanceHealth clone() {
    return (ManagedInstanceInstanceHealth) super.clone();
  }

}