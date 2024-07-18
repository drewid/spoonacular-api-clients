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
import GetMealPlanWeek200ResponseDaysInnerItemsInner from './GetMealPlanWeek200ResponseDaysInnerItemsInner';
import GetMealPlanWeek200ResponseDaysInnerNutritionSummary from './GetMealPlanWeek200ResponseDaysInnerNutritionSummary';

/**
 * The GetMealPlanWeek200ResponseDaysInner model module.
 * @module model/GetMealPlanWeek200ResponseDaysInner
 * @version 2.0.1
 */
class GetMealPlanWeek200ResponseDaysInner {
    /**
     * Constructs a new <code>GetMealPlanWeek200ResponseDaysInner</code>.
     * @alias module:model/GetMealPlanWeek200ResponseDaysInner
     * @param date {Number} 
     * @param day {String} 
     */
    constructor(date, day) { 
        
        GetMealPlanWeek200ResponseDaysInner.initialize(this, date, day);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, date, day) { 
        obj['date'] = date;
        obj['day'] = day;
    }

    /**
     * Constructs a <code>GetMealPlanWeek200ResponseDaysInner</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetMealPlanWeek200ResponseDaysInner} obj Optional instance to populate.
     * @return {module:model/GetMealPlanWeek200ResponseDaysInner} The populated <code>GetMealPlanWeek200ResponseDaysInner</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetMealPlanWeek200ResponseDaysInner();

            if (data.hasOwnProperty('nutritionSummary')) {
                obj['nutritionSummary'] = GetMealPlanWeek200ResponseDaysInnerNutritionSummary.constructFromObject(data['nutritionSummary']);
            }
            if (data.hasOwnProperty('nutritionSummaryBreakfast')) {
                obj['nutritionSummaryBreakfast'] = GetMealPlanWeek200ResponseDaysInnerNutritionSummary.constructFromObject(data['nutritionSummaryBreakfast']);
            }
            if (data.hasOwnProperty('nutritionSummaryLunch')) {
                obj['nutritionSummaryLunch'] = GetMealPlanWeek200ResponseDaysInnerNutritionSummary.constructFromObject(data['nutritionSummaryLunch']);
            }
            if (data.hasOwnProperty('nutritionSummaryDinner')) {
                obj['nutritionSummaryDinner'] = GetMealPlanWeek200ResponseDaysInnerNutritionSummary.constructFromObject(data['nutritionSummaryDinner']);
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Number');
            }
            if (data.hasOwnProperty('day')) {
                obj['day'] = ApiClient.convertToType(data['day'], 'String');
            }
            if (data.hasOwnProperty('items')) {
                obj['items'] = ApiClient.convertToType(data['items'], [GetMealPlanWeek200ResponseDaysInnerItemsInner]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>GetMealPlanWeek200ResponseDaysInner</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>GetMealPlanWeek200ResponseDaysInner</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of GetMealPlanWeek200ResponseDaysInner.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // validate the optional field `nutritionSummary`
        if (data['nutritionSummary']) { // data not null
          GetMealPlanWeek200ResponseDaysInnerNutritionSummary.validateJSON(data['nutritionSummary']);
        }
        // validate the optional field `nutritionSummaryBreakfast`
        if (data['nutritionSummaryBreakfast']) { // data not null
          GetMealPlanWeek200ResponseDaysInnerNutritionSummary.validateJSON(data['nutritionSummaryBreakfast']);
        }
        // validate the optional field `nutritionSummaryLunch`
        if (data['nutritionSummaryLunch']) { // data not null
          GetMealPlanWeek200ResponseDaysInnerNutritionSummary.validateJSON(data['nutritionSummaryLunch']);
        }
        // validate the optional field `nutritionSummaryDinner`
        if (data['nutritionSummaryDinner']) { // data not null
          GetMealPlanWeek200ResponseDaysInnerNutritionSummary.validateJSON(data['nutritionSummaryDinner']);
        }
        // ensure the json data is a string
        if (data['day'] && !(typeof data['day'] === 'string' || data['day'] instanceof String)) {
            throw new Error("Expected the field `day` to be a primitive type in the JSON string but got " + data['day']);
        }
        if (data['items']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['items'])) {
                throw new Error("Expected the field `items` to be an array in the JSON data but got " + data['items']);
            }
            // validate the optional field `items` (array)
            for (const item of data['items']) {
                GetMealPlanWeek200ResponseDaysInnerItemsInner.validateJSON(item);
            };
        }

        return true;
    }


}

GetMealPlanWeek200ResponseDaysInner.RequiredProperties = ["date", "day"];

/**
 * @member {module:model/GetMealPlanWeek200ResponseDaysInnerNutritionSummary} nutritionSummary
 */
GetMealPlanWeek200ResponseDaysInner.prototype['nutritionSummary'] = undefined;

/**
 * @member {module:model/GetMealPlanWeek200ResponseDaysInnerNutritionSummary} nutritionSummaryBreakfast
 */
GetMealPlanWeek200ResponseDaysInner.prototype['nutritionSummaryBreakfast'] = undefined;

/**
 * @member {module:model/GetMealPlanWeek200ResponseDaysInnerNutritionSummary} nutritionSummaryLunch
 */
GetMealPlanWeek200ResponseDaysInner.prototype['nutritionSummaryLunch'] = undefined;

/**
 * @member {module:model/GetMealPlanWeek200ResponseDaysInnerNutritionSummary} nutritionSummaryDinner
 */
GetMealPlanWeek200ResponseDaysInner.prototype['nutritionSummaryDinner'] = undefined;

/**
 * @member {Number} date
 */
GetMealPlanWeek200ResponseDaysInner.prototype['date'] = undefined;

/**
 * @member {String} day
 */
GetMealPlanWeek200ResponseDaysInner.prototype['day'] = undefined;

/**
 * @member {Array.<module:model/GetMealPlanWeek200ResponseDaysInnerItemsInner>} items
 */
GetMealPlanWeek200ResponseDaysInner.prototype['items'] = undefined;






export default GetMealPlanWeek200ResponseDaysInner;

