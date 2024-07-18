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

/**
 * The TalkToChatbot200ResponseMediaInner model module.
 * @module model/TalkToChatbot200ResponseMediaInner
 * @version 2.0.1
 */
class TalkToChatbot200ResponseMediaInner {
    /**
     * Constructs a new <code>TalkToChatbot200ResponseMediaInner</code>.
     * @alias module:model/TalkToChatbot200ResponseMediaInner
     */
    constructor() { 
        
        TalkToChatbot200ResponseMediaInner.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TalkToChatbot200ResponseMediaInner</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TalkToChatbot200ResponseMediaInner} obj Optional instance to populate.
     * @return {module:model/TalkToChatbot200ResponseMediaInner} The populated <code>TalkToChatbot200ResponseMediaInner</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TalkToChatbot200ResponseMediaInner();

            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('image')) {
                obj['image'] = ApiClient.convertToType(data['image'], 'String');
            }
            if (data.hasOwnProperty('link')) {
                obj['link'] = ApiClient.convertToType(data['link'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>TalkToChatbot200ResponseMediaInner</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>TalkToChatbot200ResponseMediaInner</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['title'] && !(typeof data['title'] === 'string' || data['title'] instanceof String)) {
            throw new Error("Expected the field `title` to be a primitive type in the JSON string but got " + data['title']);
        }
        // ensure the json data is a string
        if (data['image'] && !(typeof data['image'] === 'string' || data['image'] instanceof String)) {
            throw new Error("Expected the field `image` to be a primitive type in the JSON string but got " + data['image']);
        }
        // ensure the json data is a string
        if (data['link'] && !(typeof data['link'] === 'string' || data['link'] instanceof String)) {
            throw new Error("Expected the field `link` to be a primitive type in the JSON string but got " + data['link']);
        }

        return true;
    }


}



/**
 * @member {String} title
 */
TalkToChatbot200ResponseMediaInner.prototype['title'] = undefined;

/**
 * @member {String} image
 */
TalkToChatbot200ResponseMediaInner.prototype['image'] = undefined;

/**
 * @member {String} link
 */
TalkToChatbot200ResponseMediaInner.prototype['link'] = undefined;






export default TalkToChatbot200ResponseMediaInner;

