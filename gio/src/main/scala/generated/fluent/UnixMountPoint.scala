package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GUnixMountPoint

/** Defines a Unix mount point (e.g. <filename>/dev</filename>). This
  * corresponds roughly to a fstab entry.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class UnixMountPoint private[gnome] (raw: Ptr[GUnixMountPoint]):

  def getUnsafeRawPointer(): Ptr[GUnixMountPoint] = this.raw

  /** Compares two unix mount points.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method compare]: Method g_unix_mount_point_compare has no target types"
  )
  private def compare__ = ???

  /** Makes a copy of @mount_point.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method copy]: Method g_unix_mount_point_copy has no target types"
  )
  private def copy__ = ???

  /** Frees a unix mount point.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method free]: Method g_unix_mount_point_free has no target types"
  )
  private def free__ = ???

  /** Gets the device path for a unix mount point.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_device_path]: Method g_unix_mount_point_get_device_path has no target types"
  )
  private def getDevicePath__ = ???

  /** Gets the file system type for the mount point.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_fs_type]: Method g_unix_mount_point_get_fs_type has no target types"
  )
  private def getFsType__ = ???

  /** Gets the mount path for a unix mount point.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_mount_path]: Method g_unix_mount_point_get_mount_path has no target types"
  )
  private def getMountPath__ = ???

  /** Gets the options for the mount point.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_options]: Method g_unix_mount_point_get_options has no target types"
  )
  private def getOptions__ = ???

  /** Guesses whether a Unix mount point can be ejected.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method guess_can_eject]: Method g_unix_mount_point_guess_can_eject has no target types"
  )
  private def guessCanEject__ = ???

  /** Guesses the icon of a Unix mount point.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method guess_icon]: Method g_unix_mount_point_guess_icon has no target types"
  )
  private def guessIcon__ = ???

  /** Guesses the name of a Unix mount point. The result is a translated string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method guess_name]: Method g_unix_mount_point_guess_name has no target types"
  )
  private def guessName__ = ???

  /** Guesses the symbolic icon of a Unix mount point.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method guess_symbolic_icon]: Method g_unix_mount_point_guess_symbolic_icon has no target types"
  )
  private def guessSymbolicIcon__ = ???

  /** Checks if a unix mount point is a loopback device.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method is_loopback]: Method g_unix_mount_point_is_loopback has no target types"
  )
  private def isLoopback__ = ???

  /** Checks if a unix mount point is read only.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method is_readonly]: Method g_unix_mount_point_is_readonly has no target types"
  )
  private def isReadonly__ = ???

  /** Checks if a unix mount point is mountable by the user.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method is_user_mountable]: Method g_unix_mount_point_is_user_mountable has no target types"
  )
  private def isUserMountable__ = ???

end UnixMountPoint
object UnixMountPoint:
  def fromRaw(ptr: Ptr[GUnixMountPoint]): UnixMountPoint = new UnixMountPoint(
    ptr
  )
end UnixMountPoint
