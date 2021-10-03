# coding: utf-8

"""
    spoonacular API

    The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 800,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.  # noqa: E501

    The version of the OpenAPI document: 1.0
    Contact: mail@spoonacular.com
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from spoonacular.api_client import ApiClient
from spoonacular.exceptions import (
    ApiTypeError,
    ApiValueError
)


class MenuItemsApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def autocomplete_menu_item_search(self, query, **kwargs):  # noqa: E501
        """Autocomplete Menu Item Search  # noqa: E501

        Generate suggestions for menu items based on a (partial) query. The matches will be found by looking in the title only.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.autocomplete_menu_item_search(query, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str query: The (partial) search query. (required)
        :param float number: The number of results to return (between 1 and 25).
        :return: InlineResponse20032
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.autocomplete_menu_item_search_with_http_info(query, **kwargs)  # noqa: E501
        else:
            (data) = self.autocomplete_menu_item_search_with_http_info(query, **kwargs)  # noqa: E501
            return data

    def autocomplete_menu_item_search_with_http_info(self, query, **kwargs):  # noqa: E501
        """Autocomplete Menu Item Search  # noqa: E501

        Generate suggestions for menu items based on a (partial) query. The matches will be found by looking in the title only.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.autocomplete_menu_item_search_with_http_info(query, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str query: The (partial) search query. (required)
        :param float number: The number of results to return (between 1 and 25).
        :return: InlineResponse20032
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['query', 'number']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method autocomplete_menu_item_search" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'query' is set
        if ('query' not in local_var_params or
                local_var_params['query'] is None):
            raise ApiValueError("Missing the required parameter `query` when calling `autocomplete_menu_item_search`")  # noqa: E501

        if 'number' in local_var_params and local_var_params['number'] > 25:  # noqa: E501
            raise ApiValueError("Invalid value for parameter `number` when calling `autocomplete_menu_item_search`, must be a value less than or equal to `25`")  # noqa: E501
        if 'number' in local_var_params and local_var_params['number'] < 1:  # noqa: E501
            raise ApiValueError("Invalid value for parameter `number` when calling `autocomplete_menu_item_search`, must be a value greater than or equal to `1`")  # noqa: E501
        collection_formats = {}

        path_params = {}

        query_params = []
        if 'query' in local_var_params:
            query_params.append(('query', local_var_params['query']))  # noqa: E501
        if 'number' in local_var_params:
            query_params.append(('number', local_var_params['number']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apiKeyScheme']  # noqa: E501

        return self.api_client.call_api(
            '/food/menuItems/suggest', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='InlineResponse20032',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_menu_item_information(self, id, **kwargs):  # noqa: E501
        """Get Menu Item Information  # noqa: E501

        Use a menu item id to get all available information about a menu item, such as nutrition.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_menu_item_information(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int id: The item's id. (required)
        :return: InlineResponse20036
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.get_menu_item_information_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.get_menu_item_information_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def get_menu_item_information_with_http_info(self, id, **kwargs):  # noqa: E501
        """Get Menu Item Information  # noqa: E501

        Use a menu item id to get all available information about a menu item, such as nutrition.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_menu_item_information_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int id: The item's id. (required)
        :return: InlineResponse20036
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_menu_item_information" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in local_var_params or
                local_var_params['id'] is None):
            raise ApiValueError("Missing the required parameter `id` when calling `get_menu_item_information`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in local_var_params:
            path_params['id'] = local_var_params['id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apiKeyScheme']  # noqa: E501

        return self.api_client.call_api(
            '/food/menuItems/{id}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='InlineResponse20036',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def menu_item_nutrition_by_id_image(self, id, **kwargs):  # noqa: E501
        """Menu Item Nutrition by ID Image  # noqa: E501

        Visualize a menu item's nutritional information as HTML including CSS.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.menu_item_nutrition_by_id_image(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param float id: The menu item id. (required)
        :return: object
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.menu_item_nutrition_by_id_image_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.menu_item_nutrition_by_id_image_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def menu_item_nutrition_by_id_image_with_http_info(self, id, **kwargs):  # noqa: E501
        """Menu Item Nutrition by ID Image  # noqa: E501

        Visualize a menu item's nutritional information as HTML including CSS.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.menu_item_nutrition_by_id_image_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param float id: The menu item id. (required)
        :return: object
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['id']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method menu_item_nutrition_by_id_image" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in local_var_params or
                local_var_params['id'] is None):
            raise ApiValueError("Missing the required parameter `id` when calling `menu_item_nutrition_by_id_image`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in local_var_params:
            path_params['id'] = local_var_params['id']  # noqa: E501

        query_params = []

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['image/png'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apiKeyScheme']  # noqa: E501

        return self.api_client.call_api(
            '/food/menuItems/{id}/nutritionWidget.png', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='object',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def menu_item_nutrition_label_image(self, id, **kwargs):  # noqa: E501
        """Menu Item Nutrition Label Image  # noqa: E501

        Visualize a menu item's nutritional label information as an image.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.menu_item_nutrition_label_image(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param float id: The menu item id. (required)
        :param bool show_optional_nutrients: Whether to show optional nutrients.
        :param bool show_zero_values: Whether to show zero values.
        :param bool show_ingredients: Whether to show a list of ingredients.
        :return: object
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.menu_item_nutrition_label_image_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.menu_item_nutrition_label_image_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def menu_item_nutrition_label_image_with_http_info(self, id, **kwargs):  # noqa: E501
        """Menu Item Nutrition Label Image  # noqa: E501

        Visualize a menu item's nutritional label information as an image.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.menu_item_nutrition_label_image_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param float id: The menu item id. (required)
        :param bool show_optional_nutrients: Whether to show optional nutrients.
        :param bool show_zero_values: Whether to show zero values.
        :param bool show_ingredients: Whether to show a list of ingredients.
        :return: object
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['id', 'show_optional_nutrients', 'show_zero_values', 'show_ingredients']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method menu_item_nutrition_label_image" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in local_var_params or
                local_var_params['id'] is None):
            raise ApiValueError("Missing the required parameter `id` when calling `menu_item_nutrition_label_image`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in local_var_params:
            path_params['id'] = local_var_params['id']  # noqa: E501

        query_params = []
        if 'show_optional_nutrients' in local_var_params:
            query_params.append(('showOptionalNutrients', local_var_params['show_optional_nutrients']))  # noqa: E501
        if 'show_zero_values' in local_var_params:
            query_params.append(('showZeroValues', local_var_params['show_zero_values']))  # noqa: E501
        if 'show_ingredients' in local_var_params:
            query_params.append(('showIngredients', local_var_params['show_ingredients']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['image/png'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apiKeyScheme']  # noqa: E501

        return self.api_client.call_api(
            '/food/menuItems/{id}/nutritionLabel.png', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='object',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def menu_item_nutrition_label_widget(self, id, **kwargs):  # noqa: E501
        """Menu Item Nutrition Label Widget  # noqa: E501

        Visualize a menu item's nutritional label information as HTML including CSS.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.menu_item_nutrition_label_widget(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param float id: The menu item id. (required)
        :param bool default_css: Whether the default CSS should be added to the response.
        :param bool show_optional_nutrients: Whether to show optional nutrients.
        :param bool show_zero_values: Whether to show zero values.
        :param bool show_ingredients: Whether to show a list of ingredients.
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.menu_item_nutrition_label_widget_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.menu_item_nutrition_label_widget_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def menu_item_nutrition_label_widget_with_http_info(self, id, **kwargs):  # noqa: E501
        """Menu Item Nutrition Label Widget  # noqa: E501

        Visualize a menu item's nutritional label information as HTML including CSS.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.menu_item_nutrition_label_widget_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param float id: The menu item id. (required)
        :param bool default_css: Whether the default CSS should be added to the response.
        :param bool show_optional_nutrients: Whether to show optional nutrients.
        :param bool show_zero_values: Whether to show zero values.
        :param bool show_ingredients: Whether to show a list of ingredients.
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['id', 'default_css', 'show_optional_nutrients', 'show_zero_values', 'show_ingredients']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method menu_item_nutrition_label_widget" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in local_var_params or
                local_var_params['id'] is None):
            raise ApiValueError("Missing the required parameter `id` when calling `menu_item_nutrition_label_widget`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in local_var_params:
            path_params['id'] = local_var_params['id']  # noqa: E501

        query_params = []
        if 'default_css' in local_var_params:
            query_params.append(('defaultCss', local_var_params['default_css']))  # noqa: E501
        if 'show_optional_nutrients' in local_var_params:
            query_params.append(('showOptionalNutrients', local_var_params['show_optional_nutrients']))  # noqa: E501
        if 'show_zero_values' in local_var_params:
            query_params.append(('showZeroValues', local_var_params['show_zero_values']))  # noqa: E501
        if 'show_ingredients' in local_var_params:
            query_params.append(('showIngredients', local_var_params['show_ingredients']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['text/html'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apiKeyScheme']  # noqa: E501

        return self.api_client.call_api(
            '/food/menuItems/{id}/nutritionLabel', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='str',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def search_menu_items(self, **kwargs):  # noqa: E501
        """Search Menu Items  # noqa: E501

        Search over 115,000 menu items from over 800 fast food and chain restaurants. For example, McDonald's Big Mac or Starbucks Mocha.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.search_menu_items(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str query: The (natural language) search query.
        :param float min_calories: The minimum amount of calories the menu item must have.
        :param float max_calories: The maximum amount of calories the menu item can have.
        :param float min_carbs: The minimum amount of carbohydrates in grams the menu item must have.
        :param float max_carbs: The maximum amount of carbohydrates in grams the menu item can have.
        :param float min_protein: The minimum amount of protein in grams the menu item must have.
        :param float max_protein: The maximum amount of protein in grams the menu item can have.
        :param float min_fat: The minimum amount of fat in grams the menu item must have.
        :param float max_fat: The maximum amount of fat in grams the menu item can have.
        :param bool add_menu_item_information: If set to true, you get more information about the menu items returned.
        :param int offset: The number of results to skip (between 0 and 900).
        :param int number: The maximum number of items to return (between 1 and 100). Defaults to 10.
        :return: InlineResponse20035
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.search_menu_items_with_http_info(**kwargs)  # noqa: E501
        else:
            (data) = self.search_menu_items_with_http_info(**kwargs)  # noqa: E501
            return data

    def search_menu_items_with_http_info(self, **kwargs):  # noqa: E501
        """Search Menu Items  # noqa: E501

        Search over 115,000 menu items from over 800 fast food and chain restaurants. For example, McDonald's Big Mac or Starbucks Mocha.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.search_menu_items_with_http_info(async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param str query: The (natural language) search query.
        :param float min_calories: The minimum amount of calories the menu item must have.
        :param float max_calories: The maximum amount of calories the menu item can have.
        :param float min_carbs: The minimum amount of carbohydrates in grams the menu item must have.
        :param float max_carbs: The maximum amount of carbohydrates in grams the menu item can have.
        :param float min_protein: The minimum amount of protein in grams the menu item must have.
        :param float max_protein: The maximum amount of protein in grams the menu item can have.
        :param float min_fat: The minimum amount of fat in grams the menu item must have.
        :param float max_fat: The maximum amount of fat in grams the menu item can have.
        :param bool add_menu_item_information: If set to true, you get more information about the menu items returned.
        :param int offset: The number of results to skip (between 0 and 900).
        :param int number: The maximum number of items to return (between 1 and 100). Defaults to 10.
        :return: InlineResponse20035
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['query', 'min_calories', 'max_calories', 'min_carbs', 'max_carbs', 'min_protein', 'max_protein', 'min_fat', 'max_fat', 'add_menu_item_information', 'offset', 'number']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method search_menu_items" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']

        if 'offset' in local_var_params and local_var_params['offset'] > 900:  # noqa: E501
            raise ApiValueError("Invalid value for parameter `offset` when calling `search_menu_items`, must be a value less than or equal to `900`")  # noqa: E501
        if 'offset' in local_var_params and local_var_params['offset'] < 0:  # noqa: E501
            raise ApiValueError("Invalid value for parameter `offset` when calling `search_menu_items`, must be a value greater than or equal to `0`")  # noqa: E501
        if 'number' in local_var_params and local_var_params['number'] > 100:  # noqa: E501
            raise ApiValueError("Invalid value for parameter `number` when calling `search_menu_items`, must be a value less than or equal to `100`")  # noqa: E501
        if 'number' in local_var_params and local_var_params['number'] < 1:  # noqa: E501
            raise ApiValueError("Invalid value for parameter `number` when calling `search_menu_items`, must be a value greater than or equal to `1`")  # noqa: E501
        collection_formats = {}

        path_params = {}

        query_params = []
        if 'query' in local_var_params:
            query_params.append(('query', local_var_params['query']))  # noqa: E501
        if 'min_calories' in local_var_params:
            query_params.append(('minCalories', local_var_params['min_calories']))  # noqa: E501
        if 'max_calories' in local_var_params:
            query_params.append(('maxCalories', local_var_params['max_calories']))  # noqa: E501
        if 'min_carbs' in local_var_params:
            query_params.append(('minCarbs', local_var_params['min_carbs']))  # noqa: E501
        if 'max_carbs' in local_var_params:
            query_params.append(('maxCarbs', local_var_params['max_carbs']))  # noqa: E501
        if 'min_protein' in local_var_params:
            query_params.append(('minProtein', local_var_params['min_protein']))  # noqa: E501
        if 'max_protein' in local_var_params:
            query_params.append(('maxProtein', local_var_params['max_protein']))  # noqa: E501
        if 'min_fat' in local_var_params:
            query_params.append(('minFat', local_var_params['min_fat']))  # noqa: E501
        if 'max_fat' in local_var_params:
            query_params.append(('maxFat', local_var_params['max_fat']))  # noqa: E501
        if 'add_menu_item_information' in local_var_params:
            query_params.append(('addMenuItemInformation', local_var_params['add_menu_item_information']))  # noqa: E501
        if 'offset' in local_var_params:
            query_params.append(('offset', local_var_params['offset']))  # noqa: E501
        if 'number' in local_var_params:
            query_params.append(('number', local_var_params['number']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apiKeyScheme']  # noqa: E501

        return self.api_client.call_api(
            '/food/menuItems/search', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='InlineResponse20035',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def visualize_menu_item_nutrition_by_id(self, id, **kwargs):  # noqa: E501
        """Menu Item Nutrition by ID Widget  # noqa: E501

        Visualize a menu item's nutritional information as HTML including CSS.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.visualize_menu_item_nutrition_by_id(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int id: The item's id. (required)
        :param bool default_css: Whether the default CSS should be added to the response.
        :param str accept: Accept header.
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('async_req'):
            return self.visualize_menu_item_nutrition_by_id_with_http_info(id, **kwargs)  # noqa: E501
        else:
            (data) = self.visualize_menu_item_nutrition_by_id_with_http_info(id, **kwargs)  # noqa: E501
            return data

    def visualize_menu_item_nutrition_by_id_with_http_info(self, id, **kwargs):  # noqa: E501
        """Menu Item Nutrition by ID Widget  # noqa: E501

        Visualize a menu item's nutritional information as HTML including CSS.  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.visualize_menu_item_nutrition_by_id_with_http_info(id, async_req=True)
        >>> result = thread.get()

        :param async_req bool
        :param int id: The item's id. (required)
        :param bool default_css: Whether the default CSS should be added to the response.
        :param str accept: Accept header.
        :return: str
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = ['id', 'default_css', 'accept']  # noqa: E501
        all_params.append('async_req')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method visualize_menu_item_nutrition_by_id" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'id' is set
        if ('id' not in local_var_params or
                local_var_params['id'] is None):
            raise ApiValueError("Missing the required parameter `id` when calling `visualize_menu_item_nutrition_by_id`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'id' in local_var_params:
            path_params['id'] = local_var_params['id']  # noqa: E501

        query_params = []
        if 'default_css' in local_var_params:
            query_params.append(('defaultCss', local_var_params['default_css']))  # noqa: E501

        header_params = {}
        if 'accept' in local_var_params:
            header_params['Accept'] = local_var_params['accept']  # noqa: E501

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['text/html'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apiKeyScheme']  # noqa: E501

        return self.api_client.call_api(
            '/food/menuItems/{id}/nutritionWidget', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='str',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)
