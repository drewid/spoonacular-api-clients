# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule com.spoonacular.client.Model.GetRecipePriceBreakdownById200ResponseIngredientsInnerAmount do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :metric,
    :us
  ]

  @type t :: %__MODULE__{
    :metric => com.spoonacular.client.Model.GetRecipePriceBreakdownById200ResponseIngredientsInnerAmountMetric.t,
    :us => com.spoonacular.client.Model.GetRecipePriceBreakdownById200ResponseIngredientsInnerAmountMetric.t
  }
end

defimpl Poison.Decoder, for: com.spoonacular.client.Model.GetRecipePriceBreakdownById200ResponseIngredientsInnerAmount do
  import com.spoonacular.client.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:metric, :struct, com.spoonacular.client.Model.GetRecipePriceBreakdownById200ResponseIngredientsInnerAmountMetric, options)
    |> deserialize(:us, :struct, com.spoonacular.client.Model.GetRecipePriceBreakdownById200ResponseIngredientsInnerAmountMetric, options)
  end
end

