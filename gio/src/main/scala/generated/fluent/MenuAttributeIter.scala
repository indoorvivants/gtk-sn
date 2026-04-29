package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GMenuAttributeIter
import sn.gnome.glib.internal.GVariant
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GMenuAttributeIter is an opaque structure type. You must access it using
  * the functions below.
  */
class MenuAttributeIter(raw: Ptr[GMenuAttributeIter])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the name of the attribute at the current iterator position, as a
    * string.
    *
    * The iterator is not advanced.
    */
  def getName()(using Zone): String = fromCString(
    g_menu_attribute_iter_get_name(this.raw.asInstanceOf).asInstanceOf
  )

  @annotation.compileTimeOnly(
    "Method get_next contains an OUT parameter, which is not supported yet"
  )
  def getNext() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of the attribute at the current iterator position.
    *
    * The iterator is not advanced.
    */
  def getValue(): Ptr[GVariant] = g_menu_attribute_iter_get_value(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Attempts to advance the iterator to the next (possibly first) attribute.
    *
    * %TRUE is returned on success, or %FALSE if there are no more attributes.
    *
    * You must call this function when you first acquire the iterator to advance
    * it to the first attribute (and determine if the first attribute exists at
    * all).
    */
  def next(): Boolean =
    g_menu_attribute_iter_next(this.raw.asInstanceOf).value.!=(0)

end MenuAttributeIter
