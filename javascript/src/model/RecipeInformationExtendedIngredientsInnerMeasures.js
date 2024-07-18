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
import RecipeInformationExtendedIngredientsInnerMeasuresMetric from './RecipeInformationExtendedIngredientsInnerMeasuresMetric';

/**
 * The RecipeInformationExtendedIngredientsInnerMeasures model module.
 * @module model/RecipeInformationExtendedIngredientsInnerMeasures
 * @version 2.0.1
 */
class RecipeInformationExtendedIngredientsInnerMeasures {
    /**
     * Constructs a new <code>RecipeInformationExtendedIngredientsInnerMeasures</code>.
     * @alias module:model/RecipeInformationExtendedIngredientsInnerMeasures
     * @param metric {module:model/RecipeInformationExtendedIngredientsInnerMeasuresMetric} 
     * @param us {module:model/RecipeInformationExtendedIngredientsInnerMeasuresMetric} 
     */
    constructor(metric, us) { 
        
        RecipeInformationExtendedIngredientsInnerMeasures.initialize(this, metric, us);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, metric, us) { 
        obj['metric'] = metric;
        obj['us'] = us;
    }

    /**
     * Constructs a <code>RecipeInformationExtendedIngredientsInnerMeasures</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RecipeInformationExtendedIngredientsInnerMeasures} obj Optional instance to populate.
     * @return {module:model/RecipeInformationExtendedIngredientsInnerMeasures} The populated <code>RecipeInformationExtendedIngredientsInnerMeasures</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RecipeInformationExtendedIngredientsInnerMeasures();

            if (data.hasOwnProperty('metric')) {
                obj['metric'] = RecipeInformationExtendedIngredientsInnerMeasuresMetric.constructFromObject(data['metric']);
            }
            if (data.hasOwnProperty('us')) {
                obj['us'] = RecipeInformationExtendedIngredientsInnerMeasuresMetric.constructFromObject(data['us']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RecipeInformationExtendedIngredientsInnerMeasures</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RecipeInformationExtendedIngredientsInnerMeasures</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of RecipeInformationExtendedIngredientsInnerMeasures.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // validate the optional field `metric`
        if (data['metric']) { // data not null
          RecipeInformationExtendedIngredientsInnerMeasuresMetric.validateJSON(data['metric']);
        }
        // validate the optional field `us`
        if (data['us']) { // data not null
          RecipeInformationExtendedIngredientsInnerMeasuresMetric.validateJSON(data['us']);
        }

        return true;
    }


}

RecipeInformationExtendedIngredientsInnerMeasures.RequiredProperties = ["metric", "us"];

/**
 * @member {module:model/RecipeInformationExtendedIngredientsInnerMeasuresMetric} metric
 */
RecipeInformationExtendedIngredientsInnerMeasures.prototype['metric'] = undefined;

/**
 * @member {module:model/RecipeInformationExtendedIngredientsInnerMeasuresMetric} us
 */
RecipeInformationExtendedIngredientsInnerMeasures.prototype['us'] = undefined;






export default RecipeInformationExtendedIngredientsInnerMeasures;

