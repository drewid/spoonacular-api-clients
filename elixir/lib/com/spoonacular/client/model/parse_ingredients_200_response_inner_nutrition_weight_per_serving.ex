# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule com.spoonacular.client.Model.ParseIngredients200ResponseInnerNutritionWeightPerServing do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :amount,
    :unit
  ]

  @type t :: %__MODULE__{
    :amount => float(),
    :unit => String.t
  }
end

defimpl Poison.Decoder, for: com.spoonacular.client.Model.ParseIngredients200ResponseInnerNutritionWeightPerServing do
  def decode(value, _options) do
    value
  end
end

