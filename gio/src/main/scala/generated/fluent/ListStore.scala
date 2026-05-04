package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.gio.internal.GListStore
import sn.gnome.glib.internal.{gpointer, guint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GListStore is a simple implementation of #GListModel that stores all items
  * in memory.
  *
  * It provides insertions, deletions, and lookups in logarithmic time with a
  * fast path for the common case of iterating the list linearly.
  */
class ListStore(raw: Ptr[GListStore])
    extends Object(raw.asInstanceOf),
      ListModel:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Appends @item to @store. @item must be of type #GListStore:item-type.
    *
    * This function takes a ref on @item.
    *
    * Use g_list_store_splice() to append multiple items at the same time
    * efficiently.
    */
  def append(
      item: Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */
  ): Unit /* None */ = g_list_store_append(
    this.raw.asInstanceOf[Ptr[GListStore]],
    gpointer(item.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Looks up the given @item in the list store by looping over the items until
    * the first occurrence of @item. If @item was not found, then @position will
    * not be set, and this method will return %FALSE.
    *
    * If you need to compare the two items with a custom comparison function,
    * use g_list_store_find_with_equal_func() with a custom #GEqualFunc instead.
    */
  @annotation.compileTimeOnly(
    "Method find contains an OUT parameter, which is not supported yet"
  )
  def find__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Looks up the given @item in the list store by looping over the items and
    * comparing them with @equal_func until the first occurrence of @item which
    * matches. If @item was not found, then @position will not be set, and this
    * method will return %FALSE.
    *
    * @item
    *   is always passed as second parameter to @equal_func.
    *
    * Since GLib 2.76 it is possible to pass `NULL` for @item.
    */
  @annotation.compileTimeOnly(
    "Method find_with_equal_func contains an OUT parameter, which is not supported yet"
  )
  def findWithEqualFunc__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Like g_list_store_find_with_equal_func() but with an additional @user_data
    * that is passed to @equal_func.
    *
    * @item
    *   is always passed as second parameter to @equal_func.
    *
    * Since GLib 2.76 it is possible to pass `NULL` for @item.
    */
  @annotation.compileTimeOnly(
    "Method find_with_equal_func_full contains an OUT parameter, which is not supported yet"
  )
  def findWithEqualFuncFull__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inserts @item into @store at @position. @item must be of type
    * #GListStore:item-type or derived from it. @position must be smaller than
    * the length of the list, or equal to it to append.
    *
    * This function takes a ref on @item.
    *
    * Use g_list_store_splice() to insert multiple items at the same time
    * efficiently.
    */
  def insert(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      item: Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */
  ): Unit /* None */ = g_list_store_insert(
    this.raw.asInstanceOf[Ptr[GListStore]],
    guint(position),
    gpointer(item.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inserts @item into @store at a position to be determined by the
    * @compare_func.
    *
    * The list must already be sorted before calling this function or the result
    * is undefined. Usually you would approach this by only ever inserting items
    * by way of this function.
    *
    * This function takes a ref on @item.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.CompareDataFunc), @type -> DataRecord(GCompareDataFunc)))"
  )
  def insertSorted__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes the item from @store that is at @position. @position must be
    * smaller than the current length of the list.
    *
    * Use g_list_store_splice() to remove multiple items at the same time
    * efficiently.
    */
  def remove(
      position: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    g_list_store_remove(this.raw.asInstanceOf[Ptr[GListStore]], guint(position))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes all items from @store.
    */
  def removeAll(): Unit /* None */ = g_list_store_remove_all(
    this.raw.asInstanceOf[Ptr[GListStore]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sort the items in @store according to @compare_func.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.CompareDataFunc), @type -> DataRecord(GCompareDataFunc)))"
  )
  def sort__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Changes @store by removing @n_removals items and adding @n_additions items
    * to it. @additions must contain @n_additions items of type
    * #GListStore:item-type. %NULL is not permitted.
    *
    * This function is more efficient than g_list_store_insert() and
    * g_list_store_remove(), because it only emits #GListModel::items-changed
    * once for the change.
    *
    * This function takes a ref on each item in @additions.
    *
    * The parameters @position and @n_removals must be correct (ie:
    * @position
    *   + @n_removals must be less than or equal to the length of the list at
    *   the time this function is called).
    */
  @annotation.compileTimeOnly(
    "Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(GObject.Object)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(3), @type -> DataRecord(gpointer*)))"
  )
  def splice__ = ???

end ListStore

object ListStore:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GListStore with items of type @item_type. @item_type must
    * be a subclass of #GObject.
    */
  def apply(
      item_type: GType /* Some(_root_.sn.gnome.gobject.internal.GType) */
  ): ListStore = new ListStore(g_list_store_new(item_type).asInstanceOf)
end ListStore
