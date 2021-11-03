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

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ProductDescription {
  
  @SerializedName("section")
  private String section = null;
  @SerializedName("body")
  private List<String> body = null;

  /**
   * Section title
   **/
  @ApiModelProperty(value = "Section title")
  public String getSection() {
    return section;
  }
  public void setSection(String section) {
    this.section = section;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getBody() {
    return body;
  }
  public void setBody(List<String> body) {
    this.body = body;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDescription productDescription = (ProductDescription) o;
    return (this.section == null ? productDescription.section == null : this.section.equals(productDescription.section)) &&
        (this.body == null ? productDescription.body == null : this.body.equals(productDescription.body));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.section == null ? 0: this.section.hashCode());
    result = 31 * result + (this.body == null ? 0: this.body.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDescription {\n");
    
    sb.append("  section: ").append(section).append("\n");
    sb.append("  body: ").append(body).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
