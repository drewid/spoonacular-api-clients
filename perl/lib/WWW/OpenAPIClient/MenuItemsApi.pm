=begin comment

spoonacular API

The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

The version of the OpenAPI document: 2.0.1
Contact: mail@spoonacular.com
Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# Do not edit the class manually.
# Ref: https://openapi-generator.tech
#
package WWW::OpenAPIClient::MenuItemsApi;

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
# autocomplete_menu_item_search
#
# Autocomplete Menu Item Search
#
# @param string $query The (partial) search query. (required)
# @param int $number The number of results to return (between 1 and 25). (optional)
{
    my $params = {
    'query' => {
        data_type => 'string',
        description => 'The (partial) search query.',
        required => '1',
    },
    'number' => {
        data_type => 'int',
        description => 'The number of results to return (between 1 and 25).',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'autocomplete_menu_item_search' } = {
        summary => 'Autocomplete Menu Item Search',
        params => $params,
        returns => 'AutocompleteProductSearch200Response',
        };
}
# @return AutocompleteProductSearch200Response
#
sub autocomplete_menu_item_search {
    my ($self, %args) = @_;

    # verify the required parameter 'query' is set
    unless (exists $args{'query'}) {
      croak("Missing the required parameter 'query' when calling autocomplete_menu_item_search");
    }

    # parse inputs
    my $_resource_path = '/food/menuItems/suggest';

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
    if ( exists $args{'number'}) {
        $query_params->{'number'} = $self->{api_client}->to_query_value($args{'number'});
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
    my $_response_object = $self->{api_client}->deserialize('AutocompleteProductSearch200Response', $response);
    return $_response_object;
}

#
# get_menu_item_information
#
# Get Menu Item Information
#
# @param int $id The menu item id. (required)
{
    my $params = {
    'id' => {
        data_type => 'int',
        description => 'The menu item id.',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_menu_item_information' } = {
        summary => 'Get Menu Item Information',
        params => $params,
        returns => 'MenuItem',
        };
}
# @return MenuItem
#
sub get_menu_item_information {
    my ($self, %args) = @_;

    # verify the required parameter 'id' is set
    unless (exists $args{'id'}) {
      croak("Missing the required parameter 'id' when calling get_menu_item_information");
    }

    # parse inputs
    my $_resource_path = '/food/menuItems/{id}';

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
    my $_response_object = $self->{api_client}->deserialize('MenuItem', $response);
    return $_response_object;
}

#
# menu_item_nutrition_by_id_image
#
# Menu Item Nutrition by ID Image
#
# @param int $id The menu item id. (required)
{
    my $params = {
    'id' => {
        data_type => 'int',
        description => 'The menu item id.',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'menu_item_nutrition_by_id_image' } = {
        summary => 'Menu Item Nutrition by ID Image',
        params => $params,
        returns => 'string',
        };
}
# @return string
#
sub menu_item_nutrition_by_id_image {
    my ($self, %args) = @_;

    # verify the required parameter 'id' is set
    unless (exists $args{'id'}) {
      croak("Missing the required parameter 'id' when calling menu_item_nutrition_by_id_image");
    }

    # parse inputs
    my $_resource_path = '/food/menuItems/{id}/nutritionWidget.png';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('image/png');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

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
    my $_response_object = $self->{api_client}->deserialize('string', $response);
    return $_response_object;
}

#
# menu_item_nutrition_label_image
#
# Menu Item Nutrition Label Image
#
# @param int $id The menu item id. (required)
# @param boolean $show_optional_nutrients Whether to show optional nutrients. (optional)
# @param boolean $show_zero_values Whether to show zero values. (optional)
# @param boolean $show_ingredients Whether to show a list of ingredients. (optional)
{
    my $params = {
    'id' => {
        data_type => 'int',
        description => 'The menu item id.',
        required => '1',
    },
    'show_optional_nutrients' => {
        data_type => 'boolean',
        description => 'Whether to show optional nutrients.',
        required => '0',
    },
    'show_zero_values' => {
        data_type => 'boolean',
        description => 'Whether to show zero values.',
        required => '0',
    },
    'show_ingredients' => {
        data_type => 'boolean',
        description => 'Whether to show a list of ingredients.',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'menu_item_nutrition_label_image' } = {
        summary => 'Menu Item Nutrition Label Image',
        params => $params,
        returns => 'string',
        };
}
# @return string
#
sub menu_item_nutrition_label_image {
    my ($self, %args) = @_;

    # verify the required parameter 'id' is set
    unless (exists $args{'id'}) {
      croak("Missing the required parameter 'id' when calling menu_item_nutrition_label_image");
    }

    # parse inputs
    my $_resource_path = '/food/menuItems/{id}/nutritionLabel.png';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('image/png');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # query params
    if ( exists $args{'show_optional_nutrients'}) {
        $query_params->{'showOptionalNutrients'} = $self->{api_client}->to_query_value($args{'show_optional_nutrients'});
    }

    # query params
    if ( exists $args{'show_zero_values'}) {
        $query_params->{'showZeroValues'} = $self->{api_client}->to_query_value($args{'show_zero_values'});
    }

    # query params
    if ( exists $args{'show_ingredients'}) {
        $query_params->{'showIngredients'} = $self->{api_client}->to_query_value($args{'show_ingredients'});
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
    my $_response_object = $self->{api_client}->deserialize('string', $response);
    return $_response_object;
}

#
# menu_item_nutrition_label_widget
#
# Menu Item Nutrition Label Widget
#
# @param int $id The menu item id. (required)
# @param boolean $default_css Whether the default CSS should be added to the response. (optional, default to true)
# @param boolean $show_optional_nutrients Whether to show optional nutrients. (optional)
# @param boolean $show_zero_values Whether to show zero values. (optional)
# @param boolean $show_ingredients Whether to show a list of ingredients. (optional)
{
    my $params = {
    'id' => {
        data_type => 'int',
        description => 'The menu item id.',
        required => '1',
    },
    'default_css' => {
        data_type => 'boolean',
        description => 'Whether the default CSS should be added to the response.',
        required => '0',
    },
    'show_optional_nutrients' => {
        data_type => 'boolean',
        description => 'Whether to show optional nutrients.',
        required => '0',
    },
    'show_zero_values' => {
        data_type => 'boolean',
        description => 'Whether to show zero values.',
        required => '0',
    },
    'show_ingredients' => {
        data_type => 'boolean',
        description => 'Whether to show a list of ingredients.',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'menu_item_nutrition_label_widget' } = {
        summary => 'Menu Item Nutrition Label Widget',
        params => $params,
        returns => 'string',
        };
}
# @return string
#
sub menu_item_nutrition_label_widget {
    my ($self, %args) = @_;

    # verify the required parameter 'id' is set
    unless (exists $args{'id'}) {
      croak("Missing the required parameter 'id' when calling menu_item_nutrition_label_widget");
    }

    # parse inputs
    my $_resource_path = '/food/menuItems/{id}/nutritionLabel';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('text/html');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # query params
    if ( exists $args{'default_css'}) {
        $query_params->{'defaultCss'} = $self->{api_client}->to_query_value($args{'default_css'});
    }

    # query params
    if ( exists $args{'show_optional_nutrients'}) {
        $query_params->{'showOptionalNutrients'} = $self->{api_client}->to_query_value($args{'show_optional_nutrients'});
    }

    # query params
    if ( exists $args{'show_zero_values'}) {
        $query_params->{'showZeroValues'} = $self->{api_client}->to_query_value($args{'show_zero_values'});
    }

    # query params
    if ( exists $args{'show_ingredients'}) {
        $query_params->{'showIngredients'} = $self->{api_client}->to_query_value($args{'show_ingredients'});
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
    my $_response_object = $self->{api_client}->deserialize('string', $response);
    return $_response_object;
}

#
# search_menu_items
#
# Search Menu Items
#
# @param string $query The (natural language) search query. (required)
# @param double $min_calories The minimum amount of calories the menu item must have. (optional)
# @param double $max_calories The maximum amount of calories the menu item can have. (optional)
# @param double $min_carbs The minimum amount of carbohydrates in grams the menu item must have. (optional)
# @param double $max_carbs The maximum amount of carbohydrates in grams the menu item can have. (optional)
# @param double $min_protein The minimum amount of protein in grams the menu item must have. (optional)
# @param double $max_protein The maximum amount of protein in grams the menu item can have. (optional)
# @param double $min_fat The minimum amount of fat in grams the menu item must have. (optional)
# @param double $max_fat The maximum amount of fat in grams the menu item can have. (optional)
# @param boolean $add_menu_item_information If set to true, you get more information about the menu items returned. (optional)
# @param int $offset The number of results to skip (between 0 and 900). (optional)
# @param int $number The maximum number of items to return (between 1 and 100). Defaults to 10. (optional, default to 10)
{
    my $params = {
    'query' => {
        data_type => 'string',
        description => 'The (natural language) search query.',
        required => '1',
    },
    'min_calories' => {
        data_type => 'double',
        description => 'The minimum amount of calories the menu item must have.',
        required => '0',
    },
    'max_calories' => {
        data_type => 'double',
        description => 'The maximum amount of calories the menu item can have.',
        required => '0',
    },
    'min_carbs' => {
        data_type => 'double',
        description => 'The minimum amount of carbohydrates in grams the menu item must have.',
        required => '0',
    },
    'max_carbs' => {
        data_type => 'double',
        description => 'The maximum amount of carbohydrates in grams the menu item can have.',
        required => '0',
    },
    'min_protein' => {
        data_type => 'double',
        description => 'The minimum amount of protein in grams the menu item must have.',
        required => '0',
    },
    'max_protein' => {
        data_type => 'double',
        description => 'The maximum amount of protein in grams the menu item can have.',
        required => '0',
    },
    'min_fat' => {
        data_type => 'double',
        description => 'The minimum amount of fat in grams the menu item must have.',
        required => '0',
    },
    'max_fat' => {
        data_type => 'double',
        description => 'The maximum amount of fat in grams the menu item can have.',
        required => '0',
    },
    'add_menu_item_information' => {
        data_type => 'boolean',
        description => 'If set to true, you get more information about the menu items returned.',
        required => '0',
    },
    'offset' => {
        data_type => 'int',
        description => 'The number of results to skip (between 0 and 900).',
        required => '0',
    },
    'number' => {
        data_type => 'int',
        description => 'The maximum number of items to return (between 1 and 100). Defaults to 10.',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'search_menu_items' } = {
        summary => 'Search Menu Items',
        params => $params,
        returns => 'SearchMenuItems200Response',
        };
}
# @return SearchMenuItems200Response
#
sub search_menu_items {
    my ($self, %args) = @_;

    # verify the required parameter 'query' is set
    unless (exists $args{'query'}) {
      croak("Missing the required parameter 'query' when calling search_menu_items");
    }

    # parse inputs
    my $_resource_path = '/food/menuItems/search';

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
    if ( exists $args{'min_calories'}) {
        $query_params->{'minCalories'} = $self->{api_client}->to_query_value($args{'min_calories'});
    }

    # query params
    if ( exists $args{'max_calories'}) {
        $query_params->{'maxCalories'} = $self->{api_client}->to_query_value($args{'max_calories'});
    }

    # query params
    if ( exists $args{'min_carbs'}) {
        $query_params->{'minCarbs'} = $self->{api_client}->to_query_value($args{'min_carbs'});
    }

    # query params
    if ( exists $args{'max_carbs'}) {
        $query_params->{'maxCarbs'} = $self->{api_client}->to_query_value($args{'max_carbs'});
    }

    # query params
    if ( exists $args{'min_protein'}) {
        $query_params->{'minProtein'} = $self->{api_client}->to_query_value($args{'min_protein'});
    }

    # query params
    if ( exists $args{'max_protein'}) {
        $query_params->{'maxProtein'} = $self->{api_client}->to_query_value($args{'max_protein'});
    }

    # query params
    if ( exists $args{'min_fat'}) {
        $query_params->{'minFat'} = $self->{api_client}->to_query_value($args{'min_fat'});
    }

    # query params
    if ( exists $args{'max_fat'}) {
        $query_params->{'maxFat'} = $self->{api_client}->to_query_value($args{'max_fat'});
    }

    # query params
    if ( exists $args{'add_menu_item_information'}) {
        $query_params->{'addMenuItemInformation'} = $self->{api_client}->to_query_value($args{'add_menu_item_information'});
    }

    # query params
    if ( exists $args{'offset'}) {
        $query_params->{'offset'} = $self->{api_client}->to_query_value($args{'offset'});
    }

    # query params
    if ( exists $args{'number'}) {
        $query_params->{'number'} = $self->{api_client}->to_query_value($args{'number'});
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
    my $_response_object = $self->{api_client}->deserialize('SearchMenuItems200Response', $response);
    return $_response_object;
}

#
# visualize_menu_item_nutrition_by_id
#
# Menu Item Nutrition by ID Widget
#
# @param int $id The menu item id. (required)
# @param boolean $default_css Whether the default CSS should be added to the response. (optional, default to true)
{
    my $params = {
    'id' => {
        data_type => 'int',
        description => 'The menu item id.',
        required => '1',
    },
    'default_css' => {
        data_type => 'boolean',
        description => 'Whether the default CSS should be added to the response.',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'visualize_menu_item_nutrition_by_id' } = {
        summary => 'Menu Item Nutrition by ID Widget',
        params => $params,
        returns => 'string',
        };
}
# @return string
#
sub visualize_menu_item_nutrition_by_id {
    my ($self, %args) = @_;

    # verify the required parameter 'id' is set
    unless (exists $args{'id'}) {
      croak("Missing the required parameter 'id' when calling visualize_menu_item_nutrition_by_id");
    }

    # parse inputs
    my $_resource_path = '/food/menuItems/{id}/nutritionWidget';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('text/html');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # query params
    if ( exists $args{'default_css'}) {
        $query_params->{'defaultCss'} = $self->{api_client}->to_query_value($args{'default_css'});
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
    my $_response_object = $self->{api_client}->deserialize('string', $response);
    return $_response_object;
}

1;
