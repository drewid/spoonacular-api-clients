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
 * OAIAddMealPlanTemplate_200_response.h
 *
 * 
 */

#ifndef OAIAddMealPlanTemplate_200_response_H
#define OAIAddMealPlanTemplate_200_response_H

#include <QJsonObject>

#include "com.spoonacular.client.model\OAIAddMealPlanTemplate_200_response_items_inner.h"
#include <QList>
#include <QSet>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIAddMealPlanTemplate_200_response_items_inner;

class OAIAddMealPlanTemplate_200_response : public OAIObject {
public:
    OAIAddMealPlanTemplate_200_response();
    OAIAddMealPlanTemplate_200_response(QString json);
    ~OAIAddMealPlanTemplate_200_response() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getName() const;
    void setName(const QString &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    QSet<OAIAddMealPlanTemplate_200_response_items_inner> getItems() const;
    void setItems(const QSet<OAIAddMealPlanTemplate_200_response_items_inner> &items);
    bool is_items_Set() const;
    bool is_items_Valid() const;

    bool isPublishAsPublic() const;
    void setPublishAsPublic(const bool &publish_as_public);
    bool is_publish_as_public_Set() const;
    bool is_publish_as_public_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString name;
    bool m_name_isSet;
    bool m_name_isValid;

    QSet<OAIAddMealPlanTemplate_200_response_items_inner> items;
    bool m_items_isSet;
    bool m_items_isValid;

    bool publish_as_public;
    bool m_publish_as_public_isSet;
    bool m_publish_as_public_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIAddMealPlanTemplate_200_response)

#endif // OAIAddMealPlanTemplate_200_response_H
