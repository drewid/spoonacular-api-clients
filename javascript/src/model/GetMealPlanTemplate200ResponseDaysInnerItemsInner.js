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
import GetMealPlanTemplate200ResponseDaysInnerItemsInnerValue from './GetMealPlanTemplate200ResponseDaysInnerItemsInnerValue';

/**
 * The GetMealPlanTemplate200ResponseDaysInnerItemsInner model module.
 * @module model/GetMealPlanTemplate200ResponseDaysInnerItemsInner
 * @version 2.0.1
 */
class GetMealPlanTemplate200ResponseDaysInnerItemsInner {
    /**
     * Constructs a new <code>GetMealPlanTemplate200ResponseDaysInnerItemsInner</code>.
     * @alias module:model/GetMealPlanTemplate200ResponseDaysInnerItemsInner
     * @param id {Number} 
     * @param slot {Number} 
     * @param position {Number} 
     * @param type {String} 
     */
    constructor(id, slot, position, type) { 
        
        GetMealPlanTemplate200ResponseDaysInnerItemsInner.initialize(this, id, slot, position, type);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, slot, position, type) { 
        obj['id'] = id;
        obj['slot'] = slot;
        obj['position'] = position;
        obj['type'] = type;
    }

    /**
     * Constructs a <code>GetMealPlanTemplate200ResponseDaysInnerItemsInner</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetMealPlanTemplate200ResponseDaysInnerItemsInner} obj Optional instance to populate.
     * @return {module:model/GetMealPlanTemplate200ResponseDaysInnerItemsInner} The populated <code>GetMealPlanTemplate200ResponseDaysInnerItemsInner</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetMealPlanTemplate200ResponseDaysInnerItemsInner();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('slot')) {
                obj['slot'] = ApiClient.convertToType(data['slot'], 'Number');
            }
            if (data.hasOwnProperty('position')) {
                obj['position'] = ApiClient.convertToType(data['position'], 'Number');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = GetMealPlanTemplate200ResponseDaysInnerItemsInnerValue.constructFromObject(data['value']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>GetMealPlanTemplate200ResponseDaysInnerItemsInner</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>GetMealPlanTemplate200ResponseDaysInnerItemsInner</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of GetMealPlanTemplate200ResponseDaysInnerItemsInner.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['type'] && !(typeof data['type'] === 'string' || data['type'] instanceof String)) {
            throw new Error("Expected the field `type` to be a primitive type in the JSON string but got " + data['type']);
        }
        // validate the optional field `value`
        if (data['value']) { // data not null
          GetMealPlanTemplate200ResponseDaysInnerItemsInnerValue.validateJSON(data['value']);
        }

        return true;
    }


}

GetMealPlanTemplate200ResponseDaysInnerItemsInner.RequiredProperties = ["id", "slot", "position", "type"];

/**
 * @member {Number} id
 */
GetMealPlanTemplate200ResponseDaysInnerItemsInner.prototype['id'] = undefined;

/**
 * @member {Number} slot
 */
GetMealPlanTemplate200ResponseDaysInnerItemsInner.prototype['slot'] = undefined;

/**
 * @member {Number} position
 */
GetMealPlanTemplate200ResponseDaysInnerItemsInner.prototype['position'] = undefined;

/**
 * @member {String} type
 */
GetMealPlanTemplate200ResponseDaysInnerItemsInner.prototype['type'] = undefined;

/**
 * @member {module:model/GetMealPlanTemplate200ResponseDaysInnerItemsInnerValue} value
 */
GetMealPlanTemplate200ResponseDaysInnerItemsInner.prototype['value'] = undefined;






export default GetMealPlanTemplate200ResponseDaysInnerItemsInner;

