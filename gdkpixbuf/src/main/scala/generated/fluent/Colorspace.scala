package sn.gnome.gdkpixbuf.fluent

import _root_.sn.gnome.gdkpixbuf.internal.GdkColorspace

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * This enumeration defines the color spaces that are supported by the
  * gdk-pixbuf library.
  *
  * Currently only RGB is supported.
  */
enum Colorspace(val raw: GdkColorspace):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicates a red/green/blue additive color space.
    */
  case RGB extends Colorspace(GdkColorspace.GDK_COLORSPACE_RGB)
end Colorspace

object Colorspace:
  def fromRaw(raw: GdkColorspace): Colorspace =
    raw match
      case GdkColorspace.GDK_COLORSPACE_RGB => Colorspace.RGB
  end fromRaw
end Colorspace
