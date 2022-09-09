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
 * The ParseIngredients200ResponseInnerNutritionWeightPerServing model module.
 * @module com.spoonacular.client/com.spoonacular.client.model/ParseIngredients200ResponseInnerNutritionWeightPerServing
 * @version 1.1
 */
class ParseIngredients200ResponseInnerNutritionWeightPerServing {
    /**
     * Constructs a new <code>ParseIngredients200ResponseInnerNutritionWeightPerServing</code>.
     * @alias module:com.spoonacular.client/com.spoonacular.client.model/ParseIngredients200ResponseInnerNutritionWeightPerServing
     * @param amount {Number} 
     * @param unit {String} 
     */
    constructor(amount, unit) { 
        
        ParseIngredients200ResponseInnerNutritionWeightPerServing.initialize(this, amount, unit);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, amount, unit) { 
        obj['amount'] = amount;
        obj['unit'] = unit;
    }

    /**
     * Constructs a <code>ParseIngredients200ResponseInnerNutritionWeightPerServing</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:com.spoonacular.client/com.spoonacular.client.model/ParseIngredients200ResponseInnerNutritionWeightPerServing} obj Optional instance to populate.
     * @return {module:com.spoonacular.client/com.spoonacular.client.model/ParseIngredients200ResponseInnerNutritionWeightPerServing} The populated <code>ParseIngredients200ResponseInnerNutritionWeightPerServing</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ParseIngredients200ResponseInnerNutritionWeightPerServing();

            if (data.hasOwnProperty('amount')) {
                obj['amount'] = ApiClient.convertToType(data['amount'], 'Number');
            }
            if (data.hasOwnProperty('unit')) {
                obj['unit'] = ApiClient.convertToType(data['unit'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {Number} amount
 */
ParseIngredients200ResponseInnerNutritionWeightPerServing.prototype['amount'] = undefined;

/**
 * @member {String} unit
 */
ParseIngredients200ResponseInnerNutritionWeightPerServing.prototype['unit'] = undefined;






export default ParseIngredients200ResponseInnerNutritionWeightPerServing;

