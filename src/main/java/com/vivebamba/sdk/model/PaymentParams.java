/**
 * Bamba API
 * SDK for Bamba API
 *
 * The version of the OpenAPI document: 1.2.9
 * Contact: desarrollo@vivebamba.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.vivebamba.sdk.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class PaymentParams {
  
  @SerializedName("mediaTypeKey")
  private String mediaTypeKey = null;
  @SerializedName("mediaTypeValue")
  private String mediaTypeValue = null;

  /**
   * Media type key to make the payment, available options CARD, PHONE_NUMBER, EMAIL, CLABE, CACAO, CUSTOMER_NUMBER, ACCOUNT_NUMBER
   **/
  @ApiModelProperty(required = true, value = "Media type key to make the payment, available options CARD, PHONE_NUMBER, EMAIL, CLABE, CACAO, CUSTOMER_NUMBER, ACCOUNT_NUMBER")
  public String getMediaTypeKey() {
    return mediaTypeKey;
  }
  public void setMediaTypeKey(String mediaTypeKey) {
    this.mediaTypeKey = mediaTypeKey;
  }

  /**
   * The value for the selected media type, example if mediaTypeKey is EMAIL here it goes customer@domain.com
   **/
  @ApiModelProperty(required = true, value = "The value for the selected media type, example if mediaTypeKey is EMAIL here it goes customer@domain.com")
  public String getMediaTypeValue() {
    return mediaTypeValue;
  }
  public void setMediaTypeValue(String mediaTypeValue) {
    this.mediaTypeValue = mediaTypeValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentParams paymentParams = (PaymentParams) o;
    return (this.mediaTypeKey == null ? paymentParams.mediaTypeKey == null : this.mediaTypeKey.equals(paymentParams.mediaTypeKey)) &&
        (this.mediaTypeValue == null ? paymentParams.mediaTypeValue == null : this.mediaTypeValue.equals(paymentParams.mediaTypeValue));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.mediaTypeKey == null ? 0: this.mediaTypeKey.hashCode());
    result = 31 * result + (this.mediaTypeValue == null ? 0: this.mediaTypeValue.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentParams {\n");
    
    sb.append("  mediaTypeKey: ").append(mediaTypeKey).append("\n");
    sb.append("  mediaTypeValue: ").append(mediaTypeValue).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}