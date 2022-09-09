//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GuessNutritionByDishName200Response {
  /// Returns a new [GuessNutritionByDishName200Response] instance.
  GuessNutritionByDishName200Response({
    required this.calories,
    required this.carbs,
    required this.fat,
    required this.protein,
    required this.recipesUsed,
  });

  GuessNutritionByDishName200ResponseCalories calories;

  GuessNutritionByDishName200ResponseCalories carbs;

  GuessNutritionByDishName200ResponseCalories fat;

  GuessNutritionByDishName200ResponseCalories protein;

  int recipesUsed;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GuessNutritionByDishName200Response &&
     other.calories == calories &&
     other.carbs == carbs &&
     other.fat == fat &&
     other.protein == protein &&
     other.recipesUsed == recipesUsed;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (calories.hashCode) +
    (carbs.hashCode) +
    (fat.hashCode) +
    (protein.hashCode) +
    (recipesUsed.hashCode);

  @override
  String toString() => 'GuessNutritionByDishName200Response[calories=$calories, carbs=$carbs, fat=$fat, protein=$protein, recipesUsed=$recipesUsed]';

  Map<String, dynamic> toJson() {
    final _json = <String, dynamic>{};
      _json[r'calories'] = calories;
      _json[r'carbs'] = carbs;
      _json[r'fat'] = fat;
      _json[r'protein'] = protein;
      _json[r'recipesUsed'] = recipesUsed;
    return _json;
  }

  /// Returns a new [GuessNutritionByDishName200Response] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GuessNutritionByDishName200Response? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GuessNutritionByDishName200Response[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GuessNutritionByDishName200Response[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GuessNutritionByDishName200Response(
        calories: GuessNutritionByDishName200ResponseCalories.fromJson(json[r'calories'])!,
        carbs: GuessNutritionByDishName200ResponseCalories.fromJson(json[r'carbs'])!,
        fat: GuessNutritionByDishName200ResponseCalories.fromJson(json[r'fat'])!,
        protein: GuessNutritionByDishName200ResponseCalories.fromJson(json[r'protein'])!,
        recipesUsed: mapValueOfType<int>(json, r'recipesUsed')!,
      );
    }
    return null;
  }

  static List<GuessNutritionByDishName200Response>? listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GuessNutritionByDishName200Response>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GuessNutritionByDishName200Response.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GuessNutritionByDishName200Response> mapFromJson(dynamic json) {
    final map = <String, GuessNutritionByDishName200Response>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GuessNutritionByDishName200Response.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GuessNutritionByDishName200Response-objects as value to a dart map
  static Map<String, List<GuessNutritionByDishName200Response>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GuessNutritionByDishName200Response>>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GuessNutritionByDishName200Response.listFromJson(entry.value, growable: growable,);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'calories',
    'carbs',
    'fat',
    'protein',
    'recipesUsed',
  };
}

