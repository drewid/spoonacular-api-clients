<?php
/**
 * GetProductInformation200Response
 *
 * PHP version 7.4
 *
 * @category Class
 * @package  com.spoonacular.client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * spoonacular API
 *
 * The spoonacular Nutrition, Recipe, and Food API allows you to access over 380,000 recipes, thousands of ingredients, 800,000 food products, and 100,000 menu items. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.
 *
 * The version of the OpenAPI document: 1.1
 * Contact: mail@spoonacular.com
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 6.0.1
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace com.spoonacular.client\com.spoonacular.client.model;

use \ArrayAccess;
use \com.spoonacular.client\ObjectSerializer;

/**
 * GetProductInformation200Response Class Doc Comment
 *
 * @category Class
 * @description 
 * @package  com.spoonacular.client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class GetProductInformation200Response implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'getProductInformation_200_response';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'id' => 'int',
        'title' => 'string',
        'breadcrumbs' => 'string[]',
        'image_type' => 'string',
        'badges' => 'string[]',
        'important_badges' => 'string[]',
        'ingredient_count' => 'int',
        'generated_text' => 'mixed',
        'ingredient_list' => 'string',
        'ingredients' => '\com.spoonacular.client\com.spoonacular.client.model\GetProductInformation200ResponseIngredientsInner[]',
        'likes' => 'float',
        'aisle' => 'string',
        'nutrition' => '\com.spoonacular.client\com.spoonacular.client.model\SearchGroceryProductsByUPC200ResponseNutrition',
        'price' => 'float',
        'servings' => '\com.spoonacular.client\com.spoonacular.client.model\SearchGroceryProductsByUPC200ResponseServings',
        'spoonacular_score' => 'float'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'id' => null,
        'title' => null,
        'breadcrumbs' => null,
        'image_type' => null,
        'badges' => null,
        'important_badges' => null,
        'ingredient_count' => null,
        'generated_text' => null,
        'ingredient_list' => null,
        'ingredients' => null,
        'likes' => null,
        'aisle' => null,
        'nutrition' => null,
        'price' => null,
        'servings' => null,
        'spoonacular_score' => null
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'id' => 'id',
        'title' => 'title',
        'breadcrumbs' => 'breadcrumbs',
        'image_type' => 'imageType',
        'badges' => 'badges',
        'important_badges' => 'importantBadges',
        'ingredient_count' => 'ingredientCount',
        'generated_text' => 'generatedText',
        'ingredient_list' => 'ingredientList',
        'ingredients' => 'ingredients',
        'likes' => 'likes',
        'aisle' => 'aisle',
        'nutrition' => 'nutrition',
        'price' => 'price',
        'servings' => 'servings',
        'spoonacular_score' => 'spoonacularScore'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'id' => 'setId',
        'title' => 'setTitle',
        'breadcrumbs' => 'setBreadcrumbs',
        'image_type' => 'setImageType',
        'badges' => 'setBadges',
        'important_badges' => 'setImportantBadges',
        'ingredient_count' => 'setIngredientCount',
        'generated_text' => 'setGeneratedText',
        'ingredient_list' => 'setIngredientList',
        'ingredients' => 'setIngredients',
        'likes' => 'setLikes',
        'aisle' => 'setAisle',
        'nutrition' => 'setNutrition',
        'price' => 'setPrice',
        'servings' => 'setServings',
        'spoonacular_score' => 'setSpoonacularScore'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'id' => 'getId',
        'title' => 'getTitle',
        'breadcrumbs' => 'getBreadcrumbs',
        'image_type' => 'getImageType',
        'badges' => 'getBadges',
        'important_badges' => 'getImportantBadges',
        'ingredient_count' => 'getIngredientCount',
        'generated_text' => 'getGeneratedText',
        'ingredient_list' => 'getIngredientList',
        'ingredients' => 'getIngredients',
        'likes' => 'getLikes',
        'aisle' => 'getAisle',
        'nutrition' => 'getNutrition',
        'price' => 'getPrice',
        'servings' => 'getServings',
        'spoonacular_score' => 'getSpoonacularScore'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }


    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['id'] = $data['id'] ?? null;
        $this->container['title'] = $data['title'] ?? null;
        $this->container['breadcrumbs'] = $data['breadcrumbs'] ?? null;
        $this->container['image_type'] = $data['image_type'] ?? null;
        $this->container['badges'] = $data['badges'] ?? null;
        $this->container['important_badges'] = $data['important_badges'] ?? null;
        $this->container['ingredient_count'] = $data['ingredient_count'] ?? null;
        $this->container['generated_text'] = $data['generated_text'] ?? null;
        $this->container['ingredient_list'] = $data['ingredient_list'] ?? null;
        $this->container['ingredients'] = $data['ingredients'] ?? null;
        $this->container['likes'] = $data['likes'] ?? null;
        $this->container['aisle'] = $data['aisle'] ?? null;
        $this->container['nutrition'] = $data['nutrition'] ?? null;
        $this->container['price'] = $data['price'] ?? null;
        $this->container['servings'] = $data['servings'] ?? null;
        $this->container['spoonacular_score'] = $data['spoonacular_score'] ?? null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['id'] === null) {
            $invalidProperties[] = "'id' can't be null";
        }
        if ($this->container['title'] === null) {
            $invalidProperties[] = "'title' can't be null";
        }
        if ((mb_strlen($this->container['title']) < 1)) {
            $invalidProperties[] = "invalid value for 'title', the character length must be bigger than or equal to 1.";
        }

        if ($this->container['breadcrumbs'] === null) {
            $invalidProperties[] = "'breadcrumbs' can't be null";
        }
        if ($this->container['image_type'] === null) {
            $invalidProperties[] = "'image_type' can't be null";
        }
        if ((mb_strlen($this->container['image_type']) < 1)) {
            $invalidProperties[] = "invalid value for 'image_type', the character length must be bigger than or equal to 1.";
        }

        if ($this->container['badges'] === null) {
            $invalidProperties[] = "'badges' can't be null";
        }
        if ($this->container['important_badges'] === null) {
            $invalidProperties[] = "'important_badges' can't be null";
        }
        if ($this->container['ingredient_count'] === null) {
            $invalidProperties[] = "'ingredient_count' can't be null";
        }
        if ($this->container['ingredient_list'] === null) {
            $invalidProperties[] = "'ingredient_list' can't be null";
        }
        if ((mb_strlen($this->container['ingredient_list']) < 1)) {
            $invalidProperties[] = "invalid value for 'ingredient_list', the character length must be bigger than or equal to 1.";
        }

        if ($this->container['ingredients'] === null) {
            $invalidProperties[] = "'ingredients' can't be null";
        }
        if ((count($this->container['ingredients']) < 0)) {
            $invalidProperties[] = "invalid value for 'ingredients', number of items must be greater than or equal to 0.";
        }

        if ($this->container['likes'] === null) {
            $invalidProperties[] = "'likes' can't be null";
        }
        if ($this->container['aisle'] === null) {
            $invalidProperties[] = "'aisle' can't be null";
        }
        if ((mb_strlen($this->container['aisle']) < 1)) {
            $invalidProperties[] = "invalid value for 'aisle', the character length must be bigger than or equal to 1.";
        }

        if ($this->container['nutrition'] === null) {
            $invalidProperties[] = "'nutrition' can't be null";
        }
        if ($this->container['price'] === null) {
            $invalidProperties[] = "'price' can't be null";
        }
        if ($this->container['servings'] === null) {
            $invalidProperties[] = "'servings' can't be null";
        }
        if ($this->container['spoonacular_score'] === null) {
            $invalidProperties[] = "'spoonacular_score' can't be null";
        }
        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets id
     *
     * @return int
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param int $id id
     *
     * @return self
     */
    public function setId($id)
    {
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets title
     *
     * @return string
     */
    public function getTitle()
    {
        return $this->container['title'];
    }

    /**
     * Sets title
     *
     * @param string $title title
     *
     * @return self
     */
    public function setTitle($title)
    {

        if ((mb_strlen($title) < 1)) {
            throw new \InvalidArgumentException('invalid length for $title when calling GetProductInformation200Response., must be bigger than or equal to 1.');
        }

        $this->container['title'] = $title;

        return $this;
    }

    /**
     * Gets breadcrumbs
     *
     * @return string[]
     */
    public function getBreadcrumbs()
    {
        return $this->container['breadcrumbs'];
    }

    /**
     * Sets breadcrumbs
     *
     * @param string[] $breadcrumbs breadcrumbs
     *
     * @return self
     */
    public function setBreadcrumbs($breadcrumbs)
    {
        $this->container['breadcrumbs'] = $breadcrumbs;

        return $this;
    }

    /**
     * Gets image_type
     *
     * @return string
     */
    public function getImageType()
    {
        return $this->container['image_type'];
    }

    /**
     * Sets image_type
     *
     * @param string $image_type image_type
     *
     * @return self
     */
    public function setImageType($image_type)
    {

        if ((mb_strlen($image_type) < 1)) {
            throw new \InvalidArgumentException('invalid length for $image_type when calling GetProductInformation200Response., must be bigger than or equal to 1.');
        }

        $this->container['image_type'] = $image_type;

        return $this;
    }

    /**
     * Gets badges
     *
     * @return string[]
     */
    public function getBadges()
    {
        return $this->container['badges'];
    }

    /**
     * Sets badges
     *
     * @param string[] $badges badges
     *
     * @return self
     */
    public function setBadges($badges)
    {
        $this->container['badges'] = $badges;

        return $this;
    }

    /**
     * Gets important_badges
     *
     * @return string[]
     */
    public function getImportantBadges()
    {
        return $this->container['important_badges'];
    }

    /**
     * Sets important_badges
     *
     * @param string[] $important_badges important_badges
     *
     * @return self
     */
    public function setImportantBadges($important_badges)
    {
        $this->container['important_badges'] = $important_badges;

        return $this;
    }

    /**
     * Gets ingredient_count
     *
     * @return int
     */
    public function getIngredientCount()
    {
        return $this->container['ingredient_count'];
    }

    /**
     * Sets ingredient_count
     *
     * @param int $ingredient_count ingredient_count
     *
     * @return self
     */
    public function setIngredientCount($ingredient_count)
    {
        $this->container['ingredient_count'] = $ingredient_count;

        return $this;
    }

    /**
     * Gets generated_text
     *
     * @return mixed|null
     */
    public function getGeneratedText()
    {
        return $this->container['generated_text'];
    }

    /**
     * Sets generated_text
     *
     * @param mixed|null $generated_text generated_text
     *
     * @return self
     */
    public function setGeneratedText($generated_text)
    {
        $this->container['generated_text'] = $generated_text;

        return $this;
    }

    /**
     * Gets ingredient_list
     *
     * @return string
     */
    public function getIngredientList()
    {
        return $this->container['ingredient_list'];
    }

    /**
     * Sets ingredient_list
     *
     * @param string $ingredient_list ingredient_list
     *
     * @return self
     */
    public function setIngredientList($ingredient_list)
    {

        if ((mb_strlen($ingredient_list) < 1)) {
            throw new \InvalidArgumentException('invalid length for $ingredient_list when calling GetProductInformation200Response., must be bigger than or equal to 1.');
        }

        $this->container['ingredient_list'] = $ingredient_list;

        return $this;
    }

    /**
     * Gets ingredients
     *
     * @return \com.spoonacular.client\com.spoonacular.client.model\GetProductInformation200ResponseIngredientsInner[]
     */
    public function getIngredients()
    {
        return $this->container['ingredients'];
    }

    /**
     * Sets ingredients
     *
     * @param \com.spoonacular.client\com.spoonacular.client.model\GetProductInformation200ResponseIngredientsInner[] $ingredients ingredients
     *
     * @return self
     */
    public function setIngredients($ingredients)
    {


        if ((count($ingredients) < 0)) {
            throw new \InvalidArgumentException('invalid length for $ingredients when calling GetProductInformation200Response., number of items must be greater than or equal to 0.');
        }
        $this->container['ingredients'] = $ingredients;

        return $this;
    }

    /**
     * Gets likes
     *
     * @return float
     */
    public function getLikes()
    {
        return $this->container['likes'];
    }

    /**
     * Sets likes
     *
     * @param float $likes likes
     *
     * @return self
     */
    public function setLikes($likes)
    {
        $this->container['likes'] = $likes;

        return $this;
    }

    /**
     * Gets aisle
     *
     * @return string
     */
    public function getAisle()
    {
        return $this->container['aisle'];
    }

    /**
     * Sets aisle
     *
     * @param string $aisle aisle
     *
     * @return self
     */
    public function setAisle($aisle)
    {

        if ((mb_strlen($aisle) < 1)) {
            throw new \InvalidArgumentException('invalid length for $aisle when calling GetProductInformation200Response., must be bigger than or equal to 1.');
        }

        $this->container['aisle'] = $aisle;

        return $this;
    }

    /**
     * Gets nutrition
     *
     * @return \com.spoonacular.client\com.spoonacular.client.model\SearchGroceryProductsByUPC200ResponseNutrition
     */
    public function getNutrition()
    {
        return $this->container['nutrition'];
    }

    /**
     * Sets nutrition
     *
     * @param \com.spoonacular.client\com.spoonacular.client.model\SearchGroceryProductsByUPC200ResponseNutrition $nutrition nutrition
     *
     * @return self
     */
    public function setNutrition($nutrition)
    {
        $this->container['nutrition'] = $nutrition;

        return $this;
    }

    /**
     * Gets price
     *
     * @return float
     */
    public function getPrice()
    {
        return $this->container['price'];
    }

    /**
     * Sets price
     *
     * @param float $price price
     *
     * @return self
     */
    public function setPrice($price)
    {
        $this->container['price'] = $price;

        return $this;
    }

    /**
     * Gets servings
     *
     * @return \com.spoonacular.client\com.spoonacular.client.model\SearchGroceryProductsByUPC200ResponseServings
     */
    public function getServings()
    {
        return $this->container['servings'];
    }

    /**
     * Sets servings
     *
     * @param \com.spoonacular.client\com.spoonacular.client.model\SearchGroceryProductsByUPC200ResponseServings $servings servings
     *
     * @return self
     */
    public function setServings($servings)
    {
        $this->container['servings'] = $servings;

        return $this;
    }

    /**
     * Gets spoonacular_score
     *
     * @return float
     */
    public function getSpoonacularScore()
    {
        return $this->container['spoonacular_score'];
    }

    /**
     * Sets spoonacular_score
     *
     * @param float $spoonacular_score spoonacular_score
     *
     * @return self
     */
    public function setSpoonacularScore($spoonacular_score)
    {
        $this->container['spoonacular_score'] = $spoonacular_score;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset): bool
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    #[\ReturnTypeWillChange]
    public function offsetGet($offset)
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value): void
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset): void
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    #[\ReturnTypeWillChange]
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


