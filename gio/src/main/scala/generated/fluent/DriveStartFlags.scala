package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GDriveStartFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags used when starting a drive.
  */
class DriveStartFlags private (val raw: GDriveStartFlags):
  def is(kv: DriveStartFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[DriveStartFlags.KnownValue]
    DriveStartFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"DriveStartFlags(${sb.result().mkString(", ")})"
end DriveStartFlags

object DriveStartFlags:
  export KnownValue.*

  def fromRaw(raw: GDriveStartFlags) = new DriveStartFlags(raw)

  extension (af: DriveStartFlags)
    def &(other: DriveStartFlags) =
      DriveStartFlags(af.raw & other.raw)
    def |(other: DriveStartFlags) =
      DriveStartFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags used when starting a drive.
    */
  enum KnownValue(override val raw: GDriveStartFlags, name: String)
      extends DriveStartFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags set.
      */
    case NONE extends KnownValue(GDriveStartFlags.G_DRIVE_START_NONE, "NONE")
  end KnownValue
end DriveStartFlags
