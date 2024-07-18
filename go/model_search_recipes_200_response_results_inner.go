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

// checks if the SearchRecipes200ResponseResultsInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &SearchRecipes200ResponseResultsInner{}

// SearchRecipes200ResponseResultsInner struct for SearchRecipes200ResponseResultsInner
type SearchRecipes200ResponseResultsInner struct {
	Id int32 `json:"id"`
	Title string `json:"title"`
	Image string `json:"image"`
	ImageType string `json:"imageType"`
}

type _SearchRecipes200ResponseResultsInner SearchRecipes200ResponseResultsInner

// NewSearchRecipes200ResponseResultsInner instantiates a new SearchRecipes200ResponseResultsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSearchRecipes200ResponseResultsInner(id int32, title string, image string, imageType string) *SearchRecipes200ResponseResultsInner {
	this := SearchRecipes200ResponseResultsInner{}
	this.Id = id
	this.Title = title
	this.Image = image
	this.ImageType = imageType
	return &this
}

// NewSearchRecipes200ResponseResultsInnerWithDefaults instantiates a new SearchRecipes200ResponseResultsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSearchRecipes200ResponseResultsInnerWithDefaults() *SearchRecipes200ResponseResultsInner {
	this := SearchRecipes200ResponseResultsInner{}
	return &this
}

// GetId returns the Id field value
func (o *SearchRecipes200ResponseResultsInner) GetId() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *SearchRecipes200ResponseResultsInner) GetIdOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *SearchRecipes200ResponseResultsInner) SetId(v int32) {
	o.Id = v
}

// GetTitle returns the Title field value
func (o *SearchRecipes200ResponseResultsInner) GetTitle() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Title
}

// GetTitleOk returns a tuple with the Title field value
// and a boolean to check if the value has been set.
func (o *SearchRecipes200ResponseResultsInner) GetTitleOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Title, true
}

// SetTitle sets field value
func (o *SearchRecipes200ResponseResultsInner) SetTitle(v string) {
	o.Title = v
}

// GetImage returns the Image field value
func (o *SearchRecipes200ResponseResultsInner) GetImage() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Image
}

// GetImageOk returns a tuple with the Image field value
// and a boolean to check if the value has been set.
func (o *SearchRecipes200ResponseResultsInner) GetImageOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Image, true
}

// SetImage sets field value
func (o *SearchRecipes200ResponseResultsInner) SetImage(v string) {
	o.Image = v
}

// GetImageType returns the ImageType field value
func (o *SearchRecipes200ResponseResultsInner) GetImageType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ImageType
}

// GetImageTypeOk returns a tuple with the ImageType field value
// and a boolean to check if the value has been set.
func (o *SearchRecipes200ResponseResultsInner) GetImageTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ImageType, true
}

// SetImageType sets field value
func (o *SearchRecipes200ResponseResultsInner) SetImageType(v string) {
	o.ImageType = v
}

func (o SearchRecipes200ResponseResultsInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o SearchRecipes200ResponseResultsInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["id"] = o.Id
	toSerialize["title"] = o.Title
	toSerialize["image"] = o.Image
	toSerialize["imageType"] = o.ImageType
	return toSerialize, nil
}

func (o *SearchRecipes200ResponseResultsInner) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"id",
		"title",
		"image",
		"imageType",
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

	varSearchRecipes200ResponseResultsInner := _SearchRecipes200ResponseResultsInner{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varSearchRecipes200ResponseResultsInner)

	if err != nil {
		return err
	}

	*o = SearchRecipes200ResponseResultsInner(varSearchRecipes200ResponseResultsInner)

	return err
}

type NullableSearchRecipes200ResponseResultsInner struct {
	value *SearchRecipes200ResponseResultsInner
	isSet bool
}

func (v NullableSearchRecipes200ResponseResultsInner) Get() *SearchRecipes200ResponseResultsInner {
	return v.value
}

func (v *NullableSearchRecipes200ResponseResultsInner) Set(val *SearchRecipes200ResponseResultsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableSearchRecipes200ResponseResultsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableSearchRecipes200ResponseResultsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSearchRecipes200ResponseResultsInner(val *SearchRecipes200ResponseResultsInner) *NullableSearchRecipes200ResponseResultsInner {
	return &NullableSearchRecipes200ResponseResultsInner{value: val, isSet: true}
}

func (v NullableSearchRecipes200ResponseResultsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSearchRecipes200ResponseResultsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


