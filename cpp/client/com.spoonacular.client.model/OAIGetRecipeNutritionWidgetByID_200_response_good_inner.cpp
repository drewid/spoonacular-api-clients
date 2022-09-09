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

#include "OAIGetRecipeNutritionWidgetByID_200_response_good_inner.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGetRecipeNutritionWidgetByID_200_response_good_inner::OAIGetRecipeNutritionWidgetByID_200_response_good_inner(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGetRecipeNutritionWidgetByID_200_response_good_inner::OAIGetRecipeNutritionWidgetByID_200_response_good_inner() {
    this->initializeModel();
}

OAIGetRecipeNutritionWidgetByID_200_response_good_inner::~OAIGetRecipeNutritionWidgetByID_200_response_good_inner() {}

void OAIGetRecipeNutritionWidgetByID_200_response_good_inner::initializeModel() {

    m_amount_isSet = false;
    m_amount_isValid = false;

    m_indented_isSet = false;
    m_indented_isValid = false;

    m_percent_of_daily_needs_isSet = false;
    m_percent_of_daily_needs_isValid = false;

    m_name_isSet = false;
    m_name_isValid = false;
}

void OAIGetRecipeNutritionWidgetByID_200_response_good_inner::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGetRecipeNutritionWidgetByID_200_response_good_inner::fromJsonObject(QJsonObject json) {

    m_amount_isValid = ::OpenAPI::fromJsonValue(amount, json[QString("amount")]);
    m_amount_isSet = !json[QString("amount")].isNull() && m_amount_isValid;

    m_indented_isValid = ::OpenAPI::fromJsonValue(indented, json[QString("indented")]);
    m_indented_isSet = !json[QString("indented")].isNull() && m_indented_isValid;

    m_percent_of_daily_needs_isValid = ::OpenAPI::fromJsonValue(percent_of_daily_needs, json[QString("percentOfDailyNeeds")]);
    m_percent_of_daily_needs_isSet = !json[QString("percentOfDailyNeeds")].isNull() && m_percent_of_daily_needs_isValid;

    m_name_isValid = ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;
}

QString OAIGetRecipeNutritionWidgetByID_200_response_good_inner::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGetRecipeNutritionWidgetByID_200_response_good_inner::asJsonObject() const {
    QJsonObject obj;
    if (m_amount_isSet) {
        obj.insert(QString("amount"), ::OpenAPI::toJsonValue(amount));
    }
    if (m_indented_isSet) {
        obj.insert(QString("indented"), ::OpenAPI::toJsonValue(indented));
    }
    if (m_percent_of_daily_needs_isSet) {
        obj.insert(QString("percentOfDailyNeeds"), ::OpenAPI::toJsonValue(percent_of_daily_needs));
    }
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
    return obj;
}

QString OAIGetRecipeNutritionWidgetByID_200_response_good_inner::getAmount() const {
    return amount;
}
void OAIGetRecipeNutritionWidgetByID_200_response_good_inner::setAmount(const QString &amount) {
    this->amount = amount;
    this->m_amount_isSet = true;
}

bool OAIGetRecipeNutritionWidgetByID_200_response_good_inner::is_amount_Set() const{
    return m_amount_isSet;
}

bool OAIGetRecipeNutritionWidgetByID_200_response_good_inner::is_amount_Valid() const{
    return m_amount_isValid;
}

bool OAIGetRecipeNutritionWidgetByID_200_response_good_inner::isIndented() const {
    return indented;
}
void OAIGetRecipeNutritionWidgetByID_200_response_good_inner::setIndented(const bool &indented) {
    this->indented = indented;
    this->m_indented_isSet = true;
}

bool OAIGetRecipeNutritionWidgetByID_200_response_good_inner::is_indented_Set() const{
    return m_indented_isSet;
}

bool OAIGetRecipeNutritionWidgetByID_200_response_good_inner::is_indented_Valid() const{
    return m_indented_isValid;
}

double OAIGetRecipeNutritionWidgetByID_200_response_good_inner::getPercentOfDailyNeeds() const {
    return percent_of_daily_needs;
}
void OAIGetRecipeNutritionWidgetByID_200_response_good_inner::setPercentOfDailyNeeds(const double &percent_of_daily_needs) {
    this->percent_of_daily_needs = percent_of_daily_needs;
    this->m_percent_of_daily_needs_isSet = true;
}

bool OAIGetRecipeNutritionWidgetByID_200_response_good_inner::is_percent_of_daily_needs_Set() const{
    return m_percent_of_daily_needs_isSet;
}

bool OAIGetRecipeNutritionWidgetByID_200_response_good_inner::is_percent_of_daily_needs_Valid() const{
    return m_percent_of_daily_needs_isValid;
}

QString OAIGetRecipeNutritionWidgetByID_200_response_good_inner::getName() const {
    return name;
}
void OAIGetRecipeNutritionWidgetByID_200_response_good_inner::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

bool OAIGetRecipeNutritionWidgetByID_200_response_good_inner::is_name_Set() const{
    return m_name_isSet;
}

bool OAIGetRecipeNutritionWidgetByID_200_response_good_inner::is_name_Valid() const{
    return m_name_isValid;
}

bool OAIGetRecipeNutritionWidgetByID_200_response_good_inner::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_amount_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_indented_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_percent_of_daily_needs_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_name_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGetRecipeNutritionWidgetByID_200_response_good_inner::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_amount_isValid && m_indented_isValid && m_percent_of_daily_needs_isValid && m_name_isValid && true;
}

} // namespace OpenAPI
