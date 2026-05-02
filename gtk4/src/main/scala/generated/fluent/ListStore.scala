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
import sn.gnome.gtk4.internal.GtkListStore
import sn.gnome.gtk4.internal.GtkTreeIter

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A list-like data structure that can be used with the [class@Gtk.TreeView].
  *
  * The `GtkListStore` object is a list model for use with a `GtkTreeView`
  * widget. It implements the `GtkTreeModel` interface, and consequentialy, can
  * use all of the methods available there. It also implements the
  * `GtkTreeSortable` interface so it can be sorted by the view. Finally, it
  * also implements the tree [drag](iface.TreeDragSource.html) and
  * [drop](iface.TreeDragDest.html) interfaces.
  *
  * The `GtkListStore` can accept most `GType`s as a column type, though it
  * can’t accept all custom types. Internally, it will keep a copy of data
  * passed in (such as a string or a boxed pointer). Columns that accept
  * `GObject`s are handled a little differently. The `GtkListStore` will keep a
  * reference to the object instead of copying the value. As a result, if the
  * object is modified, it is up to the application writer to call
  * [method@Gtk.TreeModel.row_changed] to emit the
  * [signal@Gtk.TreeModel::row_changed] signal. This most commonly affects lists
  * with [class@Gdk.Texture]s stored.
  *
  * An example for creating a simple list store:
  *
  * ```c
  * enum {
  *   COLUMN_STRING,
  *   COLUMN_INT,
  *   COLUMN_BOOLEAN,
  *   N_COLUMNS
  * };
  *
  * {
  *   GtkListStore *list_store;
  *   GtkTreePath *path;
  *   GtkTreeIter iter;
  *   int i;
  *
  *   list_store = gtk_list_store_new (N_COLUMNS,
  *                                    G_TYPE_STRING,
  *                                    G_TYPE_INT,
  *                                    G_TYPE_BOOLEAN);
  *
  *   for (i = 0; i < 10; i++)
  *     {
  *       char *some_data;
  *
  *       some_data = get_some_data (i);
  *
  *       // Add a new row to the model
  *       gtk_list_store_append (list_store, &iter);
  *       gtk_list_store_set (list_store, &iter,
  *                           COLUMN_STRING, some_data,
  *                           COLUMN_INT, i,
  *                           COLUMN_BOOLEAN,  FALSE,
  *                           -1);
  *
  *       // As the store will keep a copy of the string internally,
  *       // we free some_data.
  *       g_free (some_data);
  *     }
  *
  *   // Modify a particular row
  *   path = gtk_tree_path_new_from_string ("4");
  *   gtk_tree_model_get_iter (GTK_TREE_MODEL (list_store),
  *                            &iter,
  *                            path);
  *   gtk_tree_path_free (path);
  *   gtk_list_store_set (list_store, &iter,
  *                       COLUMN_BOOLEAN, TRUE,
  *                       -1);
  * }
  * ```
  *
  * `GtkListStore` is deprecated since GTK 4.10, and should not be used in newly
  * written code. You should use [class@Gio.ListStore] instead, and the various
  * list models provided by GTK.
  *
  * ## Performance Considerations
  *
  * Internally, the `GtkListStore` was originally implemented with a linked list
  * with a tail pointer. As a result, it was fast at data insertion and
  * deletion, and not fast at random data access. The `GtkListStore` sets the
  * `GTK_TREE_MODEL_ITERS_PERSIST` flag, which means that `GtkTreeIter`s can be
  * cached while the row exists. Thus, if access to a particular row is needed
  * often and your code is expected to run on older versions of GTK, it is worth
  * keeping the iter around.
  *
  * ## Atomic Operations
  *
  * It is important to note that only the methods
  * gtk_list_store_insert_with_values() and gtk_list_store_insert_with_valuesv()
  * are atomic, in the sense that the row is being appended to the store and the
  * values filled in in a single operation with regard to `GtkTreeModel`
  * signaling. In contrast, using e.g. gtk_list_store_append() and then
  * gtk_list_store_set() will first create a row, which triggers the
  * `GtkTreeModel::row-inserted` signal on `GtkListStore`. The row, however, is
  * still empty, and any signal handler connecting to
  * `GtkTreeModel::row-inserted` on this particular store should be prepared for
  * the situation that the row might be empty. This is especially important if
  * you are wrapping the `GtkListStore` inside a `GtkTreeModel`Filter and are
  * using a `GtkTreeModel`FilterVisibleFunc. Using any of the non-atomic
  * operations to append rows to the `GtkListStore` will cause the
  * `GtkTreeModel`FilterVisibleFunc to be visited with an empty row first; the
  * function must be prepared for that.
  *
  * ## GtkListStore as GtkBuildable
  *
  * The GtkListStore implementation of the [iface@Gtk.Buildable] interface
  * allows to specify the model columns with a `<columns>` element that may
  * contain multiple `<column>` elements, each specifying one model column. The
  * “type” attribute specifies the data type for the column.
  *
  * Additionally, it is possible to specify content for the list store in the UI
  * definition, with the `<data>` element. It can contain multiple `<row>`
  * elements, each specifying to content for one row of the list model. Inside a
  * `<row>`, the `<col>` elements specify the content for individual cells.
  *
  * Note that it is probably more common to define your models in the code, and
  * one might consider it a layering violation to specify the content of a list
  * store in a UI definition, data, not presentation, and common wisdom is to
  * separate the two, as far as possible.
  *
  * An example of a UI Definition fragment for a list store:
  *
  * ```xml
  * <object class="GtkListStore">
  *   <columns>
  *     <column type="gchararray"/>
  *     <column type="gchararray"/>
  *     <column type="gint"/>
  *   </columns>
  *   <data>
  *     <row>
  *       <col id="0">John</col>
  *       <col id="1">Doe</col>
  *       <col id="2">25</col>
  *     </row>
  *     <row>
  *       <col id="0">Johan</col>
  *       <col id="1">Dahlin</col>
  *       <col id="2">50</col>
  *     </row>
  *   </data>
  * </object>
  * ```
  */
class ListStore(raw: Ptr[GtkListStore])
    extends Object(raw.asInstanceOf),
      Buildable,
      TreeDragDest,
      TreeDragSource,
      TreeModel,
      TreeSortable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends a new row to @list_store. @iter will be changed to point to this
    * new row. The row will be empty after this function is called. To fill in
    * values, you need to call gtk_list_store_set() or
    * gtk_list_store_set_value().
    */
  @annotation.compileTimeOnly(
    "Method append contains an OUT parameter, which is not supported yet"
  )
  private def append__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes all rows from the list store.
    */
  def clear(): Unit /* None */ = gtk_list_store_clear(
    this.raw.asInstanceOf[Ptr[GtkListStore]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new row at @position. @iter will be changed to point to this new
    * row. If @position is -1 or is larger than the number of rows on the list,
    * then the new row will be appended to the list. The row will be empty after
    * this function is called. To fill in values, you need to call
    * gtk_list_store_set() or gtk_list_store_set_value().
    */
  @annotation.compileTimeOnly(
    "Method insert contains an OUT parameter, which is not supported yet"
  )
  private def insert__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inserts a new row after @sibling. If @sibling is %NULL, then the row will
    * be prepended to the beginning of the list. @iter will be changed to point
    * to this new row. The row will be empty after this function is called. To
    * fill in values, you need to call gtk_list_store_set() or
    * gtk_list_store_set_value().
    */
  @annotation.compileTimeOnly(
    "Method insert_after contains an OUT parameter, which is not supported yet"
  )
  private def insertAfter__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inserts a new row before @sibling. If @sibling is %NULL, then the row will
    * be appended to the end of the list. @iter will be changed to point to this
    * new row. The row will be empty after this function is called. To fill in
    * values, you need to call gtk_list_store_set() or
    * gtk_list_store_set_value().
    */
  @annotation.compileTimeOnly(
    "Method insert_before contains an OUT parameter, which is not supported yet"
  )
  private def insertBefore__ = ???

  /**  COMMENT FOR THE ORIGINAL C DEFINITION
    *
    *  Creates a new row at @position. @iter will be changed to point to this new
    *  row. If @position is -1, or larger than the number of rows in the list, then
    *  the new row will be appended to the list. The row will be filled with the
    *  values given to this function.
    *
    *  Calling
    *  `gtk_list_store_insert_with_values (list_store, iter, position...)`
    *  has the same effect as calling:
    *
    *  |[<!-- language="C" -->
    *  static void
    *  insert_value (GtkListStore *list_store,
    *                GtkTreeIter  *iter,
    *                int           position)
    *  {
    *    gtk_list_store_insert (list_store, iter, position);
    *    gtk_list_store_set (list_store,
    *                        iter
    *                        // ...
    *                        );
    *  }
    *  ]|
    *
    *  with the difference that the former will only emit `GtkTreeModel`::row-inserted
    *  once, while the latter will emit `GtkTreeModel`::row-inserted,
    *  `GtkTreeModel`::row-changed and, if the list store is sorted,
    *  `GtkTreeModel`::rows-reordered for every inserted value.
    *
    *  Since emitting the `GtkTreeModel::rows-reordered` signal repeatedly can
    *  affect the performance of the program, gtk_list_store_insert_with_values()
    *  should generally be preferred when inserting rows in a sorted list store.
    */
  @annotation.compileTimeOnly(
    "Method insert_with_values contains an OUT parameter, which is not supported yet"
  )
  private def insertWithValues__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A variant of gtk_list_store_insert_with_values() which takes the columns
    * and values as two arrays, instead of varargs.
    *
    * This function is mainly intended for language-bindings.
    */
  @annotation.compileTimeOnly(
    "Method insert_with_valuesv contains an OUT parameter, which is not supported yet"
  )
  private def insertWithValuesv__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if the given iter is a valid iter for this `GtkListStore`.
    *
    * This function is slow. Only use it for debugging and/or testing purposes.
    */
  def iterIsValid(
      iter: Ptr[GtkTreeIter] /* Some(Ptr[GtkTreeIter]) */
  ): Boolean /* None */ = gtk_list_store_iter_is_valid(
    this.raw.asInstanceOf[Ptr[GtkListStore]],
    iter
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Moves @iter in @store to the position after @position. Note that this
    * function only works with unsorted stores. If @position is %NULL, @iter
    * will be moved to the start of the list.
    */
  def moveAfter(
      iter: Ptr[GtkTreeIter] /* Some(Ptr[GtkTreeIter]) */,
      position: Option[Ptr[GtkTreeIter] /* Some(Ptr[GtkTreeIter]) */ ]
  ): Unit /* None */ = gtk_list_store_move_after(
    this.raw.asInstanceOf[Ptr[GtkListStore]],
    iter,
    position
      .map[Ptr[GtkTreeIter]](o => o)
      .getOrElse(null.asInstanceOf[Ptr[GtkTreeIter]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Moves @iter in @store to the position before @position. Note that this
    * function only works with unsorted stores. If @position is %NULL, @iter
    * will be moved to the end of the list.
    */
  def moveBefore(
      iter: Ptr[GtkTreeIter] /* Some(Ptr[GtkTreeIter]) */,
      position: Option[Ptr[GtkTreeIter] /* Some(Ptr[GtkTreeIter]) */ ]
  ): Unit /* None */ = gtk_list_store_move_before(
    this.raw.asInstanceOf[Ptr[GtkListStore]],
    iter,
    position
      .map[Ptr[GtkTreeIter]](o => o)
      .getOrElse(null.asInstanceOf[Ptr[GtkTreeIter]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Prepends a new row to @list_store. @iter will be changed to point to this
    * new row. The row will be empty after this function is called. To fill in
    * values, you need to call gtk_list_store_set() or
    * gtk_list_store_set_value().
    */
  @annotation.compileTimeOnly(
    "Method prepend contains an OUT parameter, which is not supported yet"
  )
  private def prepend__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes the given row from the list store. After being removed,
    * @iter
    *   is set to be the next valid row, or invalidated if it pointed to the
    *   last row in @list_store.
    */
  def remove(
      iter: Ptr[GtkTreeIter] /* Some(Ptr[GtkTreeIter]) */
  ): Boolean /* None */ =
    gtk_list_store_remove(this.raw.asInstanceOf[Ptr[GtkListStore]], iter).value
      .!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reorders @store to follow the order indicated by @new_order. Note that
    * this function only works with unsorted stores.
    */
  def reorder(
      new_order: Ptr[Int /* None */ ] /* Some(Ptr[CInt]) */
  ): Unit /* None */ =
    gtk_list_store_reorder(this.raw.asInstanceOf[Ptr[GtkListStore]], new_order)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of one or more cells in the row referenced by @iter. The
    * variable argument list should contain integer column numbers, each column
    * number followed by the value to be set. The list is terminated by a -1.
    * For example, to set column 0 with type %G_TYPE_STRING to “Foo”, you would
    * write `gtk_list_store_set (store, iter, 0, "Foo", -1)`.
    *
    * The value will be referenced by the store if it is a %G_TYPE_OBJECT, and
    * it will be copied if it is a %G_TYPE_STRING or %G_TYPE_BOXED.
    */
  inline def set(
      iter: Ptr[GtkTreeIter] /* Some(Ptr[GtkTreeIter]) */,
      args: Any*
  ): Unit /* None */ =
    gtk_list_store_set(this.raw.asInstanceOf[Ptr[GtkListStore]], iter, args*)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the types of the columns of a list store.
    *
    * This function is meant primarily for objects that inherit from
    * `GtkListStore`, and should only be used when constructing a new instance.
    *
    * This function cannot be called after a row has been added, or a method on
    * the `GtkTreeModel` interface is called.
    */
  def setColumnTypes(
      n_columns: Int /* Some(CInt) */,
      types: Ptr[
        GType /* None */
      ] /* Some(Ptr[_root_.sn.gnome.gobject.internal.GType]) */
  ): Unit /* None */ = gtk_list_store_set_column_types(
    this.raw.asInstanceOf[Ptr[GtkListStore]],
    n_columns,
    types
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * See gtk_list_store_set(); this version takes a va_list for use by language
    * bindings.
    */
  def setValist(
      iter: Ptr[GtkTreeIter] /* Some(Ptr[GtkTreeIter]) */,
      var_args: CVarArgList /* Some(va_list) */
  ): Unit /* None */ = gtk_list_store_set_valist(
    this.raw.asInstanceOf[Ptr[GtkListStore]],
    iter,
    var_args
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the data in the cell specified by @iter and @column. The type of @value
    * must be convertible to the type of the column.
    */
  def setValue(
      iter: Ptr[GtkTreeIter] /* Some(Ptr[GtkTreeIter]) */,
      column: Int /* Some(CInt) */,
      value: Ptr[
        GValue
      ] /* Some(Ptr[_root_.sn.gnome.gobject.internal.GValue]) */
  ): Unit /* None */ = gtk_list_store_set_value(
    this.raw.asInstanceOf[Ptr[GtkListStore]],
    iter,
    column,
    value
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A variant of gtk_list_store_set_valist() which takes the columns and
    * values as two arrays, instead of varargs. This function is mainly intended
    * for language-bindings and in case the number of columns to change is not
    * known until run-time.
    */
  def setValuesv(
      iter: Ptr[GtkTreeIter] /* Some(Ptr[GtkTreeIter]) */,
      columns: Ptr[Int /* None */ ] /* Some(Ptr[CInt]) */,
      values: Ptr[
        GValue /* None */
      ] /* Some(Ptr[_root_.sn.gnome.gobject.internal.GValue]) */,
      n_values: Int /* Some(CInt) */
  ): Unit /* None */ = gtk_list_store_set_valuesv(
    this.raw.asInstanceOf[Ptr[GtkListStore]],
    iter,
    columns,
    values,
    n_values
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Swaps @a and @b in @store. Note that this function only works with
    * unsorted stores.
    */
  def swap(
      a: Ptr[GtkTreeIter] /* Some(Ptr[GtkTreeIter]) */,
      b: Ptr[GtkTreeIter] /* Some(Ptr[GtkTreeIter]) */
  ): Unit /* None */ =
    gtk_list_store_swap(this.raw.asInstanceOf[Ptr[GtkListStore]], a, b)

end ListStore

object ListStore:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new list store.
    *
    * The list store will have @n_columns columns, with each column using the
    * given type passed to this function.
    *
    * Note that only types derived from standard GObject fundamental types are
    * supported.
    *
    * As an example:
    *
    * ```c
    * gtk_list_store_new (3, G_TYPE_INT, G_TYPE_STRING, GDK_TYPE_TEXTURE);
    * ```
    *
    * will create a new `GtkListStore` with three columns, of type `int`,
    * `gchararray` and `GdkTexture`, respectively.
    */
  inline def apply(n_columns: Int /* Some(CInt) */, args: Any*): ListStore =
    new ListStore(gtk_list_store_new(n_columns, args*).asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkListStore`.
    *
    * This function is meant to be used by language bindings.
    */
  def newv(
      n_columns: Int /* Some(CInt) */,
      types: Ptr[
        GType /* None */
      ] /* Some(Ptr[_root_.sn.gnome.gobject.internal.GType]) */
  ): ListStore = new ListStore(
    gtk_list_store_newv(n_columns, types).asInstanceOf
  )
end ListStore
