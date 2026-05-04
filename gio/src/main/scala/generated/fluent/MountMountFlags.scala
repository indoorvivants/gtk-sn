package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GMountMountFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags used when mounting a mount.
  */
class MountMountFlags private (val raw: GMountMountFlags):
  def is(kv: MountMountFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[MountMountFlags.KnownValue]
    MountMountFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"MountMountFlags(${sb.result().mkString(", ")})"
end MountMountFlags

object MountMountFlags:
  export KnownValue.*

  def fromRaw(raw: GMountMountFlags) = new MountMountFlags(raw)

  extension (af: MountMountFlags)
    def &(other: MountMountFlags) =
      MountMountFlags(af.raw & other.raw)
    def |(other: MountMountFlags) =
      MountMountFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags used when mounting a mount.
    */
  enum KnownValue(override val raw: GMountMountFlags, name: String)
      extends MountMountFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags set.
      */
    case NONE extends KnownValue(GMountMountFlags.G_MOUNT_MOUNT_NONE, "NONE")
  end KnownValue
end MountMountFlags
