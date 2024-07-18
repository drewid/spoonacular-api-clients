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

#include "OAICreateRecipeCard_200_response.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICreateRecipeCard_200_response::OAICreateRecipeCard_200_response(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICreateRecipeCard_200_response::OAICreateRecipeCard_200_response() {
    this->initializeModel();
}

OAICreateRecipeCard_200_response::~OAICreateRecipeCard_200_response() {}

void OAICreateRecipeCard_200_response::initializeModel() {

    m_url_isSet = false;
    m_url_isValid = false;
}

void OAICreateRecipeCard_200_response::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICreateRecipeCard_200_response::fromJsonObject(QJsonObject json) {

    m_url_isValid = ::OpenAPI::fromJsonValue(m_url, json[QString("url")]);
    m_url_isSet = !json[QString("url")].isNull() && m_url_isValid;
}

QString OAICreateRecipeCard_200_response::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICreateRecipeCard_200_response::asJsonObject() const {
    QJsonObject obj;
    if (m_url_isSet) {
        obj.insert(QString("url"), ::OpenAPI::toJsonValue(m_url));
    }
    return obj;
}

QString OAICreateRecipeCard_200_response::getUrl() const {
    return m_url;
}
void OAICreateRecipeCard_200_response::setUrl(const QString &url) {
    m_url = url;
    m_url_isSet = true;
}

bool OAICreateRecipeCard_200_response::is_url_Set() const{
    return m_url_isSet;
}

bool OAICreateRecipeCard_200_response::is_url_Valid() const{
    return m_url_isValid;
}

bool OAICreateRecipeCard_200_response::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_url_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICreateRecipeCard_200_response::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_url_isValid && true;
}

} // namespace OpenAPI
