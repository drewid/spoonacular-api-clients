/*
spoonacular API

The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

API version: 2.0.1
Contact: mail@spoonacular.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package spoonacular

import (
	"encoding/json"
	"bytes"
	"fmt"
)

// checks if the AddToMealPlanRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &AddToMealPlanRequest{}

// AddToMealPlanRequest 
type AddToMealPlanRequest struct {
	Date float32 `json:"date"`
	Slot int32 `json:"slot"`
	Position int32 `json:"position"`
	Type string `json:"type"`
	Value AddToMealPlanRequestValue `json:"value"`
}

type _AddToMealPlanRequest AddToMealPlanRequest

// NewAddToMealPlanRequest instantiates a new AddToMealPlanRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAddToMealPlanRequest(date float32, slot int32, position int32, type_ string, value AddToMealPlanRequestValue) *AddToMealPlanRequest {
	this := AddToMealPlanRequest{}
	this.Date = date
	this.Slot = slot
	this.Position = position
	this.Type = type_
	this.Value = value
	return &this
}

// NewAddToMealPlanRequestWithDefaults instantiates a new AddToMealPlanRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAddToMealPlanRequestWithDefaults() *AddToMealPlanRequest {
	this := AddToMealPlanRequest{}
	return &this
}

// GetDate returns the Date field value
func (o *AddToMealPlanRequest) GetDate() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Date
}

// GetDateOk returns a tuple with the Date field value
// and a boolean to check if the value has been set.
func (o *AddToMealPlanRequest) GetDateOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Date, true
}

// SetDate sets field value
func (o *AddToMealPlanRequest) SetDate(v float32) {
	o.Date = v
}

// GetSlot returns the Slot field value
func (o *AddToMealPlanRequest) GetSlot() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Slot
}

// GetSlotOk returns a tuple with the Slot field value
// and a boolean to check if the value has been set.
func (o *AddToMealPlanRequest) GetSlotOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Slot, true
}

// SetSlot sets field value
func (o *AddToMealPlanRequest) SetSlot(v int32) {
	o.Slot = v
}

// GetPosition returns the Position field value
func (o *AddToMealPlanRequest) GetPosition() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Position
}

// GetPositionOk returns a tuple with the Position field value
// and a boolean to check if the value has been set.
func (o *AddToMealPlanRequest) GetPositionOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Position, true
}

// SetPosition sets field value
func (o *AddToMealPlanRequest) SetPosition(v int32) {
	o.Position = v
}

// GetType returns the Type field value
func (o *AddToMealPlanRequest) GetType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *AddToMealPlanRequest) GetTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *AddToMealPlanRequest) SetType(v string) {
	o.Type = v
}

// GetValue returns the Value field value
func (o *AddToMealPlanRequest) GetValue() AddToMealPlanRequestValue {
	if o == nil {
		var ret AddToMealPlanRequestValue
		return ret
	}

	return o.Value
}

// GetValueOk returns a tuple with the Value field value
// and a boolean to check if the value has been set.
func (o *AddToMealPlanRequest) GetValueOk() (*AddToMealPlanRequestValue, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Value, true
}

// SetValue sets field value
func (o *AddToMealPlanRequest) SetValue(v AddToMealPlanRequestValue) {
	o.Value = v
}

func (o AddToMealPlanRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o AddToMealPlanRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["date"] = o.Date
	toSerialize["slot"] = o.Slot
	toSerialize["position"] = o.Position
	toSerialize["type"] = o.Type
	toSerialize["value"] = o.Value
	return toSerialize, nil
}

func (o *AddToMealPlanRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"date",
		"slot",
		"position",
		"type",
		"value",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varAddToMealPlanRequest := _AddToMealPlanRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varAddToMealPlanRequest)

	if err != nil {
		return err
	}

	*o = AddToMealPlanRequest(varAddToMealPlanRequest)

	return err
}

type NullableAddToMealPlanRequest struct {
	value *AddToMealPlanRequest
	isSet bool
}

func (v NullableAddToMealPlanRequest) Get() *AddToMealPlanRequest {
	return v.value
}

func (v *NullableAddToMealPlanRequest) Set(val *AddToMealPlanRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableAddToMealPlanRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableAddToMealPlanRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAddToMealPlanRequest(val *AddToMealPlanRequest) *NullableAddToMealPlanRequest {
	return &NullableAddToMealPlanRequest{value: val, isSet: true}
}

func (v NullableAddToMealPlanRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAddToMealPlanRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


