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


package com.spoonacular;

import com.spoonacular.client.ApiException;
import java.math.BigDecimal;
import com.spoonacular.client.model.InlineResponse20029;
import com.spoonacular.client.model.InlineResponse20048;
import com.spoonacular.client.model.InlineResponse20049;
import com.spoonacular.client.model.InlineResponse20051;
import com.spoonacular.client.model.InlineResponse20052;
import com.spoonacular.client.model.InlineResponse20053;
import com.spoonacular.client.model.InlineResponse20054;
import com.spoonacular.client.model.InlineResponse20055;
import com.spoonacular.client.model.InlineResponse20056;
import com.spoonacular.client.model.InlineResponse20057;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MiscApi
 */
@Ignore
public class MiscApiTest {

    private final MiscApi api = new MiscApi();

    
    /**
     * Detect Food in Text
     *
     * Take any text and find all mentions of food contained within it. This task is also called Named Entity Recognition (NER). In this case, the entities are foods. Either dishes, such as pizza or cheeseburger, or ingredients, such as cucumber or almonds.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void detectFoodInTextTest() throws ApiException {
        String contentType = null;
        InlineResponse20051 response = api.detectFoodInText(contentType);

        // TODO: test validations
    }
    
    /**
     * Random Food Joke
     *
     * Get a random joke that is related to food. Caution: this is an endpoint for adults!
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getARandomFoodJokeTest() throws ApiException {
        InlineResponse20055 response = api.getARandomFoodJoke();

        // TODO: test validations
    }
    
    /**
     * Conversation Suggests
     *
     * This endpoint returns suggestions for things the user can say or ask the chatbot.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConversationSuggestsTest() throws ApiException {
        String query = null;
        BigDecimal number = null;
        InlineResponse20057 response = api.getConversationSuggests(query, number);

        // TODO: test validations
    }
    
    /**
     * Random Food Trivia
     *
     * Returns random food trivia.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRandomFoodTriviaTest() throws ApiException {
        InlineResponse20055 response = api.getRandomFoodTrivia();

        // TODO: test validations
    }
    
    /**
     * Image Analysis by URL
     *
     * Analyze a food image. The API tries to classify the image, guess the nutrition, and find a matching recipes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageAnalysisByURLTest() throws ApiException {
        String imageUrl = null;
        InlineResponse20049 response = api.imageAnalysisByURL(imageUrl);

        // TODO: test validations
    }
    
    /**
     * Image Classification by URL
     *
     * Classify a food image.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imageClassificationByURLTest() throws ApiException {
        String imageUrl = null;
        InlineResponse20048 response = api.imageClassificationByURL(imageUrl);

        // TODO: test validations
    }
    
    /**
     * Search All Food
     *
     * Search all food content with one call. That includes recipes, grocery products, menu items, simple foods (ingredients), and food videos.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchAllFoodTest() throws ApiException {
        String query = null;
        Integer offset = null;
        Integer number = null;
        InlineResponse20053 response = api.searchAllFood(query, offset, number);

        // TODO: test validations
    }
    
    /**
     * Search Custom Foods
     *
     * Search custom foods in a user&#39;s account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchCustomFoodsTest() throws ApiException {
        String username = null;
        String hash = null;
        String query = null;
        Integer offset = null;
        Integer number = null;
        InlineResponse20029 response = api.searchCustomFoods(username, hash, query, offset, number);

        // TODO: test validations
    }
    
    /**
     * Search Food Videos
     *
     * Find recipe and other food related videos.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchFoodVideosTest() throws ApiException {
        String query = null;
        String type = null;
        String cuisine = null;
        String diet = null;
        String includeIngredients = null;
        String excludeIngredients = null;
        BigDecimal minLength = null;
        BigDecimal maxLength = null;
        Integer offset = null;
        Integer number = null;
        InlineResponse20054 response = api.searchFoodVideos(query, type, cuisine, diet, includeIngredients, excludeIngredients, minLength, maxLength, offset, number);

        // TODO: test validations
    }
    
    /**
     * Search Site Content
     *
     * Search spoonacular&#39;s site content. You&#39;ll be able to find everything that you could also find using the search suggestions on spoonacular.com. This is a suggest API so you can send partial strings as queries.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchSiteContentTest() throws ApiException {
        String query = null;
        InlineResponse20052 response = api.searchSiteContent(query);

        // TODO: test validations
    }
    
    /**
     * Talk to Chatbot
     *
     * This endpoint can be used to have a conversation about food with the spoonacular chatbot. Use the \&quot;Get Conversation Suggests\&quot; endpoint to show your user what he or she can say.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void talkToChatbotTest() throws ApiException {
        String text = null;
        String contextId = null;
        InlineResponse20056 response = api.talkToChatbot(text, contextId);

        // TODO: test validations
    }
    
}
