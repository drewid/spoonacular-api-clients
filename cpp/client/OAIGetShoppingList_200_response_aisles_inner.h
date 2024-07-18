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
 * OAIGetShoppingList_200_response_aisles_inner.h
 *
 * 
 */

#ifndef OAIGetShoppingList_200_response_aisles_inner_H
#define OAIGetShoppingList_200_response_aisles_inner_H

#include <QJsonObject>

#include "OAIGetShoppingList_200_response_aisles_inner_items_inner.h"
#include <QSet>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIGetShoppingList_200_response_aisles_inner_items_inner;

class OAIGetShoppingList_200_response_aisles_inner : public OAIObject {
public:
    OAIGetShoppingList_200_response_aisles_inner();
    OAIGetShoppingList_200_response_aisles_inner(QString json);
    ~OAIGetShoppingList_200_response_aisles_inner() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getAisle() const;
    void setAisle(const QString &aisle);
    bool is_aisle_Set() const;
    bool is_aisle_Valid() const;

    QSet<OAIGetShoppingList_200_response_aisles_inner_items_inner> getItems() const;
    void setItems(const QSet<OAIGetShoppingList_200_response_aisles_inner_items_inner> &items);
    bool is_items_Set() const;
    bool is_items_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_aisle;
    bool m_aisle_isSet;
    bool m_aisle_isValid;

    QSet<OAIGetShoppingList_200_response_aisles_inner_items_inner> m_items;
    bool m_items_isSet;
    bool m_items_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGetShoppingList_200_response_aisles_inner)

#endif // OAIGetShoppingList_200_response_aisles_inner_H
