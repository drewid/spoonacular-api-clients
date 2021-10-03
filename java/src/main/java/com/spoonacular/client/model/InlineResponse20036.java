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
import com.spoonacular.client.model.InlineResponse20028Nutrition;
import com.spoonacular.client.model.InlineResponse20028Servings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20036
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-03T15:10:59.332+02:00[Europe/Berlin]")
public class InlineResponse20036 {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_RESTAURANT_CHAIN = "restaurantChain";
  @SerializedName(SERIALIZED_NAME_RESTAURANT_CHAIN)
  private String restaurantChain;

  public static final String SERIALIZED_NAME_NUTRITION = "nutrition";
  @SerializedName(SERIALIZED_NAME_NUTRITION)
  private InlineResponse20028Nutrition nutrition = null;

  public static final String SERIALIZED_NAME_BADGES = "badges";
  @SerializedName(SERIALIZED_NAME_BADGES)
  private List<String> badges = new ArrayList<>();

  public static final String SERIALIZED_NAME_BREADCRUMBS = "breadcrumbs";
  @SerializedName(SERIALIZED_NAME_BREADCRUMBS)
  private List<String> breadcrumbs = new ArrayList<>();

  public static final String SERIALIZED_NAME_GENERATED_TEXT = "generatedText";
  @SerializedName(SERIALIZED_NAME_GENERATED_TEXT)
  private String generatedText;

  public static final String SERIALIZED_NAME_IMAGE_TYPE = "imageType";
  @SerializedName(SERIALIZED_NAME_IMAGE_TYPE)
  private String imageType;

  public static final String SERIALIZED_NAME_LIKES = "likes";
  @SerializedName(SERIALIZED_NAME_LIKES)
  private BigDecimal likes;

  public static final String SERIALIZED_NAME_SERVINGS = "servings";
  @SerializedName(SERIALIZED_NAME_SERVINGS)
  private InlineResponse20028Servings servings = null;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_SPOONACULAR_SCORE = "spoonacularScore";
  @SerializedName(SERIALIZED_NAME_SPOONACULAR_SCORE)
  private BigDecimal spoonacularScore;

  public InlineResponse20036 id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public InlineResponse20036 title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public InlineResponse20036 restaurantChain(String restaurantChain) {
    this.restaurantChain = restaurantChain;
    return this;
  }

   /**
   * Get restaurantChain
   * @return restaurantChain
  **/
  @ApiModelProperty(required = true, value = "")
  public String getRestaurantChain() {
    return restaurantChain;
  }

  public void setRestaurantChain(String restaurantChain) {
    this.restaurantChain = restaurantChain;
  }

  public InlineResponse20036 nutrition(InlineResponse20028Nutrition nutrition) {
    this.nutrition = nutrition;
    return this;
  }

   /**
   * Get nutrition
   * @return nutrition
  **/
  @ApiModelProperty(required = true, value = "")
  public InlineResponse20028Nutrition getNutrition() {
    return nutrition;
  }

  public void setNutrition(InlineResponse20028Nutrition nutrition) {
    this.nutrition = nutrition;
  }

  public InlineResponse20036 badges(List<String> badges) {
    this.badges = badges;
    return this;
  }

  public InlineResponse20036 addBadgesItem(String badgesItem) {
    this.badges.add(badgesItem);
    return this;
  }

   /**
   * Get badges
   * @return badges
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getBadges() {
    return badges;
  }

  public void setBadges(List<String> badges) {
    this.badges = badges;
  }

  public InlineResponse20036 breadcrumbs(List<String> breadcrumbs) {
    this.breadcrumbs = breadcrumbs;
    return this;
  }

  public InlineResponse20036 addBreadcrumbsItem(String breadcrumbsItem) {
    this.breadcrumbs.add(breadcrumbsItem);
    return this;
  }

   /**
   * Get breadcrumbs
   * @return breadcrumbs
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getBreadcrumbs() {
    return breadcrumbs;
  }

  public void setBreadcrumbs(List<String> breadcrumbs) {
    this.breadcrumbs = breadcrumbs;
  }

  public InlineResponse20036 generatedText(String generatedText) {
    this.generatedText = generatedText;
    return this;
  }

   /**
   * Get generatedText
   * @return generatedText
  **/
  @ApiModelProperty(value = "")
  public String getGeneratedText() {
    return generatedText;
  }

  public void setGeneratedText(String generatedText) {
    this.generatedText = generatedText;
  }

  public InlineResponse20036 imageType(String imageType) {
    this.imageType = imageType;
    return this;
  }

   /**
   * Get imageType
   * @return imageType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getImageType() {
    return imageType;
  }

  public void setImageType(String imageType) {
    this.imageType = imageType;
  }

  public InlineResponse20036 likes(BigDecimal likes) {
    this.likes = likes;
    return this;
  }

   /**
   * Get likes
   * @return likes
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getLikes() {
    return likes;
  }

  public void setLikes(BigDecimal likes) {
    this.likes = likes;
  }

  public InlineResponse20036 servings(InlineResponse20028Servings servings) {
    this.servings = servings;
    return this;
  }

   /**
   * Get servings
   * @return servings
  **/
  @ApiModelProperty(required = true, value = "")
  public InlineResponse20028Servings getServings() {
    return servings;
  }

  public void setServings(InlineResponse20028Servings servings) {
    this.servings = servings;
  }

  public InlineResponse20036 price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public InlineResponse20036 spoonacularScore(BigDecimal spoonacularScore) {
    this.spoonacularScore = spoonacularScore;
    return this;
  }

   /**
   * Get spoonacularScore
   * @return spoonacularScore
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getSpoonacularScore() {
    return spoonacularScore;
  }

  public void setSpoonacularScore(BigDecimal spoonacularScore) {
    this.spoonacularScore = spoonacularScore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20036 inlineResponse20036 = (InlineResponse20036) o;
    return Objects.equals(this.id, inlineResponse20036.id) &&
        Objects.equals(this.title, inlineResponse20036.title) &&
        Objects.equals(this.restaurantChain, inlineResponse20036.restaurantChain) &&
        Objects.equals(this.nutrition, inlineResponse20036.nutrition) &&
        Objects.equals(this.badges, inlineResponse20036.badges) &&
        Objects.equals(this.breadcrumbs, inlineResponse20036.breadcrumbs) &&
        Objects.equals(this.generatedText, inlineResponse20036.generatedText) &&
        Objects.equals(this.imageType, inlineResponse20036.imageType) &&
        Objects.equals(this.likes, inlineResponse20036.likes) &&
        Objects.equals(this.servings, inlineResponse20036.servings) &&
        Objects.equals(this.price, inlineResponse20036.price) &&
        Objects.equals(this.spoonacularScore, inlineResponse20036.spoonacularScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, restaurantChain, nutrition, badges, breadcrumbs, generatedText, imageType, likes, servings, price, spoonacularScore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20036 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    restaurantChain: ").append(toIndentedString(restaurantChain)).append("\n");
    sb.append("    nutrition: ").append(toIndentedString(nutrition)).append("\n");
    sb.append("    badges: ").append(toIndentedString(badges)).append("\n");
    sb.append("    breadcrumbs: ").append(toIndentedString(breadcrumbs)).append("\n");
    sb.append("    generatedText: ").append(toIndentedString(generatedText)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    servings: ").append(toIndentedString(servings)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    spoonacularScore: ").append(toIndentedString(spoonacularScore)).append("\n");
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

