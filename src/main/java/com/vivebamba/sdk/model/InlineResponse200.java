/**
 * Bamba API
 * SDK for Bamba API
 *
 * The version of the OpenAPI document: 1.3.3
 * Contact: desarrollo@vivebamba.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.vivebamba.sdk.model;

import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse200 {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("state")
  private String state = null;
  @SerializedName("customerId")
  private String customerId = null;
  @SerializedName("createdAt")
  private Date createdAt = null;
  @SerializedName("updatedAt")
  private Date updatedAt = null;

  /**
   * The unique identifier for the order
   **/
  @ApiModelProperty(value = "The unique identifier for the order")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The state of the order
   **/
  @ApiModelProperty(value = "The state of the order")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  /**
   * The unique identifier for the customer on Bamba®, you MUST relate this with user/customer on your platform
   **/
  @ApiModelProperty(value = "The unique identifier for the customer on Bamba®, you MUST relate this with user/customer on your platform")
  public String getCustomerId() {
    return customerId;
  }
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  /**
   * The date and time (ISO 8601 format) when the order was created
   **/
  @ApiModelProperty(value = "The date and time (ISO 8601 format) when the order was created")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The date and time (ISO 8601 format) when the order was last modified.
   **/
  @ApiModelProperty(value = "The date and time (ISO 8601 format) when the order was last modified.")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return (this.id == null ? inlineResponse200.id == null : this.id.equals(inlineResponse200.id)) &&
        (this.state == null ? inlineResponse200.state == null : this.state.equals(inlineResponse200.state)) &&
        (this.customerId == null ? inlineResponse200.customerId == null : this.customerId.equals(inlineResponse200.customerId)) &&
        (this.createdAt == null ? inlineResponse200.createdAt == null : this.createdAt.equals(inlineResponse200.createdAt)) &&
        (this.updatedAt == null ? inlineResponse200.updatedAt == null : this.updatedAt.equals(inlineResponse200.updatedAt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.state == null ? 0: this.state.hashCode());
    result = 31 * result + (this.customerId == null ? 0: this.customerId.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0: this.updatedAt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  customerId: ").append(customerId).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
