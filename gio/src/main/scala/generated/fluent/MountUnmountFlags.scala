package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GMountUnmountFlags

/** Flags used when an unmounting a mount.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MountUnmountFlags private (val raw: GMountUnmountFlags):
  def is(kv: MountUnmountFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[MountUnmountFlags.KnownValue]
    MountUnmountFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"MountUnmountFlags(${sb.result().mkString(", ")})"
end MountUnmountFlags

object MountUnmountFlags:
  export KnownValue.*

  def fromRaw(raw: GMountUnmountFlags) = new MountUnmountFlags(raw)

  extension (af: MountUnmountFlags)
    def &(other: MountUnmountFlags) =
      MountUnmountFlags(af.raw & other.raw)
    def |(other: MountUnmountFlags) =
      MountUnmountFlags(af.raw | other.raw)

  /** Flags used when an unmounting a mount.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GMountUnmountFlags, name: String)
      extends MountUnmountFlags(raw):
    override def toString(): String = this.name

    /** No flags set.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE
        extends KnownValue(GMountUnmountFlags.G_MOUNT_UNMOUNT_NONE, "NONE")

    /** Unmount even if there are outstanding file operations on the mount.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case FORCE
        extends KnownValue(GMountUnmountFlags.G_MOUNT_UNMOUNT_FORCE, "FORCE")
  end KnownValue
end MountUnmountFlags
