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
    /// AddMealPlanTemplate200ResponseItemsInner
    /// </summary>
    [DataContract(Name = "addMealPlanTemplate_200_response_items_inner")]
    public partial class AddMealPlanTemplate200ResponseItemsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AddMealPlanTemplate200ResponseItemsInner" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected AddMealPlanTemplate200ResponseItemsInner() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="AddMealPlanTemplate200ResponseItemsInner" /> class.
        /// </summary>
        /// <param name="day">day (required).</param>
        /// <param name="slot">slot (required).</param>
        /// <param name="position">position (required).</param>
        /// <param name="type">type (required).</param>
        /// <param name="value">value.</param>
        public AddMealPlanTemplate200ResponseItemsInner(int day = default(int), int slot = default(int), int position = default(int), string type = default(string), AddMealPlanTemplate200ResponseItemsInnerValue value = default(AddMealPlanTemplate200ResponseItemsInnerValue))
        {
            this.Day = day;
            this.Slot = slot;
            this.Position = position;
            // to ensure "type" is required (not null)
            if (type == null)
            {
                throw new ArgumentNullException("type is a required property for AddMealPlanTemplate200ResponseItemsInner and cannot be null");
            }
            this.Type = type;
            this.Value = value;
        }

        /// <summary>
        /// Gets or Sets Day
        /// </summary>
        [DataMember(Name = "day", IsRequired = true, EmitDefaultValue = true)]
        public int Day { get; set; }

        /// <summary>
        /// Gets or Sets Slot
        /// </summary>
        [DataMember(Name = "slot", IsRequired = true, EmitDefaultValue = true)]
        public int Slot { get; set; }

        /// <summary>
        /// Gets or Sets Position
        /// </summary>
        [DataMember(Name = "position", IsRequired = true, EmitDefaultValue = true)]
        public int Position { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets Value
        /// </summary>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public AddMealPlanTemplate200ResponseItemsInnerValue Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class AddMealPlanTemplate200ResponseItemsInner {\n");
            sb.Append("  Day: ").Append(Day).Append("\n");
            sb.Append("  Slot: ").Append(Slot).Append("\n");
            sb.Append("  Position: ").Append(Position).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
            // Type (string) minLength
            if (this.Type != null && this.Type.Length < 1)
            {
                yield return new ValidationResult("Invalid value for Type, length must be greater than 1.", new [] { "Type" });
            }

            yield break;
        }
    }

}
