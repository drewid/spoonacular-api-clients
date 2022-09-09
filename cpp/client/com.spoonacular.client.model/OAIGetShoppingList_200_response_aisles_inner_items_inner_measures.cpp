/**
 * spoonacular API
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 800,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.1
 * Contact: mail@spoonacular.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAIGetShoppingList_200_response_aisles_inner_items_inner_measures.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGetShoppingList_200_response_aisles_inner_items_inner_measures::OAIGetShoppingList_200_response_aisles_inner_items_inner_measures(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGetShoppingList_200_response_aisles_inner_items_inner_measures::OAIGetShoppingList_200_response_aisles_inner_items_inner_measures() {
    this->initializeModel();
}

OAIGetShoppingList_200_response_aisles_inner_items_inner_measures::~OAIGetShoppingList_200_response_aisles_inner_items_inner_measures() {}

void OAIGetShoppingList_200_response_aisles_inner_items_inner_measures::initializeModel() {

    m_original_isSet = false;
    m_original_isValid = false;

    m_metric_isSet = false;
    m_metric_isValid = false;

    m_us_isSet = false;
    m_us_isValid = false;
}

void OAIGetShoppingList_200_response_aisles_inner_items_inner_measures::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGetShoppingList_200_response_aisles_inner_items_inner_measures::fromJsonObject(QJsonObject json) {

    m_original_isValid = ::OpenAPI::fromJsonValue(original, json[QString("original")]);
    m_original_isSet = !json[QString("original")].isNull() && m_original_isValid;

    m_metric_isValid = ::OpenAPI::fromJsonValue(metric, json[QString("metric")]);
    m_metric_isSet = !json[QString("metric")].isNull() && m_metric_isValid;

    m_us_isValid = ::OpenAPI::fromJsonValue(us, json[QString("us")]);
    m_us_isSet = !json[QString("us")].isNull() && m_us_isValid;
}

QString OAIGetShoppingList_200_response_aisles_inner_items_inner_measures::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGetShoppingList_200_response_aisles_inner_items_inner_measures::asJsonObject() const {
    QJsonObject obj;
    if (original.isSet()) {
        obj.insert(QString("original"), ::OpenAPI::toJsonValue(original));
    }
    if (metric.isSet()) {
        obj.insert(QString("metric"), ::OpenAPI::toJsonValue(metric));
    }
    if (us.isSet()) {
        obj.insert(QString("us"), ::OpenAPI::toJsonValue(us));
    }
    return obj;
}

OAIParseIngredients_200_response_inner_nutrition_weightPerServing OAIGetShoppingList_200_response_aisles_inner_items_inner_measures::getOriginal() const {
    return original;
}
void OAIGetShoppingList_200_response_aisles_inner_items_inner_measures::setOriginal(const OAIParseIngredients_200_response_inner_nutrition_weightPerServing &original) {
    this->original = original;
    this->m_original_isSet = true;
}

bool OAIGetShoppingList_200_response_aisles_inner_items_inner_measures::is_original_Set() const{
    return m_original_isSet;
}

bool OAIGetShoppingList_200_response_aisles_inner_items_inner_measures::is_original_Valid() const{
    return m_original_isValid;
}

OAIParseIngredients_200_response_inner_nutrition_weightPerServing OAIGetShoppingList_200_response_aisles_inner_items_inner_measures::getMetric() const {
    return metric;
}
void OAIGetShoppingList_200_response_aisles_inner_items_inner_measures::setMetric(const OAIParseIngredients_200_response_inner_nutrition_weightPerServing &metric) {
    this->metric = metric;
    this->m_metric_isSet = true;
}

bool OAIGetShoppingList_200_response_aisles_inner_items_inner_measures::is_metric_Set() const{
    return m_metric_isSet;
}

bool OAIGetShoppingList_200_response_aisles_inner_items_inner_measures::is_metric_Valid() const{
    return m_metric_isValid;
}

OAIParseIngredients_200_response_inner_nutrition_weightPerServing OAIGetShoppingList_200_response_aisles_inner_items_inner_measures::getUs() const {
    return us;
}
void OAIGetShoppingList_200_response_aisles_inner_items_inner_measures::setUs(const OAIParseIngredients_200_response_inner_nutrition_weightPerServing &us) {
    this->us = us;
    this->m_us_isSet = true;
}

bool OAIGetShoppingList_200_response_aisles_inner_items_inner_measures::is_us_Set() const{
    return m_us_isSet;
}

bool OAIGetShoppingList_200_response_aisles_inner_items_inner_measures::is_us_Valid() const{
    return m_us_isValid;
}

bool OAIGetShoppingList_200_response_aisles_inner_items_inner_measures::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (original.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (metric.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (us.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGetShoppingList_200_response_aisles_inner_items_inner_measures::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_original_isValid && m_metric_isValid && m_us_isValid && true;
}

} // namespace OpenAPI
