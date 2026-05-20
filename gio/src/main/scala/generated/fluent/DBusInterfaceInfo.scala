package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.{
  DBusInterfaceInfo,
  DBusMethodInfo,
  DBusPropertyInfo,
  DBusSignalInfo
}
import sn.gnome.gio.internal.GDBusInterfaceInfo
import sn.gnome.glib.String
import sn.gnome.glib.internal.{gchar, gint, guint}

/** Information about a D-Bus interface.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusInterfaceInfo private[gnome] (raw: Ptr[GDBusInterfaceInfo]):

  def getUnsafeRawPointer(): Ptr[GDBusInterfaceInfo] = this.raw

  /** The reference count or -1 if statically allocated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def refCount: Int /* None */ =
    (!raw).ref_count.asInstanceOf[_root_.sn.gnome.glib.internal.gint]

  /** The reference count or -1 if statically allocated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def refCount_=(value: Int /* None */ ): Unit = (!raw).ref_count_=(
    gint(value).asInstanceOf[_root_.sn.gnome.glib.internal.gint]
  )

  /** The name of the D-Bus interface, e.g. "org.freedesktop.DBus.Properties".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def name(using Zone): scala.Predef.String /* None */ =
    (!raw).name.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]

  /** The name of the D-Bus interface, e.g. "org.freedesktop.DBus.Properties".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def name_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).name_=(
      toCString(value)
        .asInstanceOf[Ptr[gchar]]
        .asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
    )

  /** A pointer to a %NULL-terminated array of pointers to #GDBusMethodInfo
    * structures or %NULL if there are no methods.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field methods]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(DBusMethodInfo), @type -> DataRecord(GDBusMethodInfo*)))),ListMap(@type -> DataRecord(GDBusMethodInfo**)))"
  )
  private def methods__ = ???

  /** A pointer to a %NULL-terminated array of pointers to #GDBusSignalInfo
    * structures or %NULL if there are no signals.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field signals]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(DBusSignalInfo), @type -> DataRecord(GDBusSignalInfo*)))),ListMap(@type -> DataRecord(GDBusSignalInfo**)))"
  )
  private def signals__ = ???

  /** A pointer to a %NULL-terminated array of pointers to #GDBusPropertyInfo
    * structures or %NULL if there are no properties.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field properties]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(DBusPropertyInfo), @type -> DataRecord(GDBusPropertyInfo*)))),ListMap(@type -> DataRecord(GDBusPropertyInfo**)))"
  )
  private def properties__ = ???

  /** A pointer to a %NULL-terminated array of pointers to #GDBusAnnotationInfo
    * structures or %NULL if there are no annotations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field annotations]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(DBusAnnotationInfo), @type -> DataRecord(GDBusAnnotationInfo*)))),ListMap(@type -> DataRecord(GDBusAnnotationInfo**)))"
  )
  private def annotations__ = ???

  /** Builds a lookup-cache to speed up g_dbus_interface_info_lookup_method(),
    * g_dbus_interface_info_lookup_signal() and
    * g_dbus_interface_info_lookup_property().
    *
    * If this has already been called with @info, the existing cache is used and
    * its use count is increased.
    *
    * Note that @info cannot be modified until
    * g_dbus_interface_info_cache_release() is called.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def cacheBuild(): Unit /* None */ =
    g_dbus_interface_info_cache_build(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusInterfaceInfo]]
    )
  end cacheBuild

  /** Decrements the usage count for the cache for @info built by
    * g_dbus_interface_info_cache_build() (if any) and frees the resources used
    * by the cache if the usage count drops to zero.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def cacheRelease(): Unit /* None */ =
    g_dbus_interface_info_cache_release(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusInterfaceInfo]]
    )
  end cacheRelease

  /** Appends an XML representation of @info (and its children) to @string_builder.
    *
    * This function is typically used for generating introspection XML documents
    * at run-time for handling the
    * `org.freedesktop.DBus.Introspectable.Introspect` method.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def generateXml(
      indent: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      string_builder: sn.gnome.glib.String /* Some(Ptr[_root_.sn.gnome.glib.internal.GString]) */
  ): Unit /* None */ =
    g_dbus_interface_info_generate_xml(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusInterfaceInfo]],
      guint(indent),
      string_builder.getUnsafeRawPointer().asInstanceOf
    )
  end generateXml

  /** Looks up information about a method.
    *
    * The cost of this function is O(n) in number of methods unless
    * g_dbus_interface_info_cache_build() has been used on @info.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lookupMethod(
      name: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): sn.gnome.gio.DBusMethodInfo /* None */ =
    sn.gnome.gio.DBusMethodInfo.fromRaw(
      g_dbus_interface_info_lookup_method(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusInterfaceInfo]],
        toCString(name).asInstanceOf[Ptr[gchar]]
      )
    )
  end lookupMethod

  /** Looks up information about a property.
    *
    * The cost of this function is O(n) in number of properties unless
    * g_dbus_interface_info_cache_build() has been used on @info.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lookupProperty(
      name: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): sn.gnome.gio.DBusPropertyInfo /* None */ =
    sn.gnome.gio.DBusPropertyInfo.fromRaw(
      g_dbus_interface_info_lookup_property(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusInterfaceInfo]],
        toCString(name).asInstanceOf[Ptr[gchar]]
      )
    )
  end lookupProperty

  /** Looks up information about a signal.
    *
    * The cost of this function is O(n) in number of signals unless
    * g_dbus_interface_info_cache_build() has been used on @info.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lookupSignal(
      name: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): sn.gnome.gio.DBusSignalInfo /* None */ =
    sn.gnome.gio.DBusSignalInfo.fromRaw(
      g_dbus_interface_info_lookup_signal(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusInterfaceInfo]],
        toCString(name).asInstanceOf[Ptr[gchar]]
      )
    )
  end lookupSignal

  /** If @info is statically allocated does nothing. Otherwise increases the
    * reference count.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.gio.DBusInterfaceInfo /* None */ =
    sn.gnome.gio.DBusInterfaceInfo.fromRaw(
      g_dbus_interface_info_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusInterfaceInfo]]
      )
    )
  end ref

  /** If @info is statically allocated, does nothing. Otherwise decreases the
    * reference count of @info. When its reference count drops to 0, the memory
    * used is freed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_dbus_interface_info_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusInterfaceInfo]]
    )
  end unref

end DBusInterfaceInfo

object DBusInterfaceInfo:
  def fromRaw(ptr: Ptr[GDBusInterfaceInfo]): DBusInterfaceInfo =
    new DBusInterfaceInfo(ptr)
end DBusInterfaceInfo
