package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkAccessibleState

/** The possible accessible states of a [iface@Accessible].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum AccessibleState(val raw: GtkAccessibleState):
  /** A “busy” state. This state has boolean values
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BUSY
      extends AccessibleState(GtkAccessibleState.GTK_ACCESSIBLE_STATE_BUSY)

  /** A “checked” state; indicates the current state of a [class@CheckButton].
    * Value type: [enum@AccessibleTristate]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CHECKED
      extends AccessibleState(GtkAccessibleState.GTK_ACCESSIBLE_STATE_CHECKED)

  /** A “disabled” state; corresponds to the [property@Widget:sensitive]
    * property. It indicates a UI element that is perceivable, but not editable
    * or operable. Value type: boolean
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DISABLED
      extends AccessibleState(GtkAccessibleState.GTK_ACCESSIBLE_STATE_DISABLED)

  /** An “expanded” state; corresponds to the [property@Expander:expanded]
    * property. Value type: boolean or undefined
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EXPANDED
      extends AccessibleState(GtkAccessibleState.GTK_ACCESSIBLE_STATE_EXPANDED)

  /** A “hidden” state; corresponds to the [property@Widget:visible] property.
    * You can use this state explicitly on UI elements that should not be
    * exposed to an assistive technology. Value type: boolean See also:
    * %GTK_ACCESSIBLE_STATE_DISABLED
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HIDDEN
      extends AccessibleState(GtkAccessibleState.GTK_ACCESSIBLE_STATE_HIDDEN)

  /** An “invalid” state; set when a widget is showing an error. Value type:
    * [enum@AccessibleInvalidState]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID
      extends AccessibleState(GtkAccessibleState.GTK_ACCESSIBLE_STATE_INVALID)

  /** A “pressed” state; indicates the current state of a [class@ToggleButton].
    * Value type: [enum@AccessibleTristate] enumeration
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PRESSED
      extends AccessibleState(GtkAccessibleState.GTK_ACCESSIBLE_STATE_PRESSED)

  /** A “selected” state; set when a widget is selected. Value type: boolean or
    * undefined
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SELECTED
      extends AccessibleState(GtkAccessibleState.GTK_ACCESSIBLE_STATE_SELECTED)

  /** Indicates that a widget with the GTK_ACCESSIBLE_ROLE_LINK has been
    * visited. Value type: boolean. Since: 4.12
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case VISITED
      extends AccessibleState(GtkAccessibleState.GTK_ACCESSIBLE_STATE_VISITED)
end AccessibleState

object AccessibleState:
  def fromRaw(raw: GtkAccessibleState): AccessibleState =
    raw match
      case GtkAccessibleState.GTK_ACCESSIBLE_STATE_BUSY => AccessibleState.BUSY
      case GtkAccessibleState.GTK_ACCESSIBLE_STATE_CHECKED =>
        AccessibleState.CHECKED
      case GtkAccessibleState.GTK_ACCESSIBLE_STATE_DISABLED =>
        AccessibleState.DISABLED
      case GtkAccessibleState.GTK_ACCESSIBLE_STATE_EXPANDED =>
        AccessibleState.EXPANDED
      case GtkAccessibleState.GTK_ACCESSIBLE_STATE_HIDDEN =>
        AccessibleState.HIDDEN
      case GtkAccessibleState.GTK_ACCESSIBLE_STATE_INVALID =>
        AccessibleState.INVALID
      case GtkAccessibleState.GTK_ACCESSIBLE_STATE_PRESSED =>
        AccessibleState.PRESSED
      case GtkAccessibleState.GTK_ACCESSIBLE_STATE_SELECTED =>
        AccessibleState.SELECTED
      case GtkAccessibleState.GTK_ACCESSIBLE_STATE_VISITED =>
        AccessibleState.VISITED
  end fromRaw
end AccessibleState
