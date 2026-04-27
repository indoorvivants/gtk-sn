package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSettingsBindFlags: _SETTINGS_BIND_DEFAULT: Equivalent to `G_SETTINGS_BIND_GET|G_SETTINGS_BIND_SET` _SETTINGS_BIND_GET: Update the #GObject property when the setting changes. It is an error to use this flag if the property is not writable. _SETTINGS_BIND_SET: Update the setting when the #GObject property changes. It is an error to use this flag if the property is not readable. _SETTINGS_BIND_NO_SENSITIVITY: Do not try to bind a "sensitivity" property to the writability of the setting _SETTINGS_BIND_GET_NO_CHANGES: When set in addition to %G_SETTINGS_BIND_GET, set the #GObject property value initially from the setting, but do not listen for changes of the setting _SETTINGS_BIND_INVERT_BOOLEAN: When passed to g_settings_bind(), uses a pair of mapping functions that invert the boolean value when mapping between the setting and the property. The setting and property must both be booleans. You cannot pass this flag to g_settings_bind_with_mapping().
*/
opaque type GSettingsBindFlags = CUnsignedInt
object GSettingsBindFlags extends _BindgenEnumCUnsignedInt[GSettingsBindFlags]:
  given _tag: Tag[GSettingsBindFlags] = Tag.UInt
  inline def define(inline a: Long): GSettingsBindFlags = a.toUInt
  val G_SETTINGS_BIND_DEFAULT = define(0)
  val G_SETTINGS_BIND_GET = define(1)
  val G_SETTINGS_BIND_SET = define(2)
  val G_SETTINGS_BIND_NO_SENSITIVITY = define(4)
  val G_SETTINGS_BIND_GET_NO_CHANGES = define(8)
  val G_SETTINGS_BIND_INVERT_BOOLEAN = define(16)
  def getName(value: GSettingsBindFlags): Option[String] =
    value match
      case `G_SETTINGS_BIND_DEFAULT` => Some("G_SETTINGS_BIND_DEFAULT")
      case `G_SETTINGS_BIND_GET` => Some("G_SETTINGS_BIND_GET")
      case `G_SETTINGS_BIND_SET` => Some("G_SETTINGS_BIND_SET")
      case `G_SETTINGS_BIND_NO_SENSITIVITY` => Some("G_SETTINGS_BIND_NO_SENSITIVITY")
      case `G_SETTINGS_BIND_GET_NO_CHANGES` => Some("G_SETTINGS_BIND_GET_NO_CHANGES")
      case `G_SETTINGS_BIND_INVERT_BOOLEAN` => Some("G_SETTINGS_BIND_INVERT_BOOLEAN")
      case _ => _root_.scala.None
  extension (a: GSettingsBindFlags)
    inline def &(b: GSettingsBindFlags): GSettingsBindFlags = a & b
    inline def |(b: GSettingsBindFlags): GSettingsBindFlags = a | b
    inline def is(b: GSettingsBindFlags): Boolean = (a & b) == b