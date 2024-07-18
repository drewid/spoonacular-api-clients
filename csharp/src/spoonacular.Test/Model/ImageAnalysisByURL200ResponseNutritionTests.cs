/*
 * spoonacular API
 *
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 2.0.1
 * Contact: mail@spoonacular.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using Xunit;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using spoonacular.Model;
using spoonacular.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace spoonacular.Test.Model
{
    /// <summary>
    ///  Class for testing ImageAnalysisByURL200ResponseNutrition
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the model.
    /// </remarks>
    public class ImageAnalysisByURL200ResponseNutritionTests : IDisposable
    {
        // TODO uncomment below to declare an instance variable for ImageAnalysisByURL200ResponseNutrition
        //private ImageAnalysisByURL200ResponseNutrition instance;

        public ImageAnalysisByURL200ResponseNutritionTests()
        {
            // TODO uncomment below to create an instance of ImageAnalysisByURL200ResponseNutrition
            //instance = new ImageAnalysisByURL200ResponseNutrition();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of ImageAnalysisByURL200ResponseNutrition
        /// </summary>
        [Fact]
        public void ImageAnalysisByURL200ResponseNutritionInstanceTest()
        {
            // TODO uncomment below to test "IsType" ImageAnalysisByURL200ResponseNutrition
            //Assert.IsType<ImageAnalysisByURL200ResponseNutrition>(instance);
        }

        /// <summary>
        /// Test the property 'RecipesUsed'
        /// </summary>
        [Fact]
        public void RecipesUsedTest()
        {
            // TODO unit test for the property 'RecipesUsed'
        }

        /// <summary>
        /// Test the property 'Calories'
        /// </summary>
        [Fact]
        public void CaloriesTest()
        {
            // TODO unit test for the property 'Calories'
        }

        /// <summary>
        /// Test the property 'Fat'
        /// </summary>
        [Fact]
        public void FatTest()
        {
            // TODO unit test for the property 'Fat'
        }

        /// <summary>
        /// Test the property 'Protein'
        /// </summary>
        [Fact]
        public void ProteinTest()
        {
            // TODO unit test for the property 'Protein'
        }

        /// <summary>
        /// Test the property 'Carbs'
        /// </summary>
        [Fact]
        public void CarbsTest()
        {
            // TODO unit test for the property 'Carbs'
        }
    }
}
