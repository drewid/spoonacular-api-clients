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
    factory(root.expect, root.Spoonacular);
  }
}(this, function(expect, Spoonacular) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new Spoonacular.MenuItemsApi();
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

  describe('MenuItemsApi', function() {
    describe('autocompleteMenuItemSearch', function() {
      it('should call autocompleteMenuItemSearch successfully', function(done) {
        //uncomment below and update the code to test autocompleteMenuItemSearch
        //instance.autocompleteMenuItemSearch(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getMenuItemInformation', function() {
      it('should call getMenuItemInformation successfully', function(done) {
        //uncomment below and update the code to test getMenuItemInformation
        //instance.getMenuItemInformation(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('menuItemNutritionByIDImage', function() {
      it('should call menuItemNutritionByIDImage successfully', function(done) {
        //uncomment below and update the code to test menuItemNutritionByIDImage
        //instance.menuItemNutritionByIDImage(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('menuItemNutritionLabelImage', function() {
      it('should call menuItemNutritionLabelImage successfully', function(done) {
        //uncomment below and update the code to test menuItemNutritionLabelImage
        //instance.menuItemNutritionLabelImage(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('menuItemNutritionLabelWidget', function() {
      it('should call menuItemNutritionLabelWidget successfully', function(done) {
        //uncomment below and update the code to test menuItemNutritionLabelWidget
        //instance.menuItemNutritionLabelWidget(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('searchMenuItems', function() {
      it('should call searchMenuItems successfully', function(done) {
        //uncomment below and update the code to test searchMenuItems
        //instance.searchMenuItems(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('visualizeMenuItemNutritionByID', function() {
      it('should call visualizeMenuItemNutritionByID successfully', function(done) {
        //uncomment below and update the code to test visualizeMenuItemNutritionByID
        //instance.visualizeMenuItemNutritionByID(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
