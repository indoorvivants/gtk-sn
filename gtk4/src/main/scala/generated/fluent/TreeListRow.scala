package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.TreeListRow
import sn.gnome.gtk4.internal.GtkTreeListRow

class TreeListRow(raw: Ptr[GtkTreeListRow]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getChildRow(position: UInt): TreeListRow = new TreeListRow(
    gtk_tree_list_row_get_child_row(
      this.raw.asInstanceOf,
      guint(position)
    ).asInstanceOf
  )

  def getChildren(): ListModel = new ListModel.Abstract(
    gtk_tree_list_row_get_children(this.raw.asInstanceOf).asInstanceOf
  )

  def getDepth(): UInt = gtk_tree_list_row_get_depth(
    this.raw.asInstanceOf
  ).value

  def getExpanded(): Boolean =
    gtk_tree_list_row_get_expanded(this.raw.asInstanceOf).value.!=(0)

  def getItem(): Object = new Object(
    gtk_tree_list_row_get_item(this.raw.asInstanceOf).asInstanceOf
  )

  def getParent(): TreeListRow = new TreeListRow(
    gtk_tree_list_row_get_parent(this.raw.asInstanceOf).asInstanceOf
  )

  def getPosition(): UInt = gtk_tree_list_row_get_position(
    this.raw.asInstanceOf
  ).value

  def isExpandable(): Boolean =
    gtk_tree_list_row_is_expandable(this.raw.asInstanceOf).value.!=(0)

  def setExpanded(expanded: Boolean): Unit = gtk_tree_list_row_set_expanded(
    this.raw.asInstanceOf,
    gboolean(gint((if expanded == true then 1 else 0)))
  )

end TreeListRow
