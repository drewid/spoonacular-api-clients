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

// AnalyzeRecipeInstructions200ResponseIngredientsInner struct for AnalyzeRecipeInstructions200ResponseIngredientsInner
type AnalyzeRecipeInstructions200ResponseIngredientsInner struct {
	Id float32 `json:"id"`
	Name string `json:"name"`
}

// NewAnalyzeRecipeInstructions200ResponseIngredientsInner instantiates a new AnalyzeRecipeInstructions200ResponseIngredientsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAnalyzeRecipeInstructions200ResponseIngredientsInner(id float32, name string) *AnalyzeRecipeInstructions200ResponseIngredientsInner {
	this := AnalyzeRecipeInstructions200ResponseIngredientsInner{}
	this.Id = id
	this.Name = name
	return &this
}

// NewAnalyzeRecipeInstructions200ResponseIngredientsInnerWithDefaults instantiates a new AnalyzeRecipeInstructions200ResponseIngredientsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAnalyzeRecipeInstructions200ResponseIngredientsInnerWithDefaults() *AnalyzeRecipeInstructions200ResponseIngredientsInner {
	this := AnalyzeRecipeInstructions200ResponseIngredientsInner{}
	return &this
}

// GetId returns the Id field value
func (o *AnalyzeRecipeInstructions200ResponseIngredientsInner) GetId() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *AnalyzeRecipeInstructions200ResponseIngredientsInner) GetIdOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *AnalyzeRecipeInstructions200ResponseIngredientsInner) SetId(v float32) {
	o.Id = v
}

// GetName returns the Name field value
func (o *AnalyzeRecipeInstructions200ResponseIngredientsInner) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *AnalyzeRecipeInstructions200ResponseIngredientsInner) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *AnalyzeRecipeInstructions200ResponseIngredientsInner) SetName(v string) {
	o.Name = v
}

func (o AnalyzeRecipeInstructions200ResponseIngredientsInner) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["id"] = o.Id
	}
	if true {
		toSerialize["name"] = o.Name
	}
	return json.Marshal(toSerialize)
}

type NullableAnalyzeRecipeInstructions200ResponseIngredientsInner struct {
	value *AnalyzeRecipeInstructions200ResponseIngredientsInner
	isSet bool
}

func (v NullableAnalyzeRecipeInstructions200ResponseIngredientsInner) Get() *AnalyzeRecipeInstructions200ResponseIngredientsInner {
	return v.value
}

func (v *NullableAnalyzeRecipeInstructions200ResponseIngredientsInner) Set(val *AnalyzeRecipeInstructions200ResponseIngredientsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableAnalyzeRecipeInstructions200ResponseIngredientsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableAnalyzeRecipeInstructions200ResponseIngredientsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAnalyzeRecipeInstructions200ResponseIngredientsInner(val *AnalyzeRecipeInstructions200ResponseIngredientsInner) *NullableAnalyzeRecipeInstructions200ResponseIngredientsInner {
	return &NullableAnalyzeRecipeInstructions200ResponseIngredientsInner{value: val, isSet: true}
}

func (v NullableAnalyzeRecipeInstructions200ResponseIngredientsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAnalyzeRecipeInstructions200ResponseIngredientsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


