=begin comment

spoonacular API

The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

The version of the OpenAPI document: 1.1
Contact: mail@spoonacular.com
Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator
# Please update the test cases below to test the API endpoints.
# Ref: https://openapi-generator.tech
#
use Test::More;
use Test::Exception;

use lib 'lib';
use strict;
use warnings;

use_ok('WWW::OpenAPIClient::MenuItemsApi');

my $api = WWW::OpenAPIClient::MenuItemsApi->new();
isa_ok($api, 'WWW::OpenAPIClient::MenuItemsApi');

#
# autocomplete_menu_item_search test
#
# uncomment below and update the test
#my $autocomplete_menu_item_search_query = undef; # replace NULL with a proper value
#my $autocomplete_menu_item_search_number = undef; # replace NULL with a proper value
#my $autocomplete_menu_item_search_result = $api->autocomplete_menu_item_search(query => $autocomplete_menu_item_search_query, number => $autocomplete_menu_item_search_number);

#
# get_menu_item_information test
#
# uncomment below and update the test
#my $get_menu_item_information_id = undef; # replace NULL with a proper value
#my $get_menu_item_information_result = $api->get_menu_item_information(id => $get_menu_item_information_id);

#
# menu_item_nutrition_by_id_image test
#
# uncomment below and update the test
#my $menu_item_nutrition_by_id_image_id = undef; # replace NULL with a proper value
#my $menu_item_nutrition_by_id_image_result = $api->menu_item_nutrition_by_id_image(id => $menu_item_nutrition_by_id_image_id);

#
# menu_item_nutrition_label_image test
#
# uncomment below and update the test
#my $menu_item_nutrition_label_image_id = undef; # replace NULL with a proper value
#my $menu_item_nutrition_label_image_show_optional_nutrients = undef; # replace NULL with a proper value
#my $menu_item_nutrition_label_image_show_zero_values = undef; # replace NULL with a proper value
#my $menu_item_nutrition_label_image_show_ingredients = undef; # replace NULL with a proper value
#my $menu_item_nutrition_label_image_result = $api->menu_item_nutrition_label_image(id => $menu_item_nutrition_label_image_id, show_optional_nutrients => $menu_item_nutrition_label_image_show_optional_nutrients, show_zero_values => $menu_item_nutrition_label_image_show_zero_values, show_ingredients => $menu_item_nutrition_label_image_show_ingredients);

#
# menu_item_nutrition_label_widget test
#
# uncomment below and update the test
#my $menu_item_nutrition_label_widget_id = undef; # replace NULL with a proper value
#my $menu_item_nutrition_label_widget_default_css = undef; # replace NULL with a proper value
#my $menu_item_nutrition_label_widget_show_optional_nutrients = undef; # replace NULL with a proper value
#my $menu_item_nutrition_label_widget_show_zero_values = undef; # replace NULL with a proper value
#my $menu_item_nutrition_label_widget_show_ingredients = undef; # replace NULL with a proper value
#my $menu_item_nutrition_label_widget_result = $api->menu_item_nutrition_label_widget(id => $menu_item_nutrition_label_widget_id, default_css => $menu_item_nutrition_label_widget_default_css, show_optional_nutrients => $menu_item_nutrition_label_widget_show_optional_nutrients, show_zero_values => $menu_item_nutrition_label_widget_show_zero_values, show_ingredients => $menu_item_nutrition_label_widget_show_ingredients);

#
# search_menu_items test
#
# uncomment below and update the test
#my $search_menu_items_query = undef; # replace NULL with a proper value
#my $search_menu_items_min_calories = undef; # replace NULL with a proper value
#my $search_menu_items_max_calories = undef; # replace NULL with a proper value
#my $search_menu_items_min_carbs = undef; # replace NULL with a proper value
#my $search_menu_items_max_carbs = undef; # replace NULL with a proper value
#my $search_menu_items_min_protein = undef; # replace NULL with a proper value
#my $search_menu_items_max_protein = undef; # replace NULL with a proper value
#my $search_menu_items_min_fat = undef; # replace NULL with a proper value
#my $search_menu_items_max_fat = undef; # replace NULL with a proper value
#my $search_menu_items_add_menu_item_information = undef; # replace NULL with a proper value
#my $search_menu_items_offset = undef; # replace NULL with a proper value
#my $search_menu_items_number = undef; # replace NULL with a proper value
#my $search_menu_items_result = $api->search_menu_items(query => $search_menu_items_query, min_calories => $search_menu_items_min_calories, max_calories => $search_menu_items_max_calories, min_carbs => $search_menu_items_min_carbs, max_carbs => $search_menu_items_max_carbs, min_protein => $search_menu_items_min_protein, max_protein => $search_menu_items_max_protein, min_fat => $search_menu_items_min_fat, max_fat => $search_menu_items_max_fat, add_menu_item_information => $search_menu_items_add_menu_item_information, offset => $search_menu_items_offset, number => $search_menu_items_number);

#
# visualize_menu_item_nutrition_by_id test
#
# uncomment below and update the test
#my $visualize_menu_item_nutrition_by_id_id = undef; # replace NULL with a proper value
#my $visualize_menu_item_nutrition_by_id_default_css = undef; # replace NULL with a proper value
#my $visualize_menu_item_nutrition_by_id_result = $api->visualize_menu_item_nutrition_by_id(id => $visualize_menu_item_nutrition_by_id_id, default_css => $visualize_menu_item_nutrition_by_id_default_css);


done_testing();
