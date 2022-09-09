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
pub struct GetRandomRecipes200ResponseRecipesInner {
    #[serde(rename = "id")]
    pub id: i32,
    #[serde(rename = "title")]
    pub title: String,
    #[serde(rename = "image")]
    pub image: String,
    #[serde(rename = "imageType")]
    pub image_type: String,
    #[serde(rename = "servings")]
    pub servings: f32,
    #[serde(rename = "readyInMinutes")]
    pub ready_in_minutes: i32,
    #[serde(rename = "license")]
    pub license: String,
    #[serde(rename = "sourceName")]
    pub source_name: String,
    #[serde(rename = "sourceUrl")]
    pub source_url: String,
    #[serde(rename = "spoonacularSourceUrl")]
    pub spoonacular_source_url: String,
    #[serde(rename = "aggregateLikes")]
    pub aggregate_likes: f32,
    #[serde(rename = "healthScore")]
    pub health_score: f32,
    #[serde(rename = "spoonacularScore")]
    pub spoonacular_score: f32,
    #[serde(rename = "pricePerServing")]
    pub price_per_serving: f32,
    #[serde(rename = "analyzedInstructions", skip_serializing_if = "Option::is_none")]
    pub analyzed_instructions: Option<Vec<serde_json::Value>>,
    #[serde(rename = "cheap")]
    pub cheap: bool,
    #[serde(rename = "creditsText")]
    pub credits_text: String,
    #[serde(rename = "cuisines", skip_serializing_if = "Option::is_none")]
    pub cuisines: Option<Vec<String>>,
    #[serde(rename = "dairyFree")]
    pub dairy_free: bool,
    #[serde(rename = "diets", skip_serializing_if = "Option::is_none")]
    pub diets: Option<Vec<String>>,
    #[serde(rename = "gaps")]
    pub gaps: String,
    #[serde(rename = "glutenFree")]
    pub gluten_free: bool,
    #[serde(rename = "instructions")]
    pub instructions: String,
    #[serde(rename = "ketogenic")]
    pub ketogenic: bool,
    #[serde(rename = "lowFodmap")]
    pub low_fodmap: bool,
    #[serde(rename = "occasions", skip_serializing_if = "Option::is_none")]
    pub occasions: Option<Vec<String>>,
    #[serde(rename = "sustainable")]
    pub sustainable: bool,
    #[serde(rename = "vegan")]
    pub vegan: bool,
    #[serde(rename = "vegetarian")]
    pub vegetarian: bool,
    #[serde(rename = "veryHealthy")]
    pub very_healthy: bool,
    #[serde(rename = "veryPopular")]
    pub very_popular: bool,
    #[serde(rename = "whole30")]
    pub whole30: bool,
    #[serde(rename = "weightWatcherSmartPoints")]
    pub weight_watcher_smart_points: f32,
    #[serde(rename = "dishTypes", skip_serializing_if = "Option::is_none")]
    pub dish_types: Option<Vec<String>>,
    #[serde(rename = "extendedIngredients", skip_serializing_if = "Option::is_none")]
    pub extended_ingredients: Option<Vec<crate::models::GetRecipeInformation200ResponseExtendedIngredientsInner>>,
    #[serde(rename = "summary")]
    pub summary: String,
    #[serde(rename = "winePairing", skip_serializing_if = "Option::is_none")]
    pub wine_pairing: Option<Box<crate::models::GetRecipeInformation200ResponseWinePairing>>,
}

impl GetRandomRecipes200ResponseRecipesInner {
    pub fn new(id: i32, title: String, image: String, image_type: String, servings: f32, ready_in_minutes: i32, license: String, source_name: String, source_url: String, spoonacular_source_url: String, aggregate_likes: f32, health_score: f32, spoonacular_score: f32, price_per_serving: f32, cheap: bool, credits_text: String, dairy_free: bool, gaps: String, gluten_free: bool, instructions: String, ketogenic: bool, low_fodmap: bool, sustainable: bool, vegan: bool, vegetarian: bool, very_healthy: bool, very_popular: bool, whole30: bool, weight_watcher_smart_points: f32, summary: String) -> GetRandomRecipes200ResponseRecipesInner {
        GetRandomRecipes200ResponseRecipesInner {
            id,
            title,
            image,
            image_type,
            servings,
            ready_in_minutes,
            license,
            source_name,
            source_url,
            spoonacular_source_url,
            aggregate_likes,
            health_score,
            spoonacular_score,
            price_per_serving,
            analyzed_instructions: None,
            cheap,
            credits_text,
            cuisines: None,
            dairy_free,
            diets: None,
            gaps,
            gluten_free,
            instructions,
            ketogenic,
            low_fodmap,
            occasions: None,
            sustainable,
            vegan,
            vegetarian,
            very_healthy,
            very_popular,
            whole30,
            weight_watcher_smart_points,
            dish_types: None,
            extended_ingredients: None,
            summary,
            wine_pairing: None,
        }
    }
}


