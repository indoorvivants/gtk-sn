package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.TreeListRow
import sn.gnome.gtk4.internal.GtkTreeListModel

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkTreeListModel` is a list model that can create child models on demand.
  */
class TreeListModel(raw: Ptr[GtkTreeListModel])
    extends Object(raw.asInstanceOf),
      ListModel:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the model is set to automatically expand new rows that get
    * added.
    *
    * This can be either rows added by changes to the underlying models or via
    * [method@Gtk.TreeListRow.set_expanded].
    */
  def getAutoexpand(): Boolean /* None */ = gtk_tree_list_model_get_autoexpand(
    this.raw.asInstanceOf[Ptr[GtkTreeListModel]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the row item corresponding to the child at index @position for
    * @self's
    *   root model.
    *
    * If @position is greater than the number of children in the root model,
    * %NULL is returned.
    *
    * Do not confuse this function with [method@Gtk.TreeListModel.get_row].
    */
  def getChildRow(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): TreeListRow /* None */ = new TreeListRow(
    gtk_tree_list_model_get_child_row(
      this.raw.asInstanceOf[Ptr[GtkTreeListModel]],
      guint(position)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the root model that @self was created with.
    */
  def getModel(): ListModel /* None */ = new ListModel.Abstract(
    gtk_tree_list_model_get_model(
      this.raw.asInstanceOf[Ptr[GtkTreeListModel]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the model is passing through original row items.
    *
    * If this function returns %FALSE, the `GListModel` functions for @self
    * return custom `GtkTreeListRow` objects. You need to call
    * [method@Gtk.TreeListRow.get_item] on these objects to get the original
    * item.
    *
    * If %TRUE, the values of the child models are passed through in their
    * original state. You then need to call [method@Gtk.TreeListModel.get_row]
    * to get the custom `GtkTreeListRow`s.
    */
  def getPassthrough(): Boolean /* None */ =
    gtk_tree_list_model_get_passthrough(
      this.raw.asInstanceOf[Ptr[GtkTreeListModel]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the row object for the given row.
    *
    * If @position is greater than the number of items in @self, %NULL is
    * returned.
    *
    * The row object can be used to expand and collapse rows as well as to
    * inspect its position in the tree. See its documentation for details.
    *
    * This row object is persistent and will refer to the current item as long
    * as the row is present in @self, independent of other rows being added or
    * removed.
    *
    * If @self is set to not be passthrough, this function is equivalent to
    * calling g_list_model_get_item().
    *
    * Do not confuse this function with
    * [method@Gtk.TreeListModel.get_child_row].
    */
  def getRow(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): TreeListRow /* None */ = new TreeListRow(
    gtk_tree_list_model_get_row(
      this.raw.asInstanceOf[Ptr[GtkTreeListModel]],
      guint(position)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the model should autoexpand.
    *
    * If set to %TRUE, the model will recursively expand all rows that get added
    * to the model. This can be either rows added by changes to the underlying
    * models or via [method@Gtk.TreeListRow.set_expanded].
    */
  def setAutoexpand(
      autoexpand: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_tree_list_model_set_autoexpand(
    this.raw.asInstanceOf[Ptr[GtkTreeListModel]],
    gboolean(gint((if autoexpand == true then 1 else 0)))
  )

end TreeListModel

object TreeListModel:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new empty `GtkTreeListModel` displaying @root with all rows
    * collapsed.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeListModelCreateModelFunc), @type -> DataRecord(GtkTreeListModelCreateModelFunc)))"
  )
  def `new`() = ???

end TreeListModel
