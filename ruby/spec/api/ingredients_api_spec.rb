=begin
#spoonacular API

#The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 800,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

The version of the OpenAPI document: 1.1
Contact: mail@spoonacular.com
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.0.1

=end

require 'spec_helper'
require 'json'

# Unit tests for OpenapiClient::IngredientsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'IngredientsApi' do
  before do
    # run before each test
    @api_instance = OpenapiClient::IngredientsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of IngredientsApi' do
    it 'should create an instance of IngredientsApi' do
      expect(@api_instance).to be_instance_of(OpenapiClient::IngredientsApi)
    end
  end

  # unit tests for autocomplete_ingredient_search
  # Autocomplete Ingredient Search
  # Autocomplete the entry of an ingredient.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :query The (natural language) search query.
  # @option opts [Integer] :number The maximum number of items to return (between 1 and 100). Defaults to 10.
  # @option opts [Boolean] :meta_information Whether to return more meta information about the ingredients.
  # @option opts [String] :intolerances A comma-separated list of intolerances. All recipes returned must not contain ingredients that are not suitable for people with the intolerances entered. See a full list of supported intolerances.
  # @return [Array<AutocompleteIngredientSearch200ResponseInner>]
  describe 'autocomplete_ingredient_search test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for compute_ingredient_amount
  # Compute Ingredient Amount
  # Compute the amount you need of a certain ingredient for a certain nutritional goal. For example, how much pineapple do you have to eat to get 10 grams of protein?
  # @param id The id of the ingredient you want the amount for.
  # @param nutrient The target nutrient. See a list of supported nutrients.
  # @param target The target number of the given nutrient.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :unit The target unit.
  # @return [ComputeIngredientAmount200Response]
  describe 'compute_ingredient_amount test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_ingredient_information
  # Get Ingredient Information
  # Use an ingredient id to get all available information about an ingredient, such as its image and supermarket aisle.
  # @param id The item&#39;s id.
  # @param [Hash] opts the optional parameters
  # @option opts [Float] :amount The amount of this ingredient.
  # @option opts [String] :unit The unit for the given amount.
  # @return [GetIngredientInformation200Response]
  describe 'get_ingredient_information test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_ingredient_substitutes
  # Get Ingredient Substitutes
  # Search for substitutes for a given ingredient.
  # @param ingredient_name The name of the ingredient you want to replace.
  # @param [Hash] opts the optional parameters
  # @return [GetIngredientSubstitutes200Response]
  describe 'get_ingredient_substitutes test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_ingredient_substitutes_by_id
  # Get Ingredient Substitutes by ID
  # Search for substitutes for a given ingredient.
  # @param id The item&#39;s id.
  # @param [Hash] opts the optional parameters
  # @return [GetIngredientSubstitutes200Response]
  describe 'get_ingredient_substitutes_by_id test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for ingredient_search
  # Ingredient Search
  # Search for simple whole foods (e.g. fruits, vegetables, nuts, grains, meat, fish, dairy etc.).
  # @param [Hash] opts the optional parameters
  # @option opts [String] :query The (natural language) search query.
  # @option opts [Boolean] :add_children Whether to add children of found foods.
  # @option opts [Float] :min_protein_percent The minimum percentage of protein the food must have (between 0 and 100).
  # @option opts [Float] :max_protein_percent The maximum percentage of protein the food can have (between 0 and 100).
  # @option opts [Float] :min_fat_percent The minimum percentage of fat the food must have (between 0 and 100).
  # @option opts [Float] :max_fat_percent The maximum percentage of fat the food can have (between 0 and 100).
  # @option opts [Float] :min_carbs_percent The minimum percentage of carbs the food must have (between 0 and 100).
  # @option opts [Float] :max_carbs_percent The maximum percentage of carbs the food can have (between 0 and 100).
  # @option opts [Boolean] :meta_information Whether to return more meta information about the ingredients.
  # @option opts [String] :intolerances A comma-separated list of intolerances. All recipes returned must not contain ingredients that are not suitable for people with the intolerances entered. See a full list of supported intolerances.
  # @option opts [String] :sort The strategy to sort recipes by. See a full list of supported sorting options.
  # @option opts [String] :sort_direction The direction in which to sort. Must be either &#39;asc&#39; (ascending) or &#39;desc&#39; (descending).
  # @option opts [Integer] :offset The number of results to skip (between 0 and 900).
  # @option opts [Integer] :number The maximum number of items to return (between 1 and 100). Defaults to 10.
  # @return [IngredientSearch200Response]
  describe 'ingredient_search test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for ingredients_by_id_image
  # Ingredients by ID Image
  # Visualize a recipe&#39;s ingredient list.
  # @param id The recipe id.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :measure Whether the the measures should be &#39;us&#39; or &#39;metric&#39;.
  # @return [Object]
  describe 'ingredients_by_id_image test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for map_ingredients_to_grocery_products
  # Map Ingredients to Grocery Products
  # Map a set of ingredients to products you can buy in the grocery store.
  # @param map_ingredients_to_grocery_products_request 
  # @param [Hash] opts the optional parameters
  # @return [Array<MapIngredientsToGroceryProducts200ResponseInner>]
  describe 'map_ingredients_to_grocery_products test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for visualize_ingredients
  # Ingredients Widget
  # Visualize ingredients of a recipe. You can play around with that endpoint!
  # @param [Hash] opts the optional parameters
  # @option opts [String] :content_type The content type.
  # @option opts [String] :language The language of the input. Either &#39;en&#39; or &#39;de&#39;.
  # @option opts [String] :accept Accept header.
  # @return [String]
  describe 'visualize_ingredients test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
