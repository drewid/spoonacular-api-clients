/**
 * spoonacular API
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 2.0.1
 * Contact: mail@spoonacular.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import IngredientBasics from './IngredientBasics';
import SearchGroceryProductsByUPC200ResponseNutrition from './SearchGroceryProductsByUPC200ResponseNutrition';
import SearchGroceryProductsByUPC200ResponseServings from './SearchGroceryProductsByUPC200ResponseServings';

/**
 * The SearchGroceryProductsByUPC200Response model module.
 * @module model/SearchGroceryProductsByUPC200Response
 * @version 2.0.1
 */
class SearchGroceryProductsByUPC200Response {
    /**
     * Constructs a new <code>SearchGroceryProductsByUPC200Response</code>.
     * 
     * @alias module:model/SearchGroceryProductsByUPC200Response
     * @param id {Number} 
     * @param title {String} 
     * @param badges {Array.<String>} 
     * @param importantBadges {Array.<String>} 
     * @param breadcrumbs {Array.<String>} 
     * @param generatedText {String} 
     * @param imageType {String} 
     * @param ingredientList {String} 
     * @param ingredients {Array.<module:model/IngredientBasics>} 
     * @param likes {Number} 
     * @param nutrition {module:model/SearchGroceryProductsByUPC200ResponseNutrition} 
     * @param price {Number} 
     * @param servings {module:model/SearchGroceryProductsByUPC200ResponseServings} 
     * @param spoonacularScore {Number} 
     */
    constructor(id, title, badges, importantBadges, breadcrumbs, generatedText, imageType, ingredientList, ingredients, likes, nutrition, price, servings, spoonacularScore) { 
        
        SearchGroceryProductsByUPC200Response.initialize(this, id, title, badges, importantBadges, breadcrumbs, generatedText, imageType, ingredientList, ingredients, likes, nutrition, price, servings, spoonacularScore);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, title, badges, importantBadges, breadcrumbs, generatedText, imageType, ingredientList, ingredients, likes, nutrition, price, servings, spoonacularScore) { 
        obj['id'] = id;
        obj['title'] = title;
        obj['badges'] = badges;
        obj['importantBadges'] = importantBadges;
        obj['breadcrumbs'] = breadcrumbs;
        obj['generatedText'] = generatedText;
        obj['imageType'] = imageType;
        obj['ingredientList'] = ingredientList;
        obj['ingredients'] = ingredients;
        obj['likes'] = likes;
        obj['nutrition'] = nutrition;
        obj['price'] = price;
        obj['servings'] = servings;
        obj['spoonacularScore'] = spoonacularScore;
    }

    /**
     * Constructs a <code>SearchGroceryProductsByUPC200Response</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SearchGroceryProductsByUPC200Response} obj Optional instance to populate.
     * @return {module:model/SearchGroceryProductsByUPC200Response} The populated <code>SearchGroceryProductsByUPC200Response</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SearchGroceryProductsByUPC200Response();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('badges')) {
                obj['badges'] = ApiClient.convertToType(data['badges'], ['String']);
            }
            if (data.hasOwnProperty('importantBadges')) {
                obj['importantBadges'] = ApiClient.convertToType(data['importantBadges'], ['String']);
            }
            if (data.hasOwnProperty('breadcrumbs')) {
                obj['breadcrumbs'] = ApiClient.convertToType(data['breadcrumbs'], ['String']);
            }
            if (data.hasOwnProperty('generatedText')) {
                obj['generatedText'] = ApiClient.convertToType(data['generatedText'], 'String');
            }
            if (data.hasOwnProperty('imageType')) {
                obj['imageType'] = ApiClient.convertToType(data['imageType'], 'String');
            }
            if (data.hasOwnProperty('ingredientCount')) {
                obj['ingredientCount'] = ApiClient.convertToType(data['ingredientCount'], 'Number');
            }
            if (data.hasOwnProperty('ingredientList')) {
                obj['ingredientList'] = ApiClient.convertToType(data['ingredientList'], 'String');
            }
            if (data.hasOwnProperty('ingredients')) {
                obj['ingredients'] = ApiClient.convertToType(data['ingredients'], [IngredientBasics]);
            }
            if (data.hasOwnProperty('likes')) {
                obj['likes'] = ApiClient.convertToType(data['likes'], 'Number');
            }
            if (data.hasOwnProperty('nutrition')) {
                obj['nutrition'] = SearchGroceryProductsByUPC200ResponseNutrition.constructFromObject(data['nutrition']);
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = ApiClient.convertToType(data['price'], 'Number');
            }
            if (data.hasOwnProperty('servings')) {
                obj['servings'] = SearchGroceryProductsByUPC200ResponseServings.constructFromObject(data['servings']);
            }
            if (data.hasOwnProperty('spoonacularScore')) {
                obj['spoonacularScore'] = ApiClient.convertToType(data['spoonacularScore'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>SearchGroceryProductsByUPC200Response</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>SearchGroceryProductsByUPC200Response</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of SearchGroceryProductsByUPC200Response.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['title'] && !(typeof data['title'] === 'string' || data['title'] instanceof String)) {
            throw new Error("Expected the field `title` to be a primitive type in the JSON string but got " + data['title']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['badges'])) {
            throw new Error("Expected the field `badges` to be an array in the JSON data but got " + data['badges']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['importantBadges'])) {
            throw new Error("Expected the field `importantBadges` to be an array in the JSON data but got " + data['importantBadges']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['breadcrumbs'])) {
            throw new Error("Expected the field `breadcrumbs` to be an array in the JSON data but got " + data['breadcrumbs']);
        }
        // ensure the json data is a string
        if (data['generatedText'] && !(typeof data['generatedText'] === 'string' || data['generatedText'] instanceof String)) {
            throw new Error("Expected the field `generatedText` to be a primitive type in the JSON string but got " + data['generatedText']);
        }
        // ensure the json data is a string
        if (data['imageType'] && !(typeof data['imageType'] === 'string' || data['imageType'] instanceof String)) {
            throw new Error("Expected the field `imageType` to be a primitive type in the JSON string but got " + data['imageType']);
        }
        // ensure the json data is a string
        if (data['ingredientList'] && !(typeof data['ingredientList'] === 'string' || data['ingredientList'] instanceof String)) {
            throw new Error("Expected the field `ingredientList` to be a primitive type in the JSON string but got " + data['ingredientList']);
        }
        if (data['ingredients']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['ingredients'])) {
                throw new Error("Expected the field `ingredients` to be an array in the JSON data but got " + data['ingredients']);
            }
            // validate the optional field `ingredients` (array)
            for (const item of data['ingredients']) {
                IngredientBasics.validateJSON(item);
            };
        }
        // validate the optional field `nutrition`
        if (data['nutrition']) { // data not null
          SearchGroceryProductsByUPC200ResponseNutrition.validateJSON(data['nutrition']);
        }
        // validate the optional field `servings`
        if (data['servings']) { // data not null
          SearchGroceryProductsByUPC200ResponseServings.validateJSON(data['servings']);
        }

        return true;
    }


}

SearchGroceryProductsByUPC200Response.RequiredProperties = ["id", "title", "badges", "importantBadges", "breadcrumbs", "generatedText", "imageType", "ingredientList", "ingredients", "likes", "nutrition", "price", "servings", "spoonacularScore"];

/**
 * @member {Number} id
 */
SearchGroceryProductsByUPC200Response.prototype['id'] = undefined;

/**
 * @member {String} title
 */
SearchGroceryProductsByUPC200Response.prototype['title'] = undefined;

/**
 * @member {Array.<String>} badges
 */
SearchGroceryProductsByUPC200Response.prototype['badges'] = undefined;

/**
 * @member {Array.<String>} importantBadges
 */
SearchGroceryProductsByUPC200Response.prototype['importantBadges'] = undefined;

/**
 * @member {Array.<String>} breadcrumbs
 */
SearchGroceryProductsByUPC200Response.prototype['breadcrumbs'] = undefined;

/**
 * @member {String} generatedText
 */
SearchGroceryProductsByUPC200Response.prototype['generatedText'] = undefined;

/**
 * @member {String} imageType
 */
SearchGroceryProductsByUPC200Response.prototype['imageType'] = undefined;

/**
 * @member {Number} ingredientCount
 */
SearchGroceryProductsByUPC200Response.prototype['ingredientCount'] = undefined;

/**
 * @member {String} ingredientList
 */
SearchGroceryProductsByUPC200Response.prototype['ingredientList'] = undefined;

/**
 * @member {Array.<module:model/IngredientBasics>} ingredients
 */
SearchGroceryProductsByUPC200Response.prototype['ingredients'] = undefined;

/**
 * @member {Number} likes
 */
SearchGroceryProductsByUPC200Response.prototype['likes'] = undefined;

/**
 * @member {module:model/SearchGroceryProductsByUPC200ResponseNutrition} nutrition
 */
SearchGroceryProductsByUPC200Response.prototype['nutrition'] = undefined;

/**
 * @member {Number} price
 */
SearchGroceryProductsByUPC200Response.prototype['price'] = undefined;

/**
 * @member {module:model/SearchGroceryProductsByUPC200ResponseServings} servings
 */
SearchGroceryProductsByUPC200Response.prototype['servings'] = undefined;

/**
 * @member {Number} spoonacularScore
 */
SearchGroceryProductsByUPC200Response.prototype['spoonacularScore'] = undefined;






export default SearchGroceryProductsByUPC200Response;

