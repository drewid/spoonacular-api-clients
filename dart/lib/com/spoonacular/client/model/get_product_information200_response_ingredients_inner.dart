//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class GetProductInformation200ResponseIngredientsInner {
  /// Returns a new [GetProductInformation200ResponseIngredientsInner] instance.
  GetProductInformation200ResponseIngredientsInner({
    this.description,
    required this.name,
    this.safetyLevel,
  });

  Object? description;

  String name;

  Object? safetyLevel;

  @override
  bool operator ==(Object other) => identical(this, other) || other is GetProductInformation200ResponseIngredientsInner &&
     other.description == description &&
     other.name == name &&
     other.safetyLevel == safetyLevel;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (description == null ? 0 : description!.hashCode) +
    (name.hashCode) +
    (safetyLevel == null ? 0 : safetyLevel!.hashCode);

  @override
  String toString() => 'GetProductInformation200ResponseIngredientsInner[description=$description, name=$name, safetyLevel=$safetyLevel]';

  Map<String, dynamic> toJson() {
    final _json = <String, dynamic>{};
    if (description != null) {
      _json[r'description'] = description;
    } else {
      _json[r'description'] = null;
    }
      _json[r'name'] = name;
    if (safetyLevel != null) {
      _json[r'safety_level'] = safetyLevel;
    } else {
      _json[r'safety_level'] = null;
    }
    return _json;
  }

  /// Returns a new [GetProductInformation200ResponseIngredientsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static GetProductInformation200ResponseIngredientsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "GetProductInformation200ResponseIngredientsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "GetProductInformation200ResponseIngredientsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return GetProductInformation200ResponseIngredientsInner(
        description: mapValueOfType<Object>(json, r'description'),
        name: mapValueOfType<String>(json, r'name')!,
        safetyLevel: mapValueOfType<Object>(json, r'safety_level'),
      );
    }
    return null;
  }

  static List<GetProductInformation200ResponseIngredientsInner>? listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GetProductInformation200ResponseIngredientsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GetProductInformation200ResponseIngredientsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, GetProductInformation200ResponseIngredientsInner> mapFromJson(dynamic json) {
    final map = <String, GetProductInformation200ResponseIngredientsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetProductInformation200ResponseIngredientsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of GetProductInformation200ResponseIngredientsInner-objects as value to a dart map
  static Map<String, List<GetProductInformation200ResponseIngredientsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<GetProductInformation200ResponseIngredientsInner>>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = GetProductInformation200ResponseIngredientsInner.listFromJson(entry.value, growable: growable,);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'name',
  };
}

