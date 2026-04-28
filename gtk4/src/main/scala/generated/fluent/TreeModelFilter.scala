package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.TreeDragSource
import sn.gnome.gtk4.fluent.TreeModel
import sn.gnome.gtk4.internal.GtkTreeModelFilter
import sn.gnome.gtk4.internal.GtkTreeModelFilterVisibleFunc
import sn.gnome.gtk4.internal.GtkTreePath

class TreeModelFilter(raw: Ptr[GtkTreeModelFilter])
    extends Object(raw.asInstanceOf),
      TreeDragSource,
      TreeModel:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def clearCache(): Unit = gtk_tree_model_filter_clear_cache(
    this.raw.asInstanceOf
  )

  // Method convert_child_iter_to_iter contains an OUT parameter, which is not supported yet

  def convertChildPathToPath(child_path: Ptr[GtkTreePath]): Ptr[GtkTreePath] =
    gtk_tree_model_filter_convert_child_path_to_path(
      this.raw.asInstanceOf,
      child_path
    )

  // Method convert_iter_to_child_iter contains an OUT parameter, which is not supported yet

  def convertPathToChildPath(filter_path: Ptr[GtkTreePath]): Ptr[GtkTreePath] =
    gtk_tree_model_filter_convert_path_to_child_path(
      this.raw.asInstanceOf,
      filter_path
    )

  def getModel(): TreeModel = new TreeModel.Abstract(
    gtk_tree_model_filter_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  def refilter(): Unit = gtk_tree_model_filter_refilter(this.raw.asInstanceOf)

  // Method set_modify_func contains an array parameter, which is not supported yet

  def setVisibleColumn(column: Int): Unit =
    gtk_tree_model_filter_set_visible_column(this.raw.asInstanceOf, column)

  def setVisibleFunc(
      func: GtkTreeModelFilterVisibleFunc,
      data: Ptr[Byte],
      destroy: GDestroyNotify
  ): Unit = gtk_tree_model_filter_set_visible_func(
    this.raw.asInstanceOf,
    func,
    gpointer(data),
    destroy
  )

end TreeModelFilter
