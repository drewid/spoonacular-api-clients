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

#include "OAIGetConversationSuggests_200_response_suggests___inner.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGetConversationSuggests_200_response_suggests___inner::OAIGetConversationSuggests_200_response_suggests___inner(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGetConversationSuggests_200_response_suggests___inner::OAIGetConversationSuggests_200_response_suggests___inner() {
    this->initializeModel();
}

OAIGetConversationSuggests_200_response_suggests___inner::~OAIGetConversationSuggests_200_response_suggests___inner() {}

void OAIGetConversationSuggests_200_response_suggests___inner::initializeModel() {

    m_name_isSet = false;
    m_name_isValid = false;
}

void OAIGetConversationSuggests_200_response_suggests___inner::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGetConversationSuggests_200_response_suggests___inner::fromJsonObject(QJsonObject json) {

    m_name_isValid = ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;
}

QString OAIGetConversationSuggests_200_response_suggests___inner::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGetConversationSuggests_200_response_suggests___inner::asJsonObject() const {
    QJsonObject obj;
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
    return obj;
}

QString OAIGetConversationSuggests_200_response_suggests___inner::getName() const {
    return name;
}
void OAIGetConversationSuggests_200_response_suggests___inner::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

bool OAIGetConversationSuggests_200_response_suggests___inner::is_name_Set() const{
    return m_name_isSet;
}

bool OAIGetConversationSuggests_200_response_suggests___inner::is_name_Valid() const{
    return m_name_isValid;
}

bool OAIGetConversationSuggests_200_response_suggests___inner::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_name_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGetConversationSuggests_200_response_suggests___inner::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_name_isValid && true;
}

} // namespace OpenAPI
