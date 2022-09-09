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

/*
 * OAIGetWinePairing_200_response.h
 *
 * 
 */

#ifndef OAIGetWinePairing_200_response_H
#define OAIGetWinePairing_200_response_H

#include <QJsonObject>

#include "com.spoonacular.client.model\OAIGetWinePairing_200_response_productMatches_inner.h"
#include <QList>
#include <QSet>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIGetWinePairing_200_response_productMatches_inner;

class OAIGetWinePairing_200_response : public OAIObject {
public:
    OAIGetWinePairing_200_response();
    OAIGetWinePairing_200_response(QString json);
    ~OAIGetWinePairing_200_response() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<QString> getPairedWines() const;
    void setPairedWines(const QList<QString> &paired_wines);
    bool is_paired_wines_Set() const;
    bool is_paired_wines_Valid() const;

    QString getPairingText() const;
    void setPairingText(const QString &pairing_text);
    bool is_pairing_text_Set() const;
    bool is_pairing_text_Valid() const;

    QSet<OAIGetWinePairing_200_response_productMatches_inner> getProductMatches() const;
    void setProductMatches(const QSet<OAIGetWinePairing_200_response_productMatches_inner> &product_matches);
    bool is_product_matches_Set() const;
    bool is_product_matches_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<QString> paired_wines;
    bool m_paired_wines_isSet;
    bool m_paired_wines_isValid;

    QString pairing_text;
    bool m_pairing_text_isSet;
    bool m_pairing_text_isValid;

    QSet<OAIGetWinePairing_200_response_productMatches_inner> product_matches;
    bool m_product_matches_isSet;
    bool m_product_matches_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGetWinePairing_200_response)

#endif // OAIGetWinePairing_200_response_H
