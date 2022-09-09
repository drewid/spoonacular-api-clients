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

// GetWinePairing200Response 
type GetWinePairing200Response struct {
	PairedWines []string `json:"pairedWines"`
	PairingText string `json:"pairingText"`
	ProductMatches []GetWinePairing200ResponseProductMatchesInner `json:"productMatches"`
}

// NewGetWinePairing200Response instantiates a new GetWinePairing200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetWinePairing200Response(pairedWines []string, pairingText string, productMatches []GetWinePairing200ResponseProductMatchesInner) *GetWinePairing200Response {
	this := GetWinePairing200Response{}
	this.PairedWines = pairedWines
	this.PairingText = pairingText
	this.ProductMatches = productMatches
	return &this
}

// NewGetWinePairing200ResponseWithDefaults instantiates a new GetWinePairing200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetWinePairing200ResponseWithDefaults() *GetWinePairing200Response {
	this := GetWinePairing200Response{}
	return &this
}

// GetPairedWines returns the PairedWines field value
func (o *GetWinePairing200Response) GetPairedWines() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.PairedWines
}

// GetPairedWinesOk returns a tuple with the PairedWines field value
// and a boolean to check if the value has been set.
func (o *GetWinePairing200Response) GetPairedWinesOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.PairedWines, true
}

// SetPairedWines sets field value
func (o *GetWinePairing200Response) SetPairedWines(v []string) {
	o.PairedWines = v
}

// GetPairingText returns the PairingText field value
func (o *GetWinePairing200Response) GetPairingText() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.PairingText
}

// GetPairingTextOk returns a tuple with the PairingText field value
// and a boolean to check if the value has been set.
func (o *GetWinePairing200Response) GetPairingTextOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.PairingText, true
}

// SetPairingText sets field value
func (o *GetWinePairing200Response) SetPairingText(v string) {
	o.PairingText = v
}

// GetProductMatches returns the ProductMatches field value
func (o *GetWinePairing200Response) GetProductMatches() []GetWinePairing200ResponseProductMatchesInner {
	if o == nil {
		var ret []GetWinePairing200ResponseProductMatchesInner
		return ret
	}

	return o.ProductMatches
}

// GetProductMatchesOk returns a tuple with the ProductMatches field value
// and a boolean to check if the value has been set.
func (o *GetWinePairing200Response) GetProductMatchesOk() ([]GetWinePairing200ResponseProductMatchesInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.ProductMatches, true
}

// SetProductMatches sets field value
func (o *GetWinePairing200Response) SetProductMatches(v []GetWinePairing200ResponseProductMatchesInner) {
	o.ProductMatches = v
}

func (o GetWinePairing200Response) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["pairedWines"] = o.PairedWines
	}
	if true {
		toSerialize["pairingText"] = o.PairingText
	}
	if true {
		toSerialize["productMatches"] = o.ProductMatches
	}
	return json.Marshal(toSerialize)
}

type NullableGetWinePairing200Response struct {
	value *GetWinePairing200Response
	isSet bool
}

func (v NullableGetWinePairing200Response) Get() *GetWinePairing200Response {
	return v.value
}

func (v *NullableGetWinePairing200Response) Set(val *GetWinePairing200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableGetWinePairing200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableGetWinePairing200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetWinePairing200Response(val *GetWinePairing200Response) *NullableGetWinePairing200Response {
	return &NullableGetWinePairing200Response{value: val, isSet: true}
}

func (v NullableGetWinePairing200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetWinePairing200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


