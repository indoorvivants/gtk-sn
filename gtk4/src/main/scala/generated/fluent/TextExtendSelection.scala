package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkTextExtendSelection

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Granularity types that extend the text selection. Use the
  * `GtkTextView::extend-selection` signal to customize the selection.
  */
enum TextExtendSelection(val raw: GtkTextExtendSelection):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects the current word. It is triggered by a double-click for example.
    */
  case WORD
      extends TextExtendSelection(
        GtkTextExtendSelection.GTK_TEXT_EXTEND_SELECTION_WORD
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects the current line. It is triggered by a triple-click for example.
    */
  case LINE
      extends TextExtendSelection(
        GtkTextExtendSelection.GTK_TEXT_EXTEND_SELECTION_LINE
      )
end TextExtendSelection

object TextExtendSelection:
  def fromRaw(raw: GtkTextExtendSelection): TextExtendSelection =
    raw match
      case GtkTextExtendSelection.GTK_TEXT_EXTEND_SELECTION_WORD =>
        TextExtendSelection.WORD
      case GtkTextExtendSelection.GTK_TEXT_EXTEND_SELECTION_LINE =>
        TextExtendSelection.LINE
  end fromRaw
end TextExtendSelection
