package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.internal.GtkStringList

class StringList(raw: Ptr[GtkStringList])
    extends Object(raw.asInstanceOf),
      ListModel,
      Buildable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def append(string: String | CString)(using Zone): Unit =
    gtk_string_list_append(this.raw.asInstanceOf, __sn_extract_string(string))

  def getString(position: UInt)(using Zone): String = fromCString(
    gtk_string_list_get_string(
      this.raw.asInstanceOf,
      guint(position)
    ).asInstanceOf
  )

  def remove(position: UInt): Unit =
    gtk_string_list_remove(this.raw.asInstanceOf, guint(position))

  // Method splice contains an array parameter, which is not supported yet

  def take(string: String | CString)(using Zone): Unit =
    gtk_string_list_take(this.raw.asInstanceOf, __sn_extract_string(string))

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end StringList
