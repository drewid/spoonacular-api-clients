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


import ApiClient from "../ApiClient";
import AddMealPlanTemplate200Response from '../model/AddMealPlanTemplate200Response';
import AddToMealPlanRequest from '../model/AddToMealPlanRequest';
import AddToShoppingListRequest from '../model/AddToShoppingListRequest';
import ConnectUser200Response from '../model/ConnectUser200Response';
import ConnectUserRequest from '../model/ConnectUserRequest';
import GenerateMealPlan200Response from '../model/GenerateMealPlan200Response';
import GetMealPlanTemplate200Response from '../model/GetMealPlanTemplate200Response';
import GetMealPlanTemplates200Response from '../model/GetMealPlanTemplates200Response';
import GetMealPlanWeek200Response from '../model/GetMealPlanWeek200Response';
import GetShoppingList200Response from '../model/GetShoppingList200Response';

/**
* MealPlanning service.
* @module api/MealPlanningApi
* @version 1.1
*/
export default class MealPlanningApi {

    /**
    * Constructs a new MealPlanningApi. 
    * @alias module:api/MealPlanningApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the addMealPlanTemplate operation.
     * @callback module:api/MealPlanningApi~addMealPlanTemplateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/AddMealPlanTemplate200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Add Meal Plan Template
     * Add a meal plan template for a user.
     * @param {String} username The username.
     * @param {String} hash The private hash for the username.
     * @param {module:api/MealPlanningApi~addMealPlanTemplateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/AddMealPlanTemplate200Response}
     */
    addMealPlanTemplate(username, hash, callback) {
      let postBody = null;
      // verify the required parameter 'username' is set
      if (username === undefined || username === null) {
        throw new Error("Missing the required parameter 'username' when calling addMealPlanTemplate");
      }
      // verify the required parameter 'hash' is set
      if (hash === undefined || hash === null) {
        throw new Error("Missing the required parameter 'hash' when calling addMealPlanTemplate");
      }

      let pathParams = {
        'username': username
      };
      let queryParams = {
        'hash': hash
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apiKeyScheme'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = AddMealPlanTemplate200Response;
      return this.apiClient.callApi(
        '/mealplanner/{username}/templates', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the addToMealPlan operation.
     * @callback module:api/MealPlanningApi~addToMealPlanCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Add to Meal Plan
     * Add an item to the user's meal plan.
     * @param {String} username The username.
     * @param {String} hash The private hash for the username.
     * @param {module:model/AddToMealPlanRequest} addToMealPlanRequest 
     * @param {module:api/MealPlanningApi~addToMealPlanCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    addToMealPlan(username, hash, addToMealPlanRequest, callback) {
      let postBody = addToMealPlanRequest;
      // verify the required parameter 'username' is set
      if (username === undefined || username === null) {
        throw new Error("Missing the required parameter 'username' when calling addToMealPlan");
      }
      // verify the required parameter 'hash' is set
      if (hash === undefined || hash === null) {
        throw new Error("Missing the required parameter 'hash' when calling addToMealPlan");
      }
      // verify the required parameter 'addToMealPlanRequest' is set
      if (addToMealPlanRequest === undefined || addToMealPlanRequest === null) {
        throw new Error("Missing the required parameter 'addToMealPlanRequest' when calling addToMealPlan");
      }

      let pathParams = {
        'username': username
      };
      let queryParams = {
        'hash': hash
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apiKeyScheme'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = Object;
      return this.apiClient.callApi(
        '/mealplanner/{username}/items', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the addToShoppingList operation.
     * @callback module:api/MealPlanningApi~addToShoppingListCallback
     * @param {String} error Error message, if any.
     * @param {module:model/GetShoppingList200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Add to Shopping List
     * Add an item to the current shopping list of a user.
     * @param {String} username The username.
     * @param {String} hash The private hash for the username.
     * @param {module:model/AddToShoppingListRequest} addToShoppingListRequest 
     * @param {module:api/MealPlanningApi~addToShoppingListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/GetShoppingList200Response}
     */
    addToShoppingList(username, hash, addToShoppingListRequest, callback) {
      let postBody = addToShoppingListRequest;
      // verify the required parameter 'username' is set
      if (username === undefined || username === null) {
        throw new Error("Missing the required parameter 'username' when calling addToShoppingList");
      }
      // verify the required parameter 'hash' is set
      if (hash === undefined || hash === null) {
        throw new Error("Missing the required parameter 'hash' when calling addToShoppingList");
      }
      // verify the required parameter 'addToShoppingListRequest' is set
      if (addToShoppingListRequest === undefined || addToShoppingListRequest === null) {
        throw new Error("Missing the required parameter 'addToShoppingListRequest' when calling addToShoppingList");
      }

      let pathParams = {
        'username': username
      };
      let queryParams = {
        'hash': hash
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apiKeyScheme'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = GetShoppingList200Response;
      return this.apiClient.callApi(
        '/mealplanner/{username}/shopping-list/items', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the clearMealPlanDay operation.
     * @callback module:api/MealPlanningApi~clearMealPlanDayCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Clear Meal Plan Day
     * Delete all planned items from the user's meal plan for a specific day.
     * @param {String} username The username.
     * @param {String} date The date in the format yyyy-mm-dd.
     * @param {String} hash The private hash for the username.
     * @param {module:api/MealPlanningApi~clearMealPlanDayCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    clearMealPlanDay(username, date, hash, callback) {
      let postBody = null;
      // verify the required parameter 'username' is set
      if (username === undefined || username === null) {
        throw new Error("Missing the required parameter 'username' when calling clearMealPlanDay");
      }
      // verify the required parameter 'date' is set
      if (date === undefined || date === null) {
        throw new Error("Missing the required parameter 'date' when calling clearMealPlanDay");
      }
      // verify the required parameter 'hash' is set
      if (hash === undefined || hash === null) {
        throw new Error("Missing the required parameter 'hash' when calling clearMealPlanDay");
      }

      let pathParams = {
        'username': username,
        'date': date
      };
      let queryParams = {
        'hash': hash
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apiKeyScheme'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = Object;
      return this.apiClient.callApi(
        '/mealplanner/{username}/day/{date}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the connectUser operation.
     * @callback module:api/MealPlanningApi~connectUserCallback
     * @param {String} error Error message, if any.
     * @param {module:model/ConnectUser200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Connect User
     * In order to call user-specific endpoints, you need to connect your app's users to spoonacular users.
     * @param {module:model/ConnectUserRequest} connectUserRequest 
     * @param {module:api/MealPlanningApi~connectUserCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/ConnectUser200Response}
     */
    connectUser(connectUserRequest, callback) {
      let postBody = connectUserRequest;
      // verify the required parameter 'connectUserRequest' is set
      if (connectUserRequest === undefined || connectUserRequest === null) {
        throw new Error("Missing the required parameter 'connectUserRequest' when calling connectUser");
      }

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apiKeyScheme'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = ConnectUser200Response;
      return this.apiClient.callApi(
        '/users/connect', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteFromMealPlan operation.
     * @callback module:api/MealPlanningApi~deleteFromMealPlanCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete from Meal Plan
     * Delete an item from the user's meal plan.
     * @param {String} username The username.
     * @param {Number} id The shopping list item id.
     * @param {String} hash The private hash for the username.
     * @param {module:api/MealPlanningApi~deleteFromMealPlanCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    deleteFromMealPlan(username, id, hash, callback) {
      let postBody = null;
      // verify the required parameter 'username' is set
      if (username === undefined || username === null) {
        throw new Error("Missing the required parameter 'username' when calling deleteFromMealPlan");
      }
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling deleteFromMealPlan");
      }
      // verify the required parameter 'hash' is set
      if (hash === undefined || hash === null) {
        throw new Error("Missing the required parameter 'hash' when calling deleteFromMealPlan");
      }

      let pathParams = {
        'username': username,
        'id': id
      };
      let queryParams = {
        'hash': hash
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apiKeyScheme'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = Object;
      return this.apiClient.callApi(
        '/mealplanner/{username}/items/{id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteFromShoppingList operation.
     * @callback module:api/MealPlanningApi~deleteFromShoppingListCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete from Shopping List
     * Delete an item from the current shopping list of the user.
     * @param {String} username The username.
     * @param {Number} id The shopping list item id.
     * @param {String} hash The private hash for the username.
     * @param {module:api/MealPlanningApi~deleteFromShoppingListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    deleteFromShoppingList(username, id, hash, callback) {
      let postBody = null;
      // verify the required parameter 'username' is set
      if (username === undefined || username === null) {
        throw new Error("Missing the required parameter 'username' when calling deleteFromShoppingList");
      }
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling deleteFromShoppingList");
      }
      // verify the required parameter 'hash' is set
      if (hash === undefined || hash === null) {
        throw new Error("Missing the required parameter 'hash' when calling deleteFromShoppingList");
      }

      let pathParams = {
        'username': username,
        'id': id
      };
      let queryParams = {
        'hash': hash
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apiKeyScheme'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = Object;
      return this.apiClient.callApi(
        '/mealplanner/{username}/shopping-list/items/{id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the deleteMealPlanTemplate operation.
     * @callback module:api/MealPlanningApi~deleteMealPlanTemplateCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Delete Meal Plan Template
     * Delete a meal plan template for a user.
     * @param {String} username The username.
     * @param {Number} id The shopping list item id.
     * @param {String} hash The private hash for the username.
     * @param {module:api/MealPlanningApi~deleteMealPlanTemplateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    deleteMealPlanTemplate(username, id, hash, callback) {
      let postBody = null;
      // verify the required parameter 'username' is set
      if (username === undefined || username === null) {
        throw new Error("Missing the required parameter 'username' when calling deleteMealPlanTemplate");
      }
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling deleteMealPlanTemplate");
      }
      // verify the required parameter 'hash' is set
      if (hash === undefined || hash === null) {
        throw new Error("Missing the required parameter 'hash' when calling deleteMealPlanTemplate");
      }

      let pathParams = {
        'username': username,
        'id': id
      };
      let queryParams = {
        'hash': hash
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apiKeyScheme'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = Object;
      return this.apiClient.callApi(
        '/mealplanner/{username}/templates/{id}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the generateMealPlan operation.
     * @callback module:api/MealPlanningApi~generateMealPlanCallback
     * @param {String} error Error message, if any.
     * @param {module:model/GenerateMealPlan200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Generate Meal Plan
     * Generate a meal plan with three meals per day (breakfast, lunch, and dinner).
     * @param {Object} opts Optional parameters
     * @param {String} [timeFrame] Either for one \"day\" or an entire \"week\".
     * @param {Number} [targetCalories] What is the caloric target for one day? The meal plan generator will try to get as close as possible to that goal.
     * @param {String} [diet] Enter a diet that the meal plan has to adhere to. See a full list of supported diets.
     * @param {String} [exclude] A comma-separated list of allergens or ingredients that must be excluded.
     * @param {module:api/MealPlanningApi~generateMealPlanCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/GenerateMealPlan200Response}
     */
    generateMealPlan(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'timeFrame': opts['timeFrame'],
        'targetCalories': opts['targetCalories'],
        'diet': opts['diet'],
        'exclude': opts['exclude']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apiKeyScheme'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = GenerateMealPlan200Response;
      return this.apiClient.callApi(
        '/mealplanner/generate', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the generateShoppingList operation.
     * @callback module:api/MealPlanningApi~generateShoppingListCallback
     * @param {String} error Error message, if any.
     * @param {module:model/GetShoppingList200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Generate Shopping List
     * Generate the shopping list for a user from the meal planner in a given time frame.
     * @param {String} username The username.
     * @param {String} startDate The start date in the format yyyy-mm-dd.
     * @param {String} endDate The end date in the format yyyy-mm-dd.
     * @param {String} hash The private hash for the username.
     * @param {module:api/MealPlanningApi~generateShoppingListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/GetShoppingList200Response}
     */
    generateShoppingList(username, startDate, endDate, hash, callback) {
      let postBody = null;
      // verify the required parameter 'username' is set
      if (username === undefined || username === null) {
        throw new Error("Missing the required parameter 'username' when calling generateShoppingList");
      }
      // verify the required parameter 'startDate' is set
      if (startDate === undefined || startDate === null) {
        throw new Error("Missing the required parameter 'startDate' when calling generateShoppingList");
      }
      // verify the required parameter 'endDate' is set
      if (endDate === undefined || endDate === null) {
        throw new Error("Missing the required parameter 'endDate' when calling generateShoppingList");
      }
      // verify the required parameter 'hash' is set
      if (hash === undefined || hash === null) {
        throw new Error("Missing the required parameter 'hash' when calling generateShoppingList");
      }

      let pathParams = {
        'username': username,
        'start_date': startDate,
        'end_date': endDate
      };
      let queryParams = {
        'hash': hash
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apiKeyScheme'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = GetShoppingList200Response;
      return this.apiClient.callApi(
        '/mealplanner/{username}/shopping-list/{start_date}/{end_date}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getMealPlanTemplate operation.
     * @callback module:api/MealPlanningApi~getMealPlanTemplateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/GetMealPlanTemplate200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get Meal Plan Template
     * Get information about a meal plan template.
     * @param {String} username The username.
     * @param {Number} id The shopping list item id.
     * @param {String} hash The private hash for the username.
     * @param {module:api/MealPlanningApi~getMealPlanTemplateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/GetMealPlanTemplate200Response}
     */
    getMealPlanTemplate(username, id, hash, callback) {
      let postBody = null;
      // verify the required parameter 'username' is set
      if (username === undefined || username === null) {
        throw new Error("Missing the required parameter 'username' when calling getMealPlanTemplate");
      }
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getMealPlanTemplate");
      }
      // verify the required parameter 'hash' is set
      if (hash === undefined || hash === null) {
        throw new Error("Missing the required parameter 'hash' when calling getMealPlanTemplate");
      }

      let pathParams = {
        'username': username,
        'id': id
      };
      let queryParams = {
        'hash': hash
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apiKeyScheme'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = GetMealPlanTemplate200Response;
      return this.apiClient.callApi(
        '/mealplanner/{username}/templates/{id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getMealPlanTemplates operation.
     * @callback module:api/MealPlanningApi~getMealPlanTemplatesCallback
     * @param {String} error Error message, if any.
     * @param {module:model/GetMealPlanTemplates200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get Meal Plan Templates
     * Get meal plan templates from user or public ones.
     * @param {String} username The username.
     * @param {String} hash The private hash for the username.
     * @param {module:api/MealPlanningApi~getMealPlanTemplatesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/GetMealPlanTemplates200Response}
     */
    getMealPlanTemplates(username, hash, callback) {
      let postBody = null;
      // verify the required parameter 'username' is set
      if (username === undefined || username === null) {
        throw new Error("Missing the required parameter 'username' when calling getMealPlanTemplates");
      }
      // verify the required parameter 'hash' is set
      if (hash === undefined || hash === null) {
        throw new Error("Missing the required parameter 'hash' when calling getMealPlanTemplates");
      }

      let pathParams = {
        'username': username
      };
      let queryParams = {
        'hash': hash
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apiKeyScheme'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = GetMealPlanTemplates200Response;
      return this.apiClient.callApi(
        '/mealplanner/{username}/templates', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getMealPlanWeek operation.
     * @callback module:api/MealPlanningApi~getMealPlanWeekCallback
     * @param {String} error Error message, if any.
     * @param {module:model/GetMealPlanWeek200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get Meal Plan Week
     * Retrieve a meal planned week for the given user. The username must be a spoonacular user and the hash must the the user's hash that can be found in his/her account.
     * @param {String} username The username.
     * @param {String} startDate The start date of the meal planned week in the format yyyy-mm-dd.
     * @param {String} hash The private hash for the username.
     * @param {module:api/MealPlanningApi~getMealPlanWeekCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/GetMealPlanWeek200Response}
     */
    getMealPlanWeek(username, startDate, hash, callback) {
      let postBody = null;
      // verify the required parameter 'username' is set
      if (username === undefined || username === null) {
        throw new Error("Missing the required parameter 'username' when calling getMealPlanWeek");
      }
      // verify the required parameter 'startDate' is set
      if (startDate === undefined || startDate === null) {
        throw new Error("Missing the required parameter 'startDate' when calling getMealPlanWeek");
      }
      // verify the required parameter 'hash' is set
      if (hash === undefined || hash === null) {
        throw new Error("Missing the required parameter 'hash' when calling getMealPlanWeek");
      }

      let pathParams = {
        'username': username,
        'start_date': startDate
      };
      let queryParams = {
        'hash': hash
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apiKeyScheme'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = GetMealPlanWeek200Response;
      return this.apiClient.callApi(
        '/mealplanner/{username}/week/{start_date}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getShoppingList operation.
     * @callback module:api/MealPlanningApi~getShoppingListCallback
     * @param {String} error Error message, if any.
     * @param {module:model/GetShoppingList200Response} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get Shopping List
     * Get the current shopping list for the given user.
     * @param {String} username The username.
     * @param {String} hash The private hash for the username.
     * @param {module:api/MealPlanningApi~getShoppingListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/GetShoppingList200Response}
     */
    getShoppingList(username, hash, callback) {
      let postBody = null;
      // verify the required parameter 'username' is set
      if (username === undefined || username === null) {
        throw new Error("Missing the required parameter 'username' when calling getShoppingList");
      }
      // verify the required parameter 'hash' is set
      if (hash === undefined || hash === null) {
        throw new Error("Missing the required parameter 'hash' when calling getShoppingList");
      }

      let pathParams = {
        'username': username
      };
      let queryParams = {
        'hash': hash
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apiKeyScheme'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = GetShoppingList200Response;
      return this.apiClient.callApi(
        '/mealplanner/{username}/shopping-list', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
