/*
 * spoonacular API
 *
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 800,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.1
 * Contact: mail@spoonacular.com
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct ParseIngredients200ResponseInnerNutritionNutrientsInner {
    #[serde(rename = "name")]
    pub name: String,
    #[serde(rename = "amount")]
    pub amount: f32,
    #[serde(rename = "unit")]
    pub unit: String,
    #[serde(rename = "percentOfDailyNeeds")]
    pub percent_of_daily_needs: f32,
}

impl ParseIngredients200ResponseInnerNutritionNutrientsInner {
    pub fn new(name: String, amount: f32, unit: String, percent_of_daily_needs: f32) -> ParseIngredients200ResponseInnerNutritionNutrientsInner {
        ParseIngredients200ResponseInnerNutritionNutrientsInner {
            name,
            amount,
            unit,
            percent_of_daily_needs,
        }
    }
}


