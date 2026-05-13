package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{ListItem, Widget}
import sn.gnome.gtk4.internal.GtkColumnViewCell

/** `GtkColumnViewCell` is used by [class@Gtk.ColumnViewColumn] to represent
  * items in a cell in [class@Gtk.ColumnView].
  *
  * The `GtkColumnViewCell`s are managed by the columnview widget (with its
  * factory) and cannot be created by applications, but they need to be
  * populated by application code. This is done by calling
  * [method@Gtk.ColumnViewCell.set_child].
  *
  * `GtkColumnViewCell`s exist in 2 stages:
  *
  *   1. The unbound stage where the listitem is not currently connected to an
  *      item in the list. In that case, the [property@Gtk.ColumnViewCell:item]
  *      property is set to %NULL.
  *   2. The bound stage where the listitem references an item from the list.
  *      The [property@Gtk.ColumnViewCell:item] property is not %NULL.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ColumnViewCell private[gnome] (raw: Ptr[GtkColumnViewCell])
    extends ListItem(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the child previously set via gtk_column_view_cell_set_child() or
    * %NULL if none was set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def getChild()(using
      Runtime
  ): sn.gnome.gtk4.fluent.Widget /* None */ =
    sn.gnome.gtk4.fluent.Widget.applyUnsafe(
      gtk_column_view_cell_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewCell]]
      ).asInstanceOf
    )
  end getChild

  /** Checks if a list item has been set to be focusable via
    * gtk_column_view_cell_set_focusable().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def getFocusable(): Boolean /* None */ =
    gtk_column_view_cell_get_focusable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewCell]]
    ).value.!=(0)
  end getFocusable

  /** Gets the model item that associated with @self.
    *
    * If @self is unbound, this function returns %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def getItem()(using
      Runtime
  ): sn.gnome.gobject.fluent.Object /* None */ =
    sn.gnome.gobject.fluent.Object.applyUnsafe(
      gtk_column_view_cell_get_item(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewCell]]
      ).asInstanceOf
    )
  end getItem

  /** Gets the position in the model that @self currently displays.
    *
    * If @self is unbound, %GTK_INVALID_LIST_POSITION is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def getPosition(): UInt /* None */ =
    gtk_column_view_cell_get_position(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewCell]]
    ).value
  end getPosition

  /** Checks if the item is displayed as selected.
    *
    * The selected state is maintained by the liste widget and its model and
    * cannot be set otherwise.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def getSelected(): Boolean /* None */ =
    gtk_column_view_cell_get_selected(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewCell]]
    ).value.!=(0)
  end getSelected

  /** Sets the child to be used for this listitem.
    *
    * This function is typically called by applications when setting up a
    * listitem so that the widget can be reused when binding it multiple times.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def setChild(
      child: Option[sn.gnome.gtk4.fluent.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_column_view_cell_set_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewCell]],
      child
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setChild

  /** Sets @self to be focusable.
    *
    * If an item is focusable, it can be focused using the keyboard. This works
    * similar to [method@Gtk.Widget.set_focusable].
    *
    * Note that if items are not focusable, the keyboard cannot be used to
    * activate them and selecting only works if one of the listitem's children
    * is focusable.
    *
    * By default, list items are focusable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def setFocusable(
      focusable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_column_view_cell_set_focusable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkColumnViewCell]],
      gboolean(gint((if focusable == true then 1 else 0)))
    )
  end setFocusable

end ColumnViewCell

object ColumnViewCell:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkColumnViewCell])(using Runtime) =
    summon[Runtime].getOrCreate[ColumnViewCell](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ColumnViewCell(ptr)
    )

end ColumnViewCell
