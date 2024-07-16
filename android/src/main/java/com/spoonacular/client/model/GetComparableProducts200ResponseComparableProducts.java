/**
 * spoonacular API
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.1
 * Contact: mail@spoonacular.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.spoonacular.client.model;

import com.spoonacular.client.model.ComparableProduct;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class GetComparableProducts200ResponseComparableProducts {
  
  @SerializedName("calories")
  private List<ComparableProduct> calories = null;
  @SerializedName("likes")
  private List<ComparableProduct> likes = null;
  @SerializedName("price")
  private List<ComparableProduct> price = null;
  @SerializedName("protein")
  private List<ComparableProduct> protein = null;
  @SerializedName("spoonacular_score")
  private List<ComparableProduct> spoonacularScore = null;
  @SerializedName("sugar")
  private List<ComparableProduct> sugar = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ComparableProduct> getCalories() {
    return calories;
  }
  public void setCalories(List<ComparableProduct> calories) {
    this.calories = calories;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ComparableProduct> getLikes() {
    return likes;
  }
  public void setLikes(List<ComparableProduct> likes) {
    this.likes = likes;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ComparableProduct> getPrice() {
    return price;
  }
  public void setPrice(List<ComparableProduct> price) {
    this.price = price;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ComparableProduct> getProtein() {
    return protein;
  }
  public void setProtein(List<ComparableProduct> protein) {
    this.protein = protein;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ComparableProduct> getSpoonacularScore() {
    return spoonacularScore;
  }
  public void setSpoonacularScore(List<ComparableProduct> spoonacularScore) {
    this.spoonacularScore = spoonacularScore;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ComparableProduct> getSugar() {
    return sugar;
  }
  public void setSugar(List<ComparableProduct> sugar) {
    this.sugar = sugar;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetComparableProducts200ResponseComparableProducts getComparableProducts200ResponseComparableProducts = (GetComparableProducts200ResponseComparableProducts) o;
    return (this.calories == null ? getComparableProducts200ResponseComparableProducts.calories == null : this.calories.equals(getComparableProducts200ResponseComparableProducts.calories)) &&
        (this.likes == null ? getComparableProducts200ResponseComparableProducts.likes == null : this.likes.equals(getComparableProducts200ResponseComparableProducts.likes)) &&
        (this.price == null ? getComparableProducts200ResponseComparableProducts.price == null : this.price.equals(getComparableProducts200ResponseComparableProducts.price)) &&
        (this.protein == null ? getComparableProducts200ResponseComparableProducts.protein == null : this.protein.equals(getComparableProducts200ResponseComparableProducts.protein)) &&
        (this.spoonacularScore == null ? getComparableProducts200ResponseComparableProducts.spoonacularScore == null : this.spoonacularScore.equals(getComparableProducts200ResponseComparableProducts.spoonacularScore)) &&
        (this.sugar == null ? getComparableProducts200ResponseComparableProducts.sugar == null : this.sugar.equals(getComparableProducts200ResponseComparableProducts.sugar));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.calories == null ? 0: this.calories.hashCode());
    result = 31 * result + (this.likes == null ? 0: this.likes.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    result = 31 * result + (this.protein == null ? 0: this.protein.hashCode());
    result = 31 * result + (this.spoonacularScore == null ? 0: this.spoonacularScore.hashCode());
    result = 31 * result + (this.sugar == null ? 0: this.sugar.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetComparableProducts200ResponseComparableProducts {\n");
    
    sb.append("  calories: ").append(calories).append("\n");
    sb.append("  likes: ").append(likes).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  protein: ").append(protein).append("\n");
    sb.append("  spoonacularScore: ").append(spoonacularScore).append("\n");
    sb.append("  sugar: ").append(sugar).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
