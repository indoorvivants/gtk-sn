package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkDevicePadFeature

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A pad feature.
  */
enum DevicePadFeature(val raw: GdkDevicePadFeature):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a button
    */
  case BUTTON
      extends DevicePadFeature(
        GdkDevicePadFeature.GDK_DEVICE_PAD_FEATURE_BUTTON
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a ring-shaped interactive area
    */
  case RING
      extends DevicePadFeature(GdkDevicePadFeature.GDK_DEVICE_PAD_FEATURE_RING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a straight interactive area
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
