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
 * Request message for KeyManagementService.AsymmetricSign.
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
public final class AsymmetricSignRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The digest of the data to sign. The digest must be produced with the same digest
   * algorithm as specified by the key version's algorithm.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Digest digest;

  /**
   * Optional. An optional CRC32C checksum of the AsymmetricSignRequest.digest. If specified,
   * KeyManagementService will verify the integrity of the received AsymmetricSignRequest.digest
   * using this checksum. KeyManagementService will report an error if the checksum verification
   * fails. If you receive a checksum error, your client should verify that
   * CRC32C(AsymmetricSignRequest.digest) is equal to AsymmetricSignRequest.digest_crc32c, and if
   * so, perform a limited number of retries. A persistent mismatch may indicate an issue in your
   * computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of
   * compatibility across different languages. However, it is a non-negative integer, which will
   * never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this
   * type.
   *
   * NOTE: This field is in Beta.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long digestCrc32c;

  /**
   * Required. The digest of the data to sign. The digest must be produced with the same digest
   * algorithm as specified by the key version's algorithm.
   * @return value or {@code null} for none
   */
  public Digest getDigest() {
    return digest;
  }

  /**
   * Required. The digest of the data to sign. The digest must be produced with the same digest
   * algorithm as specified by the key version's algorithm.
   * @param digest digest or {@code null} for none
   */
  public AsymmetricSignRequest setDigest(Digest digest) {
    this.digest = digest;
    return this;
  }

  /**
   * Optional. An optional CRC32C checksum of the AsymmetricSignRequest.digest. If specified,
   * KeyManagementService will verify the integrity of the received AsymmetricSignRequest.digest
   * using this checksum. KeyManagementService will report an error if the checksum verification
   * fails. If you receive a checksum error, your client should verify that
   * CRC32C(AsymmetricSignRequest.digest) is equal to AsymmetricSignRequest.digest_crc32c, and if
   * so, perform a limited number of retries. A persistent mismatch may indicate an issue in your
   * computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of
   * compatibility across different languages. However, it is a non-negative integer, which will
   * never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this
   * type.
   *
   * NOTE: This field is in Beta.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDigestCrc32c() {
    return digestCrc32c;
  }

  /**
   * Optional. An optional CRC32C checksum of the AsymmetricSignRequest.digest. If specified,
   * KeyManagementService will verify the integrity of the received AsymmetricSignRequest.digest
   * using this checksum. KeyManagementService will report an error if the checksum verification
   * fails. If you receive a checksum error, your client should verify that
   * CRC32C(AsymmetricSignRequest.digest) is equal to AsymmetricSignRequest.digest_crc32c, and if
   * so, perform a limited number of retries. A persistent mismatch may indicate an issue in your
   * computation of the CRC32C checksum. Note: This field is defined as int64 for reasons of
   * compatibility across different languages. However, it is a non-negative integer, which will
   * never exceed 2^32-1, and can be safely downconverted to uint32 in languages that support this
   * type.
   *
   * NOTE: This field is in Beta.
   * @param digestCrc32c digestCrc32c or {@code null} for none
   */
  public AsymmetricSignRequest setDigestCrc32c(java.lang.Long digestCrc32c) {
    this.digestCrc32c = digestCrc32c;
    return this;
  }

  @Override
  public AsymmetricSignRequest set(String fieldName, Object value) {
    return (AsymmetricSignRequest) super.set(fieldName, value);
  }

  @Override
  public AsymmetricSignRequest clone() {
    return (AsymmetricSignRequest) super.clone();
  }

}
