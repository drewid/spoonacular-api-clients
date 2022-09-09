# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule com.spoonacular.client.Model.GetShoppingList200ResponseAislesInnerItemsInner do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :id,
    :name,
    :measures,
    :pantryItem,
    :aisle,
    :cost,
    :ingredientId
  ]

  @type t :: %__MODULE__{
    :id => integer(),
    :name => String.t,
    :measures => com.spoonacular.client.Model.GetShoppingList200ResponseAislesInnerItemsInnerMeasures.t | nil,
    :pantryItem => boolean(),
    :aisle => String.t,
    :cost => float(),
    :ingredientId => integer()
  }
end

defimpl Poison.Decoder, for: com.spoonacular.client.Model.GetShoppingList200ResponseAislesInnerItemsInner do
  import com.spoonacular.client.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:measures, :struct, com.spoonacular.client.Model.GetShoppingList200ResponseAislesInnerItemsInnerMeasures, options)
  end
end

