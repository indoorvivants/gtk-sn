package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkTreeViewColumnSizing

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The sizing method the column uses to determine its width. Please note that
  * %GTK_TREE_VIEW_COLUMN_AUTOSIZE are inefficient for large views, and can make
  * columns appear choppy.
  */
enum TreeViewColumnSizing(val raw: GtkTreeViewColumnSizing):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Columns only get bigger in reaction to changes in the model
    */
  case GROW_ONLY
      extends TreeViewColumnSizing(
        GtkTreeViewColumnSizing.GTK_TREE_VIEW_COLUMN_GROW_ONLY
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Columns resize to be the optimal size every time the model changes.
    */
  case AUTOSIZE
      extends TreeViewColumnSizing(
        GtkTreeViewColumnSizing.GTK_TREE_VIEW_COLUMN_AUTOSIZE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Columns are a fixed numbers of pixels wide.
    */
  case FIXED
      extends TreeViewColumnSizing(
        GtkTreeViewColumnSizing.GTK_TREE_VIEW_COLUMN_FIXED
      )
end TreeViewColumnSizing

object TreeViewColumnSizing:
  def fromRaw(raw: GtkTreeViewColumnSizing): TreeViewColumnSizing =
    raw match
      case GtkTreeViewColumnSizing.GTK_TREE_VIEW_COLUMN_GROW_ONLY =>
        TreeViewColumnSizing.GROW_ONLY
      case GtkTreeViewColumnSizing.GTK_TREE_VIEW_COLUMN_AUTOSIZE =>
        TreeViewColumnSizing.AUTOSIZE
      case GtkTreeViewColumnSizing.GTK_TREE_VIEW_COLUMN_FIXED =>
        TreeViewColumnSizing.FIXED
  end fromRaw
end TreeViewColumnSizing
