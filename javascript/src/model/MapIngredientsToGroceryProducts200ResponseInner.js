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
import MapIngredientsToGroceryProducts200ResponseInnerProductsInner from './MapIngredientsToGroceryProducts200ResponseInnerProductsInner';

/**
 * The MapIngredientsToGroceryProducts200ResponseInner model module.
 * @module model/MapIngredientsToGroceryProducts200ResponseInner
 * @version 2.0.1
 */
class MapIngredientsToGroceryProducts200ResponseInner {
    /**
     * Constructs a new <code>MapIngredientsToGroceryProducts200ResponseInner</code>.
     * @alias module:model/MapIngredientsToGroceryProducts200ResponseInner
     * @param original {String} 
     * @param originalName {String} 
     * @param ingredientImage {String} 
     * @param meta {Array.<String>} 
     * @param products {Array.<module:model/MapIngredientsToGroceryProducts200ResponseInnerProductsInner>} 
     */
    constructor(original, originalName, ingredientImage, meta, products) { 
        
        MapIngredientsToGroceryProducts200ResponseInner.initialize(this, original, originalName, ingredientImage, meta, products);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, original, originalName, ingredientImage, meta, products) { 
        obj['original'] = original;
        obj['originalName'] = originalName;
        obj['ingredientImage'] = ingredientImage;
        obj['meta'] = meta;
        obj['products'] = products;
    }

    /**
     * Constructs a <code>MapIngredientsToGroceryProducts200ResponseInner</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MapIngredientsToGroceryProducts200ResponseInner} obj Optional instance to populate.
     * @return {module:model/MapIngredientsToGroceryProducts200ResponseInner} The populated <code>MapIngredientsToGroceryProducts200ResponseInner</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MapIngredientsToGroceryProducts200ResponseInner();

            if (data.hasOwnProperty('original')) {
                obj['original'] = ApiClient.convertToType(data['original'], 'String');
            }
            if (data.hasOwnProperty('originalName')) {
                obj['originalName'] = ApiClient.convertToType(data['originalName'], 'String');
            }
            if (data.hasOwnProperty('ingredientImage')) {
                obj['ingredientImage'] = ApiClient.convertToType(data['ingredientImage'], 'String');
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], ['String']);
            }
            if (data.hasOwnProperty('products')) {
                obj['products'] = ApiClient.convertToType(data['products'], [MapIngredientsToGroceryProducts200ResponseInnerProductsInner]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>MapIngredientsToGroceryProducts200ResponseInner</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>MapIngredientsToGroceryProducts200ResponseInner</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of MapIngredientsToGroceryProducts200ResponseInner.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['original'] && !(typeof data['original'] === 'string' || data['original'] instanceof String)) {
            throw new Error("Expected the field `original` to be a primitive type in the JSON string but got " + data['original']);
        }
        // ensure the json data is a string
        if (data['originalName'] && !(typeof data['originalName'] === 'string' || data['originalName'] instanceof String)) {
            throw new Error("Expected the field `originalName` to be a primitive type in the JSON string but got " + data['originalName']);
        }
        // ensure the json data is a string
        if (data['ingredientImage'] && !(typeof data['ingredientImage'] === 'string' || data['ingredientImage'] instanceof String)) {
            throw new Error("Expected the field `ingredientImage` to be a primitive type in the JSON string but got " + data['ingredientImage']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['meta'])) {
            throw new Error("Expected the field `meta` to be an array in the JSON data but got " + data['meta']);
        }
        if (data['products']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['products'])) {
                throw new Error("Expected the field `products` to be an array in the JSON data but got " + data['products']);
            }
            // validate the optional field `products` (array)
            for (const item of data['products']) {
                MapIngredientsToGroceryProducts200ResponseInnerProductsInner.validateJSON(item);
            };
        }

        return true;
    }


}

MapIngredientsToGroceryProducts200ResponseInner.RequiredProperties = ["original", "originalName", "ingredientImage", "meta", "products"];

/**
 * @member {String} original
 */
MapIngredientsToGroceryProducts200ResponseInner.prototype['original'] = undefined;

/**
 * @member {String} originalName
 */
MapIngredientsToGroceryProducts200ResponseInner.prototype['originalName'] = undefined;

/**
 * @member {String} ingredientImage
 */
MapIngredientsToGroceryProducts200ResponseInner.prototype['ingredientImage'] = undefined;

/**
 * @member {Array.<String>} meta
 */
MapIngredientsToGroceryProducts200ResponseInner.prototype['meta'] = undefined;

/**
 * @member {Array.<module:model/MapIngredientsToGroceryProducts200ResponseInnerProductsInner>} products
 */
MapIngredientsToGroceryProducts200ResponseInner.prototype['products'] = undefined;






export default MapIngredientsToGroceryProducts200ResponseInner;

