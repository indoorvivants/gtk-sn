package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.TreeView
import sn.gnome.gtk4.internal.GtkSelectionMode
import sn.gnome.gtk4.internal.GtkTreeIter
import sn.gnome.gtk4.internal.GtkTreePath
import sn.gnome.gtk4.internal.GtkTreeSelection
import sn.gnome.gtk4.internal.GtkTreeSelectionForeachFunc
import sn.gnome.gtk4.internal.GtkTreeSelectionFunc

class TreeSelection(raw: Ptr[GtkTreeSelection])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def countSelectedRows(): Int = gtk_tree_selection_count_selected_rows(
    this.raw.asInstanceOf
  )

  def getMode(): GtkSelectionMode = gtk_tree_selection_get_mode(
    this.raw.asInstanceOf
  )

  def getSelectFunction(): GtkTreeSelectionFunc =
    gtk_tree_selection_get_select_function(this.raw.asInstanceOf)

  // Method get_selected contains an OUT parameter, which is not supported yet

  // Method get_selected_rows contains an OUT parameter, which is not supported yet

  def getTreeView(): TreeView = new TreeView(
    gtk_tree_selection_get_tree_view(this.raw.asInstanceOf).asInstanceOf
  )

  def getUserData(): Ptr[Byte] = gtk_tree_selection_get_user_data(
    this.raw.asInstanceOf
  ).value

  def iterIsSelected(iter: Ptr[GtkTreeIter]): Boolean =
    gtk_tree_selection_iter_is_selected(this.raw.asInstanceOf, iter).value.!=(0)

  def pathIsSelected(path: Ptr[GtkTreePath]): Boolean =
    gtk_tree_selection_path_is_selected(this.raw.asInstanceOf, path).value.!=(0)

  def selectAll(): Unit = gtk_tree_selection_select_all(this.raw.asInstanceOf)

  def selectIter(iter: Ptr[GtkTreeIter]): Unit =
    gtk_tree_selection_select_iter(this.raw.asInstanceOf, iter)

  def selectPath(path: Ptr[GtkTreePath]): Unit =
    gtk_tree_selection_select_path(this.raw.asInstanceOf, path)

  def selectRange(
      start_path: Ptr[GtkTreePath],
      end_path: Ptr[GtkTreePath]
  ): Unit =
    gtk_tree_selection_select_range(this.raw.asInstanceOf, start_path, end_path)

  def selectedForeach(
      func: GtkTreeSelectionForeachFunc,
      data: Ptr[Byte]
  ): Unit = gtk_tree_selection_selected_foreach(
    this.raw.asInstanceOf,
    func,
    gpointer(data)
  )

  def setMode(`type`: GtkSelectionMode): Unit =
    gtk_tree_selection_set_mode(this.raw.asInstanceOf, `type`)

  def setSelectFunction(
      func: GtkTreeSelectionFunc,
      data: Ptr[Byte],
      destroy: GDestroyNotify
  ): Unit = gtk_tree_selection_set_select_function(
    this.raw.asInstanceOf,
    func,
    gpointer(data),
    destroy
  )

  def unselectAll(): Unit = gtk_tree_selection_unselect_all(
    this.raw.asInstanceOf
  )

  def unselectIter(iter: Ptr[GtkTreeIter]): Unit =
    gtk_tree_selection_unselect_iter(this.raw.asInstanceOf, iter)

  def unselectPath(path: Ptr[GtkTreePath]): Unit =
    gtk_tree_selection_unselect_path(this.raw.asInstanceOf, path)

  def unselectRange(
      start_path: Ptr[GtkTreePath],
      end_path: Ptr[GtkTreePath]
  ): Unit = gtk_tree_selection_unselect_range(
    this.raw.asInstanceOf,
    start_path,
    end_path
  )

end TreeSelection
