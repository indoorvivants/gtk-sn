package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkNotebookTab

/** The parameter used in the action signals of `GtkNotebook`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum NotebookTab(val raw: GtkNotebookTab):
  /** the first tab in the notebook
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FIRST extends NotebookTab(GtkNotebookTab.GTK_NOTEBOOK_TAB_FIRST)

  /** the last tab in the notebook
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LAST extends NotebookTab(GtkNotebookTab.GTK_NOTEBOOK_TAB_LAST)
end NotebookTab

object NotebookTab:
  def fromRaw(raw: GtkNotebookTab): NotebookTab =
    raw match
      case GtkNotebookTab.GTK_NOTEBOOK_TAB_FIRST => NotebookTab.FIRST
      case GtkNotebookTab.GTK_NOTEBOOK_TAB_LAST  => NotebookTab.LAST
  end fromRaw
end NotebookTab
