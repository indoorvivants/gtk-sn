package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.TreeNode
import sn.gnome.glib.internal.{GTreeNode, gpointer}

/** An opaque type which identifies a specific node in a #GTree.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TreeNode private[gnome] (raw: Ptr[GTreeNode]):

  def getUnsafeRawPointer(): Ptr[GTreeNode] = this.raw

  /** Gets the key stored at a particular tree node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def key(): Ptr[Byte] /* None */ =
    g_tree_node_key(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTreeNode]]
    ).value
  end key

  /** Returns the next in-order node of the tree, or %NULL if the passed node
    * was already the last one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def next(): sn.gnome.glib.TreeNode /* None */ =
    sn.gnome.glib.TreeNode.fromRaw(
      g_tree_node_next(this.getUnsafeRawPointer().asInstanceOf[Ptr[GTreeNode]])
    )
  end next

  /** Returns the previous in-order node of the tree, or %NULL if the passed
    * node was already the first one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def previous(): sn.gnome.glib.TreeNode /* None */ =
    sn.gnome.glib.TreeNode.fromRaw(
      g_tree_node_previous(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTreeNode]]
      )
    )
  end previous

  /** Gets the value stored at a particular tree node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def value(): Ptr[Byte] /* None */ =
    g_tree_node_value(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTreeNode]]
    ).value
  end value

end TreeNode

object TreeNode:
  def fromRaw(ptr: Ptr[GTreeNode]): TreeNode = new TreeNode(ptr)
end TreeNode
