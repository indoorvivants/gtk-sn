package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.DBusMethodInfo
import sn.gnome.gio.internal.GDBusMethodInfo
import sn.gnome.glib.internal.{gchar, gint}

/** Information about a method on an D-Bus interface.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusMethodInfo private[gnome] (raw: Ptr[GDBusMethodInfo]):

  def getUnsafeRawPointer(): Ptr[GDBusMethodInfo] = this.raw

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

  /** The name of the D-Bus method, e.g. @RequestName.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def name(using Zone): scala.Predef.String /* None */ =
    (!raw).name.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]

  /** The name of the D-Bus method, e.g. @RequestName.
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
    * structures or %NULL if there are no in arguments.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field in_args]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(DBusArgInfo), @type -> DataRecord(GDBusArgInfo*)))),ListMap(@type -> DataRecord(GDBusArgInfo**)))"
  )
  private def inArgs__ = ???

  /** A pointer to a %NULL-terminated array of pointers to #GDBusArgInfo
    * structures or %NULL if there are no out arguments.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field out_args]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(DBusArgInfo), @type -> DataRecord(GDBusArgInfo*)))),ListMap(@type -> DataRecord(GDBusArgInfo**)))"
  )
  private def outArgs__ = ???

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
  def ref(): sn.gnome.gio.DBusMethodInfo /* None */ =
    sn.gnome.gio.DBusMethodInfo.fromRaw(
      g_dbus_method_info_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusMethodInfo]]
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
    g_dbus_method_info_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusMethodInfo]]
    )
  end unref

end DBusMethodInfo

object DBusMethodInfo:
  def fromRaw(ptr: Ptr[GDBusMethodInfo]): DBusMethodInfo = new DBusMethodInfo(
    ptr
  )
end DBusMethodInfo
