package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkTreeViewDropPosition

/** An enum for determining where a dropped row goes.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum TreeViewDropPosition(val raw: GtkTreeViewDropPosition):
  /** dropped row is inserted before
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BEFORE
      extends TreeViewDropPosition(
        GtkTreeViewDropPosition.GTK_TREE_VIEW_DROP_BEFORE
      )

  /** dropped row is inserted after
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case AFTER
      extends TreeViewDropPosition(
        GtkTreeViewDropPosition.GTK_TREE_VIEW_DROP_AFTER
      )

  /** dropped row becomes a child or is inserted before
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INTO_OR_BEFORE
      extends TreeViewDropPosition(
        GtkTreeViewDropPosition.GTK_TREE_VIEW_DROP_INTO_OR_BEFORE
      )

  /** dropped row becomes a child or is inserted after
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INTO_OR_AFTER
      extends TreeViewDropPosition(
        GtkTreeViewDropPosition.GTK_TREE_VIEW_DROP_INTO_OR_AFTER
      )
end TreeViewDropPosition

object TreeViewDropPosition:
  def fromRaw(raw: GtkTreeViewDropPosition): TreeViewDropPosition =
    raw match
      case GtkTreeViewDropPosition.GTK_TREE_VIEW_DROP_BEFORE =>
        TreeViewDropPosition.BEFORE
      case GtkTreeViewDropPosition.GTK_TREE_VIEW_DROP_AFTER =>
        TreeViewDropPosition.AFTER
      case GtkTreeViewDropPosition.GTK_TREE_VIEW_DROP_INTO_OR_BEFORE =>
        TreeViewDropPosition.INTO_OR_BEFORE
      case GtkTreeViewDropPosition.GTK_TREE_VIEW_DROP_INTO_OR_AFTER =>
        TreeViewDropPosition.INTO_OR_AFTER
  end fromRaw
end TreeViewDropPosition
