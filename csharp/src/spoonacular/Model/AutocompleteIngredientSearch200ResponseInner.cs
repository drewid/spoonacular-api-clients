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
    /// AutocompleteIngredientSearch200ResponseInner
    /// </summary>
    [DataContract(Name = "autocompleteIngredientSearch_200_response_inner")]
    public partial class AutocompleteIngredientSearch200ResponseInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AutocompleteIngredientSearch200ResponseInner" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected AutocompleteIngredientSearch200ResponseInner() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="AutocompleteIngredientSearch200ResponseInner" /> class.
        /// </summary>
        /// <param name="name">name (required).</param>
        /// <param name="image">image (required).</param>
        /// <param name="id">id.</param>
        /// <param name="aisle">aisle.</param>
        /// <param name="possibleUnits">possibleUnits.</param>
        public AutocompleteIngredientSearch200ResponseInner(string name = default(string), string image = default(string), int id = default(int), string aisle = default(string), List<string> possibleUnits = default(List<string>))
        {
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for AutocompleteIngredientSearch200ResponseInner and cannot be null");
            }
            this.Name = name;
            // to ensure "image" is required (not null)
            if (image == null)
            {
                throw new ArgumentNullException("image is a required property for AutocompleteIngredientSearch200ResponseInner and cannot be null");
            }
            this.Image = image;
            this.Id = id;
            this.Aisle = aisle;
            this.PossibleUnits = possibleUnits;
        }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Image
        /// </summary>
        [DataMember(Name = "image", IsRequired = true, EmitDefaultValue = true)]
        public string Image { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// Gets or Sets Aisle
        /// </summary>
        [DataMember(Name = "aisle", EmitDefaultValue = false)]
        public string Aisle { get; set; }

        /// <summary>
        /// Gets or Sets PossibleUnits
        /// </summary>
        [DataMember(Name = "possibleUnits", EmitDefaultValue = false)]
        public List<string> PossibleUnits { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class AutocompleteIngredientSearch200ResponseInner {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Image: ").Append(Image).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Aisle: ").Append(Aisle).Append("\n");
            sb.Append("  PossibleUnits: ").Append(PossibleUnits).Append("\n");
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

            // Image (string) minLength
            if (this.Image != null && this.Image.Length < 1)
            {
                yield return new ValidationResult("Invalid value for Image, length must be greater than 1.", new [] { "Image" });
            }

            // Aisle (string) minLength
            if (this.Aisle != null && this.Aisle.Length < 1)
            {
                yield return new ValidationResult("Invalid value for Aisle, length must be greater than 1.", new [] { "Aisle" });
            }

            yield break;
        }
    }

}
