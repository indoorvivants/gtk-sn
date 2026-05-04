package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkDeviceToolType

/** Indicates the specific type of tool being used being a tablet. Such as an
  * airbrush, pencil, etc.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum DeviceToolType(val raw: GdkDeviceToolType):
  /** Tool is of an unknown type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNKNOWN
      extends DeviceToolType(GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_UNKNOWN)

  /** Tool is a standard tablet stylus.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PEN extends DeviceToolType(GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_PEN)

  /** Tool is standard tablet eraser.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ERASER
      extends DeviceToolType(GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_ERASER)

  /** Tool is a brush stylus.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BRUSH
      extends DeviceToolType(GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_BRUSH)

  /** Tool is a pencil stylus.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PENCIL
      extends DeviceToolType(GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_PENCIL)

  /** Tool is an airbrush stylus.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case AIRBRUSH
      extends DeviceToolType(GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_AIRBRUSH)

  /** Tool is a mouse.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MOUSE
      extends DeviceToolType(GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_MOUSE)

  /** Tool is a lens cursor.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LENS extends DeviceToolType(GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_LENS)
end DeviceToolType

object DeviceToolType:
  def fromRaw(raw: GdkDeviceToolType): DeviceToolType =
    raw match
      case GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_UNKNOWN =>
        DeviceToolType.UNKNOWN
      case GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_PEN    => DeviceToolType.PEN
      case GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_ERASER =>
        DeviceToolType.ERASER
      case GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_BRUSH  => DeviceToolType.BRUSH
      case GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_PENCIL =>
        DeviceToolType.PENCIL
      case GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_AIRBRUSH =>
        DeviceToolType.AIRBRUSH
      case GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_MOUSE => DeviceToolType.MOUSE
      case GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_LENS  => DeviceToolType.LENS
  end fromRaw
end DeviceToolType
