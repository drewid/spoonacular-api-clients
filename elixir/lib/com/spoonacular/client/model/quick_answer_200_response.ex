# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule com.spoonacular.client.Model.QuickAnswer200Response do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :answer,
    :image
  ]

  @type t :: %__MODULE__{
    :answer => String.t,
    :image => String.t
  }
end

defimpl Poison.Decoder, for: com.spoonacular.client.Model.QuickAnswer200Response do
  def decode(value, _options) do
    value
  end
end

