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
 * OAIGetRecipePriceBreakdownByID_200_response_ingredients_inner_amount_metric.h
 *
 * 
 */

#ifndef OAIGetRecipePriceBreakdownByID_200_response_ingredients_inner_amount_metric_H
#define OAIGetRecipePriceBreakdownByID_200_response_ingredients_inner_amount_metric_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIGetRecipePriceBreakdownByID_200_response_ingredients_inner_amount_metric : public OAIObject {
public:
    OAIGetRecipePriceBreakdownByID_200_response_ingredients_inner_amount_metric();
    OAIGetRecipePriceBreakdownByID_200_response_ingredients_inner_amount_metric(QString json);
    ~OAIGetRecipePriceBreakdownByID_200_response_ingredients_inner_amount_metric() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getUnit() const;
    void setUnit(const QString &unit);
    bool is_unit_Set() const;
    bool is_unit_Valid() const;

    double getValue() const;
    void setValue(const double &value);
    bool is_value_Set() const;
    bool is_value_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString unit;
    bool m_unit_isSet;
    bool m_unit_isValid;

    double value;
    bool m_value_isSet;
    bool m_value_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGetRecipePriceBreakdownByID_200_response_ingredients_inner_amount_metric)

#endif // OAIGetRecipePriceBreakdownByID_200_response_ingredients_inner_amount_metric_H
