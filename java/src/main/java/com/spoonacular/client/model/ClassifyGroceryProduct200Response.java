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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0-SNAPSHOT")
public class ClassifyGroceryProduct200Response {
  public static final String SERIALIZED_NAME_CLEAN_TITLE = "cleanTitle";
  @SerializedName(SERIALIZED_NAME_CLEAN_TITLE)
  private String cleanTitle;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_BREADCRUMBS = "breadcrumbs";
  @SerializedName(SERIALIZED_NAME_BREADCRUMBS)
  private List<String> breadcrumbs = new ArrayList<>();

  public static final String SERIALIZED_NAME_USDA_CODE = "usdaCode";
  @SerializedName(SERIALIZED_NAME_USDA_CODE)
  private Integer usdaCode;

  public ClassifyGroceryProduct200Response() {
  }

  public ClassifyGroceryProduct200Response cleanTitle(String cleanTitle) {
    this.cleanTitle = cleanTitle;
    return this;
  }

  /**
   * Get cleanTitle
   * @return cleanTitle
   */
  @javax.annotation.Nonnull
  public String getCleanTitle() {
    return cleanTitle;
  }

  public void setCleanTitle(String cleanTitle) {
    this.cleanTitle = cleanTitle;
  }


  public ClassifyGroceryProduct200Response image(String image) {
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


  public ClassifyGroceryProduct200Response category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
   */
  @javax.annotation.Nonnull
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  public ClassifyGroceryProduct200Response breadcrumbs(List<String> breadcrumbs) {
    this.breadcrumbs = breadcrumbs;
    return this;
  }

  public ClassifyGroceryProduct200Response addBreadcrumbsItem(String breadcrumbsItem) {
    if (this.breadcrumbs == null) {
      this.breadcrumbs = new ArrayList<>();
    }
    this.breadcrumbs.add(breadcrumbsItem);
    return this;
  }

  /**
   * Get breadcrumbs
   * @return breadcrumbs
   */
  @javax.annotation.Nonnull
  public List<String> getBreadcrumbs() {
    return breadcrumbs;
  }

  public void setBreadcrumbs(List<String> breadcrumbs) {
    this.breadcrumbs = breadcrumbs;
  }


  public ClassifyGroceryProduct200Response usdaCode(Integer usdaCode) {
    this.usdaCode = usdaCode;
    return this;
  }

  /**
   * Get usdaCode
   * @return usdaCode
   */
  @javax.annotation.Nonnull
  public Integer getUsdaCode() {
    return usdaCode;
  }

  public void setUsdaCode(Integer usdaCode) {
    this.usdaCode = usdaCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassifyGroceryProduct200Response classifyGroceryProduct200Response = (ClassifyGroceryProduct200Response) o;
    return Objects.equals(this.cleanTitle, classifyGroceryProduct200Response.cleanTitle) &&
        Objects.equals(this.image, classifyGroceryProduct200Response.image) &&
        Objects.equals(this.category, classifyGroceryProduct200Response.category) &&
        Objects.equals(this.breadcrumbs, classifyGroceryProduct200Response.breadcrumbs) &&
        Objects.equals(this.usdaCode, classifyGroceryProduct200Response.usdaCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanTitle, image, category, breadcrumbs, usdaCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassifyGroceryProduct200Response {\n");
    sb.append("    cleanTitle: ").append(toIndentedString(cleanTitle)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    breadcrumbs: ").append(toIndentedString(breadcrumbs)).append("\n");
    sb.append("    usdaCode: ").append(toIndentedString(usdaCode)).append("\n");
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
    openapiFields.add("cleanTitle");
    openapiFields.add("image");
    openapiFields.add("category");
    openapiFields.add("breadcrumbs");
    openapiFields.add("usdaCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cleanTitle");
    openapiRequiredFields.add("image");
    openapiRequiredFields.add("category");
    openapiRequiredFields.add("breadcrumbs");
    openapiRequiredFields.add("usdaCode");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ClassifyGroceryProduct200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ClassifyGroceryProduct200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClassifyGroceryProduct200Response is not found in the empty JSON string", ClassifyGroceryProduct200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ClassifyGroceryProduct200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ClassifyGroceryProduct200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ClassifyGroceryProduct200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("cleanTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cleanTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cleanTitle").toString()));
      }
      if (!jsonObj.get("image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image").toString()));
      }
      if (!jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("breadcrumbs") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("breadcrumbs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `breadcrumbs` to be an array in the JSON string but got `%s`", jsonObj.get("breadcrumbs").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClassifyGroceryProduct200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClassifyGroceryProduct200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClassifyGroceryProduct200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClassifyGroceryProduct200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ClassifyGroceryProduct200Response>() {
           @Override
           public void write(JsonWriter out, ClassifyGroceryProduct200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClassifyGroceryProduct200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ClassifyGroceryProduct200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ClassifyGroceryProduct200Response
   * @throws IOException if the JSON string is invalid with respect to ClassifyGroceryProduct200Response
   */
  public static ClassifyGroceryProduct200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClassifyGroceryProduct200Response.class);
  }

  /**
   * Convert an instance of ClassifyGroceryProduct200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

