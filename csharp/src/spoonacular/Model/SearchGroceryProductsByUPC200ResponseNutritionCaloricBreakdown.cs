/*
 * spoonacular API
 *
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.1
 * Contact: mail@spoonacular.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = spoonacular.Client.OpenAPIDateConverter;

namespace spoonacular.Model
{
    /// <summary>
    /// SearchGroceryProductsByUPC200ResponseNutritionCaloricBreakdown
    /// </summary>
    [DataContract(Name = "searchGroceryProductsByUPC_200_response_nutrition_caloricBreakdown")]
    public partial class SearchGroceryProductsByUPC200ResponseNutritionCaloricBreakdown : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SearchGroceryProductsByUPC200ResponseNutritionCaloricBreakdown" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected SearchGroceryProductsByUPC200ResponseNutritionCaloricBreakdown() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="SearchGroceryProductsByUPC200ResponseNutritionCaloricBreakdown" /> class.
        /// </summary>
        /// <param name="percentProtein">percentProtein (required).</param>
        /// <param name="percentFat">percentFat (required).</param>
        /// <param name="percentCarbs">percentCarbs (required).</param>
        public SearchGroceryProductsByUPC200ResponseNutritionCaloricBreakdown(decimal percentProtein = default(decimal), decimal percentFat = default(decimal), decimal percentCarbs = default(decimal))
        {
            this.PercentProtein = percentProtein;
            this.PercentFat = percentFat;
            this.PercentCarbs = percentCarbs;
        }

        /// <summary>
        /// Gets or Sets PercentProtein
        /// </summary>
        [DataMember(Name = "percentProtein", IsRequired = true, EmitDefaultValue = true)]
        public decimal PercentProtein { get; set; }

        /// <summary>
        /// Gets or Sets PercentFat
        /// </summary>
        [DataMember(Name = "percentFat", IsRequired = true, EmitDefaultValue = true)]
        public decimal PercentFat { get; set; }

        /// <summary>
        /// Gets or Sets PercentCarbs
        /// </summary>
        [DataMember(Name = "percentCarbs", IsRequired = true, EmitDefaultValue = true)]
        public decimal PercentCarbs { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SearchGroceryProductsByUPC200ResponseNutritionCaloricBreakdown {\n");
            sb.Append("  PercentProtein: ").Append(PercentProtein).Append("\n");
            sb.Append("  PercentFat: ").Append(PercentFat).Append("\n");
            sb.Append("  PercentCarbs: ").Append(PercentCarbs).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
