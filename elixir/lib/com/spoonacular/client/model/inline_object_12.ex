# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule com.spoonacular.client.Model.InlineObject12 do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"username",
    :"hash"
  ]

  @type t :: %__MODULE__{
    :"username" => String.t,
    :"hash" => String.t
  }
end

defimpl Poison.Decoder, for: com.spoonacular.client.Model.InlineObject12 do
  def decode(value, _options) do
    value
  end
end

