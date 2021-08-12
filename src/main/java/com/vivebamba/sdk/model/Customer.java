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

import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Customer {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("lastName")
  private String lastName = null;
  @SerializedName("secondLastName")
  private String secondLastName = null;
  @SerializedName("cellphone")
  private String cellphone = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("birthdate")
  private Date birthdate = null;
  @SerializedName("gender")
  private String gender = null;

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
   * The customer's second last name
   **/
  @ApiModelProperty(required = true, value = "The customer's second last name")
  public String getSecondLastName() {
    return secondLastName;
  }
  public void setSecondLastName(String secondLastName) {
    this.secondLastName = secondLastName;
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
   * The customer's email
   **/
  @ApiModelProperty(required = true, value = "The customer's email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The customer's birthdate on yyyy-mm-dd format
   **/
  @ApiModelProperty(required = true, value = "The customer's birthdate on yyyy-mm-dd format")
  public Date getBirthdate() {
    return birthdate;
  }
  public void setBirthdate(Date birthdate) {
    this.birthdate = birthdate;
  }

  /**
   * The customer's gender, M for Male and F for Female
   **/
  @ApiModelProperty(required = true, value = "The customer's gender, M for Male and F for Female")
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return (this.name == null ? customer.name == null : this.name.equals(customer.name)) &&
        (this.lastName == null ? customer.lastName == null : this.lastName.equals(customer.lastName)) &&
        (this.secondLastName == null ? customer.secondLastName == null : this.secondLastName.equals(customer.secondLastName)) &&
        (this.cellphone == null ? customer.cellphone == null : this.cellphone.equals(customer.cellphone)) &&
        (this.email == null ? customer.email == null : this.email.equals(customer.email)) &&
        (this.birthdate == null ? customer.birthdate == null : this.birthdate.equals(customer.birthdate)) &&
        (this.gender == null ? customer.gender == null : this.gender.equals(customer.gender));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.secondLastName == null ? 0: this.secondLastName.hashCode());
    result = 31 * result + (this.cellphone == null ? 0: this.cellphone.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.birthdate == null ? 0: this.birthdate.hashCode());
    result = 31 * result + (this.gender == null ? 0: this.gender.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  secondLastName: ").append(secondLastName).append("\n");
    sb.append("  cellphone: ").append(cellphone).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  birthdate: ").append(birthdate).append("\n");
    sb.append("  gender: ").append(gender).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
