package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkAccessibleState

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The possible accessible states of a [iface@Accessible].
  */
enum AccessibleState(val raw: GtkAccessibleState):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A “busy” state. This state has boolean values
    */
  case BUSY
      extends AccessibleState(GtkAccessibleState.GTK_ACCESSIBLE_STATE_BUSY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A “checked” state; indicates the current state of a [class@CheckButton].
    * Value type: [enum@AccessibleTristate]
    */
  case CHECKED
      extends AccessibleState(GtkAccessibleState.GTK_ACCESSIBLE_STATE_CHECKED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A “disabled” state; corresponds to the [property@Widget:sensitive]
    * property. It indicates a UI element that is perceivable, but not editable
    * or operable. Value type: boolean
    */
  case DISABLED
      extends AccessibleState(GtkAccessibleState.GTK_ACCESSIBLE_STATE_DISABLED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An “expanded” state; corresponds to the [property@Expander:expanded]
    * property. Value type: boolean or undefined
    */
  case EXPANDED
      extends AccessibleState(GtkAccessibleState.GTK_ACCESSIBLE_STATE_EXPANDED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A “hidden” state; corresponds to the [property@Widget:visible] property.
    * You can use this state explicitly on UI elements that should not be
    * exposed to an assistive technology. Value type: boolean See also:
    * %GTK_ACCESSIBLE_STATE_DISABLED
    */
  case HIDDEN
      extends AccessibleState(GtkAccessibleState.GTK_ACCESSIBLE_STATE_HIDDEN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An “invalid” state; set when a widget is showing an error. Value type:
    * [enum@AccessibleInvalidState]
    */
  case INVALID
      extends AccessibleState(GtkAccessibleState.GTK_ACCESSIBLE_STATE_INVALID)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A “pressed” state; indicates the current state of a [class@ToggleButton].
    * Value type: [enum@AccessibleTristate] enumeration
    */
  case PRESSED
      extends AccessibleState(GtkAccessibleState.GTK_ACCESSIBLE_STATE_PRESSED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A “selected” state; set when a widget is selected. Value type: boolean or
    * undefined
    */
  case SELECTED
      extends AccessibleState(GtkAccessibleState.GTK_ACCESSIBLE_STATE_SELECTED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicates that a widget with the GTK_ACCESSIBLE_ROLE_LINK has been
    * visited. Value type: boolean. Since: 4.12
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
