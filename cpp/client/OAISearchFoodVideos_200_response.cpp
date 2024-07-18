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

#include "OAISearchFoodVideos_200_response.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAISearchFoodVideos_200_response::OAISearchFoodVideos_200_response(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAISearchFoodVideos_200_response::OAISearchFoodVideos_200_response() {
    this->initializeModel();
}

OAISearchFoodVideos_200_response::~OAISearchFoodVideos_200_response() {}

void OAISearchFoodVideos_200_response::initializeModel() {

    m_videos_isSet = false;
    m_videos_isValid = false;

    m_total_results_isSet = false;
    m_total_results_isValid = false;
}

void OAISearchFoodVideos_200_response::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAISearchFoodVideos_200_response::fromJsonObject(QJsonObject json) {

    m_videos_isValid = ::OpenAPI::fromJsonValue(m_videos, json[QString("videos")]);
    m_videos_isSet = !json[QString("videos")].isNull() && m_videos_isValid;

    m_total_results_isValid = ::OpenAPI::fromJsonValue(m_total_results, json[QString("totalResults")]);
    m_total_results_isSet = !json[QString("totalResults")].isNull() && m_total_results_isValid;
}

QString OAISearchFoodVideos_200_response::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAISearchFoodVideos_200_response::asJsonObject() const {
    QJsonObject obj;
    if (m_videos.size() > 0) {
        obj.insert(QString("videos"), ::OpenAPI::toJsonValue(m_videos));
    }
    if (m_total_results_isSet) {
        obj.insert(QString("totalResults"), ::OpenAPI::toJsonValue(m_total_results));
    }
    return obj;
}

QSet<OAISearchFoodVideos_200_response_videos_inner> OAISearchFoodVideos_200_response::getVideos() const {
    return m_videos;
}
void OAISearchFoodVideos_200_response::setVideos(const QSet<OAISearchFoodVideos_200_response_videos_inner> &videos) {
    m_videos = videos;
    m_videos_isSet = true;
}

bool OAISearchFoodVideos_200_response::is_videos_Set() const{
    return m_videos_isSet;
}

bool OAISearchFoodVideos_200_response::is_videos_Valid() const{
    return m_videos_isValid;
}

qint32 OAISearchFoodVideos_200_response::getTotalResults() const {
    return m_total_results;
}
void OAISearchFoodVideos_200_response::setTotalResults(const qint32 &total_results) {
    m_total_results = total_results;
    m_total_results_isSet = true;
}

bool OAISearchFoodVideos_200_response::is_total_results_Set() const{
    return m_total_results_isSet;
}

bool OAISearchFoodVideos_200_response::is_total_results_Valid() const{
    return m_total_results_isValid;
}

bool OAISearchFoodVideos_200_response::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_videos.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_total_results_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAISearchFoodVideos_200_response::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_videos_isValid && m_total_results_isValid && true;
}

} // namespace OpenAPI
