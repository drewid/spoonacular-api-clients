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

// checks if the AnalyzeARecipeSearchQuery200ResponseIngredientsInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &AnalyzeARecipeSearchQuery200ResponseIngredientsInner{}

// AnalyzeARecipeSearchQuery200ResponseIngredientsInner struct for AnalyzeARecipeSearchQuery200ResponseIngredientsInner
type AnalyzeARecipeSearchQuery200ResponseIngredientsInner struct {
	Image string `json:"image"`
	Include bool `json:"include"`
	Name string `json:"name"`
}

type _AnalyzeARecipeSearchQuery200ResponseIngredientsInner AnalyzeARecipeSearchQuery200ResponseIngredientsInner

// NewAnalyzeARecipeSearchQuery200ResponseIngredientsInner instantiates a new AnalyzeARecipeSearchQuery200ResponseIngredientsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAnalyzeARecipeSearchQuery200ResponseIngredientsInner(image string, include bool, name string) *AnalyzeARecipeSearchQuery200ResponseIngredientsInner {
	this := AnalyzeARecipeSearchQuery200ResponseIngredientsInner{}
	this.Image = image
	this.Include = include
	this.Name = name
	return &this
}

// NewAnalyzeARecipeSearchQuery200ResponseIngredientsInnerWithDefaults instantiates a new AnalyzeARecipeSearchQuery200ResponseIngredientsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAnalyzeARecipeSearchQuery200ResponseIngredientsInnerWithDefaults() *AnalyzeARecipeSearchQuery200ResponseIngredientsInner {
	this := AnalyzeARecipeSearchQuery200ResponseIngredientsInner{}
	return &this
}

// GetImage returns the Image field value
func (o *AnalyzeARecipeSearchQuery200ResponseIngredientsInner) GetImage() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Image
}

// GetImageOk returns a tuple with the Image field value
// and a boolean to check if the value has been set.
func (o *AnalyzeARecipeSearchQuery200ResponseIngredientsInner) GetImageOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Image, true
}

// SetImage sets field value
func (o *AnalyzeARecipeSearchQuery200ResponseIngredientsInner) SetImage(v string) {
	o.Image = v
}

// GetInclude returns the Include field value
func (o *AnalyzeARecipeSearchQuery200ResponseIngredientsInner) GetInclude() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Include
}

// GetIncludeOk returns a tuple with the Include field value
// and a boolean to check if the value has been set.
func (o *AnalyzeARecipeSearchQuery200ResponseIngredientsInner) GetIncludeOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Include, true
}

// SetInclude sets field value
func (o *AnalyzeARecipeSearchQuery200ResponseIngredientsInner) SetInclude(v bool) {
	o.Include = v
}

// GetName returns the Name field value
func (o *AnalyzeARecipeSearchQuery200ResponseIngredientsInner) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *AnalyzeARecipeSearchQuery200ResponseIngredientsInner) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *AnalyzeARecipeSearchQuery200ResponseIngredientsInner) SetName(v string) {
	o.Name = v
}

func (o AnalyzeARecipeSearchQuery200ResponseIngredientsInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o AnalyzeARecipeSearchQuery200ResponseIngredientsInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["image"] = o.Image
	toSerialize["include"] = o.Include
	toSerialize["name"] = o.Name
	return toSerialize, nil
}

func (o *AnalyzeARecipeSearchQuery200ResponseIngredientsInner) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"image",
		"include",
		"name",
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

	varAnalyzeARecipeSearchQuery200ResponseIngredientsInner := _AnalyzeARecipeSearchQuery200ResponseIngredientsInner{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varAnalyzeARecipeSearchQuery200ResponseIngredientsInner)

	if err != nil {
		return err
	}

	*o = AnalyzeARecipeSearchQuery200ResponseIngredientsInner(varAnalyzeARecipeSearchQuery200ResponseIngredientsInner)

	return err
}

type NullableAnalyzeARecipeSearchQuery200ResponseIngredientsInner struct {
	value *AnalyzeARecipeSearchQuery200ResponseIngredientsInner
	isSet bool
}

func (v NullableAnalyzeARecipeSearchQuery200ResponseIngredientsInner) Get() *AnalyzeARecipeSearchQuery200ResponseIngredientsInner {
	return v.value
}

func (v *NullableAnalyzeARecipeSearchQuery200ResponseIngredientsInner) Set(val *AnalyzeARecipeSearchQuery200ResponseIngredientsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableAnalyzeARecipeSearchQuery200ResponseIngredientsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableAnalyzeARecipeSearchQuery200ResponseIngredientsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAnalyzeARecipeSearchQuery200ResponseIngredientsInner(val *AnalyzeARecipeSearchQuery200ResponseIngredientsInner) *NullableAnalyzeARecipeSearchQuery200ResponseIngredientsInner {
	return &NullableAnalyzeARecipeSearchQuery200ResponseIngredientsInner{value: val, isSet: true}
}

func (v NullableAnalyzeARecipeSearchQuery200ResponseIngredientsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAnalyzeARecipeSearchQuery200ResponseIngredientsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


