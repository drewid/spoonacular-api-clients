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
package WWW::OpenAPIClient::Object::SearchRestaurants200ResponseRestaurantsInner;

require 5.6.0;
use strict;
use warnings;
use utf8;
use JSON qw(decode_json);
use Data::Dumper;
use Module::Runtime qw(use_module);
use Log::Any qw($log);
use Date::Parse;
use DateTime;

use WWW::OpenAPIClient::Object::SearchRestaurants200ResponseRestaurantsInnerAddress;
use WWW::OpenAPIClient::Object::SearchRestaurants200ResponseRestaurantsInnerLocalHours;

use base ("Class::Accessor", "Class::Data::Inheritable");

#
#
#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech). Do not edit the class manually.
# REF: https://openapi-generator.tech
#

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
__PACKAGE__->mk_classdata('attribute_map' => {});
__PACKAGE__->mk_classdata('openapi_types' => {});
__PACKAGE__->mk_classdata('method_documentation' => {});
__PACKAGE__->mk_classdata('class_documentation' => {});

# new plain object
sub new {
    my ($class, %args) = @_;

    my $self = bless {}, $class;

    $self->init(%args);

    return $self;
}

# initialize the object
sub init
{
    my ($self, %args) = @_;

    foreach my $attribute (keys %{$self->attribute_map}) {
        my $args_key = $self->attribute_map->{$attribute};
        $self->$attribute( $args{ $args_key } );
    }
}

# return perl hash
sub to_hash {
    my $self = shift;
    my $_hash = decode_json(JSON->new->convert_blessed->encode($self));

    return $_hash;
}

# used by JSON for serialization
sub TO_JSON {
    my $self = shift;
    my $_data = {};
    foreach my $_key (keys %{$self->attribute_map}) {
        if (defined $self->{$_key}) {
            my $_json_attribute = $self->attribute_map->{$_key};
            my $_type = $self->openapi_types->{$_key};
            my $_value = $self->{$_key};
            if ($_type =~ /^array\[(.+)\]$/i) { # array
                my $_subclass = $1;
                $_data->{$_json_attribute} =  [ map { $self->_to_json_primitives($_subclass, $_) } @$_value ];
            } elsif ($_type =~ /^hash\[string,(.+)\]$/i) { # hash
                my $_subclass = $1;
                my %_hash = ();
                while (my($_key, $_element) = each %{$_value}) {
                    $_hash{$_key} = $self->_to_json_primitives($_subclass, $_element);
                }
                $_data->{$_json_attribute} = \%_hash;
            } elsif ( grep( /^$_type$/, ('int', 'double', 'string', 'boolean', 'DATE', 'DATE_TIME'))) {
                $_data->{$_json_attribute} = $self->_to_json_primitives($_type, $_value);
            } else {
                $_data->{$_json_attribute} = $_value;
            }
        }
    }

    return $_data;
}

# to_json non-array data
sub _to_json_primitives {
    my ($self, $type, $data) = @_;
    if ( grep( /^$type$/, ('int', 'double'))) {
        # https://metacpan.org/pod/JSON#simple-scalars
        # numify it, ensuring it will be dumped as a number
        return undef unless defined $data;
        return $data + 0;
    } elsif ($type eq 'string') {
        # https://metacpan.org/pod/JSON#simple-scalars
        # stringified
        return undef unless defined $data;
        return $data . q();
    } elsif ($type eq 'boolean') {
        # https://metacpan.org/pod/JSON#JSON::true,-JSON::false,-JSON::null
        return $data ? \1 : \0;
    } elsif ($type eq 'DATE') {
        return undef unless defined $data;
        if (ref($data) eq 'DateTime') {
            # https://metacpan.org/pod/DateTime#$dt-%3Eymd($optional_separator),-$dt-%3Emdy(...),-$dt-%3Edmy(...)
            return $data->ymd;
        }
        return $data .q();
    } elsif ($type eq 'DATE_TIME') {
        return undef unless defined $data;
        # the date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z
        if (ref($data) eq 'DateTime') {
            # https://metacpan.org/pod/DateTime#$dt-%3Erfc3339
            return $data->rfc3339;
        }
        return $data .q();
    } else { # hash (model),  In this case, the TO_JSON of the $data object is executed
        return $data;
    }
}

# from Perl hashref
sub from_hash {
    my ($self, $hash) = @_;

    # loop through attributes and use openapi_types to deserialize the data
    while ( my ($_key, $_type) = each %{$self->openapi_types} ) {
        my $_json_attribute = $self->attribute_map->{$_key};
        if ($_type =~ /^array\[(.+)\]$/i) { # array
            my $_subclass = $1;
            my @_array = ();
            foreach my $_element (@{$hash->{$_json_attribute}}) {
                push @_array, $self->_deserialize($_subclass, $_element);
            }
            $self->{$_key} = \@_array;
        } elsif ($_type =~ /^hash\[string,(.+)\]$/i) { # hash
            my $_subclass = $1;
            my %_hash = ();
            while (my($_key, $_element) = each %{$hash->{$_json_attribute}}) {
                $_hash{$_key} = $self->_deserialize($_subclass, $_element);
            }
            $self->{$_key} = \%_hash;
        } elsif (exists $hash->{$_json_attribute}) { #hash(model), primitive, datetime
            $self->{$_key} = $self->_deserialize($_type, $hash->{$_json_attribute});
        } else {
            $log->debugf("Warning: %s (%s) does not exist in input hash\n", $_key, $_json_attribute);
        }
    }

    return $self;
}

# deserialize non-array data
sub _deserialize {
    my ($self, $type, $data) = @_;
    $log->debugf("deserializing %s with %s",Dumper($data), $type);

    if (grep( /^$type$/ , ('DATE_TIME', 'DATE'))) {
        return DateTime->from_epoch(epoch => str2time($data));
    } elsif ( grep( /^$type$/, ('int', 'double'))) {
        return undef unless defined $data;
        return $data + 0;
    } elsif ($type eq 'string') {
        return undef unless defined $data;
        return $data . q();
    } elsif ($type eq 'boolean') {
        return !!$data;
    } else { # hash(model)
        my $_instance = eval "WWW::OpenAPIClient::Object::$type->new()";
        return $_instance->from_hash($data);
    }
}


__PACKAGE__->class_documentation({description => '',
                                  class => 'SearchRestaurants200ResponseRestaurantsInner',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
    '_id' => {
        datatype => 'string',
        base_name => '_id',
        description => '',
        format => '',
        read_only => '',
            },
    'name' => {
        datatype => 'string',
        base_name => 'name',
        description => '',
        format => '',
        read_only => '',
            },
    'phone_number' => {
        datatype => 'int',
        base_name => 'phone_number',
        description => '',
        format => '',
        read_only => '',
            },
    'address' => {
        datatype => 'SearchRestaurants200ResponseRestaurantsInnerAddress',
        base_name => 'address',
        description => '',
        format => '',
        read_only => '',
            },
    'type' => {
        datatype => 'string',
        base_name => 'type',
        description => '',
        format => '',
        read_only => '',
            },
    'description' => {
        datatype => 'string',
        base_name => 'description',
        description => '',
        format => '',
        read_only => '',
            },
    'local_hours' => {
        datatype => 'SearchRestaurants200ResponseRestaurantsInnerLocalHours',
        base_name => 'local_hours',
        description => '',
        format => '',
        read_only => '',
            },
    'cuisines' => {
        datatype => 'ARRAY[string]',
        base_name => 'cuisines',
        description => '',
        format => '',
        read_only => '',
            },
    'food_photos' => {
        datatype => 'ARRAY[string]',
        base_name => 'food_photos',
        description => '',
        format => '',
        read_only => '',
            },
    'logo_photos' => {
        datatype => 'ARRAY[string]',
        base_name => 'logo_photos',
        description => '',
        format => '',
        read_only => '',
            },
    'store_photos' => {
        datatype => 'ARRAY[string]',
        base_name => 'store_photos',
        description => '',
        format => '',
        read_only => '',
            },
    'dollar_signs' => {
        datatype => 'int',
        base_name => 'dollar_signs',
        description => '',
        format => '',
        read_only => '',
            },
    'pickup_enabled' => {
        datatype => 'boolean',
        base_name => 'pickup_enabled',
        description => '',
        format => '',
        read_only => '',
            },
    'delivery_enabled' => {
        datatype => 'boolean',
        base_name => 'delivery_enabled',
        description => '',
        format => '',
        read_only => '',
            },
    'is_open' => {
        datatype => 'boolean',
        base_name => 'is_open',
        description => '',
        format => '',
        read_only => '',
            },
    'offers_first_party_delivery' => {
        datatype => 'boolean',
        base_name => 'offers_first_party_delivery',
        description => '',
        format => '',
        read_only => '',
            },
    'offers_third_party_delivery' => {
        datatype => 'boolean',
        base_name => 'offers_third_party_delivery',
        description => '',
        format => '',
        read_only => '',
            },
    'miles' => {
        datatype => 'double',
        base_name => 'miles',
        description => '',
        format => '',
        read_only => '',
            },
    'weighted_rating_value' => {
        datatype => 'double',
        base_name => 'weighted_rating_value',
        description => '',
        format => '',
        read_only => '',
            },
    'aggregated_rating_count' => {
        datatype => 'int',
        base_name => 'aggregated_rating_count',
        description => '',
        format => '',
        read_only => '',
            },
});

__PACKAGE__->openapi_types( {
    '_id' => 'string',
    'name' => 'string',
    'phone_number' => 'int',
    'address' => 'SearchRestaurants200ResponseRestaurantsInnerAddress',
    'type' => 'string',
    'description' => 'string',
    'local_hours' => 'SearchRestaurants200ResponseRestaurantsInnerLocalHours',
    'cuisines' => 'ARRAY[string]',
    'food_photos' => 'ARRAY[string]',
    'logo_photos' => 'ARRAY[string]',
    'store_photos' => 'ARRAY[string]',
    'dollar_signs' => 'int',
    'pickup_enabled' => 'boolean',
    'delivery_enabled' => 'boolean',
    'is_open' => 'boolean',
    'offers_first_party_delivery' => 'boolean',
    'offers_third_party_delivery' => 'boolean',
    'miles' => 'double',
    'weighted_rating_value' => 'double',
    'aggregated_rating_count' => 'int'
} );

__PACKAGE__->attribute_map( {
    '_id' => '_id',
    'name' => 'name',
    'phone_number' => 'phone_number',
    'address' => 'address',
    'type' => 'type',
    'description' => 'description',
    'local_hours' => 'local_hours',
    'cuisines' => 'cuisines',
    'food_photos' => 'food_photos',
    'logo_photos' => 'logo_photos',
    'store_photos' => 'store_photos',
    'dollar_signs' => 'dollar_signs',
    'pickup_enabled' => 'pickup_enabled',
    'delivery_enabled' => 'delivery_enabled',
    'is_open' => 'is_open',
    'offers_first_party_delivery' => 'offers_first_party_delivery',
    'offers_third_party_delivery' => 'offers_third_party_delivery',
    'miles' => 'miles',
    'weighted_rating_value' => 'weighted_rating_value',
    'aggregated_rating_count' => 'aggregated_rating_count'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;
