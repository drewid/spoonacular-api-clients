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
 * The GuessNutritionByDishName200ResponseCaloriesConfidenceRange95Percent model module.
 * @module model/GuessNutritionByDishName200ResponseCaloriesConfidenceRange95Percent
 * @version 2.0.1
 */
class GuessNutritionByDishName200ResponseCaloriesConfidenceRange95Percent {
    /**
     * Constructs a new <code>GuessNutritionByDishName200ResponseCaloriesConfidenceRange95Percent</code>.
     * @alias module:model/GuessNutritionByDishName200ResponseCaloriesConfidenceRange95Percent
     * @param max {Number} 
     * @param min {Number} 
     */
    constructor(max, min) { 
        
        GuessNutritionByDishName200ResponseCaloriesConfidenceRange95Percent.initialize(this, max, min);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, max, min) { 
        obj['max'] = max;
        obj['min'] = min;
    }

    /**
     * Constructs a <code>GuessNutritionByDishName200ResponseCaloriesConfidenceRange95Percent</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GuessNutritionByDishName200ResponseCaloriesConfidenceRange95Percent} obj Optional instance to populate.
     * @return {module:model/GuessNutritionByDishName200ResponseCaloriesConfidenceRange95Percent} The populated <code>GuessNutritionByDishName200ResponseCaloriesConfidenceRange95Percent</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GuessNutritionByDishName200ResponseCaloriesConfidenceRange95Percent();

            if (data.hasOwnProperty('max')) {
                obj['max'] = ApiClient.convertToType(data['max'], 'Number');
            }
            if (data.hasOwnProperty('min')) {
                obj['min'] = ApiClient.convertToType(data['min'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>GuessNutritionByDishName200ResponseCaloriesConfidenceRange95Percent</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>GuessNutritionByDishName200ResponseCaloriesConfidenceRange95Percent</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of GuessNutritionByDishName200ResponseCaloriesConfidenceRange95Percent.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }

        return true;
    }


}

GuessNutritionByDishName200ResponseCaloriesConfidenceRange95Percent.RequiredProperties = ["max", "min"];

/**
 * @member {Number} max
 */
GuessNutritionByDishName200ResponseCaloriesConfidenceRange95Percent.prototype['max'] = undefined;

/**
 * @member {Number} min
 */
GuessNutritionByDishName200ResponseCaloriesConfidenceRange95Percent.prototype['min'] = undefined;






export default GuessNutritionByDishName200ResponseCaloriesConfidenceRange95Percent;

