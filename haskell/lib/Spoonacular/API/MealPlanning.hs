{-
   spoonacular API

   The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 800,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

   OpenAPI Version: 3.0.0
   spoonacular API API version: 1.0
   Contact: mail@spoonacular.com
   Generated by OpenAPI Generator (https://openapi-generator.tech)
-}

{-|
Module : Spoonacular.API.MealPlanning
-}

{-# LANGUAGE FlexibleContexts #-}
{-# LANGUAGE FlexibleInstances #-}
{-# LANGUAGE MonoLocalBinds #-}
{-# LANGUAGE MultiParamTypeClasses #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing -fno-warn-unused-binds -fno-warn-unused-imports #-}

module Spoonacular.API.MealPlanning where

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


-- ** MealPlanning

-- *** addMealPlanTemplate

-- | @POST \/mealplanner\/{username}\/templates@
-- 
-- Add Meal Plan Template
-- 
-- Add a meal plan template for a user.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
addMealPlanTemplate 
  :: (Consumes AddMealPlanTemplate , MimeRender  InlineObject6)
  => InlineObject6 -- ^ "inlineObject6"
  -> Username -- ^ "username" -  The username.
  -> Hash -- ^ "hash" -  The private hash for the username.
  -> SpoonacularRequest AddMealPlanTemplate  InlineResponse20040 MimeJSON
addMealPlanTemplate inlineObject6 (Username username) (Hash hash) =
  _mkRequest "POST" ["/mealplanner/",toPath username,"/templates"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)
    `setBodyParam` inlineObject6
    `setQuery` toQuery ("hash", Just hash)

data AddMealPlanTemplate 
instance HasBodyParam AddMealPlanTemplate InlineObject6 

-- | @@
instance Consumes AddMealPlanTemplate 

-- | @application/json@
instance Produces AddMealPlanTemplate MimeJSON


-- *** addToMealPlan

-- | @POST \/mealplanner\/{username}\/items@
-- 
-- Add to Meal Plan
-- 
-- Add an item to the user's meal plan.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
addToMealPlan 
  :: (Consumes AddToMealPlan contentType, MimeRender contentType InlineObject4)
  => ContentType contentType -- ^ request content-type ('MimeType')
  -> InlineObject4 -- ^ "inlineObject4"
  -> Username -- ^ "username" -  The username.
  -> Hash -- ^ "hash" -  The private hash for the username.
  -> SpoonacularRequest AddToMealPlan contentType A.Value MimeJSON
addToMealPlan _ inlineObject4 (Username username) (Hash hash) =
  _mkRequest "POST" ["/mealplanner/",toPath username,"/items"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)
    `setBodyParam` inlineObject4
    `setQuery` toQuery ("hash", Just hash)

data AddToMealPlan 
instance HasBodyParam AddToMealPlan InlineObject4 

-- | @@
instance Consumes AddToMealPlan 
-- | @application/json@
instance Consumes AddToMealPlan MimeJSON

-- | @application/json@
instance Produces AddToMealPlan MimeJSON


-- *** addToShoppingList

-- | @POST \/mealplanner\/{username}\/shopping-list\/items@
-- 
-- Add to Shopping List
-- 
-- Add an item to the current shopping list of a user.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
addToShoppingList 
  :: (Consumes AddToShoppingList contentType, MimeRender contentType InlineObject9)
  => ContentType contentType -- ^ request content-type ('MimeType')
  -> InlineObject9 -- ^ "inlineObject9"
  -> Username -- ^ "username" -  The username.
  -> Hash -- ^ "hash" -  The private hash for the username.
  -> SpoonacularRequest AddToShoppingList contentType InlineResponse20042 MimeJSON
addToShoppingList _ inlineObject9 (Username username) (Hash hash) =
  _mkRequest "POST" ["/mealplanner/",toPath username,"/shopping-list/items"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)
    `setBodyParam` inlineObject9
    `setQuery` toQuery ("hash", Just hash)

data AddToShoppingList 
instance HasBodyParam AddToShoppingList InlineObject9 

-- | @@
instance Consumes AddToShoppingList 
-- | @application/json@
instance Consumes AddToShoppingList MimeJSON

-- | @application/json@
instance Produces AddToShoppingList MimeJSON


-- *** clearMealPlanDay

-- | @DELETE \/mealplanner\/{username}\/day\/{date}@
-- 
-- Clear Meal Plan Day
-- 
-- Delete all planned items from the user's meal plan for a specific day.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
clearMealPlanDay 
  :: (Consumes ClearMealPlanDay , MimeRender  InlineObject3)
  => InlineObject3 -- ^ "inlineObject3"
  -> Username -- ^ "username" -  The username.
  -> ParamDate -- ^ "date" -  The date in the format yyyy-mm-dd.
  -> Hash -- ^ "hash" -  The private hash for the username.
  -> SpoonacularRequest ClearMealPlanDay  A.Value MimeJSON
clearMealPlanDay inlineObject3 (Username username) (ParamDate date) (Hash hash) =
  _mkRequest "DELETE" ["/mealplanner/",toPath username,"/day/",toPath date]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)
    `setBodyParam` inlineObject3
    `setQuery` toQuery ("hash", Just hash)

data ClearMealPlanDay 
instance HasBodyParam ClearMealPlanDay InlineObject3 

-- | @@
instance Consumes ClearMealPlanDay 

-- | @application/json@
instance Produces ClearMealPlanDay MimeJSON


-- *** connectUser

-- | @POST \/users\/connect@
-- 
-- Connect User
-- 
-- In order to call user-specific endpoints, you need to connect your app's users to spoonacular users.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
connectUser 
  :: (Consumes ConnectUser contentType, MimeRender contentType Body)
  => ContentType contentType -- ^ request content-type ('MimeType')
  -> Body -- ^ "body"
  -> SpoonacularRequest ConnectUser contentType InlineResponse20043 MimeJSON
connectUser _ body =
  _mkRequest "POST" ["/users/connect"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)
    `setBodyParam` body

data ConnectUser 
instance HasBodyParam ConnectUser Body 

-- | @@
instance Consumes ConnectUser 
-- | @application/json@
instance Consumes ConnectUser MimeJSON

-- | @application/json@
instance Produces ConnectUser MimeJSON


-- *** deleteFromMealPlan

-- | @DELETE \/mealplanner\/{username}\/items\/{id}@
-- 
-- Delete from Meal Plan
-- 
-- Delete an item from the user's meal plan.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
deleteFromMealPlan 
  :: (Consumes DeleteFromMealPlan , MimeRender  InlineObject5)
  => InlineObject5 -- ^ "inlineObject5"
  -> Username -- ^ "username" -  The username.
  -> IdDouble -- ^ "id" -  The shopping list item id.
  -> Hash -- ^ "hash" -  The private hash for the username.
  -> SpoonacularRequest DeleteFromMealPlan  A.Value MimeJSON
deleteFromMealPlan inlineObject5 (Username username) (IdDouble id) (Hash hash) =
  _mkRequest "DELETE" ["/mealplanner/",toPath username,"/items/",toPath id]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)
    `setBodyParam` inlineObject5
    `setQuery` toQuery ("hash", Just hash)

data DeleteFromMealPlan 
instance HasBodyParam DeleteFromMealPlan InlineObject5 

-- | @@
instance Consumes DeleteFromMealPlan 

-- | @application/json@
instance Produces DeleteFromMealPlan MimeJSON


-- *** deleteFromShoppingList

-- | @DELETE \/mealplanner\/{username}\/shopping-list\/items\/{id}@
-- 
-- Delete from Shopping List
-- 
-- Delete an item from the current shopping list of the user.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
deleteFromShoppingList 
  :: (Consumes DeleteFromShoppingList , MimeRender  InlineObject10)
  => InlineObject10 -- ^ "inlineObject10"
  -> Username -- ^ "username" -  The username.
  -> Id -- ^ "id" -  The item's id.
  -> Hash -- ^ "hash" -  The private hash for the username.
  -> SpoonacularRequest DeleteFromShoppingList  A.Value MimeJSON
deleteFromShoppingList inlineObject10 (Username username) (Id id) (Hash hash) =
  _mkRequest "DELETE" ["/mealplanner/",toPath username,"/shopping-list/items/",toPath id]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)
    `setBodyParam` inlineObject10
    `setQuery` toQuery ("hash", Just hash)

data DeleteFromShoppingList 
instance HasBodyParam DeleteFromShoppingList InlineObject10 

-- | @@
instance Consumes DeleteFromShoppingList 

-- | @application/json@
instance Produces DeleteFromShoppingList MimeJSON


-- *** deleteMealPlanTemplate

-- | @DELETE \/mealplanner\/{username}\/templates\/{id}@
-- 
-- Delete Meal Plan Template
-- 
-- Delete a meal plan template for a user.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
deleteMealPlanTemplate 
  :: (Consumes DeleteMealPlanTemplate , MimeRender  InlineObject7)
  => InlineObject7 -- ^ "inlineObject7"
  -> Username -- ^ "username" -  The username.
  -> Id -- ^ "id" -  The item's id.
  -> Hash -- ^ "hash" -  The private hash for the username.
  -> SpoonacularRequest DeleteMealPlanTemplate  A.Value MimeJSON
deleteMealPlanTemplate inlineObject7 (Username username) (Id id) (Hash hash) =
  _mkRequest "DELETE" ["/mealplanner/",toPath username,"/templates/",toPath id]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)
    `setBodyParam` inlineObject7
    `setQuery` toQuery ("hash", Just hash)

data DeleteMealPlanTemplate 
instance HasBodyParam DeleteMealPlanTemplate InlineObject7 

-- | @@
instance Consumes DeleteMealPlanTemplate 

-- | @application/json@
instance Produces DeleteMealPlanTemplate MimeJSON


-- *** generateMealPlan

-- | @GET \/mealplanner\/generate@
-- 
-- Generate Meal Plan
-- 
-- Generate a meal plan with three meals per day (breakfast, lunch, and dinner).
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
generateMealPlan 
  :: SpoonacularRequest GenerateMealPlan MimeNoContent InlineResponse20037 MimeJSON
generateMealPlan =
  _mkRequest "GET" ["/mealplanner/generate"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)

data GenerateMealPlan  

-- | /Optional Param/ "timeFrame" - Either for one \"day\" or an entire \"week\".
instance HasOptionalParam GenerateMealPlan TimeFrame where
  applyOptionalParam req (TimeFrame xs) =
    req `setQuery` toQuery ("timeFrame", Just xs)

-- | /Optional Param/ "targetCalories" - What is the caloric target for one day? The meal plan generator will try to get as close as possible to that goal.
instance HasOptionalParam GenerateMealPlan TargetCalories where
  applyOptionalParam req (TargetCalories xs) =
    req `setQuery` toQuery ("targetCalories", Just xs)

-- | /Optional Param/ "diet" - Enter a diet that the meal plan has to adhere to. See a full list of supported diets.
instance HasOptionalParam GenerateMealPlan Diet where
  applyOptionalParam req (Diet xs) =
    req `setQuery` toQuery ("diet", Just xs)

-- | /Optional Param/ "exclude" - A comma-separated list of allergens or ingredients that must be excluded.
instance HasOptionalParam GenerateMealPlan Exclude where
  applyOptionalParam req (Exclude xs) =
    req `setQuery` toQuery ("exclude", Just xs)
-- | @application/json@
instance Produces GenerateMealPlan MimeJSON


-- *** generateShoppingList

-- | @POST \/mealplanner\/{username}\/shopping-list\/{start-date}\/{end-date}@
-- 
-- Generate Shopping List
-- 
-- Generate the shopping list for a user from the meal planner in a given time frame.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
generateShoppingList 
  :: (Consumes GenerateShoppingList , MimeRender  InlineObject8)
  => InlineObject8 -- ^ "inlineObject8"
  -> Username -- ^ "username" -  The username.
  -> StartDate -- ^ "startDate" -  The start date in the format yyyy-mm-dd.
  -> EndDate -- ^ "endDate" -  The end date in the format yyyy-mm-dd.
  -> Hash -- ^ "hash" -  The private hash for the username.
  -> SpoonacularRequest GenerateShoppingList  InlineResponse20042 MimeJSON
generateShoppingList inlineObject8 (Username username) (StartDate startDate) (EndDate endDate) (Hash hash) =
  _mkRequest "POST" ["/mealplanner/",toPath username,"/shopping-list/",toPath startDate,"/",toPath endDate]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)
    `setBodyParam` inlineObject8
    `setQuery` toQuery ("hash", Just hash)

data GenerateShoppingList 
instance HasBodyParam GenerateShoppingList InlineObject8 

-- | @@
instance Consumes GenerateShoppingList 

-- | @application/json@
instance Produces GenerateShoppingList MimeJSON


-- *** getMealPlanTemplate

-- | @GET \/mealplanner\/{username}\/templates\/{id}@
-- 
-- Get Meal Plan Template
-- 
-- Get information about a meal plan template.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
getMealPlanTemplate 
  :: Username -- ^ "username" -  The username.
  -> Id -- ^ "id" -  The item's id.
  -> Hash -- ^ "hash" -  The private hash for the username.
  -> SpoonacularRequest GetMealPlanTemplate MimeNoContent InlineResponse20041 MimeJSON
getMealPlanTemplate (Username username) (Id id) (Hash hash) =
  _mkRequest "GET" ["/mealplanner/",toPath username,"/templates/",toPath id]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)
    `setQuery` toQuery ("hash", Just hash)

data GetMealPlanTemplate  
-- | @application/json@
instance Produces GetMealPlanTemplate MimeJSON


-- *** getMealPlanTemplates

-- | @GET \/mealplanner\/{username}\/templates@
-- 
-- Get Meal Plan Templates
-- 
-- Get meal plan templates from user or public ones.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
getMealPlanTemplates 
  :: Username -- ^ "username" -  The username.
  -> Hash -- ^ "hash" -  The private hash for the username.
  -> SpoonacularRequest GetMealPlanTemplates MimeNoContent InlineResponse20039 MimeJSON
getMealPlanTemplates (Username username) (Hash hash) =
  _mkRequest "GET" ["/mealplanner/",toPath username,"/templates"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)
    `setQuery` toQuery ("hash", Just hash)

data GetMealPlanTemplates  
-- | @application/json@
instance Produces GetMealPlanTemplates MimeJSON


-- *** getMealPlanWeek

-- | @GET \/mealplanner\/{username}\/week\/{start-date}@
-- 
-- Get Meal Plan Week
-- 
-- Retrieve a meal planned week for the given user. The username must be a spoonacular user and the hash must the the user's hash that can be found in his/her account.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
getMealPlanWeek 
  :: Username -- ^ "username" -  The username.
  -> StartDate -- ^ "startDate" -  The start date of the meal planned week in the format yyyy-mm-dd.
  -> Hash -- ^ "hash" -  The private hash for the username.
  -> SpoonacularRequest GetMealPlanWeek MimeNoContent InlineResponse20038 MimeJSON
getMealPlanWeek (Username username) (StartDate startDate) (Hash hash) =
  _mkRequest "GET" ["/mealplanner/",toPath username,"/week/",toPath startDate]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)
    `setQuery` toQuery ("hash", Just hash)

data GetMealPlanWeek  
-- | @application/json@
instance Produces GetMealPlanWeek MimeJSON


-- *** getShoppingList

-- | @GET \/mealplanner\/{username}\/shopping-list@
-- 
-- Get Shopping List
-- 
-- Get the current shopping list for the given user.
-- 
-- AuthMethod: 'AuthApiKeyApiKeyScheme'
-- 
getShoppingList 
  :: Username -- ^ "username" -  The username.
  -> Hash -- ^ "hash" -  The private hash for the username.
  -> SpoonacularRequest GetShoppingList MimeNoContent InlineResponse20042 MimeJSON
getShoppingList (Username username) (Hash hash) =
  _mkRequest "GET" ["/mealplanner/",toPath username,"/shopping-list"]
    `_hasAuthType` (P.Proxy :: P.Proxy AuthApiKeyApiKeyScheme)
    `setQuery` toQuery ("hash", Just hash)

data GetShoppingList  
-- | @application/json@
instance Produces GetShoppingList MimeJSON

