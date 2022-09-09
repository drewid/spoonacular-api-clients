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

#include "OAIGetWineRecommendation_200_response_recommendedWines_inner.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGetWineRecommendation_200_response_recommendedWines_inner::OAIGetWineRecommendation_200_response_recommendedWines_inner(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGetWineRecommendation_200_response_recommendedWines_inner::OAIGetWineRecommendation_200_response_recommendedWines_inner() {
    this->initializeModel();
}

OAIGetWineRecommendation_200_response_recommendedWines_inner::~OAIGetWineRecommendation_200_response_recommendedWines_inner() {}

void OAIGetWineRecommendation_200_response_recommendedWines_inner::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_title_isSet = false;
    m_title_isValid = false;

    m_average_rating_isSet = false;
    m_average_rating_isValid = false;

    m_description_isSet = false;
    m_description_isValid = false;

    m_image_url_isSet = false;
    m_image_url_isValid = false;

    m_link_isSet = false;
    m_link_isValid = false;

    m_price_isSet = false;
    m_price_isValid = false;

    m_rating_count_isSet = false;
    m_rating_count_isValid = false;

    m_score_isSet = false;
    m_score_isValid = false;
}

void OAIGetWineRecommendation_200_response_recommendedWines_inner::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGetWineRecommendation_200_response_recommendedWines_inner::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_title_isValid = ::OpenAPI::fromJsonValue(title, json[QString("title")]);
    m_title_isSet = !json[QString("title")].isNull() && m_title_isValid;

    m_average_rating_isValid = ::OpenAPI::fromJsonValue(average_rating, json[QString("averageRating")]);
    m_average_rating_isSet = !json[QString("averageRating")].isNull() && m_average_rating_isValid;

    m_description_isValid = ::OpenAPI::fromJsonValue(description, json[QString("description")]);
    m_description_isSet = !json[QString("description")].isNull() && m_description_isValid;

    m_image_url_isValid = ::OpenAPI::fromJsonValue(image_url, json[QString("imageUrl")]);
    m_image_url_isSet = !json[QString("imageUrl")].isNull() && m_image_url_isValid;

    m_link_isValid = ::OpenAPI::fromJsonValue(link, json[QString("link")]);
    m_link_isSet = !json[QString("link")].isNull() && m_link_isValid;

    m_price_isValid = ::OpenAPI::fromJsonValue(price, json[QString("price")]);
    m_price_isSet = !json[QString("price")].isNull() && m_price_isValid;

    m_rating_count_isValid = ::OpenAPI::fromJsonValue(rating_count, json[QString("ratingCount")]);
    m_rating_count_isSet = !json[QString("ratingCount")].isNull() && m_rating_count_isValid;

    m_score_isValid = ::OpenAPI::fromJsonValue(score, json[QString("score")]);
    m_score_isSet = !json[QString("score")].isNull() && m_score_isValid;
}

QString OAIGetWineRecommendation_200_response_recommendedWines_inner::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGetWineRecommendation_200_response_recommendedWines_inner::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (m_title_isSet) {
        obj.insert(QString("title"), ::OpenAPI::toJsonValue(title));
    }
    if (m_average_rating_isSet) {
        obj.insert(QString("averageRating"), ::OpenAPI::toJsonValue(average_rating));
    }
    if (m_description_isSet) {
        obj.insert(QString("description"), ::OpenAPI::toJsonValue(description));
    }
    if (m_image_url_isSet) {
        obj.insert(QString("imageUrl"), ::OpenAPI::toJsonValue(image_url));
    }
    if (m_link_isSet) {
        obj.insert(QString("link"), ::OpenAPI::toJsonValue(link));
    }
    if (m_price_isSet) {
        obj.insert(QString("price"), ::OpenAPI::toJsonValue(price));
    }
    if (m_rating_count_isSet) {
        obj.insert(QString("ratingCount"), ::OpenAPI::toJsonValue(rating_count));
    }
    if (m_score_isSet) {
        obj.insert(QString("score"), ::OpenAPI::toJsonValue(score));
    }
    return obj;
}

qint32 OAIGetWineRecommendation_200_response_recommendedWines_inner::getId() const {
    return id;
}
void OAIGetWineRecommendation_200_response_recommendedWines_inner::setId(const qint32 &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAIGetWineRecommendation_200_response_recommendedWines_inner::is_id_Set() const{
    return m_id_isSet;
}

bool OAIGetWineRecommendation_200_response_recommendedWines_inner::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIGetWineRecommendation_200_response_recommendedWines_inner::getTitle() const {
    return title;
}
void OAIGetWineRecommendation_200_response_recommendedWines_inner::setTitle(const QString &title) {
    this->title = title;
    this->m_title_isSet = true;
}

bool OAIGetWineRecommendation_200_response_recommendedWines_inner::is_title_Set() const{
    return m_title_isSet;
}

bool OAIGetWineRecommendation_200_response_recommendedWines_inner::is_title_Valid() const{
    return m_title_isValid;
}

double OAIGetWineRecommendation_200_response_recommendedWines_inner::getAverageRating() const {
    return average_rating;
}
void OAIGetWineRecommendation_200_response_recommendedWines_inner::setAverageRating(const double &average_rating) {
    this->average_rating = average_rating;
    this->m_average_rating_isSet = true;
}

bool OAIGetWineRecommendation_200_response_recommendedWines_inner::is_average_rating_Set() const{
    return m_average_rating_isSet;
}

bool OAIGetWineRecommendation_200_response_recommendedWines_inner::is_average_rating_Valid() const{
    return m_average_rating_isValid;
}

QString OAIGetWineRecommendation_200_response_recommendedWines_inner::getDescription() const {
    return description;
}
void OAIGetWineRecommendation_200_response_recommendedWines_inner::setDescription(const QString &description) {
    this->description = description;
    this->m_description_isSet = true;
}

bool OAIGetWineRecommendation_200_response_recommendedWines_inner::is_description_Set() const{
    return m_description_isSet;
}

bool OAIGetWineRecommendation_200_response_recommendedWines_inner::is_description_Valid() const{
    return m_description_isValid;
}

QString OAIGetWineRecommendation_200_response_recommendedWines_inner::getImageUrl() const {
    return image_url;
}
void OAIGetWineRecommendation_200_response_recommendedWines_inner::setImageUrl(const QString &image_url) {
    this->image_url = image_url;
    this->m_image_url_isSet = true;
}

bool OAIGetWineRecommendation_200_response_recommendedWines_inner::is_image_url_Set() const{
    return m_image_url_isSet;
}

bool OAIGetWineRecommendation_200_response_recommendedWines_inner::is_image_url_Valid() const{
    return m_image_url_isValid;
}

QString OAIGetWineRecommendation_200_response_recommendedWines_inner::getLink() const {
    return link;
}
void OAIGetWineRecommendation_200_response_recommendedWines_inner::setLink(const QString &link) {
    this->link = link;
    this->m_link_isSet = true;
}

bool OAIGetWineRecommendation_200_response_recommendedWines_inner::is_link_Set() const{
    return m_link_isSet;
}

bool OAIGetWineRecommendation_200_response_recommendedWines_inner::is_link_Valid() const{
    return m_link_isValid;
}

QString OAIGetWineRecommendation_200_response_recommendedWines_inner::getPrice() const {
    return price;
}
void OAIGetWineRecommendation_200_response_recommendedWines_inner::setPrice(const QString &price) {
    this->price = price;
    this->m_price_isSet = true;
}

bool OAIGetWineRecommendation_200_response_recommendedWines_inner::is_price_Set() const{
    return m_price_isSet;
}

bool OAIGetWineRecommendation_200_response_recommendedWines_inner::is_price_Valid() const{
    return m_price_isValid;
}

qint32 OAIGetWineRecommendation_200_response_recommendedWines_inner::getRatingCount() const {
    return rating_count;
}
void OAIGetWineRecommendation_200_response_recommendedWines_inner::setRatingCount(const qint32 &rating_count) {
    this->rating_count = rating_count;
    this->m_rating_count_isSet = true;
}

bool OAIGetWineRecommendation_200_response_recommendedWines_inner::is_rating_count_Set() const{
    return m_rating_count_isSet;
}

bool OAIGetWineRecommendation_200_response_recommendedWines_inner::is_rating_count_Valid() const{
    return m_rating_count_isValid;
}

double OAIGetWineRecommendation_200_response_recommendedWines_inner::getScore() const {
    return score;
}
void OAIGetWineRecommendation_200_response_recommendedWines_inner::setScore(const double &score) {
    this->score = score;
    this->m_score_isSet = true;
}

bool OAIGetWineRecommendation_200_response_recommendedWines_inner::is_score_Set() const{
    return m_score_isSet;
}

bool OAIGetWineRecommendation_200_response_recommendedWines_inner::is_score_Valid() const{
    return m_score_isValid;
}

bool OAIGetWineRecommendation_200_response_recommendedWines_inner::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_title_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_average_rating_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_description_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_image_url_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_link_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_price_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_rating_count_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_score_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGetWineRecommendation_200_response_recommendedWines_inner::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_id_isValid && m_title_isValid && m_average_rating_isValid && m_description_isValid && m_image_url_isValid && m_link_isValid && m_price_isValid && m_rating_count_isValid && m_score_isValid && true;
}

} // namespace OpenAPI
