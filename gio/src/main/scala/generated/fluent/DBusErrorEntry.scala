package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDBusErrorEntry
import sn.gnome.glib.internal.{gchar, gint}

/** Struct used in g_dbus_error_register_error_domain().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusErrorEntry private[gnome] (raw: Ptr[GDBusErrorEntry]):

  def getUnsafeRawPointer(): Ptr[GDBusErrorEntry] = this.raw

  /** An error code.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def errorCode: Int /* None */ =
    (!raw).error_code.asInstanceOf[_root_.sn.gnome.glib.internal.gint]

  /** An error code.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def errorCode_=(value: Int /* None */ ): Unit = (!raw).error_code_=(
    gint(value).asInstanceOf[_root_.sn.gnome.glib.internal.gint]
  )

  /** The D-Bus error name to associate with @error_code.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dbusErrorName: scala.Predef.String /* None */ = (!raw).dbus_error_name
    .asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]

  /** The D-Bus error name to associate with @error_code.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dbusErrorName_=(
      value: scala.Predef.String /* None */
  )(using Zone): Unit = (!raw).dbus_error_name_=(
    toCString(value)
      .asInstanceOf[Ptr[gchar]]
      .asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
  )
end DBusErrorEntry

object DBusErrorEntry:
  def fromRaw(ptr: Ptr[GDBusErrorEntry]): DBusErrorEntry = new DBusErrorEntry(
    ptr
  )
end DBusErrorEntry
