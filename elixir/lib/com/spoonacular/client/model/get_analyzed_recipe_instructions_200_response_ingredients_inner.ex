# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule com.spoonacular.client.Model.GetAnalyzedRecipeInstructions200ResponseIngredientsInner do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :id,
    :name
  ]

  @type t :: %__MODULE__{
    :id => integer(),
    :name => String.t
  }
end

defimpl Poison.Decoder, for: com.spoonacular.client.Model.GetAnalyzedRecipeInstructions200ResponseIngredientsInner do
  def decode(value, _options) do
    value
  end
end

