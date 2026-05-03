package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkSizeRequestMode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Specifies a preference for height-for-width or width-for-height geometry
  * management.
  */
enum SizeRequestMode(val raw: GtkSizeRequestMode):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Prefer height-for-width geometry management
    */
  case HEIGHT_FOR_WIDTH
      extends SizeRequestMode(
        GtkSizeRequestMode.GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Prefer width-for-height geometry management
    */
  case WIDTH_FOR_HEIGHT
      extends SizeRequestMode(
        GtkSizeRequestMode.GTK_SIZE_REQUEST_WIDTH_FOR_HEIGHT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Don’t trade height-for-width or width-for-height
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
