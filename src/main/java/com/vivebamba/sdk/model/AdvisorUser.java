/**
 * Bamba API
 * SDK for Bamba API
 *
 * The version of the OpenAPI document: 1.2.5
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
public class AdvisorUser {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("lastName")
  private String lastName = null;
  @SerializedName("cellphone")
  private String cellphone = null;
  @SerializedName("uuid")
  private String uuid = null;

  /**
   * The customer's name
   **/
  @ApiModelProperty(required = true, value = "The customer's name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The customer's last name
   **/
  @ApiModelProperty(required = true, value = "The customer's last name")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * The customer's cellphone number
   **/
  @ApiModelProperty(required = true, value = "The customer's cellphone number")
  public String getCellphone() {
    return cellphone;
  }
  public void setCellphone(String cellphone) {
    this.cellphone = cellphone;
  }

  /**
   * Customer UUID assigned by Bamba
   **/
  @ApiModelProperty(value = "Customer UUID assigned by Bamba")
  public String getUuid() {
    return uuid;
  }
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvisorUser advisorUser = (AdvisorUser) o;
    return (this.name == null ? advisorUser.name == null : this.name.equals(advisorUser.name)) &&
        (this.lastName == null ? advisorUser.lastName == null : this.lastName.equals(advisorUser.lastName)) &&
        (this.cellphone == null ? advisorUser.cellphone == null : this.cellphone.equals(advisorUser.cellphone)) &&
        (this.uuid == null ? advisorUser.uuid == null : this.uuid.equals(advisorUser.uuid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.cellphone == null ? 0: this.cellphone.hashCode());
    result = 31 * result + (this.uuid == null ? 0: this.uuid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvisorUser {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  cellphone: ").append(cellphone).append("\n");
    sb.append("  uuid: ").append(uuid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
