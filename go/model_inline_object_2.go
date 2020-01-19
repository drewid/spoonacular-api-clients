/*
 * spoonacular API
 *
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 80,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * API version: 1.0
 * Contact: david@spoonacular.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package spoonacular

type InlineObject2 struct {
	// The ingredient list of the recipe, one ingredient per line.
	IngredientList string `json:"ingredientList"`
	// The number of servings.
	Servings float32 `json:"servings"`
	// How to visualize the equipment, either \"grid\" or \"list\".
	View string `json:"view,omitempty"`
	// Whether the default CSS should be added to the response.
	DefaultCss bool `json:"defaultCss,omitempty"`
	// Whether to show a backlink to spoonacular. If set false, this call counts against your quota.
	ShowBacklink bool `json:"showBacklink,omitempty"`
}
