package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.{Node, TraverseFlags, TraverseType}
import sn.gnome.glib.internal.{GNode, gboolean, gint, gpointer, guint}

/** The #GNode struct represents one node in a [n-ary tree][glib-N-ary-Trees].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Node private[gnome] (raw: Ptr[GNode]):

  def getUnsafeRawPointer(): Ptr[GNode] = this.raw

  /** contains the actual data of the node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def data: Ptr[Byte] /* None */ = (!raw).data.asInstanceOf[gpointer]

  /** contains the actual data of the node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def data_=(value: Ptr[Byte] /* None */ ): Unit =
    (!raw).data_=(gpointer(value).asInstanceOf[gpointer])

  /** points to the node's next sibling (a sibling is another #GNode with the
    * same parent).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def next: sn.gnome.glib.Node /* None */ = (!raw).next.asInstanceOf[Ptr[GNode]]

  /** points to the node's next sibling (a sibling is another #GNode with the
    * same parent).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def next_=(value: sn.gnome.glib.Node /* None */ ): Unit = (!raw).next_=(
    value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[GNode]]
  )

  /** points to the node's previous sibling.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prev: sn.gnome.glib.Node /* None */ = (!raw).prev.asInstanceOf[Ptr[GNode]]

  /** points to the node's previous sibling.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prev_=(value: sn.gnome.glib.Node /* None */ ): Unit = (!raw).prev_=(
    value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[GNode]]
  )

  /** points to the parent of the #GNode, or is %NULL if the #GNode is the root
    * of the tree.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parent: sn.gnome.glib.Node /* None */ =
    (!raw).parent.asInstanceOf[Ptr[GNode]]

  /** points to the parent of the #GNode, or is %NULL if the #GNode is the root
    * of the tree.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parent_=(value: sn.gnome.glib.Node /* None */ ): Unit = (!raw).parent_=(
    value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[GNode]]
  )

  /** points to the first child of the #GNode. The other children are accessed
    * by using the @next pointer of each child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def children: sn.gnome.glib.Node /* None */ =
    (!raw).children.asInstanceOf[Ptr[GNode]]

  /** points to the first child of the #GNode. The other children are accessed
    * by using the @next pointer of each child.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def children_=(value: sn.gnome.glib.Node /* None */ ): Unit =
    (!raw).children_=(
      value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[GNode]]
    )

  /** Gets the position of the first child of a #GNode which contains the given
    * data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def childIndex(
      data: Option[Ptr[Byte] /* Some(gpointer) */ ]
  ): Int /* None */ =
    g_node_child_index(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GNode]],
      data
        .map[gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[gpointer])
    ).value
  end childIndex

  /** Gets the position of a #GNode with respect to its siblings.
    * @child
    *   must be a child of @node. The first child is numbered 0, the second 1,
    *   and so on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def childPosition(
      child: sn.gnome.glib.Node /* Some(Ptr[GNode]) */
  ): Int /* None */ =
    g_node_child_position(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GNode]],
      child.getUnsafeRawPointer().asInstanceOf
    ).value
  end childPosition

  /** Calls a function for each of the children of a #GNode. Note that it
    * doesn't descend beneath the child nodes. @func must not do anything that
    * would modify the structure of the tree.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method children_foreach/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(NodeForeachFunc), @type -> DataRecord(GNodeForeachFunc)))"
  )
  private def childrenForeach__ = ???

  /** Recursively copies a #GNode (but does not deep-copy the data inside the
    * nodes, see g_node_copy_deep() if you need that).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.glib.Node /* None */ =
    sn.gnome.glib.Node
      .fromRaw(g_node_copy(this.getUnsafeRawPointer().asInstanceOf[Ptr[GNode]]))
  end copy

  /** Recursively copies a #GNode and its data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method copy_deep/<method parameters>/copy_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(CopyFunc), @type -> DataRecord(GCopyFunc)))"
  )
  private def copyDeep__ = ???

  /** Gets the depth of a #GNode.
    *
    * If @node is %NULL the depth is 0. The root node has a depth of 1. For the
    * children of the root node the depth is 2. And so on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def depth(): UInt /* None */ =
    g_node_depth(this.getUnsafeRawPointer().asInstanceOf[Ptr[GNode]]).value
  end depth

  /** Removes @root and its children from the tree, freeing any memory
    * allocated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def destroy(): Unit /* None */ =
    g_node_destroy(this.getUnsafeRawPointer().asInstanceOf[Ptr[GNode]])
  end destroy

  /** Finds a #GNode in a tree.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def find(
      order: sn.gnome.glib.TraverseType /* Some(GTraverseType) */,
      flags: sn.gnome.glib.TraverseFlags /* Some(GTraverseFlags) */,
      data: Option[Ptr[Byte] /* Some(gpointer) */ ]
  ): sn.gnome.glib.Node /* None */ =
    sn.gnome.glib.Node.fromRaw(
      g_node_find(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GNode]],
        order.raw,
        flags.raw,
        data
          .map[gpointer](o => gpointer(o))
          .getOrElse(null.asInstanceOf[gpointer])
      )
    )
  end find

  /** Finds the first child of a #GNode with the given data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def findChild(
      flags: sn.gnome.glib.TraverseFlags /* Some(GTraverseFlags) */,
      data: Option[Ptr[Byte] /* Some(gpointer) */ ]
  ): sn.gnome.glib.Node /* None */ =
    sn.gnome.glib.Node.fromRaw(
      g_node_find_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GNode]],
        flags.raw,
        data
          .map[gpointer](o => gpointer(o))
          .getOrElse(null.asInstanceOf[gpointer])
      )
    )
  end findChild

  /** Gets the first sibling of a #GNode. This could possibly be the node
    * itself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def firstSibling(): sn.gnome.glib.Node /* None */ =
    sn.gnome.glib.Node.fromRaw(
      g_node_first_sibling(this.getUnsafeRawPointer().asInstanceOf[Ptr[GNode]])
    )
  end firstSibling

  /** Gets the root of a tree.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRoot(): sn.gnome.glib.Node /* None */ =
    sn.gnome.glib.Node.fromRaw(
      g_node_get_root(this.getUnsafeRawPointer().asInstanceOf[Ptr[GNode]])
    )
  end getRoot

  /** Inserts a #GNode beneath the parent at the given position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insert(
      position: Int /* Some(gint) */,
      node: sn.gnome.glib.Node /* Some(Ptr[GNode]) */
  ): sn.gnome.glib.Node /* None */ =
    sn.gnome.glib.Node.fromRaw(
      g_node_insert(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GNode]],
        gint(position),
        node.getUnsafeRawPointer().asInstanceOf
      )
    )
  end insert

  /** Inserts a #GNode beneath the parent after the given sibling.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertAfter(
      sibling: sn.gnome.glib.Node /* Some(Ptr[GNode]) */,
      node: sn.gnome.glib.Node /* Some(Ptr[GNode]) */
  ): sn.gnome.glib.Node /* None */ =
    sn.gnome.glib.Node.fromRaw(
      g_node_insert_after(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GNode]],
        sibling.getUnsafeRawPointer().asInstanceOf,
        node.getUnsafeRawPointer().asInstanceOf
      )
    )
  end insertAfter

  /** Inserts a #GNode beneath the parent before the given sibling.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertBefore(
      sibling: sn.gnome.glib.Node /* Some(Ptr[GNode]) */,
      node: sn.gnome.glib.Node /* Some(Ptr[GNode]) */
  ): sn.gnome.glib.Node /* None */ =
    sn.gnome.glib.Node.fromRaw(
      g_node_insert_before(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GNode]],
        sibling.getUnsafeRawPointer().asInstanceOf,
        node.getUnsafeRawPointer().asInstanceOf
      )
    )
  end insertBefore

  /** Returns %TRUE if @node is an ancestor of @descendant. This is true if node
    * is the parent of @descendant, or if node is the grandparent of @descendant
    * etc.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isAncestor(
      descendant: sn.gnome.glib.Node /* Some(Ptr[GNode]) */
  ): Boolean /* None */ =
    g_node_is_ancestor(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GNode]],
      descendant.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end isAncestor

  /** Gets the last child of a #GNode.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lastChild(): sn.gnome.glib.Node /* None */ =
    sn.gnome.glib.Node.fromRaw(
      g_node_last_child(this.getUnsafeRawPointer().asInstanceOf[Ptr[GNode]])
    )
  end lastChild

  /** Gets the last sibling of a #GNode. This could possibly be the node itself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lastSibling(): sn.gnome.glib.Node /* None */ =
    sn.gnome.glib.Node.fromRaw(
      g_node_last_sibling(this.getUnsafeRawPointer().asInstanceOf[Ptr[GNode]])
    )
  end lastSibling

  /** Gets the maximum height of all branches beneath a #GNode. This is the
    * maximum distance from the #GNode to all leaf nodes.
    *
    * If @root is %NULL, 0 is returned. If @root has no children, 1 is returned.
    * If @root has children, 2 is returned. And so on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def maxHeight(): UInt /* None */ =
    g_node_max_height(this.getUnsafeRawPointer().asInstanceOf[Ptr[GNode]]).value
  end maxHeight

  /** Gets the number of children of a #GNode.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nChildren(): UInt /* None */ =
    g_node_n_children(this.getUnsafeRawPointer().asInstanceOf[Ptr[GNode]]).value
  end nChildren

  /** Gets the number of nodes in a tree.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nNodes(
      flags: sn.gnome.glib.TraverseFlags /* Some(GTraverseFlags) */
  ): UInt /* None */ =
    g_node_n_nodes(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GNode]],
      flags.raw
    ).value
  end nNodes

  /** Gets a child of a #GNode, using the given index. The first child is at
    * index 0. If the index is too big, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nthChild(n: UInt /* Some(guint) */ ): sn.gnome.glib.Node /* None */ =
    sn.gnome.glib.Node.fromRaw(
      g_node_nth_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GNode]],
        guint(n)
      )
    )
  end nthChild

  /** Inserts a #GNode as the first child of the given parent.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prepend(
      node: sn.gnome.glib.Node /* Some(Ptr[GNode]) */
  ): sn.gnome.glib.Node /* None */ =
    sn.gnome.glib.Node.fromRaw(
      g_node_prepend(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GNode]],
        node.getUnsafeRawPointer().asInstanceOf
      )
    )
  end prepend

  /** Reverses the order of the children of a #GNode. (It doesn't change the
    * order of the grandchildren.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def reverseChildren(): Unit /* None */ =
    g_node_reverse_children(this.getUnsafeRawPointer().asInstanceOf[Ptr[GNode]])
  end reverseChildren

  /** Traverses a tree starting at the given root #GNode. It calls the given
    * function for each node visited. The traversal can be halted at any point
    * by returning %TRUE from @func.
    * @func
    *   must not do anything that would modify the structure of the tree.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method traverse/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(NodeTraverseFunc), @type -> DataRecord(GNodeTraverseFunc)))"
  )
  private def traverse__ = ???

  /** Unlinks a #GNode from a tree, resulting in two separate trees.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unlink(): Unit /* None */ =
    g_node_unlink(this.getUnsafeRawPointer().asInstanceOf[Ptr[GNode]])
  end unlink

end Node

object Node:
  def fromRaw(ptr: Ptr[GNode]): Node = new Node(ptr)
end Node
