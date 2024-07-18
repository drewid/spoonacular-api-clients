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
import com.spoonacular.client.model.SearchRestaurants200ResponseRestaurantsInner;
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
 * SearchRestaurants200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0-SNAPSHOT")
public class SearchRestaurants200Response {
  public static final String SERIALIZED_NAME_RESTAURANTS = "restaurants";
  @SerializedName(SERIALIZED_NAME_RESTAURANTS)
  private List<SearchRestaurants200ResponseRestaurantsInner> restaurants = new ArrayList<>();

  public SearchRestaurants200Response() {
  }

  public SearchRestaurants200Response restaurants(List<SearchRestaurants200ResponseRestaurantsInner> restaurants) {
    this.restaurants = restaurants;
    return this;
  }

  public SearchRestaurants200Response addRestaurantsItem(SearchRestaurants200ResponseRestaurantsInner restaurantsItem) {
    if (this.restaurants == null) {
      this.restaurants = new ArrayList<>();
    }
    this.restaurants.add(restaurantsItem);
    return this;
  }

  /**
   * Get restaurants
   * @return restaurants
   */
  @javax.annotation.Nullable
  public List<SearchRestaurants200ResponseRestaurantsInner> getRestaurants() {
    return restaurants;
  }

  public void setRestaurants(List<SearchRestaurants200ResponseRestaurantsInner> restaurants) {
    this.restaurants = restaurants;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchRestaurants200Response searchRestaurants200Response = (SearchRestaurants200Response) o;
    return Objects.equals(this.restaurants, searchRestaurants200Response.restaurants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restaurants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchRestaurants200Response {\n");
    sb.append("    restaurants: ").append(toIndentedString(restaurants)).append("\n");
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
    openapiFields.add("restaurants");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SearchRestaurants200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchRestaurants200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchRestaurants200Response is not found in the empty JSON string", SearchRestaurants200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchRestaurants200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchRestaurants200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("restaurants") != null && !jsonObj.get("restaurants").isJsonNull()) {
        JsonArray jsonArrayrestaurants = jsonObj.getAsJsonArray("restaurants");
        if (jsonArrayrestaurants != null) {
          // ensure the json data is an array
          if (!jsonObj.get("restaurants").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `restaurants` to be an array in the JSON string but got `%s`", jsonObj.get("restaurants").toString()));
          }

          // validate the optional field `restaurants` (array)
          for (int i = 0; i < jsonArrayrestaurants.size(); i++) {
            SearchRestaurants200ResponseRestaurantsInner.validateJsonElement(jsonArrayrestaurants.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchRestaurants200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchRestaurants200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchRestaurants200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchRestaurants200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchRestaurants200Response>() {
           @Override
           public void write(JsonWriter out, SearchRestaurants200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchRestaurants200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SearchRestaurants200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SearchRestaurants200Response
   * @throws IOException if the JSON string is invalid with respect to SearchRestaurants200Response
   */
  public static SearchRestaurants200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchRestaurants200Response.class);
  }

  /**
   * Convert an instance of SearchRestaurants200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

