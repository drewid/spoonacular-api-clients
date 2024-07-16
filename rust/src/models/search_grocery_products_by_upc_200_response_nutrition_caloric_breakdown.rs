/*
 * spoonacular API
 *
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.1
 * Contact: mail@spoonacular.com
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct SearchGroceryProductsByUpc200ResponseNutritionCaloricBreakdown {
    #[serde(rename = "percentProtein")]
    pub percent_protein: f64,
    #[serde(rename = "percentFat")]
    pub percent_fat: f64,
    #[serde(rename = "percentCarbs")]
    pub percent_carbs: f64,
}

impl SearchGroceryProductsByUpc200ResponseNutritionCaloricBreakdown {
    pub fn new(percent_protein: f64, percent_fat: f64, percent_carbs: f64) -> SearchGroceryProductsByUpc200ResponseNutritionCaloricBreakdown {
        SearchGroceryProductsByUpc200ResponseNutritionCaloricBreakdown {
            percent_protein,
            percent_fat,
            percent_carbs,
        }
    }
}

