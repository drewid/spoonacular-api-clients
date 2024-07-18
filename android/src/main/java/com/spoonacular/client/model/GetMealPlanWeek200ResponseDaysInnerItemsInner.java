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

import com.spoonacular.client.model.GetMealPlanWeek200ResponseDaysInnerItemsInnerValue;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class GetMealPlanWeek200ResponseDaysInnerItemsInner {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("slot")
  private Integer slot = null;
  @SerializedName("position")
  private Integer position = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("value")
  private GetMealPlanWeek200ResponseDaysInnerItemsInnerValue value = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getSlot() {
    return slot;
  }
  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getPosition() {
    return position;
  }
  public void setPosition(Integer position) {
    this.position = position;
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
  @ApiModelProperty(value = "")
  public GetMealPlanWeek200ResponseDaysInnerItemsInnerValue getValue() {
    return value;
  }
  public void setValue(GetMealPlanWeek200ResponseDaysInnerItemsInnerValue value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMealPlanWeek200ResponseDaysInnerItemsInner getMealPlanWeek200ResponseDaysInnerItemsInner = (GetMealPlanWeek200ResponseDaysInnerItemsInner) o;
    return (this.id == null ? getMealPlanWeek200ResponseDaysInnerItemsInner.id == null : this.id.equals(getMealPlanWeek200ResponseDaysInnerItemsInner.id)) &&
        (this.slot == null ? getMealPlanWeek200ResponseDaysInnerItemsInner.slot == null : this.slot.equals(getMealPlanWeek200ResponseDaysInnerItemsInner.slot)) &&
        (this.position == null ? getMealPlanWeek200ResponseDaysInnerItemsInner.position == null : this.position.equals(getMealPlanWeek200ResponseDaysInnerItemsInner.position)) &&
        (this.type == null ? getMealPlanWeek200ResponseDaysInnerItemsInner.type == null : this.type.equals(getMealPlanWeek200ResponseDaysInnerItemsInner.type)) &&
        (this.value == null ? getMealPlanWeek200ResponseDaysInnerItemsInner.value == null : this.value.equals(getMealPlanWeek200ResponseDaysInnerItemsInner.value));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.slot == null ? 0: this.slot.hashCode());
    result = 31 * result + (this.position == null ? 0: this.position.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.value == null ? 0: this.value.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMealPlanWeek200ResponseDaysInnerItemsInner {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  slot: ").append(slot).append("\n");
    sb.append("  position: ").append(position).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
