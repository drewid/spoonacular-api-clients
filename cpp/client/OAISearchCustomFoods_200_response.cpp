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

#include "OAISearchCustomFoods_200_response.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAISearchCustomFoods_200_response::OAISearchCustomFoods_200_response(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAISearchCustomFoods_200_response::OAISearchCustomFoods_200_response() {
    this->initializeModel();
}

OAISearchCustomFoods_200_response::~OAISearchCustomFoods_200_response() {}

void OAISearchCustomFoods_200_response::initializeModel() {

    m_custom_foods_isSet = false;
    m_custom_foods_isValid = false;

    m_type_isSet = false;
    m_type_isValid = false;

    m_offset_isSet = false;
    m_offset_isValid = false;

    m_number_isSet = false;
    m_number_isValid = false;
}

void OAISearchCustomFoods_200_response::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAISearchCustomFoods_200_response::fromJsonObject(QJsonObject json) {

    m_custom_foods_isValid = ::OpenAPI::fromJsonValue(m_custom_foods, json[QString("customFoods")]);
    m_custom_foods_isSet = !json[QString("customFoods")].isNull() && m_custom_foods_isValid;

    m_type_isValid = ::OpenAPI::fromJsonValue(m_type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_offset_isValid = ::OpenAPI::fromJsonValue(m_offset, json[QString("offset")]);
    m_offset_isSet = !json[QString("offset")].isNull() && m_offset_isValid;

    m_number_isValid = ::OpenAPI::fromJsonValue(m_number, json[QString("number")]);
    m_number_isSet = !json[QString("number")].isNull() && m_number_isValid;
}

QString OAISearchCustomFoods_200_response::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAISearchCustomFoods_200_response::asJsonObject() const {
    QJsonObject obj;
    if (m_custom_foods.size() > 0) {
        obj.insert(QString("customFoods"), ::OpenAPI::toJsonValue(m_custom_foods));
    }
    if (m_type_isSet) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(m_type));
    }
    if (m_offset_isSet) {
        obj.insert(QString("offset"), ::OpenAPI::toJsonValue(m_offset));
    }
    if (m_number_isSet) {
        obj.insert(QString("number"), ::OpenAPI::toJsonValue(m_number));
    }
    return obj;
}

QSet<OAISearchCustomFoods_200_response_customFoods_inner> OAISearchCustomFoods_200_response::getCustomFoods() const {
    return m_custom_foods;
}
void OAISearchCustomFoods_200_response::setCustomFoods(const QSet<OAISearchCustomFoods_200_response_customFoods_inner> &custom_foods) {
    m_custom_foods = custom_foods;
    m_custom_foods_isSet = true;
}

bool OAISearchCustomFoods_200_response::is_custom_foods_Set() const{
    return m_custom_foods_isSet;
}

bool OAISearchCustomFoods_200_response::is_custom_foods_Valid() const{
    return m_custom_foods_isValid;
}

QString OAISearchCustomFoods_200_response::getType() const {
    return m_type;
}
void OAISearchCustomFoods_200_response::setType(const QString &type) {
    m_type = type;
    m_type_isSet = true;
}

bool OAISearchCustomFoods_200_response::is_type_Set() const{
    return m_type_isSet;
}

bool OAISearchCustomFoods_200_response::is_type_Valid() const{
    return m_type_isValid;
}

qint32 OAISearchCustomFoods_200_response::getOffset() const {
    return m_offset;
}
void OAISearchCustomFoods_200_response::setOffset(const qint32 &offset) {
    m_offset = offset;
    m_offset_isSet = true;
}

bool OAISearchCustomFoods_200_response::is_offset_Set() const{
    return m_offset_isSet;
}

bool OAISearchCustomFoods_200_response::is_offset_Valid() const{
    return m_offset_isValid;
}

qint32 OAISearchCustomFoods_200_response::getNumber() const {
    return m_number;
}
void OAISearchCustomFoods_200_response::setNumber(const qint32 &number) {
    m_number = number;
    m_number_isSet = true;
}

bool OAISearchCustomFoods_200_response::is_number_Set() const{
    return m_number_isSet;
}

bool OAISearchCustomFoods_200_response::is_number_Valid() const{
    return m_number_isValid;
}

bool OAISearchCustomFoods_200_response::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_custom_foods.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_offset_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_number_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAISearchCustomFoods_200_response::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_custom_foods_isValid && m_type_isValid && m_offset_isValid && m_number_isValid && true;
}

} // namespace OpenAPI
