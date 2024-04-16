/**
 * spoonacular API
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
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
import ParseIngredients200ResponseInnerEstimatedCost from './ParseIngredients200ResponseInnerEstimatedCost';
import ParseIngredients200ResponseInnerNutrition from './ParseIngredients200ResponseInnerNutrition';

/**
 * The ParseIngredients200ResponseInner model module.
 * @module model/ParseIngredients200ResponseInner
 * @version 1.1
 */
class ParseIngredients200ResponseInner {
    /**
     * Constructs a new <code>ParseIngredients200ResponseInner</code>.
     * @alias module:model/ParseIngredients200ResponseInner
     * @param id {Number} 
     * @param original {String} 
     * @param originalName {String} 
     * @param name {String} 
     * @param nameClean {String} 
     * @param amount {Number} 
     * @param unit {String} 
     * @param unitShort {String} 
     * @param unitLong {String} 
     * @param possibleUnits {Array.<String>} 
     * @param estimatedCost {module:model/ParseIngredients200ResponseInnerEstimatedCost} 
     * @param consistency {String} 
     * @param aisle {String} 
     * @param image {String} 
     * @param meta {Array.<String>} 
     * @param nutrition {module:model/ParseIngredients200ResponseInnerNutrition} 
     */
    constructor(id, original, originalName, name, nameClean, amount, unit, unitShort, unitLong, possibleUnits, estimatedCost, consistency, aisle, image, meta, nutrition) { 
        
        ParseIngredients200ResponseInner.initialize(this, id, original, originalName, name, nameClean, amount, unit, unitShort, unitLong, possibleUnits, estimatedCost, consistency, aisle, image, meta, nutrition);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, original, originalName, name, nameClean, amount, unit, unitShort, unitLong, possibleUnits, estimatedCost, consistency, aisle, image, meta, nutrition) { 
        obj['id'] = id;
        obj['original'] = original;
        obj['originalName'] = originalName;
        obj['name'] = name;
        obj['nameClean'] = nameClean;
        obj['amount'] = amount;
        obj['unit'] = unit;
        obj['unitShort'] = unitShort;
        obj['unitLong'] = unitLong;
        obj['possibleUnits'] = possibleUnits;
        obj['estimatedCost'] = estimatedCost;
        obj['consistency'] = consistency;
        obj['aisle'] = aisle;
        obj['image'] = image;
        obj['meta'] = meta;
        obj['nutrition'] = nutrition;
    }

    /**
     * Constructs a <code>ParseIngredients200ResponseInner</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ParseIngredients200ResponseInner} obj Optional instance to populate.
     * @return {module:model/ParseIngredients200ResponseInner} The populated <code>ParseIngredients200ResponseInner</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ParseIngredients200ResponseInner();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('original')) {
                obj['original'] = ApiClient.convertToType(data['original'], 'String');
            }
            if (data.hasOwnProperty('originalName')) {
                obj['originalName'] = ApiClient.convertToType(data['originalName'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('nameClean')) {
                obj['nameClean'] = ApiClient.convertToType(data['nameClean'], 'String');
            }
            if (data.hasOwnProperty('amount')) {
                obj['amount'] = ApiClient.convertToType(data['amount'], 'Number');
            }
            if (data.hasOwnProperty('unit')) {
                obj['unit'] = ApiClient.convertToType(data['unit'], 'String');
            }
            if (data.hasOwnProperty('unitShort')) {
                obj['unitShort'] = ApiClient.convertToType(data['unitShort'], 'String');
            }
            if (data.hasOwnProperty('unitLong')) {
                obj['unitLong'] = ApiClient.convertToType(data['unitLong'], 'String');
            }
            if (data.hasOwnProperty('possibleUnits')) {
                obj['possibleUnits'] = ApiClient.convertToType(data['possibleUnits'], ['String']);
            }
            if (data.hasOwnProperty('estimatedCost')) {
                obj['estimatedCost'] = ParseIngredients200ResponseInnerEstimatedCost.constructFromObject(data['estimatedCost']);
            }
            if (data.hasOwnProperty('consistency')) {
                obj['consistency'] = ApiClient.convertToType(data['consistency'], 'String');
            }
            if (data.hasOwnProperty('aisle')) {
                obj['aisle'] = ApiClient.convertToType(data['aisle'], 'String');
            }
            if (data.hasOwnProperty('image')) {
                obj['image'] = ApiClient.convertToType(data['image'], 'String');
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], ['String']);
            }
            if (data.hasOwnProperty('nutrition')) {
                obj['nutrition'] = ParseIngredients200ResponseInnerNutrition.constructFromObject(data['nutrition']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>ParseIngredients200ResponseInner</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ParseIngredients200ResponseInner</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of ParseIngredients200ResponseInner.RequiredProperties) {
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
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }
        // ensure the json data is a string
        if (data['nameClean'] && !(typeof data['nameClean'] === 'string' || data['nameClean'] instanceof String)) {
            throw new Error("Expected the field `nameClean` to be a primitive type in the JSON string but got " + data['nameClean']);
        }
        // ensure the json data is a string
        if (data['unit'] && !(typeof data['unit'] === 'string' || data['unit'] instanceof String)) {
            throw new Error("Expected the field `unit` to be a primitive type in the JSON string but got " + data['unit']);
        }
        // ensure the json data is a string
        if (data['unitShort'] && !(typeof data['unitShort'] === 'string' || data['unitShort'] instanceof String)) {
            throw new Error("Expected the field `unitShort` to be a primitive type in the JSON string but got " + data['unitShort']);
        }
        // ensure the json data is a string
        if (data['unitLong'] && !(typeof data['unitLong'] === 'string' || data['unitLong'] instanceof String)) {
            throw new Error("Expected the field `unitLong` to be a primitive type in the JSON string but got " + data['unitLong']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['possibleUnits'])) {
            throw new Error("Expected the field `possibleUnits` to be an array in the JSON data but got " + data['possibleUnits']);
        }
        // validate the optional field `estimatedCost`
        if (data['estimatedCost']) { // data not null
          ParseIngredients200ResponseInnerEstimatedCost.validateJSON(data['estimatedCost']);
        }
        // ensure the json data is a string
        if (data['consistency'] && !(typeof data['consistency'] === 'string' || data['consistency'] instanceof String)) {
            throw new Error("Expected the field `consistency` to be a primitive type in the JSON string but got " + data['consistency']);
        }
        // ensure the json data is a string
        if (data['aisle'] && !(typeof data['aisle'] === 'string' || data['aisle'] instanceof String)) {
            throw new Error("Expected the field `aisle` to be a primitive type in the JSON string but got " + data['aisle']);
        }
        // ensure the json data is a string
        if (data['image'] && !(typeof data['image'] === 'string' || data['image'] instanceof String)) {
            throw new Error("Expected the field `image` to be a primitive type in the JSON string but got " + data['image']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['meta'])) {
            throw new Error("Expected the field `meta` to be an array in the JSON data but got " + data['meta']);
        }
        // validate the optional field `nutrition`
        if (data['nutrition']) { // data not null
          ParseIngredients200ResponseInnerNutrition.validateJSON(data['nutrition']);
        }

        return true;
    }


}

ParseIngredients200ResponseInner.RequiredProperties = ["id", "original", "originalName", "name", "nameClean", "amount", "unit", "unitShort", "unitLong", "possibleUnits", "estimatedCost", "consistency", "aisle", "image", "meta", "nutrition"];

/**
 * @member {Number} id
 */
ParseIngredients200ResponseInner.prototype['id'] = undefined;

/**
 * @member {String} original
 */
ParseIngredients200ResponseInner.prototype['original'] = undefined;

/**
 * @member {String} originalName
 */
ParseIngredients200ResponseInner.prototype['originalName'] = undefined;

/**
 * @member {String} name
 */
ParseIngredients200ResponseInner.prototype['name'] = undefined;

/**
 * @member {String} nameClean
 */
ParseIngredients200ResponseInner.prototype['nameClean'] = undefined;

/**
 * @member {Number} amount
 */
ParseIngredients200ResponseInner.prototype['amount'] = undefined;

/**
 * @member {String} unit
 */
ParseIngredients200ResponseInner.prototype['unit'] = undefined;

/**
 * @member {String} unitShort
 */
ParseIngredients200ResponseInner.prototype['unitShort'] = undefined;

/**
 * @member {String} unitLong
 */
ParseIngredients200ResponseInner.prototype['unitLong'] = undefined;

/**
 * @member {Array.<String>} possibleUnits
 */
ParseIngredients200ResponseInner.prototype['possibleUnits'] = undefined;

/**
 * @member {module:model/ParseIngredients200ResponseInnerEstimatedCost} estimatedCost
 */
ParseIngredients200ResponseInner.prototype['estimatedCost'] = undefined;

/**
 * @member {String} consistency
 */
ParseIngredients200ResponseInner.prototype['consistency'] = undefined;

/**
 * @member {String} aisle
 */
ParseIngredients200ResponseInner.prototype['aisle'] = undefined;

/**
 * @member {String} image
 */
ParseIngredients200ResponseInner.prototype['image'] = undefined;

/**
 * @member {Array.<String>} meta
 */
ParseIngredients200ResponseInner.prototype['meta'] = undefined;

/**
 * @member {module:model/ParseIngredients200ResponseInnerNutrition} nutrition
 */
ParseIngredients200ResponseInner.prototype['nutrition'] = undefined;






export default ParseIngredients200ResponseInner;
