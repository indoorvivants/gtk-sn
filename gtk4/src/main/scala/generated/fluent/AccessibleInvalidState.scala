package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkAccessibleInvalidState

/** The possible values for the %GTK_ACCESSIBLE_STATE_INVALID accessible state.
  *
  * Note that the %GTK_ACCESSIBLE_INVALID_FALSE and %GTK_ACCESSIBLE_INVALID_TRUE
  * have the same values as %FALSE and %TRUE.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum AccessibleInvalidState(val raw: GtkAccessibleInvalidState):
  /** There are no detected errors in the value
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FALSE
      extends AccessibleInvalidState(
        GtkAccessibleInvalidState.GTK_ACCESSIBLE_INVALID_FALSE
      )

  /** The value entered by the user has failed validation
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TRUE
      extends AccessibleInvalidState(
        GtkAccessibleInvalidState.GTK_ACCESSIBLE_INVALID_TRUE
      )

  /** A grammatical error was detected
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GRAMMAR
      extends AccessibleInvalidState(
        GtkAccessibleInvalidState.GTK_ACCESSIBLE_INVALID_GRAMMAR
      )

  /** A spelling error was detected
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
