package com.spoonacular.client.model

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import com.spoonacular.client.model.BigDecimal

/**
 * 
 * @param name 
 * @param amount 
 * @param unit 
 * @param percentOfDailyNeeds 
 */
case class ParseIngredients200ResponseInnerNutritionNutrientsInner(name: String,
                amount: BigDecimal,
                unit: String,
                percentOfDailyNeeds: BigDecimal
                )

object ParseIngredients200ResponseInnerNutritionNutrientsInner {
    /**
     * Creates the codec for converting ParseIngredients200ResponseInnerNutritionNutrientsInner from and to JSON.
     */
    implicit val decoder: Decoder[ParseIngredients200ResponseInnerNutritionNutrientsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[ParseIngredients200ResponseInnerNutritionNutrientsInner] = deriveEncoder
}
