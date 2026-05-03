package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkSensitivityType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Determines how GTK handles the sensitivity of various controls, such as
  * combo box buttons.
  */
enum SensitivityType(val raw: GtkSensitivityType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The control is made insensitive if no action can be triggered
    */
  case AUTO extends SensitivityType(GtkSensitivityType.GTK_SENSITIVITY_AUTO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The control is always sensitive
    */
  case ON extends SensitivityType(GtkSensitivityType.GTK_SENSITIVITY_ON)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The control is always insensitive
    */
  case OFF extends SensitivityType(GtkSensitivityType.GTK_SENSITIVITY_OFF)
end SensitivityType

object SensitivityType:
  def fromRaw(raw: GtkSensitivityType): SensitivityType =
    raw match
      case GtkSensitivityType.GTK_SENSITIVITY_AUTO => SensitivityType.AUTO
      case GtkSensitivityType.GTK_SENSITIVITY_ON   => SensitivityType.ON
      case GtkSensitivityType.GTK_SENSITIVITY_OFF  => SensitivityType.OFF
  end fromRaw
end SensitivityType
