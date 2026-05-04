package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GMountUnmountFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags used when an unmounting a mount.
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags used when an unmounting a mount.
    */
  enum KnownValue(override val raw: GMountUnmountFlags, name: String)
      extends MountUnmountFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags set.
      */
    case NONE
        extends KnownValue(GMountUnmountFlags.G_MOUNT_UNMOUNT_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Unmount even if there are outstanding file operations on the mount.
      */
    case FORCE
        extends KnownValue(GMountUnmountFlags.G_MOUNT_UNMOUNT_FORCE, "FORCE")
  end KnownValue
end MountUnmountFlags
