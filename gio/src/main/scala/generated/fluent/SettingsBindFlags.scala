package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GSettingsBindFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags used when creating a binding. These flags determine in which direction
  * the binding works. The default is to synchronize in both directions.
  */
class SettingsBindFlags private (val raw: GSettingsBindFlags):
  def is(kv: SettingsBindFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[SettingsBindFlags.KnownValue]
    SettingsBindFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"SettingsBindFlags(${sb.result().mkString(", ")})"
end SettingsBindFlags

object SettingsBindFlags:
  export KnownValue.*

  def fromRaw(raw: GSettingsBindFlags) = new SettingsBindFlags(raw)

  extension (af: SettingsBindFlags)
    def &(other: SettingsBindFlags) =
      SettingsBindFlags(af.raw & other.raw)
    def |(other: SettingsBindFlags) =
      SettingsBindFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags used when creating a binding. These flags determine in which
    * direction the binding works. The default is to synchronize in both
    * directions.
    */
  enum KnownValue(override val raw: GSettingsBindFlags, name: String)
      extends SettingsBindFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Equivalent to `G_SETTINGS_BIND_GET|G_SETTINGS_BIND_SET`
      */
    case DEFAULT
        extends KnownValue(
          GSettingsBindFlags.G_SETTINGS_BIND_DEFAULT,
          "DEFAULT"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Update the #GObject property when the setting changes. It is an error to
      * use this flag if the property is not writable.
      */
    case GET extends KnownValue(GSettingsBindFlags.G_SETTINGS_BIND_GET, "GET")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Update the setting when the #GObject property changes. It is an error to
      * use this flag if the property is not readable.
      */
    case SET extends KnownValue(GSettingsBindFlags.G_SETTINGS_BIND_SET, "SET")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Do not try to bind a "sensitivity" property to the writability of the
      * setting
      */
    case NO_SENSITIVITY
        extends KnownValue(
          GSettingsBindFlags.G_SETTINGS_BIND_NO_SENSITIVITY,
          "NO_SENSITIVITY"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * When set in addition to %G_SETTINGS_BIND_GET, set the #GObject property
      * value initially from the setting, but do not listen for changes of the
      * setting
      */
    case GET_NO_CHANGES
        extends KnownValue(
          GSettingsBindFlags.G_SETTINGS_BIND_GET_NO_CHANGES,
          "GET_NO_CHANGES"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * When passed to g_settings_bind(), uses a pair of mapping functions that
      * invert the boolean value when mapping between the setting and the
      * property. The setting and property must both be booleans. You cannot
      * pass this flag to g_settings_bind_with_mapping().
      */
    case INVERT_BOOLEAN
        extends KnownValue(
          GSettingsBindFlags.G_SETTINGS_BIND_INVERT_BOOLEAN,
          "INVERT_BOOLEAN"
        )
  end KnownValue
end SettingsBindFlags
