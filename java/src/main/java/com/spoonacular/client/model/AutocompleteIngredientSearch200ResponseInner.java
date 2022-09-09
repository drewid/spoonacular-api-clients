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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.spoonacular.client.JSON;

/**
 * AutocompleteIngredientSearch200ResponseInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-09T18:25:28.115+02:00[Europe/Berlin]")
public class AutocompleteIngredientSearch200ResponseInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_AISLE = "aisle";
  @SerializedName(SERIALIZED_NAME_AISLE)
  private String aisle;

  public static final String SERIALIZED_NAME_POSSIBLE_UNITS = "possibleUnits";
  @SerializedName(SERIALIZED_NAME_POSSIBLE_UNITS)
  private List<String> possibleUnits = null;

  public AutocompleteIngredientSearch200ResponseInner() { 
  }

  public AutocompleteIngredientSearch200ResponseInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AutocompleteIngredientSearch200ResponseInner image(String image) {
    
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


  public AutocompleteIngredientSearch200ResponseInner id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public AutocompleteIngredientSearch200ResponseInner aisle(String aisle) {
    
    this.aisle = aisle;
    return this;
  }

   /**
   * Get aisle
   * @return aisle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAisle() {
    return aisle;
  }


  public void setAisle(String aisle) {
    this.aisle = aisle;
  }


  public AutocompleteIngredientSearch200ResponseInner possibleUnits(List<String> possibleUnits) {
    
    this.possibleUnits = possibleUnits;
    return this;
  }

  public AutocompleteIngredientSearch200ResponseInner addPossibleUnitsItem(String possibleUnitsItem) {
    if (this.possibleUnits == null) {
      this.possibleUnits = new ArrayList<>();
    }
    this.possibleUnits.add(possibleUnitsItem);
    return this;
  }

   /**
   * Get possibleUnits
   * @return possibleUnits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPossibleUnits() {
    return possibleUnits;
  }


  public void setPossibleUnits(List<String> possibleUnits) {
    this.possibleUnits = possibleUnits;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutocompleteIngredientSearch200ResponseInner autocompleteIngredientSearch200ResponseInner = (AutocompleteIngredientSearch200ResponseInner) o;
    return Objects.equals(this.name, autocompleteIngredientSearch200ResponseInner.name) &&
        Objects.equals(this.image, autocompleteIngredientSearch200ResponseInner.image) &&
        Objects.equals(this.id, autocompleteIngredientSearch200ResponseInner.id) &&
        Objects.equals(this.aisle, autocompleteIngredientSearch200ResponseInner.aisle) &&
        Objects.equals(this.possibleUnits, autocompleteIngredientSearch200ResponseInner.possibleUnits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, image, id, aisle, possibleUnits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutocompleteIngredientSearch200ResponseInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    aisle: ").append(toIndentedString(aisle)).append("\n");
    sb.append("    possibleUnits: ").append(toIndentedString(possibleUnits)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("image");
    openapiFields.add("id");
    openapiFields.add("aisle");
    openapiFields.add("possibleUnits");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("image");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AutocompleteIngredientSearch200ResponseInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AutocompleteIngredientSearch200ResponseInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutocompleteIngredientSearch200ResponseInner is not found in the empty JSON string", AutocompleteIngredientSearch200ResponseInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AutocompleteIngredientSearch200ResponseInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AutocompleteIngredientSearch200ResponseInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AutocompleteIngredientSearch200ResponseInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("image") != null && !jsonObj.get("image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image").toString()));
      }
      if (jsonObj.get("aisle") != null && !jsonObj.get("aisle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aisle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aisle").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("possibleUnits") != null && !jsonObj.get("possibleUnits").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `possibleUnits` to be an array in the JSON string but got `%s`", jsonObj.get("possibleUnits").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutocompleteIngredientSearch200ResponseInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutocompleteIngredientSearch200ResponseInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutocompleteIngredientSearch200ResponseInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutocompleteIngredientSearch200ResponseInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AutocompleteIngredientSearch200ResponseInner>() {
           @Override
           public void write(JsonWriter out, AutocompleteIngredientSearch200ResponseInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AutocompleteIngredientSearch200ResponseInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AutocompleteIngredientSearch200ResponseInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AutocompleteIngredientSearch200ResponseInner
  * @throws IOException if the JSON string is invalid with respect to AutocompleteIngredientSearch200ResponseInner
  */
  public static AutocompleteIngredientSearch200ResponseInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutocompleteIngredientSearch200ResponseInner.class);
  }

 /**
  * Convert an instance of AutocompleteIngredientSearch200ResponseInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

