package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.TreeDragSource
import sn.gnome.gtk4.fluent.TreeModel
import sn.gnome.gtk4.fluent.TreeSortable
import sn.gnome.gtk4.internal.GtkTreeIter
import sn.gnome.gtk4.internal.GtkTreeModelSort
import sn.gnome.gtk4.internal.GtkTreePath

class TreeModelSort(raw: Ptr[GtkTreeModelSort])
    extends Object(raw.asInstanceOf),
      TreeDragSource,
      TreeModel,
      TreeSortable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def clearCache(): Unit = gtk_tree_model_sort_clear_cache(
    this.raw.asInstanceOf
  )

  // Method convert_child_iter_to_iter contains an OUT parameter, which is not supported yet

  def convertChildPathToPath(child_path: Ptr[GtkTreePath]): Ptr[GtkTreePath] =
    gtk_tree_model_sort_convert_child_path_to_path(
      this.raw.asInstanceOf,
      child_path
    )

  // Method convert_iter_to_child_iter contains an OUT parameter, which is not supported yet

  def convertPathToChildPath(sorted_path: Ptr[GtkTreePath]): Ptr[GtkTreePath] =
    gtk_tree_model_sort_convert_path_to_child_path(
      this.raw.asInstanceOf,
      sorted_path
    )

  def getModel(): TreeModel = new TreeModel.Abstract(
    gtk_tree_model_sort_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  def iterIsValid(iter: Ptr[GtkTreeIter]): Boolean =
    gtk_tree_model_sort_iter_is_valid(this.raw.asInstanceOf, iter).value.!=(0)

  def resetDefaultSortFunc(): Unit =
    gtk_tree_model_sort_reset_default_sort_func(this.raw.asInstanceOf)

end TreeModelSort

object TreeModelSort:
  def withModel(child_model: TreeModel): TreeModelSort = new TreeModelSort(
    gtk_tree_model_sort_new_with_model(
      child_model.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end TreeModelSort
