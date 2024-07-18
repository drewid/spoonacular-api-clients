/*
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

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.spoonacular.client.JSON;

/**
 * SearchRecipesByNutrients200ResponseInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0-SNAPSHOT")
public class SearchRecipesByNutrients200ResponseInner {
  public static final String SERIALIZED_NAME_CALORIES = "calories";
  @SerializedName(SERIALIZED_NAME_CALORIES)
  private BigDecimal calories;

  public static final String SERIALIZED_NAME_CARBS = "carbs";
  @SerializedName(SERIALIZED_NAME_CARBS)
  private String carbs;

  public static final String SERIALIZED_NAME_FAT = "fat";
  @SerializedName(SERIALIZED_NAME_FAT)
  private String fat;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_IMAGE_TYPE = "imageType";
  @SerializedName(SERIALIZED_NAME_IMAGE_TYPE)
  private String imageType;

  public static final String SERIALIZED_NAME_PROTEIN = "protein";
  @SerializedName(SERIALIZED_NAME_PROTEIN)
  private String protein;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public SearchRecipesByNutrients200ResponseInner() {
  }

  public SearchRecipesByNutrients200ResponseInner calories(BigDecimal calories) {
    this.calories = calories;
    return this;
  }

  /**
   * Get calories
   * @return calories
   */
  @javax.annotation.Nonnull
  public BigDecimal getCalories() {
    return calories;
  }

  public void setCalories(BigDecimal calories) {
    this.calories = calories;
  }


  public SearchRecipesByNutrients200ResponseInner carbs(String carbs) {
    this.carbs = carbs;
    return this;
  }

  /**
   * Get carbs
   * @return carbs
   */
  @javax.annotation.Nonnull
  public String getCarbs() {
    return carbs;
  }

  public void setCarbs(String carbs) {
    this.carbs = carbs;
  }


  public SearchRecipesByNutrients200ResponseInner fat(String fat) {
    this.fat = fat;
    return this;
  }

  /**
   * Get fat
   * @return fat
   */
  @javax.annotation.Nonnull
  public String getFat() {
    return fat;
  }

  public void setFat(String fat) {
    this.fat = fat;
  }


  public SearchRecipesByNutrients200ResponseInner id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public SearchRecipesByNutrients200ResponseInner image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @javax.annotation.Nonnull
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  public SearchRecipesByNutrients200ResponseInner imageType(String imageType) {
    this.imageType = imageType;
    return this;
  }

  /**
   * Get imageType
   * @return imageType
   */
  @javax.annotation.Nonnull
  public String getImageType() {
    return imageType;
  }

  public void setImageType(String imageType) {
    this.imageType = imageType;
  }


  public SearchRecipesByNutrients200ResponseInner protein(String protein) {
    this.protein = protein;
    return this;
  }

  /**
   * Get protein
   * @return protein
   */
  @javax.annotation.Nonnull
  public String getProtein() {
    return protein;
  }

  public void setProtein(String protein) {
    this.protein = protein;
  }


  public SearchRecipesByNutrients200ResponseInner title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchRecipesByNutrients200ResponseInner searchRecipesByNutrients200ResponseInner = (SearchRecipesByNutrients200ResponseInner) o;
    return Objects.equals(this.calories, searchRecipesByNutrients200ResponseInner.calories) &&
        Objects.equals(this.carbs, searchRecipesByNutrients200ResponseInner.carbs) &&
        Objects.equals(this.fat, searchRecipesByNutrients200ResponseInner.fat) &&
        Objects.equals(this.id, searchRecipesByNutrients200ResponseInner.id) &&
        Objects.equals(this.image, searchRecipesByNutrients200ResponseInner.image) &&
        Objects.equals(this.imageType, searchRecipesByNutrients200ResponseInner.imageType) &&
        Objects.equals(this.protein, searchRecipesByNutrients200ResponseInner.protein) &&
        Objects.equals(this.title, searchRecipesByNutrients200ResponseInner.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calories, carbs, fat, id, image, imageType, protein, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchRecipesByNutrients200ResponseInner {\n");
    sb.append("    calories: ").append(toIndentedString(calories)).append("\n");
    sb.append("    carbs: ").append(toIndentedString(carbs)).append("\n");
    sb.append("    fat: ").append(toIndentedString(fat)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    protein: ").append(toIndentedString(protein)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("calories");
    openapiFields.add("carbs");
    openapiFields.add("fat");
    openapiFields.add("id");
    openapiFields.add("image");
    openapiFields.add("imageType");
    openapiFields.add("protein");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("calories");
    openapiRequiredFields.add("carbs");
    openapiRequiredFields.add("fat");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("image");
    openapiRequiredFields.add("imageType");
    openapiRequiredFields.add("protein");
    openapiRequiredFields.add("title");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SearchRecipesByNutrients200ResponseInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchRecipesByNutrients200ResponseInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchRecipesByNutrients200ResponseInner is not found in the empty JSON string", SearchRecipesByNutrients200ResponseInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchRecipesByNutrients200ResponseInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchRecipesByNutrients200ResponseInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SearchRecipesByNutrients200ResponseInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("carbs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carbs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carbs").toString()));
      }
      if (!jsonObj.get("fat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fat").toString()));
      }
      if (!jsonObj.get("image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image").toString()));
      }
      if (!jsonObj.get("imageType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageType").toString()));
      }
      if (!jsonObj.get("protein").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protein` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protein").toString()));
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchRecipesByNutrients200ResponseInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchRecipesByNutrients200ResponseInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchRecipesByNutrients200ResponseInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchRecipesByNutrients200ResponseInner.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchRecipesByNutrients200ResponseInner>() {
           @Override
           public void write(JsonWriter out, SearchRecipesByNutrients200ResponseInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchRecipesByNutrients200ResponseInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SearchRecipesByNutrients200ResponseInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SearchRecipesByNutrients200ResponseInner
   * @throws IOException if the JSON string is invalid with respect to SearchRecipesByNutrients200ResponseInner
   */
  public static SearchRecipesByNutrients200ResponseInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchRecipesByNutrients200ResponseInner.class);
  }

  /**
   * Convert an instance of SearchRecipesByNutrients200ResponseInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

