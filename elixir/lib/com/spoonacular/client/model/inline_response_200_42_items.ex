# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule com.spoonacular.client.Model.InlineResponse20042Items do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"id",
    :"name",
    :"measures",
    :"pantryItem",
    :"aisle",
    :"cost",
    :"ingredientId"
  ]

  @type t :: %__MODULE__{
    :"id" => integer(),
    :"name" => String.t,
    :"measures" => InlineResponse20042Measures | nil,
    :"pantryItem" => boolean(),
    :"aisle" => String.t,
    :"cost" => float(),
    :"ingredientId" => integer()
  }
end

defimpl Poison.Decoder, for: com.spoonacular.client.Model.InlineResponse20042Items do
  import com.spoonacular.client.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"measures", :struct, com.spoonacular.client.Model.InlineResponse20042Measures, options)
  end
end

