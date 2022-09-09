<?php
/**
 * ClassifyGroceryProduct200Response
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
 * ClassifyGroceryProduct200Response Class Doc Comment
 *
 * @category Class
 * @description 
 * @package  com.spoonacular.client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class ClassifyGroceryProduct200Response implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'classifyGroceryProduct_200_response';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'clean_title' => 'string',
        'image' => 'string',
        'category' => 'string',
        'breadcrumbs' => 'string[]',
        'usda_code' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'clean_title' => null,
        'image' => null,
        'category' => null,
        'breadcrumbs' => null,
        'usda_code' => null
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
        'clean_title' => 'cleanTitle',
        'image' => 'image',
        'category' => 'category',
        'breadcrumbs' => 'breadcrumbs',
        'usda_code' => 'usdaCode'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'clean_title' => 'setCleanTitle',
        'image' => 'setImage',
        'category' => 'setCategory',
        'breadcrumbs' => 'setBreadcrumbs',
        'usda_code' => 'setUsdaCode'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'clean_title' => 'getCleanTitle',
        'image' => 'getImage',
        'category' => 'getCategory',
        'breadcrumbs' => 'getBreadcrumbs',
        'usda_code' => 'getUsdaCode'
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
        $this->container['clean_title'] = $data['clean_title'] ?? null;
        $this->container['image'] = $data['image'] ?? null;
        $this->container['category'] = $data['category'] ?? null;
        $this->container['breadcrumbs'] = $data['breadcrumbs'] ?? null;
        $this->container['usda_code'] = $data['usda_code'] ?? null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['clean_title'] === null) {
            $invalidProperties[] = "'clean_title' can't be null";
        }
        if ((mb_strlen($this->container['clean_title']) < 1)) {
            $invalidProperties[] = "invalid value for 'clean_title', the character length must be bigger than or equal to 1.";
        }

        if ($this->container['image'] === null) {
            $invalidProperties[] = "'image' can't be null";
        }
        if ((mb_strlen($this->container['image']) < 1)) {
            $invalidProperties[] = "invalid value for 'image', the character length must be bigger than or equal to 1.";
        }

        if ($this->container['category'] === null) {
            $invalidProperties[] = "'category' can't be null";
        }
        if ((mb_strlen($this->container['category']) < 1)) {
            $invalidProperties[] = "invalid value for 'category', the character length must be bigger than or equal to 1.";
        }

        if ($this->container['breadcrumbs'] === null) {
            $invalidProperties[] = "'breadcrumbs' can't be null";
        }
        if ($this->container['usda_code'] === null) {
            $invalidProperties[] = "'usda_code' can't be null";
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
     * Gets clean_title
     *
     * @return string
     */
    public function getCleanTitle()
    {
        return $this->container['clean_title'];
    }

    /**
     * Sets clean_title
     *
     * @param string $clean_title clean_title
     *
     * @return self
     */
    public function setCleanTitle($clean_title)
    {

        if ((mb_strlen($clean_title) < 1)) {
            throw new \InvalidArgumentException('invalid length for $clean_title when calling ClassifyGroceryProduct200Response., must be bigger than or equal to 1.');
        }

        $this->container['clean_title'] = $clean_title;

        return $this;
    }

    /**
     * Gets image
     *
     * @return string
     */
    public function getImage()
    {
        return $this->container['image'];
    }

    /**
     * Sets image
     *
     * @param string $image image
     *
     * @return self
     */
    public function setImage($image)
    {

        if ((mb_strlen($image) < 1)) {
            throw new \InvalidArgumentException('invalid length for $image when calling ClassifyGroceryProduct200Response., must be bigger than or equal to 1.');
        }

        $this->container['image'] = $image;

        return $this;
    }

    /**
     * Gets category
     *
     * @return string
     */
    public function getCategory()
    {
        return $this->container['category'];
    }

    /**
     * Sets category
     *
     * @param string $category category
     *
     * @return self
     */
    public function setCategory($category)
    {

        if ((mb_strlen($category) < 1)) {
            throw new \InvalidArgumentException('invalid length for $category when calling ClassifyGroceryProduct200Response., must be bigger than or equal to 1.');
        }

        $this->container['category'] = $category;

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
     * Gets usda_code
     *
     * @return int
     */
    public function getUsdaCode()
    {
        return $this->container['usda_code'];
    }

    /**
     * Sets usda_code
     *
     * @param int $usda_code usda_code
     *
     * @return self
     */
    public function setUsdaCode($usda_code)
    {
        $this->container['usda_code'] = $usda_code;

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


