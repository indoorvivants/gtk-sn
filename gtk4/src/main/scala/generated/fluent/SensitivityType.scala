package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkSensitivityType

/** Determines how GTK handles the sensitivity of various controls, such as
  * combo box buttons.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum SensitivityType(val raw: GtkSensitivityType):
  /** The control is made insensitive if no action can be triggered
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case AUTO extends SensitivityType(GtkSensitivityType.GTK_SENSITIVITY_AUTO)

  /** The control is always sensitive
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ON extends SensitivityType(GtkSensitivityType.GTK_SENSITIVITY_ON)

  /** The control is always insensitive
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
