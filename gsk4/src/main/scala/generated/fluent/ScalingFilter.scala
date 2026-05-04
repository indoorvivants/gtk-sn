package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.GskScalingFilter

/** The filters used when scaling texture data.
  *
  * The actual implementation of each filter is deferred to the rendering
  * pipeline.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum ScalingFilter(val raw: GskScalingFilter):
  /** linear interpolation filter
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LINEAR extends ScalingFilter(GskScalingFilter.GSK_SCALING_FILTER_LINEAR)

  /** nearest neighbor interpolation filter
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NEAREST
      extends ScalingFilter(GskScalingFilter.GSK_SCALING_FILTER_NEAREST)

  /** linear interpolation along each axis, plus mipmap generation, with linear
    * interpolation along the mipmap levels
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
