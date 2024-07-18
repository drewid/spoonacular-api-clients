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

// checks if the GetRecipeEquipmentByID200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &GetRecipeEquipmentByID200Response{}

// GetRecipeEquipmentByID200Response 
type GetRecipeEquipmentByID200Response struct {
	Equipment []GetRecipeEquipmentByID200ResponseEquipmentInner `json:"equipment"`
}

type _GetRecipeEquipmentByID200Response GetRecipeEquipmentByID200Response

// NewGetRecipeEquipmentByID200Response instantiates a new GetRecipeEquipmentByID200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetRecipeEquipmentByID200Response(equipment []GetRecipeEquipmentByID200ResponseEquipmentInner) *GetRecipeEquipmentByID200Response {
	this := GetRecipeEquipmentByID200Response{}
	this.Equipment = equipment
	return &this
}

// NewGetRecipeEquipmentByID200ResponseWithDefaults instantiates a new GetRecipeEquipmentByID200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetRecipeEquipmentByID200ResponseWithDefaults() *GetRecipeEquipmentByID200Response {
	this := GetRecipeEquipmentByID200Response{}
	return &this
}

// GetEquipment returns the Equipment field value
func (o *GetRecipeEquipmentByID200Response) GetEquipment() []GetRecipeEquipmentByID200ResponseEquipmentInner {
	if o == nil {
		var ret []GetRecipeEquipmentByID200ResponseEquipmentInner
		return ret
	}

	return o.Equipment
}

// GetEquipmentOk returns a tuple with the Equipment field value
// and a boolean to check if the value has been set.
func (o *GetRecipeEquipmentByID200Response) GetEquipmentOk() ([]GetRecipeEquipmentByID200ResponseEquipmentInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Equipment, true
}

// SetEquipment sets field value
func (o *GetRecipeEquipmentByID200Response) SetEquipment(v []GetRecipeEquipmentByID200ResponseEquipmentInner) {
	o.Equipment = v
}

func (o GetRecipeEquipmentByID200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o GetRecipeEquipmentByID200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["equipment"] = o.Equipment
	return toSerialize, nil
}

func (o *GetRecipeEquipmentByID200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"equipment",
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

	varGetRecipeEquipmentByID200Response := _GetRecipeEquipmentByID200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varGetRecipeEquipmentByID200Response)

	if err != nil {
		return err
	}

	*o = GetRecipeEquipmentByID200Response(varGetRecipeEquipmentByID200Response)

	return err
}

type NullableGetRecipeEquipmentByID200Response struct {
	value *GetRecipeEquipmentByID200Response
	isSet bool
}

func (v NullableGetRecipeEquipmentByID200Response) Get() *GetRecipeEquipmentByID200Response {
	return v.value
}

func (v *NullableGetRecipeEquipmentByID200Response) Set(val *GetRecipeEquipmentByID200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableGetRecipeEquipmentByID200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableGetRecipeEquipmentByID200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetRecipeEquipmentByID200Response(val *GetRecipeEquipmentByID200Response) *NullableGetRecipeEquipmentByID200Response {
	return &NullableGetRecipeEquipmentByID200Response{value: val, isSet: true}
}

func (v NullableGetRecipeEquipmentByID200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetRecipeEquipmentByID200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


