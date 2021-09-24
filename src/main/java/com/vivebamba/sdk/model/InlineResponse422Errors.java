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

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse422Errors {
  
  @SerializedName("field")
  private List<String> field = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getField() {
    return field;
  }
  public void setField(List<String> field) {
    this.field = field;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse422Errors inlineResponse422Errors = (InlineResponse422Errors) o;
    return (this.field == null ? inlineResponse422Errors.field == null : this.field.equals(inlineResponse422Errors.field));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.field == null ? 0: this.field.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse422Errors {\n");
    
    sb.append("  field: ").append(field).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
