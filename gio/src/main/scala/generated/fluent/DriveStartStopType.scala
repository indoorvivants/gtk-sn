package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GDriveStartStopType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Enumeration describing how a drive can be started/stopped.
  */
enum DriveStartStopType(val raw: GDriveStartStopType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unknown or drive doesn't support start/stop.
    */
  case UNKNOWN
      extends DriveStartStopType(
        GDriveStartStopType.G_DRIVE_START_STOP_TYPE_UNKNOWN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The stop method will physically shut down the drive and e.g. power down
    * the port the drive is attached to.
    */
  case SHUTDOWN
      extends DriveStartStopType(
        GDriveStartStopType.G_DRIVE_START_STOP_TYPE_SHUTDOWN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The start/stop methods are used for connecting/disconnect to the drive
    * over the network.
    */
  case NETWORK
      extends DriveStartStopType(
        GDriveStartStopType.G_DRIVE_START_STOP_TYPE_NETWORK
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The start/stop methods will assemble/disassemble a virtual drive from
    * several physical drives.
    */
  case MULTIDISK
      extends DriveStartStopType(
        GDriveStartStopType.G_DRIVE_START_STOP_TYPE_MULTIDISK
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The start/stop methods will unlock/lock the disk (for example using the
    * ATA <quote>SECURITY UNLOCK DEVICE</quote> command)
    */
  case PASSWORD
      extends DriveStartStopType(
        GDriveStartStopType.G_DRIVE_START_STOP_TYPE_PASSWORD
      )
end DriveStartStopType

object DriveStartStopType:
  def fromRaw(raw: GDriveStartStopType): DriveStartStopType =
    raw match
      case GDriveStartStopType.G_DRIVE_START_STOP_TYPE_UNKNOWN =>
        DriveStartStopType.UNKNOWN
      case GDriveStartStopType.G_DRIVE_START_STOP_TYPE_SHUTDOWN =>
        DriveStartStopType.SHUTDOWN
      case GDriveStartStopType.G_DRIVE_START_STOP_TYPE_NETWORK =>
        DriveStartStopType.NETWORK
      case GDriveStartStopType.G_DRIVE_START_STOP_TYPE_MULTIDISK =>
        DriveStartStopType.MULTIDISK
      case GDriveStartStopType.G_DRIVE_START_STOP_TYPE_PASSWORD =>
        DriveStartStopType.PASSWORD
  end fromRaw
end DriveStartStopType
