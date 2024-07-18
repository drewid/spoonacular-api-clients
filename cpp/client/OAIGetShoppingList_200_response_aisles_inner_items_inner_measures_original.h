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
 * OAIGetShoppingList_200_response_aisles_inner_items_inner_measures_original.h
 *
 * 
 */

#ifndef OAIGetShoppingList_200_response_aisles_inner_items_inner_measures_original_H
#define OAIGetShoppingList_200_response_aisles_inner_items_inner_measures_original_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIGetShoppingList_200_response_aisles_inner_items_inner_measures_original : public OAIObject {
public:
    OAIGetShoppingList_200_response_aisles_inner_items_inner_measures_original();
    OAIGetShoppingList_200_response_aisles_inner_items_inner_measures_original(QString json);
    ~OAIGetShoppingList_200_response_aisles_inner_items_inner_measures_original() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    double getAmount() const;
    void setAmount(const double &amount);
    bool is_amount_Set() const;
    bool is_amount_Valid() const;

    QString getUnit() const;
    void setUnit(const QString &unit);
    bool is_unit_Set() const;
    bool is_unit_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    double m_amount;
    bool m_amount_isSet;
    bool m_amount_isValid;

    QString m_unit;
    bool m_unit_isSet;
    bool m_unit_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGetShoppingList_200_response_aisles_inner_items_inner_measures_original)

#endif // OAIGetShoppingList_200_response_aisles_inner_items_inner_measures_original_H
