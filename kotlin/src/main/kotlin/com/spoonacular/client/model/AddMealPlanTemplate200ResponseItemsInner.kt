/**
 * spoonacular API
 *
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 800,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.1
 * Contact: mail@spoonacular.com
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.spoonacular.client.model

import com.spoonacular.client.model.AddMealPlanTemplate200ResponseItemsInnerValue

import com.squareup.moshi.Json

/**
 * 
 *
 * @param day 
 * @param slot 
 * @param position 
 * @param type 
 * @param `value` 
 */

data class AddMealPlanTemplate200ResponseItemsInner (

    @Json(name = "day")
    val day: kotlin.Int,

    @Json(name = "slot")
    val slot: kotlin.Int,

    @Json(name = "position")
    val position: kotlin.Int,

    @Json(name = "type")
    val type: kotlin.String,

    @Json(name = "value")
    val `value`: AddMealPlanTemplate200ResponseItemsInnerValue? = null

)

