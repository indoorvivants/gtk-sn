package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkSpinButtonUpdatePolicy

/** Determines whether the spin button displays values outside the adjustment
  * bounds.
  *
  * See [method@Gtk.SpinButton.set_update_policy].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum SpinButtonUpdatePolicy(val raw: GtkSpinButtonUpdatePolicy):
  /** When refreshing your `GtkSpinButton`, the value is always displayed
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ALWAYS
      extends SpinButtonUpdatePolicy(
        GtkSpinButtonUpdatePolicy.GTK_UPDATE_ALWAYS
      )

  /** When refreshing your `GtkSpinButton`, the value is only displayed if it is
    * valid within the bounds of the spin button's adjustment
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
