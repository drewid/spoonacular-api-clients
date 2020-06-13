-module(spoonacular_inline_object_12).

-export([encode/1]).

-export_type([spoonacular_inline_object_12/0]).

-type spoonacular_inline_object_12() ::
    #{ 'username' := binary(),
       'hash' := binary()
     }.

encode(#{ 'username' := Username,
          'hash' := Hash
        }) ->
    #{ 'username' => Username,
       'hash' => Hash
     }.
