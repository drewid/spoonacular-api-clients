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

/**
 * The SearchFoodVideos200ResponseVideosInner model module.
 * @module model/SearchFoodVideos200ResponseVideosInner
 * @version 1.1
 */
class SearchFoodVideos200ResponseVideosInner {
    /**
     * Constructs a new <code>SearchFoodVideos200ResponseVideosInner</code>.
     * @alias module:model/SearchFoodVideos200ResponseVideosInner
     * @param title {String} 
     * @param length {Number} 
     * @param rating {Number} 
     * @param shortTitle {String} 
     * @param thumbnail {String} 
     * @param views {Number} 
     * @param youTubeId {String} 
     */
    constructor(title, length, rating, shortTitle, thumbnail, views, youTubeId) { 
        
        SearchFoodVideos200ResponseVideosInner.initialize(this, title, length, rating, shortTitle, thumbnail, views, youTubeId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, title, length, rating, shortTitle, thumbnail, views, youTubeId) { 
        obj['title'] = title;
        obj['length'] = length;
        obj['rating'] = rating;
        obj['shortTitle'] = shortTitle;
        obj['thumbnail'] = thumbnail;
        obj['views'] = views;
        obj['youTubeId'] = youTubeId;
    }

    /**
     * Constructs a <code>SearchFoodVideos200ResponseVideosInner</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SearchFoodVideos200ResponseVideosInner} obj Optional instance to populate.
     * @return {module:model/SearchFoodVideos200ResponseVideosInner} The populated <code>SearchFoodVideos200ResponseVideosInner</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SearchFoodVideos200ResponseVideosInner();

            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('length')) {
                obj['length'] = ApiClient.convertToType(data['length'], 'Number');
            }
            if (data.hasOwnProperty('rating')) {
                obj['rating'] = ApiClient.convertToType(data['rating'], 'Number');
            }
            if (data.hasOwnProperty('shortTitle')) {
                obj['shortTitle'] = ApiClient.convertToType(data['shortTitle'], 'String');
            }
            if (data.hasOwnProperty('thumbnail')) {
                obj['thumbnail'] = ApiClient.convertToType(data['thumbnail'], 'String');
            }
            if (data.hasOwnProperty('views')) {
                obj['views'] = ApiClient.convertToType(data['views'], 'Number');
            }
            if (data.hasOwnProperty('youTubeId')) {
                obj['youTubeId'] = ApiClient.convertToType(data['youTubeId'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>SearchFoodVideos200ResponseVideosInner</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>SearchFoodVideos200ResponseVideosInner</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of SearchFoodVideos200ResponseVideosInner.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['title'] && !(typeof data['title'] === 'string' || data['title'] instanceof String)) {
            throw new Error("Expected the field `title` to be a primitive type in the JSON string but got " + data['title']);
        }
        // ensure the json data is a string
        if (data['shortTitle'] && !(typeof data['shortTitle'] === 'string' || data['shortTitle'] instanceof String)) {
            throw new Error("Expected the field `shortTitle` to be a primitive type in the JSON string but got " + data['shortTitle']);
        }
        // ensure the json data is a string
        if (data['thumbnail'] && !(typeof data['thumbnail'] === 'string' || data['thumbnail'] instanceof String)) {
            throw new Error("Expected the field `thumbnail` to be a primitive type in the JSON string but got " + data['thumbnail']);
        }
        // ensure the json data is a string
        if (data['youTubeId'] && !(typeof data['youTubeId'] === 'string' || data['youTubeId'] instanceof String)) {
            throw new Error("Expected the field `youTubeId` to be a primitive type in the JSON string but got " + data['youTubeId']);
        }

        return true;
    }


}

SearchFoodVideos200ResponseVideosInner.RequiredProperties = ["title", "length", "rating", "shortTitle", "thumbnail", "views", "youTubeId"];

/**
 * @member {String} title
 */
SearchFoodVideos200ResponseVideosInner.prototype['title'] = undefined;

/**
 * @member {Number} length
 */
SearchFoodVideos200ResponseVideosInner.prototype['length'] = undefined;

/**
 * @member {Number} rating
 */
SearchFoodVideos200ResponseVideosInner.prototype['rating'] = undefined;

/**
 * @member {String} shortTitle
 */
SearchFoodVideos200ResponseVideosInner.prototype['shortTitle'] = undefined;

/**
 * @member {String} thumbnail
 */
SearchFoodVideos200ResponseVideosInner.prototype['thumbnail'] = undefined;

/**
 * @member {Number} views
 */
SearchFoodVideos200ResponseVideosInner.prototype['views'] = undefined;

/**
 * @member {String} youTubeId
 */
SearchFoodVideos200ResponseVideosInner.prototype['youTubeId'] = undefined;






export default SearchFoodVideos200ResponseVideosInner;
