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
import GetWinePairing200ResponseProductMatchesInner from './GetWinePairing200ResponseProductMatchesInner';

/**
 * The GetWinePairing200Response model module.
 * @module model/GetWinePairing200Response
 * @version 2.0.1
 */
class GetWinePairing200Response {
    /**
     * Constructs a new <code>GetWinePairing200Response</code>.
     * 
     * @alias module:model/GetWinePairing200Response
     * @param pairedWines {Array.<String>} 
     * @param pairingText {String} 
     * @param productMatches {Array.<module:model/GetWinePairing200ResponseProductMatchesInner>} 
     */
    constructor(pairedWines, pairingText, productMatches) { 
        
        GetWinePairing200Response.initialize(this, pairedWines, pairingText, productMatches);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, pairedWines, pairingText, productMatches) { 
        obj['pairedWines'] = pairedWines;
        obj['pairingText'] = pairingText;
        obj['productMatches'] = productMatches;
    }

    /**
     * Constructs a <code>GetWinePairing200Response</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetWinePairing200Response} obj Optional instance to populate.
     * @return {module:model/GetWinePairing200Response} The populated <code>GetWinePairing200Response</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetWinePairing200Response();

            if (data.hasOwnProperty('pairedWines')) {
                obj['pairedWines'] = ApiClient.convertToType(data['pairedWines'], ['String']);
            }
            if (data.hasOwnProperty('pairingText')) {
                obj['pairingText'] = ApiClient.convertToType(data['pairingText'], 'String');
            }
            if (data.hasOwnProperty('productMatches')) {
                obj['productMatches'] = ApiClient.convertToType(data['productMatches'], [GetWinePairing200ResponseProductMatchesInner]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>GetWinePairing200Response</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>GetWinePairing200Response</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of GetWinePairing200Response.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is an array
        if (!Array.isArray(data['pairedWines'])) {
            throw new Error("Expected the field `pairedWines` to be an array in the JSON data but got " + data['pairedWines']);
        }
        // ensure the json data is a string
        if (data['pairingText'] && !(typeof data['pairingText'] === 'string' || data['pairingText'] instanceof String)) {
            throw new Error("Expected the field `pairingText` to be a primitive type in the JSON string but got " + data['pairingText']);
        }
        if (data['productMatches']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['productMatches'])) {
                throw new Error("Expected the field `productMatches` to be an array in the JSON data but got " + data['productMatches']);
            }
            // validate the optional field `productMatches` (array)
            for (const item of data['productMatches']) {
                GetWinePairing200ResponseProductMatchesInner.validateJSON(item);
            };
        }

        return true;
    }


}

GetWinePairing200Response.RequiredProperties = ["pairedWines", "pairingText", "productMatches"];

/**
 * @member {Array.<String>} pairedWines
 */
GetWinePairing200Response.prototype['pairedWines'] = undefined;

/**
 * @member {String} pairingText
 */
GetWinePairing200Response.prototype['pairingText'] = undefined;

/**
 * @member {Array.<module:model/GetWinePairing200ResponseProductMatchesInner>} productMatches
 */
GetWinePairing200Response.prototype['productMatches'] = undefined;






export default GetWinePairing200Response;

