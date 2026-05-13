package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gtk4.SortType

trait TreeSortable:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Fills in @sort_column_id and @order with the current sort column and the
    * order. It returns %TRUE unless the @sort_column_id is
    * %GTK_TREE_SORTABLE_DEFAULT_SORT_COLUMN_ID or
    * %GTK_TREE_SORTABLE_UNSORTED_SORT_COLUMN_ID.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_sort_column_id]: Method get_sort_column_id contains an OUT parameter, which is not supported yet"
  )
  private def getSortColumnId__ = ???

  /** Returns %TRUE if the model has a default sort function. This is used
    * primarily by GtkTreeViewColumns in order to determine if a model can go
    * back to the default state, or not.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasDefaultSortFunc(): Boolean /* None */ =
    gtk_tree_sortable_has_default_sort_func(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeSortable]]
    ).value.!=(0)
  end hasDefaultSortFunc

  /** Sets the default comparison function used when sorting to be @sort_func.
    * If the current sort column id of @sortable is
    * %GTK_TREE_SORTABLE_DEFAULT_SORT_COLUMN_ID, then the model will sort using
    * this function.
    *
    * If @sort_func is %NULL, then there will be no default comparison function.
    * This means that once the model has been sorted, it can’t go back to the
    * default state. In this case, when the current sort column id of @sortable
    * is %GTK_TREE_SORTABLE_DEFAULT_SORT_COLUMN_ID, the model will be unsorted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_default_sort_func/<method parameters>/sort_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeIterCompareFunc), @type -> DataRecord(GtkTreeIterCompareFunc)))"
  )
  private def setDefaultSortFunc__ = ???

  /** Sets the current sort column to be @sort_column_id. The @sortable will
    * resort itself to reflect this change, after emitting a
    * `GtkTreeSortable::sort-column-changed` signal. @sort_column_id may either
    * be a regular column id, or one of the following special values:
    *
    *   - %GTK_TREE_SORTABLE_DEFAULT_SORT_COLUMN_ID: the default sort function
    *     will be used, if it is set
    *   - %GTK_TREE_SORTABLE_UNSORTED_SORT_COLUMN_ID: no sorting will occur
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSortColumnId(
      sort_column_id: Int /* Some(CInt) */,
      order: SortType /* Some(GtkSortType) */
  ): Unit /* None */ =
    gtk_tree_sortable_set_sort_column_id(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeSortable]],
      sort_column_id,
      order.raw
    )
  end setSortColumnId

  /** Sets the comparison function used when sorting to be @sort_func. If the
    * current sort column id of @sortable is the same as @sort_column_id, then
    * the model will sort using this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_sort_func/<method parameters>/sort_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeIterCompareFunc), @type -> DataRecord(GtkTreeIterCompareFunc)))"
  )
  private def setSortFunc__ = ???

  /** Emits a `GtkTreeSortable::sort-column-changed` signal on @sortable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def sortColumnChanged(): Unit /* None */ =
    gtk_tree_sortable_sort_column_changed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeSortable]]
    )
  end sortColumnChanged

end TreeSortable

object TreeSortable:
  class Abstract(raw: Ptr[Byte]) extends TreeSortable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end TreeSortable
