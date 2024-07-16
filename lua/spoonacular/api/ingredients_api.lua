--[[
  spoonacular API

  The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

  The version of the OpenAPI document: 1.1
  Contact: mail@spoonacular.com
  Generated by: https://openapi-generator.tech
]]

--package spoonacular

local http_request = require "http.request"
local http_util = require "http.util"
local dkjson = require "dkjson"
local basexx = require "basexx"

-- model import
local spoonacular_ingredient_information = require "spoonacular.model.ingredient_information"
local spoonacular_autocomplete_ingredient_search_200_response_inner = require "spoonacular.model.autocomplete_ingredient_search_200_response_inner"
local spoonacular_compute_ingredient_amount_200_response = require "spoonacular.model.compute_ingredient_amount_200_response"
local spoonacular_get_ingredient_substitutes_200_response = require "spoonacular.model.get_ingredient_substitutes_200_response"
local spoonacular_ingredient_search_200_response = require "spoonacular.model.ingredient_search_200_response"
local spoonacular_map_ingredients_to_grocery_products_200_response_inner = require "spoonacular.model.map_ingredients_to_grocery_products_200_response_inner"
local spoonacular_map_ingredients_to_grocery_products_request = require "spoonacular.model.map_ingredients_to_grocery_products_request"
local spoonacular_set = require "spoonacular.model.set"

local ingredients_api = {}
local ingredients_api_mt = {
	__name = "ingredients_api";
	__index = ingredients_api;
}

local function new_ingredients_api(authority, basePath, schemes)
	local schemes_map = {}
	for _,v in ipairs(schemes) do
		schemes_map[v] = v
	end
	local default_scheme = schemes_map.https or schemes_map.http
	local host, port = http_util.split_authority(authority, default_scheme)
	return setmetatable({
		host = host;
		port = port;
		basePath = basePath or "https://api.spoonacular.com";
		schemes = schemes_map;
		default_scheme = default_scheme;
		http_username = nil;
		http_password = nil;
		api_key = {};
		access_token = nil;
	}, ingredients_api_mt)
end

function ingredients_api:autocomplete_ingredient_search(query, Number_, meta_information, intolerances, language)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/food/ingredients/autocomplete?query=%s&number=%s&metaInformation=%s&intolerances=%s&language=%s",
			self.basePath, http_util.encodeURIComponent(query), http_util.encodeURIComponent(Number_), http_util.encodeURIComponent(meta_information), http_util.encodeURIComponent(intolerances), http_util.encodeURIComponent(language));
	})

	-- set HTTP verb
	req.headers:upsert(":method", "GET")
	-- TODO: create a function to select proper content-type
	--local var_accept = { "application/json" }
	req.headers:upsert("content-type", "application/json")

	-- api key in headers 'x-api-key'
	if self.api_key['x-api-key'] then
		req.headers:upsert("apiKeyScheme", self.api_key['x-api-key'])
	end

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		for _, ob in ipairs(result) do
			spoonacular_autocomplete_ingredient_search_200_response_inner.cast(ob)
		end
		return result, headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function ingredients_api:compute_ingredient_amount(id, nutrient, target, unit)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/food/ingredients/%s/amount?nutrient=%s&target=%s&unit=%s",
			self.basePath, id, http_util.encodeURIComponent(nutrient), http_util.encodeURIComponent(target), http_util.encodeURIComponent(unit));
	})

	-- set HTTP verb
	req.headers:upsert(":method", "GET")
	-- TODO: create a function to select proper content-type
	--local var_accept = { "application/json" }
	req.headers:upsert("content-type", "application/json")

	-- api key in headers 'x-api-key'
	if self.api_key['x-api-key'] then
		req.headers:upsert("apiKeyScheme", self.api_key['x-api-key'])
	end

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		return spoonacular_compute_ingredient_amount_200_response.cast(result), headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function ingredients_api:get_ingredient_information(id, amount, unit)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/food/ingredients/%s/information?amount=%s&unit=%s",
			self.basePath, id, http_util.encodeURIComponent(amount), http_util.encodeURIComponent(unit));
	})

	-- set HTTP verb
	req.headers:upsert(":method", "GET")
	-- TODO: create a function to select proper content-type
	--local var_accept = { "application/json" }
	req.headers:upsert("content-type", "application/json")

	-- api key in headers 'x-api-key'
	if self.api_key['x-api-key'] then
		req.headers:upsert("apiKeyScheme", self.api_key['x-api-key'])
	end

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		return spoonacular_ingredient_information.cast(result), headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function ingredients_api:get_ingredient_substitutes(ingredient_name)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/food/ingredients/substitutes?ingredientName=%s",
			self.basePath, http_util.encodeURIComponent(ingredient_name));
	})

	-- set HTTP verb
	req.headers:upsert(":method", "GET")
	-- TODO: create a function to select proper content-type
	--local var_accept = { "application/json" }
	req.headers:upsert("content-type", "application/json")

	-- api key in headers 'x-api-key'
	if self.api_key['x-api-key'] then
		req.headers:upsert("apiKeyScheme", self.api_key['x-api-key'])
	end

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		return spoonacular_get_ingredient_substitutes_200_response.cast(result), headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function ingredients_api:get_ingredient_substitutes_by_id(id)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/food/ingredients/%s/substitutes",
			self.basePath, id);
	})

	-- set HTTP verb
	req.headers:upsert(":method", "GET")
	-- TODO: create a function to select proper content-type
	--local var_accept = { "application/json" }
	req.headers:upsert("content-type", "application/json")

	-- api key in headers 'x-api-key'
	if self.api_key['x-api-key'] then
		req.headers:upsert("apiKeyScheme", self.api_key['x-api-key'])
	end

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		return spoonacular_get_ingredient_substitutes_200_response.cast(result), headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function ingredients_api:ingredient_search(query, add_children, min_protein_percent, max_protein_percent, min_fat_percent, max_fat_percent, min_carbs_percent, max_carbs_percent, meta_information, intolerances, sort, sort_direction, offset, Number_, language)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/food/ingredients/search?query=%s&addChildren=%s&minProteinPercent=%s&maxProteinPercent=%s&minFatPercent=%s&maxFatPercent=%s&minCarbsPercent=%s&maxCarbsPercent=%s&metaInformation=%s&intolerances=%s&sort=%s&sortDirection=%s&offset=%s&number=%s&language=%s",
			self.basePath, http_util.encodeURIComponent(query), http_util.encodeURIComponent(add_children), http_util.encodeURIComponent(min_protein_percent), http_util.encodeURIComponent(max_protein_percent), http_util.encodeURIComponent(min_fat_percent), http_util.encodeURIComponent(max_fat_percent), http_util.encodeURIComponent(min_carbs_percent), http_util.encodeURIComponent(max_carbs_percent), http_util.encodeURIComponent(meta_information), http_util.encodeURIComponent(intolerances), http_util.encodeURIComponent(sort), http_util.encodeURIComponent(sort_direction), http_util.encodeURIComponent(offset), http_util.encodeURIComponent(Number_), http_util.encodeURIComponent(language));
	})

	-- set HTTP verb
	req.headers:upsert(":method", "GET")
	-- TODO: create a function to select proper content-type
	--local var_accept = { "application/json" }
	req.headers:upsert("content-type", "application/json")

	-- api key in headers 'x-api-key'
	if self.api_key['x-api-key'] then
		req.headers:upsert("apiKeyScheme", self.api_key['x-api-key'])
	end

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		return spoonacular_ingredient_search_200_response.cast(result), headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function ingredients_api:ingredients_by_id_image(id, measure)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/recipes/%s/ingredientWidget.png?measure=%s",
			self.basePath, id, http_util.encodeURIComponent(measure));
	})

	-- set HTTP verb
	req.headers:upsert(":method", "GET")
	-- TODO: create a function to select proper content-type
	--local var_accept = { "image/png" }
	req.headers:upsert("content-type", "image/png")

	-- api key in headers 'x-api-key'
	if self.api_key['x-api-key'] then
		req.headers:upsert("apiKeyScheme", self.api_key['x-api-key'])
	end

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		return result, headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function ingredients_api:map_ingredients_to_grocery_products(map_ingredients_to_grocery_products_request)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/food/ingredients/map",
			self.basePath);
	})

	-- set HTTP verb
	req.headers:upsert(":method", "POST")
	-- TODO: create a function to select proper accept
	--local var_content_type = { "application/json" }
	req.headers:upsert("accept", "application/json")

	-- TODO: create a function to select proper content-type
	--local var_accept = { "application/json" }
	req.headers:upsert("content-type", "application/json")

	req:set_body(dkjson.encode(map_ingredients_to_grocery_products_request))

	-- api key in headers 'x-api-key'
	if self.api_key['x-api-key'] then
		req.headers:upsert("apiKeyScheme", self.api_key['x-api-key'])
	end

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		for _, ob in ipairs(result) do
			spoonacular_map_ingredients_to_grocery_products_200_response_inner.cast(ob)
		end
		return result, headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function ingredients_api:visualize_ingredients(ingredient_list, servings, language, measure, view, default_css, show_backlink)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/recipes/visualizeIngredients?language=%s",
			self.basePath, http_util.encodeURIComponent(language));
	})

	-- set HTTP verb
	req.headers:upsert(":method", "POST")
	-- TODO: create a function to select proper accept
	--local var_content_type = { "application/x-www-form-urlencoded" }
	req.headers:upsert("accept", "application/x-www-form-urlencoded")

	-- TODO: create a function to select proper content-type
	--local var_accept = { "text/html" }
	req.headers:upsert("content-type", "text/html")

	req:set_body(http_util.dict_to_query({
		["ingredientList"] = ingredient_list;
		["servings"] = servings;
		["measure"] = measure;
		["view"] = view;
		["defaultCss"] = default_css;
		["showBacklink"] = show_backlink;
	}))
	-- api key in headers 'x-api-key'
	if self.api_key['x-api-key'] then
		req.headers:upsert("apiKeyScheme", self.api_key['x-api-key'])
	end

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		return result, headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

return {
	new = new_ingredients_api;
}
