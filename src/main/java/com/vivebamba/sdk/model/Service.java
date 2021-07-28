/**
 * Bamba API
 * SDK for Bamba API
 *
 * The version of the OpenAPI document: 1.2.4
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
public class Service {
  
  @SerializedName("policyNumber")
  private String policyNumber = null;
  @SerializedName("description")
  private String description = null;

  /**
   * The policy number of the customer service, some services does not have it
   **/
  @ApiModelProperty(value = "The policy number of the customer service, some services does not have it")
  public String getPolicyNumber() {
    return policyNumber;
  }
  public void setPolicyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
  }

  /**
   * The description of the service
   **/
  @ApiModelProperty(required = true, value = "The description of the service")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return (this.policyNumber == null ? service.policyNumber == null : this.policyNumber.equals(service.policyNumber)) &&
        (this.description == null ? service.description == null : this.description.equals(service.description));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.policyNumber == null ? 0: this.policyNumber.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("  policyNumber: ").append(policyNumber).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
