# NOTE: This file is auto generated by OpenAPI Generator 7.8.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule SpoonacularAPI.Model.RecipeInformationExtendedIngredientsInnerMeasures do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :metric,
    :us
  ]

  @type t :: %__MODULE__{
    :metric => SpoonacularAPI.Model.RecipeInformationExtendedIngredientsInnerMeasuresMetric.t,
    :us => SpoonacularAPI.Model.RecipeInformationExtendedIngredientsInnerMeasuresMetric.t
  }

  alias SpoonacularAPI.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:metric, :struct, SpoonacularAPI.Model.RecipeInformationExtendedIngredientsInnerMeasuresMetric)
     |> Deserializer.deserialize(:us, :struct, SpoonacularAPI.Model.RecipeInformationExtendedIngredientsInnerMeasuresMetric)
  end
end

