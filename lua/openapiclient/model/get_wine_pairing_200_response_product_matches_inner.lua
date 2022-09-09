--[[
  spoonacular API

  The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 800,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

  The version of the OpenAPI document: 1.1
  Contact: mail@spoonacular.com
  Generated by: https://openapi-generator.tech
]]

-- get_wine_pairing_200_response_product_matches_inner class
local get_wine_pairing_200_response_product_matches_inner = {}
local get_wine_pairing_200_response_product_matches_inner_mt = {
	__name = "get_wine_pairing_200_response_product_matches_inner";
	__index = get_wine_pairing_200_response_product_matches_inner;
}

local function cast_get_wine_pairing_200_response_product_matches_inner(t)
	return setmetatable(t, get_wine_pairing_200_response_product_matches_inner_mt)
end

local function new_get_wine_pairing_200_response_product_matches_inner(id, title, average_rating, description, image_url, link, price, rating_count, score)
	return cast_get_wine_pairing_200_response_product_matches_inner({
		["id"] = id;
		["title"] = title;
		["averageRating"] = average_rating;
		["description"] = description;
		["imageUrl"] = image_url;
		["link"] = link;
		["price"] = price;
		["ratingCount"] = rating_count;
		["score"] = score;
	})
end

return {
	cast = cast_get_wine_pairing_200_response_product_matches_inner;
	new = new_get_wine_pairing_200_response_product_matches_inner;
}
