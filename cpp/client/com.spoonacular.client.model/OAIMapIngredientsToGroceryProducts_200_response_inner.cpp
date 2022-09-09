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

#include "OAIMapIngredientsToGroceryProducts_200_response_inner.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIMapIngredientsToGroceryProducts_200_response_inner::OAIMapIngredientsToGroceryProducts_200_response_inner(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIMapIngredientsToGroceryProducts_200_response_inner::OAIMapIngredientsToGroceryProducts_200_response_inner() {
    this->initializeModel();
}

OAIMapIngredientsToGroceryProducts_200_response_inner::~OAIMapIngredientsToGroceryProducts_200_response_inner() {}

void OAIMapIngredientsToGroceryProducts_200_response_inner::initializeModel() {

    m_original_isSet = false;
    m_original_isValid = false;

    m_original_name_isSet = false;
    m_original_name_isValid = false;

    m_ingredient_image_isSet = false;
    m_ingredient_image_isValid = false;

    m_meta_isSet = false;
    m_meta_isValid = false;

    m_products_isSet = false;
    m_products_isValid = false;
}

void OAIMapIngredientsToGroceryProducts_200_response_inner::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIMapIngredientsToGroceryProducts_200_response_inner::fromJsonObject(QJsonObject json) {

    m_original_isValid = ::OpenAPI::fromJsonValue(original, json[QString("original")]);
    m_original_isSet = !json[QString("original")].isNull() && m_original_isValid;

    m_original_name_isValid = ::OpenAPI::fromJsonValue(original_name, json[QString("originalName")]);
    m_original_name_isSet = !json[QString("originalName")].isNull() && m_original_name_isValid;

    m_ingredient_image_isValid = ::OpenAPI::fromJsonValue(ingredient_image, json[QString("ingredientImage")]);
    m_ingredient_image_isSet = !json[QString("ingredientImage")].isNull() && m_ingredient_image_isValid;

    m_meta_isValid = ::OpenAPI::fromJsonValue(meta, json[QString("meta")]);
    m_meta_isSet = !json[QString("meta")].isNull() && m_meta_isValid;

    m_products_isValid = ::OpenAPI::fromJsonValue(products, json[QString("products")]);
    m_products_isSet = !json[QString("products")].isNull() && m_products_isValid;
}

QString OAIMapIngredientsToGroceryProducts_200_response_inner::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIMapIngredientsToGroceryProducts_200_response_inner::asJsonObject() const {
    QJsonObject obj;
    if (m_original_isSet) {
        obj.insert(QString("original"), ::OpenAPI::toJsonValue(original));
    }
    if (m_original_name_isSet) {
        obj.insert(QString("originalName"), ::OpenAPI::toJsonValue(original_name));
    }
    if (m_ingredient_image_isSet) {
        obj.insert(QString("ingredientImage"), ::OpenAPI::toJsonValue(ingredient_image));
    }
    if (meta.size() > 0) {
        obj.insert(QString("meta"), ::OpenAPI::toJsonValue(meta));
    }
    if (products.size() > 0) {
        obj.insert(QString("products"), ::OpenAPI::toJsonValue(products));
    }
    return obj;
}

QString OAIMapIngredientsToGroceryProducts_200_response_inner::getOriginal() const {
    return original;
}
void OAIMapIngredientsToGroceryProducts_200_response_inner::setOriginal(const QString &original) {
    this->original = original;
    this->m_original_isSet = true;
}

bool OAIMapIngredientsToGroceryProducts_200_response_inner::is_original_Set() const{
    return m_original_isSet;
}

bool OAIMapIngredientsToGroceryProducts_200_response_inner::is_original_Valid() const{
    return m_original_isValid;
}

QString OAIMapIngredientsToGroceryProducts_200_response_inner::getOriginalName() const {
    return original_name;
}
void OAIMapIngredientsToGroceryProducts_200_response_inner::setOriginalName(const QString &original_name) {
    this->original_name = original_name;
    this->m_original_name_isSet = true;
}

bool OAIMapIngredientsToGroceryProducts_200_response_inner::is_original_name_Set() const{
    return m_original_name_isSet;
}

bool OAIMapIngredientsToGroceryProducts_200_response_inner::is_original_name_Valid() const{
    return m_original_name_isValid;
}

QString OAIMapIngredientsToGroceryProducts_200_response_inner::getIngredientImage() const {
    return ingredient_image;
}
void OAIMapIngredientsToGroceryProducts_200_response_inner::setIngredientImage(const QString &ingredient_image) {
    this->ingredient_image = ingredient_image;
    this->m_ingredient_image_isSet = true;
}

bool OAIMapIngredientsToGroceryProducts_200_response_inner::is_ingredient_image_Set() const{
    return m_ingredient_image_isSet;
}

bool OAIMapIngredientsToGroceryProducts_200_response_inner::is_ingredient_image_Valid() const{
    return m_ingredient_image_isValid;
}

QList<QString> OAIMapIngredientsToGroceryProducts_200_response_inner::getMeta() const {
    return meta;
}
void OAIMapIngredientsToGroceryProducts_200_response_inner::setMeta(const QList<QString> &meta) {
    this->meta = meta;
    this->m_meta_isSet = true;
}

bool OAIMapIngredientsToGroceryProducts_200_response_inner::is_meta_Set() const{
    return m_meta_isSet;
}

bool OAIMapIngredientsToGroceryProducts_200_response_inner::is_meta_Valid() const{
    return m_meta_isValid;
}

QSet<OAIMapIngredientsToGroceryProducts_200_response_inner_products_inner> OAIMapIngredientsToGroceryProducts_200_response_inner::getProducts() const {
    return products;
}
void OAIMapIngredientsToGroceryProducts_200_response_inner::setProducts(const QSet<OAIMapIngredientsToGroceryProducts_200_response_inner_products_inner> &products) {
    this->products = products;
    this->m_products_isSet = true;
}

bool OAIMapIngredientsToGroceryProducts_200_response_inner::is_products_Set() const{
    return m_products_isSet;
}

bool OAIMapIngredientsToGroceryProducts_200_response_inner::is_products_Valid() const{
    return m_products_isValid;
}

bool OAIMapIngredientsToGroceryProducts_200_response_inner::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_original_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_original_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_ingredient_image_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (meta.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (products.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIMapIngredientsToGroceryProducts_200_response_inner::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_original_isValid && m_original_name_isValid && m_ingredient_image_isValid && m_meta_isValid && m_products_isValid && true;
}

} // namespace OpenAPI
