/*
 * spoonacular API
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.spoonacular.client.model.GetProductInformation200ResponseIngredientsInner;
import com.spoonacular.client.model.SearchGroceryProductsByUPC200ResponseNutrition;
import com.spoonacular.client.model.SearchGroceryProductsByUPC200ResponseServings;
import java.io.IOException;
import java.math.BigDecimal;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetProductInformation200Response {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_BREADCRUMBS = "breadcrumbs";
  @SerializedName(SERIALIZED_NAME_BREADCRUMBS)
  private List<String> breadcrumbs = new ArrayList<>();

  public static final String SERIALIZED_NAME_IMAGE_TYPE = "imageType";
  @SerializedName(SERIALIZED_NAME_IMAGE_TYPE)
  private String imageType;

  public static final String SERIALIZED_NAME_BADGES = "badges";
  @SerializedName(SERIALIZED_NAME_BADGES)
  private List<String> badges = new ArrayList<>();

  public static final String SERIALIZED_NAME_IMPORTANT_BADGES = "importantBadges";
  @SerializedName(SERIALIZED_NAME_IMPORTANT_BADGES)
  private List<String> importantBadges = new ArrayList<>();

  public static final String SERIALIZED_NAME_INGREDIENT_COUNT = "ingredientCount";
  @SerializedName(SERIALIZED_NAME_INGREDIENT_COUNT)
  private Integer ingredientCount;

  public static final String SERIALIZED_NAME_GENERATED_TEXT = "generatedText";
  @SerializedName(SERIALIZED_NAME_GENERATED_TEXT)
  private String generatedText;

  public static final String SERIALIZED_NAME_INGREDIENT_LIST = "ingredientList";
  @SerializedName(SERIALIZED_NAME_INGREDIENT_LIST)
  private String ingredientList;

  public static final String SERIALIZED_NAME_INGREDIENTS = "ingredients";
  @SerializedName(SERIALIZED_NAME_INGREDIENTS)
  private List<GetProductInformation200ResponseIngredientsInner> ingredients = new ArrayList<>();

  public static final String SERIALIZED_NAME_LIKES = "likes";
  @SerializedName(SERIALIZED_NAME_LIKES)
  private BigDecimal likes;

  public static final String SERIALIZED_NAME_AISLE = "aisle";
  @SerializedName(SERIALIZED_NAME_AISLE)
  private String aisle;

  public static final String SERIALIZED_NAME_NUTRITION = "nutrition";
  @SerializedName(SERIALIZED_NAME_NUTRITION)
  private SearchGroceryProductsByUPC200ResponseNutrition nutrition;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_SERVINGS = "servings";
  @SerializedName(SERIALIZED_NAME_SERVINGS)
  private SearchGroceryProductsByUPC200ResponseServings servings;

  public static final String SERIALIZED_NAME_SPOONACULAR_SCORE = "spoonacularScore";
  @SerializedName(SERIALIZED_NAME_SPOONACULAR_SCORE)
  private BigDecimal spoonacularScore;

  public GetProductInformation200Response() {
  }

  public GetProductInformation200Response id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public GetProductInformation200Response title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public GetProductInformation200Response breadcrumbs(List<String> breadcrumbs) {
    this.breadcrumbs = breadcrumbs;
    return this;
  }

  public GetProductInformation200Response addBreadcrumbsItem(String breadcrumbsItem) {
    if (this.breadcrumbs == null) {
      this.breadcrumbs = new ArrayList<>();
    }
    this.breadcrumbs.add(breadcrumbsItem);
    return this;
  }

   /**
   * Get breadcrumbs
   * @return breadcrumbs
  **/
  @javax.annotation.Nonnull
  public List<String> getBreadcrumbs() {
    return breadcrumbs;
  }

  public void setBreadcrumbs(List<String> breadcrumbs) {
    this.breadcrumbs = breadcrumbs;
  }


  public GetProductInformation200Response imageType(String imageType) {
    this.imageType = imageType;
    return this;
  }

   /**
   * Get imageType
   * @return imageType
  **/
  @javax.annotation.Nonnull
  public String getImageType() {
    return imageType;
  }

  public void setImageType(String imageType) {
    this.imageType = imageType;
  }


  public GetProductInformation200Response badges(List<String> badges) {
    this.badges = badges;
    return this;
  }

  public GetProductInformation200Response addBadgesItem(String badgesItem) {
    if (this.badges == null) {
      this.badges = new ArrayList<>();
    }
    this.badges.add(badgesItem);
    return this;
  }

   /**
   * Get badges
   * @return badges
  **/
  @javax.annotation.Nonnull
  public List<String> getBadges() {
    return badges;
  }

  public void setBadges(List<String> badges) {
    this.badges = badges;
  }


  public GetProductInformation200Response importantBadges(List<String> importantBadges) {
    this.importantBadges = importantBadges;
    return this;
  }

  public GetProductInformation200Response addImportantBadgesItem(String importantBadgesItem) {
    if (this.importantBadges == null) {
      this.importantBadges = new ArrayList<>();
    }
    this.importantBadges.add(importantBadgesItem);
    return this;
  }

   /**
   * Get importantBadges
   * @return importantBadges
  **/
  @javax.annotation.Nonnull
  public List<String> getImportantBadges() {
    return importantBadges;
  }

  public void setImportantBadges(List<String> importantBadges) {
    this.importantBadges = importantBadges;
  }


  public GetProductInformation200Response ingredientCount(Integer ingredientCount) {
    this.ingredientCount = ingredientCount;
    return this;
  }

   /**
   * Get ingredientCount
   * @return ingredientCount
  **/
  @javax.annotation.Nonnull
  public Integer getIngredientCount() {
    return ingredientCount;
  }

  public void setIngredientCount(Integer ingredientCount) {
    this.ingredientCount = ingredientCount;
  }


  public GetProductInformation200Response generatedText(String generatedText) {
    this.generatedText = generatedText;
    return this;
  }

   /**
   * Get generatedText
   * @return generatedText
  **/
  @javax.annotation.Nullable
  public String getGeneratedText() {
    return generatedText;
  }

  public void setGeneratedText(String generatedText) {
    this.generatedText = generatedText;
  }


  public GetProductInformation200Response ingredientList(String ingredientList) {
    this.ingredientList = ingredientList;
    return this;
  }

   /**
   * Get ingredientList
   * @return ingredientList
  **/
  @javax.annotation.Nonnull
  public String getIngredientList() {
    return ingredientList;
  }

  public void setIngredientList(String ingredientList) {
    this.ingredientList = ingredientList;
  }


  public GetProductInformation200Response ingredients(List<GetProductInformation200ResponseIngredientsInner> ingredients) {
    this.ingredients = ingredients;
    return this;
  }

  public GetProductInformation200Response addIngredientsItem(GetProductInformation200ResponseIngredientsInner ingredientsItem) {
    if (this.ingredients == null) {
      this.ingredients = new ArrayList<>();
    }
    this.ingredients.add(ingredientsItem);
    return this;
  }

   /**
   * Get ingredients
   * @return ingredients
  **/
  @javax.annotation.Nonnull
  public List<GetProductInformation200ResponseIngredientsInner> getIngredients() {
    return ingredients;
  }

  public void setIngredients(List<GetProductInformation200ResponseIngredientsInner> ingredients) {
    this.ingredients = ingredients;
  }


  public GetProductInformation200Response likes(BigDecimal likes) {
    this.likes = likes;
    return this;
  }

   /**
   * Get likes
   * @return likes
  **/
  @javax.annotation.Nonnull
  public BigDecimal getLikes() {
    return likes;
  }

  public void setLikes(BigDecimal likes) {
    this.likes = likes;
  }


  public GetProductInformation200Response aisle(String aisle) {
    this.aisle = aisle;
    return this;
  }

   /**
   * Get aisle
   * @return aisle
  **/
  @javax.annotation.Nonnull
  public String getAisle() {
    return aisle;
  }

  public void setAisle(String aisle) {
    this.aisle = aisle;
  }


  public GetProductInformation200Response nutrition(SearchGroceryProductsByUPC200ResponseNutrition nutrition) {
    this.nutrition = nutrition;
    return this;
  }

   /**
   * Get nutrition
   * @return nutrition
  **/
  @javax.annotation.Nonnull
  public SearchGroceryProductsByUPC200ResponseNutrition getNutrition() {
    return nutrition;
  }

  public void setNutrition(SearchGroceryProductsByUPC200ResponseNutrition nutrition) {
    this.nutrition = nutrition;
  }


  public GetProductInformation200Response price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nonnull
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public GetProductInformation200Response servings(SearchGroceryProductsByUPC200ResponseServings servings) {
    this.servings = servings;
    return this;
  }

   /**
   * Get servings
   * @return servings
  **/
  @javax.annotation.Nonnull
  public SearchGroceryProductsByUPC200ResponseServings getServings() {
    return servings;
  }

  public void setServings(SearchGroceryProductsByUPC200ResponseServings servings) {
    this.servings = servings;
  }


  public GetProductInformation200Response spoonacularScore(BigDecimal spoonacularScore) {
    this.spoonacularScore = spoonacularScore;
    return this;
  }

   /**
   * Get spoonacularScore
   * @return spoonacularScore
  **/
  @javax.annotation.Nonnull
  public BigDecimal getSpoonacularScore() {
    return spoonacularScore;
  }

  public void setSpoonacularScore(BigDecimal spoonacularScore) {
    this.spoonacularScore = spoonacularScore;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProductInformation200Response getProductInformation200Response = (GetProductInformation200Response) o;
    return Objects.equals(this.id, getProductInformation200Response.id) &&
        Objects.equals(this.title, getProductInformation200Response.title) &&
        Objects.equals(this.breadcrumbs, getProductInformation200Response.breadcrumbs) &&
        Objects.equals(this.imageType, getProductInformation200Response.imageType) &&
        Objects.equals(this.badges, getProductInformation200Response.badges) &&
        Objects.equals(this.importantBadges, getProductInformation200Response.importantBadges) &&
        Objects.equals(this.ingredientCount, getProductInformation200Response.ingredientCount) &&
        Objects.equals(this.generatedText, getProductInformation200Response.generatedText) &&
        Objects.equals(this.ingredientList, getProductInformation200Response.ingredientList) &&
        Objects.equals(this.ingredients, getProductInformation200Response.ingredients) &&
        Objects.equals(this.likes, getProductInformation200Response.likes) &&
        Objects.equals(this.aisle, getProductInformation200Response.aisle) &&
        Objects.equals(this.nutrition, getProductInformation200Response.nutrition) &&
        Objects.equals(this.price, getProductInformation200Response.price) &&
        Objects.equals(this.servings, getProductInformation200Response.servings) &&
        Objects.equals(this.spoonacularScore, getProductInformation200Response.spoonacularScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, breadcrumbs, imageType, badges, importantBadges, ingredientCount, generatedText, ingredientList, ingredients, likes, aisle, nutrition, price, servings, spoonacularScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProductInformation200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    breadcrumbs: ").append(toIndentedString(breadcrumbs)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    badges: ").append(toIndentedString(badges)).append("\n");
    sb.append("    importantBadges: ").append(toIndentedString(importantBadges)).append("\n");
    sb.append("    ingredientCount: ").append(toIndentedString(ingredientCount)).append("\n");
    sb.append("    generatedText: ").append(toIndentedString(generatedText)).append("\n");
    sb.append("    ingredientList: ").append(toIndentedString(ingredientList)).append("\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    aisle: ").append(toIndentedString(aisle)).append("\n");
    sb.append("    nutrition: ").append(toIndentedString(nutrition)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    servings: ").append(toIndentedString(servings)).append("\n");
    sb.append("    spoonacularScore: ").append(toIndentedString(spoonacularScore)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("breadcrumbs");
    openapiFields.add("imageType");
    openapiFields.add("badges");
    openapiFields.add("importantBadges");
    openapiFields.add("ingredientCount");
    openapiFields.add("generatedText");
    openapiFields.add("ingredientList");
    openapiFields.add("ingredients");
    openapiFields.add("likes");
    openapiFields.add("aisle");
    openapiFields.add("nutrition");
    openapiFields.add("price");
    openapiFields.add("servings");
    openapiFields.add("spoonacularScore");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("breadcrumbs");
    openapiRequiredFields.add("imageType");
    openapiRequiredFields.add("badges");
    openapiRequiredFields.add("importantBadges");
    openapiRequiredFields.add("ingredientCount");
    openapiRequiredFields.add("ingredientList");
    openapiRequiredFields.add("ingredients");
    openapiRequiredFields.add("likes");
    openapiRequiredFields.add("aisle");
    openapiRequiredFields.add("nutrition");
    openapiRequiredFields.add("price");
    openapiRequiredFields.add("servings");
    openapiRequiredFields.add("spoonacularScore");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetProductInformation200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetProductInformation200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetProductInformation200Response is not found in the empty JSON string", GetProductInformation200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetProductInformation200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetProductInformation200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetProductInformation200Response.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("breadcrumbs") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("breadcrumbs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `breadcrumbs` to be an array in the JSON string but got `%s`", jsonObj.get("breadcrumbs").toString()));
      }
      if (!jsonObj.get("imageType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageType").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("badges") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("badges").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `badges` to be an array in the JSON string but got `%s`", jsonObj.get("badges").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("importantBadges") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("importantBadges").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `importantBadges` to be an array in the JSON string but got `%s`", jsonObj.get("importantBadges").toString()));
      }
      if ((jsonObj.get("generatedText") != null && !jsonObj.get("generatedText").isJsonNull()) && !jsonObj.get("generatedText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `generatedText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("generatedText").toString()));
      }
      if (!jsonObj.get("ingredientList").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingredientList` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingredientList").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("ingredients").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingredients` to be an array in the JSON string but got `%s`", jsonObj.get("ingredients").toString()));
      }

      JsonArray jsonArrayingredients = jsonObj.getAsJsonArray("ingredients");
      // validate the required field `ingredients` (array)
      for (int i = 0; i < jsonArrayingredients.size(); i++) {
        GetProductInformation200ResponseIngredientsInner.validateJsonElement(jsonArrayingredients.get(i));
      };
      if (!jsonObj.get("aisle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aisle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aisle").toString()));
      }
      // validate the required field `nutrition`
      SearchGroceryProductsByUPC200ResponseNutrition.validateJsonElement(jsonObj.get("nutrition"));
      // validate the required field `servings`
      SearchGroceryProductsByUPC200ResponseServings.validateJsonElement(jsonObj.get("servings"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetProductInformation200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetProductInformation200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetProductInformation200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetProductInformation200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetProductInformation200Response>() {
           @Override
           public void write(JsonWriter out, GetProductInformation200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetProductInformation200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetProductInformation200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetProductInformation200Response
  * @throws IOException if the JSON string is invalid with respect to GetProductInformation200Response
  */
  public static GetProductInformation200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetProductInformation200Response.class);
  }

 /**
  * Convert an instance of GetProductInformation200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

