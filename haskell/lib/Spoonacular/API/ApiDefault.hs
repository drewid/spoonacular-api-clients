{-
   spoonacular API

   The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

   OpenAPI Version: 3.0.0
   spoonacular API API version: 1.1
   Contact: mail@spoonacular.com
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : Spoonacular.API.ApiDefault
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module Spoonacular.API.ApiDefault where

import Spoonacular.Core
import Spoonacular.MimeTypes
import Spoonacular.Model as M

import qualified Data.Aeson as A
import qualified Data.ByteString as B
import qualified Data.ByteString.Lazy as BL
import qualified Data.Data as P (Typeable, TypeRep, typeOf, typeRep)
import qualified Data.Foldable as P
import qualified Data.Map as Map
import qualified Data.Maybe as P
import qualified Data.Proxy as P (Proxy(..))
import qualified Data.Set as Set
import qualified Data.String as P
import qualified Data.Text as T
import qualified Data.Text.Encoding as T
import qualified Data.Text.Lazy as TL
import qualified Data.Text.Lazy.Encoding as TL
import qualified Data.Time as TI
import qualified Network.HTTP.Client.MultipartFormData as NH
import qualified Network.HTTP.Media as ME
import qualified Network.HTTP.Types as NH
import qualified Web.FormUrlEncoded as WH
import qualified Web.HttpApiData as WH

import Data.Text (Text)
import GHC.Base ((<|>))

import Prelude ((==),(/=),($), (.),(<$>),(<*>),(>>=),Maybe(..),Bool(..),Char,Double,FilePath,Float,Int,Integer,String,fmap,undefined,mempty,maybe,pure,Monad,Applicative,Functor)
import qualified Prelude as P

-- * Operations


-- ** Default

-- *** analyzeRecipe

-- | @POST \/recipes\/analyze@
-- 
-- Analyze Recipe
-- 
-- This endpoint allows you to send raw recipe information, such as title, servings, and ingredients, to then see what we compute (badges, diets, nutrition, and more). This is useful if you have your own recipe data and want to enrich it with our semantic analysis.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
analyzeRecipe
  :: (Consumes AnalyzeRecipe contentType, MimeRender contentType AnalyzeRecipeRequest)
  => ContentType contentType -- ^ request content-type ('MimeType')
  -> AnalyzeRecipeRequest -- ^ "analyzeRecipeRequest" -  Example request body.
  -> SpoonacularRequest AnalyzeRecipe contentType A.Value MimeJSON
analyzeRecipe _ analyzeRecipeRequest =
  _mkRequest "POST" ["/recipes/analyze"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)
    `setBodyParam` analyzeRecipeRequest

data AnalyzeRecipe 

-- | /Body Param/ "AnalyzeRecipeRequest" - Example request body.
instance HasBodyParam AnalyzeRecipe AnalyzeRecipeRequest 

-- | /Optional Param/ "language" - The input language, either \"en\" or \"de\".
instance HasOptionalParam AnalyzeRecipe LanguageText where
  applyOptionalParam req (LanguageText xs) =
    req `addQuery` toQuery ("language", Just xs)

-- | /Optional Param/ "includeNutrition" - Whether nutrition data should be added to correctly parsed ingredients.
instance HasOptionalParam AnalyzeRecipe IncludeNutrition where
  applyOptionalParam req (IncludeNutrition xs) =
    req `addQuery` toQuery ("includeNutrition", Just xs)

-- | /Optional Param/ "includeTaste" - Whether taste data should be added to correctly parsed ingredients.
instance HasOptionalParam AnalyzeRecipe IncludeTaste where
  applyOptionalParam req (IncludeTaste xs) =
    req `addQuery` toQuery ("includeTaste", Just xs)

-- | @@
instance Consumes AnalyzeRecipe 
-- | @application/json@
instance Consumes AnalyzeRecipe MimeJSON

-- | @application/json@
instance Produces AnalyzeRecipe MimeJSON


-- *** createRecipeCardGet

-- | @GET \/recipes\/{id}\/card@
-- 
-- Create Recipe Card
-- 
-- Generate a recipe card for a recipe.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
createRecipeCardGet
  :: IdDouble -- ^ "id" -  The recipe id.
  -> SpoonacularRequest CreateRecipeCardGet MimeNoContent A.Value MimeJSON
createRecipeCardGet (IdDouble id) =
  _mkRequest "GET" ["/recipes/",toPath id,"/card"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)

data CreateRecipeCardGet  

-- | /Optional Param/ "mask" - The mask to put over the recipe image (\"ellipseMask\", \"diamondMask\", \"starMask\", \"heartMask\", \"potMask\", \"fishMask\").
instance HasOptionalParam CreateRecipeCardGet Mask where
  applyOptionalParam req (Mask xs) =
    req `addQuery` toQuery ("mask", Just xs)

-- | /Optional Param/ "backgroundImage" - The background image (\"none\",\"background1\", or \"background2\").
instance HasOptionalParam CreateRecipeCardGet BackgroundImage where
  applyOptionalParam req (BackgroundImage xs) =
    req `addQuery` toQuery ("backgroundImage", Just xs)

-- | /Optional Param/ "backgroundColor" - The background color for the recipe card as a hex-string.
instance HasOptionalParam CreateRecipeCardGet BackgroundColor where
  applyOptionalParam req (BackgroundColor xs) =
    req `addQuery` toQuery ("backgroundColor", Just xs)

-- | /Optional Param/ "fontColor" - The font color for the recipe card as a hex-string.
instance HasOptionalParam CreateRecipeCardGet FontColor where
  applyOptionalParam req (FontColor xs) =
    req `addQuery` toQuery ("fontColor", Just xs)
-- | @application/json@
instance Produces CreateRecipeCardGet MimeJSON


-- *** searchRestaurants

-- | @GET \/food\/restaurants\/search@
-- 
-- Search Restaurants
-- 
-- Search through thousands of restaurants (in North America) by location, cuisine, budget, and more.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
searchRestaurants
  :: SpoonacularRequest SearchRestaurants MimeNoContent SearchRestaurants200Response MimeJSON
searchRestaurants =
  _mkRequest "GET" ["/food/restaurants/search"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)

data SearchRestaurants  

-- | /Optional Param/ "query" - The search query.
instance HasOptionalParam SearchRestaurants Query where
  applyOptionalParam req (Query xs) =
    req `addQuery` toQuery ("query", Just xs)

-- | /Optional Param/ "lat" - The latitude of the user's location.
instance HasOptionalParam SearchRestaurants Lat where
  applyOptionalParam req (Lat xs) =
    req `addQuery` toQuery ("lat", Just xs)

-- | /Optional Param/ "lng" - The longitude of the user's location.\".
instance HasOptionalParam SearchRestaurants Lng where
  applyOptionalParam req (Lng xs) =
    req `addQuery` toQuery ("lng", Just xs)

-- | /Optional Param/ "distance" - The distance around the location in miles.
instance HasOptionalParam SearchRestaurants Distance where
  applyOptionalParam req (Distance xs) =
    req `addQuery` toQuery ("distance", Just xs)

-- | /Optional Param/ "budget" - The user's budget for a meal in USD.
instance HasOptionalParam SearchRestaurants Budget where
  applyOptionalParam req (Budget xs) =
    req `addQuery` toQuery ("budget", Just xs)

-- | /Optional Param/ "cuisine" - The cuisine of the restaurant.
instance HasOptionalParam SearchRestaurants Cuisine where
  applyOptionalParam req (Cuisine xs) =
    req `addQuery` toQuery ("cuisine", Just xs)

-- | /Optional Param/ "min-rating" - The minimum rating of the restaurant between 0 and 5.
instance HasOptionalParam SearchRestaurants MinRating where
  applyOptionalParam req (MinRating xs) =
    req `addQuery` toQuery ("min-rating", Just xs)

-- | /Optional Param/ "is-open" - Whether the restaurant must be open at the time of search.
instance HasOptionalParam SearchRestaurants IsOpen where
  applyOptionalParam req (IsOpen xs) =
    req `addQuery` toQuery ("is-open", Just xs)

-- | /Optional Param/ "sort" - How to sort the results, one of the following 'cheapest', 'fastest', 'rating', 'distance' or the default 'relevance'.
instance HasOptionalParam SearchRestaurants Sort where
  applyOptionalParam req (Sort xs) =
    req `addQuery` toQuery ("sort", Just xs)

-- | /Optional Param/ "page" - The page number of results.
instance HasOptionalParam SearchRestaurants Page where
  applyOptionalParam req (Page xs) =
    req `addQuery` toQuery ("page", Just xs)
-- | @application/json@
instance Produces SearchRestaurants MimeJSON
