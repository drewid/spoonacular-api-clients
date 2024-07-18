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

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class RecipeInformationWinePairingProductMatchesInner {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("price")
  private String price = null;
  @SerializedName("imageUrl")
  private String imageUrl = null;
  @SerializedName("averageRating")
  private BigDecimal averageRating = null;
  @SerializedName("ratingCount")
  private Integer ratingCount = null;
  @SerializedName("score")
  private BigDecimal score = null;
  @SerializedName("link")
  private String link = null;

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
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getPrice() {
    return price;
  }
  public void setPrice(String price) {
    this.price = price;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getImageUrl() {
    return imageUrl;
  }
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getAverageRating() {
    return averageRating;
  }
  public void setAverageRating(BigDecimal averageRating) {
    this.averageRating = averageRating;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getRatingCount() {
    return ratingCount;
  }
  public void setRatingCount(Integer ratingCount) {
    this.ratingCount = ratingCount;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getScore() {
    return score;
  }
  public void setScore(BigDecimal score) {
    this.score = score;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipeInformationWinePairingProductMatchesInner recipeInformationWinePairingProductMatchesInner = (RecipeInformationWinePairingProductMatchesInner) o;
    return (this.id == null ? recipeInformationWinePairingProductMatchesInner.id == null : this.id.equals(recipeInformationWinePairingProductMatchesInner.id)) &&
        (this.title == null ? recipeInformationWinePairingProductMatchesInner.title == null : this.title.equals(recipeInformationWinePairingProductMatchesInner.title)) &&
        (this.description == null ? recipeInformationWinePairingProductMatchesInner.description == null : this.description.equals(recipeInformationWinePairingProductMatchesInner.description)) &&
        (this.price == null ? recipeInformationWinePairingProductMatchesInner.price == null : this.price.equals(recipeInformationWinePairingProductMatchesInner.price)) &&
        (this.imageUrl == null ? recipeInformationWinePairingProductMatchesInner.imageUrl == null : this.imageUrl.equals(recipeInformationWinePairingProductMatchesInner.imageUrl)) &&
        (this.averageRating == null ? recipeInformationWinePairingProductMatchesInner.averageRating == null : this.averageRating.equals(recipeInformationWinePairingProductMatchesInner.averageRating)) &&
        (this.ratingCount == null ? recipeInformationWinePairingProductMatchesInner.ratingCount == null : this.ratingCount.equals(recipeInformationWinePairingProductMatchesInner.ratingCount)) &&
        (this.score == null ? recipeInformationWinePairingProductMatchesInner.score == null : this.score.equals(recipeInformationWinePairingProductMatchesInner.score)) &&
        (this.link == null ? recipeInformationWinePairingProductMatchesInner.link == null : this.link.equals(recipeInformationWinePairingProductMatchesInner.link));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.title == null ? 0: this.title.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    result = 31 * result + (this.imageUrl == null ? 0: this.imageUrl.hashCode());
    result = 31 * result + (this.averageRating == null ? 0: this.averageRating.hashCode());
    result = 31 * result + (this.ratingCount == null ? 0: this.ratingCount.hashCode());
    result = 31 * result + (this.score == null ? 0: this.score.hashCode());
    result = 31 * result + (this.link == null ? 0: this.link.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipeInformationWinePairingProductMatchesInner {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  imageUrl: ").append(imageUrl).append("\n");
    sb.append("  averageRating: ").append(averageRating).append("\n");
    sb.append("  ratingCount: ").append(ratingCount).append("\n");
    sb.append("  score: ").append(score).append("\n");
    sb.append("  link: ").append(link).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
