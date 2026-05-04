package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkAccessibleProperty

/** The possible accessible properties of a [iface@Accessible].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum AccessibleProperty(val raw: GtkAccessibleProperty):
  /** Indicates whether inputting text could trigger display of one or more
    * predictions of the user's intended value for a combobox, searchbox, or
    * textbox and specifies how predictions would be presented if they were
    * made. Value type: [enum@AccessibleAutocomplete]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case AUTOCOMPLETE
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_AUTOCOMPLETE
      )

  /** Defines a string value that describes or annotates the current element.
    * Value type: string
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DESCRIPTION
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_DESCRIPTION
      )

  /** Indicates the availability and type of interactive popup element, such as
    * menu or dialog, that can be triggered by an element.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HAS_POPUP
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_HAS_POPUP
      )

  /** Indicates keyboard shortcuts that an author has implemented to activate or
    * give focus to an element. Value type: string
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case KEY_SHORTCUTS
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_KEY_SHORTCUTS
      )

  /** Defines a string value that labels the current element. Value type: string
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LABEL
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_LABEL
      )

  /** Defines the hierarchical level of an element within a structure. Value
    * type: integer
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LEVEL
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_LEVEL
      )

  /** Indicates whether an element is modal when displayed. Value type: boolean
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MODAL
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_MODAL
      )

  /** Indicates whether a text box accepts multiple lines of input or only a
    * single line. Value type: boolean
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MULTI_LINE
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_MULTI_LINE
      )

  /** Indicates that the user may select more than one item from the current
    * selectable descendants. Value type: boolean
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MULTI_SELECTABLE
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_MULTI_SELECTABLE
      )

  /** Indicates whether the element's orientation is horizontal, vertical, or
    * unknown/ambiguous. Value type: [enum@Orientation]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ORIENTATION
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_ORIENTATION
      )

  /** Defines a short hint (a word or short phrase) intended to aid the user
    * with data entry when the control has no value. A hint could be a sample
    * value or a brief description of the expected format. Value type: string
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PLACEHOLDER
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_PLACEHOLDER
      )

  /** Indicates that the element is not editable, but is otherwise operable.
    * Value type: boolean
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case READ_ONLY
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_READ_ONLY
      )

  /** Indicates that user input is required on the element before a form may be
    * submitted. Value type: boolean
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case REQUIRED
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_REQUIRED
      )

  /** Defines a human-readable, author-localized description for the role of an
    * element. Value type: string
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ROLE_DESCRIPTION
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_ROLE_DESCRIPTION
      )

  /** Indicates if items in a table or grid are sorted in ascending or
    * descending order. Value type: [enum@AccessibleSort]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SORT
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_SORT
      )

  /** Defines the maximum allowed value for a range widget. Value type: double
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case VALUE_MAX
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_VALUE_MAX
      )

  /** Defines the minimum allowed value for a range widget. Value type: double
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case VALUE_MIN
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_VALUE_MIN
      )

  /** Defines the current value for a range widget. Value type: double
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case VALUE_NOW
      extends AccessibleProperty(
        GtkAccessibleProperty.GTK_ACCESSIBLE_PROPERTY_VALUE_NOW
      )

  /** Defines the human readable text alternative of aria-valuenow for a range
    * widget. Value type: string
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
