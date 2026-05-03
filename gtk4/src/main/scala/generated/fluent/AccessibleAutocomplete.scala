package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkAccessibleAutocomplete

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The possible values for the %GTK_ACCESSIBLE_PROPERTY_AUTOCOMPLETE accessible
  * property.
  */
enum AccessibleAutocomplete(val raw: GtkAccessibleAutocomplete):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Automatic suggestions are not displayed.
    */
  case NONE
      extends AccessibleAutocomplete(
        GtkAccessibleAutocomplete.GTK_ACCESSIBLE_AUTOCOMPLETE_NONE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * When a user is providing input, text suggesting one way to complete the
    * provided input may be dynamically inserted after the caret.
    */
  case INLINE
      extends AccessibleAutocomplete(
        GtkAccessibleAutocomplete.GTK_ACCESSIBLE_AUTOCOMPLETE_INLINE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * When a user is providing input, an element containing a collection of
    * values that could complete the provided input may be displayed.
    */
  case LIST
      extends AccessibleAutocomplete(
        GtkAccessibleAutocomplete.GTK_ACCESSIBLE_AUTOCOMPLETE_LIST
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * When a user is providing input, an element containing a collection of
    * values that could complete the provided input may be displayed. If
    * displayed, one value in the collection is automatically selected, and the
    * text needed to complete the automatically selected value appears after the
    * caret in the input.
    */
  case BOTH
      extends AccessibleAutocomplete(
        GtkAccessibleAutocomplete.GTK_ACCESSIBLE_AUTOCOMPLETE_BOTH
      )
end AccessibleAutocomplete

object AccessibleAutocomplete:
  def fromRaw(raw: GtkAccessibleAutocomplete): AccessibleAutocomplete =
    raw match
      case GtkAccessibleAutocomplete.GTK_ACCESSIBLE_AUTOCOMPLETE_NONE =>
        AccessibleAutocomplete.NONE
      case GtkAccessibleAutocomplete.GTK_ACCESSIBLE_AUTOCOMPLETE_INLINE =>
        AccessibleAutocomplete.INLINE
      case GtkAccessibleAutocomplete.GTK_ACCESSIBLE_AUTOCOMPLETE_LIST =>
        AccessibleAutocomplete.LIST
      case GtkAccessibleAutocomplete.GTK_ACCESSIBLE_AUTOCOMPLETE_BOTH =>
        AccessibleAutocomplete.BOTH
  end fromRaw
end AccessibleAutocomplete
