# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule com.spoonacular.client.Model.SearchGroceryProducts200Response do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :products,
    :totalProducts,
    :type,
    :offset,
    :number
  ]

  @type t :: %__MODULE__{
    :products => [com.spoonacular.client.Model.AutocompleteRecipeSearch200ResponseInner.t],
    :totalProducts => integer(),
    :type => String.t,
    :offset => integer(),
    :number => integer()
  }
end

defimpl Poison.Decoder, for: com.spoonacular.client.Model.SearchGroceryProducts200Response do
  import com.spoonacular.client.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:products, :list, com.spoonacular.client.Model.AutocompleteRecipeSearch200ResponseInner, options)
  end
end

