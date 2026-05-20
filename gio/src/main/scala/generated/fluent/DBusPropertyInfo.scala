package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{DBusPropertyInfo, DBusPropertyInfoFlags}
import sn.gnome.gio.internal.GDBusPropertyInfo
import sn.gnome.glib.internal.{gchar, gint}

/** Information about a D-Bus property on a D-Bus interface.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusPropertyInfo private[gnome] (raw: Ptr[GDBusPropertyInfo]):

  def getUnsafeRawPointer(): Ptr[GDBusPropertyInfo] = this.raw

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

  /** The name of the D-Bus property, e.g. "SupportedFilesystems".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def name(using Zone): scala.Predef.String /* None */ =
    (!raw).name.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]

  /** The name of the D-Bus property, e.g. "SupportedFilesystems".
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

  /** The D-Bus signature of the property (a single complete type).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def signature(using Zone): scala.Predef.String /* None */ =
    (!raw).signature.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]

  /** The D-Bus signature of the property (a single complete type).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def signature_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).signature_=(
      toCString(value)
        .asInstanceOf[Ptr[gchar]]
        .asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
    )

  /** Access control flags for the property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flags: sn.gnome.gio.DBusPropertyInfoFlags /* None */ =
    (!raw).flags.asInstanceOf[GDBusPropertyInfoFlags]

  /** Access control flags for the property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flags_=(value: sn.gnome.gio.DBusPropertyInfoFlags /* None */ ): Unit =
    (!raw).flags_=(value.raw.value.asInstanceOf[GDBusPropertyInfoFlags])

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

  /** If @info is statically allocated does nothing. Otherwise increases the
    * reference count.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.gio.DBusPropertyInfo /* None */ =
    sn.gnome.gio.DBusPropertyInfo.fromRaw(
      g_dbus_property_info_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusPropertyInfo]]
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
    g_dbus_property_info_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusPropertyInfo]]
    )
  end unref

end DBusPropertyInfo

object DBusPropertyInfo:
  def fromRaw(ptr: Ptr[GDBusPropertyInfo]): DBusPropertyInfo =
    new DBusPropertyInfo(ptr)
end DBusPropertyInfo
