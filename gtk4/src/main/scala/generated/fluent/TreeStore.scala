package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GType
import sn.gnome.gobject.internal.GValue
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.TreeDragDest
import sn.gnome.gtk4.fluent.TreeDragSource
import sn.gnome.gtk4.fluent.TreeModel
import sn.gnome.gtk4.fluent.TreeSortable
import sn.gnome.gtk4.internal.GtkTreeIter
import sn.gnome.gtk4.internal.GtkTreeStore

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A tree-like data structure that can be used with the [class@Gtk.TreeView].
  *
  * The `GtkTreeStore` object is a list model for use with a `GtkTreeView`
  * widget. It implements the [iface@Gtk.TreeModel] interface, and consequently,
  * can use all of the methods available there. It also implements the
  * [iface@Gtk.TreeSortable] interface so it can be sorted by the view. Finally,
  * it also implements the tree [drag][iface@Gtk.TreeDragSource] and
  * [drop][iface@Gtk.TreeDragDest] interfaces.
  *
  * `GtkTreeStore` is deprecated since GTK 4.10, and should not be used in newly
  * written code. You should use [class@Gtk.TreeListModel] for a tree-like model
  * object.
  *
  * ## GtkTreeStore as GtkBuildable
  *
  * The GtkTreeStore implementation of the `GtkBuildable` interface allows to
  * specify the model columns with a `<columns>` element that may contain
  * multiple `<column>` elements, each specifying one model column. The “type”
  * attribute specifies the data type for the column.
  *
  * An example of a UI Definition fragment for a tree store:
  *
  * ```xml
  * <object class="GtkTreeStore">
  *   <columns>
  *     <column type="gchararray"/>
  *     <column type="gchararray"/>
  *     <column type="gint"/>
  *   </columns>
  * </object>
  * ```
  */
class TreeStore(raw: Ptr[GtkTreeStore])
    extends Object(raw.asInstanceOf),
      Buildable,
      TreeDragDest,
      TreeDragSource,
      TreeModel,
      TreeSortable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  @annotation.compileTimeOnly(
    "Method append contains an OUT parameter, which is not supported yet"
  )
  def append() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes all rows from @tree_store
    */
  def clear(): Unit = gtk_tree_store_clear(this.raw.asInstanceOf)

  @annotation.compileTimeOnly(
    "Method insert contains an OUT parameter, which is not supported yet"
  )
  def insert() = ???

  @annotation.compileTimeOnly(
    "Method insert_after contains an OUT parameter, which is not supported yet"
  )
  def insertAfter() = ???

  @annotation.compileTimeOnly(
    "Method insert_before contains an OUT parameter, which is not supported yet"
  )
  def insertBefore() = ???

  @annotation.compileTimeOnly(
    "Method insert_with_values contains an OUT parameter, which is not supported yet"
  )
  def insertWithValues() = ???

  @annotation.compileTimeOnly(
    "Method insert_with_valuesv contains an OUT parameter, which is not supported yet"
  )
  def insertWithValuesv() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if @iter is an ancestor of @descendant.
    */
  def isAncestor(
      iter: Ptr[GtkTreeIter],
      descendant: Ptr[GtkTreeIter]
  ): Boolean =
    gtk_tree_store_is_ancestor(this.raw.asInstanceOf, iter, descendant).value
      .!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the depth of the position pointed by the iterator
    *
    * The depth will be 0 for anything on the root level, 1 for anything down a
    * level, etc.
    */
  def iterDepth(iter: Ptr[GtkTreeIter]): Int =
    gtk_tree_store_iter_depth(this.raw.asInstanceOf, iter)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if the given iter is a valid iter for this `GtkTreeStore`.
    *
    * This function is slow. Only use it for debugging and/or testing purposes.
    */
  def iterIsValid(iter: Ptr[GtkTreeIter]): Boolean =
    gtk_tree_store_iter_is_valid(this.raw.asInstanceOf, iter).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Moves @iter in @tree_store to the position after @position.
    *
    * @iter
    *   and @position should be in the same level.
    *
    * Note that this function only works with unsorted stores.
    *
    * If @position is %NULL, @iter will be moved to the start of the level.
    */
  def moveAfter(iter: Ptr[GtkTreeIter], position: Ptr[GtkTreeIter]): Unit =
    gtk_tree_store_move_after(this.raw.asInstanceOf, iter, position)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Moves @iter in @tree_store to the position before @position.
    *
    * @iter
    *   and @position should be in the same level.
    *
    * Note that this function only works with unsorted stores.
    *
    * If @position is %NULL, @iter will be moved to the end of the level.
    */
  def moveBefore(iter: Ptr[GtkTreeIter], position: Ptr[GtkTreeIter]): Unit =
    gtk_tree_store_move_before(this.raw.asInstanceOf, iter, position)

  @annotation.compileTimeOnly(
    "Method prepend contains an OUT parameter, which is not supported yet"
  )
  def prepend() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes @iter from @tree_store.
    *
    * After being removed, @iter is set to the next valid row at that level, or
    * invalidated if it previously pointed to the last one.
    */
  def remove(iter: Ptr[GtkTreeIter]): Boolean =
    gtk_tree_store_remove(this.raw.asInstanceOf, iter).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reorders the children of @parent in @tree_store to follow the order
    * indicated by @new_order.
    *
    * Note that this function only works with unsorted stores.
    */
  def reorder(parent: Ptr[GtkTreeIter], new_order: Ptr[Int]): Unit =
    gtk_tree_store_reorder(this.raw.asInstanceOf, parent, new_order)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of one or more cells in the row referenced by @iter.
    *
    * The variable argument list should contain integer column numbers, each
    * column number followed by the value to be set.
    *
    * The list is terminated by a value of `-1`.
    *
    * For example, to set column 0 with type `G_TYPE_STRING` to “Foo”, you would
    * write
    *
    * ```c
    * gtk_tree_store_set (store, iter, 0, "Foo", -1);
    * ```
    *
    * The value will be referenced by the store if it is a `G_TYPE_OBJECT`, and
    * it will be copied if it is a `G_TYPE_STRING` or `G_TYPE_BOXED`.
    */
  inline def set(iter: Ptr[GtkTreeIter], args: Any*): Unit =
    gtk_tree_store_set(this.raw.asInstanceOf, iter, args*)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the type of the columns in a tree store.
    *
    * This function is meant primarily for types that inherit from
    * `GtkTreeStore`, and should only be used when constructing a new
    * `GtkTreeStore`.
    *
    * This functions cannot be called after a row has been added, or a method on
    * the `GtkTreeModel` interface is called on the tree store.
    */
  def setColumnTypes(n_columns: Int, types: Ptr[GType]): Unit =
    gtk_tree_store_set_column_types(this.raw.asInstanceOf, n_columns, types)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A version of gtk_tree_store_set() using `va_list`.
    */
  def setValist(iter: Ptr[GtkTreeIter], var_args: CVarArgList): Unit =
    gtk_tree_store_set_valist(this.raw.asInstanceOf, iter, var_args)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the data in the cell specified by @iter and @column.
    *
    * The type of @value must be convertible to the type of the column.
    */
  def setValue(iter: Ptr[GtkTreeIter], column: Int, value: Ptr[GValue]): Unit =
    gtk_tree_store_set_value(this.raw.asInstanceOf, iter, column, value)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A variant of gtk_tree_store_set_valist() which takes the columns and
    * values as two arrays, instead of using variadic arguments.
    *
    * This function is mainly intended for language bindings or in case the
    * number of columns to change is not known until run-time.
    */
  def setValuesv(
      iter: Ptr[GtkTreeIter],
      columns: Ptr[Int],
      values: Ptr[GValue],
      n_values: Int
  ): Unit = gtk_tree_store_set_valuesv(
    this.raw.asInstanceOf,
    iter,
    columns,
    values,
    n_values
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Swaps @a and @b in the same level of @tree_store.
    *
    * Note that this function only works with unsorted stores.
    */
  def swap(a: Ptr[GtkTreeIter], b: Ptr[GtkTreeIter]): Unit =
    gtk_tree_store_swap(this.raw.asInstanceOf, a, b)

end TreeStore

object TreeStore:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new tree store.
    *
    * The tree store will have @n_columns, with each column using the
    * corresponding type passed to this function.
    *
    * Note that only types derived from standard GObject fundamental types are
    * supported.
    *
    * As an example:
    *
    * ```c
    * gtk_tree_store_new (3, G_TYPE_INT, G_TYPE_STRING, GDK_TYPE_TEXTURE);
    * ```
    *
    * will create a new `GtkTreeStore` with three columns of type `int`,
    * `gchararray`, and `GdkTexture` respectively.
    */
  inline def apply(n_columns: Int, args: Any*): TreeStore = new TreeStore(
    gtk_tree_store_new(n_columns, args*).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new tree store.
    *
    * This constructor is meant for language bindings.
    */
  def newv(n_columns: Int, types: Ptr[GType]): TreeStore = new TreeStore(
    gtk_tree_store_newv(n_columns, types).asInstanceOf
  )
end TreeStore
