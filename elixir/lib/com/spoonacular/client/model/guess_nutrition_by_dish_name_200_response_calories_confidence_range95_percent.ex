# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule com.spoonacular.client.Model.GuessNutritionByDishName200ResponseCaloriesConfidenceRange95Percent do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :max,
    :min
  ]

  @type t :: %__MODULE__{
    :max => float(),
    :min => float()
  }
end

defimpl Poison.Decoder, for: com.spoonacular.client.Model.GuessNutritionByDishName200ResponseCaloriesConfidenceRange95Percent do
  def decode(value, _options) do
    value
  end
end

