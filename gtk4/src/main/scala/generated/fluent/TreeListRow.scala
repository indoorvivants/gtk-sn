package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.{gboolean, gint, gpointer, guint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.TreeListRow
import sn.gnome.gtk4.internal.GtkTreeListRow

/** `GtkTreeListRow` is used by `GtkTreeListModel` to represent items.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TreeListRow(raw: Ptr[GtkTreeListRow]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** If @self is not expanded or @position is greater than the number of
    * children, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChildRow(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): TreeListRow /* None */ = new TreeListRow(
    gtk_tree_list_row_get_child_row(
      this.raw.asInstanceOf[Ptr[GtkTreeListRow]],
      guint(position)
    ).asInstanceOf
  )

  /** If the row is expanded, gets the model holding the children of @self.
    *
    * This model is the model created by the
    * [callback@Gtk.TreeListModelCreateModelFunc] and contains the original
    * items, no matter what value [property@Gtk.TreeListModel:passthrough] is
    * set to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChildren(): ListModel /* None */ = new ListModel.Abstract(
    gtk_tree_list_row_get_children(
      this.raw.asInstanceOf[Ptr[GtkTreeListRow]]
    ).asInstanceOf
  )

  /** Gets the depth of this row.
    *
    * Rows that correspond to items in the root model have a depth of zero, rows
    * corresponding to items of models of direct children of the root model have
    * a depth of 1 and so on.
    *
    * The depth of a row never changes until the row is removed from its model
    * at which point it will forever return 0.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDepth(): UInt /* None */ = gtk_tree_list_row_get_depth(
    this.raw.asInstanceOf[Ptr[GtkTreeListRow]]
  ).value

  /** Gets if a row is currently expanded.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getExpanded(): Boolean /* None */ = gtk_tree_list_row_get_expanded(
    this.raw.asInstanceOf[Ptr[GtkTreeListRow]]
  ).value.!=(0)

  /** Gets the item corresponding to this row,
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getItem(): Object /* None */ = new Object(
    gtk_tree_list_row_get_item(
      this.raw.asInstanceOf[Ptr[GtkTreeListRow]]
    ).asInstanceOf
  )

  /** Gets the row representing the parent for @self.
    *
    * That is the row that would need to be collapsed to make this row
    * disappear.
    *
    * If @self is a row corresponding to the root model, %NULL is returned.
    *
    * The value returned by this function never changes until the row is removed
    * from its model at which point it will forever return %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getParent(): TreeListRow /* None */ = new TreeListRow(
    gtk_tree_list_row_get_parent(
      this.raw.asInstanceOf[Ptr[GtkTreeListRow]]
    ).asInstanceOf
  )

  /** Returns the position in the `GtkTreeListModel` that @self occupies at the
    * moment.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPosition(): UInt /* None */ = gtk_tree_list_row_get_position(
    this.raw.asInstanceOf[Ptr[GtkTreeListRow]]
  ).value

  /** Checks if a row can be expanded.
    *
    * This does not mean that the row is actually expanded, this can be checked
    * with [method@Gtk.TreeListRow.get_expanded].
    *
    * If a row is expandable never changes until the row is removed from its
    * model at which point it will forever return %FALSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isExpandable(): Boolean /* None */ = gtk_tree_list_row_is_expandable(
    this.raw.asInstanceOf[Ptr[GtkTreeListRow]]
  ).value.!=(0)

  /** Expands or collapses a row.
    *
    * If a row is expanded, the model of calling the
    * [callback@Gtk.TreeListModelCreateModelFunc] for the row's item will be
    * inserted after this row. If a row is collapsed, those items will be
    * removed from the model.
    *
    * If the row is not expandable, this function does nothing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setExpanded(
      expanded: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_list_row_set_expanded(
    this.raw.asInstanceOf[Ptr[GtkTreeListRow]],
    gboolean(gint((if expanded == true then 1 else 0)))
  )

end TreeListRow
