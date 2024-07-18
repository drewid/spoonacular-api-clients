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

// checks if the ImageAnalysisByURL200ResponseRecipesInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ImageAnalysisByURL200ResponseRecipesInner{}

// ImageAnalysisByURL200ResponseRecipesInner struct for ImageAnalysisByURL200ResponseRecipesInner
type ImageAnalysisByURL200ResponseRecipesInner struct {
	Id int32 `json:"id"`
	Title string `json:"title"`
	ImageType string `json:"imageType"`
	Url string `json:"url"`
}

type _ImageAnalysisByURL200ResponseRecipesInner ImageAnalysisByURL200ResponseRecipesInner

// NewImageAnalysisByURL200ResponseRecipesInner instantiates a new ImageAnalysisByURL200ResponseRecipesInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewImageAnalysisByURL200ResponseRecipesInner(id int32, title string, imageType string, url string) *ImageAnalysisByURL200ResponseRecipesInner {
	this := ImageAnalysisByURL200ResponseRecipesInner{}
	this.Id = id
	this.Title = title
	this.ImageType = imageType
	this.Url = url
	return &this
}

// NewImageAnalysisByURL200ResponseRecipesInnerWithDefaults instantiates a new ImageAnalysisByURL200ResponseRecipesInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewImageAnalysisByURL200ResponseRecipesInnerWithDefaults() *ImageAnalysisByURL200ResponseRecipesInner {
	this := ImageAnalysisByURL200ResponseRecipesInner{}
	return &this
}

// GetId returns the Id field value
func (o *ImageAnalysisByURL200ResponseRecipesInner) GetId() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *ImageAnalysisByURL200ResponseRecipesInner) GetIdOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *ImageAnalysisByURL200ResponseRecipesInner) SetId(v int32) {
	o.Id = v
}

// GetTitle returns the Title field value
func (o *ImageAnalysisByURL200ResponseRecipesInner) GetTitle() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Title
}

// GetTitleOk returns a tuple with the Title field value
// and a boolean to check if the value has been set.
func (o *ImageAnalysisByURL200ResponseRecipesInner) GetTitleOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Title, true
}

// SetTitle sets field value
func (o *ImageAnalysisByURL200ResponseRecipesInner) SetTitle(v string) {
	o.Title = v
}

// GetImageType returns the ImageType field value
func (o *ImageAnalysisByURL200ResponseRecipesInner) GetImageType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ImageType
}

// GetImageTypeOk returns a tuple with the ImageType field value
// and a boolean to check if the value has been set.
func (o *ImageAnalysisByURL200ResponseRecipesInner) GetImageTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ImageType, true
}

// SetImageType sets field value
func (o *ImageAnalysisByURL200ResponseRecipesInner) SetImageType(v string) {
	o.ImageType = v
}

// GetUrl returns the Url field value
func (o *ImageAnalysisByURL200ResponseRecipesInner) GetUrl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Url
}

// GetUrlOk returns a tuple with the Url field value
// and a boolean to check if the value has been set.
func (o *ImageAnalysisByURL200ResponseRecipesInner) GetUrlOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Url, true
}

// SetUrl sets field value
func (o *ImageAnalysisByURL200ResponseRecipesInner) SetUrl(v string) {
	o.Url = v
}

func (o ImageAnalysisByURL200ResponseRecipesInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ImageAnalysisByURL200ResponseRecipesInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["id"] = o.Id
	toSerialize["title"] = o.Title
	toSerialize["imageType"] = o.ImageType
	toSerialize["url"] = o.Url
	return toSerialize, nil
}

func (o *ImageAnalysisByURL200ResponseRecipesInner) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"id",
		"title",
		"imageType",
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

	varImageAnalysisByURL200ResponseRecipesInner := _ImageAnalysisByURL200ResponseRecipesInner{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varImageAnalysisByURL200ResponseRecipesInner)

	if err != nil {
		return err
	}

	*o = ImageAnalysisByURL200ResponseRecipesInner(varImageAnalysisByURL200ResponseRecipesInner)

	return err
}

type NullableImageAnalysisByURL200ResponseRecipesInner struct {
	value *ImageAnalysisByURL200ResponseRecipesInner
	isSet bool
}

func (v NullableImageAnalysisByURL200ResponseRecipesInner) Get() *ImageAnalysisByURL200ResponseRecipesInner {
	return v.value
}

func (v *NullableImageAnalysisByURL200ResponseRecipesInner) Set(val *ImageAnalysisByURL200ResponseRecipesInner) {
	v.value = val
	v.isSet = true
}

func (v NullableImageAnalysisByURL200ResponseRecipesInner) IsSet() bool {
	return v.isSet
}

func (v *NullableImageAnalysisByURL200ResponseRecipesInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableImageAnalysisByURL200ResponseRecipesInner(val *ImageAnalysisByURL200ResponseRecipesInner) *NullableImageAnalysisByURL200ResponseRecipesInner {
	return &NullableImageAnalysisByURL200ResponseRecipesInner{value: val, isSet: true}
}

func (v NullableImageAnalysisByURL200ResponseRecipesInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableImageAnalysisByURL200ResponseRecipesInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


