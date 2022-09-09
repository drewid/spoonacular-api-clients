/**
 * spoonacular API
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 800,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.1
 * Contact: mail@spoonacular.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The ConvertAmounts200Response model module.
 * @module com.spoonacular.client/com.spoonacular.client.model/ConvertAmounts200Response
 * @version 1.1
 */
class ConvertAmounts200Response {
    /**
     * Constructs a new <code>ConvertAmounts200Response</code>.
     * 
     * @alias module:com.spoonacular.client/com.spoonacular.client.model/ConvertAmounts200Response
     * @param sourceAmount {Number} 
     * @param sourceUnit {String} 
     * @param targetAmount {Number} 
     * @param targetUnit {String} 
     * @param answer {String} 
     */
    constructor(sourceAmount, sourceUnit, targetAmount, targetUnit, answer) { 
        
        ConvertAmounts200Response.initialize(this, sourceAmount, sourceUnit, targetAmount, targetUnit, answer);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, sourceAmount, sourceUnit, targetAmount, targetUnit, answer) { 
        obj['sourceAmount'] = sourceAmount;
        obj['sourceUnit'] = sourceUnit;
        obj['targetAmount'] = targetAmount;
        obj['targetUnit'] = targetUnit;
        obj['answer'] = answer;
    }

    /**
     * Constructs a <code>ConvertAmounts200Response</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:com.spoonacular.client/com.spoonacular.client.model/ConvertAmounts200Response} obj Optional instance to populate.
     * @return {module:com.spoonacular.client/com.spoonacular.client.model/ConvertAmounts200Response} The populated <code>ConvertAmounts200Response</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ConvertAmounts200Response();

            if (data.hasOwnProperty('sourceAmount')) {
                obj['sourceAmount'] = ApiClient.convertToType(data['sourceAmount'], 'Number');
            }
            if (data.hasOwnProperty('sourceUnit')) {
                obj['sourceUnit'] = ApiClient.convertToType(data['sourceUnit'], 'String');
            }
            if (data.hasOwnProperty('targetAmount')) {
                obj['targetAmount'] = ApiClient.convertToType(data['targetAmount'], 'Number');
            }
            if (data.hasOwnProperty('targetUnit')) {
                obj['targetUnit'] = ApiClient.convertToType(data['targetUnit'], 'String');
            }
            if (data.hasOwnProperty('answer')) {
                obj['answer'] = ApiClient.convertToType(data['answer'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {Number} sourceAmount
 */
ConvertAmounts200Response.prototype['sourceAmount'] = undefined;

/**
 * @member {String} sourceUnit
 */
ConvertAmounts200Response.prototype['sourceUnit'] = undefined;

/**
 * @member {Number} targetAmount
 */
ConvertAmounts200Response.prototype['targetAmount'] = undefined;

/**
 * @member {String} targetUnit
 */
ConvertAmounts200Response.prototype['targetUnit'] = undefined;

/**
 * @member {String} answer
 */
ConvertAmounts200Response.prototype['answer'] = undefined;






export default ConvertAmounts200Response;

