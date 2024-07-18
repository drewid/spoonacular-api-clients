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
 * OAIGetAnalyzedRecipeInstructions_200_response_inner.h
 *
 * 
 */

#ifndef OAIGetAnalyzedRecipeInstructions_200_response_inner_H
#define OAIGetAnalyzedRecipeInstructions_200_response_inner_H

#include <QJsonObject>

#include "OAIGetAnalyzedRecipeInstructions_200_response_inner_steps_inner.h"
#include <QSet>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIGetAnalyzedRecipeInstructions_200_response_inner_steps_inner;

class OAIGetAnalyzedRecipeInstructions_200_response_inner : public OAIObject {
public:
    OAIGetAnalyzedRecipeInstructions_200_response_inner();
    OAIGetAnalyzedRecipeInstructions_200_response_inner(QString json);
    ~OAIGetAnalyzedRecipeInstructions_200_response_inner() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getName() const;
    void setName(const QString &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    QSet<OAIGetAnalyzedRecipeInstructions_200_response_inner_steps_inner> getSteps() const;
    void setSteps(const QSet<OAIGetAnalyzedRecipeInstructions_200_response_inner_steps_inner> &steps);
    bool is_steps_Set() const;
    bool is_steps_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_name;
    bool m_name_isSet;
    bool m_name_isValid;

    QSet<OAIGetAnalyzedRecipeInstructions_200_response_inner_steps_inner> m_steps;
    bool m_steps_isSet;
    bool m_steps_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGetAnalyzedRecipeInstructions_200_response_inner)

#endif // OAIGetAnalyzedRecipeInstructions_200_response_inner_H
