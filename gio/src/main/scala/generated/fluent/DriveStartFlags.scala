package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GDriveStartFlags

/** Flags used when starting a drive.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
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

  /** Flags used when starting a drive.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GDriveStartFlags, name: String)
      extends DriveStartFlags(raw):
    override def toString(): String = this.name

    /** No flags set.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE extends KnownValue(GDriveStartFlags.G_DRIVE_START_NONE, "NONE")
  end KnownValue
end DriveStartFlags
