package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.DBusAnnotationInfo
import sn.gnome.gio.internal.GDBusAnnotationInfo
import sn.gnome.glib.internal.{gchar, gint}

/** Information about an annotation.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusAnnotationInfo private[gnome] (raw: Ptr[GDBusAnnotationInfo]):

  def getUnsafeRawPointer(): Ptr[GDBusAnnotationInfo] = this.raw

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

  /** The name of the annotation, e.g. "org.freedesktop.DBus.Deprecated".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def key(using Zone): scala.Predef.String /* None */ =
    (!raw).key.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]

  /** The name of the annotation, e.g. "org.freedesktop.DBus.Deprecated".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def key_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).key_=(
      toCString(value)
        .asInstanceOf[Ptr[gchar]]
        .asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
    )

  /** The value of the annotation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def value(using Zone): scala.Predef.String /* None */ =
    (!raw).value.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]

  /** The value of the annotation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def value_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).value_=(
      toCString(value)
        .asInstanceOf[Ptr[gchar]]
        .asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
    )

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
  def ref(): sn.gnome.gio.DBusAnnotationInfo /* None */ =
    sn.gnome.gio.DBusAnnotationInfo.fromRaw(
      g_dbus_annotation_info_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusAnnotationInfo]]
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
    g_dbus_annotation_info_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusAnnotationInfo]]
    )
  end unref

end DBusAnnotationInfo

object DBusAnnotationInfo:
  def fromRaw(ptr: Ptr[GDBusAnnotationInfo]): DBusAnnotationInfo =
    new DBusAnnotationInfo(ptr)
end DBusAnnotationInfo
