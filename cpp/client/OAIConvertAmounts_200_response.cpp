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

#include "OAIConvertAmounts_200_response.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIConvertAmounts_200_response::OAIConvertAmounts_200_response(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIConvertAmounts_200_response::OAIConvertAmounts_200_response() {
    this->initializeModel();
}

OAIConvertAmounts_200_response::~OAIConvertAmounts_200_response() {}

void OAIConvertAmounts_200_response::initializeModel() {

    m_source_amount_isSet = false;
    m_source_amount_isValid = false;

    m_source_unit_isSet = false;
    m_source_unit_isValid = false;

    m_target_amount_isSet = false;
    m_target_amount_isValid = false;

    m_target_unit_isSet = false;
    m_target_unit_isValid = false;

    m_answer_isSet = false;
    m_answer_isValid = false;
}

void OAIConvertAmounts_200_response::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIConvertAmounts_200_response::fromJsonObject(QJsonObject json) {

    m_source_amount_isValid = ::OpenAPI::fromJsonValue(m_source_amount, json[QString("sourceAmount")]);
    m_source_amount_isSet = !json[QString("sourceAmount")].isNull() && m_source_amount_isValid;

    m_source_unit_isValid = ::OpenAPI::fromJsonValue(m_source_unit, json[QString("sourceUnit")]);
    m_source_unit_isSet = !json[QString("sourceUnit")].isNull() && m_source_unit_isValid;

    m_target_amount_isValid = ::OpenAPI::fromJsonValue(m_target_amount, json[QString("targetAmount")]);
    m_target_amount_isSet = !json[QString("targetAmount")].isNull() && m_target_amount_isValid;

    m_target_unit_isValid = ::OpenAPI::fromJsonValue(m_target_unit, json[QString("targetUnit")]);
    m_target_unit_isSet = !json[QString("targetUnit")].isNull() && m_target_unit_isValid;

    m_answer_isValid = ::OpenAPI::fromJsonValue(m_answer, json[QString("answer")]);
    m_answer_isSet = !json[QString("answer")].isNull() && m_answer_isValid;
}

QString OAIConvertAmounts_200_response::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIConvertAmounts_200_response::asJsonObject() const {
    QJsonObject obj;
    if (m_source_amount_isSet) {
        obj.insert(QString("sourceAmount"), ::OpenAPI::toJsonValue(m_source_amount));
    }
    if (m_source_unit_isSet) {
        obj.insert(QString("sourceUnit"), ::OpenAPI::toJsonValue(m_source_unit));
    }
    if (m_target_amount_isSet) {
        obj.insert(QString("targetAmount"), ::OpenAPI::toJsonValue(m_target_amount));
    }
    if (m_target_unit_isSet) {
        obj.insert(QString("targetUnit"), ::OpenAPI::toJsonValue(m_target_unit));
    }
    if (m_answer_isSet) {
        obj.insert(QString("answer"), ::OpenAPI::toJsonValue(m_answer));
    }
    return obj;
}

double OAIConvertAmounts_200_response::getSourceAmount() const {
    return m_source_amount;
}
void OAIConvertAmounts_200_response::setSourceAmount(const double &source_amount) {
    m_source_amount = source_amount;
    m_source_amount_isSet = true;
}

bool OAIConvertAmounts_200_response::is_source_amount_Set() const{
    return m_source_amount_isSet;
}

bool OAIConvertAmounts_200_response::is_source_amount_Valid() const{
    return m_source_amount_isValid;
}

QString OAIConvertAmounts_200_response::getSourceUnit() const {
    return m_source_unit;
}
void OAIConvertAmounts_200_response::setSourceUnit(const QString &source_unit) {
    m_source_unit = source_unit;
    m_source_unit_isSet = true;
}

bool OAIConvertAmounts_200_response::is_source_unit_Set() const{
    return m_source_unit_isSet;
}

bool OAIConvertAmounts_200_response::is_source_unit_Valid() const{
    return m_source_unit_isValid;
}

double OAIConvertAmounts_200_response::getTargetAmount() const {
    return m_target_amount;
}
void OAIConvertAmounts_200_response::setTargetAmount(const double &target_amount) {
    m_target_amount = target_amount;
    m_target_amount_isSet = true;
}

bool OAIConvertAmounts_200_response::is_target_amount_Set() const{
    return m_target_amount_isSet;
}

bool OAIConvertAmounts_200_response::is_target_amount_Valid() const{
    return m_target_amount_isValid;
}

QString OAIConvertAmounts_200_response::getTargetUnit() const {
    return m_target_unit;
}
void OAIConvertAmounts_200_response::setTargetUnit(const QString &target_unit) {
    m_target_unit = target_unit;
    m_target_unit_isSet = true;
}

bool OAIConvertAmounts_200_response::is_target_unit_Set() const{
    return m_target_unit_isSet;
}

bool OAIConvertAmounts_200_response::is_target_unit_Valid() const{
    return m_target_unit_isValid;
}

QString OAIConvertAmounts_200_response::getAnswer() const {
    return m_answer;
}
void OAIConvertAmounts_200_response::setAnswer(const QString &answer) {
    m_answer = answer;
    m_answer_isSet = true;
}

bool OAIConvertAmounts_200_response::is_answer_Set() const{
    return m_answer_isSet;
}

bool OAIConvertAmounts_200_response::is_answer_Valid() const{
    return m_answer_isValid;
}

bool OAIConvertAmounts_200_response::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_source_amount_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_source_unit_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_target_amount_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_target_unit_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_answer_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIConvertAmounts_200_response::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_source_amount_isValid && m_source_unit_isValid && m_target_amount_isValid && m_target_unit_isValid && m_answer_isValid && true;
}

} // namespace OpenAPI
