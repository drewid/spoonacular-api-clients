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

// AddToMealPlanRequest1 
type AddToMealPlanRequest1 struct {
	Date float32 `json:"date"`
	Slot int32 `json:"slot"`
	Position int32 `json:"position"`
	Type string `json:"type"`
	Value AddToMealPlanRequest1Value `json:"value"`
}

// NewAddToMealPlanRequest1 instantiates a new AddToMealPlanRequest1 object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAddToMealPlanRequest1(date float32, slot int32, position int32, type_ string, value AddToMealPlanRequest1Value) *AddToMealPlanRequest1 {
	this := AddToMealPlanRequest1{}
	this.Date = date
	this.Slot = slot
	this.Position = position
	this.Type = type_
	this.Value = value
	return &this
}

// NewAddToMealPlanRequest1WithDefaults instantiates a new AddToMealPlanRequest1 object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAddToMealPlanRequest1WithDefaults() *AddToMealPlanRequest1 {
	this := AddToMealPlanRequest1{}
	return &this
}

// GetDate returns the Date field value
func (o *AddToMealPlanRequest1) GetDate() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Date
}

// GetDateOk returns a tuple with the Date field value
// and a boolean to check if the value has been set.
func (o *AddToMealPlanRequest1) GetDateOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Date, true
}

// SetDate sets field value
func (o *AddToMealPlanRequest1) SetDate(v float32) {
	o.Date = v
}

// GetSlot returns the Slot field value
func (o *AddToMealPlanRequest1) GetSlot() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Slot
}

// GetSlotOk returns a tuple with the Slot field value
// and a boolean to check if the value has been set.
func (o *AddToMealPlanRequest1) GetSlotOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Slot, true
}

// SetSlot sets field value
func (o *AddToMealPlanRequest1) SetSlot(v int32) {
	o.Slot = v
}

// GetPosition returns the Position field value
func (o *AddToMealPlanRequest1) GetPosition() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Position
}

// GetPositionOk returns a tuple with the Position field value
// and a boolean to check if the value has been set.
func (o *AddToMealPlanRequest1) GetPositionOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Position, true
}

// SetPosition sets field value
func (o *AddToMealPlanRequest1) SetPosition(v int32) {
	o.Position = v
}

// GetType returns the Type field value
func (o *AddToMealPlanRequest1) GetType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *AddToMealPlanRequest1) GetTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *AddToMealPlanRequest1) SetType(v string) {
	o.Type = v
}

// GetValue returns the Value field value
func (o *AddToMealPlanRequest1) GetValue() AddToMealPlanRequest1Value {
	if o == nil {
		var ret AddToMealPlanRequest1Value
		return ret
	}

	return o.Value
}

// GetValueOk returns a tuple with the Value field value
// and a boolean to check if the value has been set.
func (o *AddToMealPlanRequest1) GetValueOk() (*AddToMealPlanRequest1Value, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Value, true
}

// SetValue sets field value
func (o *AddToMealPlanRequest1) SetValue(v AddToMealPlanRequest1Value) {
	o.Value = v
}

func (o AddToMealPlanRequest1) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["date"] = o.Date
	}
	if true {
		toSerialize["slot"] = o.Slot
	}
	if true {
		toSerialize["position"] = o.Position
	}
	if true {
		toSerialize["type"] = o.Type
	}
	if true {
		toSerialize["value"] = o.Value
	}
	return json.Marshal(toSerialize)
}

type NullableAddToMealPlanRequest1 struct {
	value *AddToMealPlanRequest1
	isSet bool
}

func (v NullableAddToMealPlanRequest1) Get() *AddToMealPlanRequest1 {
	return v.value
}

func (v *NullableAddToMealPlanRequest1) Set(val *AddToMealPlanRequest1) {
	v.value = val
	v.isSet = true
}

func (v NullableAddToMealPlanRequest1) IsSet() bool {
	return v.isSet
}

func (v *NullableAddToMealPlanRequest1) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAddToMealPlanRequest1(val *AddToMealPlanRequest1) *NullableAddToMealPlanRequest1 {
	return &NullableAddToMealPlanRequest1{value: val, isSet: true}
}

func (v NullableAddToMealPlanRequest1) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAddToMealPlanRequest1) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


