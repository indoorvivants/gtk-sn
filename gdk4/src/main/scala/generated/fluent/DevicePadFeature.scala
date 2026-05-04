package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkDevicePadFeature

/** A pad feature.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum DevicePadFeature(val raw: GdkDevicePadFeature):
  /** a button
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BUTTON
      extends DevicePadFeature(
        GdkDevicePadFeature.GDK_DEVICE_PAD_FEATURE_BUTTON
      )

  /** a ring-shaped interactive area
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RING
      extends DevicePadFeature(GdkDevicePadFeature.GDK_DEVICE_PAD_FEATURE_RING)

  /** a straight interactive area
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STRIP
      extends DevicePadFeature(GdkDevicePadFeature.GDK_DEVICE_PAD_FEATURE_STRIP)
end DevicePadFeature

object DevicePadFeature:
  def fromRaw(raw: GdkDevicePadFeature): DevicePadFeature =
    raw match
      case GdkDevicePadFeature.GDK_DEVICE_PAD_FEATURE_BUTTON =>
        DevicePadFeature.BUTTON
      case GdkDevicePadFeature.GDK_DEVICE_PAD_FEATURE_RING =>
        DevicePadFeature.RING
      case GdkDevicePadFeature.GDK_DEVICE_PAD_FEATURE_STRIP =>
        DevicePadFeature.STRIP
  end fromRaw
end DevicePadFeature
