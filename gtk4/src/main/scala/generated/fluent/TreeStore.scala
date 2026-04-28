package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GValue
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.TreeDragDest
import sn.gnome.gtk4.fluent.TreeDragSource
import sn.gnome.gtk4.fluent.TreeModel
import sn.gnome.gtk4.fluent.TreeSortable
import sn.gnome.gtk4.internal.GtkTreeIter
import sn.gnome.gtk4.internal.GtkTreeStore

class TreeStore(raw: Ptr[GtkTreeStore])
    extends Object(raw.asInstanceOf),
      Buildable,
      TreeDragDest,
      TreeDragSource,
      TreeModel,
      TreeSortable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  // Method append contains an OUT parameter, which is not supported yet

  def clear(): Unit = gtk_tree_store_clear(this.raw.asInstanceOf)

  // Method insert contains an OUT parameter, which is not supported yet

  // Method insert_after contains an OUT parameter, which is not supported yet

  // Method insert_before contains an OUT parameter, which is not supported yet

  // Method insert_with_values contains an OUT parameter, which is not supported yet

  // Method insert_with_valuesv contains an array parameter, which is not supported yet

  def isAncestor(
      iter: Ptr[GtkTreeIter],
      descendant: Ptr[GtkTreeIter]
  ): Boolean =
    gtk_tree_store_is_ancestor(this.raw.asInstanceOf, iter, descendant).value
      .!=(0)

  def iterDepth(iter: Ptr[GtkTreeIter]): Int =
    gtk_tree_store_iter_depth(this.raw.asInstanceOf, iter)

  def iterIsValid(iter: Ptr[GtkTreeIter]): Boolean =
    gtk_tree_store_iter_is_valid(this.raw.asInstanceOf, iter).value.!=(0)

  def moveAfter(iter: Ptr[GtkTreeIter], position: Ptr[GtkTreeIter]): Unit =
    gtk_tree_store_move_after(this.raw.asInstanceOf, iter, position)

  def moveBefore(iter: Ptr[GtkTreeIter], position: Ptr[GtkTreeIter]): Unit =
    gtk_tree_store_move_before(this.raw.asInstanceOf, iter, position)

  // Method prepend contains an OUT parameter, which is not supported yet

  def remove(iter: Ptr[GtkTreeIter]): Boolean =
    gtk_tree_store_remove(this.raw.asInstanceOf, iter).value.!=(0)

  // Method reorder contains an array parameter, which is not supported yet

  inline def set(iter: Ptr[GtkTreeIter], args: Any*): Unit =
    gtk_tree_store_set(this.raw.asInstanceOf, iter, args*)

  // Method set_column_types contains an array parameter, which is not supported yet

  def setValist(iter: Ptr[GtkTreeIter], var_args: CVarArgList): Unit =
    gtk_tree_store_set_valist(this.raw.asInstanceOf, iter, var_args)

  def setValue(iter: Ptr[GtkTreeIter], column: Int, value: Ptr[GValue]): Unit =
    gtk_tree_store_set_value(this.raw.asInstanceOf, iter, column, value)

  // Method set_valuesv contains an array parameter, which is not supported yet

  def swap(a: Ptr[GtkTreeIter], b: Ptr[GtkTreeIter]): Unit =
    gtk_tree_store_swap(this.raw.asInstanceOf, a, b)

end TreeStore

object TreeStore:
  inline def apply(n_columns: Int, args: Any*): TreeStore = new TreeStore(
    gtk_tree_store_new(n_columns, args*).asInstanceOf
  )
  // constructor newv contains an array parameter, which is not supported yet

end TreeStore
