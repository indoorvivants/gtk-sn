package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.GDuplicateFunc
import sn.gnome.glib.internal.GQuark
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Binding
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.fluent.ParamSpec
import sn.gnome.gobject.internal.GBindingFlags
import sn.gnome.gobject.internal.GBindingTransformFunc
import sn.gnome.gobject.internal.GClosure
import sn.gnome.gobject.internal.GObject
import sn.gnome.gobject.internal.GParameter
import sn.gnome.gobject.internal.GToggleNotify
import sn.gnome.gobject.internal.GType
import sn.gnome.gobject.internal.GValue
import sn.gnome.gobject.internal.GWeakNotify

class Object(raw: Ptr[GObject]):
  def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addToggleRef(_notify: GToggleNotify, data: Ptr[Byte]): Unit =
    g_object_add_toggle_ref(this.raw.asInstanceOf, _notify, gpointer(data))

  def addWeakPointer(weak_pointer_location: Ptr[Ptr[Byte]]): Unit =
    g_object_add_weak_pointer(
      this.raw.asInstanceOf,
      weak_pointer_location.asInstanceOf[Ptr[gpointer]]
    )

  def bindProperty(
      source_property: String | CString,
      target: Object,
      target_property: String | CString,
      flags: GBindingFlags
  )(using Zone): Binding = new Binding(
    g_object_bind_property(
      this.raw.asInstanceOf,
      __sn_extract_string(source_property).asInstanceOf[Ptr[gchar]],
      gpointer(
        target.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]
      ),
      __sn_extract_string(target_property).asInstanceOf[Ptr[gchar]],
      flags
    ).asInstanceOf
  )

  def bindPropertyFull(
      source_property: String | CString,
      target: Object,
      target_property: String | CString,
      flags: GBindingFlags,
      transform_to: GBindingTransformFunc,
      transform_from: GBindingTransformFunc,
      user_data: Ptr[Byte],
      _notify: GDestroyNotify
  )(using Zone): Binding = new Binding(
    g_object_bind_property_full(
      this.raw.asInstanceOf,
      __sn_extract_string(source_property).asInstanceOf[Ptr[gchar]],
      gpointer(
        target.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]
      ),
      __sn_extract_string(target_property).asInstanceOf[Ptr[gchar]],
      flags,
      transform_to,
      transform_from,
      gpointer(user_data),
      _notify
    ).asInstanceOf
  )

  def bindPropertyWithClosures(
      source_property: String | CString,
      target: Object,
      target_property: String | CString,
      flags: GBindingFlags,
      transform_to: Ptr[GClosure],
      transform_from: Ptr[GClosure]
  )(using Zone): Binding = new Binding(
    g_object_bind_property_with_closures(
      this.raw.asInstanceOf,
      __sn_extract_string(source_property).asInstanceOf[Ptr[gchar]],
      gpointer(
        target.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]
      ),
      __sn_extract_string(target_property).asInstanceOf[Ptr[gchar]],
      flags,
      transform_to,
      transform_from
    ).asInstanceOf
  )

  inline def connect(signal_spec: String | CString, args: Any*)(using
      Zone
  ): Object = new Object(
    g_object_connect(
      this.raw.asInstanceOf,
      __sn_extract_string(signal_spec).asInstanceOf[Ptr[gchar]],
      args*
    ).asInstanceOf
  )

  inline def disconnect(signal_spec: String | CString, args: Any*)(using
      Zone
  ): Unit = g_object_disconnect(
    this.raw.asInstanceOf,
    __sn_extract_string(signal_spec).asInstanceOf[Ptr[gchar]],
    args*
  )

  def dupData(
      key: String | CString,
      dup_func: GDuplicateFunc,
      user_data: Ptr[Byte]
  )(using Zone): Ptr[Byte] = g_object_dup_data(
    this.raw.asInstanceOf,
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    dup_func,
    gpointer(user_data)
  ).value

  def dupQdata(
      quark: GQuark,
      dup_func: GDuplicateFunc,
      user_data: Ptr[Byte]
  ): Ptr[Byte] = g_object_dup_qdata(
    this.raw.asInstanceOf,
    quark,
    dup_func,
    gpointer(user_data)
  ).value

  def forceFloating(): Unit = g_object_force_floating(this.raw.asInstanceOf)

  def freezeNotify(): Unit = g_object_freeze_notify(this.raw.asInstanceOf)

  inline def get(first_property_name: String | CString, args: Any*)(using
      Zone
  ): Unit = g_object_get(
    this.raw.asInstanceOf,
    __sn_extract_string(first_property_name).asInstanceOf[Ptr[gchar]],
    args*
  )

  def getData(key: String | CString)(using Zone): Ptr[Byte] = g_object_get_data(
    this.raw.asInstanceOf,
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
  ).value

  def getProperty(property_name: String | CString, value: Ptr[GValue])(using
      Zone
  ): Unit = g_object_get_property(
    this.raw.asInstanceOf,
    __sn_extract_string(property_name).asInstanceOf[Ptr[gchar]],
    value
  )

  def getQdata(quark: GQuark): Ptr[Byte] =
    g_object_get_qdata(this.raw.asInstanceOf, quark).value

  def getValist(first_property_name: String | CString, var_args: CVarArgList)(
      using Zone
  ): Unit = g_object_get_valist(
    this.raw.asInstanceOf,
    __sn_extract_string(first_property_name).asInstanceOf[Ptr[gchar]],
    var_args
  )

  // Method getv contains an array parameter, which is not supported yet

  def isFloating(): Boolean =
    g_object_is_floating(this.raw.asInstanceOf).value.!=(0)

  def _notify(property_name: String | CString)(using Zone): Unit =
    g_object_notify(
      this.raw.asInstanceOf,
      __sn_extract_string(property_name).asInstanceOf[Ptr[gchar]]
    )

  def notifyByPspec(pspec: ParamSpec): Unit = g_object_notify_by_pspec(
    this.raw.asInstanceOf,
    pspec.getUnsafeRawPointer().asInstanceOf
  )

  def ref(): Object = new Object(
    g_object_ref(this.raw.asInstanceOf).asInstanceOf
  )

  def refSink(): Object = new Object(
    g_object_ref_sink(this.raw.asInstanceOf).asInstanceOf
  )

  def removeToggleRef(_notify: GToggleNotify, data: Ptr[Byte]): Unit =
    g_object_remove_toggle_ref(this.raw.asInstanceOf, _notify, gpointer(data))

  def removeWeakPointer(weak_pointer_location: Ptr[Ptr[Byte]]): Unit =
    g_object_remove_weak_pointer(
      this.raw.asInstanceOf,
      weak_pointer_location.asInstanceOf[Ptr[gpointer]]
    )

  // Method replace_data contains an OUT parameter, which is not supported yet

  // Method replace_qdata contains an OUT parameter, which is not supported yet

  def runDispose(): Unit = g_object_run_dispose(this.raw.asInstanceOf)

  inline def set(first_property_name: String | CString, args: Any*)(using
      Zone
  ): Unit = g_object_set(
    this.raw.asInstanceOf,
    __sn_extract_string(first_property_name).asInstanceOf[Ptr[gchar]],
    args*
  )

  def setData(key: String | CString, data: Ptr[Byte])(using Zone): Unit =
    g_object_set_data(
      this.raw.asInstanceOf,
      __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
      gpointer(data)
    )

  def setDataFull(
      key: String | CString,
      data: Ptr[Byte],
      destroy: GDestroyNotify
  )(using Zone): Unit = g_object_set_data_full(
    this.raw.asInstanceOf,
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    gpointer(data),
    destroy
  )

  def setProperty(property_name: String | CString, value: Ptr[GValue])(using
      Zone
  ): Unit = g_object_set_property(
    this.raw.asInstanceOf,
    __sn_extract_string(property_name).asInstanceOf[Ptr[gchar]],
    value
  )

  def setQdata(quark: GQuark, data: Ptr[Byte]): Unit =
    g_object_set_qdata(this.raw.asInstanceOf, quark, gpointer(data))

  def setQdataFull(
      quark: GQuark,
      data: Ptr[Byte],
      destroy: GDestroyNotify
  ): Unit = g_object_set_qdata_full(
    this.raw.asInstanceOf,
    quark,
    gpointer(data),
    destroy
  )

  def setValist(first_property_name: String | CString, var_args: CVarArgList)(
      using Zone
  ): Unit = g_object_set_valist(
    this.raw.asInstanceOf,
    __sn_extract_string(first_property_name).asInstanceOf[Ptr[gchar]],
    var_args
  )

  // Method setv contains an array parameter, which is not supported yet

  def stealData(key: String | CString)(using Zone): Ptr[Byte] =
    g_object_steal_data(
      this.raw.asInstanceOf,
      __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
    ).value

  def stealQdata(quark: GQuark): Ptr[Byte] =
    g_object_steal_qdata(this.raw.asInstanceOf, quark).value

  def takeRef(): Object = new Object(
    g_object_take_ref(this.raw.asInstanceOf).asInstanceOf
  )

  def thawNotify(): Unit = g_object_thaw_notify(this.raw.asInstanceOf)

  def unref(): Unit = g_object_unref(this.raw.asInstanceOf)

  def watchClosure(closure: Ptr[GClosure]): Unit =
    g_object_watch_closure(this.raw.asInstanceOf, closure)

  def weakRef(_notify: GWeakNotify, data: Ptr[Byte]): Unit =
    g_object_weak_ref(this.raw.asInstanceOf, _notify, gpointer(data))

  def weakUnref(_notify: GWeakNotify, data: Ptr[Byte]): Unit =
    g_object_weak_unref(this.raw.asInstanceOf, _notify, gpointer(data))

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Object

object Object:
  inline def apply(
      object_type: GType,
      first_property_name: String | CString,
      args: Any*
  )(using Zone): Object = new Object(
    g_object_new(
      object_type,
      __sn_extract_string(first_property_name).asInstanceOf[Ptr[gchar]],
      args*
    ).asInstanceOf
  )
  def valist(
      object_type: GType,
      first_property_name: String | CString,
      var_args: CVarArgList
  )(using Zone): Object = new Object(
    g_object_new_valist(
      object_type,
      __sn_extract_string(first_property_name).asInstanceOf[Ptr[gchar]],
      var_args
    ).asInstanceOf
  )
  def withProperties(
      object_type: GType,
      n_properties: UInt,
      names: Ptr[CString],
      values: Ptr[GValue]
  )(using Zone): Object = new Object(
    g_object_new_with_properties(
      object_type,
      guint(n_properties),
      names,
      values
    ).asInstanceOf
  )
  def newv(
      object_type: GType,
      n_parameters: UInt,
      parameters: Ptr[GParameter]
  ): Object = new Object(
    g_object_newv(object_type, guint(n_parameters), parameters).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Object
