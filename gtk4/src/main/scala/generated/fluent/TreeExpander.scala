package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.TreeListRow
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkTreeExpander

class TreeExpander(raw: Ptr[GtkTreeExpander])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getChild(): Widget = new Widget(
    gtk_tree_expander_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getHideExpander(): Boolean =
    gtk_tree_expander_get_hide_expander(this.raw.asInstanceOf).value.!=(0)

  def getIndentForDepth(): Boolean =
    gtk_tree_expander_get_indent_for_depth(this.raw.asInstanceOf).value.!=(0)

  def getIndentForIcon(): Boolean =
    gtk_tree_expander_get_indent_for_icon(this.raw.asInstanceOf).value.!=(0)

  def getItem(): Object = new Object(
    gtk_tree_expander_get_item(this.raw.asInstanceOf).asInstanceOf
  )

  def getListRow(): TreeListRow = new TreeListRow(
    gtk_tree_expander_get_list_row(this.raw.asInstanceOf).asInstanceOf
  )

  def setChild(child: Widget): Unit = gtk_tree_expander_set_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def setHideExpander(hide_expander: Boolean): Unit =
    gtk_tree_expander_set_hide_expander(
      this.raw.asInstanceOf,
      gboolean(gint((if hide_expander == true then 1 else 0)))
    )

  def setIndentForDepth(indent_for_depth: Boolean): Unit =
    gtk_tree_expander_set_indent_for_depth(
      this.raw.asInstanceOf,
      gboolean(gint((if indent_for_depth == true then 1 else 0)))
    )

  def setIndentForIcon(indent_for_icon: Boolean): Unit =
    gtk_tree_expander_set_indent_for_icon(
      this.raw.asInstanceOf,
      gboolean(gint((if indent_for_icon == true then 1 else 0)))
    )

  def setListRow(list_row: TreeListRow): Unit = gtk_tree_expander_set_list_row(
    this.raw.asInstanceOf,
    list_row.getUnsafeRawPointer().asInstanceOf
  )

end TreeExpander

object TreeExpander:
  def apply(): TreeExpander = new TreeExpander(
    gtk_tree_expander_new().asInstanceOf
  )
end TreeExpander
