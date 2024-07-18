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
import AnalyzeARecipeSearchQuery200ResponseDishesInner from './AnalyzeARecipeSearchQuery200ResponseDishesInner';
import AnalyzeARecipeSearchQuery200ResponseIngredientsInner from './AnalyzeARecipeSearchQuery200ResponseIngredientsInner';

/**
 * The AnalyzeARecipeSearchQuery200Response model module.
 * @module model/AnalyzeARecipeSearchQuery200Response
 * @version 2.0.1
 */
class AnalyzeARecipeSearchQuery200Response {
    /**
     * Constructs a new <code>AnalyzeARecipeSearchQuery200Response</code>.
     * 
     * @alias module:model/AnalyzeARecipeSearchQuery200Response
     * @param dishes {Array.<module:model/AnalyzeARecipeSearchQuery200ResponseDishesInner>} 
     * @param ingredients {Array.<module:model/AnalyzeARecipeSearchQuery200ResponseIngredientsInner>} 
     * @param cuisines {Array.<String>} 
     * @param modifiers {Array.<String>} 
     */
    constructor(dishes, ingredients, cuisines, modifiers) { 
        
        AnalyzeARecipeSearchQuery200Response.initialize(this, dishes, ingredients, cuisines, modifiers);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, dishes, ingredients, cuisines, modifiers) { 
        obj['dishes'] = dishes;
        obj['ingredients'] = ingredients;
        obj['cuisines'] = cuisines;
        obj['modifiers'] = modifiers;
    }

    /**
     * Constructs a <code>AnalyzeARecipeSearchQuery200Response</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AnalyzeARecipeSearchQuery200Response} obj Optional instance to populate.
     * @return {module:model/AnalyzeARecipeSearchQuery200Response} The populated <code>AnalyzeARecipeSearchQuery200Response</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AnalyzeARecipeSearchQuery200Response();

            if (data.hasOwnProperty('dishes')) {
                obj['dishes'] = ApiClient.convertToType(data['dishes'], [AnalyzeARecipeSearchQuery200ResponseDishesInner]);
            }
            if (data.hasOwnProperty('ingredients')) {
                obj['ingredients'] = ApiClient.convertToType(data['ingredients'], [AnalyzeARecipeSearchQuery200ResponseIngredientsInner]);
            }
            if (data.hasOwnProperty('cuisines')) {
                obj['cuisines'] = ApiClient.convertToType(data['cuisines'], ['String']);
            }
            if (data.hasOwnProperty('modifiers')) {
                obj['modifiers'] = ApiClient.convertToType(data['modifiers'], ['String']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>AnalyzeARecipeSearchQuery200Response</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>AnalyzeARecipeSearchQuery200Response</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of AnalyzeARecipeSearchQuery200Response.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        if (data['dishes']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['dishes'])) {
                throw new Error("Expected the field `dishes` to be an array in the JSON data but got " + data['dishes']);
            }
            // validate the optional field `dishes` (array)
            for (const item of data['dishes']) {
                AnalyzeARecipeSearchQuery200ResponseDishesInner.validateJSON(item);
            };
        }
        if (data['ingredients']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['ingredients'])) {
                throw new Error("Expected the field `ingredients` to be an array in the JSON data but got " + data['ingredients']);
            }
            // validate the optional field `ingredients` (array)
            for (const item of data['ingredients']) {
                AnalyzeARecipeSearchQuery200ResponseIngredientsInner.validateJSON(item);
            };
        }
        // ensure the json data is an array
        if (!Array.isArray(data['cuisines'])) {
            throw new Error("Expected the field `cuisines` to be an array in the JSON data but got " + data['cuisines']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['modifiers'])) {
            throw new Error("Expected the field `modifiers` to be an array in the JSON data but got " + data['modifiers']);
        }

        return true;
    }


}

AnalyzeARecipeSearchQuery200Response.RequiredProperties = ["dishes", "ingredients", "cuisines", "modifiers"];

/**
 * @member {Array.<module:model/AnalyzeARecipeSearchQuery200ResponseDishesInner>} dishes
 */
AnalyzeARecipeSearchQuery200Response.prototype['dishes'] = undefined;

/**
 * @member {Array.<module:model/AnalyzeARecipeSearchQuery200ResponseIngredientsInner>} ingredients
 */
AnalyzeARecipeSearchQuery200Response.prototype['ingredients'] = undefined;

/**
 * @member {Array.<String>} cuisines
 */
AnalyzeARecipeSearchQuery200Response.prototype['cuisines'] = undefined;

/**
 * @member {Array.<String>} modifiers
 */
AnalyzeARecipeSearchQuery200Response.prototype['modifiers'] = undefined;






export default AnalyzeARecipeSearchQuery200Response;

