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

import com.spoonacular.client.model.GetRecipeNutritionWidgetByID200ResponseBadInner;
import com.spoonacular.client.model.GetRecipeNutritionWidgetByID200ResponseGoodInner;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * 
 **/
@ApiModel(description = "")
public class GetRecipeNutritionWidgetByID200Response {
  
  @SerializedName("calories")
  private String calories = null;
  @SerializedName("carbs")
  private String carbs = null;
  @SerializedName("fat")
  private String fat = null;
  @SerializedName("protein")
  private String protein = null;
  @SerializedName("bad")
  private Set<GetRecipeNutritionWidgetByID200ResponseBadInner> bad = null;
  @SerializedName("good")
  private Set<GetRecipeNutritionWidgetByID200ResponseGoodInner> good = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCalories() {
    return calories;
  }
  public void setCalories(String calories) {
    this.calories = calories;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCarbs() {
    return carbs;
  }
  public void setCarbs(String carbs) {
    this.carbs = carbs;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getFat() {
    return fat;
  }
  public void setFat(String fat) {
    this.fat = fat;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getProtein() {
    return protein;
  }
  public void setProtein(String protein) {
    this.protein = protein;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Set<GetRecipeNutritionWidgetByID200ResponseBadInner> getBad() {
    return bad;
  }
  public void setBad(Set<GetRecipeNutritionWidgetByID200ResponseBadInner> bad) {
    this.bad = bad;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Set<GetRecipeNutritionWidgetByID200ResponseGoodInner> getGood() {
    return good;
  }
  public void setGood(Set<GetRecipeNutritionWidgetByID200ResponseGoodInner> good) {
    this.good = good;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecipeNutritionWidgetByID200Response getRecipeNutritionWidgetByID200Response = (GetRecipeNutritionWidgetByID200Response) o;
    return (this.calories == null ? getRecipeNutritionWidgetByID200Response.calories == null : this.calories.equals(getRecipeNutritionWidgetByID200Response.calories)) &&
        (this.carbs == null ? getRecipeNutritionWidgetByID200Response.carbs == null : this.carbs.equals(getRecipeNutritionWidgetByID200Response.carbs)) &&
        (this.fat == null ? getRecipeNutritionWidgetByID200Response.fat == null : this.fat.equals(getRecipeNutritionWidgetByID200Response.fat)) &&
        (this.protein == null ? getRecipeNutritionWidgetByID200Response.protein == null : this.protein.equals(getRecipeNutritionWidgetByID200Response.protein)) &&
        (this.bad == null ? getRecipeNutritionWidgetByID200Response.bad == null : this.bad.equals(getRecipeNutritionWidgetByID200Response.bad)) &&
        (this.good == null ? getRecipeNutritionWidgetByID200Response.good == null : this.good.equals(getRecipeNutritionWidgetByID200Response.good));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.calories == null ? 0: this.calories.hashCode());
    result = 31 * result + (this.carbs == null ? 0: this.carbs.hashCode());
    result = 31 * result + (this.fat == null ? 0: this.fat.hashCode());
    result = 31 * result + (this.protein == null ? 0: this.protein.hashCode());
    result = 31 * result + (this.bad == null ? 0: this.bad.hashCode());
    result = 31 * result + (this.good == null ? 0: this.good.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecipeNutritionWidgetByID200Response {\n");
    
    sb.append("  calories: ").append(calories).append("\n");
    sb.append("  carbs: ").append(carbs).append("\n");
    sb.append("  fat: ").append(fat).append("\n");
    sb.append("  protein: ").append(protein).append("\n");
    sb.append("  bad: ").append(bad).append("\n");
    sb.append("  good: ").append(good).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
