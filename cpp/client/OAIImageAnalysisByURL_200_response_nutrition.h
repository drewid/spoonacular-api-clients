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
 * OAIImageAnalysisByURL_200_response_nutrition.h
 *
 * 
 */

#ifndef OAIImageAnalysisByURL_200_response_nutrition_H
#define OAIImageAnalysisByURL_200_response_nutrition_H

#include <QJsonObject>

#include "OAIImageAnalysisByURL_200_response_nutrition_calories.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIImageAnalysisByURL_200_response_nutrition_calories;

class OAIImageAnalysisByURL_200_response_nutrition : public OAIObject {
public:
    OAIImageAnalysisByURL_200_response_nutrition();
    OAIImageAnalysisByURL_200_response_nutrition(QString json);
    ~OAIImageAnalysisByURL_200_response_nutrition() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint32 getRecipesUsed() const;
    void setRecipesUsed(const qint32 &recipes_used);
    bool is_recipes_used_Set() const;
    bool is_recipes_used_Valid() const;

    OAIImageAnalysisByURL_200_response_nutrition_calories getCalories() const;
    void setCalories(const OAIImageAnalysisByURL_200_response_nutrition_calories &calories);
    bool is_calories_Set() const;
    bool is_calories_Valid() const;

    OAIImageAnalysisByURL_200_response_nutrition_calories getFat() const;
    void setFat(const OAIImageAnalysisByURL_200_response_nutrition_calories &fat);
    bool is_fat_Set() const;
    bool is_fat_Valid() const;

    OAIImageAnalysisByURL_200_response_nutrition_calories getProtein() const;
    void setProtein(const OAIImageAnalysisByURL_200_response_nutrition_calories &protein);
    bool is_protein_Set() const;
    bool is_protein_Valid() const;

    OAIImageAnalysisByURL_200_response_nutrition_calories getCarbs() const;
    void setCarbs(const OAIImageAnalysisByURL_200_response_nutrition_calories &carbs);
    bool is_carbs_Set() const;
    bool is_carbs_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint32 m_recipes_used;
    bool m_recipes_used_isSet;
    bool m_recipes_used_isValid;

    OAIImageAnalysisByURL_200_response_nutrition_calories m_calories;
    bool m_calories_isSet;
    bool m_calories_isValid;

    OAIImageAnalysisByURL_200_response_nutrition_calories m_fat;
    bool m_fat_isSet;
    bool m_fat_isValid;

    OAIImageAnalysisByURL_200_response_nutrition_calories m_protein;
    bool m_protein_isSet;
    bool m_protein_isValid;

    OAIImageAnalysisByURL_200_response_nutrition_calories m_carbs;
    bool m_carbs_isSet;
    bool m_carbs_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIImageAnalysisByURL_200_response_nutrition)

#endif // OAIImageAnalysisByURL_200_response_nutrition_H
