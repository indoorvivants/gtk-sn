package sn.gnome.gdkpixbuf.fluent

import _root_.sn.gnome.gdkpixbuf.internal.GdkInterpType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Interpolation modes for scaling functions.
  *
  * The `GDK_INTERP_NEAREST` mode is the fastest scaling method, but has
  * horrible quality when scaling down; `GDK_INTERP_BILINEAR` is the best choice
  * if you aren't sure what to choose, it has a good speed/quality balance.
  *
  * **Note**: Cubic filtering is missing from the list; hyperbolic interpolation
  * is just as fast and results in higher quality.
  */
enum InterpType(val raw: GdkInterpType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Nearest neighbor sampling; this is the fastest and lowest quality mode.
    * Quality is normally unacceptable when scaling down, but may be OK when
    * scaling up.
    */
  case NEAREST extends InterpType(GdkInterpType.GDK_INTERP_NEAREST)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This is an accurate simulation of the PostScript image operator without
    * any interpolation enabled. Each pixel is rendered as a tiny parallelogram
    * of solid color, the edges of which are implemented with antialiasing. It
    * resembles nearest neighbor for enlargement, and bilinear for reduction.
    */
  case TILES extends InterpType(GdkInterpType.GDK_INTERP_TILES)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Best quality/speed balance; use this mode by default. Bilinear
    * interpolation. For enlargement, it is equivalent to point-sampling the
    * ideal bilinear-interpolated image. For reduction, it is equivalent to
    * laying down small tiles and integrating over the coverage area.
    */
  case BILINEAR extends InterpType(GdkInterpType.GDK_INTERP_BILINEAR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This is the slowest and highest quality reconstruction function. It is
    * derived from the hyperbolic filters in Wolberg's "Digital Image Warping",
    * and is formally defined as the hyperbolic-filter sampling the ideal
    * hyperbolic-filter interpolated image (the filter is designed to be
    * idempotent for 1:1 pixel mapping). **Deprecated**: this interpolation
    * filter is deprecated, as in reality it has a lower quality than the @GDK_INTERP_BILINEAR
    * filter (Since: 2.38)
    */
  case HYPER extends InterpType(GdkInterpType.GDK_INTERP_HYPER)
end InterpType

object InterpType:
  def fromRaw(raw: GdkInterpType): InterpType =
    raw match
      case GdkInterpType.GDK_INTERP_NEAREST  => InterpType.NEAREST
      case GdkInterpType.GDK_INTERP_TILES    => InterpType.TILES
      case GdkInterpType.GDK_INTERP_BILINEAR => InterpType.BILINEAR
      case GdkInterpType.GDK_INTERP_HYPER    => InterpType.HYPER
  end fromRaw
end InterpType
