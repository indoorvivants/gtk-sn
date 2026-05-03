package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkAccessibleProperty

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The possible accessible properties of a [iface@Accessible].
  */
enum AccessibleProperty(val raw: GtkAccessibleProperty):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicates whether inputting text could trigger display of one or more
    * predictions of the user's intended value for a combobox, searchbox, or
    * textbox and specifies how predictions would be presented if they were
    * made. Value type: [enum@AccessibleAutocomplete]
    */
  case AUTOCOMPLETE
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_AUTOCOMPLETE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Defines a string value that describes or annotates the current element.
    * Value type: string
    */
  case DESCRIPTION
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_DESCRIPTION
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicates the availability and type of interactive popup element, such as
    * menu or dialog, that can be triggered by an element.
    */
  case HAS_POPUP
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_HAS_POPUP
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicates keyboard shortcuts that an author has implemented to activate or
    * give focus to an element. Value type: string
    */
  case KEY_SHORTCUTS
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_KEY_SHORTCUTS
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Defines a string value that labels the current element. Value type: string
    */
  case LABEL
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_LABEL
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Defines the hierarchical level of an element within a structure. Value
    * type: integer
    */
  case LEVEL
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_LEVEL
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicates whether an element is modal when displayed. Value type: boolean
    */
  case MODAL
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_MODAL
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicates whether a text box accepts multiple lines of input or only a
    * single line. Value type: boolean
    */
  case MULTI_LINE
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_MULTI_LINE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicates that the user may select more than one item from the current
    * selectable descendants. Value type: boolean
    */
  case MULTI_SELECTABLE
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_MULTI_SELECTABLE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicates whether the element's orientation is horizontal, vertical, or
    * unknown/ambiguous. Value type: [enum@Orientation]
    */
  case ORIENTATION
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_ORIENTATION
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Defines a short hint (a word or short phrase) intended to aid the user
    * with data entry when the control has no value. A hint could be a sample
    * value or a brief description of the expected format. Value type: string
    */
  case PLACEHOLDER
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_PLACEHOLDER
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicates that the element is not editable, but is otherwise operable.
    * Value type: boolean
    */
  case READ_ONLY
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_READ_ONLY
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicates that user input is required on the element before a form may be
    * submitted. Value type: boolean
    */
  case REQUIRED
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_REQUIRED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Defines a human-readable, author-localized description for the role of an
    * element. Value type: string
    */
  case ROLE_DESCRIPTION
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_ROLE_DESCRIPTION
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicates if items in a table or grid are sorted in ascending or
    * descending order. Value type: [enum@AccessibleSort]
    */
  case SORT
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_SORT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Defines the maximum allowed value for a range widget. Value type: double
    */
  case VALUE_MAX
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_VALUE_MAX
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Defines the minimum allowed value for a range widget. Value type: double
    */
  case VALUE_MIN
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_VALUE_MIN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Defines the current value for a range widget. Value type: double
    */
  case VALUE_NOW
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_VALUE_NOW
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Defines the human readable text alternative of aria-valuenow for a range
    * widget. Value type: string
    */
  case VALUE_TEXT
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_VALUE_TEXT
      )
end AccessibleProperty

object AccessibleProperty:
  def fromRaw(raw: GtkAccessibleProperty): AccessibleProperty =
    raw match
      case GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_AUTOCOMPLETE =>
        AccessibleProperty.AUTOCOMPLETE
      case GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_DESCRIPTION =>
        AccessibleProperty.DESCRIPTION
      case GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_HAS_POPUP =>
        AccessibleProperty.HAS_POPUP
      case GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_KEY_SHORTCUTS =>
        AccessibleProperty.KEY_SHORTCUTS
      case GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_LABEL =>
        AccessibleProperty.LABEL
      case GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_LEVEL =>
        AccessibleProperty.LEVEL
      case GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_MODAL =>
        AccessibleProperty.MODAL
      case GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_MULTI_LINE =>
        AccessibleProperty.MULTI_LINE
      case GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_MULTI_SELECTABLE =>
        AccessibleProperty.MULTI_SELECTABLE
      case GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_ORIENTATION =>
        AccessibleProperty.ORIENTATION
      case GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_PLACEHOLDER =>
        AccessibleProperty.PLACEHOLDER
      case GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_READ_ONLY =>
        AccessibleProperty.READ_ONLY
      case GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_REQUIRED =>
        AccessibleProperty.REQUIRED
      case GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_ROLE_DESCRIPTION =>
        AccessibleProperty.ROLE_DESCRIPTION
      case GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_SORT =>
        AccessibleProperty.SORT
      case GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_VALUE_MAX =>
        AccessibleProperty.VALUE_MAX
      case GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_VALUE_MIN =>
        AccessibleProperty.VALUE_MIN
      case GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_VALUE_NOW =>
        AccessibleProperty.VALUE_NOW
      case GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_VALUE_TEXT =>
        AccessibleProperty.VALUE_TEXT
  end fromRaw
end AccessibleProperty
