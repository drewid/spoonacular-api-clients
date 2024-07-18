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

/*
 * OAIGetSimilarRecipes_200_response_inner.h
 *
 * 
 */

#ifndef OAIGetSimilarRecipes_200_response_inner_H
#define OAIGetSimilarRecipes_200_response_inner_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIGetSimilarRecipes_200_response_inner : public OAIObject {
public:
    OAIGetSimilarRecipes_200_response_inner();
    OAIGetSimilarRecipes_200_response_inner(QString json);
    ~OAIGetSimilarRecipes_200_response_inner() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint32 getId() const;
    void setId(const qint32 &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    QString getTitle() const;
    void setTitle(const QString &title);
    bool is_title_Set() const;
    bool is_title_Valid() const;

    QString getImageType() const;
    void setImageType(const QString &image_type);
    bool is_image_type_Set() const;
    bool is_image_type_Valid() const;

    qint32 getReadyInMinutes() const;
    void setReadyInMinutes(const qint32 &ready_in_minutes);
    bool is_ready_in_minutes_Set() const;
    bool is_ready_in_minutes_Valid() const;

    double getServings() const;
    void setServings(const double &servings);
    bool is_servings_Set() const;
    bool is_servings_Valid() const;

    QString getSourceUrl() const;
    void setSourceUrl(const QString &source_url);
    bool is_source_url_Set() const;
    bool is_source_url_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint32 m_id;
    bool m_id_isSet;
    bool m_id_isValid;

    QString m_title;
    bool m_title_isSet;
    bool m_title_isValid;

    QString m_image_type;
    bool m_image_type_isSet;
    bool m_image_type_isValid;

    qint32 m_ready_in_minutes;
    bool m_ready_in_minutes_isSet;
    bool m_ready_in_minutes_isValid;

    double m_servings;
    bool m_servings_isSet;
    bool m_servings_isValid;

    QString m_source_url;
    bool m_source_url_isSet;
    bool m_source_url_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGetSimilarRecipes_200_response_inner)

#endif // OAIGetSimilarRecipes_200_response_inner_H
