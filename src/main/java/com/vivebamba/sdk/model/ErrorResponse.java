/**
 * Bamba API
 * SDK for Bamba API
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: desarrollo@vivebamba.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.vivebamba.sdk.model;

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ErrorResponse {
  
  @SerializedName("errors")
  private List<String> errors = null;

  /**
   * The error description
   **/
  @ApiModelProperty(value = "The error description")
  public List<String> getErrors() {
    return errors;
  }
  public void setErrors(List<String> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return (this.errors == null ? errorResponse.errors == null : this.errors.equals(errorResponse.errors));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.errors == null ? 0: this.errors.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("  errors: ").append(errors).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
