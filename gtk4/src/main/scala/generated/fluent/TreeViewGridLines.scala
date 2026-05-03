package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkTreeViewGridLines

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Used to indicate which grid lines to draw in a tree view.
  */
enum TreeViewGridLines(val raw: GtkTreeViewGridLines):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No grid lines.
    */
  case NONE
      extends TreeViewGridLines(
        GtkTreeViewGridLines.GTK_TREE_VIEW_GRID_LINES_NONE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Horizontal grid lines.
    */
  case HORIZONTAL
      extends TreeViewGridLines(
        GtkTreeViewGridLines.GTK_TREE_VIEW_GRID_LINES_HORIZONTAL
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Vertical grid lines.
    */
  case VERTICAL
      extends TreeViewGridLines(
        GtkTreeViewGridLines.GTK_TREE_VIEW_GRID_LINES_VERTICAL
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Horizontal and vertical grid lines.
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
