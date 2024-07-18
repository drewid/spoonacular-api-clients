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

#include "OAIRecipeInformation_extendedIngredients_inner_measures.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIRecipeInformation_extendedIngredients_inner_measures::OAIRecipeInformation_extendedIngredients_inner_measures(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIRecipeInformation_extendedIngredients_inner_measures::OAIRecipeInformation_extendedIngredients_inner_measures() {
    this->initializeModel();
}

OAIRecipeInformation_extendedIngredients_inner_measures::~OAIRecipeInformation_extendedIngredients_inner_measures() {}

void OAIRecipeInformation_extendedIngredients_inner_measures::initializeModel() {

    m_metric_isSet = false;
    m_metric_isValid = false;

    m_us_isSet = false;
    m_us_isValid = false;
}

void OAIRecipeInformation_extendedIngredients_inner_measures::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIRecipeInformation_extendedIngredients_inner_measures::fromJsonObject(QJsonObject json) {

    m_metric_isValid = ::OpenAPI::fromJsonValue(m_metric, json[QString("metric")]);
    m_metric_isSet = !json[QString("metric")].isNull() && m_metric_isValid;

    m_us_isValid = ::OpenAPI::fromJsonValue(m_us, json[QString("us")]);
    m_us_isSet = !json[QString("us")].isNull() && m_us_isValid;
}

QString OAIRecipeInformation_extendedIngredients_inner_measures::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIRecipeInformation_extendedIngredients_inner_measures::asJsonObject() const {
    QJsonObject obj;
    if (m_metric.isSet()) {
        obj.insert(QString("metric"), ::OpenAPI::toJsonValue(m_metric));
    }
    if (m_us.isSet()) {
        obj.insert(QString("us"), ::OpenAPI::toJsonValue(m_us));
    }
    return obj;
}

OAIRecipeInformation_extendedIngredients_inner_measures_metric OAIRecipeInformation_extendedIngredients_inner_measures::getMetric() const {
    return m_metric;
}
void OAIRecipeInformation_extendedIngredients_inner_measures::setMetric(const OAIRecipeInformation_extendedIngredients_inner_measures_metric &metric) {
    m_metric = metric;
    m_metric_isSet = true;
}

bool OAIRecipeInformation_extendedIngredients_inner_measures::is_metric_Set() const{
    return m_metric_isSet;
}

bool OAIRecipeInformation_extendedIngredients_inner_measures::is_metric_Valid() const{
    return m_metric_isValid;
}

OAIRecipeInformation_extendedIngredients_inner_measures_metric OAIRecipeInformation_extendedIngredients_inner_measures::getUs() const {
    return m_us;
}
void OAIRecipeInformation_extendedIngredients_inner_measures::setUs(const OAIRecipeInformation_extendedIngredients_inner_measures_metric &us) {
    m_us = us;
    m_us_isSet = true;
}

bool OAIRecipeInformation_extendedIngredients_inner_measures::is_us_Set() const{
    return m_us_isSet;
}

bool OAIRecipeInformation_extendedIngredients_inner_measures::is_us_Valid() const{
    return m_us_isValid;
}

bool OAIRecipeInformation_extendedIngredients_inner_measures::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_metric.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_us.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIRecipeInformation_extendedIngredients_inner_measures::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_metric_isValid && m_us_isValid && true;
}

} // namespace OpenAPI
