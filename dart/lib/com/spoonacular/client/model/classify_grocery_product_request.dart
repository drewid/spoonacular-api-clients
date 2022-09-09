//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ClassifyGroceryProductRequest {
  /// Returns a new [ClassifyGroceryProductRequest] instance.
  ClassifyGroceryProductRequest({
    required this.title,
    required this.upc,
    required this.pluCode,
  });

  String title;

  String upc;

  String pluCode;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ClassifyGroceryProductRequest &&
     other.title == title &&
     other.upc == upc &&
     other.pluCode == pluCode;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (title.hashCode) +
    (upc.hashCode) +
    (pluCode.hashCode);

  @override
  String toString() => 'ClassifyGroceryProductRequest[title=$title, upc=$upc, pluCode=$pluCode]';

  Map<String, dynamic> toJson() {
    final _json = <String, dynamic>{};
      _json[r'title'] = title;
      _json[r'upc'] = upc;
      _json[r'plu_code'] = pluCode;
    return _json;
  }

  /// Returns a new [ClassifyGroceryProductRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ClassifyGroceryProductRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ClassifyGroceryProductRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ClassifyGroceryProductRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ClassifyGroceryProductRequest(
        title: mapValueOfType<String>(json, r'title')!,
        upc: mapValueOfType<String>(json, r'upc')!,
        pluCode: mapValueOfType<String>(json, r'plu_code')!,
      );
    }
    return null;
  }

  static List<ClassifyGroceryProductRequest>? listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ClassifyGroceryProductRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ClassifyGroceryProductRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ClassifyGroceryProductRequest> mapFromJson(dynamic json) {
    final map = <String, ClassifyGroceryProductRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ClassifyGroceryProductRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ClassifyGroceryProductRequest-objects as value to a dart map
  static Map<String, List<ClassifyGroceryProductRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ClassifyGroceryProductRequest>>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ClassifyGroceryProductRequest.listFromJson(entry.value, growable: growable,);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'title',
    'upc',
    'plu_code',
  };
}

