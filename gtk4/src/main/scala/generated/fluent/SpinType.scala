package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkSpinType

/** The values of the GtkSpinType enumeration are used to specify the change to
  * make in gtk_spin_button_spin().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum SpinType(val raw: GtkSpinType):
  /** Increment by the adjustments step increment.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STEP_FORWARD extends SpinType(GtkSpinType.GTK_SPIN_STEP_FORWARD)

  /** Decrement by the adjustments step increment.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STEP_BACKWARD extends SpinType(GtkSpinType.GTK_SPIN_STEP_BACKWARD)

  /** Increment by the adjustments page increment.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PAGE_FORWARD extends SpinType(GtkSpinType.GTK_SPIN_PAGE_FORWARD)

  /** Decrement by the adjustments page increment.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PAGE_BACKWARD extends SpinType(GtkSpinType.GTK_SPIN_PAGE_BACKWARD)

  /** Go to the adjustments lower bound.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HOME extends SpinType(GtkSpinType.GTK_SPIN_HOME)

  /** Go to the adjustments upper bound.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case END extends SpinType(GtkSpinType.GTK_SPIN_END)

  /** Change by a specified amount.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case USER_DEFINED extends SpinType(GtkSpinType.GTK_SPIN_USER_DEFINED)
end SpinType

object SpinType:
  def fromRaw(raw: GtkSpinType): SpinType =
    raw match
      case GtkSpinType.GTK_SPIN_STEP_FORWARD  => SpinType.STEP_FORWARD
      case GtkSpinType.GTK_SPIN_STEP_BACKWARD => SpinType.STEP_BACKWARD
      case GtkSpinType.GTK_SPIN_PAGE_FORWARD  => SpinType.PAGE_FORWARD
      case GtkSpinType.GTK_SPIN_PAGE_BACKWARD => SpinType.PAGE_BACKWARD
      case GtkSpinType.GTK_SPIN_HOME          => SpinType.HOME
      case GtkSpinType.GTK_SPIN_END           => SpinType.END
      case GtkSpinType.GTK_SPIN_USER_DEFINED  => SpinType.USER_DEFINED
  end fromRaw
end SpinType
