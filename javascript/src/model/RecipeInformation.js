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
import RecipeInformationExtendedIngredientsInner from './RecipeInformationExtendedIngredientsInner';
import RecipeInformationWinePairing from './RecipeInformationWinePairing';
import TasteInformation from './TasteInformation';

/**
 * The RecipeInformation model module.
 * @module model/RecipeInformation
 * @version 2.0.1
 */
class RecipeInformation {
    /**
     * Constructs a new <code>RecipeInformation</code>.
     * 
     * @alias module:model/RecipeInformation
     * @param id {Number} 
     * @param title {String} 
     * @param image {String} 
     * @param servings {Number} 
     * @param readyInMinutes {Number} 
     * @param sourceName {String} 
     * @param sourceUrl {String} 
     * @param spoonacularSourceUrl {String} 
     * @param aggregateLikes {Number} 
     * @param healthScore {Number} 
     * @param spoonacularScore {Number} 
     * @param pricePerServing {Number} 
     * @param analyzedInstructions {Array.<Object>} 
     * @param cheap {Boolean} 
     * @param creditsText {String} 
     * @param cuisines {Array.<String>} 
     * @param dairyFree {Boolean} 
     * @param diets {Array.<String>} 
     * @param gaps {String} 
     * @param glutenFree {Boolean} 
     * @param instructions {String} 
     * @param lowFodmap {Boolean} 
     * @param occasions {Array.<String>} 
     * @param sustainable {Boolean} 
     * @param vegan {Boolean} 
     * @param vegetarian {Boolean} 
     * @param veryHealthy {Boolean} 
     * @param veryPopular {Boolean} 
     * @param weightWatcherSmartPoints {Number} 
     * @param dishTypes {Array.<String>} 
     * @param extendedIngredients {Array.<module:model/RecipeInformationExtendedIngredientsInner>} 
     * @param summary {String} 
     */
    constructor(id, title, image, servings, readyInMinutes, sourceName, sourceUrl, spoonacularSourceUrl, aggregateLikes, healthScore, spoonacularScore, pricePerServing, analyzedInstructions, cheap, creditsText, cuisines, dairyFree, diets, gaps, glutenFree, instructions, lowFodmap, occasions, sustainable, vegan, vegetarian, veryHealthy, veryPopular, weightWatcherSmartPoints, dishTypes, extendedIngredients, summary) { 
        
        RecipeInformation.initialize(this, id, title, image, servings, readyInMinutes, sourceName, sourceUrl, spoonacularSourceUrl, aggregateLikes, healthScore, spoonacularScore, pricePerServing, analyzedInstructions, cheap, creditsText, cuisines, dairyFree, diets, gaps, glutenFree, instructions, lowFodmap, occasions, sustainable, vegan, vegetarian, veryHealthy, veryPopular, weightWatcherSmartPoints, dishTypes, extendedIngredients, summary);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, title, image, servings, readyInMinutes, sourceName, sourceUrl, spoonacularSourceUrl, aggregateLikes, healthScore, spoonacularScore, pricePerServing, analyzedInstructions, cheap, creditsText, cuisines, dairyFree, diets, gaps, glutenFree, instructions, lowFodmap, occasions, sustainable, vegan, vegetarian, veryHealthy, veryPopular, weightWatcherSmartPoints, dishTypes, extendedIngredients, summary) { 
        obj['id'] = id;
        obj['title'] = title;
        obj['image'] = image;
        obj['servings'] = servings;
        obj['readyInMinutes'] = readyInMinutes;
        obj['sourceName'] = sourceName;
        obj['sourceUrl'] = sourceUrl;
        obj['spoonacularSourceUrl'] = spoonacularSourceUrl;
        obj['aggregateLikes'] = aggregateLikes;
        obj['healthScore'] = healthScore;
        obj['spoonacularScore'] = spoonacularScore;
        obj['pricePerServing'] = pricePerServing;
        obj['analyzedInstructions'] = analyzedInstructions;
        obj['cheap'] = cheap;
        obj['creditsText'] = creditsText;
        obj['cuisines'] = cuisines;
        obj['dairyFree'] = dairyFree;
        obj['diets'] = diets;
        obj['gaps'] = gaps;
        obj['glutenFree'] = glutenFree;
        obj['instructions'] = instructions;
        obj['lowFodmap'] = lowFodmap;
        obj['occasions'] = occasions;
        obj['sustainable'] = sustainable;
        obj['vegan'] = vegan;
        obj['vegetarian'] = vegetarian;
        obj['veryHealthy'] = veryHealthy;
        obj['veryPopular'] = veryPopular;
        obj['weightWatcherSmartPoints'] = weightWatcherSmartPoints;
        obj['dishTypes'] = dishTypes;
        obj['extendedIngredients'] = extendedIngredients;
        obj['summary'] = summary;
    }

    /**
     * Constructs a <code>RecipeInformation</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RecipeInformation} obj Optional instance to populate.
     * @return {module:model/RecipeInformation} The populated <code>RecipeInformation</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RecipeInformation();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('image')) {
                obj['image'] = ApiClient.convertToType(data['image'], 'String');
            }
            if (data.hasOwnProperty('imageType')) {
                obj['imageType'] = ApiClient.convertToType(data['imageType'], 'String');
            }
            if (data.hasOwnProperty('servings')) {
                obj['servings'] = ApiClient.convertToType(data['servings'], 'Number');
            }
            if (data.hasOwnProperty('readyInMinutes')) {
                obj['readyInMinutes'] = ApiClient.convertToType(data['readyInMinutes'], 'Number');
            }
            if (data.hasOwnProperty('preparationMinutes')) {
                obj['preparationMinutes'] = ApiClient.convertToType(data['preparationMinutes'], 'Number');
            }
            if (data.hasOwnProperty('cookingMinutes')) {
                obj['cookingMinutes'] = ApiClient.convertToType(data['cookingMinutes'], 'Number');
            }
            if (data.hasOwnProperty('license')) {
                obj['license'] = ApiClient.convertToType(data['license'], 'String');
            }
            if (data.hasOwnProperty('sourceName')) {
                obj['sourceName'] = ApiClient.convertToType(data['sourceName'], 'String');
            }
            if (data.hasOwnProperty('sourceUrl')) {
                obj['sourceUrl'] = ApiClient.convertToType(data['sourceUrl'], 'String');
            }
            if (data.hasOwnProperty('spoonacularSourceUrl')) {
                obj['spoonacularSourceUrl'] = ApiClient.convertToType(data['spoonacularSourceUrl'], 'String');
            }
            if (data.hasOwnProperty('aggregateLikes')) {
                obj['aggregateLikes'] = ApiClient.convertToType(data['aggregateLikes'], 'Number');
            }
            if (data.hasOwnProperty('healthScore')) {
                obj['healthScore'] = ApiClient.convertToType(data['healthScore'], 'Number');
            }
            if (data.hasOwnProperty('spoonacularScore')) {
                obj['spoonacularScore'] = ApiClient.convertToType(data['spoonacularScore'], 'Number');
            }
            if (data.hasOwnProperty('pricePerServing')) {
                obj['pricePerServing'] = ApiClient.convertToType(data['pricePerServing'], 'Number');
            }
            if (data.hasOwnProperty('analyzedInstructions')) {
                obj['analyzedInstructions'] = ApiClient.convertToType(data['analyzedInstructions'], [Object]);
            }
            if (data.hasOwnProperty('cheap')) {
                obj['cheap'] = ApiClient.convertToType(data['cheap'], 'Boolean');
            }
            if (data.hasOwnProperty('creditsText')) {
                obj['creditsText'] = ApiClient.convertToType(data['creditsText'], 'String');
            }
            if (data.hasOwnProperty('cuisines')) {
                obj['cuisines'] = ApiClient.convertToType(data['cuisines'], ['String']);
            }
            if (data.hasOwnProperty('dairyFree')) {
                obj['dairyFree'] = ApiClient.convertToType(data['dairyFree'], 'Boolean');
            }
            if (data.hasOwnProperty('diets')) {
                obj['diets'] = ApiClient.convertToType(data['diets'], ['String']);
            }
            if (data.hasOwnProperty('gaps')) {
                obj['gaps'] = ApiClient.convertToType(data['gaps'], 'String');
            }
            if (data.hasOwnProperty('glutenFree')) {
                obj['glutenFree'] = ApiClient.convertToType(data['glutenFree'], 'Boolean');
            }
            if (data.hasOwnProperty('instructions')) {
                obj['instructions'] = ApiClient.convertToType(data['instructions'], 'String');
            }
            if (data.hasOwnProperty('lowFodmap')) {
                obj['lowFodmap'] = ApiClient.convertToType(data['lowFodmap'], 'Boolean');
            }
            if (data.hasOwnProperty('occasions')) {
                obj['occasions'] = ApiClient.convertToType(data['occasions'], ['String']);
            }
            if (data.hasOwnProperty('sustainable')) {
                obj['sustainable'] = ApiClient.convertToType(data['sustainable'], 'Boolean');
            }
            if (data.hasOwnProperty('vegan')) {
                obj['vegan'] = ApiClient.convertToType(data['vegan'], 'Boolean');
            }
            if (data.hasOwnProperty('vegetarian')) {
                obj['vegetarian'] = ApiClient.convertToType(data['vegetarian'], 'Boolean');
            }
            if (data.hasOwnProperty('veryHealthy')) {
                obj['veryHealthy'] = ApiClient.convertToType(data['veryHealthy'], 'Boolean');
            }
            if (data.hasOwnProperty('veryPopular')) {
                obj['veryPopular'] = ApiClient.convertToType(data['veryPopular'], 'Boolean');
            }
            if (data.hasOwnProperty('weightWatcherSmartPoints')) {
                obj['weightWatcherSmartPoints'] = ApiClient.convertToType(data['weightWatcherSmartPoints'], 'Number');
            }
            if (data.hasOwnProperty('dishTypes')) {
                obj['dishTypes'] = ApiClient.convertToType(data['dishTypes'], ['String']);
            }
            if (data.hasOwnProperty('extendedIngredients')) {
                obj['extendedIngredients'] = ApiClient.convertToType(data['extendedIngredients'], [RecipeInformationExtendedIngredientsInner]);
            }
            if (data.hasOwnProperty('summary')) {
                obj['summary'] = ApiClient.convertToType(data['summary'], 'String');
            }
            if (data.hasOwnProperty('winePairing')) {
                obj['winePairing'] = RecipeInformationWinePairing.constructFromObject(data['winePairing']);
            }
            if (data.hasOwnProperty('taste')) {
                obj['taste'] = TasteInformation.constructFromObject(data['taste']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RecipeInformation</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RecipeInformation</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of RecipeInformation.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['title'] && !(typeof data['title'] === 'string' || data['title'] instanceof String)) {
            throw new Error("Expected the field `title` to be a primitive type in the JSON string but got " + data['title']);
        }
        // ensure the json data is a string
        if (data['image'] && !(typeof data['image'] === 'string' || data['image'] instanceof String)) {
            throw new Error("Expected the field `image` to be a primitive type in the JSON string but got " + data['image']);
        }
        // ensure the json data is a string
        if (data['imageType'] && !(typeof data['imageType'] === 'string' || data['imageType'] instanceof String)) {
            throw new Error("Expected the field `imageType` to be a primitive type in the JSON string but got " + data['imageType']);
        }
        // ensure the json data is a string
        if (data['license'] && !(typeof data['license'] === 'string' || data['license'] instanceof String)) {
            throw new Error("Expected the field `license` to be a primitive type in the JSON string but got " + data['license']);
        }
        // ensure the json data is a string
        if (data['sourceName'] && !(typeof data['sourceName'] === 'string' || data['sourceName'] instanceof String)) {
            throw new Error("Expected the field `sourceName` to be a primitive type in the JSON string but got " + data['sourceName']);
        }
        // ensure the json data is a string
        if (data['sourceUrl'] && !(typeof data['sourceUrl'] === 'string' || data['sourceUrl'] instanceof String)) {
            throw new Error("Expected the field `sourceUrl` to be a primitive type in the JSON string but got " + data['sourceUrl']);
        }
        // ensure the json data is a string
        if (data['spoonacularSourceUrl'] && !(typeof data['spoonacularSourceUrl'] === 'string' || data['spoonacularSourceUrl'] instanceof String)) {
            throw new Error("Expected the field `spoonacularSourceUrl` to be a primitive type in the JSON string but got " + data['spoonacularSourceUrl']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['analyzedInstructions'])) {
            throw new Error("Expected the field `analyzedInstructions` to be an array in the JSON data but got " + data['analyzedInstructions']);
        }
        // ensure the json data is a string
        if (data['creditsText'] && !(typeof data['creditsText'] === 'string' || data['creditsText'] instanceof String)) {
            throw new Error("Expected the field `creditsText` to be a primitive type in the JSON string but got " + data['creditsText']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['cuisines'])) {
            throw new Error("Expected the field `cuisines` to be an array in the JSON data but got " + data['cuisines']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['diets'])) {
            throw new Error("Expected the field `diets` to be an array in the JSON data but got " + data['diets']);
        }
        // ensure the json data is a string
        if (data['gaps'] && !(typeof data['gaps'] === 'string' || data['gaps'] instanceof String)) {
            throw new Error("Expected the field `gaps` to be a primitive type in the JSON string but got " + data['gaps']);
        }
        // ensure the json data is a string
        if (data['instructions'] && !(typeof data['instructions'] === 'string' || data['instructions'] instanceof String)) {
            throw new Error("Expected the field `instructions` to be a primitive type in the JSON string but got " + data['instructions']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['occasions'])) {
            throw new Error("Expected the field `occasions` to be an array in the JSON data but got " + data['occasions']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['dishTypes'])) {
            throw new Error("Expected the field `dishTypes` to be an array in the JSON data but got " + data['dishTypes']);
        }
        if (data['extendedIngredients']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['extendedIngredients'])) {
                throw new Error("Expected the field `extendedIngredients` to be an array in the JSON data but got " + data['extendedIngredients']);
            }
            // validate the optional field `extendedIngredients` (array)
            for (const item of data['extendedIngredients']) {
                RecipeInformationExtendedIngredientsInner.validateJSON(item);
            };
        }
        // ensure the json data is a string
        if (data['summary'] && !(typeof data['summary'] === 'string' || data['summary'] instanceof String)) {
            throw new Error("Expected the field `summary` to be a primitive type in the JSON string but got " + data['summary']);
        }
        // validate the optional field `winePairing`
        if (data['winePairing']) { // data not null
          RecipeInformationWinePairing.validateJSON(data['winePairing']);
        }
        // validate the optional field `taste`
        if (data['taste']) { // data not null
          TasteInformation.validateJSON(data['taste']);
        }

        return true;
    }


}

RecipeInformation.RequiredProperties = ["id", "title", "image", "servings", "readyInMinutes", "sourceName", "sourceUrl", "spoonacularSourceUrl", "aggregateLikes", "healthScore", "spoonacularScore", "pricePerServing", "analyzedInstructions", "cheap", "creditsText", "cuisines", "dairyFree", "diets", "gaps", "glutenFree", "instructions", "lowFodmap", "occasions", "sustainable", "vegan", "vegetarian", "veryHealthy", "veryPopular", "weightWatcherSmartPoints", "dishTypes", "extendedIngredients", "summary"];

/**
 * @member {Number} id
 */
RecipeInformation.prototype['id'] = undefined;

/**
 * @member {String} title
 */
RecipeInformation.prototype['title'] = undefined;

/**
 * @member {String} image
 */
RecipeInformation.prototype['image'] = undefined;

/**
 * @member {String} imageType
 */
RecipeInformation.prototype['imageType'] = undefined;

/**
 * @member {Number} servings
 */
RecipeInformation.prototype['servings'] = undefined;

/**
 * @member {Number} readyInMinutes
 */
RecipeInformation.prototype['readyInMinutes'] = undefined;

/**
 * @member {Number} preparationMinutes
 */
RecipeInformation.prototype['preparationMinutes'] = undefined;

/**
 * @member {Number} cookingMinutes
 */
RecipeInformation.prototype['cookingMinutes'] = undefined;

/**
 * @member {String} license
 */
RecipeInformation.prototype['license'] = undefined;

/**
 * @member {String} sourceName
 */
RecipeInformation.prototype['sourceName'] = undefined;

/**
 * @member {String} sourceUrl
 */
RecipeInformation.prototype['sourceUrl'] = undefined;

/**
 * @member {String} spoonacularSourceUrl
 */
RecipeInformation.prototype['spoonacularSourceUrl'] = undefined;

/**
 * @member {Number} aggregateLikes
 */
RecipeInformation.prototype['aggregateLikes'] = undefined;

/**
 * @member {Number} healthScore
 */
RecipeInformation.prototype['healthScore'] = undefined;

/**
 * @member {Number} spoonacularScore
 */
RecipeInformation.prototype['spoonacularScore'] = undefined;

/**
 * @member {Number} pricePerServing
 */
RecipeInformation.prototype['pricePerServing'] = undefined;

/**
 * @member {Array.<Object>} analyzedInstructions
 */
RecipeInformation.prototype['analyzedInstructions'] = undefined;

/**
 * @member {Boolean} cheap
 */
RecipeInformation.prototype['cheap'] = undefined;

/**
 * @member {String} creditsText
 */
RecipeInformation.prototype['creditsText'] = undefined;

/**
 * @member {Array.<String>} cuisines
 */
RecipeInformation.prototype['cuisines'] = undefined;

/**
 * @member {Boolean} dairyFree
 */
RecipeInformation.prototype['dairyFree'] = undefined;

/**
 * @member {Array.<String>} diets
 */
RecipeInformation.prototype['diets'] = undefined;

/**
 * @member {String} gaps
 */
RecipeInformation.prototype['gaps'] = undefined;

/**
 * @member {Boolean} glutenFree
 */
RecipeInformation.prototype['glutenFree'] = undefined;

/**
 * @member {String} instructions
 */
RecipeInformation.prototype['instructions'] = undefined;

/**
 * @member {Boolean} lowFodmap
 */
RecipeInformation.prototype['lowFodmap'] = undefined;

/**
 * @member {Array.<String>} occasions
 */
RecipeInformation.prototype['occasions'] = undefined;

/**
 * @member {Boolean} sustainable
 */
RecipeInformation.prototype['sustainable'] = undefined;

/**
 * @member {Boolean} vegan
 */
RecipeInformation.prototype['vegan'] = undefined;

/**
 * @member {Boolean} vegetarian
 */
RecipeInformation.prototype['vegetarian'] = undefined;

/**
 * @member {Boolean} veryHealthy
 */
RecipeInformation.prototype['veryHealthy'] = undefined;

/**
 * @member {Boolean} veryPopular
 */
RecipeInformation.prototype['veryPopular'] = undefined;

/**
 * @member {Number} weightWatcherSmartPoints
 */
RecipeInformation.prototype['weightWatcherSmartPoints'] = undefined;

/**
 * @member {Array.<String>} dishTypes
 */
RecipeInformation.prototype['dishTypes'] = undefined;

/**
 * @member {Array.<module:model/RecipeInformationExtendedIngredientsInner>} extendedIngredients
 */
RecipeInformation.prototype['extendedIngredients'] = undefined;

/**
 * @member {String} summary
 */
RecipeInformation.prototype['summary'] = undefined;

/**
 * @member {module:model/RecipeInformationWinePairing} winePairing
 */
RecipeInformation.prototype['winePairing'] = undefined;

/**
 * @member {module:model/TasteInformation} taste
 */
RecipeInformation.prototype['taste'] = undefined;






export default RecipeInformation;

