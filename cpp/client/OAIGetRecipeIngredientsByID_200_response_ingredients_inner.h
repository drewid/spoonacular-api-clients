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
 * OAIGetRecipeIngredientsByID_200_response_ingredients_inner.h
 *
 * 
 */

#ifndef OAIGetRecipeIngredientsByID_200_response_ingredients_inner_H
#define OAIGetRecipeIngredientsByID_200_response_ingredients_inner_H

#include <QJsonObject>

#include "OAIGetRecipePriceBreakdownByID_200_response_ingredients_inner_amount.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIGetRecipePriceBreakdownByID_200_response_ingredients_inner_amount;

class OAIGetRecipeIngredientsByID_200_response_ingredients_inner : public OAIObject {
public:
    OAIGetRecipeIngredientsByID_200_response_ingredients_inner();
    OAIGetRecipeIngredientsByID_200_response_ingredients_inner(QString json);
    ~OAIGetRecipeIngredientsByID_200_response_ingredients_inner() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIGetRecipePriceBreakdownByID_200_response_ingredients_inner_amount getAmount() const;
    void setAmount(const OAIGetRecipePriceBreakdownByID_200_response_ingredients_inner_amount &amount);
    bool is_amount_Set() const;
    bool is_amount_Valid() const;

    QString getImage() const;
    void setImage(const QString &image);
    bool is_image_Set() const;
    bool is_image_Valid() const;

    QString getName() const;
    void setName(const QString &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIGetRecipePriceBreakdownByID_200_response_ingredients_inner_amount m_amount;
    bool m_amount_isSet;
    bool m_amount_isValid;

    QString m_image;
    bool m_image_isSet;
    bool m_image_isValid;

    QString m_name;
    bool m_name_isSet;
    bool m_name_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGetRecipeIngredientsByID_200_response_ingredients_inner)

#endif // OAIGetRecipeIngredientsByID_200_response_ingredients_inner_H
