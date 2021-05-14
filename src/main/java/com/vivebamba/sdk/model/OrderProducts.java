/**
 * Bamba API
 * SDK for Bamba API
 *
 * The version of the OpenAPI document: 1.0.0
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
public class OrderProducts {
  
  @SerializedName("sku")
  private String sku = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderProducts orderProducts = (OrderProducts) o;
    return (this.sku == null ? orderProducts.sku == null : this.sku.equals(orderProducts.sku));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sku == null ? 0: this.sku.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderProducts {\n");
    
    sb.append("  sku: ").append(sku).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}