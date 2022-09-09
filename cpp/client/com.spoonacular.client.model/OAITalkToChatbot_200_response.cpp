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

#include "OAITalkToChatbot_200_response.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAITalkToChatbot_200_response::OAITalkToChatbot_200_response(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAITalkToChatbot_200_response::OAITalkToChatbot_200_response() {
    this->initializeModel();
}

OAITalkToChatbot_200_response::~OAITalkToChatbot_200_response() {}

void OAITalkToChatbot_200_response::initializeModel() {

    m_answer_text_isSet = false;
    m_answer_text_isValid = false;

    m_media_isSet = false;
    m_media_isValid = false;
}

void OAITalkToChatbot_200_response::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAITalkToChatbot_200_response::fromJsonObject(QJsonObject json) {

    m_answer_text_isValid = ::OpenAPI::fromJsonValue(answer_text, json[QString("answerText")]);
    m_answer_text_isSet = !json[QString("answerText")].isNull() && m_answer_text_isValid;

    m_media_isValid = ::OpenAPI::fromJsonValue(media, json[QString("media")]);
    m_media_isSet = !json[QString("media")].isNull() && m_media_isValid;
}

QString OAITalkToChatbot_200_response::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAITalkToChatbot_200_response::asJsonObject() const {
    QJsonObject obj;
    if (m_answer_text_isSet) {
        obj.insert(QString("answerText"), ::OpenAPI::toJsonValue(answer_text));
    }
    if (media.size() > 0) {
        obj.insert(QString("media"), ::OpenAPI::toJsonValue(media));
    }
    return obj;
}

QString OAITalkToChatbot_200_response::getAnswerText() const {
    return answer_text;
}
void OAITalkToChatbot_200_response::setAnswerText(const QString &answer_text) {
    this->answer_text = answer_text;
    this->m_answer_text_isSet = true;
}

bool OAITalkToChatbot_200_response::is_answer_text_Set() const{
    return m_answer_text_isSet;
}

bool OAITalkToChatbot_200_response::is_answer_text_Valid() const{
    return m_answer_text_isValid;
}

QList<QJsonValue> OAITalkToChatbot_200_response::getMedia() const {
    return media;
}
void OAITalkToChatbot_200_response::setMedia(const QList<QJsonValue> &media) {
    this->media = media;
    this->m_media_isSet = true;
}

bool OAITalkToChatbot_200_response::is_media_Set() const{
    return m_media_isSet;
}

bool OAITalkToChatbot_200_response::is_media_Valid() const{
    return m_media_isValid;
}

bool OAITalkToChatbot_200_response::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_answer_text_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (media.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAITalkToChatbot_200_response::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_answer_text_isValid && m_media_isValid && true;
}

} // namespace OpenAPI
