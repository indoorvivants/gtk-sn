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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkTreeListRow` is used by `GtkTreeListModel` to represent items.
  *
  * It allows navigating the model as a tree and modify the state of rows.
  *
  * `GtkTreeListRow` instances are created by a `GtkTreeListModel` only when the
  * [property@Gtk.TreeListModel:passthrough] property is not set.
  *
  * There are various support objects that can make use of `GtkTreeListRow`
  * objects, such as the [class@Gtk.TreeExpander] widget that allows displaying
  * an icon to expand or collapse a row or [class@Gtk.TreeListRowSorter] that
  * makes it possible to sort trees properly.
  */
class TreeListRow(raw: Ptr[GtkTreeListRow]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If @self is not expanded or @position is greater than the number of
    * children, %NULL is returned.
    */
  def getChildRow(position: UInt): TreeListRow = new TreeListRow(
    gtk_tree_list_row_get_child_row(
      this.raw.asInstanceOf,
      guint(position)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If the row is expanded, gets the model holding the children of @self.
    *
    * This model is the model created by the
    * [callback@Gtk.TreeListModelCreateModelFunc] and contains the original
    * items, no matter what value [property@Gtk.TreeListModel:passthrough] is
    * set to.
    */
  def getChildren(): ListModel = new ListModel.Abstract(
    gtk_tree_list_row_get_children(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the depth of this row.
    *
    * Rows that correspond to items in the root model have a depth of zero, rows
    * corresponding to items of models of direct children of the root model have
    * a depth of 1 and so on.
    *
    * The depth of a row never changes until the row is removed from its model
    * at which point it will forever return 0.
    */
  def getDepth(): UInt = gtk_tree_list_row_get_depth(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets if a row is currently expanded.
    */
  def getExpanded(): Boolean =
    gtk_tree_list_row_get_expanded(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the item corresponding to this row,
    */
  def getItem(): Object = new Object(
    gtk_tree_list_row_get_item(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the row representing the parent for @self.
    *
    * That is the row that would need to be collapsed to make this row
    * disappear.
    *
    * If @self is a row corresponding to the root model, %NULL is returned.
    *
    * The value returned by this function never changes until the row is removed
    * from its model at which point it will forever return %NULL.
    */
  def getParent(): TreeListRow = new TreeListRow(
    gtk_tree_list_row_get_parent(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the position in the `GtkTreeListModel` that @self occupies at the
    * moment.
    */
  def getPosition(): UInt = gtk_tree_list_row_get_position(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if a row can be expanded.
    *
    * This does not mean that the row is actually expanded, this can be checked
    * with [method@Gtk.TreeListRow.get_expanded].
    *
    * If a row is expandable never changes until the row is removed from its
    * model at which point it will forever return %FALSE.
    */
  def isExpandable(): Boolean =
    gtk_tree_list_row_is_expandable(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Expands or collapses a row.
    *
    * If a row is expanded, the model of calling the
    * [callback@Gtk.TreeListModelCreateModelFunc] for the row's item will be
    * inserted after this row. If a row is collapsed, those items will be
    * removed from the model.
    *
    * If the row is not expandable, this function does nothing.
    */
  def setExpanded(expanded: Boolean): Unit = gtk_tree_list_row_set_expanded(
    this.raw.asInstanceOf,
    gboolean(gint((if expanded == true then 1 else 0)))
  )

end TreeListRow
