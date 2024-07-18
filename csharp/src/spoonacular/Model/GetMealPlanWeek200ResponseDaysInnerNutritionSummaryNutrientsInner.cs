/*
 * spoonacular API
 *
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 2.0.1
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
    /// GetMealPlanWeek200ResponseDaysInnerNutritionSummaryNutrientsInner
    /// </summary>
    [DataContract(Name = "getMealPlanWeek_200_response_days_inner_nutritionSummary_nutrients_inner")]
    public partial class GetMealPlanWeek200ResponseDaysInnerNutritionSummaryNutrientsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetMealPlanWeek200ResponseDaysInnerNutritionSummaryNutrientsInner" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected GetMealPlanWeek200ResponseDaysInnerNutritionSummaryNutrientsInner() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="GetMealPlanWeek200ResponseDaysInnerNutritionSummaryNutrientsInner" /> class.
        /// </summary>
        /// <param name="name">name (required).</param>
        /// <param name="amount">amount (required).</param>
        /// <param name="unit">unit (required).</param>
        /// <param name="percentDailyNeeds">percentDailyNeeds (required).</param>
        public GetMealPlanWeek200ResponseDaysInnerNutritionSummaryNutrientsInner(string name = default(string), decimal amount = default(decimal), string unit = default(string), decimal percentDailyNeeds = default(decimal))
        {
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for GetMealPlanWeek200ResponseDaysInnerNutritionSummaryNutrientsInner and cannot be null");
            }
            this.Name = name;
            this.Amount = amount;
            // to ensure "unit" is required (not null)
            if (unit == null)
            {
                throw new ArgumentNullException("unit is a required property for GetMealPlanWeek200ResponseDaysInnerNutritionSummaryNutrientsInner and cannot be null");
            }
            this.Unit = unit;
            this.PercentDailyNeeds = percentDailyNeeds;
        }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Amount
        /// </summary>
        [DataMember(Name = "amount", IsRequired = true, EmitDefaultValue = true)]
        public decimal Amount { get; set; }

        /// <summary>
        /// Gets or Sets Unit
        /// </summary>
        [DataMember(Name = "unit", IsRequired = true, EmitDefaultValue = true)]
        public string Unit { get; set; }

        /// <summary>
        /// Gets or Sets PercentDailyNeeds
        /// </summary>
        [DataMember(Name = "percentDailyNeeds", IsRequired = true, EmitDefaultValue = true)]
        public decimal PercentDailyNeeds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GetMealPlanWeek200ResponseDaysInnerNutritionSummaryNutrientsInner {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
            sb.Append("  Unit: ").Append(Unit).Append("\n");
            sb.Append("  PercentDailyNeeds: ").Append(PercentDailyNeeds).Append("\n");
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
            // Name (string) minLength
            if (this.Name != null && this.Name.Length < 1)
            {
                yield return new ValidationResult("Invalid value for Name, length must be greater than 1.", new [] { "Name" });
            }

            // Unit (string) minLength
            if (this.Unit != null && this.Unit.Length < 1)
            {
                yield return new ValidationResult("Invalid value for Unit, length must be greater than 1.", new [] { "Unit" });
            }

            yield break;
        }
    }

}
