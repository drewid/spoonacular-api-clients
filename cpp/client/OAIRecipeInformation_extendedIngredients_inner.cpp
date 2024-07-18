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

#include "OAIRecipeInformation_extendedIngredients_inner.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIRecipeInformation_extendedIngredients_inner::OAIRecipeInformation_extendedIngredients_inner(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIRecipeInformation_extendedIngredients_inner::OAIRecipeInformation_extendedIngredients_inner() {
    this->initializeModel();
}

OAIRecipeInformation_extendedIngredients_inner::~OAIRecipeInformation_extendedIngredients_inner() {}

void OAIRecipeInformation_extendedIngredients_inner::initializeModel() {

    m_aisle_isSet = false;
    m_aisle_isValid = false;

    m_amount_isSet = false;
    m_amount_isValid = false;

    m_consistency_isSet = false;
    m_consistency_isValid = false;

    m_id_isSet = false;
    m_id_isValid = false;

    m_image_isSet = false;
    m_image_isValid = false;

    m_measures_isSet = false;
    m_measures_isValid = false;

    m_meta_isSet = false;
    m_meta_isValid = false;

    m_name_isSet = false;
    m_name_isValid = false;

    m_original_isSet = false;
    m_original_isValid = false;

    m_original_name_isSet = false;
    m_original_name_isValid = false;

    m_unit_isSet = false;
    m_unit_isValid = false;
}

void OAIRecipeInformation_extendedIngredients_inner::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIRecipeInformation_extendedIngredients_inner::fromJsonObject(QJsonObject json) {

    m_aisle_isValid = ::OpenAPI::fromJsonValue(m_aisle, json[QString("aisle")]);
    m_aisle_isSet = !json[QString("aisle")].isNull() && m_aisle_isValid;

    m_amount_isValid = ::OpenAPI::fromJsonValue(m_amount, json[QString("amount")]);
    m_amount_isSet = !json[QString("amount")].isNull() && m_amount_isValid;

    m_consistency_isValid = ::OpenAPI::fromJsonValue(m_consistency, json[QString("consistency")]);
    m_consistency_isSet = !json[QString("consistency")].isNull() && m_consistency_isValid;

    m_id_isValid = ::OpenAPI::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_image_isValid = ::OpenAPI::fromJsonValue(m_image, json[QString("image")]);
    m_image_isSet = !json[QString("image")].isNull() && m_image_isValid;

    m_measures_isValid = ::OpenAPI::fromJsonValue(m_measures, json[QString("measures")]);
    m_measures_isSet = !json[QString("measures")].isNull() && m_measures_isValid;

    m_meta_isValid = ::OpenAPI::fromJsonValue(m_meta, json[QString("meta")]);
    m_meta_isSet = !json[QString("meta")].isNull() && m_meta_isValid;

    m_name_isValid = ::OpenAPI::fromJsonValue(m_name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;

    m_original_isValid = ::OpenAPI::fromJsonValue(m_original, json[QString("original")]);
    m_original_isSet = !json[QString("original")].isNull() && m_original_isValid;

    m_original_name_isValid = ::OpenAPI::fromJsonValue(m_original_name, json[QString("originalName")]);
    m_original_name_isSet = !json[QString("originalName")].isNull() && m_original_name_isValid;

    m_unit_isValid = ::OpenAPI::fromJsonValue(m_unit, json[QString("unit")]);
    m_unit_isSet = !json[QString("unit")].isNull() && m_unit_isValid;
}

QString OAIRecipeInformation_extendedIngredients_inner::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIRecipeInformation_extendedIngredients_inner::asJsonObject() const {
    QJsonObject obj;
    if (m_aisle_isSet) {
        obj.insert(QString("aisle"), ::OpenAPI::toJsonValue(m_aisle));
    }
    if (m_amount_isSet) {
        obj.insert(QString("amount"), ::OpenAPI::toJsonValue(m_amount));
    }
    if (m_consistency_isSet) {
        obj.insert(QString("consistency"), ::OpenAPI::toJsonValue(m_consistency));
    }
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(m_id));
    }
    if (m_image_isSet) {
        obj.insert(QString("image"), ::OpenAPI::toJsonValue(m_image));
    }
    if (m_measures.isSet()) {
        obj.insert(QString("measures"), ::OpenAPI::toJsonValue(m_measures));
    }
    if (m_meta.size() > 0) {
        obj.insert(QString("meta"), ::OpenAPI::toJsonValue(m_meta));
    }
    if (m_name_isSet) {
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(m_name));
    }
    if (m_original_isSet) {
        obj.insert(QString("original"), ::OpenAPI::toJsonValue(m_original));
    }
    if (m_original_name_isSet) {
        obj.insert(QString("originalName"), ::OpenAPI::toJsonValue(m_original_name));
    }
    if (m_unit_isSet) {
        obj.insert(QString("unit"), ::OpenAPI::toJsonValue(m_unit));
    }
    return obj;
}

QString OAIRecipeInformation_extendedIngredients_inner::getAisle() const {
    return m_aisle;
}
void OAIRecipeInformation_extendedIngredients_inner::setAisle(const QString &aisle) {
    m_aisle = aisle;
    m_aisle_isSet = true;
}

bool OAIRecipeInformation_extendedIngredients_inner::is_aisle_Set() const{
    return m_aisle_isSet;
}

bool OAIRecipeInformation_extendedIngredients_inner::is_aisle_Valid() const{
    return m_aisle_isValid;
}

double OAIRecipeInformation_extendedIngredients_inner::getAmount() const {
    return m_amount;
}
void OAIRecipeInformation_extendedIngredients_inner::setAmount(const double &amount) {
    m_amount = amount;
    m_amount_isSet = true;
}

bool OAIRecipeInformation_extendedIngredients_inner::is_amount_Set() const{
    return m_amount_isSet;
}

bool OAIRecipeInformation_extendedIngredients_inner::is_amount_Valid() const{
    return m_amount_isValid;
}

QString OAIRecipeInformation_extendedIngredients_inner::getConsistency() const {
    return m_consistency;
}
void OAIRecipeInformation_extendedIngredients_inner::setConsistency(const QString &consistency) {
    m_consistency = consistency;
    m_consistency_isSet = true;
}

bool OAIRecipeInformation_extendedIngredients_inner::is_consistency_Set() const{
    return m_consistency_isSet;
}

bool OAIRecipeInformation_extendedIngredients_inner::is_consistency_Valid() const{
    return m_consistency_isValid;
}

qint32 OAIRecipeInformation_extendedIngredients_inner::getId() const {
    return m_id;
}
void OAIRecipeInformation_extendedIngredients_inner::setId(const qint32 &id) {
    m_id = id;
    m_id_isSet = true;
}

bool OAIRecipeInformation_extendedIngredients_inner::is_id_Set() const{
    return m_id_isSet;
}

bool OAIRecipeInformation_extendedIngredients_inner::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIRecipeInformation_extendedIngredients_inner::getImage() const {
    return m_image;
}
void OAIRecipeInformation_extendedIngredients_inner::setImage(const QString &image) {
    m_image = image;
    m_image_isSet = true;
}

bool OAIRecipeInformation_extendedIngredients_inner::is_image_Set() const{
    return m_image_isSet;
}

bool OAIRecipeInformation_extendedIngredients_inner::is_image_Valid() const{
    return m_image_isValid;
}

OAIRecipeInformation_extendedIngredients_inner_measures OAIRecipeInformation_extendedIngredients_inner::getMeasures() const {
    return m_measures;
}
void OAIRecipeInformation_extendedIngredients_inner::setMeasures(const OAIRecipeInformation_extendedIngredients_inner_measures &measures) {
    m_measures = measures;
    m_measures_isSet = true;
}

bool OAIRecipeInformation_extendedIngredients_inner::is_measures_Set() const{
    return m_measures_isSet;
}

bool OAIRecipeInformation_extendedIngredients_inner::is_measures_Valid() const{
    return m_measures_isValid;
}

QList<QString> OAIRecipeInformation_extendedIngredients_inner::getMeta() const {
    return m_meta;
}
void OAIRecipeInformation_extendedIngredients_inner::setMeta(const QList<QString> &meta) {
    m_meta = meta;
    m_meta_isSet = true;
}

bool OAIRecipeInformation_extendedIngredients_inner::is_meta_Set() const{
    return m_meta_isSet;
}

bool OAIRecipeInformation_extendedIngredients_inner::is_meta_Valid() const{
    return m_meta_isValid;
}

QString OAIRecipeInformation_extendedIngredients_inner::getName() const {
    return m_name;
}
void OAIRecipeInformation_extendedIngredients_inner::setName(const QString &name) {
    m_name = name;
    m_name_isSet = true;
}

bool OAIRecipeInformation_extendedIngredients_inner::is_name_Set() const{
    return m_name_isSet;
}

bool OAIRecipeInformation_extendedIngredients_inner::is_name_Valid() const{
    return m_name_isValid;
}

QString OAIRecipeInformation_extendedIngredients_inner::getOriginal() const {
    return m_original;
}
void OAIRecipeInformation_extendedIngredients_inner::setOriginal(const QString &original) {
    m_original = original;
    m_original_isSet = true;
}

bool OAIRecipeInformation_extendedIngredients_inner::is_original_Set() const{
    return m_original_isSet;
}

bool OAIRecipeInformation_extendedIngredients_inner::is_original_Valid() const{
    return m_original_isValid;
}

QString OAIRecipeInformation_extendedIngredients_inner::getOriginalName() const {
    return m_original_name;
}
void OAIRecipeInformation_extendedIngredients_inner::setOriginalName(const QString &original_name) {
    m_original_name = original_name;
    m_original_name_isSet = true;
}

bool OAIRecipeInformation_extendedIngredients_inner::is_original_name_Set() const{
    return m_original_name_isSet;
}

bool OAIRecipeInformation_extendedIngredients_inner::is_original_name_Valid() const{
    return m_original_name_isValid;
}

QString OAIRecipeInformation_extendedIngredients_inner::getUnit() const {
    return m_unit;
}
void OAIRecipeInformation_extendedIngredients_inner::setUnit(const QString &unit) {
    m_unit = unit;
    m_unit_isSet = true;
}

bool OAIRecipeInformation_extendedIngredients_inner::is_unit_Set() const{
    return m_unit_isSet;
}

bool OAIRecipeInformation_extendedIngredients_inner::is_unit_Valid() const{
    return m_unit_isValid;
}

bool OAIRecipeInformation_extendedIngredients_inner::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_aisle_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_amount_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_consistency_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_image_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_measures.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_meta.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_original_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_original_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_unit_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIRecipeInformation_extendedIngredients_inner::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_aisle_isValid && m_amount_isValid && m_consistency_isValid && m_id_isValid && m_image_isValid && m_name_isValid && m_original_isValid && m_original_name_isValid && m_unit_isValid && true;
}

} // namespace OpenAPI
