package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkDeviceToolType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Indicates the specific type of tool being used being a tablet. Such as an
  * airbrush, pencil, etc.
  */
enum DeviceToolType(val raw: GdkDeviceToolType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tool is of an unknown type.
    */
  case UNKNOWN
      extends DeviceToolType(GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_UNKNOWN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tool is a standard tablet stylus.
    */
  case PEN extends DeviceToolType(GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_PEN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tool is standard tablet eraser.
    */
  case ERASER
      extends DeviceToolType(GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_ERASER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tool is a brush stylus.
    */
  case BRUSH
      extends DeviceToolType(GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_BRUSH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tool is a pencil stylus.
    */
  case PENCIL
      extends DeviceToolType(GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_PENCIL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tool is an airbrush stylus.
    */
  case AIRBRUSH
      extends DeviceToolType(GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_AIRBRUSH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tool is a mouse.
    */
  case MOUSE
      extends DeviceToolType(GdkDeviceToolType.GDK_DEVICE_TOOL_TYPE_MOUSE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tool is a lens cursor.
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
