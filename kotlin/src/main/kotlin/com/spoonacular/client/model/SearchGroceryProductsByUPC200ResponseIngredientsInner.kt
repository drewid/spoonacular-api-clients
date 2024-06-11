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

package com.spoonacular.client.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param name 
 * @param description 
 * @param safetyLevel 
 */


data class SearchGroceryProductsByUPC200ResponseIngredientsInner (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "safety_level")
    val safetyLevel: kotlin.String? = null

)

