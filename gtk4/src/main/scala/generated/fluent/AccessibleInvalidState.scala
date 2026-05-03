package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkAccessibleInvalidState

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The possible values for the %GTK_ACCESSIBLE_STATE_INVALID accessible state.
  *
  * Note that the %GTK_ACCESSIBLE_INVALID_FALSE and %GTK_ACCESSIBLE_INVALID_TRUE
  * have the same values as %FALSE and %TRUE.
  */
enum AccessibleInvalidState(val raw: GtkAccessibleInvalidState):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * There are no detected errors in the value
    */
  case FALSE
      extends AccessibleInvalidState(
        GtkAccessibleInvalidState.GTK_ACCESSIBLE_INVALID_FALSE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The value entered by the user has failed validation
    */
  case TRUE
      extends AccessibleInvalidState(
        GtkAccessibleInvalidState.GTK_ACCESSIBLE_INVALID_TRUE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A grammatical error was detected
    */
  case GRAMMAR
      extends AccessibleInvalidState(
        GtkAccessibleInvalidState.GTK_ACCESSIBLE_INVALID_GRAMMAR
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A spelling error was detected
    */
  case SPELLING
      extends AccessibleInvalidState(
        GtkAccessibleInvalidState.GTK_ACCESSIBLE_INVALID_SPELLING
      )
end AccessibleInvalidState

object AccessibleInvalidState:
  def fromRaw(raw: GtkAccessibleInvalidState): AccessibleInvalidState =
    raw match
      case GtkAccessibleInvalidState.GTK_ACCESSIBLE_INVALID_FALSE =>
        AccessibleInvalidState.FALSE
      case GtkAccessibleInvalidState.GTK_ACCESSIBLE_INVALID_TRUE =>
        AccessibleInvalidState.TRUE
      case GtkAccessibleInvalidState.GTK_ACCESSIBLE_INVALID_GRAMMAR =>
        AccessibleInvalidState.GRAMMAR
      case GtkAccessibleInvalidState.GTK_ACCESSIBLE_INVALID_SPELLING =>
        AccessibleInvalidState.SPELLING
  end fromRaw
end AccessibleInvalidState
