package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.internal.GtkStringObject

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkStringObject` is the type of items in a `GtkStringList`.
  *
  * A `GtkStringObject` is a wrapper around a `const char*`; it has a
  * [property@Gtk.StringObject:string] property that can be used for property
  * bindings and expressions.
  */
class StringObject(raw: Ptr[GtkStringObject]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the string contained in a `GtkStringObject`.
    */
  def getString()(using Zone): String /* None */ = fromCString(
    gtk_string_object_get_string(
      this.raw.asInstanceOf[Ptr[GtkStringObject]]
    ).asInstanceOf
  )

end StringObject

object StringObject:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Wraps a string in an object for use with `GListModel`.
    */
  def apply(
      string: String | CString /* Some(CString) */
  )(using Zone): StringObject = new StringObject(
    gtk_string_object_new(__sn_extract_string(string)).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end StringObject
