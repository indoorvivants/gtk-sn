package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.internal.GtkStringObject

/** `GtkStringObject` is the type of items in a `GtkStringList`.
  *
  * A `GtkStringObject` is a wrapper around a `const char*`; it has a
  * [property@Gtk.StringObject:string] property that can be used for property
  * bindings and expressions.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class StringObject(raw: Ptr[GtkStringObject]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the string contained in a `GtkStringObject`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getString()(using Zone): String /* None */ = fromCString(
    gtk_string_object_get_string(
      this.raw.asInstanceOf[Ptr[GtkStringObject]]
    ).asInstanceOf
  )

end StringObject

object StringObject:
  /** Wraps a string in an object for use with `GListModel`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
