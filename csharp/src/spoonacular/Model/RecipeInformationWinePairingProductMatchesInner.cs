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
    /// RecipeInformationWinePairingProductMatchesInner
    /// </summary>
    [DataContract(Name = "RecipeInformation_winePairing_productMatches_inner")]
    public partial class RecipeInformationWinePairingProductMatchesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RecipeInformationWinePairingProductMatchesInner" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RecipeInformationWinePairingProductMatchesInner() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RecipeInformationWinePairingProductMatchesInner" /> class.
        /// </summary>
        /// <param name="id">id (required).</param>
        /// <param name="title">title (required).</param>
        /// <param name="description">description (required).</param>
        /// <param name="price">price (required).</param>
        /// <param name="imageUrl">imageUrl (required).</param>
        /// <param name="averageRating">averageRating (required).</param>
        /// <param name="ratingCount">ratingCount (required).</param>
        /// <param name="score">score (required).</param>
        /// <param name="link">link (required).</param>
        public RecipeInformationWinePairingProductMatchesInner(int id = default(int), string title = default(string), string description = default(string), string price = default(string), string imageUrl = default(string), decimal averageRating = default(decimal), int ratingCount = default(int), decimal score = default(decimal), string link = default(string))
        {
            this.Id = id;
            // to ensure "title" is required (not null)
            if (title == null)
            {
                throw new ArgumentNullException("title is a required property for RecipeInformationWinePairingProductMatchesInner and cannot be null");
            }
            this.Title = title;
            // to ensure "description" is required (not null)
            if (description == null)
            {
                throw new ArgumentNullException("description is a required property for RecipeInformationWinePairingProductMatchesInner and cannot be null");
            }
            this.Description = description;
            // to ensure "price" is required (not null)
            if (price == null)
            {
                throw new ArgumentNullException("price is a required property for RecipeInformationWinePairingProductMatchesInner and cannot be null");
            }
            this.Price = price;
            // to ensure "imageUrl" is required (not null)
            if (imageUrl == null)
            {
                throw new ArgumentNullException("imageUrl is a required property for RecipeInformationWinePairingProductMatchesInner and cannot be null");
            }
            this.ImageUrl = imageUrl;
            this.AverageRating = averageRating;
            this.RatingCount = ratingCount;
            this.Score = score;
            // to ensure "link" is required (not null)
            if (link == null)
            {
                throw new ArgumentNullException("link is a required property for RecipeInformationWinePairingProductMatchesInner and cannot be null");
            }
            this.Link = link;
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public int Id { get; set; }

        /// <summary>
        /// Gets or Sets Title
        /// </summary>
        [DataMember(Name = "title", IsRequired = true, EmitDefaultValue = true)]
        public string Title { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        [DataMember(Name = "description", IsRequired = true, EmitDefaultValue = true)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets Price
        /// </summary>
        [DataMember(Name = "price", IsRequired = true, EmitDefaultValue = true)]
        public string Price { get; set; }

        /// <summary>
        /// Gets or Sets ImageUrl
        /// </summary>
        [DataMember(Name = "imageUrl", IsRequired = true, EmitDefaultValue = true)]
        public string ImageUrl { get; set; }

        /// <summary>
        /// Gets or Sets AverageRating
        /// </summary>
        [DataMember(Name = "averageRating", IsRequired = true, EmitDefaultValue = true)]
        public decimal AverageRating { get; set; }

        /// <summary>
        /// Gets or Sets RatingCount
        /// </summary>
        [DataMember(Name = "ratingCount", IsRequired = true, EmitDefaultValue = true)]
        public int RatingCount { get; set; }

        /// <summary>
        /// Gets or Sets Score
        /// </summary>
        [DataMember(Name = "score", IsRequired = true, EmitDefaultValue = true)]
        public decimal Score { get; set; }

        /// <summary>
        /// Gets or Sets Link
        /// </summary>
        [DataMember(Name = "link", IsRequired = true, EmitDefaultValue = true)]
        public string Link { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RecipeInformationWinePairingProductMatchesInner {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  ImageUrl: ").Append(ImageUrl).Append("\n");
            sb.Append("  AverageRating: ").Append(AverageRating).Append("\n");
            sb.Append("  RatingCount: ").Append(RatingCount).Append("\n");
            sb.Append("  Score: ").Append(Score).Append("\n");
            sb.Append("  Link: ").Append(Link).Append("\n");
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
            // Title (string) minLength
            if (this.Title != null && this.Title.Length < 1)
            {
                yield return new ValidationResult("Invalid value for Title, length must be greater than 1.", new [] { "Title" });
            }

            // Description (string) minLength
            if (this.Description != null && this.Description.Length < 1)
            {
                yield return new ValidationResult("Invalid value for Description, length must be greater than 1.", new [] { "Description" });
            }

            // Price (string) minLength
            if (this.Price != null && this.Price.Length < 1)
            {
                yield return new ValidationResult("Invalid value for Price, length must be greater than 1.", new [] { "Price" });
            }

            // ImageUrl (string) minLength
            if (this.ImageUrl != null && this.ImageUrl.Length < 1)
            {
                yield return new ValidationResult("Invalid value for ImageUrl, length must be greater than 1.", new [] { "ImageUrl" });
            }

            // Link (string) minLength
            if (this.Link != null && this.Link.Length < 1)
            {
                yield return new ValidationResult("Invalid value for Link, length must be greater than 1.", new [] { "Link" });
            }

            yield break;
        }
    }

}
