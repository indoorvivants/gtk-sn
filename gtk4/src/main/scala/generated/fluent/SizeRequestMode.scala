package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkSizeRequestMode

/** Specifies a preference for height-for-width or width-for-height geometry
  * management.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum SizeRequestMode(val raw: GtkSizeRequestMode):
  /** Prefer height-for-width geometry management
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HEIGHT_FOR_WIDTH
      extends SizeRequestMode(
        GtkSizeRequestMode.GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH
      )

  /** Prefer width-for-height geometry management
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WIDTH_FOR_HEIGHT
      extends SizeRequestMode(
        GtkSizeRequestMode.GTK_SIZE_REQUEST_WIDTH_FOR_HEIGHT
      )

  /** Don’t trade height-for-width or width-for-height
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CONSTANT_SIZE
      extends SizeRequestMode(GtkSizeRequestMode.GTK_SIZE_REQUEST_CONSTANT_SIZE)
end SizeRequestMode

object SizeRequestMode:
  def fromRaw(raw: GtkSizeRequestMode): SizeRequestMode =
    raw match
      case GtkSizeRequestMode.GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH =>
        SizeRequestMode.HEIGHT_FOR_WIDTH
      case GtkSizeRequestMode.GTK_SIZE_REQUEST_WIDTH_FOR_HEIGHT =>
        SizeRequestMode.WIDTH_FOR_HEIGHT
      case GtkSizeRequestMode.GTK_SIZE_REQUEST_CONSTANT_SIZE =>
        SizeRequestMode.CONSTANT_SIZE
  end fromRaw
end SizeRequestMode
