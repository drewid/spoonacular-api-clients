# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule com.spoonacular.client.Model.SearchSiteContent200ResponseGroceryProductsInnerDataPointsInner do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :key,
    :value
  ]

  @type t :: %__MODULE__{
    :key => String.t,
    :value => String.t
  }
end

defimpl Poison.Decoder, for: com.spoonacular.client.Model.SearchSiteContent200ResponseGroceryProductsInnerDataPointsInner do
  def decode(value, _options) do
    value
  end
end

