=begin
#spoonacular API

#The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 800,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

The version of the OpenAPI document: 1.0
Contact: mail@spoonacular.com
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.0.0-SNAPSHOT

=end

require 'spec_helper'
require 'json'

# Unit tests for OpenapiClient::MenuItemsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'MenuItemsApi' do
  before do
    # run before each test
    @api_instance = OpenapiClient::MenuItemsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of MenuItemsApi' do
    it 'should create an instance of MenuItemsApi' do
      expect(@api_instance).to be_instance_of(OpenapiClient::MenuItemsApi)
    end
  end

  # unit tests for autocomplete_menu_item_search
  # Autocomplete Menu Item Search
  # Generate suggestions for menu items based on a (partial) query. The matches will be found by looking in the title only.
  # @param query The (partial) search query.
  # @param [Hash] opts the optional parameters
  # @option opts [Float] :number The number of results to return (between 1 and 25).
  # @return [InlineResponse20032]
  describe 'autocomplete_menu_item_search test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_menu_item_information
  # Get Menu Item Information
  # Use a menu item id to get all available information about a menu item, such as nutrition.
  # @param id The item&#39;s id.
  # @param [Hash] opts the optional parameters
  # @return [InlineResponse20036]
  describe 'get_menu_item_information test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for menu_item_nutrition_by_id_image
  # Menu Item Nutrition by ID Image
  # Visualize a menu item&#39;s nutritional information as HTML including CSS.
  # @param id The menu item id.
  # @param [Hash] opts the optional parameters
  # @return [Object]
  describe 'menu_item_nutrition_by_id_image test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for menu_item_nutrition_label_image
  # Menu Item Nutrition Label Image
  # Visualize a menu item&#39;s nutritional label information as an image.
  # @param id The menu item id.
  # @param [Hash] opts the optional parameters
  # @option opts [Boolean] :show_optional_nutrients Whether to show optional nutrients.
  # @option opts [Boolean] :show_zero_values Whether to show zero values.
  # @option opts [Boolean] :show_ingredients Whether to show a list of ingredients.
  # @return [Object]
  describe 'menu_item_nutrition_label_image test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for menu_item_nutrition_label_widget
  # Menu Item Nutrition Label Widget
  # Visualize a menu item&#39;s nutritional label information as HTML including CSS.
  # @param id The menu item id.
  # @param [Hash] opts the optional parameters
  # @option opts [Boolean] :default_css Whether the default CSS should be added to the response.
  # @option opts [Boolean] :show_optional_nutrients Whether to show optional nutrients.
  # @option opts [Boolean] :show_zero_values Whether to show zero values.
  # @option opts [Boolean] :show_ingredients Whether to show a list of ingredients.
  # @return [String]
  describe 'menu_item_nutrition_label_widget test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for search_menu_items
  # Search Menu Items
  # Search over 115,000 menu items from over 800 fast food and chain restaurants. For example, McDonald&#39;s Big Mac or Starbucks Mocha.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :query The (natural language) search query.
  # @option opts [Float] :min_calories The minimum amount of calories the menu item must have.
  # @option opts [Float] :max_calories The maximum amount of calories the menu item can have.
  # @option opts [Float] :min_carbs The minimum amount of carbohydrates in grams the menu item must have.
  # @option opts [Float] :max_carbs The maximum amount of carbohydrates in grams the menu item can have.
  # @option opts [Float] :min_protein The minimum amount of protein in grams the menu item must have.
  # @option opts [Float] :max_protein The maximum amount of protein in grams the menu item can have.
  # @option opts [Float] :min_fat The minimum amount of fat in grams the menu item must have.
  # @option opts [Float] :max_fat The maximum amount of fat in grams the menu item can have.
  # @option opts [Boolean] :add_menu_item_information If set to true, you get more information about the menu items returned.
  # @option opts [Integer] :offset The number of results to skip (between 0 and 900).
  # @option opts [Integer] :number The maximum number of items to return (between 1 and 100). Defaults to 10.
  # @return [InlineResponse20035]
  describe 'search_menu_items test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for visualize_menu_item_nutrition_by_id
  # Menu Item Nutrition by ID Widget
  # Visualize a menu item&#39;s nutritional information as HTML including CSS.
  # @param id The item&#39;s id.
  # @param [Hash] opts the optional parameters
  # @option opts [Boolean] :default_css Whether the default CSS should be added to the response.
  # @option opts [String] :accept Accept header.
  # @return [String]
  describe 'visualize_menu_item_nutrition_by_id test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
