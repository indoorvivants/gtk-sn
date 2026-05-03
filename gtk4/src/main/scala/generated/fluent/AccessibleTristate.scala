package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkAccessibleTristate

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The possible values for the %GTK_ACCESSIBLE_STATE_PRESSED accessible state.
  *
  * Note that the %GTK_ACCESSIBLE_TRISTATE_FALSE and
  * %GTK_ACCESSIBLE_TRISTATE_TRUE have the same values as %FALSE and %TRUE.
  */
enum AccessibleTristate(val raw: GtkAccessibleTristate):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The state is `false`
    */
  case FALSE
      extends AccessibleTristate(
        GtkAccessibleTristate.GTK_ACCESSIBLE_TRISTATE_FALSE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The state is `true`
    */
  case TRUE
      extends AccessibleTristate(
        GtkAccessibleTristate.GTK_ACCESSIBLE_TRISTATE_TRUE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The state is `mixed`
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
