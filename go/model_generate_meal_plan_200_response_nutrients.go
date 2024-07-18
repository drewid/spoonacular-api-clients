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

// checks if the GenerateMealPlan200ResponseNutrients type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &GenerateMealPlan200ResponseNutrients{}

// GenerateMealPlan200ResponseNutrients struct for GenerateMealPlan200ResponseNutrients
type GenerateMealPlan200ResponseNutrients struct {
	Calories float32 `json:"calories"`
	Carbohydrates float32 `json:"carbohydrates"`
	Fat float32 `json:"fat"`
	Protein float32 `json:"protein"`
}

type _GenerateMealPlan200ResponseNutrients GenerateMealPlan200ResponseNutrients

// NewGenerateMealPlan200ResponseNutrients instantiates a new GenerateMealPlan200ResponseNutrients object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGenerateMealPlan200ResponseNutrients(calories float32, carbohydrates float32, fat float32, protein float32) *GenerateMealPlan200ResponseNutrients {
	this := GenerateMealPlan200ResponseNutrients{}
	this.Calories = calories
	this.Carbohydrates = carbohydrates
	this.Fat = fat
	this.Protein = protein
	return &this
}

// NewGenerateMealPlan200ResponseNutrientsWithDefaults instantiates a new GenerateMealPlan200ResponseNutrients object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGenerateMealPlan200ResponseNutrientsWithDefaults() *GenerateMealPlan200ResponseNutrients {
	this := GenerateMealPlan200ResponseNutrients{}
	return &this
}

// GetCalories returns the Calories field value
func (o *GenerateMealPlan200ResponseNutrients) GetCalories() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Calories
}

// GetCaloriesOk returns a tuple with the Calories field value
// and a boolean to check if the value has been set.
func (o *GenerateMealPlan200ResponseNutrients) GetCaloriesOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Calories, true
}

// SetCalories sets field value
func (o *GenerateMealPlan200ResponseNutrients) SetCalories(v float32) {
	o.Calories = v
}

// GetCarbohydrates returns the Carbohydrates field value
func (o *GenerateMealPlan200ResponseNutrients) GetCarbohydrates() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Carbohydrates
}

// GetCarbohydratesOk returns a tuple with the Carbohydrates field value
// and a boolean to check if the value has been set.
func (o *GenerateMealPlan200ResponseNutrients) GetCarbohydratesOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Carbohydrates, true
}

// SetCarbohydrates sets field value
func (o *GenerateMealPlan200ResponseNutrients) SetCarbohydrates(v float32) {
	o.Carbohydrates = v
}

// GetFat returns the Fat field value
func (o *GenerateMealPlan200ResponseNutrients) GetFat() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Fat
}

// GetFatOk returns a tuple with the Fat field value
// and a boolean to check if the value has been set.
func (o *GenerateMealPlan200ResponseNutrients) GetFatOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Fat, true
}

// SetFat sets field value
func (o *GenerateMealPlan200ResponseNutrients) SetFat(v float32) {
	o.Fat = v
}

// GetProtein returns the Protein field value
func (o *GenerateMealPlan200ResponseNutrients) GetProtein() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Protein
}

// GetProteinOk returns a tuple with the Protein field value
// and a boolean to check if the value has been set.
func (o *GenerateMealPlan200ResponseNutrients) GetProteinOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Protein, true
}

// SetProtein sets field value
func (o *GenerateMealPlan200ResponseNutrients) SetProtein(v float32) {
	o.Protein = v
}

func (o GenerateMealPlan200ResponseNutrients) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o GenerateMealPlan200ResponseNutrients) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["calories"] = o.Calories
	toSerialize["carbohydrates"] = o.Carbohydrates
	toSerialize["fat"] = o.Fat
	toSerialize["protein"] = o.Protein
	return toSerialize, nil
}

func (o *GenerateMealPlan200ResponseNutrients) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"calories",
		"carbohydrates",
		"fat",
		"protein",
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

	varGenerateMealPlan200ResponseNutrients := _GenerateMealPlan200ResponseNutrients{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varGenerateMealPlan200ResponseNutrients)

	if err != nil {
		return err
	}

	*o = GenerateMealPlan200ResponseNutrients(varGenerateMealPlan200ResponseNutrients)

	return err
}

type NullableGenerateMealPlan200ResponseNutrients struct {
	value *GenerateMealPlan200ResponseNutrients
	isSet bool
}

func (v NullableGenerateMealPlan200ResponseNutrients) Get() *GenerateMealPlan200ResponseNutrients {
	return v.value
}

func (v *NullableGenerateMealPlan200ResponseNutrients) Set(val *GenerateMealPlan200ResponseNutrients) {
	v.value = val
	v.isSet = true
}

func (v NullableGenerateMealPlan200ResponseNutrients) IsSet() bool {
	return v.isSet
}

func (v *NullableGenerateMealPlan200ResponseNutrients) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGenerateMealPlan200ResponseNutrients(val *GenerateMealPlan200ResponseNutrients) *NullableGenerateMealPlan200ResponseNutrients {
	return &NullableGenerateMealPlan200ResponseNutrients{value: val, isSet: true}
}

func (v NullableGenerateMealPlan200ResponseNutrients) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGenerateMealPlan200ResponseNutrients) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


