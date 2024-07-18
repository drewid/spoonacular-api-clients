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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.SpoonacularApi);
  }
}(this, function(expect, SpoonacularApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new SpoonacularApi.SearchRestaurants200ResponseRestaurantsInnerAddress();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('SearchRestaurants200ResponseRestaurantsInnerAddress', function() {
    it('should create an instance of SearchRestaurants200ResponseRestaurantsInnerAddress', function() {
      // uncomment below and update the code to test SearchRestaurants200ResponseRestaurantsInnerAddress
      //var instance = new SpoonacularApi.SearchRestaurants200ResponseRestaurantsInnerAddress();
      //expect(instance).to.be.a(SpoonacularApi.SearchRestaurants200ResponseRestaurantsInnerAddress);
    });

    it('should have the property streetAddr (base name: "street_addr")', function() {
      // uncomment below and update the code to test the property streetAddr
      //var instance = new SpoonacularApi.SearchRestaurants200ResponseRestaurantsInnerAddress();
      //expect(instance).to.be();
    });

    it('should have the property city (base name: "city")', function() {
      // uncomment below and update the code to test the property city
      //var instance = new SpoonacularApi.SearchRestaurants200ResponseRestaurantsInnerAddress();
      //expect(instance).to.be();
    });

    it('should have the property state (base name: "state")', function() {
      // uncomment below and update the code to test the property state
      //var instance = new SpoonacularApi.SearchRestaurants200ResponseRestaurantsInnerAddress();
      //expect(instance).to.be();
    });

    it('should have the property zipcode (base name: "zipcode")', function() {
      // uncomment below and update the code to test the property zipcode
      //var instance = new SpoonacularApi.SearchRestaurants200ResponseRestaurantsInnerAddress();
      //expect(instance).to.be();
    });

    it('should have the property country (base name: "country")', function() {
      // uncomment below and update the code to test the property country
      //var instance = new SpoonacularApi.SearchRestaurants200ResponseRestaurantsInnerAddress();
      //expect(instance).to.be();
    });

    it('should have the property lat (base name: "lat")', function() {
      // uncomment below and update the code to test the property lat
      //var instance = new SpoonacularApi.SearchRestaurants200ResponseRestaurantsInnerAddress();
      //expect(instance).to.be();
    });

    it('should have the property lon (base name: "lon")', function() {
      // uncomment below and update the code to test the property lon
      //var instance = new SpoonacularApi.SearchRestaurants200ResponseRestaurantsInnerAddress();
      //expect(instance).to.be();
    });

    it('should have the property streetAddr2 (base name: "street_addr_2")', function() {
      // uncomment below and update the code to test the property streetAddr2
      //var instance = new SpoonacularApi.SearchRestaurants200ResponseRestaurantsInnerAddress();
      //expect(instance).to.be();
    });

    it('should have the property latitude (base name: "latitude")', function() {
      // uncomment below and update the code to test the property latitude
      //var instance = new SpoonacularApi.SearchRestaurants200ResponseRestaurantsInnerAddress();
      //expect(instance).to.be();
    });

    it('should have the property longitude (base name: "longitude")', function() {
      // uncomment below and update the code to test the property longitude
      //var instance = new SpoonacularApi.SearchRestaurants200ResponseRestaurantsInnerAddress();
      //expect(instance).to.be();
    });

  });

}));
