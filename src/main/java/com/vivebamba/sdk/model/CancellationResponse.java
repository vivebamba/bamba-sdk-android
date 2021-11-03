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
public class CancellationResponse {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("brief")
  private String brief = null;
  @SerializedName("state")
  private String state = null;
  @SerializedName("canceledAt")
  private Date canceledAt = null;

  /**
   * UUID of the canceled service
   **/
  @ApiModelProperty(value = "UUID of the canceled service")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Benefit
   **/
  @ApiModelProperty(value = "Benefit")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Plan benefit summary
   **/
  @ApiModelProperty(value = "Plan benefit summary")
  public String getBrief() {
    return brief;
  }
  public void setBrief(String brief) {
    this.brief = brief;
  }

  /**
   * Cancellation status
   **/
  @ApiModelProperty(value = "Cancellation status")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  /**
   * The date and time (ISO 8601 format) of cancellation
   **/
  @ApiModelProperty(value = "The date and time (ISO 8601 format) of cancellation")
  public Date getCanceledAt() {
    return canceledAt;
  }
  public void setCanceledAt(Date canceledAt) {
    this.canceledAt = canceledAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancellationResponse cancellationResponse = (CancellationResponse) o;
    return (this.id == null ? cancellationResponse.id == null : this.id.equals(cancellationResponse.id)) &&
        (this.name == null ? cancellationResponse.name == null : this.name.equals(cancellationResponse.name)) &&
        (this.brief == null ? cancellationResponse.brief == null : this.brief.equals(cancellationResponse.brief)) &&
        (this.state == null ? cancellationResponse.state == null : this.state.equals(cancellationResponse.state)) &&
        (this.canceledAt == null ? cancellationResponse.canceledAt == null : this.canceledAt.equals(cancellationResponse.canceledAt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.brief == null ? 0: this.brief.hashCode());
    result = 31 * result + (this.state == null ? 0: this.state.hashCode());
    result = 31 * result + (this.canceledAt == null ? 0: this.canceledAt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancellationResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  brief: ").append(brief).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  canceledAt: ").append(canceledAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
