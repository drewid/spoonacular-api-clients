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

#include "OAIClassifyGroceryProduct_200_response.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIClassifyGroceryProduct_200_response::OAIClassifyGroceryProduct_200_response(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIClassifyGroceryProduct_200_response::OAIClassifyGroceryProduct_200_response() {
    this->initializeModel();
}

OAIClassifyGroceryProduct_200_response::~OAIClassifyGroceryProduct_200_response() {}

void OAIClassifyGroceryProduct_200_response::initializeModel() {

    m_clean_title_isSet = false;
    m_clean_title_isValid = false;

    m_image_isSet = false;
    m_image_isValid = false;

    m_category_isSet = false;
    m_category_isValid = false;

    m_breadcrumbs_isSet = false;
    m_breadcrumbs_isValid = false;

    m_usda_code_isSet = false;
    m_usda_code_isValid = false;
}

void OAIClassifyGroceryProduct_200_response::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIClassifyGroceryProduct_200_response::fromJsonObject(QJsonObject json) {

    m_clean_title_isValid = ::OpenAPI::fromJsonValue(m_clean_title, json[QString("cleanTitle")]);
    m_clean_title_isSet = !json[QString("cleanTitle")].isNull() && m_clean_title_isValid;

    m_image_isValid = ::OpenAPI::fromJsonValue(m_image, json[QString("image")]);
    m_image_isSet = !json[QString("image")].isNull() && m_image_isValid;

    m_category_isValid = ::OpenAPI::fromJsonValue(m_category, json[QString("category")]);
    m_category_isSet = !json[QString("category")].isNull() && m_category_isValid;

    m_breadcrumbs_isValid = ::OpenAPI::fromJsonValue(m_breadcrumbs, json[QString("breadcrumbs")]);
    m_breadcrumbs_isSet = !json[QString("breadcrumbs")].isNull() && m_breadcrumbs_isValid;

    m_usda_code_isValid = ::OpenAPI::fromJsonValue(m_usda_code, json[QString("usdaCode")]);
    m_usda_code_isSet = !json[QString("usdaCode")].isNull() && m_usda_code_isValid;
}

QString OAIClassifyGroceryProduct_200_response::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIClassifyGroceryProduct_200_response::asJsonObject() const {
    QJsonObject obj;
    if (m_clean_title_isSet) {
        obj.insert(QString("cleanTitle"), ::OpenAPI::toJsonValue(m_clean_title));
    }
    if (m_image_isSet) {
        obj.insert(QString("image"), ::OpenAPI::toJsonValue(m_image));
    }
    if (m_category_isSet) {
        obj.insert(QString("category"), ::OpenAPI::toJsonValue(m_category));
    }
    if (m_breadcrumbs.size() > 0) {
        obj.insert(QString("breadcrumbs"), ::OpenAPI::toJsonValue(m_breadcrumbs));
    }
    if (m_usda_code_isSet) {
        obj.insert(QString("usdaCode"), ::OpenAPI::toJsonValue(m_usda_code));
    }
    return obj;
}

QString OAIClassifyGroceryProduct_200_response::getCleanTitle() const {
    return m_clean_title;
}
void OAIClassifyGroceryProduct_200_response::setCleanTitle(const QString &clean_title) {
    m_clean_title = clean_title;
    m_clean_title_isSet = true;
}

bool OAIClassifyGroceryProduct_200_response::is_clean_title_Set() const{
    return m_clean_title_isSet;
}

bool OAIClassifyGroceryProduct_200_response::is_clean_title_Valid() const{
    return m_clean_title_isValid;
}

QString OAIClassifyGroceryProduct_200_response::getImage() const {
    return m_image;
}
void OAIClassifyGroceryProduct_200_response::setImage(const QString &image) {
    m_image = image;
    m_image_isSet = true;
}

bool OAIClassifyGroceryProduct_200_response::is_image_Set() const{
    return m_image_isSet;
}

bool OAIClassifyGroceryProduct_200_response::is_image_Valid() const{
    return m_image_isValid;
}

QString OAIClassifyGroceryProduct_200_response::getCategory() const {
    return m_category;
}
void OAIClassifyGroceryProduct_200_response::setCategory(const QString &category) {
    m_category = category;
    m_category_isSet = true;
}

bool OAIClassifyGroceryProduct_200_response::is_category_Set() const{
    return m_category_isSet;
}

bool OAIClassifyGroceryProduct_200_response::is_category_Valid() const{
    return m_category_isValid;
}

QList<QString> OAIClassifyGroceryProduct_200_response::getBreadcrumbs() const {
    return m_breadcrumbs;
}
void OAIClassifyGroceryProduct_200_response::setBreadcrumbs(const QList<QString> &breadcrumbs) {
    m_breadcrumbs = breadcrumbs;
    m_breadcrumbs_isSet = true;
}

bool OAIClassifyGroceryProduct_200_response::is_breadcrumbs_Set() const{
    return m_breadcrumbs_isSet;
}

bool OAIClassifyGroceryProduct_200_response::is_breadcrumbs_Valid() const{
    return m_breadcrumbs_isValid;
}

qint32 OAIClassifyGroceryProduct_200_response::getUsdaCode() const {
    return m_usda_code;
}
void OAIClassifyGroceryProduct_200_response::setUsdaCode(const qint32 &usda_code) {
    m_usda_code = usda_code;
    m_usda_code_isSet = true;
}

bool OAIClassifyGroceryProduct_200_response::is_usda_code_Set() const{
    return m_usda_code_isSet;
}

bool OAIClassifyGroceryProduct_200_response::is_usda_code_Valid() const{
    return m_usda_code_isValid;
}

bool OAIClassifyGroceryProduct_200_response::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_clean_title_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_image_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_category_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_breadcrumbs.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_usda_code_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIClassifyGroceryProduct_200_response::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_clean_title_isValid && m_image_isValid && m_category_isValid && m_breadcrumbs_isValid && m_usda_code_isValid && true;
}

} // namespace OpenAPI
