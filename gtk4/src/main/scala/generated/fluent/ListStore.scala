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
import sn.gnome.gtk4.internal.GtkListStore
import sn.gnome.gtk4.internal.GtkTreeIter

class ListStore(raw: Ptr[GtkListStore])
    extends Object(raw.asInstanceOf),
      Buildable,
      TreeDragDest,
      TreeDragSource,
      TreeModel,
      TreeSortable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  // Method append contains an OUT parameter, which is not supported yet

  def clear(): Unit = gtk_list_store_clear(this.raw.asInstanceOf)

  // Method insert contains an OUT parameter, which is not supported yet

  // Method insert_after contains an OUT parameter, which is not supported yet

  // Method insert_before contains an OUT parameter, which is not supported yet

  // Method insert_with_values contains an OUT parameter, which is not supported yet

  // Method insert_with_valuesv contains an array parameter, which is not supported yet

  def iterIsValid(iter: Ptr[GtkTreeIter]): Boolean =
    gtk_list_store_iter_is_valid(this.raw.asInstanceOf, iter).value.!=(0)

  def moveAfter(iter: Ptr[GtkTreeIter], position: Ptr[GtkTreeIter]): Unit =
    gtk_list_store_move_after(this.raw.asInstanceOf, iter, position)

  def moveBefore(iter: Ptr[GtkTreeIter], position: Ptr[GtkTreeIter]): Unit =
    gtk_list_store_move_before(this.raw.asInstanceOf, iter, position)

  // Method prepend contains an OUT parameter, which is not supported yet

  def remove(iter: Ptr[GtkTreeIter]): Boolean =
    gtk_list_store_remove(this.raw.asInstanceOf, iter).value.!=(0)

  // Method reorder contains an array parameter, which is not supported yet

  inline def set(iter: Ptr[GtkTreeIter], args: Any*): Unit =
    gtk_list_store_set(this.raw.asInstanceOf, iter, args*)

  // Method set_column_types contains an array parameter, which is not supported yet

  def setValist(iter: Ptr[GtkTreeIter], var_args: CVarArgList): Unit =
    gtk_list_store_set_valist(this.raw.asInstanceOf, iter, var_args)

  def setValue(iter: Ptr[GtkTreeIter], column: Int, value: Ptr[GValue]): Unit =
    gtk_list_store_set_value(this.raw.asInstanceOf, iter, column, value)

  // Method set_valuesv contains an array parameter, which is not supported yet

  def swap(a: Ptr[GtkTreeIter], b: Ptr[GtkTreeIter]): Unit =
    gtk_list_store_swap(this.raw.asInstanceOf, a, b)

end ListStore

object ListStore:
  inline def apply(n_columns: Int, args: Any*): ListStore = new ListStore(
    gtk_list_store_new(n_columns, args*).asInstanceOf
  )
  // constructor newv contains an array parameter, which is not supported yet

end ListStore
