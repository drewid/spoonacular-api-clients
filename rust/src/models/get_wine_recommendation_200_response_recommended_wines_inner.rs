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
pub struct GetWineRecommendation200ResponseRecommendedWinesInner {
    #[serde(rename = "id")]
    pub id: i32,
    #[serde(rename = "title")]
    pub title: String,
    #[serde(rename = "averageRating")]
    pub average_rating: f32,
    #[serde(rename = "description")]
    pub description: String,
    #[serde(rename = "imageUrl")]
    pub image_url: String,
    #[serde(rename = "link")]
    pub link: String,
    #[serde(rename = "price")]
    pub price: String,
    #[serde(rename = "ratingCount")]
    pub rating_count: i32,
    #[serde(rename = "score")]
    pub score: f32,
}

impl GetWineRecommendation200ResponseRecommendedWinesInner {
    pub fn new(id: i32, title: String, average_rating: f32, description: String, image_url: String, link: String, price: String, rating_count: i32, score: f32) -> GetWineRecommendation200ResponseRecommendedWinesInner {
        GetWineRecommendation200ResponseRecommendedWinesInner {
            id,
            title,
            average_rating,
            description,
            image_url,
            link,
            price,
            rating_count,
            score,
        }
    }
}


