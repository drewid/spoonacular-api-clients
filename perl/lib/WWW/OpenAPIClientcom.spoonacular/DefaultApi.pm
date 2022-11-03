=begin comment

spoonacular API

The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

The version of the OpenAPI document: 1.1
Contact: mail@spoonacular.com
Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# Do not edit the class manually.
# Ref: https://openapi-generator.tech
#
package WWW::OpenAPIClient::DefaultApi;

require 5.6.0;
use strict;
use warnings;
use utf8;
use Exporter;
use Carp qw( croak );
use Log::Any qw($log);

use WWW::OpenAPIClient::ApiClient;

use base "Class::Data::Inheritable";

__PACKAGE__->mk_classdata('method_documentation' => {});

sub new {
    my $class = shift;
    my $api_client;

    if ($_[0] && ref $_[0] && ref $_[0] eq 'WWW::OpenAPIClient::ApiClient' ) {
        $api_client = $_[0];
    } else {
        $api_client = WWW::OpenAPIClient::ApiClient->new(@_);
    }

    bless { api_client => $api_client }, $class;

}


#
# analyze_recipe
#
# Analyze Recipe
#
# @param AnalyzeRecipeRequest $analyze_recipe_request Example request body. (required)
# @param string $language The input language, either \&quot;en\&quot; or \&quot;de\&quot;. (optional)
# @param boolean $include_nutrition Whether nutrition data should be added to correctly parsed ingredients. (optional)
# @param boolean $include_taste Whether taste data should be added to correctly parsed ingredients. (optional)
{
    my $params = {
    'analyze_recipe_request' => {
        data_type => 'AnalyzeRecipeRequest',
        description => 'Example request body.',
        required => '1',
    },
    'language' => {
        data_type => 'string',
        description => 'The input language, either \&quot;en\&quot; or \&quot;de\&quot;.',
        required => '0',
    },
    'include_nutrition' => {
        data_type => 'boolean',
        description => 'Whether nutrition data should be added to correctly parsed ingredients.',
        required => '0',
    },
    'include_taste' => {
        data_type => 'boolean',
        description => 'Whether taste data should be added to correctly parsed ingredients.',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'analyze_recipe' } = {
        summary => 'Analyze Recipe',
        params => $params,
        returns => 'object',
        };
}
# @return object
#
sub analyze_recipe {
    my ($self, %args) = @_;

    # verify the required parameter 'analyze_recipe_request' is set
    unless (exists $args{'analyze_recipe_request'}) {
      croak("Missing the required parameter 'analyze_recipe_request' when calling analyze_recipe");
    }

    # parse inputs
    my $_resource_path = '/recipes/analyze';

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('', 'application/json');

    # query params
    if ( exists $args{'language'}) {
        $query_params->{'language'} = $self->{api_client}->to_query_value($args{'language'});
    }

    # query params
    if ( exists $args{'include_nutrition'}) {
        $query_params->{'includeNutrition'} = $self->{api_client}->to_query_value($args{'include_nutrition'});
    }

    # query params
    if ( exists $args{'include_taste'}) {
        $query_params->{'includeTaste'} = $self->{api_client}->to_query_value($args{'include_taste'});
    }

    my $_body_data;
    # body params
    if ( exists $args{'analyze_recipe_request'}) {
        $_body_data = $args{'analyze_recipe_request'};
    }

    # authentication setting, if any
    my $auth_settings = [qw(apiKeyScheme )];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('object', $response);
    return $_response_object;
}

#
# create_recipe_card_get
#
# Create Recipe Card
#
# @param double $id The recipe id. (required)
# @param string $mask The mask to put over the recipe image (\&quot;ellipseMask\&quot;, \&quot;diamondMask\&quot;, \&quot;starMask\&quot;, \&quot;heartMask\&quot;, \&quot;potMask\&quot;, \&quot;fishMask\&quot;). (optional)
# @param string $background_image The background image (\&quot;none\&quot;,\&quot;background1\&quot;, or \&quot;background2\&quot;). (optional)
# @param string $background_color The background color for the recipe card as a hex-string. (optional)
# @param string $font_color The font color for the recipe card as a hex-string. (optional)
{
    my $params = {
    'id' => {
        data_type => 'double',
        description => 'The recipe id.',
        required => '1',
    },
    'mask' => {
        data_type => 'string',
        description => 'The mask to put over the recipe image (\&quot;ellipseMask\&quot;, \&quot;diamondMask\&quot;, \&quot;starMask\&quot;, \&quot;heartMask\&quot;, \&quot;potMask\&quot;, \&quot;fishMask\&quot;).',
        required => '0',
    },
    'background_image' => {
        data_type => 'string',
        description => 'The background image (\&quot;none\&quot;,\&quot;background1\&quot;, or \&quot;background2\&quot;).',
        required => '0',
    },
    'background_color' => {
        data_type => 'string',
        description => 'The background color for the recipe card as a hex-string.',
        required => '0',
    },
    'font_color' => {
        data_type => 'string',
        description => 'The font color for the recipe card as a hex-string.',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'create_recipe_card_get' } = {
        summary => 'Create Recipe Card',
        params => $params,
        returns => 'object',
        };
}
# @return object
#
sub create_recipe_card_get {
    my ($self, %args) = @_;

    # verify the required parameter 'id' is set
    unless (exists $args{'id'}) {
      croak("Missing the required parameter 'id' when calling create_recipe_card_get");
    }

    # parse inputs
    my $_resource_path = '/recipes/{id}/card';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # query params
    if ( exists $args{'mask'}) {
        $query_params->{'mask'} = $self->{api_client}->to_query_value($args{'mask'});
    }

    # query params
    if ( exists $args{'background_image'}) {
        $query_params->{'backgroundImage'} = $self->{api_client}->to_query_value($args{'background_image'});
    }

    # query params
    if ( exists $args{'background_color'}) {
        $query_params->{'backgroundColor'} = $self->{api_client}->to_query_value($args{'background_color'});
    }

    # query params
    if ( exists $args{'font_color'}) {
        $query_params->{'fontColor'} = $self->{api_client}->to_query_value($args{'font_color'});
    }

    # path params
    if ( exists $args{'id'}) {
        my $_base_variable = "{" . "id" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw(apiKeyScheme )];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('object', $response);
    return $_response_object;
}

#
# search_restaurants
#
# Search Restaurants
#
# @param string $query The search query. (optional)
# @param double $lat The latitude of the user&#39;s location. (optional)
# @param double $lng The longitude of the user&#39;s location.\&quot;. (optional)
# @param double $distance The distance around the location in miles. (optional)
# @param double $budget The user&#39;s budget for a meal in USD. (optional)
# @param string $cuisine The cuisine of the restaurant. (optional)
# @param double $min_rating The minimum rating of the restaurant between 0 and 5. (optional)
# @param boolean $is_open Whether the restaurant must be open at the time of search. (optional)
# @param string $sort How to sort the results, one of the following &#39;cheapest&#39;, &#39;fastest&#39;, &#39;rating&#39;, &#39;distance&#39; or the default &#39;relevance&#39;. (optional)
# @param double $page The page number of results. (optional)
{
    my $params = {
    'query' => {
        data_type => 'string',
        description => 'The search query.',
        required => '0',
    },
    'lat' => {
        data_type => 'double',
        description => 'The latitude of the user&#39;s location.',
        required => '0',
    },
    'lng' => {
        data_type => 'double',
        description => 'The longitude of the user&#39;s location.\&quot;.',
        required => '0',
    },
    'distance' => {
        data_type => 'double',
        description => 'The distance around the location in miles.',
        required => '0',
    },
    'budget' => {
        data_type => 'double',
        description => 'The user&#39;s budget for a meal in USD.',
        required => '0',
    },
    'cuisine' => {
        data_type => 'string',
        description => 'The cuisine of the restaurant.',
        required => '0',
    },
    'min_rating' => {
        data_type => 'double',
        description => 'The minimum rating of the restaurant between 0 and 5.',
        required => '0',
    },
    'is_open' => {
        data_type => 'boolean',
        description => 'Whether the restaurant must be open at the time of search.',
        required => '0',
    },
    'sort' => {
        data_type => 'string',
        description => 'How to sort the results, one of the following &#39;cheapest&#39;, &#39;fastest&#39;, &#39;rating&#39;, &#39;distance&#39; or the default &#39;relevance&#39;.',
        required => '0',
    },
    'page' => {
        data_type => 'double',
        description => 'The page number of results.',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'search_restaurants' } = {
        summary => 'Search Restaurants',
        params => $params,
        returns => 'SearchRestaurants200Response',
        };
}
# @return SearchRestaurants200Response
#
sub search_restaurants {
    my ($self, %args) = @_;

    # parse inputs
    my $_resource_path = '/food/restaurants/search';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # query params
    if ( exists $args{'query'}) {
        $query_params->{'query'} = $self->{api_client}->to_query_value($args{'query'});
    }

    # query params
    if ( exists $args{'lat'}) {
        $query_params->{'lat'} = $self->{api_client}->to_query_value($args{'lat'});
    }

    # query params
    if ( exists $args{'lng'}) {
        $query_params->{'lng'} = $self->{api_client}->to_query_value($args{'lng'});
    }

    # query params
    if ( exists $args{'distance'}) {
        $query_params->{'distance'} = $self->{api_client}->to_query_value($args{'distance'});
    }

    # query params
    if ( exists $args{'budget'}) {
        $query_params->{'budget'} = $self->{api_client}->to_query_value($args{'budget'});
    }

    # query params
    if ( exists $args{'cuisine'}) {
        $query_params->{'cuisine'} = $self->{api_client}->to_query_value($args{'cuisine'});
    }

    # query params
    if ( exists $args{'min_rating'}) {
        $query_params->{'min-rating'} = $self->{api_client}->to_query_value($args{'min_rating'});
    }

    # query params
    if ( exists $args{'is_open'}) {
        $query_params->{'is-open'} = $self->{api_client}->to_query_value($args{'is_open'});
    }

    # query params
    if ( exists $args{'sort'}) {
        $query_params->{'sort'} = $self->{api_client}->to_query_value($args{'sort'});
    }

    # query params
    if ( exists $args{'page'}) {
        $query_params->{'page'} = $self->{api_client}->to_query_value($args{'page'});
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw(apiKeyScheme )];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('SearchRestaurants200Response', $response);
    return $_response_object;
}

1;
