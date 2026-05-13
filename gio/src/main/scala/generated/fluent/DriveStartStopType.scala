package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GDriveStartStopType

/** Enumeration describing how a drive can be started/stopped.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum DriveStartStopType(val raw: GDriveStartStopType):
  /** Unknown or drive doesn't support start/stop.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNKNOWN
      extends DriveStartStopType(
        GDriveStartStopType.G_DRIVE_START_STOP_TYPE_UNKNOWN
      )

  /** The stop method will physically shut down the drive and e.g. power down
    * the port the drive is attached to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SHUTDOWN
      extends DriveStartStopType(
        GDriveStartStopType.G_DRIVE_START_STOP_TYPE_SHUTDOWN
      )

  /** The start/stop methods are used for connecting/disconnect to the drive
    * over the network.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NETWORK
      extends DriveStartStopType(
        GDriveStartStopType.G_DRIVE_START_STOP_TYPE_NETWORK
      )

  /** The start/stop methods will assemble/disassemble a virtual drive from
    * several physical drives.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MULTIDISK
      extends DriveStartStopType(
        GDriveStartStopType.G_DRIVE_START_STOP_TYPE_MULTIDISK
      )

  /** The start/stop methods will unlock/lock the disk (for example using the
    * ATA <quote>SECURITY UNLOCK DEVICE</quote> command)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
