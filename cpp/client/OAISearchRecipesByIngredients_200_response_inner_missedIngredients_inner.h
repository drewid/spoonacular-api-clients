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
 * OAISearchRecipesByIngredients_200_response_inner_missedIngredients_inner.h
 *
 * 
 */

#ifndef OAISearchRecipesByIngredients_200_response_inner_missedIngredients_inner_H
#define OAISearchRecipesByIngredients_200_response_inner_missedIngredients_inner_H

#include <QJsonObject>

#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAISearchRecipesByIngredients_200_response_inner_missedIngredients_inner : public OAIObject {
public:
    OAISearchRecipesByIngredients_200_response_inner_missedIngredients_inner();
    OAISearchRecipesByIngredients_200_response_inner_missedIngredients_inner(QString json);
    ~OAISearchRecipesByIngredients_200_response_inner_missedIngredients_inner() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getAisle() const;
    void setAisle(const QString &aisle);
    bool is_aisle_Set() const;
    bool is_aisle_Valid() const;

    double getAmount() const;
    void setAmount(const double &amount);
    bool is_amount_Set() const;
    bool is_amount_Valid() const;

    qint32 getId() const;
    void setId(const qint32 &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    QString getImage() const;
    void setImage(const QString &image);
    bool is_image_Set() const;
    bool is_image_Valid() const;

    QList<QString> getMeta() const;
    void setMeta(const QList<QString> &meta);
    bool is_meta_Set() const;
    bool is_meta_Valid() const;

    QString getName() const;
    void setName(const QString &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    QString getExtendedName() const;
    void setExtendedName(const QString &extended_name);
    bool is_extended_name_Set() const;
    bool is_extended_name_Valid() const;

    QString getOriginal() const;
    void setOriginal(const QString &original);
    bool is_original_Set() const;
    bool is_original_Valid() const;

    QString getOriginalName() const;
    void setOriginalName(const QString &original_name);
    bool is_original_name_Set() const;
    bool is_original_name_Valid() const;

    QString getUnit() const;
    void setUnit(const QString &unit);
    bool is_unit_Set() const;
    bool is_unit_Valid() const;

    QString getUnitLong() const;
    void setUnitLong(const QString &unit_long);
    bool is_unit_long_Set() const;
    bool is_unit_long_Valid() const;

    QString getUnitShort() const;
    void setUnitShort(const QString &unit_short);
    bool is_unit_short_Set() const;
    bool is_unit_short_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_aisle;
    bool m_aisle_isSet;
    bool m_aisle_isValid;

    double m_amount;
    bool m_amount_isSet;
    bool m_amount_isValid;

    qint32 m_id;
    bool m_id_isSet;
    bool m_id_isValid;

    QString m_image;
    bool m_image_isSet;
    bool m_image_isValid;

    QList<QString> m_meta;
    bool m_meta_isSet;
    bool m_meta_isValid;

    QString m_name;
    bool m_name_isSet;
    bool m_name_isValid;

    QString m_extended_name;
    bool m_extended_name_isSet;
    bool m_extended_name_isValid;

    QString m_original;
    bool m_original_isSet;
    bool m_original_isValid;

    QString m_original_name;
    bool m_original_name_isSet;
    bool m_original_name_isValid;

    QString m_unit;
    bool m_unit_isSet;
    bool m_unit_isValid;

    QString m_unit_long;
    bool m_unit_long_isSet;
    bool m_unit_long_isValid;

    QString m_unit_short;
    bool m_unit_short_isSet;
    bool m_unit_short_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAISearchRecipesByIngredients_200_response_inner_missedIngredients_inner)

#endif // OAISearchRecipesByIngredients_200_response_inner_missedIngredients_inner_H
