/*
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.spoonacular.client.model.SearchRecipesByIngredients200ResponseInnerMissedIngredientsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.spoonacular.client.JSON;

/**
 * SearchRecipesByIngredients200ResponseInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-09T18:25:28.115+02:00[Europe/Berlin]")
public class SearchRecipesByIngredients200ResponseInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_IMAGE_TYPE = "imageType";
  @SerializedName(SERIALIZED_NAME_IMAGE_TYPE)
  private String imageType;

  public static final String SERIALIZED_NAME_LIKES = "likes";
  @SerializedName(SERIALIZED_NAME_LIKES)
  private Integer likes;

  public static final String SERIALIZED_NAME_MISSED_INGREDIENT_COUNT = "missedIngredientCount";
  @SerializedName(SERIALIZED_NAME_MISSED_INGREDIENT_COUNT)
  private Integer missedIngredientCount;

  public static final String SERIALIZED_NAME_MISSED_INGREDIENTS = "missedIngredients";
  @SerializedName(SERIALIZED_NAME_MISSED_INGREDIENTS)
  private Set<SearchRecipesByIngredients200ResponseInnerMissedIngredientsInner> missedIngredients = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_UNUSED_INGREDIENTS = "unusedIngredients";
  @SerializedName(SERIALIZED_NAME_UNUSED_INGREDIENTS)
  private List<Object> unusedIngredients = new ArrayList<>();

  public static final String SERIALIZED_NAME_USED_INGREDIENT_COUNT = "usedIngredientCount";
  @SerializedName(SERIALIZED_NAME_USED_INGREDIENT_COUNT)
  private BigDecimal usedIngredientCount;

  public static final String SERIALIZED_NAME_USED_INGREDIENTS = "usedIngredients";
  @SerializedName(SERIALIZED_NAME_USED_INGREDIENTS)
  private Set<SearchRecipesByIngredients200ResponseInnerMissedIngredientsInner> usedIngredients = new LinkedHashSet<>();

  public SearchRecipesByIngredients200ResponseInner() { 
  }

  public SearchRecipesByIngredients200ResponseInner id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public SearchRecipesByIngredients200ResponseInner image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public SearchRecipesByIngredients200ResponseInner imageType(String imageType) {
    
    this.imageType = imageType;
    return this;
  }

   /**
   * Get imageType
   * @return imageType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getImageType() {
    return imageType;
  }


  public void setImageType(String imageType) {
    this.imageType = imageType;
  }


  public SearchRecipesByIngredients200ResponseInner likes(Integer likes) {
    
    this.likes = likes;
    return this;
  }

   /**
   * Get likes
   * @return likes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getLikes() {
    return likes;
  }


  public void setLikes(Integer likes) {
    this.likes = likes;
  }


  public SearchRecipesByIngredients200ResponseInner missedIngredientCount(Integer missedIngredientCount) {
    
    this.missedIngredientCount = missedIngredientCount;
    return this;
  }

   /**
   * Get missedIngredientCount
   * @return missedIngredientCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getMissedIngredientCount() {
    return missedIngredientCount;
  }


  public void setMissedIngredientCount(Integer missedIngredientCount) {
    this.missedIngredientCount = missedIngredientCount;
  }


  public SearchRecipesByIngredients200ResponseInner missedIngredients(Set<SearchRecipesByIngredients200ResponseInnerMissedIngredientsInner> missedIngredients) {
    
    this.missedIngredients = missedIngredients;
    return this;
  }

  public SearchRecipesByIngredients200ResponseInner addMissedIngredientsItem(SearchRecipesByIngredients200ResponseInnerMissedIngredientsInner missedIngredientsItem) {
    this.missedIngredients.add(missedIngredientsItem);
    return this;
  }

   /**
   * Get missedIngredients
   * @return missedIngredients
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Set<SearchRecipesByIngredients200ResponseInnerMissedIngredientsInner> getMissedIngredients() {
    return missedIngredients;
  }


  public void setMissedIngredients(Set<SearchRecipesByIngredients200ResponseInnerMissedIngredientsInner> missedIngredients) {
    this.missedIngredients = missedIngredients;
  }


  public SearchRecipesByIngredients200ResponseInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public SearchRecipesByIngredients200ResponseInner unusedIngredients(List<Object> unusedIngredients) {
    
    this.unusedIngredients = unusedIngredients;
    return this;
  }

  public SearchRecipesByIngredients200ResponseInner addUnusedIngredientsItem(Object unusedIngredientsItem) {
    this.unusedIngredients.add(unusedIngredientsItem);
    return this;
  }

   /**
   * Get unusedIngredients
   * @return unusedIngredients
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Object> getUnusedIngredients() {
    return unusedIngredients;
  }


  public void setUnusedIngredients(List<Object> unusedIngredients) {
    this.unusedIngredients = unusedIngredients;
  }


  public SearchRecipesByIngredients200ResponseInner usedIngredientCount(BigDecimal usedIngredientCount) {
    
    this.usedIngredientCount = usedIngredientCount;
    return this;
  }

   /**
   * Get usedIngredientCount
   * @return usedIngredientCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getUsedIngredientCount() {
    return usedIngredientCount;
  }


  public void setUsedIngredientCount(BigDecimal usedIngredientCount) {
    this.usedIngredientCount = usedIngredientCount;
  }


  public SearchRecipesByIngredients200ResponseInner usedIngredients(Set<SearchRecipesByIngredients200ResponseInnerMissedIngredientsInner> usedIngredients) {
    
    this.usedIngredients = usedIngredients;
    return this;
  }

  public SearchRecipesByIngredients200ResponseInner addUsedIngredientsItem(SearchRecipesByIngredients200ResponseInnerMissedIngredientsInner usedIngredientsItem) {
    this.usedIngredients.add(usedIngredientsItem);
    return this;
  }

   /**
   * Get usedIngredients
   * @return usedIngredients
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Set<SearchRecipesByIngredients200ResponseInnerMissedIngredientsInner> getUsedIngredients() {
    return usedIngredients;
  }


  public void setUsedIngredients(Set<SearchRecipesByIngredients200ResponseInnerMissedIngredientsInner> usedIngredients) {
    this.usedIngredients = usedIngredients;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchRecipesByIngredients200ResponseInner searchRecipesByIngredients200ResponseInner = (SearchRecipesByIngredients200ResponseInner) o;
    return Objects.equals(this.id, searchRecipesByIngredients200ResponseInner.id) &&
        Objects.equals(this.image, searchRecipesByIngredients200ResponseInner.image) &&
        Objects.equals(this.imageType, searchRecipesByIngredients200ResponseInner.imageType) &&
        Objects.equals(this.likes, searchRecipesByIngredients200ResponseInner.likes) &&
        Objects.equals(this.missedIngredientCount, searchRecipesByIngredients200ResponseInner.missedIngredientCount) &&
        Objects.equals(this.missedIngredients, searchRecipesByIngredients200ResponseInner.missedIngredients) &&
        Objects.equals(this.title, searchRecipesByIngredients200ResponseInner.title) &&
        Objects.equals(this.unusedIngredients, searchRecipesByIngredients200ResponseInner.unusedIngredients) &&
        Objects.equals(this.usedIngredientCount, searchRecipesByIngredients200ResponseInner.usedIngredientCount) &&
        Objects.equals(this.usedIngredients, searchRecipesByIngredients200ResponseInner.usedIngredients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, image, imageType, likes, missedIngredientCount, missedIngredients, title, unusedIngredients, usedIngredientCount, usedIngredients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchRecipesByIngredients200ResponseInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    missedIngredientCount: ").append(toIndentedString(missedIngredientCount)).append("\n");
    sb.append("    missedIngredients: ").append(toIndentedString(missedIngredients)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    unusedIngredients: ").append(toIndentedString(unusedIngredients)).append("\n");
    sb.append("    usedIngredientCount: ").append(toIndentedString(usedIngredientCount)).append("\n");
    sb.append("    usedIngredients: ").append(toIndentedString(usedIngredients)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("image");
    openapiFields.add("imageType");
    openapiFields.add("likes");
    openapiFields.add("missedIngredientCount");
    openapiFields.add("missedIngredients");
    openapiFields.add("title");
    openapiFields.add("unusedIngredients");
    openapiFields.add("usedIngredientCount");
    openapiFields.add("usedIngredients");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("image");
    openapiRequiredFields.add("imageType");
    openapiRequiredFields.add("likes");
    openapiRequiredFields.add("missedIngredientCount");
    openapiRequiredFields.add("missedIngredients");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("unusedIngredients");
    openapiRequiredFields.add("usedIngredientCount");
    openapiRequiredFields.add("usedIngredients");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchRecipesByIngredients200ResponseInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SearchRecipesByIngredients200ResponseInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchRecipesByIngredients200ResponseInner is not found in the empty JSON string", SearchRecipesByIngredients200ResponseInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchRecipesByIngredients200ResponseInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchRecipesByIngredients200ResponseInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SearchRecipesByIngredients200ResponseInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("image") != null && !jsonObj.get("image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image").toString()));
      }
      if (jsonObj.get("imageType") != null && !jsonObj.get("imageType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageType").toString()));
      }
      JsonArray jsonArraymissedIngredients = jsonObj.getAsJsonArray("missedIngredients");
      if (jsonArraymissedIngredients != null) {
        // ensure the json data is an array
        if (!jsonObj.get("missedIngredients").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `missedIngredients` to be an array in the JSON string but got `%s`", jsonObj.get("missedIngredients").toString()));
        }

        // validate the optional field `missedIngredients` (array)
        for (int i = 0; i < jsonArraymissedIngredients.size(); i++) {
          SearchRecipesByIngredients200ResponseInnerMissedIngredientsInner.validateJsonObject(jsonArraymissedIngredients.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("unusedIngredients") != null && !jsonObj.get("unusedIngredients").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `unusedIngredients` to be an array in the JSON string but got `%s`", jsonObj.get("unusedIngredients").toString()));
      }
      JsonArray jsonArrayusedIngredients = jsonObj.getAsJsonArray("usedIngredients");
      if (jsonArrayusedIngredients != null) {
        // ensure the json data is an array
        if (!jsonObj.get("usedIngredients").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `usedIngredients` to be an array in the JSON string but got `%s`", jsonObj.get("usedIngredients").toString()));
        }

        // validate the optional field `usedIngredients` (array)
        for (int i = 0; i < jsonArrayusedIngredients.size(); i++) {
          SearchRecipesByIngredients200ResponseInnerMissedIngredientsInner.validateJsonObject(jsonArrayusedIngredients.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchRecipesByIngredients200ResponseInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchRecipesByIngredients200ResponseInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchRecipesByIngredients200ResponseInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchRecipesByIngredients200ResponseInner.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchRecipesByIngredients200ResponseInner>() {
           @Override
           public void write(JsonWriter out, SearchRecipesByIngredients200ResponseInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchRecipesByIngredients200ResponseInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchRecipesByIngredients200ResponseInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchRecipesByIngredients200ResponseInner
  * @throws IOException if the JSON string is invalid with respect to SearchRecipesByIngredients200ResponseInner
  */
  public static SearchRecipesByIngredients200ResponseInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchRecipesByIngredients200ResponseInner.class);
  }

 /**
  * Convert an instance of SearchRecipesByIngredients200ResponseInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

