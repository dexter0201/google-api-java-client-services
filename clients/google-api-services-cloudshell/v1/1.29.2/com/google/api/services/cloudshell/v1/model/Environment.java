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

package com.google.api.services.cloudshell.v1.model;

/**
 * A Cloud Shell environment, which is defined as the combination of a Docker image specifying what
 * is installed on the environment and a home directory containing the user's data that will remain
 * across sessions. Each user has a single environment with the ID "default".
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Shell API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Environment extends com.google.api.client.json.GenericJson {

  /**
   * Required. Full path to the Docker image used to run this environment, e.g. "gcr.io/dev-con
   * /cloud-devshell:latest".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dockerImage;

  /**
   * Output only. List of ports users can connect to on the environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> httpsPorts;

  /**
   * Output only. The environment's identifier, which is always "default".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Output only. Full name of this resource, in the format
   * `users/{owner_email}/environments/{environment_id}`. `{owner_email}` is the email address of
   * the user to whom this environment belongs, and `{environment_id}` is the identifier of this
   * environment. For example, `users/someone@example.com/environments/default`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Public keys associated with the environment. Clients can connect to this
   * environment via SSH only if they possess a private key corresponding to at least one of these
   * public keys. Keys can be added to or removed from the environment using the CreatePublicKey and
   * DeletePublicKey methods.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PublicKey> publicKeys;

  /**
   * Indicates the size of the backing VM running the environment.  If set to something other than
   * DEFAULT, it will be reverted to the default VM size after vm_size_expire_time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String size;

  /**
   * Output only. Host to which clients can connect to initiate SSH sessions with the environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sshHost;

  /**
   * Output only. Port to which clients can connect to initiate SSH sessions with the environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer sshPort;

  /**
   * Output only. Username that clients should use when initiating SSH sessions with the
   * environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sshUsername;

  /**
   * Output only. Current execution state of this environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The time when the Environment will expire back to the default VM size.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String vmSizeExpireTime;

  /**
   * Output only. Host to which clients can connect to initiate HTTPS or WSS connections with the
   * environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String webHost;

  /**
   * Required. Full path to the Docker image used to run this environment, e.g. "gcr.io/dev-con
   * /cloud-devshell:latest".
   * @return value or {@code null} for none
   */
  public java.lang.String getDockerImage() {
    return dockerImage;
  }

  /**
   * Required. Full path to the Docker image used to run this environment, e.g. "gcr.io/dev-con
   * /cloud-devshell:latest".
   * @param dockerImage dockerImage or {@code null} for none
   */
  public Environment setDockerImage(java.lang.String dockerImage) {
    this.dockerImage = dockerImage;
    return this;
  }

  /**
   * Output only. List of ports users can connect to on the environment.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getHttpsPorts() {
    return httpsPorts;
  }

  /**
   * Output only. List of ports users can connect to on the environment.
   * @param httpsPorts httpsPorts or {@code null} for none
   */
  public Environment setHttpsPorts(java.util.List<java.lang.Integer> httpsPorts) {
    this.httpsPorts = httpsPorts;
    return this;
  }

  /**
   * Output only. The environment's identifier, which is always "default".
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Output only. The environment's identifier, which is always "default".
   * @param id id or {@code null} for none
   */
  public Environment setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Output only. Full name of this resource, in the format
   * `users/{owner_email}/environments/{environment_id}`. `{owner_email}` is the email address of
   * the user to whom this environment belongs, and `{environment_id}` is the identifier of this
   * environment. For example, `users/someone@example.com/environments/default`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Full name of this resource, in the format
   * `users/{owner_email}/environments/{environment_id}`. `{owner_email}` is the email address of
   * the user to whom this environment belongs, and `{environment_id}` is the identifier of this
   * environment. For example, `users/someone@example.com/environments/default`.
   * @param name name or {@code null} for none
   */
  public Environment setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Public keys associated with the environment. Clients can connect to this
   * environment via SSH only if they possess a private key corresponding to at least one of these
   * public keys. Keys can be added to or removed from the environment using the CreatePublicKey and
   * DeletePublicKey methods.
   * @return value or {@code null} for none
   */
  public java.util.List<PublicKey> getPublicKeys() {
    return publicKeys;
  }

  /**
   * Output only. Public keys associated with the environment. Clients can connect to this
   * environment via SSH only if they possess a private key corresponding to at least one of these
   * public keys. Keys can be added to or removed from the environment using the CreatePublicKey and
   * DeletePublicKey methods.
   * @param publicKeys publicKeys or {@code null} for none
   */
  public Environment setPublicKeys(java.util.List<PublicKey> publicKeys) {
    this.publicKeys = publicKeys;
    return this;
  }

  /**
   * Indicates the size of the backing VM running the environment.  If set to something other than
   * DEFAULT, it will be reverted to the default VM size after vm_size_expire_time.
   * @return value or {@code null} for none
   */
  public java.lang.String getSize() {
    return size;
  }

  /**
   * Indicates the size of the backing VM running the environment.  If set to something other than
   * DEFAULT, it will be reverted to the default VM size after vm_size_expire_time.
   * @param size size or {@code null} for none
   */
  public Environment setSize(java.lang.String size) {
    this.size = size;
    return this;
  }

  /**
   * Output only. Host to which clients can connect to initiate SSH sessions with the environment.
   * @return value or {@code null} for none
   */
  public java.lang.String getSshHost() {
    return sshHost;
  }

  /**
   * Output only. Host to which clients can connect to initiate SSH sessions with the environment.
   * @param sshHost sshHost or {@code null} for none
   */
  public Environment setSshHost(java.lang.String sshHost) {
    this.sshHost = sshHost;
    return this;
  }

  /**
   * Output only. Port to which clients can connect to initiate SSH sessions with the environment.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSshPort() {
    return sshPort;
  }

  /**
   * Output only. Port to which clients can connect to initiate SSH sessions with the environment.
   * @param sshPort sshPort or {@code null} for none
   */
  public Environment setSshPort(java.lang.Integer sshPort) {
    this.sshPort = sshPort;
    return this;
  }

  /**
   * Output only. Username that clients should use when initiating SSH sessions with the
   * environment.
   * @return value or {@code null} for none
   */
  public java.lang.String getSshUsername() {
    return sshUsername;
  }

  /**
   * Output only. Username that clients should use when initiating SSH sessions with the
   * environment.
   * @param sshUsername sshUsername or {@code null} for none
   */
  public Environment setSshUsername(java.lang.String sshUsername) {
    this.sshUsername = sshUsername;
    return this;
  }

  /**
   * Output only. Current execution state of this environment.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. Current execution state of this environment.
   * @param state state or {@code null} for none
   */
  public Environment setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. The time when the Environment will expire back to the default VM size.
   * @return value or {@code null} for none
   */
  public String getVmSizeExpireTime() {
    return vmSizeExpireTime;
  }

  /**
   * Output only. The time when the Environment will expire back to the default VM size.
   * @param vmSizeExpireTime vmSizeExpireTime or {@code null} for none
   */
  public Environment setVmSizeExpireTime(String vmSizeExpireTime) {
    this.vmSizeExpireTime = vmSizeExpireTime;
    return this;
  }

  /**
   * Output only. Host to which clients can connect to initiate HTTPS or WSS connections with the
   * environment.
   * @return value or {@code null} for none
   */
  public java.lang.String getWebHost() {
    return webHost;
  }

  /**
   * Output only. Host to which clients can connect to initiate HTTPS or WSS connections with the
   * environment.
   * @param webHost webHost or {@code null} for none
   */
  public Environment setWebHost(java.lang.String webHost) {
    this.webHost = webHost;
    return this;
  }

  @Override
  public Environment set(String fieldName, Object value) {
    return (Environment) super.set(fieldName, value);
  }

  @Override
  public Environment clone() {
    return (Environment) super.clone();
  }

}
