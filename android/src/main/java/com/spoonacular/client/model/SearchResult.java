/**
 * spoonacular API
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 2.0.1
 * Contact: mail@spoonacular.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.spoonacular.client.model;

import com.spoonacular.client.model.SearchResultDataPointsInner;
import java.math.BigDecimal;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * 
 **/
@ApiModel(description = "")
public class SearchResult {
  
  @SerializedName("dataPoints")
  private List<SearchResultDataPointsInner> dataPoints = null;
  @SerializedName("image")
  private String image = null;
  @SerializedName("link")
  private String link = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("kvtable")
  private String kvtable = null;
  @SerializedName("content")
  private String content = null;
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("relevance")
  private BigDecimal relevance = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<SearchResultDataPointsInner> getDataPoints() {
    return dataPoints;
  }
  public void setDataPoints(List<SearchResultDataPointsInner> dataPoints) {
    this.dataPoints = dataPoints;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getKvtable() {
    return kvtable;
  }
  public void setKvtable(String kvtable) {
    this.kvtable = kvtable;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getRelevance() {
    return relevance;
  }
  public void setRelevance(BigDecimal relevance) {
    this.relevance = relevance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResult searchResult = (SearchResult) o;
    return (this.dataPoints == null ? searchResult.dataPoints == null : this.dataPoints.equals(searchResult.dataPoints)) &&
        (this.image == null ? searchResult.image == null : this.image.equals(searchResult.image)) &&
        (this.link == null ? searchResult.link == null : this.link.equals(searchResult.link)) &&
        (this.name == null ? searchResult.name == null : this.name.equals(searchResult.name)) &&
        (this.type == null ? searchResult.type == null : this.type.equals(searchResult.type)) &&
        (this.kvtable == null ? searchResult.kvtable == null : this.kvtable.equals(searchResult.kvtable)) &&
        (this.content == null ? searchResult.content == null : this.content.equals(searchResult.content)) &&
        (this.id == null ? searchResult.id == null : this.id.equals(searchResult.id)) &&
        (this.relevance == null ? searchResult.relevance == null : this.relevance.equals(searchResult.relevance));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.dataPoints == null ? 0: this.dataPoints.hashCode());
    result = 31 * result + (this.image == null ? 0: this.image.hashCode());
    result = 31 * result + (this.link == null ? 0: this.link.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.kvtable == null ? 0: this.kvtable.hashCode());
    result = 31 * result + (this.content == null ? 0: this.content.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.relevance == null ? 0: this.relevance.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResult {\n");
    
    sb.append("  dataPoints: ").append(dataPoints).append("\n");
    sb.append("  image: ").append(image).append("\n");
    sb.append("  link: ").append(link).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  kvtable: ").append(kvtable).append("\n");
    sb.append("  content: ").append(content).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  relevance: ").append(relevance).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
