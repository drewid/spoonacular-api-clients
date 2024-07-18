--[[
  spoonacular API

  The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

  The version of the OpenAPI document: 2.0.1
  Contact: mail@spoonacular.com
  Generated by: https://openapi-generator.tech
]]

-- recipe_information class
local recipe_information = {}
local recipe_information_mt = {
	__name = "recipe_information";
	__index = recipe_information;
}

local function cast_recipe_information(t)
	return setmetatable(t, recipe_information_mt)
end

local function new_recipe_information(id, title, image, image_type, servings, ready_in_minutes, preparation_minutes, cooking_minutes, license, source_name, source_url, spoonacular_source_url, aggregate_likes, health_score, spoonacular_score, price_per_serving, analyzed_instructions, cheap, credits_text, cuisines, dairy_free, diets, gaps, gluten_free, instructions, low_fodmap, occasions, sustainable, vegan, vegetarian, very_healthy, very_popular, weight_watcher_smart_points, dish_types, extended_ingredients, summary, wine_pairing, taste)
	return cast_recipe_information({
		["id"] = id;
		["title"] = title;
		["image"] = image;
		["imageType"] = image_type;
		["servings"] = servings;
		["readyInMinutes"] = ready_in_minutes;
		["preparationMinutes"] = preparation_minutes;
		["cookingMinutes"] = cooking_minutes;
		["license"] = license;
		["sourceName"] = source_name;
		["sourceUrl"] = source_url;
		["spoonacularSourceUrl"] = spoonacular_source_url;
		["aggregateLikes"] = aggregate_likes;
		["healthScore"] = health_score;
		["spoonacularScore"] = spoonacular_score;
		["pricePerServing"] = price_per_serving;
		["analyzedInstructions"] = analyzed_instructions;
		["cheap"] = cheap;
		["creditsText"] = credits_text;
		["cuisines"] = cuisines;
		["dairyFree"] = dairy_free;
		["diets"] = diets;
		["gaps"] = gaps;
		["glutenFree"] = gluten_free;
		["instructions"] = instructions;
		["lowFodmap"] = low_fodmap;
		["occasions"] = occasions;
		["sustainable"] = sustainable;
		["vegan"] = vegan;
		["vegetarian"] = vegetarian;
		["veryHealthy"] = very_healthy;
		["veryPopular"] = very_popular;
		["weightWatcherSmartPoints"] = weight_watcher_smart_points;
		["dishTypes"] = dish_types;
		["extendedIngredients"] = extended_ingredients;
		["summary"] = summary;
		["winePairing"] = wine_pairing;
		["taste"] = taste;
	})
end

return {
	cast = cast_recipe_information;
	new = new_recipe_information;
}
