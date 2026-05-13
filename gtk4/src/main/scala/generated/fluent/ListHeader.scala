package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.Widget
import sn.gnome.gtk4.internal.GtkListHeader

/** `GtkListHeader` is used by list widgets to represent the headers they
  * display.
  *
  * `GtkListHeader` objects are managed just like [class@Gtk.ListItem] objects
  * via their factory, but provide a different set of properties suitable for
  * managing the header instead of individual items.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ListHeader private[gnome] (raw: Ptr[GtkListHeader])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the child previously set via gtk_list_header_set_child() or %NULL if
    * none was set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_list_header_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkListHeader]]
      ).asInstanceOf
    )
  end getChild

  /** Gets the end position in the model of the section that @self is currently
    * the header for.
    *
    * If @self is unbound, %GTK_INVALID_LIST_POSITION is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEnd(): UInt /* None */ =
    gtk_list_header_get_end(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkListHeader]]
    ).value
  end getEnd

  /** Gets the model item at the start of the section. This is the item that
    * occupies the list model at position [property@Gtk.ListHeader:start].
    *
    * If @self is unbound, this function returns %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getItem()(using Runtime): sn.gnome.gobject.Object /* None */ =
    sn.gnome.gobject.Object.applyUnsafe(
      gtk_list_header_get_item(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkListHeader]]
      ).asInstanceOf
    )
  end getItem

  /** Gets the the number of items in the section.
    *
    * If @self is unbound, 0 is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNItems(): UInt /* None */ =
    gtk_list_header_get_n_items(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkListHeader]]
    ).value
  end getNItems

  /** Gets the start position in the model of the section that @self is
    * currently the header for.
    *
    * If @self is unbound, %GTK_INVALID_LIST_POSITION is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStart(): UInt /* None */ =
    gtk_list_header_get_start(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkListHeader]]
    ).value
  end getStart

  /** Sets the child to be used for this listitem.
    *
    * This function is typically called by applications when setting up a header
    * so that the widget can be reused when binding it multiple times.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setChild(child: Option[sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */ ])(
      using Runtime
  ): Unit /* None */ =
    gtk_list_header_set_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkListHeader]],
      child
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setChild

end ListHeader

object ListHeader:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkListHeader])(using Runtime) =
    summon[Runtime].getOrCreate[ListHeader](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ListHeader(ptr)
    )

end ListHeader
