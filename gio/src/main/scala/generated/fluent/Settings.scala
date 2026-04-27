package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.Action
import sn.gnome.gio.fluent.Settings
import sn.gnome.gio.fluent.SettingsBackend
import sn.gnome.gio.internal.GSettings
import sn.gnome.gio.internal.GSettingsBindFlags
import sn.gnome.gio.internal.GSettingsBindGetMapping
import sn.gnome.gio.internal.GSettingsBindSetMapping
import sn.gnome.gio.internal.GSettingsGetMapping
import sn.gnome.gio.internal.GSettingsSchema
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.GVariant
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gdouble
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gint64
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint
import sn.gnome.glib.internal.guint64
import sn.gnome.gobject.fluent.Object

class Settings(raw: Ptr[GSettings]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def apply(): Unit = g_settings_apply(this.raw.asInstanceOf)

  def bind(
      key: String | CString,
      `object`: Object,
      property: String | CString,
      flags: GSettingsBindFlags
  )(using Zone): Unit = g_settings_bind(
    this.raw.asInstanceOf,
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    gpointer(
      `object`.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]
    ),
    __sn_extract_string(property).asInstanceOf[Ptr[gchar]],
    flags
  )

  def bindWithMapping(
      key: String | CString,
      `object`: Object,
      property: String | CString,
      flags: GSettingsBindFlags,
      get_mapping: GSettingsBindGetMapping,
      set_mapping: GSettingsBindSetMapping,
      user_data: Ptr[Byte],
      destroy: GDestroyNotify
  )(using Zone): Unit = g_settings_bind_with_mapping(
    this.raw.asInstanceOf,
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    gpointer(
      `object`.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]
    ),
    __sn_extract_string(property).asInstanceOf[Ptr[gchar]],
    flags,
    get_mapping,
    set_mapping,
    gpointer(user_data),
    destroy
  )

  def bindWritable(
      key: String | CString,
      `object`: Object,
      property: String | CString,
      inverted: Boolean
  )(using Zone): Unit = g_settings_bind_writable(
    this.raw.asInstanceOf,
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    gpointer(
      `object`.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]
    ),
    __sn_extract_string(property).asInstanceOf[Ptr[gchar]],
    gboolean(gint((if inverted == true then 1 else 0)))
  )

  def createAction(key: String | CString)(using Zone): Action =
    new Action.Abstract(
      g_settings_create_action(
        this.raw.asInstanceOf,
        __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )

  def delay(): Unit = g_settings_delay(this.raw.asInstanceOf)

  inline def get(key: String | CString, format: String | CString, args: Any*)(
      using Zone
  ): Unit = g_settings_get(
    this.raw.asInstanceOf,
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(format).asInstanceOf[Ptr[gchar]],
    args*
  )

  def getBoolean(key: String | CString)(using Zone): Boolean =
    g_settings_get_boolean(
      this.raw.asInstanceOf,
      __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)

  def getChild(name: String | CString)(using Zone): Settings = new Settings(
    g_settings_get_child(
      this.raw.asInstanceOf,
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  def getDefaultValue(key: String | CString)(using Zone): Ptr[GVariant] =
    g_settings_get_default_value(
      this.raw.asInstanceOf,
      __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
    )

  def getDouble(key: String | CString)(using Zone): Double =
    g_settings_get_double(
      this.raw.asInstanceOf,
      __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
    ).value

  def getEnum(key: String | CString)(using Zone): Int = g_settings_get_enum(
    this.raw.asInstanceOf,
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
  ).value

  def getFlags(key: String | CString)(using Zone): UInt = g_settings_get_flags(
    this.raw.asInstanceOf,
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
  ).value

  def getHasUnapplied(): Boolean =
    g_settings_get_has_unapplied(this.raw.asInstanceOf).value.!=(0)

  def getInt(key: String | CString)(using Zone): Int = g_settings_get_int(
    this.raw.asInstanceOf,
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
  ).value

  def getInt64(key: String | CString)(using Zone): CLongInt =
    g_settings_get_int64(
      this.raw.asInstanceOf,
      __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
    ).value

  def getMapped(
      key: String | CString,
      mapping: GSettingsGetMapping,
      user_data: Ptr[Byte]
  )(using Zone): Ptr[Byte] = g_settings_get_mapped(
    this.raw.asInstanceOf,
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    mapping,
    gpointer(user_data)
  ).value

  def getRange(key: String | CString)(using Zone): Ptr[GVariant] =
    g_settings_get_range(
      this.raw.asInstanceOf,
      __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
    )

  def getString(key: String | CString)(using Zone): String = fromCString(
    g_settings_get_string(
      this.raw.asInstanceOf,
      __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  def getUint(key: String | CString)(using Zone): UInt = g_settings_get_uint(
    this.raw.asInstanceOf,
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
  ).value

  def getUint64(key: String | CString)(using Zone): CUnsignedLongInt =
    g_settings_get_uint64(
      this.raw.asInstanceOf,
      __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
    ).value

  def getUserValue(key: String | CString)(using Zone): Ptr[GVariant] =
    g_settings_get_user_value(
      this.raw.asInstanceOf,
      __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
    )

  def getValue(key: String | CString)(using Zone): Ptr[GVariant] =
    g_settings_get_value(
      this.raw.asInstanceOf,
      __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
    )

  def isWritable(name: String | CString)(using Zone): Boolean =
    g_settings_is_writable(
      this.raw.asInstanceOf,
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)

  def rangeCheck(key: String | CString, value: Ptr[GVariant])(using
      Zone
  ): Boolean = g_settings_range_check(
    this.raw.asInstanceOf,
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    value
  ).value.!=(0)

  def reset(key: String | CString)(using Zone): Unit = g_settings_reset(
    this.raw.asInstanceOf,
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
  )

  def revert(): Unit = g_settings_revert(this.raw.asInstanceOf)

  inline def set(key: String | CString, format: String | CString, args: Any*)(
      using Zone
  ): Boolean = g_settings_set(
    this.raw.asInstanceOf,
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(format).asInstanceOf[Ptr[gchar]],
    args*
  ).value.!=(0)

  def setBoolean(key: String | CString, value: Boolean)(using Zone): Boolean =
    g_settings_set_boolean(
      this.raw.asInstanceOf,
      __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
      gboolean(gint((if value == true then 1 else 0)))
    ).value.!=(0)

  def setDouble(key: String | CString, value: Double)(using Zone): Boolean =
    g_settings_set_double(
      this.raw.asInstanceOf,
      __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
      gdouble(value)
    ).value.!=(0)

  def setEnum(key: String | CString, value: Int)(using Zone): Boolean =
    g_settings_set_enum(
      this.raw.asInstanceOf,
      __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
      gint(value)
    ).value.!=(0)

  def setFlags(key: String | CString, value: UInt)(using Zone): Boolean =
    g_settings_set_flags(
      this.raw.asInstanceOf,
      __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
      guint(value)
    ).value.!=(0)

  def setInt(key: String | CString, value: Int)(using Zone): Boolean =
    g_settings_set_int(
      this.raw.asInstanceOf,
      __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
      gint(value)
    ).value.!=(0)

  def setInt64(key: String | CString, value: CLongInt)(using Zone): Boolean =
    g_settings_set_int64(
      this.raw.asInstanceOf,
      __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
      gint64(value)
    ).value.!=(0)

  def setString(key: String | CString, value: String | CString)(using
      Zone
  ): Boolean = g_settings_set_string(
    this.raw.asInstanceOf,
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(value).asInstanceOf[Ptr[gchar]]
  ).value.!=(0)

  // Method set_strv contains an array parameter, which is not supported yet

  def setUint(key: String | CString, value: UInt)(using Zone): Boolean =
    g_settings_set_uint(
      this.raw.asInstanceOf,
      __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
      guint(value)
    ).value.!=(0)

  def setUint64(key: String | CString, value: CUnsignedLongInt)(using
      Zone
  ): Boolean = g_settings_set_uint64(
    this.raw.asInstanceOf,
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    guint64(value)
  ).value.!=(0)

  def setValue(key: String | CString, value: Ptr[GVariant])(using
      Zone
  ): Boolean = g_settings_set_value(
    this.raw.asInstanceOf,
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    value
  ).value.!=(0)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Settings

object Settings:
  def apply(schema_id: String | CString)(using Zone): Settings = new Settings(
    g_settings_new(
      __sn_extract_string(schema_id).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )
  def full(
      schema: Ptr[GSettingsSchema],
      backend: SettingsBackend,
      path: String | CString
  )(using Zone): Settings = new Settings(
    g_settings_new_full(
      schema,
      backend.getUnsafeRawPointer().asInstanceOf,
      __sn_extract_string(path).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )
  def withBackend(schema_id: String | CString, backend: SettingsBackend)(using
      Zone
  ): Settings = new Settings(
    g_settings_new_with_backend(
      __sn_extract_string(schema_id).asInstanceOf[Ptr[gchar]],
      backend.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
  def withBackendAndPath(
      schema_id: String | CString,
      backend: SettingsBackend,
      path: String | CString
  )(using Zone): Settings = new Settings(
    g_settings_new_with_backend_and_path(
      __sn_extract_string(schema_id).asInstanceOf[Ptr[gchar]],
      backend.getUnsafeRawPointer().asInstanceOf,
      __sn_extract_string(path).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )
  def withPath(schema_id: String | CString, path: String | CString)(using
      Zone
  ): Settings = new Settings(
    g_settings_new_with_path(
      __sn_extract_string(schema_id).asInstanceOf[Ptr[gchar]],
      __sn_extract_string(path).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Settings
