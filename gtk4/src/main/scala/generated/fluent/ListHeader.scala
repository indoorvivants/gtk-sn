package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkListHeader

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkListHeader` is used by list widgets to represent the headers they
  * display.
  *
  * `GtkListHeader` objects are managed just like [class@Gtk.ListItem] objects
  * via their factory, but provide a different set of properties suitable for
  * managing the header instead of individual items.
  */
class ListHeader(raw: Ptr[GtkListHeader]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child previously set via gtk_list_header_set_child() or %NULL if
    * none was set.
    */
  def getChild(): Widget = new Widget(
    gtk_list_header_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the end position in the model of the section that @self is currently
    * the header for.
    *
    * If @self is unbound, %GTK_INVALID_LIST_POSITION is returned.
    */
  def getEnd(): UInt = gtk_list_header_get_end(this.raw.asInstanceOf).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the model item at the start of the section. This is the item that
    * occupies the list model at position [property@Gtk.ListHeader:start].
    *
    * If @self is unbound, this function returns %NULL.
    */
  def getItem(): Object = new Object(
    gtk_list_header_get_item(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the the number of items in the section.
    *
    * If @self is unbound, 0 is returned.
    */
  def getNItems(): UInt = gtk_list_header_get_n_items(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the start position in the model of the section that @self is
    * currently the header for.
    *
    * If @self is unbound, %GTK_INVALID_LIST_POSITION is returned.
    */
  def getStart(): UInt = gtk_list_header_get_start(this.raw.asInstanceOf).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the child to be used for this listitem.
    *
    * This function is typically called by applications when setting up a header
    * so that the widget can be reused when binding it multiple times.
    */
  def setChild(child: Widget): Unit = gtk_list_header_set_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

end ListHeader
