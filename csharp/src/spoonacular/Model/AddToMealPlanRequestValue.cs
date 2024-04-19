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
    /// AddToMealPlanRequestValue
    /// </summary>
    [DataContract(Name = "addToMealPlan_request_value")]
    public partial class AddToMealPlanRequestValue : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AddToMealPlanRequestValue" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected AddToMealPlanRequestValue() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="AddToMealPlanRequestValue" /> class.
        /// </summary>
        /// <param name="ingredients">ingredients (required).</param>
        public AddToMealPlanRequestValue(List<AddToMealPlanRequestValueIngredientsInner> ingredients = default(List<AddToMealPlanRequestValueIngredientsInner>))
        {
            // to ensure "ingredients" is required (not null)
            if (ingredients == null)
            {
                throw new ArgumentNullException("ingredients is a required property for AddToMealPlanRequestValue and cannot be null");
            }
            this.Ingredients = ingredients;
        }

        /// <summary>
        /// Gets or Sets Ingredients
        /// </summary>
        [DataMember(Name = "ingredients", IsRequired = true, EmitDefaultValue = true)]
        public List<AddToMealPlanRequestValueIngredientsInner> Ingredients { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class AddToMealPlanRequestValue {\n");
            sb.Append("  Ingredients: ").Append(Ingredients).Append("\n");
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
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}