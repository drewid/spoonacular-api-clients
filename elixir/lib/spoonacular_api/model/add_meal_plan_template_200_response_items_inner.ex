# NOTE: This file is auto generated by OpenAPI Generator 7.3.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule SpoonacularAPI.Model.AddMealPlanTemplate200ResponseItemsInner do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :day,
    :slot,
    :position,
    :type,
    :value
  ]

  @type t :: %__MODULE__{
    :day => integer(),
    :slot => integer(),
    :position => integer(),
    :type => String.t,
    :value => SpoonacularAPI.Model.AddMealPlanTemplate200ResponseItemsInnerValue.t | nil
  }

  alias SpoonacularAPI.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:value, :struct, SpoonacularAPI.Model.AddMealPlanTemplate200ResponseItemsInnerValue)
  end
end
