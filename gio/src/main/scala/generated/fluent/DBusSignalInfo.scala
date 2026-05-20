package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.DBusSignalInfo
import sn.gnome.gio.internal.GDBusSignalInfo
import sn.gnome.glib.internal.{gchar, gint}

/** Information about a signal on a D-Bus interface.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusSignalInfo private[gnome] (raw: Ptr[GDBusSignalInfo]):

  def getUnsafeRawPointer(): Ptr[GDBusSignalInfo] = this.raw

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

  /** The name of the D-Bus signal, e.g. "NameOwnerChanged".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def name(using Zone): scala.Predef.String /* None */ =
    (!raw).name.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]

  /** The name of the D-Bus signal, e.g. "NameOwnerChanged".
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

  /** A pointer to a %NULL-terminated array of pointers to #GDBusArgInfo
    * structures or %NULL if there are no arguments.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field args]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(DBusArgInfo), @type -> DataRecord(GDBusArgInfo*)))),ListMap(@type -> DataRecord(GDBusArgInfo**)))"
  )
  private def args__ = ???

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
  def ref(): sn.gnome.gio.DBusSignalInfo /* None */ =
    sn.gnome.gio.DBusSignalInfo.fromRaw(
      g_dbus_signal_info_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusSignalInfo]]
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
    g_dbus_signal_info_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusSignalInfo]]
    )
  end unref

end DBusSignalInfo

object DBusSignalInfo:
  def fromRaw(ptr: Ptr[GDBusSignalInfo]): DBusSignalInfo = new DBusSignalInfo(
    ptr
  )
end DBusSignalInfo
