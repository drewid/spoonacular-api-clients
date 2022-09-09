//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SearchRecipes200ResponseResultsInner {
  /// Returns a new [SearchRecipes200ResponseResultsInner] instance.
  SearchRecipes200ResponseResultsInner({
    required this.id,
    required this.title,
    required this.calories,
    required this.carbs,
    required this.fat,
    required this.image,
    required this.imageType,
    required this.protein,
  });

  int id;

  String title;

  num calories;

  String carbs;

  String fat;

  String image;

  String imageType;

  String protein;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SearchRecipes200ResponseResultsInner &&
     other.id == id &&
     other.title == title &&
     other.calories == calories &&
     other.carbs == carbs &&
     other.fat == fat &&
     other.image == image &&
     other.imageType == imageType &&
     other.protein == protein;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (title.hashCode) +
    (calories.hashCode) +
    (carbs.hashCode) +
    (fat.hashCode) +
    (image.hashCode) +
    (imageType.hashCode) +
    (protein.hashCode);

  @override
  String toString() => 'SearchRecipes200ResponseResultsInner[id=$id, title=$title, calories=$calories, carbs=$carbs, fat=$fat, image=$image, imageType=$imageType, protein=$protein]';

  Map<String, dynamic> toJson() {
    final _json = <String, dynamic>{};
      _json[r'id'] = id;
      _json[r'title'] = title;
      _json[r'calories'] = calories;
      _json[r'carbs'] = carbs;
      _json[r'fat'] = fat;
      _json[r'image'] = image;
      _json[r'imageType'] = imageType;
      _json[r'protein'] = protein;
    return _json;
  }

  /// Returns a new [SearchRecipes200ResponseResultsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SearchRecipes200ResponseResultsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "SearchRecipes200ResponseResultsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "SearchRecipes200ResponseResultsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return SearchRecipes200ResponseResultsInner(
        id: mapValueOfType<int>(json, r'id')!,
        title: mapValueOfType<String>(json, r'title')!,
        calories: json[r'calories'] == null
            ? null
            : num.parse(json[r'calories'].toString()),
        carbs: mapValueOfType<String>(json, r'carbs')!,
        fat: mapValueOfType<String>(json, r'fat')!,
        image: mapValueOfType<String>(json, r'image')!,
        imageType: mapValueOfType<String>(json, r'imageType')!,
        protein: mapValueOfType<String>(json, r'protein')!,
      );
    }
    return null;
  }

  static List<SearchRecipes200ResponseResultsInner>? listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SearchRecipes200ResponseResultsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SearchRecipes200ResponseResultsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SearchRecipes200ResponseResultsInner> mapFromJson(dynamic json) {
    final map = <String, SearchRecipes200ResponseResultsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SearchRecipes200ResponseResultsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SearchRecipes200ResponseResultsInner-objects as value to a dart map
  static Map<String, List<SearchRecipes200ResponseResultsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SearchRecipes200ResponseResultsInner>>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SearchRecipes200ResponseResultsInner.listFromJson(entry.value, growable: growable,);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'title',
    'calories',
    'carbs',
    'fat',
    'image',
    'imageType',
    'protein',
  };
}

