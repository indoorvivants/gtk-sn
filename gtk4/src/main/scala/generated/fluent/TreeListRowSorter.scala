package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.Sorter
import sn.gnome.gtk4.internal.GtkTreeListRowSorter

/** `GtkTreeListRowSorter` is a special-purpose sorter that will apply a given
  * sorter to the levels in a tree.
  *
  * Here is an example for setting up a column view with a tree model and a
  * `GtkTreeListSorter`:
  *
  * ```c
  * column_sorter = gtk_column_view_get_sorter (view);
  * sorter = gtk_tree_list_row_sorter_new (g_object_ref (column_sorter));
  * sort_model = gtk_sort_list_model_new (tree_model, sorter);
  * selection = gtk_single_selection_new (sort_model);
  * gtk_column_view_set_model (view, G_LIST_MODEL (selection));
  * ```
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TreeListRowSorter private[gnome] (raw: Ptr[GtkTreeListRowSorter])
    extends Sorter(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the sorter used by @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSorter()(using Runtime): sn.gnome.gtk4.fluent.Sorter /* None */ =
    sn.gnome.gtk4.fluent.Sorter.applyUnsafe(
      gtk_tree_list_row_sorter_get_sorter(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeListRowSorter]]
      ).asInstanceOf
    )
  end getSorter

  /** Sets the sorter to use for items with the same parent.
    *
    * This sorter will be passed the [property@Gtk.TreeListRow:item] of the tree
    * list rows passed to @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSorter(
      sorter: Option[sn.gnome.gtk4.fluent.Sorter /* Some(Ptr[GtkSorter]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_tree_list_row_sorter_set_sorter(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeListRowSorter]],
      sorter
        .map[Ptr[GtkSorter]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkSorter]])
    )
  end setSorter

end TreeListRowSorter

object TreeListRowSorter:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkTreeListRowSorter])(using Runtime) =
    summon[Runtime].getOrCreate[TreeListRowSorter](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new TreeListRowSorter(ptr)
    )

  /** Create a special-purpose sorter that applies the sorting of @sorter to the
    * levels of a `GtkTreeListModel`.
    *
    * Note that this sorter relies on [property@Gtk.TreeListModel:passthrough]
    * being %FALSE as it can only sort [class@Gtk.TreeListRow]s.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      sorter: Option[sn.gnome.gtk4.fluent.Sorter /* Some(Ptr[GtkSorter]) */ ]
  )(using Runtime): TreeListRowSorter =
    val raw: Ptr[Byte] = gtk_tree_list_row_sorter_new(
      sorter
        .map[Ptr[GtkSorter]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkSorter]])
    ).asInstanceOf
    summon[Runtime].getOrCreate[TreeListRowSorter](
      raw,
      r => TreeListRowSorter.applyUnsafe(r.asInstanceOf)
    )
  end apply
end TreeListRowSorter
