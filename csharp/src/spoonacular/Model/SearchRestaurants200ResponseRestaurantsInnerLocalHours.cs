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
    /// SearchRestaurants200ResponseRestaurantsInnerLocalHours
    /// </summary>
    [DataContract(Name = "searchRestaurants_200_response_restaurants_inner_local_hours")]
    public partial class SearchRestaurants200ResponseRestaurantsInnerLocalHours : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SearchRestaurants200ResponseRestaurantsInnerLocalHours" /> class.
        /// </summary>
        /// <param name="operational">operational.</param>
        /// <param name="delivery">delivery.</param>
        /// <param name="pickup">pickup.</param>
        /// <param name="dineIn">dineIn.</param>
        public SearchRestaurants200ResponseRestaurantsInnerLocalHours(SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational operational = default(SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational), SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational delivery = default(SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational), SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational pickup = default(SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational), SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational dineIn = default(SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational))
        {
            this.Operational = operational;
            this.Delivery = delivery;
            this.Pickup = pickup;
            this.DineIn = dineIn;
        }

        /// <summary>
        /// Gets or Sets Operational
        /// </summary>
        [DataMember(Name = "operational", EmitDefaultValue = false)]
        public SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational Operational { get; set; }

        /// <summary>
        /// Gets or Sets Delivery
        /// </summary>
        [DataMember(Name = "delivery", EmitDefaultValue = false)]
        public SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational Delivery { get; set; }

        /// <summary>
        /// Gets or Sets Pickup
        /// </summary>
        [DataMember(Name = "pickup", EmitDefaultValue = false)]
        public SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational Pickup { get; set; }

        /// <summary>
        /// Gets or Sets DineIn
        /// </summary>
        [DataMember(Name = "dine_in", EmitDefaultValue = false)]
        public SearchRestaurants200ResponseRestaurantsInnerLocalHoursOperational DineIn { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SearchRestaurants200ResponseRestaurantsInnerLocalHours {\n");
            sb.Append("  Operational: ").Append(Operational).Append("\n");
            sb.Append("  Delivery: ").Append(Delivery).Append("\n");
            sb.Append("  Pickup: ").Append(Pickup).Append("\n");
            sb.Append("  DineIn: ").Append(DineIn).Append("\n");
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
