package sn.gnome.gdkpixbuf

import _root_.sn.gnome.gdkpixbuf.internal.GdkColorspace

/** This enumeration defines the color spaces that are supported by the
  * gdk-pixbuf library.
  *
  * Currently only RGB is supported.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum Colorspace(val raw: GdkColorspace):
  /** Indicates a red/green/blue additive color space.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RGB extends Colorspace(GdkColorspace.GDK_COLORSPACE_RGB)
end Colorspace

object Colorspace:
  def fromRaw(raw: GdkColorspace): Colorspace =
    raw match
      case GdkColorspace.GDK_COLORSPACE_RGB => Colorspace.RGB
  end fromRaw
end Colorspace
