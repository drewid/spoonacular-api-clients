=begin
#spoonacular API

#The spoonacular Nutrition, Recipe, and Food API allows you to access over thousands of recipes, thousands of ingredients, 800,000 food products, over 100,000 menu items, and restaurants. Our food ontology and semantic recipe search engine makes it possible to search for recipes using natural language queries, such as \"gluten free brownies without sugar\" or \"low fat vegan cupcakes.\" You can automatically calculate the nutritional information for any recipe, analyze recipe costs, visualize ingredient lists, find recipes for what's in your fridge, find recipes based on special diets, nutritional requirements, or favorite ingredients, classify recipes into types and cuisines, convert ingredient amounts, or even compute an entire meal plan. With our powerful API, you can create many kinds of food and especially nutrition apps.  Special diets/dietary requirements currently available include: vegan, vegetarian, pescetarian, gluten free, grain free, dairy free, high protein, whole 30, low sodium, low carb, Paleo, ketogenic, FODMAP, and Primal.

The version of the OpenAPI document: 2.0.1
Contact: mail@spoonacular.com
Generated by: https://openapi-generator.tech
Generator version: 7.8.0-SNAPSHOT

=end

require 'date'
require 'time'

module OpenapiClient
  class SearchRecipesByNutrients200ResponseInner
    attr_accessor :calories

    attr_accessor :carbs

    attr_accessor :fat

    attr_accessor :id

    attr_accessor :image

    attr_accessor :image_type

    attr_accessor :protein

    attr_accessor :title

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'calories' => :'calories',
        :'carbs' => :'carbs',
        :'fat' => :'fat',
        :'id' => :'id',
        :'image' => :'image',
        :'image_type' => :'imageType',
        :'protein' => :'protein',
        :'title' => :'title'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'calories' => :'Float',
        :'carbs' => :'String',
        :'fat' => :'String',
        :'id' => :'Integer',
        :'image' => :'String',
        :'image_type' => :'String',
        :'protein' => :'String',
        :'title' => :'String'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
      ])
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `OpenapiClient::SearchRecipesByNutrients200ResponseInner` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `OpenapiClient::SearchRecipesByNutrients200ResponseInner`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'calories')
        self.calories = attributes[:'calories']
      else
        self.calories = nil
      end

      if attributes.key?(:'carbs')
        self.carbs = attributes[:'carbs']
      else
        self.carbs = nil
      end

      if attributes.key?(:'fat')
        self.fat = attributes[:'fat']
      else
        self.fat = nil
      end

      if attributes.key?(:'id')
        self.id = attributes[:'id']
      else
        self.id = nil
      end

      if attributes.key?(:'image')
        self.image = attributes[:'image']
      else
        self.image = nil
      end

      if attributes.key?(:'image_type')
        self.image_type = attributes[:'image_type']
      else
        self.image_type = nil
      end

      if attributes.key?(:'protein')
        self.protein = attributes[:'protein']
      else
        self.protein = nil
      end

      if attributes.key?(:'title')
        self.title = attributes[:'title']
      else
        self.title = nil
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      warn '[DEPRECATED] the `list_invalid_properties` method is obsolete'
      invalid_properties = Array.new
      if @calories.nil?
        invalid_properties.push('invalid value for "calories", calories cannot be nil.')
      end

      if @carbs.nil?
        invalid_properties.push('invalid value for "carbs", carbs cannot be nil.')
      end

      if @carbs.to_s.length < 1
        invalid_properties.push('invalid value for "carbs", the character length must be great than or equal to 1.')
      end

      if @fat.nil?
        invalid_properties.push('invalid value for "fat", fat cannot be nil.')
      end

      if @fat.to_s.length < 1
        invalid_properties.push('invalid value for "fat", the character length must be great than or equal to 1.')
      end

      if @id.nil?
        invalid_properties.push('invalid value for "id", id cannot be nil.')
      end

      if @image.nil?
        invalid_properties.push('invalid value for "image", image cannot be nil.')
      end

      if @image.to_s.length < 1
        invalid_properties.push('invalid value for "image", the character length must be great than or equal to 1.')
      end

      if @image_type.nil?
        invalid_properties.push('invalid value for "image_type", image_type cannot be nil.')
      end

      if @image_type.to_s.length < 1
        invalid_properties.push('invalid value for "image_type", the character length must be great than or equal to 1.')
      end

      if @protein.nil?
        invalid_properties.push('invalid value for "protein", protein cannot be nil.')
      end

      if @protein.to_s.length < 1
        invalid_properties.push('invalid value for "protein", the character length must be great than or equal to 1.')
      end

      if @title.nil?
        invalid_properties.push('invalid value for "title", title cannot be nil.')
      end

      if @title.to_s.length < 1
        invalid_properties.push('invalid value for "title", the character length must be great than or equal to 1.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      warn '[DEPRECATED] the `valid?` method is obsolete'
      return false if @calories.nil?
      return false if @carbs.nil?
      return false if @carbs.to_s.length < 1
      return false if @fat.nil?
      return false if @fat.to_s.length < 1
      return false if @id.nil?
      return false if @image.nil?
      return false if @image.to_s.length < 1
      return false if @image_type.nil?
      return false if @image_type.to_s.length < 1
      return false if @protein.nil?
      return false if @protein.to_s.length < 1
      return false if @title.nil?
      return false if @title.to_s.length < 1
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] carbs Value to be assigned
    def carbs=(carbs)
      if carbs.nil?
        fail ArgumentError, 'carbs cannot be nil'
      end

      if carbs.to_s.length < 1
        fail ArgumentError, 'invalid value for "carbs", the character length must be great than or equal to 1.'
      end

      @carbs = carbs
    end

    # Custom attribute writer method with validation
    # @param [Object] fat Value to be assigned
    def fat=(fat)
      if fat.nil?
        fail ArgumentError, 'fat cannot be nil'
      end

      if fat.to_s.length < 1
        fail ArgumentError, 'invalid value for "fat", the character length must be great than or equal to 1.'
      end

      @fat = fat
    end

    # Custom attribute writer method with validation
    # @param [Object] image Value to be assigned
    def image=(image)
      if image.nil?
        fail ArgumentError, 'image cannot be nil'
      end

      if image.to_s.length < 1
        fail ArgumentError, 'invalid value for "image", the character length must be great than or equal to 1.'
      end

      @image = image
    end

    # Custom attribute writer method with validation
    # @param [Object] image_type Value to be assigned
    def image_type=(image_type)
      if image_type.nil?
        fail ArgumentError, 'image_type cannot be nil'
      end

      if image_type.to_s.length < 1
        fail ArgumentError, 'invalid value for "image_type", the character length must be great than or equal to 1.'
      end

      @image_type = image_type
    end

    # Custom attribute writer method with validation
    # @param [Object] protein Value to be assigned
    def protein=(protein)
      if protein.nil?
        fail ArgumentError, 'protein cannot be nil'
      end

      if protein.to_s.length < 1
        fail ArgumentError, 'invalid value for "protein", the character length must be great than or equal to 1.'
      end

      @protein = protein
    end

    # Custom attribute writer method with validation
    # @param [Object] title Value to be assigned
    def title=(title)
      if title.nil?
        fail ArgumentError, 'title cannot be nil'
      end

      if title.to_s.length < 1
        fail ArgumentError, 'invalid value for "title", the character length must be great than or equal to 1.'
      end

      @title = title
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          calories == o.calories &&
          carbs == o.carbs &&
          fat == o.fat &&
          id == o.id &&
          image == o.image &&
          image_type == o.image_type &&
          protein == o.protein &&
          title == o.title
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [calories, carbs, fat, id, image, image_type, protein, title].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      attributes = attributes.transform_keys(&:to_sym)
      transformed_hash = {}
      openapi_types.each_pair do |key, type|
        if attributes.key?(attribute_map[key]) && attributes[attribute_map[key]].nil?
          transformed_hash["#{key}"] = nil
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[attribute_map[key]].is_a?(Array)
            transformed_hash["#{key}"] = attributes[attribute_map[key]].map { |v| _deserialize($1, v) }
          end
        elsif !attributes[attribute_map[key]].nil?
          transformed_hash["#{key}"] = _deserialize(type, attributes[attribute_map[key]])
        end
      end
      new(transformed_hash)
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def self._deserialize(type, value)
      case type.to_sym
      when :Time
        Time.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = OpenapiClient.const_get(type)
        klass.respond_to?(:openapi_any_of) || klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.include?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
