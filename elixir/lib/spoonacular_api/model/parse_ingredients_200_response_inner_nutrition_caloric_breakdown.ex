# NOTE: This file is auto generated by OpenAPI Generator 7.3.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule SpoonacularAPI.Model.ParseIngredients200ResponseInnerNutritionCaloricBreakdown do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :percentProtein,
    :percentFat,
    :percentCarbs
  ]

  @type t :: %__MODULE__{
    :percentProtein => float(),
    :percentFat => float(),
    :percentCarbs => float()
  }

  def decode(value) do
    value
  end
end
