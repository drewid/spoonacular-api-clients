/**
 * spoonacular API
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 800,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.1
 * Contact: mail@spoonacular.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.spoonacular.client.model;

import com.spoonacular.client.model.ImageAnalysisByURL200ResponseNutritionCaloriesConfidenceRange95Percent;
import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ImageAnalysisByURL200ResponseNutritionCalories {
  
  @SerializedName("value")
  private BigDecimal value = null;
  @SerializedName("unit")
  private String unit = null;
  @SerializedName("confidenceRange95Percent")
  private ImageAnalysisByURL200ResponseNutritionCaloriesConfidenceRange95Percent confidenceRange95Percent = null;
  @SerializedName("standardDeviation")
  private BigDecimal standardDeviation = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getValue() {
    return value;
  }
  public void setValue(BigDecimal value) {
    this.value = value;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getUnit() {
    return unit;
  }
  public void setUnit(String unit) {
    this.unit = unit;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ImageAnalysisByURL200ResponseNutritionCaloriesConfidenceRange95Percent getConfidenceRange95Percent() {
    return confidenceRange95Percent;
  }
  public void setConfidenceRange95Percent(ImageAnalysisByURL200ResponseNutritionCaloriesConfidenceRange95Percent confidenceRange95Percent) {
    this.confidenceRange95Percent = confidenceRange95Percent;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getStandardDeviation() {
    return standardDeviation;
  }
  public void setStandardDeviation(BigDecimal standardDeviation) {
    this.standardDeviation = standardDeviation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageAnalysisByURL200ResponseNutritionCalories imageAnalysisByURL200ResponseNutritionCalories = (ImageAnalysisByURL200ResponseNutritionCalories) o;
    return (this.value == null ? imageAnalysisByURL200ResponseNutritionCalories.value == null : this.value.equals(imageAnalysisByURL200ResponseNutritionCalories.value)) &&
        (this.unit == null ? imageAnalysisByURL200ResponseNutritionCalories.unit == null : this.unit.equals(imageAnalysisByURL200ResponseNutritionCalories.unit)) &&
        (this.confidenceRange95Percent == null ? imageAnalysisByURL200ResponseNutritionCalories.confidenceRange95Percent == null : this.confidenceRange95Percent.equals(imageAnalysisByURL200ResponseNutritionCalories.confidenceRange95Percent)) &&
        (this.standardDeviation == null ? imageAnalysisByURL200ResponseNutritionCalories.standardDeviation == null : this.standardDeviation.equals(imageAnalysisByURL200ResponseNutritionCalories.standardDeviation));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.value == null ? 0: this.value.hashCode());
    result = 31 * result + (this.unit == null ? 0: this.unit.hashCode());
    result = 31 * result + (this.confidenceRange95Percent == null ? 0: this.confidenceRange95Percent.hashCode());
    result = 31 * result + (this.standardDeviation == null ? 0: this.standardDeviation.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageAnalysisByURL200ResponseNutritionCalories {\n");
    
    sb.append("  value: ").append(value).append("\n");
    sb.append("  unit: ").append(unit).append("\n");
    sb.append("  confidenceRange95Percent: ").append(confidenceRange95Percent).append("\n");
    sb.append("  standardDeviation: ").append(standardDeviation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
