package com.spoonacular.client.model

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import com.spoonacular.client.model.BigDecimal

/**
 * 
 * @param difference 
 * @param id 
 * @param image 
 * @param title 
 */
case class GetComparableProducts200ResponseComparableProductsProteinInner(difference: BigDecimal,
                id: Int,
                image: String,
                title: String
                )

object GetComparableProducts200ResponseComparableProductsProteinInner {
    /**
     * Creates the codec for converting GetComparableProducts200ResponseComparableProductsProteinInner from and to JSON.
     */
    implicit val decoder: Decoder[GetComparableProducts200ResponseComparableProductsProteinInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetComparableProducts200ResponseComparableProductsProteinInner] = deriveEncoder
}
