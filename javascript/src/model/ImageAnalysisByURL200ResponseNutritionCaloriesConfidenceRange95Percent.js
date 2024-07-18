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
 * The ImageAnalysisByURL200ResponseNutritionCaloriesConfidenceRange95Percent model module.
 * @module model/ImageAnalysisByURL200ResponseNutritionCaloriesConfidenceRange95Percent
 * @version 2.0.1
 */
class ImageAnalysisByURL200ResponseNutritionCaloriesConfidenceRange95Percent {
    /**
     * Constructs a new <code>ImageAnalysisByURL200ResponseNutritionCaloriesConfidenceRange95Percent</code>.
     * @alias module:model/ImageAnalysisByURL200ResponseNutritionCaloriesConfidenceRange95Percent
     * @param min {Number} 
     * @param max {Number} 
     */
    constructor(min, max) { 
        
        ImageAnalysisByURL200ResponseNutritionCaloriesConfidenceRange95Percent.initialize(this, min, max);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, min, max) { 
        obj['min'] = min;
        obj['max'] = max;
    }

    /**
     * Constructs a <code>ImageAnalysisByURL200ResponseNutritionCaloriesConfidenceRange95Percent</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ImageAnalysisByURL200ResponseNutritionCaloriesConfidenceRange95Percent} obj Optional instance to populate.
     * @return {module:model/ImageAnalysisByURL200ResponseNutritionCaloriesConfidenceRange95Percent} The populated <code>ImageAnalysisByURL200ResponseNutritionCaloriesConfidenceRange95Percent</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ImageAnalysisByURL200ResponseNutritionCaloriesConfidenceRange95Percent();

            if (data.hasOwnProperty('min')) {
                obj['min'] = ApiClient.convertToType(data['min'], 'Number');
            }
            if (data.hasOwnProperty('max')) {
                obj['max'] = ApiClient.convertToType(data['max'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>ImageAnalysisByURL200ResponseNutritionCaloriesConfidenceRange95Percent</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ImageAnalysisByURL200ResponseNutritionCaloriesConfidenceRange95Percent</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of ImageAnalysisByURL200ResponseNutritionCaloriesConfidenceRange95Percent.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }

        return true;
    }


}

ImageAnalysisByURL200ResponseNutritionCaloriesConfidenceRange95Percent.RequiredProperties = ["min", "max"];

/**
 * @member {Number} min
 */
ImageAnalysisByURL200ResponseNutritionCaloriesConfidenceRange95Percent.prototype['min'] = undefined;

/**
 * @member {Number} max
 */
ImageAnalysisByURL200ResponseNutritionCaloriesConfidenceRange95Percent.prototype['max'] = undefined;






export default ImageAnalysisByURL200ResponseNutritionCaloriesConfidenceRange95Percent;

