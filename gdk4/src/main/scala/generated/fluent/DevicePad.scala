package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.DevicePadFeature

trait DevicePad:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Returns the group the given @feature and @idx belong to.
    *
    * f the feature or index do not exist in @pad, -1 is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFeatureGroup(
      feature: DevicePadFeature /* Some(GdkDevicePadFeature) */,
      feature_idx: Int /* Some(CInt) */
  ): Int /* None */ =
    gdk_device_pad_get_feature_group(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDevicePad]],
      feature.raw,
      feature_idx
    )
  end getFeatureGroup

  /** Returns the number of modes that @group may have.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getGroupNModes(group_idx: Int /* Some(CInt) */ ): Int /* None */ =
    gdk_device_pad_get_group_n_modes(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDevicePad]],
      group_idx
    )
  end getGroupNModes

  /** Returns the number of features a tablet pad has.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNFeatures(
      feature: DevicePadFeature /* Some(GdkDevicePadFeature) */
  ): Int /* None */ =
    gdk_device_pad_get_n_features(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDevicePad]],
      feature.raw
    )
  end getNFeatures

  /** Returns the number of groups this pad device has.
    *
    * Pads have at least one group. A pad group is a subcollection of
    * buttons/strip/rings that is affected collectively by a same current mode.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNGroups(): Int /* None */ =
    gdk_device_pad_get_n_groups(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDevicePad]]
    )
  end getNGroups

end DevicePad

object DevicePad:
  class Abstract(raw: Ptr[Byte]) extends DevicePad:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end DevicePad
