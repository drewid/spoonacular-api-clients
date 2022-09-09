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
import com.spoonacular.client.model.GetComparableProducts200ResponseComparableProducts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-09T18:25:28.115+02:00[Europe/Berlin]")
public class GetComparableProducts200Response {
  public static final String SERIALIZED_NAME_COMPARABLE_PRODUCTS = "comparableProducts";
  @SerializedName(SERIALIZED_NAME_COMPARABLE_PRODUCTS)
  private GetComparableProducts200ResponseComparableProducts comparableProducts;

  public GetComparableProducts200Response() { 
  }

  public GetComparableProducts200Response comparableProducts(GetComparableProducts200ResponseComparableProducts comparableProducts) {
    
    this.comparableProducts = comparableProducts;
    return this;
  }

   /**
   * Get comparableProducts
   * @return comparableProducts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GetComparableProducts200ResponseComparableProducts getComparableProducts() {
    return comparableProducts;
  }


  public void setComparableProducts(GetComparableProducts200ResponseComparableProducts comparableProducts) {
    this.comparableProducts = comparableProducts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetComparableProducts200Response getComparableProducts200Response = (GetComparableProducts200Response) o;
    return Objects.equals(this.comparableProducts, getComparableProducts200Response.comparableProducts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparableProducts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetComparableProducts200Response {\n");
    sb.append("    comparableProducts: ").append(toIndentedString(comparableProducts)).append("\n");
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
    openapiFields.add("comparableProducts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("comparableProducts");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetComparableProducts200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetComparableProducts200Response.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetComparableProducts200Response is not found in the empty JSON string", GetComparableProducts200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetComparableProducts200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetComparableProducts200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetComparableProducts200Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `comparableProducts`
      if (jsonObj.getAsJsonObject("comparableProducts") != null) {
        GetComparableProducts200ResponseComparableProducts.validateJsonObject(jsonObj.getAsJsonObject("comparableProducts"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetComparableProducts200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetComparableProducts200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetComparableProducts200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetComparableProducts200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetComparableProducts200Response>() {
           @Override
           public void write(JsonWriter out, GetComparableProducts200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetComparableProducts200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetComparableProducts200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetComparableProducts200Response
  * @throws IOException if the JSON string is invalid with respect to GetComparableProducts200Response
  */
  public static GetComparableProducts200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetComparableProducts200Response.class);
  }

 /**
  * Convert an instance of GetComparableProducts200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

