# NOTE: This file is auto generated by OpenAPI Generator 7.8.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule SpoonacularAPI.Model.SearchResult do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :image,
    :link,
    :name,
    :type,
    :kvtable,
    :content,
    :id,
    :relevance
  ]

  @type t :: %__MODULE__{
    :image => String.t | nil,
    :link => String.t | nil,
    :name => String.t,
    :type => String.t | nil,
    :kvtable => String.t | nil,
    :content => String.t | nil,
    :id => integer() | nil,
    :relevance => float() | nil
  }

  def decode(value) do
    value
  end
end
