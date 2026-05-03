package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.GskScalingFilter

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The filters used when scaling texture data.
  *
  * The actual implementation of each filter is deferred to the rendering
  * pipeline.
  */
enum ScalingFilter(val raw: GskScalingFilter):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * linear interpolation filter
    */
  case LINEAR extends ScalingFilter(GskScalingFilter.GSK_SCALING_FILTER_LINEAR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * nearest neighbor interpolation filter
    */
  case NEAREST
      extends ScalingFilter(GskScalingFilter.GSK_SCALING_FILTER_NEAREST)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * linear interpolation along each axis, plus mipmap generation, with linear
    * interpolation along the mipmap levels
    */
  case TRILINEAR
      extends ScalingFilter(GskScalingFilter.GSK_SCALING_FILTER_TRILINEAR)
end ScalingFilter

object ScalingFilter:
  def fromRaw(raw: GskScalingFilter): ScalingFilter =
    raw match
      case GskScalingFilter.GSK_SCALING_FILTER_LINEAR  => ScalingFilter.LINEAR
      case GskScalingFilter.GSK_SCALING_FILTER_NEAREST => ScalingFilter.NEAREST
      case GskScalingFilter.GSK_SCALING_FILTER_TRILINEAR =>
        ScalingFilter.TRILINEAR
  end fromRaw
end ScalingFilter
