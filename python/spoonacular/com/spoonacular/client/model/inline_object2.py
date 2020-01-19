# coding: utf-8

"""
    spoonacular API

    The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 80,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.  # noqa: E501

    The version of the OpenAPI document: 1.0
    Contact: david@spoonacular.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six


class InlineObject2(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'ingredient_list': 'str',
        'servings': 'float',
        'view': 'str',
        'default_css': 'bool',
        'show_backlink': 'bool'
    }

    attribute_map = {
        'ingredient_list': 'ingredientList',
        'servings': 'servings',
        'view': 'view',
        'default_css': 'defaultCss',
        'show_backlink': 'showBacklink'
    }

    def __init__(self, ingredient_list=None, servings=None, view=None, default_css=None, show_backlink=None):  # noqa: E501
        """InlineObject2 - a model defined in OpenAPI"""  # noqa: E501

        self._ingredient_list = None
        self._servings = None
        self._view = None
        self._default_css = None
        self._show_backlink = None
        self.discriminator = None

        self.ingredient_list = ingredient_list
        self.servings = servings
        if view is not None:
            self.view = view
        if default_css is not None:
            self.default_css = default_css
        if show_backlink is not None:
            self.show_backlink = show_backlink

    @property
    def ingredient_list(self):
        """Gets the ingredient_list of this InlineObject2.  # noqa: E501

        The ingredient list of the recipe, one ingredient per line.  # noqa: E501

        :return: The ingredient_list of this InlineObject2.  # noqa: E501
        :rtype: str
        """
        return self._ingredient_list

    @ingredient_list.setter
    def ingredient_list(self, ingredient_list):
        """Sets the ingredient_list of this InlineObject2.

        The ingredient list of the recipe, one ingredient per line.  # noqa: E501

        :param ingredient_list: The ingredient_list of this InlineObject2.  # noqa: E501
        :type: str
        """
        if ingredient_list is None:
            raise ValueError("Invalid value for `ingredient_list`, must not be `None`")  # noqa: E501

        self._ingredient_list = ingredient_list

    @property
    def servings(self):
        """Gets the servings of this InlineObject2.  # noqa: E501

        The number of servings.  # noqa: E501

        :return: The servings of this InlineObject2.  # noqa: E501
        :rtype: float
        """
        return self._servings

    @servings.setter
    def servings(self, servings):
        """Sets the servings of this InlineObject2.

        The number of servings.  # noqa: E501

        :param servings: The servings of this InlineObject2.  # noqa: E501
        :type: float
        """
        if servings is None:
            raise ValueError("Invalid value for `servings`, must not be `None`")  # noqa: E501

        self._servings = servings

    @property
    def view(self):
        """Gets the view of this InlineObject2.  # noqa: E501

        How to visualize the equipment, either \"grid\" or \"list\".  # noqa: E501

        :return: The view of this InlineObject2.  # noqa: E501
        :rtype: str
        """
        return self._view

    @view.setter
    def view(self, view):
        """Sets the view of this InlineObject2.

        How to visualize the equipment, either \"grid\" or \"list\".  # noqa: E501

        :param view: The view of this InlineObject2.  # noqa: E501
        :type: str
        """

        self._view = view

    @property
    def default_css(self):
        """Gets the default_css of this InlineObject2.  # noqa: E501

        Whether the default CSS should be added to the response.  # noqa: E501

        :return: The default_css of this InlineObject2.  # noqa: E501
        :rtype: bool
        """
        return self._default_css

    @default_css.setter
    def default_css(self, default_css):
        """Sets the default_css of this InlineObject2.

        Whether the default CSS should be added to the response.  # noqa: E501

        :param default_css: The default_css of this InlineObject2.  # noqa: E501
        :type: bool
        """

        self._default_css = default_css

    @property
    def show_backlink(self):
        """Gets the show_backlink of this InlineObject2.  # noqa: E501

        Whether to show a backlink to spoonacular. If set false, this call counts against your quota.  # noqa: E501

        :return: The show_backlink of this InlineObject2.  # noqa: E501
        :rtype: bool
        """
        return self._show_backlink

    @show_backlink.setter
    def show_backlink(self, show_backlink):
        """Sets the show_backlink of this InlineObject2.

        Whether to show a backlink to spoonacular. If set false, this call counts against your quota.  # noqa: E501

        :param show_backlink: The show_backlink of this InlineObject2.  # noqa: E501
        :type: bool
        """

        self._show_backlink = show_backlink

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, InlineObject2):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
