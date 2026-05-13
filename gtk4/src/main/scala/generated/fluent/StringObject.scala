package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
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
class StringObject private[gnome] (raw: Ptr[GtkStringObject])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the string contained in a `GtkStringObject`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getString()(using Zone): String /* None */ =
    fromCString(
      gtk_string_object_get_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkStringObject]]
      ).asInstanceOf
    )
  end getString

end StringObject

object StringObject:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkStringObject])(using Runtime) =
    summon[Runtime].getOrCreate[StringObject](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new StringObject(ptr)
    )

  /** Wraps a string in an object for use with `GListModel`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      string: String /* Some(CString) */
  )(using Zone, Runtime): StringObject =
    val raw: Ptr[Byte] = gtk_string_object_new(toCString(string)).asInstanceOf
    summon[Runtime].getOrCreate[StringObject](
      raw,
      r => StringObject.applyUnsafe(r.asInstanceOf)
    )
  end apply
end StringObject
