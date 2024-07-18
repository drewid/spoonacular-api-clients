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
import AutocompleteRecipeSearch200ResponseInner from './AutocompleteRecipeSearch200ResponseInner';

/**
 * The SearchGroceryProducts200Response model module.
 * @module model/SearchGroceryProducts200Response
 * @version 2.0.1
 */
class SearchGroceryProducts200Response {
    /**
     * Constructs a new <code>SearchGroceryProducts200Response</code>.
     * 
     * @alias module:model/SearchGroceryProducts200Response
     * @param products {Array.<module:model/AutocompleteRecipeSearch200ResponseInner>} 
     * @param totalProducts {Number} 
     * @param type {String} 
     * @param offset {Number} 
     * @param number {Number} 
     */
    constructor(products, totalProducts, type, offset, number) { 
        
        SearchGroceryProducts200Response.initialize(this, products, totalProducts, type, offset, number);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, products, totalProducts, type, offset, number) { 
        obj['products'] = products;
        obj['totalProducts'] = totalProducts;
        obj['type'] = type;
        obj['offset'] = offset;
        obj['number'] = number;
    }

    /**
     * Constructs a <code>SearchGroceryProducts200Response</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SearchGroceryProducts200Response} obj Optional instance to populate.
     * @return {module:model/SearchGroceryProducts200Response} The populated <code>SearchGroceryProducts200Response</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SearchGroceryProducts200Response();

            if (data.hasOwnProperty('products')) {
                obj['products'] = ApiClient.convertToType(data['products'], [AutocompleteRecipeSearch200ResponseInner]);
            }
            if (data.hasOwnProperty('totalProducts')) {
                obj['totalProducts'] = ApiClient.convertToType(data['totalProducts'], 'Number');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('offset')) {
                obj['offset'] = ApiClient.convertToType(data['offset'], 'Number');
            }
            if (data.hasOwnProperty('number')) {
                obj['number'] = ApiClient.convertToType(data['number'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>SearchGroceryProducts200Response</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>SearchGroceryProducts200Response</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of SearchGroceryProducts200Response.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        if (data['products']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['products'])) {
                throw new Error("Expected the field `products` to be an array in the JSON data but got " + data['products']);
            }
            // validate the optional field `products` (array)
            for (const item of data['products']) {
                AutocompleteRecipeSearch200ResponseInner.validateJSON(item);
            };
        }
        // ensure the json data is a string
        if (data['type'] && !(typeof data['type'] === 'string' || data['type'] instanceof String)) {
            throw new Error("Expected the field `type` to be a primitive type in the JSON string but got " + data['type']);
        }

        return true;
    }


}

SearchGroceryProducts200Response.RequiredProperties = ["products", "totalProducts", "type", "offset", "number"];

/**
 * @member {Array.<module:model/AutocompleteRecipeSearch200ResponseInner>} products
 */
SearchGroceryProducts200Response.prototype['products'] = undefined;

/**
 * @member {Number} totalProducts
 */
SearchGroceryProducts200Response.prototype['totalProducts'] = undefined;

/**
 * @member {String} type
 */
SearchGroceryProducts200Response.prototype['type'] = undefined;

/**
 * @member {Number} offset
 */
SearchGroceryProducts200Response.prototype['offset'] = undefined;

/**
 * @member {Number} number
 */
SearchGroceryProducts200Response.prototype['number'] = undefined;






export default SearchGroceryProducts200Response;

