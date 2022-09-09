-module(openapi_get_recipe_information_200_response_extended_ingredients_inner).

-export([encode/1]).

-export_type([openapi_get_recipe_information_200_response_extended_ingredients_inner/0]).

-type openapi_get_recipe_information_200_response_extended_ingredients_inner() ::
    #{ 'aisle' := binary(),
       'amount' := integer(),
       'consitency' := binary(),
       'id' := integer(),
       'image' := binary(),
       'measures' => openapi_get_recipe_information_200_response_extended_ingredients_inner_measures:openapi_get_recipe_information_200_response_extended_ingredients_inner_measures(),
       'meta' => list(),
       'name' := binary(),
       'original' := binary(),
       'originalName' := binary(),
       'unit' := binary()
     }.

encode(#{ 'aisle' := Aisle,
          'amount' := Amount,
          'consitency' := Consitency,
          'id' := Id,
          'image' := Image,
          'measures' := Measures,
          'meta' := Meta,
          'name' := Name,
          'original' := Original,
          'originalName' := OriginalName,
          'unit' := Unit
        }) ->
    #{ 'aisle' => Aisle,
       'amount' => Amount,
       'consitency' => Consitency,
       'id' => Id,
       'image' => Image,
       'measures' => Measures,
       'meta' => Meta,
       'name' => Name,
       'original' => Original,
       'originalName' => OriginalName,
       'unit' => Unit
     }.
