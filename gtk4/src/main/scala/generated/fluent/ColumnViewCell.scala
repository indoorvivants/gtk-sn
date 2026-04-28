package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.ListItem
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkColumnViewCell

class ColumnViewCell(raw: Ptr[GtkColumnViewCell])
    extends ListItem(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  override def getChild(): Widget = new Widget(
    gtk_column_view_cell_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  override def getFocusable(): Boolean =
    gtk_column_view_cell_get_focusable(this.raw.asInstanceOf).value.!=(0)

  override def getItem(): Object = new Object(
    gtk_column_view_cell_get_item(this.raw.asInstanceOf).asInstanceOf
  )

  override def getPosition(): UInt = gtk_column_view_cell_get_position(
    this.raw.asInstanceOf
  ).value

  override def getSelected(): Boolean =
    gtk_column_view_cell_get_selected(this.raw.asInstanceOf).value.!=(0)

  override def setChild(child: Widget): Unit = gtk_column_view_cell_set_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  override def setFocusable(focusable: Boolean): Unit =
    gtk_column_view_cell_set_focusable(
      this.raw.asInstanceOf,
      gboolean(gint((if focusable == true then 1 else 0)))
    )

end ColumnViewCell
