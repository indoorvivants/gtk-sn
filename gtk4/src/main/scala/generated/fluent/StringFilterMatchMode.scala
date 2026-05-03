package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkStringFilterMatchMode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Specifies how search strings are matched inside text.
  */
enum StringFilterMatchMode(val raw: GtkStringFilterMatchMode):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The search string and text must match exactly.
    */
  case EXACT
      extends StringFilterMatchMode(
        GtkStringFilterMatchMode.GTK_STRING_FILTER_MATCH_MODE_EXACT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The search string must be contained as a substring inside the text.
    */
  case SUBSTRING
      extends StringFilterMatchMode(
        GtkStringFilterMatchMode.GTK_STRING_FILTER_MATCH_MODE_SUBSTRING
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The text must begin with the search string.
    */
  case PREFIX
      extends StringFilterMatchMode(
        GtkStringFilterMatchMode.GTK_STRING_FILTER_MATCH_MODE_PREFIX
      )
end StringFilterMatchMode

object StringFilterMatchMode:
  def fromRaw(raw: GtkStringFilterMatchMode): StringFilterMatchMode =
    raw match
      case GtkStringFilterMatchMode.GTK_STRING_FILTER_MATCH_MODE_EXACT =>
        StringFilterMatchMode.EXACT
      case GtkStringFilterMatchMode.GTK_STRING_FILTER_MATCH_MODE_SUBSTRING =>
        StringFilterMatchMode.SUBSTRING
      case GtkStringFilterMatchMode.GTK_STRING_FILTER_MATCH_MODE_PREFIX =>
        StringFilterMatchMode.PREFIX
  end fromRaw
end StringFilterMatchMode
