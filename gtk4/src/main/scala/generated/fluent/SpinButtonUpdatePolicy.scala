package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkSpinButtonUpdatePolicy

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Determines whether the spin button displays values outside the adjustment
  * bounds.
  *
  * See [method@Gtk.SpinButton.set_update_policy].
  */
enum SpinButtonUpdatePolicy(val raw: GtkSpinButtonUpdatePolicy):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * When refreshing your `GtkSpinButton`, the value is always displayed
    */
  case ALWAYS
      extends SpinButtonUpdatePolicy(
        GtkSpinButtonUpdatePolicy.GTK_UPDATE_ALWAYS
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * When refreshing your `GtkSpinButton`, the value is only displayed if it is
    * valid within the bounds of the spin button's adjustment
    */
  case IF_VALID
      extends SpinButtonUpdatePolicy(
        GtkSpinButtonUpdatePolicy.GTK_UPDATE_IF_VALID
      )
end SpinButtonUpdatePolicy

object SpinButtonUpdatePolicy:
  def fromRaw(raw: GtkSpinButtonUpdatePolicy): SpinButtonUpdatePolicy =
    raw match
      case GtkSpinButtonUpdatePolicy.GTK_UPDATE_ALWAYS =>
        SpinButtonUpdatePolicy.ALWAYS
      case GtkSpinButtonUpdatePolicy.GTK_UPDATE_IF_VALID =>
        SpinButtonUpdatePolicy.IF_VALID
  end fromRaw
end SpinButtonUpdatePolicy
