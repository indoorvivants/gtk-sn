package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkAccessibleTristate

/** The possible values for the %GTK_ACCESSIBLE_STATE_PRESSED accessible state.
  *
  * Note that the %GTK_ACCESSIBLE_TRISTATE_FALSE and
  * %GTK_ACCESSIBLE_TRISTATE_TRUE have the same values as %FALSE and %TRUE.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum AccessibleTristate(val raw: GtkAccessibleTristate):
  /** The state is `false`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FALSE
      extends AccessibleTristate(
        GtkAccessibleTristate.GTK_ACCESSIBLE_TRISTATE_FALSE
      )

  /** The state is `true`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TRUE
      extends AccessibleTristate(
        GtkAccessibleTristate.GTK_ACCESSIBLE_TRISTATE_TRUE
      )

  /** The state is `mixed`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MIXED
      extends AccessibleTristate(
        GtkAccessibleTristate.GTK_ACCESSIBLE_TRISTATE_MIXED
      )
end AccessibleTristate

object AccessibleTristate:
  def fromRaw(raw: GtkAccessibleTristate): AccessibleTristate =
    raw match
      case GtkAccessibleTristate.GTK_ACCESSIBLE_TRISTATE_FALSE =>
        AccessibleTristate.FALSE
      case GtkAccessibleTristate.GTK_ACCESSIBLE_TRISTATE_TRUE =>
        AccessibleTristate.TRUE
      case GtkAccessibleTristate.GTK_ACCESSIBLE_TRISTATE_MIXED =>
        AccessibleTristate.MIXED
  end fromRaw
end AccessibleTristate
