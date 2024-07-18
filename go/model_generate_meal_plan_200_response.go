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

// checks if the GenerateMealPlan200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &GenerateMealPlan200Response{}

// GenerateMealPlan200Response 
type GenerateMealPlan200Response struct {
	Meals []GetSimilarRecipes200ResponseInner `json:"meals"`
	Nutrients GenerateMealPlan200ResponseNutrients `json:"nutrients"`
}

type _GenerateMealPlan200Response GenerateMealPlan200Response

// NewGenerateMealPlan200Response instantiates a new GenerateMealPlan200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGenerateMealPlan200Response(meals []GetSimilarRecipes200ResponseInner, nutrients GenerateMealPlan200ResponseNutrients) *GenerateMealPlan200Response {
	this := GenerateMealPlan200Response{}
	this.Meals = meals
	this.Nutrients = nutrients
	return &this
}

// NewGenerateMealPlan200ResponseWithDefaults instantiates a new GenerateMealPlan200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGenerateMealPlan200ResponseWithDefaults() *GenerateMealPlan200Response {
	this := GenerateMealPlan200Response{}
	return &this
}

// GetMeals returns the Meals field value
func (o *GenerateMealPlan200Response) GetMeals() []GetSimilarRecipes200ResponseInner {
	if o == nil {
		var ret []GetSimilarRecipes200ResponseInner
		return ret
	}

	return o.Meals
}

// GetMealsOk returns a tuple with the Meals field value
// and a boolean to check if the value has been set.
func (o *GenerateMealPlan200Response) GetMealsOk() ([]GetSimilarRecipes200ResponseInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Meals, true
}

// SetMeals sets field value
func (o *GenerateMealPlan200Response) SetMeals(v []GetSimilarRecipes200ResponseInner) {
	o.Meals = v
}

// GetNutrients returns the Nutrients field value
func (o *GenerateMealPlan200Response) GetNutrients() GenerateMealPlan200ResponseNutrients {
	if o == nil {
		var ret GenerateMealPlan200ResponseNutrients
		return ret
	}

	return o.Nutrients
}

// GetNutrientsOk returns a tuple with the Nutrients field value
// and a boolean to check if the value has been set.
func (o *GenerateMealPlan200Response) GetNutrientsOk() (*GenerateMealPlan200ResponseNutrients, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Nutrients, true
}

// SetNutrients sets field value
func (o *GenerateMealPlan200Response) SetNutrients(v GenerateMealPlan200ResponseNutrients) {
	o.Nutrients = v
}

func (o GenerateMealPlan200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o GenerateMealPlan200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["meals"] = o.Meals
	toSerialize["nutrients"] = o.Nutrients
	return toSerialize, nil
}

func (o *GenerateMealPlan200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"meals",
		"nutrients",
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

	varGenerateMealPlan200Response := _GenerateMealPlan200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varGenerateMealPlan200Response)

	if err != nil {
		return err
	}

	*o = GenerateMealPlan200Response(varGenerateMealPlan200Response)

	return err
}

type NullableGenerateMealPlan200Response struct {
	value *GenerateMealPlan200Response
	isSet bool
}

func (v NullableGenerateMealPlan200Response) Get() *GenerateMealPlan200Response {
	return v.value
}

func (v *NullableGenerateMealPlan200Response) Set(val *GenerateMealPlan200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableGenerateMealPlan200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableGenerateMealPlan200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGenerateMealPlan200Response(val *GenerateMealPlan200Response) *NullableGenerateMealPlan200Response {
	return &NullableGenerateMealPlan200Response{value: val, isSet: true}
}

func (v NullableGenerateMealPlan200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGenerateMealPlan200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


