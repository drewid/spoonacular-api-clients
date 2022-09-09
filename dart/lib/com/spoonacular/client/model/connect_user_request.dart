//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConnectUserRequest {
  /// Returns a new [ConnectUserRequest] instance.
  ConnectUserRequest({
    required this.username,
    required this.firstName,
    required this.lastName,
    required this.email,
  });

  String username;

  String firstName;

  String lastName;

  String email;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConnectUserRequest &&
     other.username == username &&
     other.firstName == firstName &&
     other.lastName == lastName &&
     other.email == email;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (username.hashCode) +
    (firstName.hashCode) +
    (lastName.hashCode) +
    (email.hashCode);

  @override
  String toString() => 'ConnectUserRequest[username=$username, firstName=$firstName, lastName=$lastName, email=$email]';

  Map<String, dynamic> toJson() {
    final _json = <String, dynamic>{};
      _json[r'username'] = username;
      _json[r'firstName'] = firstName;
      _json[r'lastName'] = lastName;
      _json[r'email'] = email;
    return _json;
  }

  /// Returns a new [ConnectUserRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConnectUserRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ConnectUserRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ConnectUserRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ConnectUserRequest(
        username: mapValueOfType<String>(json, r'username')!,
        firstName: mapValueOfType<String>(json, r'firstName')!,
        lastName: mapValueOfType<String>(json, r'lastName')!,
        email: mapValueOfType<String>(json, r'email')!,
      );
    }
    return null;
  }

  static List<ConnectUserRequest>? listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConnectUserRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConnectUserRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConnectUserRequest> mapFromJson(dynamic json) {
    final map = <String, ConnectUserRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConnectUserRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConnectUserRequest-objects as value to a dart map
  static Map<String, List<ConnectUserRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConnectUserRequest>>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConnectUserRequest.listFromJson(entry.value, growable: growable,);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'username',
    'firstName',
    'lastName',
    'email',
  };
}

