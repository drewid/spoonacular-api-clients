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
 * OAIGetAnalyzedRecipeInstructions_200_response_parsedInstructions_inner_steps_inner.h
 *
 * 
 */

#ifndef OAIGetAnalyzedRecipeInstructions_200_response_parsedInstructions_inner_steps_inner_H
#define OAIGetAnalyzedRecipeInstructions_200_response_parsedInstructions_inner_steps_inner_H

#include <QJsonObject>

#include "com.spoonacular.client.model\OAIGetAnalyzedRecipeInstructions_200_response_parsedInstructions_inner_steps_inner_ingredients_inner.h"
#include <QList>
#include <QSet>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIGetAnalyzedRecipeInstructions_200_response_parsedInstructions_inner_steps_inner_ingredients_inner;

class OAIGetAnalyzedRecipeInstructions_200_response_parsedInstructions_inner_steps_inner : public OAIObject {
public:
    OAIGetAnalyzedRecipeInstructions_200_response_parsedInstructions_inner_steps_inner();
    OAIGetAnalyzedRecipeInstructions_200_response_parsedInstructions_inner_steps_inner(QString json);
    ~OAIGetAnalyzedRecipeInstructions_200_response_parsedInstructions_inner_steps_inner() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    double getNumber() const;
    void setNumber(const double &number);
    bool is_number_Set() const;
    bool is_number_Valid() const;

    QString getStep() const;
    void setStep(const QString &step);
    bool is_step_Set() const;
    bool is_step_Valid() const;

    QSet<OAIGetAnalyzedRecipeInstructions_200_response_parsedInstructions_inner_steps_inner_ingredients_inner> getIngredients() const;
    void setIngredients(const QSet<OAIGetAnalyzedRecipeInstructions_200_response_parsedInstructions_inner_steps_inner_ingredients_inner> &ingredients);
    bool is_ingredients_Set() const;
    bool is_ingredients_Valid() const;

    QSet<OAIGetAnalyzedRecipeInstructions_200_response_parsedInstructions_inner_steps_inner_ingredients_inner> getEquipment() const;
    void setEquipment(const QSet<OAIGetAnalyzedRecipeInstructions_200_response_parsedInstructions_inner_steps_inner_ingredients_inner> &equipment);
    bool is_equipment_Set() const;
    bool is_equipment_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    double number;
    bool m_number_isSet;
    bool m_number_isValid;

    QString step;
    bool m_step_isSet;
    bool m_step_isValid;

    QSet<OAIGetAnalyzedRecipeInstructions_200_response_parsedInstructions_inner_steps_inner_ingredients_inner> ingredients;
    bool m_ingredients_isSet;
    bool m_ingredients_isValid;

    QSet<OAIGetAnalyzedRecipeInstructions_200_response_parsedInstructions_inner_steps_inner_ingredients_inner> equipment;
    bool m_equipment_isSet;
    bool m_equipment_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGetAnalyzedRecipeInstructions_200_response_parsedInstructions_inner_steps_inner)

#endif // OAIGetAnalyzedRecipeInstructions_200_response_parsedInstructions_inner_steps_inner_H
