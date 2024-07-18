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

#include "OAIAutocompleteProductSearch_200_response.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIAutocompleteProductSearch_200_response::OAIAutocompleteProductSearch_200_response(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIAutocompleteProductSearch_200_response::OAIAutocompleteProductSearch_200_response() {
    this->initializeModel();
}

OAIAutocompleteProductSearch_200_response::~OAIAutocompleteProductSearch_200_response() {}

void OAIAutocompleteProductSearch_200_response::initializeModel() {

    m_results_isSet = false;
    m_results_isValid = false;
}

void OAIAutocompleteProductSearch_200_response::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIAutocompleteProductSearch_200_response::fromJsonObject(QJsonObject json) {

    m_results_isValid = ::OpenAPI::fromJsonValue(m_results, json[QString("results")]);
    m_results_isSet = !json[QString("results")].isNull() && m_results_isValid;
}

QString OAIAutocompleteProductSearch_200_response::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIAutocompleteProductSearch_200_response::asJsonObject() const {
    QJsonObject obj;
    if (m_results.size() > 0) {
        obj.insert(QString("results"), ::OpenAPI::toJsonValue(m_results));
    }
    return obj;
}

QSet<OAIAutocompleteProductSearch_200_response_results_inner> OAIAutocompleteProductSearch_200_response::getResults() const {
    return m_results;
}
void OAIAutocompleteProductSearch_200_response::setResults(const QSet<OAIAutocompleteProductSearch_200_response_results_inner> &results) {
    m_results = results;
    m_results_isSet = true;
}

bool OAIAutocompleteProductSearch_200_response::is_results_Set() const{
    return m_results_isSet;
}

bool OAIAutocompleteProductSearch_200_response::is_results_Valid() const{
    return m_results_isValid;
}

bool OAIAutocompleteProductSearch_200_response::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_results.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIAutocompleteProductSearch_200_response::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_results_isValid && true;
}

} // namespace OpenAPI
