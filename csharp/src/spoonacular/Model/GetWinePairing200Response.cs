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
    /// GetWinePairing200Response
    /// </summary>
    [DataContract(Name = "getWinePairing_200_response")]
    public partial class GetWinePairing200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetWinePairing200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected GetWinePairing200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="GetWinePairing200Response" /> class.
        /// </summary>
        /// <param name="pairedWines">pairedWines (required).</param>
        /// <param name="pairingText">pairingText (required).</param>
        /// <param name="productMatches">productMatches (required).</param>
        public GetWinePairing200Response(List<string> pairedWines = default(List<string>), string pairingText = default(string), List<GetWinePairing200ResponseProductMatchesInner> productMatches = default(List<GetWinePairing200ResponseProductMatchesInner>))
        {
            // to ensure "pairedWines" is required (not null)
            if (pairedWines == null)
            {
                throw new ArgumentNullException("pairedWines is a required property for GetWinePairing200Response and cannot be null");
            }
            this.PairedWines = pairedWines;
            // to ensure "pairingText" is required (not null)
            if (pairingText == null)
            {
                throw new ArgumentNullException("pairingText is a required property for GetWinePairing200Response and cannot be null");
            }
            this.PairingText = pairingText;
            // to ensure "productMatches" is required (not null)
            if (productMatches == null)
            {
                throw new ArgumentNullException("productMatches is a required property for GetWinePairing200Response and cannot be null");
            }
            this.ProductMatches = productMatches;
        }

        /// <summary>
        /// Gets or Sets PairedWines
        /// </summary>
        [DataMember(Name = "pairedWines", IsRequired = true, EmitDefaultValue = true)]
        public List<string> PairedWines { get; set; }

        /// <summary>
        /// Gets or Sets PairingText
        /// </summary>
        [DataMember(Name = "pairingText", IsRequired = true, EmitDefaultValue = true)]
        public string PairingText { get; set; }

        /// <summary>
        /// Gets or Sets ProductMatches
        /// </summary>
        [DataMember(Name = "productMatches", IsRequired = true, EmitDefaultValue = true)]
        public List<GetWinePairing200ResponseProductMatchesInner> ProductMatches { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GetWinePairing200Response {\n");
            sb.Append("  PairedWines: ").Append(PairedWines).Append("\n");
            sb.Append("  PairingText: ").Append(PairingText).Append("\n");
            sb.Append("  ProductMatches: ").Append(ProductMatches).Append("\n");
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
            // PairingText (string) minLength
            if (this.PairingText != null && this.PairingText.Length < 1)
            {
                yield return new ValidationResult("Invalid value for PairingText, length must be greater than 1.", new [] { "PairingText" });
            }

            yield break;
        }
    }

}
