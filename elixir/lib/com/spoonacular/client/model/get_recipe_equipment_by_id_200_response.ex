# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule com.spoonacular.client.Model.GetRecipeEquipmentById200Response do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :equipment
  ]

  @type t :: %__MODULE__{
    :equipment => [com.spoonacular.client.Model.GetRecipeEquipmentById200ResponseEquipmentInner.t]
  }
end

defimpl Poison.Decoder, for: com.spoonacular.client.Model.GetRecipeEquipmentById200Response do
  import com.spoonacular.client.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:equipment, :list, com.spoonacular.client.Model.GetRecipeEquipmentById200ResponseEquipmentInner, options)
  end
end
