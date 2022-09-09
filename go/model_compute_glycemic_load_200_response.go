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

// ComputeGlycemicLoad200Response 
type ComputeGlycemicLoad200Response struct {
	TotalGlycemicLoad float32 `json:"totalGlycemicLoad"`
	Ingredients []ComputeGlycemicLoad200ResponseIngredientsInner `json:"ingredients"`
}

// NewComputeGlycemicLoad200Response instantiates a new ComputeGlycemicLoad200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewComputeGlycemicLoad200Response(totalGlycemicLoad float32, ingredients []ComputeGlycemicLoad200ResponseIngredientsInner) *ComputeGlycemicLoad200Response {
	this := ComputeGlycemicLoad200Response{}
	this.TotalGlycemicLoad = totalGlycemicLoad
	this.Ingredients = ingredients
	return &this
}

// NewComputeGlycemicLoad200ResponseWithDefaults instantiates a new ComputeGlycemicLoad200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewComputeGlycemicLoad200ResponseWithDefaults() *ComputeGlycemicLoad200Response {
	this := ComputeGlycemicLoad200Response{}
	return &this
}

// GetTotalGlycemicLoad returns the TotalGlycemicLoad field value
func (o *ComputeGlycemicLoad200Response) GetTotalGlycemicLoad() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.TotalGlycemicLoad
}

// GetTotalGlycemicLoadOk returns a tuple with the TotalGlycemicLoad field value
// and a boolean to check if the value has been set.
func (o *ComputeGlycemicLoad200Response) GetTotalGlycemicLoadOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.TotalGlycemicLoad, true
}

// SetTotalGlycemicLoad sets field value
func (o *ComputeGlycemicLoad200Response) SetTotalGlycemicLoad(v float32) {
	o.TotalGlycemicLoad = v
}

// GetIngredients returns the Ingredients field value
func (o *ComputeGlycemicLoad200Response) GetIngredients() []ComputeGlycemicLoad200ResponseIngredientsInner {
	if o == nil {
		var ret []ComputeGlycemicLoad200ResponseIngredientsInner
		return ret
	}

	return o.Ingredients
}

// GetIngredientsOk returns a tuple with the Ingredients field value
// and a boolean to check if the value has been set.
func (o *ComputeGlycemicLoad200Response) GetIngredientsOk() ([]ComputeGlycemicLoad200ResponseIngredientsInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Ingredients, true
}

// SetIngredients sets field value
func (o *ComputeGlycemicLoad200Response) SetIngredients(v []ComputeGlycemicLoad200ResponseIngredientsInner) {
	o.Ingredients = v
}

func (o ComputeGlycemicLoad200Response) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["totalGlycemicLoad"] = o.TotalGlycemicLoad
	}
	if true {
		toSerialize["ingredients"] = o.Ingredients
	}
	return json.Marshal(toSerialize)
}

type NullableComputeGlycemicLoad200Response struct {
	value *ComputeGlycemicLoad200Response
	isSet bool
}

func (v NullableComputeGlycemicLoad200Response) Get() *ComputeGlycemicLoad200Response {
	return v.value
}

func (v *NullableComputeGlycemicLoad200Response) Set(val *ComputeGlycemicLoad200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableComputeGlycemicLoad200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableComputeGlycemicLoad200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableComputeGlycemicLoad200Response(val *ComputeGlycemicLoad200Response) *NullableComputeGlycemicLoad200Response {
	return &NullableComputeGlycemicLoad200Response{value: val, isSet: true}
}

func (v NullableComputeGlycemicLoad200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableComputeGlycemicLoad200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


