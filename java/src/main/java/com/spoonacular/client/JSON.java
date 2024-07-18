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


package com.spoonacular.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    static {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.AddMealPlanTemplate200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.AddMealPlanTemplate200ResponseItemsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.AddMealPlanTemplate200ResponseItemsInnerValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.AddToMealPlanRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.AddToMealPlanRequestValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.AddToMealPlanRequestValueIngredientsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.AddToShoppingListRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.AnalyzeARecipeSearchQuery200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.AnalyzeARecipeSearchQuery200ResponseDishesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.AnalyzeARecipeSearchQuery200ResponseIngredientsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.AnalyzeRecipeInstructions200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.AnalyzeRecipeInstructions200ResponseIngredientsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.AnalyzeRecipeInstructions200ResponseParsedInstructionsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.AnalyzeRecipeInstructions200ResponseParsedInstructionsInnerStepsInnerIngredientsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.AnalyzeRecipeRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.AutocompleteIngredientSearch200ResponseInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.AutocompleteProductSearch200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.AutocompleteProductSearch200ResponseResultsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.AutocompleteRecipeSearch200ResponseInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.ClassifyCuisine200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.ClassifyGroceryProduct200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.ClassifyGroceryProductBulk200ResponseInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.ClassifyGroceryProductBulkRequestInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.ClassifyGroceryProductRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.ComparableProduct.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.ComputeGlycemicLoad200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.ComputeGlycemicLoad200ResponseIngredientsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.ComputeGlycemicLoadRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.ComputeIngredientAmount200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.ConnectUser200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.ConnectUserRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.ConvertAmounts200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.CreateRecipeCard200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.DetectFoodInText200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.DetectFoodInText200ResponseAnnotationsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GenerateMealPlan200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GenerateMealPlan200ResponseNutrients.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetARandomFoodJoke200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetAnalyzedRecipeInstructions200ResponseInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetAnalyzedRecipeInstructions200ResponseInnerStepsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetAnalyzedRecipeInstructions200ResponseInnerStepsInnerIngredientsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetComparableProducts200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetComparableProducts200ResponseComparableProducts.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetConversationSuggests200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetConversationSuggests200ResponseSuggests.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetConversationSuggests200ResponseSuggestsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetDishPairingForWine200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetIngredientSubstitutes200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetMealPlanTemplate200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetMealPlanTemplate200ResponseDaysInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetMealPlanTemplate200ResponseDaysInnerItemsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetMealPlanTemplate200ResponseDaysInnerItemsInnerValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetMealPlanTemplates200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetMealPlanTemplates200ResponseTemplatesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetMealPlanWeek200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetMealPlanWeek200ResponseDaysInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetMealPlanWeek200ResponseDaysInnerItemsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetMealPlanWeek200ResponseDaysInnerItemsInnerValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetMealPlanWeek200ResponseDaysInnerNutritionSummary.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetMealPlanWeek200ResponseDaysInnerNutritionSummaryNutrientsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetRandomRecipes200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetRecipeEquipmentByID200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetRecipeEquipmentByID200ResponseEquipmentInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetRecipeIngredientsByID200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetRecipeIngredientsByID200ResponseIngredientsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetRecipeNutritionWidgetByID200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetRecipeNutritionWidgetByID200ResponseBadInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetRecipeNutritionWidgetByID200ResponseGoodInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetRecipePriceBreakdownByID200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetRecipePriceBreakdownByID200ResponseIngredientsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetRecipePriceBreakdownByID200ResponseIngredientsInnerAmount.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetRecipePriceBreakdownByID200ResponseIngredientsInnerAmountMetric.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetShoppingList200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetShoppingList200ResponseAislesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetShoppingList200ResponseAislesInnerItemsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetShoppingList200ResponseAislesInnerItemsInnerMeasures.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetShoppingList200ResponseAislesInnerItemsInnerMeasuresOriginal.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetSimilarRecipes200ResponseInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetWineDescription200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetWinePairing200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetWinePairing200ResponseProductMatchesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetWineRecommendation200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GetWineRecommendation200ResponseRecommendedWinesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GuessNutritionByDishName200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GuessNutritionByDishName200ResponseCalories.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.GuessNutritionByDishName200ResponseCaloriesConfidenceRange95Percent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.ImageAnalysisByURL200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.ImageAnalysisByURL200ResponseCategory.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.ImageAnalysisByURL200ResponseNutrition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.ImageAnalysisByURL200ResponseNutritionCalories.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.ImageAnalysisByURL200ResponseNutritionCaloriesConfidenceRange95Percent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.ImageAnalysisByURL200ResponseRecipesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.ImageClassificationByURL200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.IngredientBasics.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.IngredientInformation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.IngredientInformationEstimatedCost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.IngredientInformationNutrition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.IngredientInformationNutritionPropertiesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.IngredientSearch200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.IngredientSearch200ResponseResultsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.MapIngredientsToGroceryProducts200ResponseInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.MapIngredientsToGroceryProducts200ResponseInnerProductsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.MapIngredientsToGroceryProductsRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.MenuItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.MenuItemServings.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.ProductInformation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.ProductInformationCredits.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.QuickAnswer200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.RecipeInformation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.RecipeInformationExtendedIngredientsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.RecipeInformationExtendedIngredientsInnerMeasures.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.RecipeInformationExtendedIngredientsInnerMeasuresMetric.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.RecipeInformationWinePairing.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.RecipeInformationWinePairingProductMatchesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SearchAllFood200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SearchAllFood200ResponseSearchResultsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SearchCustomFoods200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SearchCustomFoods200ResponseCustomFoodsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SearchFoodVideos200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SearchFoodVideos200ResponseVideosInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SearchGroceryProducts200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SearchGroceryProductsByUPC200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SearchGroceryProductsByUPC200ResponseNutrition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SearchGroceryProductsByUPC200ResponseNutritionCaloricBreakdown.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SearchGroceryProductsByUPC200ResponseNutritionNutrientsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SearchGroceryProductsByUPC200ResponseServings.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SearchMenuItems200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SearchRecipes200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SearchRecipes200ResponseResultsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SearchRecipesByIngredients200ResponseInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SearchRecipesByIngredients200ResponseInnerMissedIngredientsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SearchRecipesByNutrients200ResponseInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SearchRestaurants200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SearchRestaurants200ResponseRestaurantsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SearchRestaurants200ResponseRestaurantsInnerAddress.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SearchRestaurants200ResponseRestaurantsInnerLocalHours.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SearchResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SearchResultDataPointsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SearchSiteContent200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.SummarizeRecipe200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.TalkToChatbot200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.TalkToChatbot200ResponseMediaInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.spoonacular.client.model.TasteInformation.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
