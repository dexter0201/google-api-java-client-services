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

package com.google.api.services.cloudkms.v1.model;

/**
 * Response message for KeyManagementService.AsymmetricSign.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Key Management Service (KMS) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AsymmetricSignResponse extends com.google.api.client.json.GenericJson {

  /**
   * The resource name of the CryptoKeyVersion used for signing. Check this field to verify that the
   * intended resource was used for signing.
   *
   * NOTE: This field is in Beta.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The created signature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String signature;

  /**
   * Integrity verification field. A CRC32C checksum of the returned
   * AsymmetricSignResponse.signature. An integrity check of AsymmetricSignResponse.signature can be
   * performed by computing the CRC32C checksum of AsymmetricSignResponse.signature and comparing
   * your results to this field. Discard the response in case of non-matching checksum values, and
   * perform a limited number of retries. A persistent mismatch may indicate an issue in your
   * computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of
   * compatibility across different languages. However, it is a non-negative integer, which will
   * never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this
   * type.
   *
   * NOTE: This field is in Beta.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long signatureCrc32c;

  /**
   * Integrity verification field. A flag indicating whether AsymmetricSignRequest.digest_crc32c was
   * received by KeyManagementService and used for the integrity verification of the digest. A false
   * value of this field indicates either that AsymmetricSignRequest.digest_crc32c was left unset or
   * that it was not delivered to KeyManagementService. If you've set
   * AsymmetricSignRequest.digest_crc32c but this field is still false, discard the response and
   * perform a limited number of retries.
   *
   * NOTE: This field is in Beta.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean verifiedDigestCrc32c;

  /**
   * The resource name of the CryptoKeyVersion used for signing. Check this field to verify that the
   * intended resource was used for signing.
   *
   * NOTE: This field is in Beta.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the CryptoKeyVersion used for signing. Check this field to verify that the
   * intended resource was used for signing.
   *
   * NOTE: This field is in Beta.
   * @param name name or {@code null} for none
   */
  public AsymmetricSignResponse setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The created signature.
   * @see #decodeSignature()
   * @return value or {@code null} for none
   */
  public java.lang.String getSignature() {
    return signature;
  }

  /**
   * The created signature.
   * @see #getSignature()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeSignature() {
    return com.google.api.client.util.Base64.decodeBase64(signature);
  }

  /**
   * The created signature.
   * @see #encodeSignature()
   * @param signature signature or {@code null} for none
   */
  public AsymmetricSignResponse setSignature(java.lang.String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * The created signature.
   * @see #setSignature()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public AsymmetricSignResponse encodeSignature(byte[] signature) {
    this.signature = com.google.api.client.util.Base64.encodeBase64URLSafeString(signature);
    return this;
  }

  /**
   * Integrity verification field. A CRC32C checksum of the returned
   * AsymmetricSignResponse.signature. An integrity check of AsymmetricSignResponse.signature can be
   * performed by computing the CRC32C checksum of AsymmetricSignResponse.signature and comparing
   * your results to this field. Discard the response in case of non-matching checksum values, and
   * perform a limited number of retries. A persistent mismatch may indicate an issue in your
   * computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of
   * compatibility across different languages. However, it is a non-negative integer, which will
   * never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this
   * type.
   *
   * NOTE: This field is in Beta.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSignatureCrc32c() {
    return signatureCrc32c;
  }

  /**
   * Integrity verification field. A CRC32C checksum of the returned
   * AsymmetricSignResponse.signature. An integrity check of AsymmetricSignResponse.signature can be
   * performed by computing the CRC32C checksum of AsymmetricSignResponse.signature and comparing
   * your results to this field. Discard the response in case of non-matching checksum values, and
   * perform a limited number of retries. A persistent mismatch may indicate an issue in your
   * computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of
   * compatibility across different languages. However, it is a non-negative integer, which will
   * never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this
   * type.
   *
   * NOTE: This field is in Beta.
   * @param signatureCrc32c signatureCrc32c or {@code null} for none
   */
  public AsymmetricSignResponse setSignatureCrc32c(java.lang.Long signatureCrc32c) {
    this.signatureCrc32c = signatureCrc32c;
    return this;
  }

  /**
   * Integrity verification field. A flag indicating whether AsymmetricSignRequest.digest_crc32c was
   * received by KeyManagementService and used for the integrity verification of the digest. A false
   * value of this field indicates either that AsymmetricSignRequest.digest_crc32c was left unset or
   * that it was not delivered to KeyManagementService. If you've set
   * AsymmetricSignRequest.digest_crc32c but this field is still false, discard the response and
   * perform a limited number of retries.
   *
   * NOTE: This field is in Beta.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVerifiedDigestCrc32c() {
    return verifiedDigestCrc32c;
  }

  /**
   * Integrity verification field. A flag indicating whether AsymmetricSignRequest.digest_crc32c was
   * received by KeyManagementService and used for the integrity verification of the digest. A false
   * value of this field indicates either that AsymmetricSignRequest.digest_crc32c was left unset or
   * that it was not delivered to KeyManagementService. If you've set
   * AsymmetricSignRequest.digest_crc32c but this field is still false, discard the response and
   * perform a limited number of retries.
   *
   * NOTE: This field is in Beta.
   * @param verifiedDigestCrc32c verifiedDigestCrc32c or {@code null} for none
   */
  public AsymmetricSignResponse setVerifiedDigestCrc32c(java.lang.Boolean verifiedDigestCrc32c) {
    this.verifiedDigestCrc32c = verifiedDigestCrc32c;
    return this;
  }

  @Override
  public AsymmetricSignResponse set(String fieldName, Object value) {
    return (AsymmetricSignResponse) super.set(fieldName, value);
  }

  @Override
  public AsymmetricSignResponse clone() {
    return (AsymmetricSignResponse) super.clone();
  }

}
