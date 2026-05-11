package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.TreeListRow
import sn.gnome.gtk4.internal.GtkTreeListModel

/** `GtkTreeListModel` is a list model that can create child models on demand.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TreeListModel private[gnome] (raw: Ptr[GtkTreeListModel])
    extends Object(raw.asInstanceOf),
      ListModel:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets whether the model is set to automatically expand new rows that get
    * added.
    *
    * This can be either rows added by changes to the underlying models or via
    * [method@Gtk.TreeListRow.set_expanded].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAutoexpand(): Boolean /* None */ =
    gtk_tree_list_model_get_autoexpand(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeListModel]]
    ).value.!=(0)
  end getAutoexpand

  /** Gets the row item corresponding to the child at index @position for
    * @self's
    *   root model.
    *
    * If @position is greater than the number of children in the root model,
    * %NULL is returned.
    *
    * Do not confuse this function with [method@Gtk.TreeListModel.get_row].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChildRow(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  )(using Runtime): sn.gnome.gtk4.fluent.TreeListRow /* None */ =
    sn.gnome.gtk4.fluent.TreeListRow.applyUnsafe(
      gtk_tree_list_model_get_child_row(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeListModel]],
        guint(position)
      ).asInstanceOf
    )
  end getChildRow

  /** Gets the root model that @self was created with.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModel(): ListModel /* None */ =
    new ListModel.Abstract(
      gtk_tree_list_model_get_model(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeListModel]]
      ).asInstanceOf
    )
  end getModel

  /** Gets whether the model is passing through original row items.
    *
    * If this function returns %FALSE, the `GListModel` functions for @self
    * return custom `GtkTreeListRow` objects. You need to call
    * [method@Gtk.TreeListRow.get_item] on these objects to get the original
    * item.
    *
    * If %TRUE, the values of the child models are passed through in their
    * original state. You then need to call [method@Gtk.TreeListModel.get_row]
    * to get the custom `GtkTreeListRow`s.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPassthrough(): Boolean /* None */ =
    gtk_tree_list_model_get_passthrough(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeListModel]]
    ).value.!=(0)
  end getPassthrough

  /** Gets the row object for the given row.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRow(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  )(using Runtime): sn.gnome.gtk4.fluent.TreeListRow /* None */ =
    sn.gnome.gtk4.fluent.TreeListRow.applyUnsafe(
      gtk_tree_list_model_get_row(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeListModel]],
        guint(position)
      ).asInstanceOf
    )
  end getRow

  /** Sets whether the model should autoexpand.
    *
    * If set to %TRUE, the model will recursively expand all rows that get added
    * to the model. This can be either rows added by changes to the underlying
    * models or via [method@Gtk.TreeListRow.set_expanded].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAutoexpand(
      autoexpand: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_tree_list_model_set_autoexpand(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeListModel]],
      gboolean(gint((if autoexpand == true then 1 else 0)))
    )
  end setAutoexpand

end TreeListModel

object TreeListModel:
  def applyUnsafe(ptr: Ptr[GtkTreeListModel])(using Runtime) =
    summon[Runtime].getOrCreate[TreeListModel](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new TreeListModel(ptr)
    )

  /** Creates a new empty `GtkTreeListModel` displaying @root with all rows
    * collapsed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[create_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeListModelCreateModelFunc), @type -> DataRecord(GtkTreeListModelCreateModelFunc)))"
  )
  private def `new`() = ???

end TreeListModel
