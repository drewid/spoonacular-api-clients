# NOTE: This file is auto generated by OpenAPI Generator 7.3.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule SpoonacularAPI.Model.GetMealPlanTemplates200Response do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :templates
  ]

  @type t :: %__MODULE__{
    :templates => [SpoonacularAPI.Model.GetAnalyzedRecipeInstructions200ResponseIngredientsInner.t]
  }

  alias SpoonacularAPI.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:templates, :list, SpoonacularAPI.Model.GetAnalyzedRecipeInstructions200ResponseIngredientsInner)
  end
end
