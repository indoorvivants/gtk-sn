package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.{Tree, TreeNode}
import sn.gnome.glib.internal.{GTree, gboolean, gconstpointer, gint, gpointer}

/** The GTree struct is an opaque data structure representing a [balanced binary
  * tree][glib-Balanced-Binary-Trees]. It should be accessed only by using the
  * following functions.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Tree private[gnome] (raw: Ptr[GTree]):

  def getUnsafeRawPointer(): Ptr[GTree] = this.raw

  /** Removes all keys and values from the #GTree and decreases its reference
    * count by one. If keys and/or values are dynamically allocated, you should
    * either free them first or create the #GTree using g_tree_new_full(). In
    * the latter case the destroy functions you supplied will be called on all
    * keys and values before destroying the #GTree.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def destroy(): Unit /* None */ =
    g_tree_destroy(this.getUnsafeRawPointer().asInstanceOf[Ptr[GTree]])
  end destroy

  /** Calls the given function for each of the key/value pairs in the #GTree.
    * The function is passed the key and value of each pair, and the given
    * @data
    *   parameter. The tree is traversed in sorted order.
    *
    * The tree may not be modified while iterating over it (you can't add/remove
    * items). To remove all items matching a predicate, you need to add each
    * item to a list in your #GTraverseFunc as you walk over the tree, then walk
    * the list and remove each item.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method foreach/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TraverseFunc), @type -> DataRecord(GTraverseFunc)))"
  )
  private def foreach__ = ???

  /** Calls the given function for each of the nodes in the #GTree. The function
    * is passed the pointer to the particular node, and the given
    * @data
    *   parameter. The tree traversal happens in-order.
    *
    * The tree may not be modified while iterating over it (you can't add/remove
    * items). To remove all items matching a predicate, you need to add each
    * item to a list in your #GTraverseFunc as you walk over the tree, then walk
    * the list and remove each item.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method foreach_node/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TraverseNodeFunc), @type -> DataRecord(GTraverseNodeFunc)))"
  )
  private def foreachNode__ = ???

  /** Gets the height of a #GTree.
    *
    * If the #GTree contains no nodes, the height is 0. If the #GTree contains
    * only one root node the height is 1. If the root node has children the
    * height is 2, etc.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def height(): Int /* None */ =
    g_tree_height(this.getUnsafeRawPointer().asInstanceOf[Ptr[GTree]]).value
  end height

  /** Inserts a key/value pair into a #GTree.
    *
    * Inserts a new key and value into a #GTree as g_tree_insert_node() does,
    * only this function does not return the inserted or set node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insert(
      key: Option[Ptr[Byte] /* Some(gpointer) */ ],
      value: Option[Ptr[Byte] /* Some(gpointer) */ ]
  ): Unit /* None */ =
    g_tree_insert(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTree]],
      key
        .map[gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[gpointer]),
      value
        .map[gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[gpointer])
    )
  end insert

  /** Inserts a key/value pair into a #GTree.
    *
    * If the given key already exists in the #GTree its corresponding value is
    * set to the new value. If you supplied a @value_destroy_func when creating
    * the #GTree, the old value is freed using that function. If you supplied a @key_destroy_func
    * when creating the #GTree, the passed key is freed using that function.
    *
    * The tree is automatically 'balanced' as new key/value pairs are added, so
    * that the distance from the root to every leaf is as small as possible. The
    * cost of maintaining a balanced tree while inserting new key/value result
    * in a O(n log(n)) operation where most of the other operations are
    * O(log(n)).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertNode(
      key: Option[Ptr[Byte] /* Some(gpointer) */ ],
      value: Option[Ptr[Byte] /* Some(gpointer) */ ]
  ): sn.gnome.glib.TreeNode /* None */ =
    sn.gnome.glib.TreeNode.fromRaw(
      g_tree_insert_node(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTree]],
        key
          .map[gpointer](o => gpointer(o))
          .getOrElse(null.asInstanceOf[gpointer]),
        value
          .map[gpointer](o => gpointer(o))
          .getOrElse(null.asInstanceOf[gpointer])
      )
    )
  end insertNode

  /** Gets the value corresponding to the given key. Since a #GTree is
    * automatically balanced as key/value pairs are added, key lookup is O(log
    * n) (where n is the number of key/value pairs in the tree).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lookup(
      key: Option[Ptr[Byte] /* Some(gconstpointer) */ ]
  ): Ptr[Byte] /* None */ =
    g_tree_lookup(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTree]],
      key
        .map[gconstpointer](o => gconstpointer(o))
        .getOrElse(null.asInstanceOf[gconstpointer])
    ).value
  end lookup

  /** Looks up a key in the #GTree, returning the original key and the
    * associated value. This is useful if you need to free the memory allocated
    * for the original key, for example before calling g_tree_remove().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method lookup_extended]: Method lookup_extended contains an OUT parameter, which is not supported yet"
  )
  private def lookupExtended__ = ???

  /** Gets the tree node corresponding to the given key. Since a #GTree is
    * automatically balanced as key/value pairs are added, key lookup is O(log
    * n) (where n is the number of key/value pairs in the tree).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lookupNode(
      key: Option[Ptr[Byte] /* Some(gconstpointer) */ ]
  ): sn.gnome.glib.TreeNode /* None */ =
    sn.gnome.glib.TreeNode.fromRaw(
      g_tree_lookup_node(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTree]],
        key
          .map[gconstpointer](o => gconstpointer(o))
          .getOrElse(null.asInstanceOf[gconstpointer])
      )
    )
  end lookupNode

  /** Gets the lower bound node corresponding to the given key, or %NULL if the
    * tree is empty or all the nodes in the tree have keys that are strictly
    * lower than the searched key.
    *
    * The lower bound is the first node that has its key greater than or equal
    * to the searched key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lowerBound(
      key: Option[Ptr[Byte] /* Some(gconstpointer) */ ]
  ): sn.gnome.glib.TreeNode /* None */ =
    sn.gnome.glib.TreeNode.fromRaw(
      g_tree_lower_bound(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTree]],
        key
          .map[gconstpointer](o => gconstpointer(o))
          .getOrElse(null.asInstanceOf[gconstpointer])
      )
    )
  end lowerBound

  /** Gets the number of nodes in a #GTree.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nnodes(): Int /* None */ =
    g_tree_nnodes(this.getUnsafeRawPointer().asInstanceOf[Ptr[GTree]]).value
  end nnodes

  /** Returns the first in-order node of the tree, or %NULL for an empty tree.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nodeFirst(): sn.gnome.glib.TreeNode /* None */ =
    sn.gnome.glib.TreeNode.fromRaw(
      g_tree_node_first(this.getUnsafeRawPointer().asInstanceOf[Ptr[GTree]])
    )
  end nodeFirst

  /** Returns the last in-order node of the tree, or %NULL for an empty tree.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nodeLast(): sn.gnome.glib.TreeNode /* None */ =
    sn.gnome.glib.TreeNode.fromRaw(
      g_tree_node_last(this.getUnsafeRawPointer().asInstanceOf[Ptr[GTree]])
    )
  end nodeLast

  /** Increments the reference count of @tree by one.
    *
    * It is safe to call this function from any thread.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.glib.Tree /* None */ =
    sn.gnome.glib.Tree
      .fromRaw(g_tree_ref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GTree]]))
  end ref

  /** Removes a key/value pair from a #GTree.
    *
    * If the #GTree was created using g_tree_new_full(), the key and value are
    * freed using the supplied destroy functions, otherwise you have to make
    * sure that any dynamically allocated values are freed yourself. If the key
    * does not exist in the #GTree, the function does nothing.
    *
    * The cost of maintaining a balanced tree while removing a key/value result
    * in a O(n log(n)) operation where most of the other operations are
    * O(log(n)).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def remove(
      key: Option[Ptr[Byte] /* Some(gconstpointer) */ ]
  ): Boolean /* None */ =
    g_tree_remove(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTree]],
      key
        .map[gconstpointer](o => gconstpointer(o))
        .getOrElse(null.asInstanceOf[gconstpointer])
    ).value.!=(0)
  end remove

  /** Removes all nodes from a #GTree and destroys their keys and values, then
    * resets the #GTree’s root to %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeAll(): Unit /* None */ =
    g_tree_remove_all(this.getUnsafeRawPointer().asInstanceOf[Ptr[GTree]])
  end removeAll

  /** Inserts a new key and value into a #GTree as g_tree_replace_node() does,
    * only this function does not return the inserted or set node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def replace(
      key: Option[Ptr[Byte] /* Some(gpointer) */ ],
      value: Option[Ptr[Byte] /* Some(gpointer) */ ]
  ): Unit /* None */ =
    g_tree_replace(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTree]],
      key
        .map[gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[gpointer]),
      value
        .map[gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[gpointer])
    )
  end replace

  /** Inserts a new key and value into a #GTree similar to g_tree_insert_node().
    * The difference is that if the key already exists in the #GTree, it gets
    * replaced by the new key. If you supplied a @value_destroy_func when
    * creating the #GTree, the old value is freed using that function. If you
    * supplied a @key_destroy_func when creating the #GTree, the old key is
    * freed using that function.
    *
    * The tree is automatically 'balanced' as new key/value pairs are added, so
    * that the distance from the root to every leaf is as small as possible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def replaceNode(
      key: Option[Ptr[Byte] /* Some(gpointer) */ ],
      value: Option[Ptr[Byte] /* Some(gpointer) */ ]
  ): sn.gnome.glib.TreeNode /* None */ =
    sn.gnome.glib.TreeNode.fromRaw(
      g_tree_replace_node(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTree]],
        key
          .map[gpointer](o => gpointer(o))
          .getOrElse(null.asInstanceOf[gpointer]),
        value
          .map[gpointer](o => gpointer(o))
          .getOrElse(null.asInstanceOf[gpointer])
      )
    )
  end replaceNode

  /** Searches a #GTree using @search_func.
    *
    * The @search_func is called with a pointer to the key of a key/value pair
    * in the tree, and the passed in @user_data. If @search_func returns 0 for a
    * key/value pair, then the corresponding value is returned as the result of
    * g_tree_search(). If @search_func returns -1, searching will proceed among
    * the key/value pairs that have a smaller key; if
    * @search_func
    *   returns 1, searching will proceed among the key/value pairs that have a
    *   larger key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method search/<method parameters>/search_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(CompareFunc), @type -> DataRecord(GCompareFunc)))"
  )
  private def search__ = ???

  /** Searches a #GTree using @search_func.
    *
    * The @search_func is called with a pointer to the key of a key/value pair
    * in the tree, and the passed in @user_data. If @search_func returns 0 for a
    * key/value pair, then the corresponding node is returned as the result of
    * g_tree_search(). If @search_func returns -1, searching will proceed among
    * the key/value pairs that have a smaller key; if
    * @search_func
    *   returns 1, searching will proceed among the key/value pairs that have a
    *   larger key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method search_node/<method parameters>/search_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(CompareFunc), @type -> DataRecord(GCompareFunc)))"
  )
  private def searchNode__ = ???

  /** Removes a key and its associated value from a #GTree without calling the
    * key and value destroy functions.
    *
    * If the key does not exist in the #GTree, the function does nothing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def steal(
      key: Option[Ptr[Byte] /* Some(gconstpointer) */ ]
  ): Boolean /* None */ =
    g_tree_steal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTree]],
      key
        .map[gconstpointer](o => gconstpointer(o))
        .getOrElse(null.asInstanceOf[gconstpointer])
    ).value.!=(0)
  end steal

  /** Calls the given function for each node in the #GTree.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method traverse/<method parameters>/traverse_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TraverseFunc), @type -> DataRecord(GTraverseFunc)))"
  )
  private def traverse__ = ???

  /** Decrements the reference count of @tree by one. If the reference count
    * drops to 0, all keys and values will be destroyed (if destroy functions
    * were specified) and all memory allocated by @tree will be released.
    *
    * It is safe to call this function from any thread.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_tree_unref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GTree]])
  end unref

  /** Gets the upper bound node corresponding to the given key, or %NULL if the
    * tree is empty or all the nodes in the tree have keys that are lower than
    * or equal to the searched key.
    *
    * The upper bound is the first node that has its key strictly greater than
    * the searched key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def upperBound(
      key: Option[Ptr[Byte] /* Some(gconstpointer) */ ]
  ): sn.gnome.glib.TreeNode /* None */ =
    sn.gnome.glib.TreeNode.fromRaw(
      g_tree_upper_bound(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTree]],
        key
          .map[gconstpointer](o => gconstpointer(o))
          .getOrElse(null.asInstanceOf[gconstpointer])
      )
    )
  end upperBound

end Tree

object Tree:
  def fromRaw(ptr: Ptr[GTree]): Tree = new Tree(ptr)
end Tree
