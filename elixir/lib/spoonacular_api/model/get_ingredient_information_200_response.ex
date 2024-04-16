# NOTE: This file is auto generated by OpenAPI Generator 7.3.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule SpoonacularAPI.Model.GetIngredientInformation200Response do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :id,
    :original,
    :originalName,
    :name,
    :nameClean,
    :amount,
    :unit,
    :unitShort,
    :unitLong,
    :possibleUnits,
    :estimatedCost,
    :consistency,
    :shoppingListUnits,
    :aisle,
    :image,
    :meta,
    :nutrition,
    :categoryPath
  ]

  @type t :: %__MODULE__{
    :id => integer(),
    :original => String.t,
    :originalName => String.t,
    :name => String.t,
    :nameClean => String.t,
    :amount => float(),
    :unit => String.t,
    :unitShort => String.t,
    :unitLong => String.t,
    :possibleUnits => [String.t],
    :estimatedCost => SpoonacularAPI.Model.ParseIngredients200ResponseInnerEstimatedCost.t,
    :consistency => String.t,
    :shoppingListUnits => [String.t],
    :aisle => String.t,
    :image => String.t,
    :meta => [map()],
    :nutrition => SpoonacularAPI.Model.GetIngredientInformation200ResponseNutrition.t,
    :categoryPath => [String.t]
  }

  alias SpoonacularAPI.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:estimatedCost, :struct, SpoonacularAPI.Model.ParseIngredients200ResponseInnerEstimatedCost)
     |> Deserializer.deserialize(:nutrition, :struct, SpoonacularAPI.Model.GetIngredientInformation200ResponseNutrition)
  end
end
