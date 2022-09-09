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

#include "OAIConnectUser_request.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIConnectUser_request::OAIConnectUser_request(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIConnectUser_request::OAIConnectUser_request() {
    this->initializeModel();
}

OAIConnectUser_request::~OAIConnectUser_request() {}

void OAIConnectUser_request::initializeModel() {

    m_username_isSet = false;
    m_username_isValid = false;

    m_first_name_isSet = false;
    m_first_name_isValid = false;

    m_last_name_isSet = false;
    m_last_name_isValid = false;

    m_email_isSet = false;
    m_email_isValid = false;
}

void OAIConnectUser_request::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIConnectUser_request::fromJsonObject(QJsonObject json) {

    m_username_isValid = ::OpenAPI::fromJsonValue(username, json[QString("username")]);
    m_username_isSet = !json[QString("username")].isNull() && m_username_isValid;

    m_first_name_isValid = ::OpenAPI::fromJsonValue(first_name, json[QString("firstName")]);
    m_first_name_isSet = !json[QString("firstName")].isNull() && m_first_name_isValid;

    m_last_name_isValid = ::OpenAPI::fromJsonValue(last_name, json[QString("lastName")]);
    m_last_name_isSet = !json[QString("lastName")].isNull() && m_last_name_isValid;

    m_email_isValid = ::OpenAPI::fromJsonValue(email, json[QString("email")]);
    m_email_isSet = !json[QString("email")].isNull() && m_email_isValid;
}

QString OAIConnectUser_request::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIConnectUser_request::asJsonObject() const {
    QJsonObject obj;
    if (m_username_isSet) {
        obj.insert(QString("username"), ::OpenAPI::toJsonValue(username));
    }
    if (m_first_name_isSet) {
        obj.insert(QString("firstName"), ::OpenAPI::toJsonValue(first_name));
    }
    if (m_last_name_isSet) {
        obj.insert(QString("lastName"), ::OpenAPI::toJsonValue(last_name));
    }
    if (m_email_isSet) {
        obj.insert(QString("email"), ::OpenAPI::toJsonValue(email));
    }
    return obj;
}

QString OAIConnectUser_request::getUsername() const {
    return username;
}
void OAIConnectUser_request::setUsername(const QString &username) {
    this->username = username;
    this->m_username_isSet = true;
}

bool OAIConnectUser_request::is_username_Set() const{
    return m_username_isSet;
}

bool OAIConnectUser_request::is_username_Valid() const{
    return m_username_isValid;
}

QString OAIConnectUser_request::getFirstName() const {
    return first_name;
}
void OAIConnectUser_request::setFirstName(const QString &first_name) {
    this->first_name = first_name;
    this->m_first_name_isSet = true;
}

bool OAIConnectUser_request::is_first_name_Set() const{
    return m_first_name_isSet;
}

bool OAIConnectUser_request::is_first_name_Valid() const{
    return m_first_name_isValid;
}

QString OAIConnectUser_request::getLastName() const {
    return last_name;
}
void OAIConnectUser_request::setLastName(const QString &last_name) {
    this->last_name = last_name;
    this->m_last_name_isSet = true;
}

bool OAIConnectUser_request::is_last_name_Set() const{
    return m_last_name_isSet;
}

bool OAIConnectUser_request::is_last_name_Valid() const{
    return m_last_name_isValid;
}

QString OAIConnectUser_request::getEmail() const {
    return email;
}
void OAIConnectUser_request::setEmail(const QString &email) {
    this->email = email;
    this->m_email_isSet = true;
}

bool OAIConnectUser_request::is_email_Set() const{
    return m_email_isSet;
}

bool OAIConnectUser_request::is_email_Valid() const{
    return m_email_isValid;
}

bool OAIConnectUser_request::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_username_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_first_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_last_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_email_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIConnectUser_request::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_username_isValid && m_first_name_isValid && m_last_name_isValid && m_email_isValid && true;
}

} // namespace OpenAPI
