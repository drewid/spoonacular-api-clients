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
import GetMealPlanWeek200ResponseDaysInner from './GetMealPlanWeek200ResponseDaysInner';

/**
 * The GetMealPlanWeek200Response model module.
 * @module model/GetMealPlanWeek200Response
 * @version 2.0.1
 */
class GetMealPlanWeek200Response {
    /**
     * Constructs a new <code>GetMealPlanWeek200Response</code>.
     * 
     * @alias module:model/GetMealPlanWeek200Response
     * @param days {Array.<module:model/GetMealPlanWeek200ResponseDaysInner>} 
     */
    constructor(days) { 
        
        GetMealPlanWeek200Response.initialize(this, days);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, days) { 
        obj['days'] = days;
    }

    /**
     * Constructs a <code>GetMealPlanWeek200Response</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetMealPlanWeek200Response} obj Optional instance to populate.
     * @return {module:model/GetMealPlanWeek200Response} The populated <code>GetMealPlanWeek200Response</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetMealPlanWeek200Response();

            if (data.hasOwnProperty('days')) {
                obj['days'] = ApiClient.convertToType(data['days'], [GetMealPlanWeek200ResponseDaysInner]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>GetMealPlanWeek200Response</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>GetMealPlanWeek200Response</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of GetMealPlanWeek200Response.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        if (data['days']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['days'])) {
                throw new Error("Expected the field `days` to be an array in the JSON data but got " + data['days']);
            }
            // validate the optional field `days` (array)
            for (const item of data['days']) {
                GetMealPlanWeek200ResponseDaysInner.validateJSON(item);
            };
        }

        return true;
    }


}

GetMealPlanWeek200Response.RequiredProperties = ["days"];

/**
 * @member {Array.<module:model/GetMealPlanWeek200ResponseDaysInner>} days
 */
GetMealPlanWeek200Response.prototype['days'] = undefined;






export default GetMealPlanWeek200Response;

