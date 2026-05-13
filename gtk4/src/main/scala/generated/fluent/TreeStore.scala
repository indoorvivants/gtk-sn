package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GObject
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Buildable,
  TreeDragDest,
  TreeDragSource,
  TreeModel,
  TreeSortable
}
import sn.gnome.gtk4.internal.GtkTreeStore

/** A tree-like data structure that can be used with the [class@Gtk.TreeView].
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TreeStore private[gnome] (raw: Ptr[GtkTreeStore])
    extends Object(raw.asInstanceOf),
      Buildable,
      TreeDragDest,
      TreeDragSource,
      TreeModel,
      TreeSortable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Appends a new row to @tree_store.
    *
    * If @parent is non-%NULL, then it will append the new row after the last
    * child of @parent, otherwise it will append a row to the top level.
    *
    * The @iter parameter will be changed to point to this new row. The row will
    * be empty after this function is called. To fill in values, you need to
    * call gtk_tree_store_set() or gtk_tree_store_set_value().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method append]: Method append contains an OUT parameter, which is not supported yet"
  )
  private def append__ = ???

  /** Removes all rows from @tree_store
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clear(): Unit /* None */ =
    gtk_tree_store_clear(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTreeStore]]
    )
  end clear

  /**  Gets properties of an object.
    *
    *  In general, a copy is made of the property contents and the caller
    *  is responsible for freeing the memory in the appropriate manner for
    *  the type, for instance by calling g_free() or g_object_unref().
    *
    *  Here is an example of using g_object_get() to get the contents
    *  of three properties: an integer, a string and an object:
    *  |[<!-- language="C" -->
    *   gint intval;
    *   guint64 uint64val;
    *   gchar *strval;
    *   GObject *objval;
    *
    *   g_object_get (my_object,
    *                 "int-property", &intval,
    *                 "uint64-property", &uint64val,
    *                 "str-property", &strval,
    *                 "obj-property", &objval,
    *                 NULL);
    *
    *   // Do something with intval, uint64val, strval, objval
    *
    *   g_free (strval);
    *   g_object_unref (objval);
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def get__ = ???

  /** Gets properties of an object.
    *
    * In general, a copy is made of the property contents and the caller is
    * responsible for freeing the memory in the appropriate manner for the type,
    * for instance by calling g_free() or g_object_unref().
    *
    * See g_object_get().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_valist]: Method get_valist is weird: conflicting override"
  )
  private def getValist__ = ???

  /** Creates a new row at @position.
    *
    * If parent is non-%NULL, then the row will be made a child of @parent.
    * Otherwise, the row will be created at the toplevel.
    *
    * If @position is `-1` or is larger than the number of rows at that level,
    * then the new row will be inserted to the end of the list.
    *
    * The @iter parameter will be changed to point to this new row. The row will
    * be empty after this function is called. To fill in values, you need to
    * call gtk_tree_store_set() or gtk_tree_store_set_value().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method insert]: Method insert contains an OUT parameter, which is not supported yet"
  )
  private def insert__ = ???

  /** Inserts a new row after @sibling.
    *
    * If @sibling is %NULL, then the row will be prepended to @parent’s
    * children.
    *
    * If @parent and @sibling are %NULL, then the row will be prepended to the
    * toplevel.
    *
    * If both @sibling and @parent are set, then @parent must be the parent of @sibling.
    * When @sibling is set, @parent is optional.
    *
    * The @iter parameter will be changed to point to this new row. The row will
    * be empty after this function is called. To fill in values, you need to
    * call gtk_tree_store_set() or gtk_tree_store_set_value().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method insert_after]: Method insert_after contains an OUT parameter, which is not supported yet"
  )
  private def insertAfter__ = ???

  /** Inserts a new row before @sibling.
    *
    * If @sibling is %NULL, then the row will be appended to @parent’s children.
    *
    * If @parent and @sibling are %NULL, then the row will be appended to the
    * toplevel.
    *
    * If both @sibling and @parent are set, then @parent must be the parent of @sibling.
    * When @sibling is set, @parent is optional.
    *
    * The @iter parameter will be changed to point to this new row. The row will
    * be empty after this function is called. To fill in values, you need to
    * call gtk_tree_store_set() or gtk_tree_store_set_value().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method insert_before]: Method insert_before contains an OUT parameter, which is not supported yet"
  )
  private def insertBefore__ = ???

  /** Creates a new row at the given @position.
    *
    * The @iter parameter will be changed to point to this new row.
    *
    * If @position is -1, or larger than the number of rows on the list, then
    * the new row will be appended to the list. The row will be filled with the
    * values given to this function.
    *
    * Calling
    *
    * gtk_tree_store_insert_with_values (tree_store, iter, position, ...)
    *
    * has the same effect as calling
    *
    * ```c
    * gtk_tree_store_insert (tree_store, iter, position);
    * gtk_tree_store_set (tree_store, iter, ...);
    * ```
    *
    * with the different that the former will only emit a row_inserted signal,
    * while the latter will emit row_inserted, row_changed and if the tree store
    * is sorted, rows_reordered.
    *
    * Since emitting the rows_reordered signal repeatedly can affect the
    * performance of the program, gtk_tree_store_insert_with_values() should
    * generally be preferred when inserting rows in a sorted tree store.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method insert_with_values]: Method insert_with_values contains an OUT parameter, which is not supported yet"
  )
  private def insertWithValues__ = ???

  /** A variant of gtk_tree_store_insert_with_values() which takes the columns
    * and values as two arrays, instead of varargs.
    *
    * This function is mainly intended for language bindings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method insert_with_valuesv]: Method insert_with_valuesv contains an OUT parameter, which is not supported yet"
  )
  private def insertWithValuesv__ = ???

  /** Checks if @iter is an ancestor of @descendant.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method is_ancestor/<method parameters>/iter]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))"
  )
  private def isAncestor__ = ???

  /** Returns the depth of the position pointed by the iterator
    *
    * The depth will be 0 for anything on the root level, 1 for anything down a
    * level, etc.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method iter_depth/<method parameters>/iter]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))"
  )
  private def iterDepth__ = ???

  /** Checks if the given iter is a valid iter for this `GtkTreeStore`.
    *
    * This function is slow. Only use it for debugging and/or testing purposes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method iter_is_valid/<method parameters>/iter]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))"
  )
  private def iterIsValid__ = ???

  /** Moves @iter in @tree_store to the position after @position.
    *
    * @iter
    *   and @position should be in the same level.
    *
    * Note that this function only works with unsorted stores.
    *
    * If @position is %NULL, @iter will be moved to the start of the level.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method move_after/<method parameters>/iter]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))"
  )
  private def moveAfter__ = ???

  /** Moves @iter in @tree_store to the position before @position.
    *
    * @iter
    *   and @position should be in the same level.
    *
    * Note that this function only works with unsorted stores.
    *
    * If @position is %NULL, @iter will be moved to the end of the level.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method move_before/<method parameters>/iter]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))"
  )
  private def moveBefore__ = ???

  /** Prepends a new row to @tree_store.
    *
    * If @parent is non-%NULL, then it will prepend the new row before the first
    * child of @parent, otherwise it will prepend a row to the top level. The
    * `iter` parameter will be changed to point to this new row. The row will be
    * empty after this function is called. To fill in values, you need to call
    * gtk_tree_store_set() or gtk_tree_store_set_value().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method prepend]: Method prepend contains an OUT parameter, which is not supported yet"
  )
  private def prepend__ = ???

  /** Removes @iter from @tree_store.
    *
    * After being removed, @iter is set to the next valid row at that level, or
    * invalidated if it previously pointed to the last one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method remove/<method parameters>/iter]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))"
  )
  private def remove__ = ???

  /** Reorders the children of @parent in @tree_store to follow the order
    * indicated by @new_order.
    *
    * Note that this function only works with unsorted stores.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method reorder/<method parameters>/parent]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))"
  )
  private def reorder__ = ???

  /** Sets the value of one or more cells in the row referenced by @iter.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set/<method parameters>/iter]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))"
  )
  private def set__ = ???

  /** Sets the type of the columns in a tree store.
    *
    * This function is meant primarily for types that inherit from
    * `GtkTreeStore`, and should only be used when constructing a new
    * `GtkTreeStore`.
    *
    * This functions cannot be called after a row has been added, or a method on
    * the `GtkTreeModel` interface is called on the tree store.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_column_types/<method parameters>/types]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(GType), @type -> DataRecord(GType)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(0), @type -> DataRecord(GType*)))"
  )
  private def setColumnTypes__ = ???

  /** A version of gtk_tree_store_set() using `va_list`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_valist/<method parameters>/iter]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))"
  )
  private def setValist__ = ???

  /** Sets the data in the cell specified by @iter and @column.
    *
    * The type of @value must be convertible to the type of the column.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_value/<method parameters>/iter]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))"
  )
  private def setValue__ = ???

  /** A variant of gtk_tree_store_set_valist() which takes the columns and
    * values as two arrays, instead of using variadic arguments.
    *
    * This function is mainly intended for language bindings or in case the
    * number of columns to change is not known until run-time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_valuesv/<method parameters>/iter]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))"
  )
  private def setValuesv__ = ???

  /** Swaps @a and @b in the same level of @tree_store.
    *
    * Note that this function only works with unsorted stores.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method swap/<method parameters>/a]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreeIter), @type -> DataRecord(GtkTreeIter*)))"
  )
  private def swap__ = ???

end TreeStore

object TreeStore:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkTreeStore])(using Runtime) =
    summon[Runtime].getOrCreate[TreeStore](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new TreeStore(ptr)
    )

  /** Creates a new tree store.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  inline def apply(n_columns: Int /* Some(CInt) */, args: Any*)(using
      Runtime
  ): TreeStore =
    val raw: Ptr[Byte] = gtk_tree_store_new(n_columns, args*).asInstanceOf
    summon[Runtime]
      .getOrCreate[TreeStore](raw, r => TreeStore.applyUnsafe(r.asInstanceOf))
  end apply

  /** Creates a new tree store.
    *
    * This constructor is meant for language bindings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[types]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(GType), @type -> DataRecord(GType)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(0), @type -> DataRecord(GType*)))"
  )
  private def newv() = ???

end TreeStore
