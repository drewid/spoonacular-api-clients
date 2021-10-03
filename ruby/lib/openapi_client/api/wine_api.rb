=begin
#spoonacular API

#The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 800,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

The version of the OpenAPI document: 1.0
Contact: mail@spoonacular.com
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.0.0-SNAPSHOT

=end

require 'uri'

module OpenapiClient
  class WineApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Dish Pairing for Wine
    # Find a dish that goes well with a given wine.
    # @param wine [String] The type of wine that should be paired, e.g. \&quot;merlot\&quot;, \&quot;riesling\&quot;, or \&quot;malbec\&quot;.
    # @param [Hash] opts the optional parameters
    # @return [InlineResponse20044]
    def get_dish_pairing_for_wine(wine, opts = {})
      data, _status_code, _headers = get_dish_pairing_for_wine_with_http_info(wine, opts)
      data
    end

    # Dish Pairing for Wine
    # Find a dish that goes well with a given wine.
    # @param wine [String] The type of wine that should be paired, e.g. \&quot;merlot\&quot;, \&quot;riesling\&quot;, or \&quot;malbec\&quot;.
    # @param [Hash] opts the optional parameters
    # @return [Array<(InlineResponse20044, Integer, Hash)>] InlineResponse20044 data, response status code and response headers
    def get_dish_pairing_for_wine_with_http_info(wine, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: WineApi.get_dish_pairing_for_wine ...'
      end
      # verify the required parameter 'wine' is set
      if @api_client.config.client_side_validation && wine.nil?
        fail ArgumentError, "Missing the required parameter 'wine' when calling WineApi.get_dish_pairing_for_wine"
      end
      # resource path
      local_var_path = '/food/wine/dishes'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'wine'] = wine

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      # return_type
      return_type = opts[:return_type] || 'InlineResponse20044' 

      # auth_names
      auth_names = opts[:auth_names] || ['apiKeyScheme']

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: WineApi#get_dish_pairing_for_wine\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Wine Description
    # Get a simple description of a certain wine, e.g. \"malbec\", \"riesling\", or \"merlot\".
    # @param wine [String] The name of the wine that should be paired, e.g. \&quot;merlot\&quot;, \&quot;riesling\&quot;, or \&quot;malbec\&quot;.
    # @param [Hash] opts the optional parameters
    # @return [InlineResponse20046]
    def get_wine_description(wine, opts = {})
      data, _status_code, _headers = get_wine_description_with_http_info(wine, opts)
      data
    end

    # Wine Description
    # Get a simple description of a certain wine, e.g. \&quot;malbec\&quot;, \&quot;riesling\&quot;, or \&quot;merlot\&quot;.
    # @param wine [String] The name of the wine that should be paired, e.g. \&quot;merlot\&quot;, \&quot;riesling\&quot;, or \&quot;malbec\&quot;.
    # @param [Hash] opts the optional parameters
    # @return [Array<(InlineResponse20046, Integer, Hash)>] InlineResponse20046 data, response status code and response headers
    def get_wine_description_with_http_info(wine, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: WineApi.get_wine_description ...'
      end
      # verify the required parameter 'wine' is set
      if @api_client.config.client_side_validation && wine.nil?
        fail ArgumentError, "Missing the required parameter 'wine' when calling WineApi.get_wine_description"
      end
      # resource path
      local_var_path = '/food/wine/description'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'wine'] = wine

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      # return_type
      return_type = opts[:return_type] || 'InlineResponse20046' 

      # auth_names
      auth_names = opts[:auth_names] || ['apiKeyScheme']

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: WineApi#get_wine_description\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Wine Pairing
    # Find a wine that goes well with a food. Food can be a dish name (\"steak\"), an ingredient name (\"salmon\"), or a cuisine (\"italian\").
    # @param food [String] The food to get a pairing for. This can be a dish (\&quot;steak\&quot;), an ingredient (\&quot;salmon\&quot;), or a cuisine (\&quot;italian\&quot;).
    # @param [Hash] opts the optional parameters
    # @option opts [Float] :max_price The maximum price for the specific wine recommendation in USD.
    # @return [InlineResponse20045]
    def get_wine_pairing(food, opts = {})
      data, _status_code, _headers = get_wine_pairing_with_http_info(food, opts)
      data
    end

    # Wine Pairing
    # Find a wine that goes well with a food. Food can be a dish name (\&quot;steak\&quot;), an ingredient name (\&quot;salmon\&quot;), or a cuisine (\&quot;italian\&quot;).
    # @param food [String] The food to get a pairing for. This can be a dish (\&quot;steak\&quot;), an ingredient (\&quot;salmon\&quot;), or a cuisine (\&quot;italian\&quot;).
    # @param [Hash] opts the optional parameters
    # @option opts [Float] :max_price The maximum price for the specific wine recommendation in USD.
    # @return [Array<(InlineResponse20045, Integer, Hash)>] InlineResponse20045 data, response status code and response headers
    def get_wine_pairing_with_http_info(food, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: WineApi.get_wine_pairing ...'
      end
      # verify the required parameter 'food' is set
      if @api_client.config.client_side_validation && food.nil?
        fail ArgumentError, "Missing the required parameter 'food' when calling WineApi.get_wine_pairing"
      end
      # resource path
      local_var_path = '/food/wine/pairing'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'food'] = food
      query_params[:'maxPrice'] = opts[:'max_price'] if !opts[:'max_price'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      # return_type
      return_type = opts[:return_type] || 'InlineResponse20045' 

      # auth_names
      auth_names = opts[:auth_names] || ['apiKeyScheme']

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: WineApi#get_wine_pairing\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Wine Recommendation
    # Get a specific wine recommendation (concrete product) for a given wine type, e.g. \"merlot\".
    # @param wine [String] The type of wine to get a specific product recommendation for.
    # @param [Hash] opts the optional parameters
    # @option opts [Float] :max_price The maximum price for the specific wine recommendation in USD.
    # @option opts [Float] :min_rating The minimum rating of the recommended wine between 0 and 1. For example, 0.8 equals 4 out of 5 stars.
    # @option opts [Float] :number The number of wine recommendations expected (between 1 and 100). (default to 10)
    # @return [InlineResponse20047]
    def get_wine_recommendation(wine, opts = {})
      data, _status_code, _headers = get_wine_recommendation_with_http_info(wine, opts)
      data
    end

    # Wine Recommendation
    # Get a specific wine recommendation (concrete product) for a given wine type, e.g. \&quot;merlot\&quot;.
    # @param wine [String] The type of wine to get a specific product recommendation for.
    # @param [Hash] opts the optional parameters
    # @option opts [Float] :max_price The maximum price for the specific wine recommendation in USD.
    # @option opts [Float] :min_rating The minimum rating of the recommended wine between 0 and 1. For example, 0.8 equals 4 out of 5 stars.
    # @option opts [Float] :number The number of wine recommendations expected (between 1 and 100).
    # @return [Array<(InlineResponse20047, Integer, Hash)>] InlineResponse20047 data, response status code and response headers
    def get_wine_recommendation_with_http_info(wine, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: WineApi.get_wine_recommendation ...'
      end
      # verify the required parameter 'wine' is set
      if @api_client.config.client_side_validation && wine.nil?
        fail ArgumentError, "Missing the required parameter 'wine' when calling WineApi.get_wine_recommendation"
      end
      if @api_client.config.client_side_validation && !opts[:'number'].nil? && opts[:'number'] > 100
        fail ArgumentError, 'invalid value for "opts[:"number"]" when calling WineApi.get_wine_recommendation, must be smaller than or equal to 100.'
      end

      if @api_client.config.client_side_validation && !opts[:'number'].nil? && opts[:'number'] < 1
        fail ArgumentError, 'invalid value for "opts[:"number"]" when calling WineApi.get_wine_recommendation, must be greater than or equal to 1.'
      end

      # resource path
      local_var_path = '/food/wine/recommendation'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'wine'] = wine
      query_params[:'maxPrice'] = opts[:'max_price'] if !opts[:'max_price'].nil?
      query_params[:'minRating'] = opts[:'min_rating'] if !opts[:'min_rating'].nil?
      query_params[:'number'] = opts[:'number'] if !opts[:'number'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      # return_type
      return_type = opts[:return_type] || 'InlineResponse20047' 

      # auth_names
      auth_names = opts[:auth_names] || ['apiKeyScheme']

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: WineApi#get_wine_recommendation\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
