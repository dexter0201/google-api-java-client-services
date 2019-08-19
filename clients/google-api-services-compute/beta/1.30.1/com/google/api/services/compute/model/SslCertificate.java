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
 * Represents an SSL Certificate resource.
 *
 * This SSL certificate resource also contains a private key. You can use SSL keys and certificates
 * to secure connections to a load balancer. For more information, read  Creating and Using SSL
 * Certificates. (== resource_for beta.sslCertificates ==) (== resource_for v1.sslCertificates ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SslCertificate extends com.google.api.client.json.GenericJson {

  /**
   * A local certificate file. The certificate must be in PEM format. The certificate chain must be
   * no greater than 5 certs long. The chain must include at least one intermediate cert.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String certificate;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] Expire time of the certificate. RFC3339
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String expireTime;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] Type of the resource. Always compute#sslCertificate for SSL certificates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Configuration and status of a managed SSL certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SslCertificateManagedSslCertificate managed;

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A write-only private key in PEM format. Only insert requests will include this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String privateKey;

  /**
   * [Output Only] URL of the region where the regional SSL Certificate resides. This field is not
   * applicable to global SSL Certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * [Output only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * Configuration and status of a self-managed SSL certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SslCertificateSelfManagedSslCertificate selfManaged;

  /**
   * [Output Only] Domains associated with the certificate via Subject Alternative Name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> subjectAlternativeNames;

  /**
   * (Optional) Specifies the type of SSL certificate, either "SELF_MANAGED" or "MANAGED". If not
   * specified, the certificate is self-managed and the fields certificate and private_key are used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * A local certificate file. The certificate must be in PEM format. The certificate chain must be
   * no greater than 5 certs long. The chain must include at least one intermediate cert.
   * @return value or {@code null} for none
   */
  public java.lang.String getCertificate() {
    return certificate;
  }

  /**
   * A local certificate file. The certificate must be in PEM format. The certificate chain must be
   * no greater than 5 certs long. The chain must include at least one intermediate cert.
   * @param certificate certificate or {@code null} for none
   */
  public SslCertificate setCertificate(java.lang.String certificate) {
    this.certificate = certificate;
    return this;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public SslCertificate setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public SslCertificate setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] Expire time of the certificate. RFC3339
   * @return value or {@code null} for none
   */
  public java.lang.String getExpireTime() {
    return expireTime;
  }

  /**
   * [Output Only] Expire time of the certificate. RFC3339
   * @param expireTime expireTime or {@code null} for none
   */
  public SslCertificate setExpireTime(java.lang.String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public SslCertificate setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#sslCertificate for SSL certificates.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#sslCertificate for SSL certificates.
   * @param kind kind or {@code null} for none
   */
  public SslCertificate setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Configuration and status of a managed SSL certificate.
   * @return value or {@code null} for none
   */
  public SslCertificateManagedSslCertificate getManaged() {
    return managed;
  }

  /**
   * Configuration and status of a managed SSL certificate.
   * @param managed managed or {@code null} for none
   */
  public SslCertificate setManaged(SslCertificateManagedSslCertificate managed) {
    this.managed = managed;
    return this;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public SslCertificate setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * A write-only private key in PEM format. Only insert requests will include this field.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrivateKey() {
    return privateKey;
  }

  /**
   * A write-only private key in PEM format. Only insert requests will include this field.
   * @param privateKey privateKey or {@code null} for none
   */
  public SslCertificate setPrivateKey(java.lang.String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

  /**
   * [Output Only] URL of the region where the regional SSL Certificate resides. This field is not
   * applicable to global SSL Certificate.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] URL of the region where the regional SSL Certificate resides. This field is not
   * applicable to global SSL Certificate.
   * @param region region or {@code null} for none
   */
  public SslCertificate setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * [Output only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public SslCertificate setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Configuration and status of a self-managed SSL certificate.
   * @return value or {@code null} for none
   */
  public SslCertificateSelfManagedSslCertificate getSelfManaged() {
    return selfManaged;
  }

  /**
   * Configuration and status of a self-managed SSL certificate.
   * @param selfManaged selfManaged or {@code null} for none
   */
  public SslCertificate setSelfManaged(SslCertificateSelfManagedSslCertificate selfManaged) {
    this.selfManaged = selfManaged;
    return this;
  }

  /**
   * [Output Only] Domains associated with the certificate via Subject Alternative Name.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSubjectAlternativeNames() {
    return subjectAlternativeNames;
  }

  /**
   * [Output Only] Domains associated with the certificate via Subject Alternative Name.
   * @param subjectAlternativeNames subjectAlternativeNames or {@code null} for none
   */
  public SslCertificate setSubjectAlternativeNames(java.util.List<java.lang.String> subjectAlternativeNames) {
    this.subjectAlternativeNames = subjectAlternativeNames;
    return this;
  }

  /**
   * (Optional) Specifies the type of SSL certificate, either "SELF_MANAGED" or "MANAGED". If not
   * specified, the certificate is self-managed and the fields certificate and private_key are used.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * (Optional) Specifies the type of SSL certificate, either "SELF_MANAGED" or "MANAGED". If not
   * specified, the certificate is self-managed and the fields certificate and private_key are used.
   * @param type type or {@code null} for none
   */
  public SslCertificate setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public SslCertificate set(String fieldName, Object value) {
    return (SslCertificate) super.set(fieldName, value);
  }

  @Override
  public SslCertificate clone() {
    return (SslCertificate) super.clone();
  }

}