package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.SettingsSchemaKey
import sn.gnome.gio.internal.GSettingsSchemaKey
import sn.gnome.glib.{Variant, VariantType}
import sn.gnome.glib.internal.{gboolean, gchar, gint}

/** #GSettingsSchemaKey is an opaque data structure and can only be accessed
  * using the following functions.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SettingsSchemaKey private[gnome] (raw: Ptr[GSettingsSchemaKey]):

  def getUnsafeRawPointer(): Ptr[GSettingsSchemaKey] = this.raw

  /** Gets the default value for @key.
    *
    * Note that this is the default value according to the schema. System
    * administrator defaults and lockdown are not visible via this API.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDefaultValue(): sn.gnome.glib.Variant /* None */ =
    sn.gnome.glib.Variant.fromRaw(
      g_settings_schema_key_get_default_value(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSettingsSchemaKey]]
      )
    )
  end getDefaultValue

  /** Gets the description for @key.
    *
    * If no description has been provided in the schema for @key, returns %NULL.
    *
    * The description can be one sentence to several paragraphs in length.
    * Paragraphs are delimited with a double newline. Descriptions can be
    * translated and the value returned from this function is is the current
    * locale.
    *
    * This function is slow. The summary and description information for the
    * schemas is not stored in the compiled schema database so this function has
    * to parse all of the source XML files in the schema directory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDescription(): scala.Predef.String /* None */ =
    fromCString(
      g_settings_schema_key_get_description(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSettingsSchemaKey]]
      ).asInstanceOf
    )
  end getDescription

  /** Gets the name of @key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName(): scala.Predef.String /* None */ =
    fromCString(
      g_settings_schema_key_get_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSettingsSchemaKey]]
      ).asInstanceOf
    )
  end getName

  /** Queries the range of a key.
    *
    * This function will return a #GVariant that fully describes the range of
    * values that are valid for @key.
    *
    * The type of #GVariant returned is `(sv)`. The string describes the type of
    * range restriction in effect. The type and meaning of the value contained
    * in the variant depends on the string.
    *
    * If the string is `'type'` then the variant contains an empty array. The
    * element type of that empty array is the expected type of value and all
    * values of that type are valid.
    *
    * If the string is `'enum'` then the variant contains an array enumerating
    * the possible values. Each item in the array is a possible valid value and
    * no other values are valid.
    *
    * If the string is `'flags'` then the variant contains an array. Each item
    * in the array is a value that may appear zero or one times in an array to
    * be used as the value for this key. For example, if the variant contained
    * the array `['x', 'y']` then the valid values for the key would be `[]`,
    * `['x']`, `['y']`, `['x', 'y']` and `['y', 'x']`.
    *
    * Finally, if the string is `'range'` then the variant contains a pair of
    * like-typed values -- the minimum and maximum permissible values for this
    * key.
    *
    * This information should not be used by normal programs. It is considered
    * to be a hint for introspection purposes. Normal programs should already
    * know what is permitted by their own schema. The format may change in any
    * way in the future -- but particularly, new forms may be added to the
    * possibilities described above.
    *
    * You should free the returned value with g_variant_unref() when it is no
    * longer needed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRange(): sn.gnome.glib.Variant /* None */ =
    sn.gnome.glib.Variant.fromRaw(
      g_settings_schema_key_get_range(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSettingsSchemaKey]]
      )
    )
  end getRange

  /** Gets the summary for @key.
    *
    * If no summary has been provided in the schema for @key, returns %NULL.
    *
    * The summary is a short description of the purpose of the key; usually one
    * short sentence. Summaries can be translated and the value returned from
    * this function is is the current locale.
    *
    * This function is slow. The summary and description information for the
    * schemas is not stored in the compiled schema database so this function has
    * to parse all of the source XML files in the schema directory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSummary(): scala.Predef.String /* None */ =
    fromCString(
      g_settings_schema_key_get_summary(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSettingsSchemaKey]]
      ).asInstanceOf
    )
  end getSummary

  /** Gets the #GVariantType of @key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getValueType(): sn.gnome.glib.VariantType /* None */ =
    sn.gnome.glib.VariantType.fromRaw(
      g_settings_schema_key_get_value_type(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSettingsSchemaKey]]
      )
    )
  end getValueType

  /** Checks if the given @value is within the permitted range for @key.
    *
    * It is a programmer error if @value is not of the correct type — you must
    * check for this first.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def rangeCheck(
      value: sn.gnome.glib.Variant /* Some(Ptr[_root_.sn.gnome.glib.internal.GVariant]) */
  ): Boolean /* None */ =
    g_settings_schema_key_range_check(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSettingsSchemaKey]],
      value.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end rangeCheck

  /** Increase the reference count of @key, returning a new reference.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.gio.SettingsSchemaKey /* None */ =
    sn.gnome.gio.SettingsSchemaKey.fromRaw(
      g_settings_schema_key_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSettingsSchemaKey]]
      )
    )
  end ref

  /** Decrease the reference count of @key, possibly freeing it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_settings_schema_key_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSettingsSchemaKey]]
    )
  end unref

end SettingsSchemaKey

object SettingsSchemaKey:
  def fromRaw(ptr: Ptr[GSettingsSchemaKey]): SettingsSchemaKey =
    new SettingsSchemaKey(ptr)
end SettingsSchemaKey
