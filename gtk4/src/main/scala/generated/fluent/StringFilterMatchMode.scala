package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkStringFilterMatchMode

/** Specifies how search strings are matched inside text.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum StringFilterMatchMode(val raw: GtkStringFilterMatchMode):
  /** The search string and text must match exactly.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EXACT
      extends StringFilterMatchMode(
        GtkStringFilterMatchMode.GTK_STRING_FILTER_MATCH_MODE_EXACT
      )

  /** The search string must be contained as a substring inside the text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SUBSTRING
      extends StringFilterMatchMode(
        GtkStringFilterMatchMode.GTK_STRING_FILTER_MATCH_MODE_SUBSTRING
      )

  /** The text must begin with the search string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
