package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkTreeViewGridLines

/** Used to indicate which grid lines to draw in a tree view.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum TreeViewGridLines(val raw: GtkTreeViewGridLines):
  /** No grid lines.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE
      extends TreeViewGridLines(
        GtkTreeViewGridLines.GTK_TREE_VIEW_GRID_LINES_NONE
      )

  /** Horizontal grid lines.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HORIZONTAL
      extends TreeViewGridLines(
        GtkTreeViewGridLines.GTK_TREE_VIEW_GRID_LINES_HORIZONTAL
      )

  /** Vertical grid lines.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case VERTICAL
      extends TreeViewGridLines(
        GtkTreeViewGridLines.GTK_TREE_VIEW_GRID_LINES_VERTICAL
      )

  /** Horizontal and vertical grid lines.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BOTH
      extends TreeViewGridLines(
        GtkTreeViewGridLines.GTK_TREE_VIEW_GRID_LINES_BOTH
      )
end TreeViewGridLines

object TreeViewGridLines:
  def fromRaw(raw: GtkTreeViewGridLines): TreeViewGridLines =
    raw match
      case GtkTreeViewGridLines.GTK_TREE_VIEW_GRID_LINES_NONE =>
        TreeViewGridLines.NONE
      case GtkTreeViewGridLines.GTK_TREE_VIEW_GRID_LINES_HORIZONTAL =>
        TreeViewGridLines.HORIZONTAL
      case GtkTreeViewGridLines.GTK_TREE_VIEW_GRID_LINES_VERTICAL =>
        TreeViewGridLines.VERTICAL
      case GtkTreeViewGridLines.GTK_TREE_VIEW_GRID_LINES_BOTH =>
        TreeViewGridLines.BOTH
  end fromRaw
end TreeViewGridLines
