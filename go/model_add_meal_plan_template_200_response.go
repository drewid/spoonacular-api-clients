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

// AddMealPlanTemplate200Response 
type AddMealPlanTemplate200Response struct {
	Name string `json:"name"`
	Items []AddMealPlanTemplate200ResponseItemsInner `json:"items"`
	PublishAsPublic bool `json:"publishAsPublic"`
}

// NewAddMealPlanTemplate200Response instantiates a new AddMealPlanTemplate200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAddMealPlanTemplate200Response(name string, items []AddMealPlanTemplate200ResponseItemsInner, publishAsPublic bool) *AddMealPlanTemplate200Response {
	this := AddMealPlanTemplate200Response{}
	this.Name = name
	this.Items = items
	this.PublishAsPublic = publishAsPublic
	return &this
}

// NewAddMealPlanTemplate200ResponseWithDefaults instantiates a new AddMealPlanTemplate200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAddMealPlanTemplate200ResponseWithDefaults() *AddMealPlanTemplate200Response {
	this := AddMealPlanTemplate200Response{}
	return &this
}

// GetName returns the Name field value
func (o *AddMealPlanTemplate200Response) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *AddMealPlanTemplate200Response) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *AddMealPlanTemplate200Response) SetName(v string) {
	o.Name = v
}

// GetItems returns the Items field value
func (o *AddMealPlanTemplate200Response) GetItems() []AddMealPlanTemplate200ResponseItemsInner {
	if o == nil {
		var ret []AddMealPlanTemplate200ResponseItemsInner
		return ret
	}

	return o.Items
}

// GetItemsOk returns a tuple with the Items field value
// and a boolean to check if the value has been set.
func (o *AddMealPlanTemplate200Response) GetItemsOk() ([]AddMealPlanTemplate200ResponseItemsInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Items, true
}

// SetItems sets field value
func (o *AddMealPlanTemplate200Response) SetItems(v []AddMealPlanTemplate200ResponseItemsInner) {
	o.Items = v
}

// GetPublishAsPublic returns the PublishAsPublic field value
func (o *AddMealPlanTemplate200Response) GetPublishAsPublic() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.PublishAsPublic
}

// GetPublishAsPublicOk returns a tuple with the PublishAsPublic field value
// and a boolean to check if the value has been set.
func (o *AddMealPlanTemplate200Response) GetPublishAsPublicOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.PublishAsPublic, true
}

// SetPublishAsPublic sets field value
func (o *AddMealPlanTemplate200Response) SetPublishAsPublic(v bool) {
	o.PublishAsPublic = v
}

func (o AddMealPlanTemplate200Response) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["name"] = o.Name
	}
	if true {
		toSerialize["items"] = o.Items
	}
	if true {
		toSerialize["publishAsPublic"] = o.PublishAsPublic
	}
	return json.Marshal(toSerialize)
}

type NullableAddMealPlanTemplate200Response struct {
	value *AddMealPlanTemplate200Response
	isSet bool
}

func (v NullableAddMealPlanTemplate200Response) Get() *AddMealPlanTemplate200Response {
	return v.value
}

func (v *NullableAddMealPlanTemplate200Response) Set(val *AddMealPlanTemplate200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableAddMealPlanTemplate200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableAddMealPlanTemplate200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAddMealPlanTemplate200Response(val *AddMealPlanTemplate200Response) *NullableAddMealPlanTemplate200Response {
	return &NullableAddMealPlanTemplate200Response{value: val, isSet: true}
}

func (v NullableAddMealPlanTemplate200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAddMealPlanTemplate200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


