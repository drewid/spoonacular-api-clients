/*
spoonacular API

The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 800,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

API version: 1.1
Contact: mail@spoonacular.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// SearchRecipes200Response 
type SearchRecipes200Response struct {
	Offset int32 `json:"offset"`
	Number int32 `json:"number"`
	Results []SearchRecipes200ResponseResultsInner `json:"results"`
	TotalResults int32 `json:"totalResults"`
}

// NewSearchRecipes200Response instantiates a new SearchRecipes200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSearchRecipes200Response(offset int32, number int32, results []SearchRecipes200ResponseResultsInner, totalResults int32) *SearchRecipes200Response {
	this := SearchRecipes200Response{}
	this.Offset = offset
	this.Number = number
	this.Results = results
	this.TotalResults = totalResults
	return &this
}

// NewSearchRecipes200ResponseWithDefaults instantiates a new SearchRecipes200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSearchRecipes200ResponseWithDefaults() *SearchRecipes200Response {
	this := SearchRecipes200Response{}
	return &this
}

// GetOffset returns the Offset field value
func (o *SearchRecipes200Response) GetOffset() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Offset
}

// GetOffsetOk returns a tuple with the Offset field value
// and a boolean to check if the value has been set.
func (o *SearchRecipes200Response) GetOffsetOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Offset, true
}

// SetOffset sets field value
func (o *SearchRecipes200Response) SetOffset(v int32) {
	o.Offset = v
}

// GetNumber returns the Number field value
func (o *SearchRecipes200Response) GetNumber() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Number
}

// GetNumberOk returns a tuple with the Number field value
// and a boolean to check if the value has been set.
func (o *SearchRecipes200Response) GetNumberOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Number, true
}

// SetNumber sets field value
func (o *SearchRecipes200Response) SetNumber(v int32) {
	o.Number = v
}

// GetResults returns the Results field value
func (o *SearchRecipes200Response) GetResults() []SearchRecipes200ResponseResultsInner {
	if o == nil {
		var ret []SearchRecipes200ResponseResultsInner
		return ret
	}

	return o.Results
}

// GetResultsOk returns a tuple with the Results field value
// and a boolean to check if the value has been set.
func (o *SearchRecipes200Response) GetResultsOk() ([]SearchRecipes200ResponseResultsInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Results, true
}

// SetResults sets field value
func (o *SearchRecipes200Response) SetResults(v []SearchRecipes200ResponseResultsInner) {
	o.Results = v
}

// GetTotalResults returns the TotalResults field value
func (o *SearchRecipes200Response) GetTotalResults() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.TotalResults
}

// GetTotalResultsOk returns a tuple with the TotalResults field value
// and a boolean to check if the value has been set.
func (o *SearchRecipes200Response) GetTotalResultsOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.TotalResults, true
}

// SetTotalResults sets field value
func (o *SearchRecipes200Response) SetTotalResults(v int32) {
	o.TotalResults = v
}

func (o SearchRecipes200Response) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["offset"] = o.Offset
	}
	if true {
		toSerialize["number"] = o.Number
	}
	if true {
		toSerialize["results"] = o.Results
	}
	if true {
		toSerialize["totalResults"] = o.TotalResults
	}
	return json.Marshal(toSerialize)
}

type NullableSearchRecipes200Response struct {
	value *SearchRecipes200Response
	isSet bool
}

func (v NullableSearchRecipes200Response) Get() *SearchRecipes200Response {
	return v.value
}

func (v *NullableSearchRecipes200Response) Set(val *SearchRecipes200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableSearchRecipes200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableSearchRecipes200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSearchRecipes200Response(val *SearchRecipes200Response) *NullableSearchRecipes200Response {
	return &NullableSearchRecipes200Response{value: val, isSet: true}
}

func (v NullableSearchRecipes200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSearchRecipes200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


