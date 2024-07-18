/**
 * spoonacular API
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 2.0.1
 * Contact: mail@spoonacular.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.spoonacular.client.model;

import com.spoonacular.client.model.SearchCustomFoods200ResponseCustomFoodsInner;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * 
 **/
@ApiModel(description = "")
public class SearchCustomFoods200Response {
  
  @SerializedName("customFoods")
  private Set<SearchCustomFoods200ResponseCustomFoodsInner> customFoods = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("offset")
  private Integer offset = null;
  @SerializedName("number")
  private Integer number = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Set<SearchCustomFoods200ResponseCustomFoodsInner> getCustomFoods() {
    return customFoods;
  }
  public void setCustomFoods(Set<SearchCustomFoods200ResponseCustomFoodsInner> customFoods) {
    this.customFoods = customFoods;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getOffset() {
    return offset;
  }
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getNumber() {
    return number;
  }
  public void setNumber(Integer number) {
    this.number = number;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchCustomFoods200Response searchCustomFoods200Response = (SearchCustomFoods200Response) o;
    return (this.customFoods == null ? searchCustomFoods200Response.customFoods == null : this.customFoods.equals(searchCustomFoods200Response.customFoods)) &&
        (this.type == null ? searchCustomFoods200Response.type == null : this.type.equals(searchCustomFoods200Response.type)) &&
        (this.offset == null ? searchCustomFoods200Response.offset == null : this.offset.equals(searchCustomFoods200Response.offset)) &&
        (this.number == null ? searchCustomFoods200Response.number == null : this.number.equals(searchCustomFoods200Response.number));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.customFoods == null ? 0: this.customFoods.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.offset == null ? 0: this.offset.hashCode());
    result = 31 * result + (this.number == null ? 0: this.number.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCustomFoods200Response {\n");
    
    sb.append("  customFoods: ").append(customFoods).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  offset: ").append(offset).append("\n");
    sb.append("  number: ").append(number).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
