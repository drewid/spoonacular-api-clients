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

// checks if the CreateRecipeCard200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CreateRecipeCard200Response{}

// CreateRecipeCard200Response 
type CreateRecipeCard200Response struct {
	Url string `json:"url"`
}

type _CreateRecipeCard200Response CreateRecipeCard200Response

// NewCreateRecipeCard200Response instantiates a new CreateRecipeCard200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCreateRecipeCard200Response(url string) *CreateRecipeCard200Response {
	this := CreateRecipeCard200Response{}
	this.Url = url
	return &this
}

// NewCreateRecipeCard200ResponseWithDefaults instantiates a new CreateRecipeCard200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCreateRecipeCard200ResponseWithDefaults() *CreateRecipeCard200Response {
	this := CreateRecipeCard200Response{}
	return &this
}

// GetUrl returns the Url field value
func (o *CreateRecipeCard200Response) GetUrl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Url
}

// GetUrlOk returns a tuple with the Url field value
// and a boolean to check if the value has been set.
func (o *CreateRecipeCard200Response) GetUrlOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Url, true
}

// SetUrl sets field value
func (o *CreateRecipeCard200Response) SetUrl(v string) {
	o.Url = v
}

func (o CreateRecipeCard200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CreateRecipeCard200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["url"] = o.Url
	return toSerialize, nil
}

func (o *CreateRecipeCard200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"url",
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

	varCreateRecipeCard200Response := _CreateRecipeCard200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCreateRecipeCard200Response)

	if err != nil {
		return err
	}

	*o = CreateRecipeCard200Response(varCreateRecipeCard200Response)

	return err
}

type NullableCreateRecipeCard200Response struct {
	value *CreateRecipeCard200Response
	isSet bool
}

func (v NullableCreateRecipeCard200Response) Get() *CreateRecipeCard200Response {
	return v.value
}

func (v *NullableCreateRecipeCard200Response) Set(val *CreateRecipeCard200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateRecipeCard200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateRecipeCard200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateRecipeCard200Response(val *CreateRecipeCard200Response) *NullableCreateRecipeCard200Response {
	return &NullableCreateRecipeCard200Response{value: val, isSet: true}
}

func (v NullableCreateRecipeCard200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateRecipeCard200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


