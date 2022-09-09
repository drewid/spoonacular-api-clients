# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule com.spoonacular.client.Model.AnalyzeRecipeInstructions200Response do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :parsedInstructions,
    :ingredients,
    :equipment
  ]

  @type t :: %__MODULE__{
    :parsedInstructions => [com.spoonacular.client.Model.AnalyzeRecipeInstructions200ResponseParsedInstructionsInner.t],
    :ingredients => [com.spoonacular.client.Model.AnalyzeRecipeInstructions200ResponseIngredientsInner.t],
    :equipment => [com.spoonacular.client.Model.AnalyzeRecipeInstructions200ResponseIngredientsInner.t]
  }
end

defimpl Poison.Decoder, for: com.spoonacular.client.Model.AnalyzeRecipeInstructions200Response do
  import com.spoonacular.client.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:parsedInstructions, :list, com.spoonacular.client.Model.AnalyzeRecipeInstructions200ResponseParsedInstructionsInner, options)
    |> deserialize(:ingredients, :list, com.spoonacular.client.Model.AnalyzeRecipeInstructions200ResponseIngredientsInner, options)
    |> deserialize(:equipment, :list, com.spoonacular.client.Model.AnalyzeRecipeInstructions200ResponseIngredientsInner, options)
  end
end

