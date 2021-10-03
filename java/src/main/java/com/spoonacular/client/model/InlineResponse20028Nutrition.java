/*
 * spoonacular API
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 800,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: mail@spoonacular.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.spoonacular.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.spoonacular.client.model.RecipesParseIngredientsNutritionCaloricBreakdown;
import com.spoonacular.client.model.RecipesParseIngredientsNutritionNutrients;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20028Nutrition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-03T15:10:59.332+02:00[Europe/Berlin]")
public class InlineResponse20028Nutrition {
  public static final String SERIALIZED_NAME_NUTRIENTS = "nutrients";
  @SerializedName(SERIALIZED_NAME_NUTRIENTS)
  private List<RecipesParseIngredientsNutritionNutrients> nutrients = new ArrayList<>();

  public static final String SERIALIZED_NAME_CALORIC_BREAKDOWN = "caloricBreakdown";
  @SerializedName(SERIALIZED_NAME_CALORIC_BREAKDOWN)
  private RecipesParseIngredientsNutritionCaloricBreakdown caloricBreakdown = null;

  public InlineResponse20028Nutrition nutrients(List<RecipesParseIngredientsNutritionNutrients> nutrients) {
    this.nutrients = nutrients;
    return this;
  }

  public InlineResponse20028Nutrition addNutrientsItem(RecipesParseIngredientsNutritionNutrients nutrientsItem) {
    this.nutrients.add(nutrientsItem);
    return this;
  }

   /**
   * Get nutrients
   * @return nutrients
  **/
  @ApiModelProperty(required = true, value = "")
  public List<RecipesParseIngredientsNutritionNutrients> getNutrients() {
    return nutrients;
  }

  public void setNutrients(List<RecipesParseIngredientsNutritionNutrients> nutrients) {
    this.nutrients = nutrients;
  }

  public InlineResponse20028Nutrition caloricBreakdown(RecipesParseIngredientsNutritionCaloricBreakdown caloricBreakdown) {
    this.caloricBreakdown = caloricBreakdown;
    return this;
  }

   /**
   * Get caloricBreakdown
   * @return caloricBreakdown
  **/
  @ApiModelProperty(required = true, value = "")
  public RecipesParseIngredientsNutritionCaloricBreakdown getCaloricBreakdown() {
    return caloricBreakdown;
  }

  public void setCaloricBreakdown(RecipesParseIngredientsNutritionCaloricBreakdown caloricBreakdown) {
    this.caloricBreakdown = caloricBreakdown;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20028Nutrition inlineResponse20028Nutrition = (InlineResponse20028Nutrition) o;
    return Objects.equals(this.nutrients, inlineResponse20028Nutrition.nutrients) &&
        Objects.equals(this.caloricBreakdown, inlineResponse20028Nutrition.caloricBreakdown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nutrients, caloricBreakdown);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20028Nutrition {\n");
    sb.append("    nutrients: ").append(toIndentedString(nutrients)).append("\n");
    sb.append("    caloricBreakdown: ").append(toIndentedString(caloricBreakdown)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

