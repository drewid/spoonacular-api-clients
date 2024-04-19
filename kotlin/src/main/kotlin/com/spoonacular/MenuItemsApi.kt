/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.spoonacular

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import com.spoonacular.client.model.AutocompleteMenuItemSearch200Response
import com.spoonacular.client.model.GetMenuItemInformation200Response
import com.spoonacular.client.model.SearchMenuItems200Response

import com.squareup.moshi.Json

import spoonacular.infrastructure.ApiClient
import spoonacular.infrastructure.ApiResponse
import spoonacular.infrastructure.ClientException
import spoonacular.infrastructure.ClientError
import spoonacular.infrastructure.ServerException
import spoonacular.infrastructure.ServerError
import spoonacular.infrastructure.MultiValueMap
import spoonacular.infrastructure.PartConfig
import spoonacular.infrastructure.RequestConfig
import spoonacular.infrastructure.RequestMethod
import spoonacular.infrastructure.ResponseType
import spoonacular.infrastructure.Success
import spoonacular.infrastructure.toMultiValue

class MenuItemsApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://api.spoonacular.com")
        }
    }

    /**
     * Autocomplete Menu Item Search
     * Generate suggestions for menu items based on a (partial) query. The matches will be found by looking in the title only.
     * @param query The (partial) search query.
     * @param number The number of results to return (between 1 and 25). (optional)
     * @return AutocompleteMenuItemSearch200Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun autocompleteMenuItemSearch(query: kotlin.String, number: java.math.BigDecimal? = null) : AutocompleteMenuItemSearch200Response {
        val localVarResponse = autocompleteMenuItemSearchWithHttpInfo(query = query, number = number)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AutocompleteMenuItemSearch200Response
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Autocomplete Menu Item Search
     * Generate suggestions for menu items based on a (partial) query. The matches will be found by looking in the title only.
     * @param query The (partial) search query.
     * @param number The number of results to return (between 1 and 25). (optional)
     * @return ApiResponse<AutocompleteMenuItemSearch200Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun autocompleteMenuItemSearchWithHttpInfo(query: kotlin.String, number: java.math.BigDecimal?) : ApiResponse<AutocompleteMenuItemSearch200Response?> {
        val localVariableConfig = autocompleteMenuItemSearchRequestConfig(query = query, number = number)

        return request<Unit, AutocompleteMenuItemSearch200Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation autocompleteMenuItemSearch
     *
     * @param query The (partial) search query.
     * @param number The number of results to return (between 1 and 25). (optional)
     * @return RequestConfig
     */
    fun autocompleteMenuItemSearchRequestConfig(query: kotlin.String, number: java.math.BigDecimal?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("query", listOf(query.toString()))
                if (number != null) {
                    put("number", listOf(number.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/food/menuItems/suggest",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get Menu Item Information
     * Use a menu item id to get all available information about a menu item, such as nutrition.
     * @param id The item&#39;s id.
     * @return GetMenuItemInformation200Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getMenuItemInformation(id: kotlin.Int) : GetMenuItemInformation200Response {
        val localVarResponse = getMenuItemInformationWithHttpInfo(id = id)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetMenuItemInformation200Response
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Get Menu Item Information
     * Use a menu item id to get all available information about a menu item, such as nutrition.
     * @param id The item&#39;s id.
     * @return ApiResponse<GetMenuItemInformation200Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getMenuItemInformationWithHttpInfo(id: kotlin.Int) : ApiResponse<GetMenuItemInformation200Response?> {
        val localVariableConfig = getMenuItemInformationRequestConfig(id = id)

        return request<Unit, GetMenuItemInformation200Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getMenuItemInformation
     *
     * @param id The item&#39;s id.
     * @return RequestConfig
     */
    fun getMenuItemInformationRequestConfig(id: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/food/menuItems/{id}".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Menu Item Nutrition by ID Image
     * Visualize a menu item&#39;s nutritional information as HTML including CSS.
     * @param id The menu item id.
     * @return kotlin.Any
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun menuItemNutritionByIDImage(id: java.math.BigDecimal) : kotlin.Any {
        val localVarResponse = menuItemNutritionByIDImageWithHttpInfo(id = id)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Any
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Menu Item Nutrition by ID Image
     * Visualize a menu item&#39;s nutritional information as HTML including CSS.
     * @param id The menu item id.
     * @return ApiResponse<kotlin.Any?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun menuItemNutritionByIDImageWithHttpInfo(id: java.math.BigDecimal) : ApiResponse<kotlin.Any?> {
        val localVariableConfig = menuItemNutritionByIDImageRequestConfig(id = id)

        return request<Unit, kotlin.Any>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation menuItemNutritionByIDImage
     *
     * @param id The menu item id.
     * @return RequestConfig
     */
    fun menuItemNutritionByIDImageRequestConfig(id: java.math.BigDecimal) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        return RequestConfig(
            method = RequestMethod.GET,
            path = "/food/menuItems/{id}/nutritionWidget.png".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Menu Item Nutrition Label Image
     * Visualize a menu item&#39;s nutritional label information as an image.
     * @param id The menu item id.
     * @param showOptionalNutrients Whether to show optional nutrients. (optional)
     * @param showZeroValues Whether to show zero values. (optional)
     * @param showIngredients Whether to show a list of ingredients. (optional)
     * @return kotlin.Any
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun menuItemNutritionLabelImage(id: java.math.BigDecimal, showOptionalNutrients: kotlin.Boolean? = null, showZeroValues: kotlin.Boolean? = null, showIngredients: kotlin.Boolean? = null) : kotlin.Any {
        val localVarResponse = menuItemNutritionLabelImageWithHttpInfo(id = id, showOptionalNutrients = showOptionalNutrients, showZeroValues = showZeroValues, showIngredients = showIngredients)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.Any
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Menu Item Nutrition Label Image
     * Visualize a menu item&#39;s nutritional label information as an image.
     * @param id The menu item id.
     * @param showOptionalNutrients Whether to show optional nutrients. (optional)
     * @param showZeroValues Whether to show zero values. (optional)
     * @param showIngredients Whether to show a list of ingredients. (optional)
     * @return ApiResponse<kotlin.Any?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun menuItemNutritionLabelImageWithHttpInfo(id: java.math.BigDecimal, showOptionalNutrients: kotlin.Boolean?, showZeroValues: kotlin.Boolean?, showIngredients: kotlin.Boolean?) : ApiResponse<kotlin.Any?> {
        val localVariableConfig = menuItemNutritionLabelImageRequestConfig(id = id, showOptionalNutrients = showOptionalNutrients, showZeroValues = showZeroValues, showIngredients = showIngredients)

        return request<Unit, kotlin.Any>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation menuItemNutritionLabelImage
     *
     * @param id The menu item id.
     * @param showOptionalNutrients Whether to show optional nutrients. (optional)
     * @param showZeroValues Whether to show zero values. (optional)
     * @param showIngredients Whether to show a list of ingredients. (optional)
     * @return RequestConfig
     */
    fun menuItemNutritionLabelImageRequestConfig(id: java.math.BigDecimal, showOptionalNutrients: kotlin.Boolean?, showZeroValues: kotlin.Boolean?, showIngredients: kotlin.Boolean?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (showOptionalNutrients != null) {
                    put("showOptionalNutrients", listOf(showOptionalNutrients.toString()))
                }
                if (showZeroValues != null) {
                    put("showZeroValues", listOf(showZeroValues.toString()))
                }
                if (showIngredients != null) {
                    put("showIngredients", listOf(showIngredients.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        return RequestConfig(
            method = RequestMethod.GET,
            path = "/food/menuItems/{id}/nutritionLabel.png".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Menu Item Nutrition Label Widget
     * Visualize a menu item&#39;s nutritional label information as HTML including CSS.
     * @param id The menu item id.
     * @param defaultCss Whether the default CSS should be added to the response. (optional, default to true)
     * @param showOptionalNutrients Whether to show optional nutrients. (optional)
     * @param showZeroValues Whether to show zero values. (optional)
     * @param showIngredients Whether to show a list of ingredients. (optional)
     * @return kotlin.String
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun menuItemNutritionLabelWidget(id: java.math.BigDecimal, defaultCss: kotlin.Boolean? = true, showOptionalNutrients: kotlin.Boolean? = null, showZeroValues: kotlin.Boolean? = null, showIngredients: kotlin.Boolean? = null) : kotlin.String {
        val localVarResponse = menuItemNutritionLabelWidgetWithHttpInfo(id = id, defaultCss = defaultCss, showOptionalNutrients = showOptionalNutrients, showZeroValues = showZeroValues, showIngredients = showIngredients)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.String
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Menu Item Nutrition Label Widget
     * Visualize a menu item&#39;s nutritional label information as HTML including CSS.
     * @param id The menu item id.
     * @param defaultCss Whether the default CSS should be added to the response. (optional, default to true)
     * @param showOptionalNutrients Whether to show optional nutrients. (optional)
     * @param showZeroValues Whether to show zero values. (optional)
     * @param showIngredients Whether to show a list of ingredients. (optional)
     * @return ApiResponse<kotlin.String?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun menuItemNutritionLabelWidgetWithHttpInfo(id: java.math.BigDecimal, defaultCss: kotlin.Boolean?, showOptionalNutrients: kotlin.Boolean?, showZeroValues: kotlin.Boolean?, showIngredients: kotlin.Boolean?) : ApiResponse<kotlin.String?> {
        val localVariableConfig = menuItemNutritionLabelWidgetRequestConfig(id = id, defaultCss = defaultCss, showOptionalNutrients = showOptionalNutrients, showZeroValues = showZeroValues, showIngredients = showIngredients)

        return request<Unit, kotlin.String>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation menuItemNutritionLabelWidget
     *
     * @param id The menu item id.
     * @param defaultCss Whether the default CSS should be added to the response. (optional, default to true)
     * @param showOptionalNutrients Whether to show optional nutrients. (optional)
     * @param showZeroValues Whether to show zero values. (optional)
     * @param showIngredients Whether to show a list of ingredients. (optional)
     * @return RequestConfig
     */
    fun menuItemNutritionLabelWidgetRequestConfig(id: java.math.BigDecimal, defaultCss: kotlin.Boolean?, showOptionalNutrients: kotlin.Boolean?, showZeroValues: kotlin.Boolean?, showIngredients: kotlin.Boolean?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (defaultCss != null) {
                    put("defaultCss", listOf(defaultCss.toString()))
                }
                if (showOptionalNutrients != null) {
                    put("showOptionalNutrients", listOf(showOptionalNutrients.toString()))
                }
                if (showZeroValues != null) {
                    put("showZeroValues", listOf(showZeroValues.toString()))
                }
                if (showIngredients != null) {
                    put("showIngredients", listOf(showIngredients.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        return RequestConfig(
            method = RequestMethod.GET,
            path = "/food/menuItems/{id}/nutritionLabel".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Search Menu Items
     * Search over 115,000 menu items from over 800 fast food and chain restaurants. For example, McDonald&#39;s Big Mac or Starbucks Mocha.
     * @param query The (natural language) search query. (optional)
     * @param minCalories The minimum amount of calories the menu item must have. (optional)
     * @param maxCalories The maximum amount of calories the menu item can have. (optional)
     * @param minCarbs The minimum amount of carbohydrates in grams the menu item must have. (optional)
     * @param maxCarbs The maximum amount of carbohydrates in grams the menu item can have. (optional)
     * @param minProtein The minimum amount of protein in grams the menu item must have. (optional)
     * @param maxProtein The maximum amount of protein in grams the menu item can have. (optional)
     * @param minFat The minimum amount of fat in grams the menu item must have. (optional)
     * @param maxFat The maximum amount of fat in grams the menu item can have. (optional)
     * @param addMenuItemInformation If set to true, you get more information about the menu items returned. (optional)
     * @param offset The number of results to skip (between 0 and 900). (optional)
     * @param number The maximum number of items to return (between 1 and 100). Defaults to 10. (optional, default to 10)
     * @return SearchMenuItems200Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun searchMenuItems(query: kotlin.String? = null, minCalories: java.math.BigDecimal? = null, maxCalories: java.math.BigDecimal? = null, minCarbs: java.math.BigDecimal? = null, maxCarbs: java.math.BigDecimal? = null, minProtein: java.math.BigDecimal? = null, maxProtein: java.math.BigDecimal? = null, minFat: java.math.BigDecimal? = null, maxFat: java.math.BigDecimal? = null, addMenuItemInformation: kotlin.Boolean? = null, offset: kotlin.Int? = null, number: kotlin.Int? = 10) : SearchMenuItems200Response {
        val localVarResponse = searchMenuItemsWithHttpInfo(query = query, minCalories = minCalories, maxCalories = maxCalories, minCarbs = minCarbs, maxCarbs = maxCarbs, minProtein = minProtein, maxProtein = maxProtein, minFat = minFat, maxFat = maxFat, addMenuItemInformation = addMenuItemInformation, offset = offset, number = number)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as SearchMenuItems200Response
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Search Menu Items
     * Search over 115,000 menu items from over 800 fast food and chain restaurants. For example, McDonald&#39;s Big Mac or Starbucks Mocha.
     * @param query The (natural language) search query. (optional)
     * @param minCalories The minimum amount of calories the menu item must have. (optional)
     * @param maxCalories The maximum amount of calories the menu item can have. (optional)
     * @param minCarbs The minimum amount of carbohydrates in grams the menu item must have. (optional)
     * @param maxCarbs The maximum amount of carbohydrates in grams the menu item can have. (optional)
     * @param minProtein The minimum amount of protein in grams the menu item must have. (optional)
     * @param maxProtein The maximum amount of protein in grams the menu item can have. (optional)
     * @param minFat The minimum amount of fat in grams the menu item must have. (optional)
     * @param maxFat The maximum amount of fat in grams the menu item can have. (optional)
     * @param addMenuItemInformation If set to true, you get more information about the menu items returned. (optional)
     * @param offset The number of results to skip (between 0 and 900). (optional)
     * @param number The maximum number of items to return (between 1 and 100). Defaults to 10. (optional, default to 10)
     * @return ApiResponse<SearchMenuItems200Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun searchMenuItemsWithHttpInfo(query: kotlin.String?, minCalories: java.math.BigDecimal?, maxCalories: java.math.BigDecimal?, minCarbs: java.math.BigDecimal?, maxCarbs: java.math.BigDecimal?, minProtein: java.math.BigDecimal?, maxProtein: java.math.BigDecimal?, minFat: java.math.BigDecimal?, maxFat: java.math.BigDecimal?, addMenuItemInformation: kotlin.Boolean?, offset: kotlin.Int?, number: kotlin.Int?) : ApiResponse<SearchMenuItems200Response?> {
        val localVariableConfig = searchMenuItemsRequestConfig(query = query, minCalories = minCalories, maxCalories = maxCalories, minCarbs = minCarbs, maxCarbs = maxCarbs, minProtein = minProtein, maxProtein = maxProtein, minFat = minFat, maxFat = maxFat, addMenuItemInformation = addMenuItemInformation, offset = offset, number = number)

        return request<Unit, SearchMenuItems200Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation searchMenuItems
     *
     * @param query The (natural language) search query. (optional)
     * @param minCalories The minimum amount of calories the menu item must have. (optional)
     * @param maxCalories The maximum amount of calories the menu item can have. (optional)
     * @param minCarbs The minimum amount of carbohydrates in grams the menu item must have. (optional)
     * @param maxCarbs The maximum amount of carbohydrates in grams the menu item can have. (optional)
     * @param minProtein The minimum amount of protein in grams the menu item must have. (optional)
     * @param maxProtein The maximum amount of protein in grams the menu item can have. (optional)
     * @param minFat The minimum amount of fat in grams the menu item must have. (optional)
     * @param maxFat The maximum amount of fat in grams the menu item can have. (optional)
     * @param addMenuItemInformation If set to true, you get more information about the menu items returned. (optional)
     * @param offset The number of results to skip (between 0 and 900). (optional)
     * @param number The maximum number of items to return (between 1 and 100). Defaults to 10. (optional, default to 10)
     * @return RequestConfig
     */
    fun searchMenuItemsRequestConfig(query: kotlin.String?, minCalories: java.math.BigDecimal?, maxCalories: java.math.BigDecimal?, minCarbs: java.math.BigDecimal?, maxCarbs: java.math.BigDecimal?, minProtein: java.math.BigDecimal?, maxProtein: java.math.BigDecimal?, minFat: java.math.BigDecimal?, maxFat: java.math.BigDecimal?, addMenuItemInformation: kotlin.Boolean?, offset: kotlin.Int?, number: kotlin.Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (query != null) {
                    put("query", listOf(query.toString()))
                }
                if (minCalories != null) {
                    put("minCalories", listOf(minCalories.toString()))
                }
                if (maxCalories != null) {
                    put("maxCalories", listOf(maxCalories.toString()))
                }
                if (minCarbs != null) {
                    put("minCarbs", listOf(minCarbs.toString()))
                }
                if (maxCarbs != null) {
                    put("maxCarbs", listOf(maxCarbs.toString()))
                }
                if (minProtein != null) {
                    put("minProtein", listOf(minProtein.toString()))
                }
                if (maxProtein != null) {
                    put("maxProtein", listOf(maxProtein.toString()))
                }
                if (minFat != null) {
                    put("minFat", listOf(minFat.toString()))
                }
                if (maxFat != null) {
                    put("maxFat", listOf(maxFat.toString()))
                }
                if (addMenuItemInformation != null) {
                    put("addMenuItemInformation", listOf(addMenuItemInformation.toString()))
                }
                if (offset != null) {
                    put("offset", listOf(offset.toString()))
                }
                if (number != null) {
                    put("number", listOf(number.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/food/menuItems/search",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter accept
     */
     enum class AcceptVisualizeMenuItemNutritionByID(val value: kotlin.String) {
         @Json(name = "application/json") applicationSlashJson("application/json"),
         @Json(name = "text/html") textSlashHtml("text/html"),
         @Json(name = "media/_*") mediaSlashStar("media/_*")
     }

    /**
     * Menu Item Nutrition by ID Widget
     * Visualize a menu item&#39;s nutritional information as HTML including CSS.
     * @param id The item&#39;s id.
     * @param defaultCss Whether the default CSS should be added to the response. (optional, default to true)
     * @param accept Accept header. (optional)
     * @return kotlin.String
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun visualizeMenuItemNutritionByID(id: kotlin.Int, defaultCss: kotlin.Boolean? = true, accept: AcceptVisualizeMenuItemNutritionByID? = null) : kotlin.String {
        val localVarResponse = visualizeMenuItemNutritionByIDWithHttpInfo(id = id, defaultCss = defaultCss, accept = accept)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.String
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Menu Item Nutrition by ID Widget
     * Visualize a menu item&#39;s nutritional information as HTML including CSS.
     * @param id The item&#39;s id.
     * @param defaultCss Whether the default CSS should be added to the response. (optional, default to true)
     * @param accept Accept header. (optional)
     * @return ApiResponse<kotlin.String?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun visualizeMenuItemNutritionByIDWithHttpInfo(id: kotlin.Int, defaultCss: kotlin.Boolean?, accept: AcceptVisualizeMenuItemNutritionByID?) : ApiResponse<kotlin.String?> {
        val localVariableConfig = visualizeMenuItemNutritionByIDRequestConfig(id = id, defaultCss = defaultCss, accept = accept)

        return request<Unit, kotlin.String>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation visualizeMenuItemNutritionByID
     *
     * @param id The item&#39;s id.
     * @param defaultCss Whether the default CSS should be added to the response. (optional, default to true)
     * @param accept Accept header. (optional)
     * @return RequestConfig
     */
    fun visualizeMenuItemNutritionByIDRequestConfig(id: kotlin.Int, defaultCss: kotlin.Boolean?, accept: AcceptVisualizeMenuItemNutritionByID?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (defaultCss != null) {
                    put("defaultCss", listOf(defaultCss.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        accept?.apply { localVariableHeaders["Accept"] = this.toString() }
        
        return RequestConfig(
            method = RequestMethod.GET,
            path = "/food/menuItems/{id}/nutritionWidget".replace("{"+"id"+"}", encodeURIComponent(id.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
