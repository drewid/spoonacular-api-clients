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

// GenerateShoppingListRequest struct for GenerateShoppingListRequest
type GenerateShoppingListRequest struct {
	// The username.
	Username string `json:"username"`
	// The start date in the format yyyy-mm-dd.
	StartDate string `json:"start-date"`
	// The end date in the format yyyy-mm-dd.
	EndDate string `json:"end-date"`
	// The private hash for the username.
	Hash string `json:"hash"`
}

// NewGenerateShoppingListRequest instantiates a new GenerateShoppingListRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGenerateShoppingListRequest(username string, startDate string, endDate string, hash string) *GenerateShoppingListRequest {
	this := GenerateShoppingListRequest{}
	this.Username = username
	this.StartDate = startDate
	this.EndDate = endDate
	this.Hash = hash
	return &this
}

// NewGenerateShoppingListRequestWithDefaults instantiates a new GenerateShoppingListRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGenerateShoppingListRequestWithDefaults() *GenerateShoppingListRequest {
	this := GenerateShoppingListRequest{}
	return &this
}

// GetUsername returns the Username field value
func (o *GenerateShoppingListRequest) GetUsername() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Username
}

// GetUsernameOk returns a tuple with the Username field value
// and a boolean to check if the value has been set.
func (o *GenerateShoppingListRequest) GetUsernameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Username, true
}

// SetUsername sets field value
func (o *GenerateShoppingListRequest) SetUsername(v string) {
	o.Username = v
}

// GetStartDate returns the StartDate field value
func (o *GenerateShoppingListRequest) GetStartDate() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.StartDate
}

// GetStartDateOk returns a tuple with the StartDate field value
// and a boolean to check if the value has been set.
func (o *GenerateShoppingListRequest) GetStartDateOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.StartDate, true
}

// SetStartDate sets field value
func (o *GenerateShoppingListRequest) SetStartDate(v string) {
	o.StartDate = v
}

// GetEndDate returns the EndDate field value
func (o *GenerateShoppingListRequest) GetEndDate() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.EndDate
}

// GetEndDateOk returns a tuple with the EndDate field value
// and a boolean to check if the value has been set.
func (o *GenerateShoppingListRequest) GetEndDateOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.EndDate, true
}

// SetEndDate sets field value
func (o *GenerateShoppingListRequest) SetEndDate(v string) {
	o.EndDate = v
}

// GetHash returns the Hash field value
func (o *GenerateShoppingListRequest) GetHash() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Hash
}

// GetHashOk returns a tuple with the Hash field value
// and a boolean to check if the value has been set.
func (o *GenerateShoppingListRequest) GetHashOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Hash, true
}

// SetHash sets field value
func (o *GenerateShoppingListRequest) SetHash(v string) {
	o.Hash = v
}

func (o GenerateShoppingListRequest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["username"] = o.Username
	}
	if true {
		toSerialize["start-date"] = o.StartDate
	}
	if true {
		toSerialize["end-date"] = o.EndDate
	}
	if true {
		toSerialize["hash"] = o.Hash
	}
	return json.Marshal(toSerialize)
}

type NullableGenerateShoppingListRequest struct {
	value *GenerateShoppingListRequest
	isSet bool
}

func (v NullableGenerateShoppingListRequest) Get() *GenerateShoppingListRequest {
	return v.value
}

func (v *NullableGenerateShoppingListRequest) Set(val *GenerateShoppingListRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableGenerateShoppingListRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableGenerateShoppingListRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGenerateShoppingListRequest(val *GenerateShoppingListRequest) *NullableGenerateShoppingListRequest {
	return &NullableGenerateShoppingListRequest{value: val, isSet: true}
}

func (v NullableGenerateShoppingListRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGenerateShoppingListRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


