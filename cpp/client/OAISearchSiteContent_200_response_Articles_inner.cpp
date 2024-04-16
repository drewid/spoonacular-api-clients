/**
 * spoonacular API
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.1
 * Contact: mail@spoonacular.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAISearchSiteContent_200_response_Articles_inner.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAISearchSiteContent_200_response_Articles_inner::OAISearchSiteContent_200_response_Articles_inner(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAISearchSiteContent_200_response_Articles_inner::OAISearchSiteContent_200_response_Articles_inner() {
    this->initializeModel();
}

OAISearchSiteContent_200_response_Articles_inner::~OAISearchSiteContent_200_response_Articles_inner() {}

void OAISearchSiteContent_200_response_Articles_inner::initializeModel() {

    m_data_points_isSet = false;
    m_data_points_isValid = false;

    m_image_isSet = false;
    m_image_isValid = false;

    m_link_isSet = false;
    m_link_isValid = false;

    m_name_isSet = false;
    m_name_isValid = false;
}

void OAISearchSiteContent_200_response_Articles_inner::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAISearchSiteContent_200_response_Articles_inner::fromJsonObject(QJsonObject json) {

    m_data_points_isValid = ::OpenAPI::fromJsonValue(m_data_points, json[QString("dataPoints")]);
    m_data_points_isSet = !json[QString("dataPoints")].isNull() && m_data_points_isValid;

    m_image_isValid = ::OpenAPI::fromJsonValue(m_image, json[QString("image")]);
    m_image_isSet = !json[QString("image")].isNull() && m_image_isValid;

    m_link_isValid = ::OpenAPI::fromJsonValue(m_link, json[QString("link")]);
    m_link_isSet = !json[QString("link")].isNull() && m_link_isValid;

    m_name_isValid = ::OpenAPI::fromJsonValue(m_name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;
}

QString OAISearchSiteContent_200_response_Articles_inner::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAISearchSiteContent_200_response_Articles_inner::asJsonObject() const {
    QJsonObject obj;
    if (m_data_points.size() > 0) {
        obj.insert(QString("dataPoints"), ::OpenAPI::toJsonValue(m_data_points));
    }
    if (m_image_isSet) {
        obj.insert(QString("image"), ::OpenAPI::toJsonValue(m_image));
    }
    if (m_link_isSet) {
        obj.insert(QString("link"), ::OpenAPI::toJsonValue(m_link));
    }
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(m_name));
    }
    return obj;
}

QList<QJsonValue> OAISearchSiteContent_200_response_Articles_inner::getDataPoints() const {
    return m_data_points;
}
void OAISearchSiteContent_200_response_Articles_inner::setDataPoints(const QList<QJsonValue> &data_points) {
    m_data_points = data_points;
    m_data_points_isSet = true;
}

bool OAISearchSiteContent_200_response_Articles_inner::is_data_points_Set() const{
    return m_data_points_isSet;
}

bool OAISearchSiteContent_200_response_Articles_inner::is_data_points_Valid() const{
    return m_data_points_isValid;
}

QString OAISearchSiteContent_200_response_Articles_inner::getImage() const {
    return m_image;
}
void OAISearchSiteContent_200_response_Articles_inner::setImage(const QString &image) {
    m_image = image;
    m_image_isSet = true;
}

bool OAISearchSiteContent_200_response_Articles_inner::is_image_Set() const{
    return m_image_isSet;
}

bool OAISearchSiteContent_200_response_Articles_inner::is_image_Valid() const{
    return m_image_isValid;
}

QString OAISearchSiteContent_200_response_Articles_inner::getLink() const {
    return m_link;
}
void OAISearchSiteContent_200_response_Articles_inner::setLink(const QString &link) {
    m_link = link;
    m_link_isSet = true;
}

bool OAISearchSiteContent_200_response_Articles_inner::is_link_Set() const{
    return m_link_isSet;
}

bool OAISearchSiteContent_200_response_Articles_inner::is_link_Valid() const{
    return m_link_isValid;
}

QString OAISearchSiteContent_200_response_Articles_inner::getName() const {
    return m_name;
}
void OAISearchSiteContent_200_response_Articles_inner::setName(const QString &name) {
    m_name = name;
    m_name_isSet = true;
}

bool OAISearchSiteContent_200_response_Articles_inner::is_name_Set() const{
    return m_name_isSet;
}

bool OAISearchSiteContent_200_response_Articles_inner::is_name_Valid() const{
    return m_name_isValid;
}

bool OAISearchSiteContent_200_response_Articles_inner::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_data_points.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_image_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_link_isSet) {
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

bool OAISearchSiteContent_200_response_Articles_inner::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_image_isValid && m_link_isValid && m_name_isValid && true;
}

} // namespace OpenAPI