# coding: utf-8

"""
    spoonacular API

    The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

    The version of the OpenAPI document: 2.0.1
    Contact: mail@spoonacular.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from spoonacular.models.get_recipe_nutrition_widget_by_id200_response_bad_inner import GetRecipeNutritionWidgetByID200ResponseBadInner

class TestGetRecipeNutritionWidgetByID200ResponseBadInner(unittest.TestCase):
    """GetRecipeNutritionWidgetByID200ResponseBadInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GetRecipeNutritionWidgetByID200ResponseBadInner:
        """Test GetRecipeNutritionWidgetByID200ResponseBadInner
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GetRecipeNutritionWidgetByID200ResponseBadInner`
        """
        model = GetRecipeNutritionWidgetByID200ResponseBadInner()
        if include_optional:
            return GetRecipeNutritionWidgetByID200ResponseBadInner(
                title = '0',
                amount = '0',
                indented = True,
                percent_of_daily_needs = 1.337
            )
        else:
            return GetRecipeNutritionWidgetByID200ResponseBadInner(
                title = '0',
                amount = '0',
                indented = True,
                percent_of_daily_needs = 1.337,
        )
        """

    def testGetRecipeNutritionWidgetByID200ResponseBadInner(self):
        """Test GetRecipeNutritionWidgetByID200ResponseBadInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
