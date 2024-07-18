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

#include "OAISearchRecipesByIngredients_200_response_inner.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAISearchRecipesByIngredients_200_response_inner::OAISearchRecipesByIngredients_200_response_inner(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAISearchRecipesByIngredients_200_response_inner::OAISearchRecipesByIngredients_200_response_inner() {
    this->initializeModel();
}

OAISearchRecipesByIngredients_200_response_inner::~OAISearchRecipesByIngredients_200_response_inner() {}

void OAISearchRecipesByIngredients_200_response_inner::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_image_isSet = false;
    m_image_isValid = false;

    m_image_type_isSet = false;
    m_image_type_isValid = false;

    m_likes_isSet = false;
    m_likes_isValid = false;

    m_missed_ingredient_count_isSet = false;
    m_missed_ingredient_count_isValid = false;

    m_missed_ingredients_isSet = false;
    m_missed_ingredients_isValid = false;

    m_title_isSet = false;
    m_title_isValid = false;

    m_unused_ingredients_isSet = false;
    m_unused_ingredients_isValid = false;

    m_used_ingredient_count_isSet = false;
    m_used_ingredient_count_isValid = false;

    m_used_ingredients_isSet = false;
    m_used_ingredients_isValid = false;
}

void OAISearchRecipesByIngredients_200_response_inner::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAISearchRecipesByIngredients_200_response_inner::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_image_isValid = ::OpenAPI::fromJsonValue(m_image, json[QString("image")]);
    m_image_isSet = !json[QString("image")].isNull() && m_image_isValid;

    m_image_type_isValid = ::OpenAPI::fromJsonValue(m_image_type, json[QString("imageType")]);
    m_image_type_isSet = !json[QString("imageType")].isNull() && m_image_type_isValid;

    m_likes_isValid = ::OpenAPI::fromJsonValue(m_likes, json[QString("likes")]);
    m_likes_isSet = !json[QString("likes")].isNull() && m_likes_isValid;

    m_missed_ingredient_count_isValid = ::OpenAPI::fromJsonValue(m_missed_ingredient_count, json[QString("missedIngredientCount")]);
    m_missed_ingredient_count_isSet = !json[QString("missedIngredientCount")].isNull() && m_missed_ingredient_count_isValid;

    m_missed_ingredients_isValid = ::OpenAPI::fromJsonValue(m_missed_ingredients, json[QString("missedIngredients")]);
    m_missed_ingredients_isSet = !json[QString("missedIngredients")].isNull() && m_missed_ingredients_isValid;

    m_title_isValid = ::OpenAPI::fromJsonValue(m_title, json[QString("title")]);
    m_title_isSet = !json[QString("title")].isNull() && m_title_isValid;

    m_unused_ingredients_isValid = ::OpenAPI::fromJsonValue(m_unused_ingredients, json[QString("unusedIngredients")]);
    m_unused_ingredients_isSet = !json[QString("unusedIngredients")].isNull() && m_unused_ingredients_isValid;

    m_used_ingredient_count_isValid = ::OpenAPI::fromJsonValue(m_used_ingredient_count, json[QString("usedIngredientCount")]);
    m_used_ingredient_count_isSet = !json[QString("usedIngredientCount")].isNull() && m_used_ingredient_count_isValid;

    m_used_ingredients_isValid = ::OpenAPI::fromJsonValue(m_used_ingredients, json[QString("usedIngredients")]);
    m_used_ingredients_isSet = !json[QString("usedIngredients")].isNull() && m_used_ingredients_isValid;
}

QString OAISearchRecipesByIngredients_200_response_inner::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAISearchRecipesByIngredients_200_response_inner::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(m_id));
    }
    if (m_image_isSet) {
        obj.insert(QString("image"), ::OpenAPI::toJsonValue(m_image));
    }
    if (m_image_type_isSet) {
        obj.insert(QString("imageType"), ::OpenAPI::toJsonValue(m_image_type));
    }
    if (m_likes_isSet) {
        obj.insert(QString("likes"), ::OpenAPI::toJsonValue(m_likes));
    }
    if (m_missed_ingredient_count_isSet) {
        obj.insert(QString("missedIngredientCount"), ::OpenAPI::toJsonValue(m_missed_ingredient_count));
    }
    if (m_missed_ingredients.size() > 0) {
        obj.insert(QString("missedIngredients"), ::OpenAPI::toJsonValue(m_missed_ingredients));
    }
    if (m_title_isSet) {
        obj.insert(QString("title"), ::OpenAPI::toJsonValue(m_title));
    }
    if (m_unused_ingredients.size() > 0) {
        obj.insert(QString("unusedIngredients"), ::OpenAPI::toJsonValue(m_unused_ingredients));
    }
    if (m_used_ingredient_count_isSet) {
        obj.insert(QString("usedIngredientCount"), ::OpenAPI::toJsonValue(m_used_ingredient_count));
    }
    if (m_used_ingredients.size() > 0) {
        obj.insert(QString("usedIngredients"), ::OpenAPI::toJsonValue(m_used_ingredients));
    }
    return obj;
}

qint32 OAISearchRecipesByIngredients_200_response_inner::getId() const {
    return m_id;
}
void OAISearchRecipesByIngredients_200_response_inner::setId(const qint32 &id) {
    m_id = id;
    m_id_isSet = true;
}

bool OAISearchRecipesByIngredients_200_response_inner::is_id_Set() const{
    return m_id_isSet;
}

bool OAISearchRecipesByIngredients_200_response_inner::is_id_Valid() const{
    return m_id_isValid;
}

QString OAISearchRecipesByIngredients_200_response_inner::getImage() const {
    return m_image;
}
void OAISearchRecipesByIngredients_200_response_inner::setImage(const QString &image) {
    m_image = image;
    m_image_isSet = true;
}

bool OAISearchRecipesByIngredients_200_response_inner::is_image_Set() const{
    return m_image_isSet;
}

bool OAISearchRecipesByIngredients_200_response_inner::is_image_Valid() const{
    return m_image_isValid;
}

QString OAISearchRecipesByIngredients_200_response_inner::getImageType() const {
    return m_image_type;
}
void OAISearchRecipesByIngredients_200_response_inner::setImageType(const QString &image_type) {
    m_image_type = image_type;
    m_image_type_isSet = true;
}

bool OAISearchRecipesByIngredients_200_response_inner::is_image_type_Set() const{
    return m_image_type_isSet;
}

bool OAISearchRecipesByIngredients_200_response_inner::is_image_type_Valid() const{
    return m_image_type_isValid;
}

qint32 OAISearchRecipesByIngredients_200_response_inner::getLikes() const {
    return m_likes;
}
void OAISearchRecipesByIngredients_200_response_inner::setLikes(const qint32 &likes) {
    m_likes = likes;
    m_likes_isSet = true;
}

bool OAISearchRecipesByIngredients_200_response_inner::is_likes_Set() const{
    return m_likes_isSet;
}

bool OAISearchRecipesByIngredients_200_response_inner::is_likes_Valid() const{
    return m_likes_isValid;
}

qint32 OAISearchRecipesByIngredients_200_response_inner::getMissedIngredientCount() const {
    return m_missed_ingredient_count;
}
void OAISearchRecipesByIngredients_200_response_inner::setMissedIngredientCount(const qint32 &missed_ingredient_count) {
    m_missed_ingredient_count = missed_ingredient_count;
    m_missed_ingredient_count_isSet = true;
}

bool OAISearchRecipesByIngredients_200_response_inner::is_missed_ingredient_count_Set() const{
    return m_missed_ingredient_count_isSet;
}

bool OAISearchRecipesByIngredients_200_response_inner::is_missed_ingredient_count_Valid() const{
    return m_missed_ingredient_count_isValid;
}

QSet<OAISearchRecipesByIngredients_200_response_inner_missedIngredients_inner> OAISearchRecipesByIngredients_200_response_inner::getMissedIngredients() const {
    return m_missed_ingredients;
}
void OAISearchRecipesByIngredients_200_response_inner::setMissedIngredients(const QSet<OAISearchRecipesByIngredients_200_response_inner_missedIngredients_inner> &missed_ingredients) {
    m_missed_ingredients = missed_ingredients;
    m_missed_ingredients_isSet = true;
}

bool OAISearchRecipesByIngredients_200_response_inner::is_missed_ingredients_Set() const{
    return m_missed_ingredients_isSet;
}

bool OAISearchRecipesByIngredients_200_response_inner::is_missed_ingredients_Valid() const{
    return m_missed_ingredients_isValid;
}

QString OAISearchRecipesByIngredients_200_response_inner::getTitle() const {
    return m_title;
}
void OAISearchRecipesByIngredients_200_response_inner::setTitle(const QString &title) {
    m_title = title;
    m_title_isSet = true;
}

bool OAISearchRecipesByIngredients_200_response_inner::is_title_Set() const{
    return m_title_isSet;
}

bool OAISearchRecipesByIngredients_200_response_inner::is_title_Valid() const{
    return m_title_isValid;
}

QList<OAIObject> OAISearchRecipesByIngredients_200_response_inner::getUnusedIngredients() const {
    return m_unused_ingredients;
}
void OAISearchRecipesByIngredients_200_response_inner::setUnusedIngredients(const QList<OAIObject> &unused_ingredients) {
    m_unused_ingredients = unused_ingredients;
    m_unused_ingredients_isSet = true;
}

bool OAISearchRecipesByIngredients_200_response_inner::is_unused_ingredients_Set() const{
    return m_unused_ingredients_isSet;
}

bool OAISearchRecipesByIngredients_200_response_inner::is_unused_ingredients_Valid() const{
    return m_unused_ingredients_isValid;
}

double OAISearchRecipesByIngredients_200_response_inner::getUsedIngredientCount() const {
    return m_used_ingredient_count;
}
void OAISearchRecipesByIngredients_200_response_inner::setUsedIngredientCount(const double &used_ingredient_count) {
    m_used_ingredient_count = used_ingredient_count;
    m_used_ingredient_count_isSet = true;
}

bool OAISearchRecipesByIngredients_200_response_inner::is_used_ingredient_count_Set() const{
    return m_used_ingredient_count_isSet;
}

bool OAISearchRecipesByIngredients_200_response_inner::is_used_ingredient_count_Valid() const{
    return m_used_ingredient_count_isValid;
}

QSet<OAISearchRecipesByIngredients_200_response_inner_missedIngredients_inner> OAISearchRecipesByIngredients_200_response_inner::getUsedIngredients() const {
    return m_used_ingredients;
}
void OAISearchRecipesByIngredients_200_response_inner::setUsedIngredients(const QSet<OAISearchRecipesByIngredients_200_response_inner_missedIngredients_inner> &used_ingredients) {
    m_used_ingredients = used_ingredients;
    m_used_ingredients_isSet = true;
}

bool OAISearchRecipesByIngredients_200_response_inner::is_used_ingredients_Set() const{
    return m_used_ingredients_isSet;
}

bool OAISearchRecipesByIngredients_200_response_inner::is_used_ingredients_Valid() const{
    return m_used_ingredients_isValid;
}

bool OAISearchRecipesByIngredients_200_response_inner::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_image_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_image_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_likes_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_missed_ingredient_count_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_missed_ingredients.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_title_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_unused_ingredients.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_used_ingredient_count_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_used_ingredients.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAISearchRecipesByIngredients_200_response_inner::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_id_isValid && m_image_isValid && m_image_type_isValid && m_likes_isValid && m_missed_ingredient_count_isValid && m_missed_ingredients_isValid && m_title_isValid && m_unused_ingredients_isValid && m_used_ingredient_count_isValid && m_used_ingredients_isValid && true;
}

} // namespace OpenAPI
