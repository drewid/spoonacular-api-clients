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

#ifndef OAI_OAIDefaultApi_H
#define OAI_OAIDefaultApi_H

#include "OAIHelpers.h"
#include "OAIHttpRequest.h"
#include "OAIServerConfiguration.h"
#include "OAIOauth.h"

#include "OAIAnalyzeRecipe_request.h"
#include "OAIObject.h"
#include "OAISearchRestaurants_200_response.h"
#include <QString>

#include <QObject>
#include <QByteArray>
#include <QStringList>
#include <QList>
#include <QNetworkAccessManager>

namespace OpenAPI {

class OAIDefaultApi : public QObject {
    Q_OBJECT

public:
    OAIDefaultApi(const int timeOut = 0);
    ~OAIDefaultApi();

    void initializeServerConfigs();
    int setDefaultServerValue(int serverIndex,const QString &operation, const QString &variable,const QString &val);
    void setServerIndex(const QString &operation, int serverIndex);
    void setApiKey(const QString &apiKeyName, const QString &apiKey);
    void setBearerToken(const QString &token);
    void setUsername(const QString &username);
    void setPassword(const QString &password);
    void setTimeOut(const int timeOut);
    void setWorkingDirectory(const QString &path);
    void setNetworkAccessManager(QNetworkAccessManager* manager);
    int addServerConfiguration(const QString &operation, const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables = QMap<QString, OAIServerVariable>());
    void setNewServerForAllOperations(const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables =  QMap<QString, OAIServerVariable>());
    void setNewServer(const QString &operation, const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables =  QMap<QString, OAIServerVariable>());
    void addHeaders(const QString &key, const QString &value);
    void enableRequestCompression();
    void enableResponseCompression();
    void abortRequests();
    QString getParamStylePrefix(const QString &style);
    QString getParamStyleSuffix(const QString &style);
    QString getParamStyleDelimiter(const QString &style, const QString &name, bool isExplode);

    /**
    * @param[in]  oai_analyze_recipe_request OAIAnalyzeRecipe_request [required]
    * @param[in]  language QString [optional]
    * @param[in]  include_nutrition bool [optional]
    * @param[in]  include_taste bool [optional]
    */
    void analyzeRecipe(const OAIAnalyzeRecipe_request &oai_analyze_recipe_request, const ::OpenAPI::OptionalParam<QString> &language = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<bool> &include_nutrition = ::OpenAPI::OptionalParam<bool>(), const ::OpenAPI::OptionalParam<bool> &include_taste = ::OpenAPI::OptionalParam<bool>());

    /**
    * @param[in]  id qint32 [required]
    * @param[in]  mask QString [optional]
    * @param[in]  background_image QString [optional]
    * @param[in]  background_color QString [optional]
    * @param[in]  font_color QString [optional]
    */
    void createRecipeCardGet(const qint32 &id, const ::OpenAPI::OptionalParam<QString> &mask = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &background_image = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &background_color = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<QString> &font_color = ::OpenAPI::OptionalParam<QString>());

    /**
    * @param[in]  query QString [optional]
    * @param[in]  lat double [optional]
    * @param[in]  lng double [optional]
    * @param[in]  distance double [optional]
    * @param[in]  budget double [optional]
    * @param[in]  cuisine QString [optional]
    * @param[in]  min_rating double [optional]
    * @param[in]  is_open bool [optional]
    * @param[in]  sort QString [optional]
    * @param[in]  page double [optional]
    */
    void searchRestaurants(const ::OpenAPI::OptionalParam<QString> &query = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<double> &lat = ::OpenAPI::OptionalParam<double>(), const ::OpenAPI::OptionalParam<double> &lng = ::OpenAPI::OptionalParam<double>(), const ::OpenAPI::OptionalParam<double> &distance = ::OpenAPI::OptionalParam<double>(), const ::OpenAPI::OptionalParam<double> &budget = ::OpenAPI::OptionalParam<double>(), const ::OpenAPI::OptionalParam<QString> &cuisine = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<double> &min_rating = ::OpenAPI::OptionalParam<double>(), const ::OpenAPI::OptionalParam<bool> &is_open = ::OpenAPI::OptionalParam<bool>(), const ::OpenAPI::OptionalParam<QString> &sort = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<double> &page = ::OpenAPI::OptionalParam<double>());


private:
    QMap<QString,int> _serverIndices;
    QMap<QString,QList<OAIServerConfiguration>> _serverConfigs;
    QMap<QString, QString> _apiKeys;
    QString _bearerToken;
    QString _username;
    QString _password;
    int _timeOut;
    QString _workingDirectory;
    QNetworkAccessManager* _manager;
    QMap<QString, QString> _defaultHeaders;
    bool _isResponseCompressionEnabled;
    bool _isRequestCompressionEnabled;
    OAIHttpRequestInput _latestInput;
    OAIHttpRequestWorker *_latestWorker;
    QStringList _latestScope;
    OauthCode _authFlow;
    OauthImplicit _implicitFlow;
    OauthCredentials _credentialFlow;
    OauthPassword _passwordFlow;
    int _OauthMethod = 0;

    void analyzeRecipeCallback(OAIHttpRequestWorker *worker);
    void createRecipeCardGetCallback(OAIHttpRequestWorker *worker);
    void searchRestaurantsCallback(OAIHttpRequestWorker *worker);

Q_SIGNALS:

    void analyzeRecipeSignal(OAIObject summary);
    void createRecipeCardGetSignal(OAIObject summary);
    void searchRestaurantsSignal(OAISearchRestaurants_200_response summary);

    void analyzeRecipeSignalFull(OAIHttpRequestWorker *worker, OAIObject summary);
    void createRecipeCardGetSignalFull(OAIHttpRequestWorker *worker, OAIObject summary);
    void searchRestaurantsSignalFull(OAIHttpRequestWorker *worker, OAISearchRestaurants_200_response summary);

    Q_DECL_DEPRECATED_X("Use analyzeRecipeSignalError() instead")
    void analyzeRecipeSignalE(OAIObject summary, QNetworkReply::NetworkError error_type, QString error_str);
    void analyzeRecipeSignalError(OAIObject summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use createRecipeCardGetSignalError() instead")
    void createRecipeCardGetSignalE(OAIObject summary, QNetworkReply::NetworkError error_type, QString error_str);
    void createRecipeCardGetSignalError(OAIObject summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use searchRestaurantsSignalError() instead")
    void searchRestaurantsSignalE(OAISearchRestaurants_200_response summary, QNetworkReply::NetworkError error_type, QString error_str);
    void searchRestaurantsSignalError(OAISearchRestaurants_200_response summary, QNetworkReply::NetworkError error_type, const QString &error_str);

    Q_DECL_DEPRECATED_X("Use analyzeRecipeSignalErrorFull() instead")
    void analyzeRecipeSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void analyzeRecipeSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use createRecipeCardGetSignalErrorFull() instead")
    void createRecipeCardGetSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void createRecipeCardGetSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use searchRestaurantsSignalErrorFull() instead")
    void searchRestaurantsSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void searchRestaurantsSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);

    void abortRequestsSignal();
    void allPendingRequestsCompleted();

public Q_SLOTS:
    void tokenAvailable();
};

} // namespace OpenAPI
#endif
