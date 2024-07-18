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
 * OAISearchResult.h
 *
 * 
 */

#ifndef OAISearchResult_H
#define OAISearchResult_H

#include <QJsonObject>

#include "OAISearchResult_dataPoints_inner.h"
#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAISearchResult_dataPoints_inner;

class OAISearchResult : public OAIObject {
public:
    OAISearchResult();
    OAISearchResult(QString json);
    ~OAISearchResult() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<OAISearchResult_dataPoints_inner> getDataPoints() const;
    void setDataPoints(const QList<OAISearchResult_dataPoints_inner> &data_points);
    bool is_data_points_Set() const;
    bool is_data_points_Valid() const;

    QString getImage() const;
    void setImage(const QString &image);
    bool is_image_Set() const;
    bool is_image_Valid() const;

    QString getLink() const;
    void setLink(const QString &link);
    bool is_link_Set() const;
    bool is_link_Valid() const;

    QString getName() const;
    void setName(const QString &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    QString getType() const;
    void setType(const QString &type);
    bool is_type_Set() const;
    bool is_type_Valid() const;

    QString getKvtable() const;
    void setKvtable(const QString &kvtable);
    bool is_kvtable_Set() const;
    bool is_kvtable_Valid() const;

    QString getContent() const;
    void setContent(const QString &content);
    bool is_content_Set() const;
    bool is_content_Valid() const;

    qint32 getId() const;
    void setId(const qint32 &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    double getRelevance() const;
    void setRelevance(const double &relevance);
    bool is_relevance_Set() const;
    bool is_relevance_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<OAISearchResult_dataPoints_inner> m_data_points;
    bool m_data_points_isSet;
    bool m_data_points_isValid;

    QString m_image;
    bool m_image_isSet;
    bool m_image_isValid;

    QString m_link;
    bool m_link_isSet;
    bool m_link_isValid;

    QString m_name;
    bool m_name_isSet;
    bool m_name_isValid;

    QString m_type;
    bool m_type_isSet;
    bool m_type_isValid;

    QString m_kvtable;
    bool m_kvtable_isSet;
    bool m_kvtable_isValid;

    QString m_content;
    bool m_content_isSet;
    bool m_content_isValid;

    qint32 m_id;
    bool m_id_isSet;
    bool m_id_isValid;

    double m_relevance;
    bool m_relevance_isSet;
    bool m_relevance_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAISearchResult)

#endif // OAISearchResult_H
