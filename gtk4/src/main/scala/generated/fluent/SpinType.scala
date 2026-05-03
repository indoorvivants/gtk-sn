package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkSpinType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The values of the GtkSpinType enumeration are used to specify the change to
  * make in gtk_spin_button_spin().
  */
enum SpinType(val raw: GtkSpinType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Increment by the adjustments step increment.
    */
  case STEP_FORWARD extends SpinType(GtkSpinType.GTK_SPIN_STEP_FORWARD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Decrement by the adjustments step increment.
    */
  case STEP_BACKWARD extends SpinType(GtkSpinType.GTK_SPIN_STEP_BACKWARD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Increment by the adjustments page increment.
    */
  case PAGE_FORWARD extends SpinType(GtkSpinType.GTK_SPIN_PAGE_FORWARD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Decrement by the adjustments page increment.
    */
  case PAGE_BACKWARD extends SpinType(GtkSpinType.GTK_SPIN_PAGE_BACKWARD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Go to the adjustments lower bound.
    */
  case HOME extends SpinType(GtkSpinType.GTK_SPIN_HOME)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Go to the adjustments upper bound.
    */
  case END extends SpinType(GtkSpinType.GTK_SPIN_END)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Change by a specified amount.
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
