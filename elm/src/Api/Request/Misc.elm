{-
   spoonacular API
   The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

   The version of the OpenAPI document: 2.0.1
   Contact: mail@spoonacular.com

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.Misc exposing
    ( detectFoodInText
    , getARandomFoodJoke
    , getConversationSuggests
    , getRandomFoodTrivia
    , imageAnalysisByURL
    , imageClassificationByURL
    , searchAllFood
    , searchCustomFoods
    , searchFoodVideos
    , searchSiteContent
    , talkToChatbot
    )

import Api
import Api.Data exposing (..)
import Dict
import Http
import Json.Decode
import Json.Encode

{-| Take any text and find all mentions of food contained within it. This task is also called Named Entity Recognition (NER). In this case, the entities are foods. Either dishes, such as pizza or cheeseburger, or ingredients, such as cucumber or almonds.
-}
detectFoodInText : String -> Api.Request Api.Data.DetectFoodInText200Response
detectFoodInText text =
    Api.request
        "POST"
        "/food/detect"
        []
        []
        []
        (Just <| Http.multipartBody <| List.filterMap identity [ Just <| Http.stringPart "text" text ])
        Api.Data.detectFoodInText200ResponseDecoder


{-| Get a random joke that is related to food. Caution: this is an endpoint for adults!
-}
getARandomFoodJoke : Api.Request Api.Data.GetARandomFoodJoke200Response
getARandomFoodJoke =
    Api.request
        "GET"
        "/food/jokes/random"
        []
        []
        []
        Nothing
        Api.Data.getARandomFoodJoke200ResponseDecoder


{-| This endpoint returns suggestions for things the user can say or ask the chatbot.
-}
getConversationSuggests : String -> Maybe Float -> Api.Request Api.Data.GetConversationSuggests200Response
getConversationSuggests query_query number_query =
    Api.request
        "GET"
        "/food/converse/suggest"
        []
        [ ( "query", Just <| identity query_query ), ( "number", Maybe.map String.fromFloat number_query ) ]
        []
        Nothing
        Api.Data.getConversationSuggests200ResponseDecoder


{-| Returns random food trivia.
-}
getRandomFoodTrivia : Api.Request Api.Data.GetARandomFoodJoke200Response
getRandomFoodTrivia =
    Api.request
        "GET"
        "/food/trivia/random"
        []
        []
        []
        Nothing
        Api.Data.getARandomFoodJoke200ResponseDecoder


{-| Analyze a food image. The API tries to classify the image, guess the nutrition, and find a matching recipes.
-}
imageAnalysisByURL : String -> Api.Request Api.Data.ImageAnalysisByURL200Response
imageAnalysisByURL imageUrl_query =
    Api.request
        "GET"
        "/food/images/analyze"
        []
        [ ( "imageUrl", Just <| identity imageUrl_query ) ]
        []
        Nothing
        Api.Data.imageAnalysisByURL200ResponseDecoder


{-| Classify a food image.
-}
imageClassificationByURL : String -> Api.Request Api.Data.ImageClassificationByURL200Response
imageClassificationByURL imageUrl_query =
    Api.request
        "GET"
        "/food/images/classify"
        []
        [ ( "imageUrl", Just <| identity imageUrl_query ) ]
        []
        Nothing
        Api.Data.imageClassificationByURL200ResponseDecoder


{-| Search all food content with one call. That includes recipes, grocery products, menu items, simple foods (ingredients), and food videos.
-}
searchAllFood : String -> Maybe Int -> Maybe Int -> Api.Request Api.Data.SearchAllFood200Response
searchAllFood query_query offset_query number_query =
    Api.request
        "GET"
        "/food/search"
        []
        [ ( "query", Just <| identity query_query ), ( "offset", Maybe.map String.fromInt offset_query ), ( "number", Maybe.map String.fromInt number_query ) ]
        []
        Nothing
        Api.Data.searchAllFood200ResponseDecoder


{-| Search custom foods in a user's account.
-}
searchCustomFoods : String -> String -> String -> Maybe Int -> Maybe Int -> Api.Request Api.Data.SearchCustomFoods200Response
searchCustomFoods query_query username_query hash_query offset_query number_query =
    Api.request
        "GET"
        "/food/customFoods/search"
        []
        [ ( "query", Just <| identity query_query ), ( "username", Just <| identity username_query ), ( "hash", Just <| identity hash_query ), ( "offset", Maybe.map String.fromInt offset_query ), ( "number", Maybe.map String.fromInt number_query ) ]
        []
        Nothing
        Api.Data.searchCustomFoods200ResponseDecoder


{-| Find recipe and other food related videos.
-}
searchFoodVideos : String -> Maybe String -> Maybe String -> Maybe String -> Maybe String -> Maybe String -> Maybe Float -> Maybe Float -> Maybe Int -> Maybe Int -> Api.Request Api.Data.SearchFoodVideos200Response
searchFoodVideos query_query type__query cuisine_query diet_query includeIngredients_query excludeIngredients_query minLength_query maxLength_query offset_query number_query =
    Api.request
        "GET"
        "/food/videos/search"
        []
        [ ( "query", Just <| identity query_query ), ( "type", Maybe.map identity type__query ), ( "cuisine", Maybe.map identity cuisine_query ), ( "diet", Maybe.map identity diet_query ), ( "includeIngredients", Maybe.map identity includeIngredients_query ), ( "excludeIngredients", Maybe.map identity excludeIngredients_query ), ( "minLength", Maybe.map String.fromFloat minLength_query ), ( "maxLength", Maybe.map String.fromFloat maxLength_query ), ( "offset", Maybe.map String.fromInt offset_query ), ( "number", Maybe.map String.fromInt number_query ) ]
        []
        Nothing
        Api.Data.searchFoodVideos200ResponseDecoder


{-| Search spoonacular's site content. You'll be able to find everything that you could also find using the search suggestions on spoonacular.com. This is a suggest API so you can send partial strings as queries.
-}
searchSiteContent : String -> Api.Request Api.Data.SearchSiteContent200Response
searchSiteContent query_query =
    Api.request
        "GET"
        "/food/site/search"
        []
        [ ( "query", Just <| identity query_query ) ]
        []
        Nothing
        Api.Data.searchSiteContent200ResponseDecoder


{-| This endpoint can be used to have a conversation about food with the spoonacular chatbot. Use the \"Get Conversation Suggests\" endpoint to show your user what he or she can say.
-}
talkToChatbot : String -> Maybe String -> Api.Request Api.Data.TalkToChatbot200Response
talkToChatbot text_query contextId_query =
    Api.request
        "GET"
        "/food/converse"
        []
        [ ( "text", Just <| identity text_query ), ( "contextId", Maybe.map identity contextId_query ) ]
        []
        Nothing
        Api.Data.talkToChatbot200ResponseDecoder

