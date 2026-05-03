package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkTreeViewDropPosition

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An enum for determining where a dropped row goes.
  */
enum TreeViewDropPosition(val raw: GtkTreeViewDropPosition):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * dropped row is inserted before
    */
  case BEFORE
      extends TreeViewDropPosition(
        GtkTreeViewDropPosition.GTK_TREE_VIEW_DROP_BEFORE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * dropped row is inserted after
    */
  case AFTER
      extends TreeViewDropPosition(
        GtkTreeViewDropPosition.GTK_TREE_VIEW_DROP_AFTER
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * dropped row becomes a child or is inserted before
    */
  case INTO_OR_BEFORE
      extends TreeViewDropPosition(
        GtkTreeViewDropPosition.GTK_TREE_VIEW_DROP_INTO_OR_BEFORE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * dropped row becomes a child or is inserted after
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
