package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GTraverseType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Specifies the type of traversal performed by g_tree_traverse(),
  * g_node_traverse() and g_node_find(). The different orders are illustrated
  * here:
  *   - In order: A, B, C, D, E, F, G, H, I ![](Sorted_binary_tree_inorder.svg)
  *   - Pre order: F, B, A, D, C, E, G, I, H
  *     ![](Sorted_binary_tree_preorder.svg)
  *   - Post order: A, C, E, D, B, H, I, G, F
  *     ![](Sorted_binary_tree_postorder.svg)
  *   - Level order: F, B, G, A, D, I, C, E, H
  *     ![](Sorted_binary_tree_breadth-first_traversal.svg)
  */
enum TraverseType(val raw: GTraverseType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * vists a node's left child first, then the node itself, then its right
    * child. This is the one to use if you want the output sorted according to
    * the compare function.
    */
  case IN_ORDER extends TraverseType(GTraverseType.G_IN_ORDER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * visits a node, then its children.
    */
  case PRE_ORDER extends TraverseType(GTraverseType.G_PRE_ORDER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * visits the node's children, then the node itself.
    */
  case POST_ORDER extends TraverseType(GTraverseType.G_POST_ORDER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * is not implemented for [balanced binary
    * trees][glib-Balanced-Binary-Trees]. For [n-ary trees][glib-N-ary-Trees],
    * it vists the root node first, then its children, then its grandchildren,
    * and so on. Note that this is less efficient than the other orders.
    */
  case LEVEL_ORDER extends TraverseType(GTraverseType.G_LEVEL_ORDER)
end TraverseType

object TraverseType:
  def fromRaw(raw: GTraverseType): TraverseType =
    raw match
      case GTraverseType.G_IN_ORDER    => TraverseType.IN_ORDER
      case GTraverseType.G_PRE_ORDER   => TraverseType.PRE_ORDER
      case GTraverseType.G_POST_ORDER  => TraverseType.POST_ORDER
      case GTraverseType.G_LEVEL_ORDER => TraverseType.LEVEL_ORDER
  end fromRaw
end TraverseType
