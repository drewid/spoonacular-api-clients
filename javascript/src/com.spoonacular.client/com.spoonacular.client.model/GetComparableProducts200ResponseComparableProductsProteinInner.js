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
 * The GetComparableProducts200ResponseComparableProductsProteinInner model module.
 * @module com.spoonacular.client/com.spoonacular.client.model/GetComparableProducts200ResponseComparableProductsProteinInner
 * @version 1.1
 */
class GetComparableProducts200ResponseComparableProductsProteinInner {
    /**
     * Constructs a new <code>GetComparableProducts200ResponseComparableProductsProteinInner</code>.
     * @alias module:com.spoonacular.client/com.spoonacular.client.model/GetComparableProducts200ResponseComparableProductsProteinInner
     * @param difference {Number} 
     * @param id {Number} 
     * @param image {String} 
     * @param title {String} 
     */
    constructor(difference, id, image, title) { 
        
        GetComparableProducts200ResponseComparableProductsProteinInner.initialize(this, difference, id, image, title);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, difference, id, image, title) { 
        obj['difference'] = difference;
        obj['id'] = id;
        obj['image'] = image;
        obj['title'] = title;
    }

    /**
     * Constructs a <code>GetComparableProducts200ResponseComparableProductsProteinInner</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:com.spoonacular.client/com.spoonacular.client.model/GetComparableProducts200ResponseComparableProductsProteinInner} obj Optional instance to populate.
     * @return {module:com.spoonacular.client/com.spoonacular.client.model/GetComparableProducts200ResponseComparableProductsProteinInner} The populated <code>GetComparableProducts200ResponseComparableProductsProteinInner</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetComparableProducts200ResponseComparableProductsProteinInner();

            if (data.hasOwnProperty('difference')) {
                obj['difference'] = ApiClient.convertToType(data['difference'], 'Number');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('image')) {
                obj['image'] = ApiClient.convertToType(data['image'], 'String');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {Number} difference
 */
GetComparableProducts200ResponseComparableProductsProteinInner.prototype['difference'] = undefined;

/**
 * @member {Number} id
 */
GetComparableProducts200ResponseComparableProductsProteinInner.prototype['id'] = undefined;

/**
 * @member {String} image
 */
GetComparableProducts200ResponseComparableProductsProteinInner.prototype['image'] = undefined;

/**
 * @member {String} title
 */
GetComparableProducts200ResponseComparableProductsProteinInner.prototype['title'] = undefined;






export default GetComparableProducts200ResponseComparableProductsProteinInner;

