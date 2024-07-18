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
 * OAISearchGroceryProductsByUPC_200_response_nutrition_caloricBreakdown.h
 *
 * 
 */

#ifndef OAISearchGroceryProductsByUPC_200_response_nutrition_caloricBreakdown_H
#define OAISearchGroceryProductsByUPC_200_response_nutrition_caloricBreakdown_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAISearchGroceryProductsByUPC_200_response_nutrition_caloricBreakdown : public OAIObject {
public:
    OAISearchGroceryProductsByUPC_200_response_nutrition_caloricBreakdown();
    OAISearchGroceryProductsByUPC_200_response_nutrition_caloricBreakdown(QString json);
    ~OAISearchGroceryProductsByUPC_200_response_nutrition_caloricBreakdown() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    double getPercentProtein() const;
    void setPercentProtein(const double &percent_protein);
    bool is_percent_protein_Set() const;
    bool is_percent_protein_Valid() const;

    double getPercentFat() const;
    void setPercentFat(const double &percent_fat);
    bool is_percent_fat_Set() const;
    bool is_percent_fat_Valid() const;

    double getPercentCarbs() const;
    void setPercentCarbs(const double &percent_carbs);
    bool is_percent_carbs_Set() const;
    bool is_percent_carbs_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    double m_percent_protein;
    bool m_percent_protein_isSet;
    bool m_percent_protein_isValid;

    double m_percent_fat;
    bool m_percent_fat_isSet;
    bool m_percent_fat_isValid;

    double m_percent_carbs;
    bool m_percent_carbs_isSet;
    bool m_percent_carbs_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAISearchGroceryProductsByUPC_200_response_nutrition_caloricBreakdown)

#endif // OAISearchGroceryProductsByUPC_200_response_nutrition_caloricBreakdown_H
