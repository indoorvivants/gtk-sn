package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDriveStartStopType: _DRIVE_START_STOP_TYPE_UNKNOWN: Unknown or drive doesn't support start/stop. _DRIVE_START_STOP_TYPE_SHUTDOWN: The stop method will physically shut down the drive and e.g. power down the port the drive is attached to. _DRIVE_START_STOP_TYPE_NETWORK: The start/stop methods are used for connecting/disconnect to the drive over the network. _DRIVE_START_STOP_TYPE_MULTIDISK: The start/stop methods will assemble/disassemble a virtual drive from several physical drives. _DRIVE_START_STOP_TYPE_PASSWORD: The start/stop methods will unlock/lock the disk (for example using the ATA <quote>SECURITY UNLOCK DEVICE</quote> command)
*/
opaque type GDriveStartStopType = CUnsignedInt
object GDriveStartStopType extends _BindgenEnumCUnsignedInt[GDriveStartStopType]:
  given _tag: Tag[GDriveStartStopType] = Tag.UInt
  inline def define(inline a: Long): GDriveStartStopType = a.toUInt
  val G_DRIVE_START_STOP_TYPE_UNKNOWN = define(0)
  val G_DRIVE_START_STOP_TYPE_SHUTDOWN = define(1)
  val G_DRIVE_START_STOP_TYPE_NETWORK = define(2)
  val G_DRIVE_START_STOP_TYPE_MULTIDISK = define(3)
  val G_DRIVE_START_STOP_TYPE_PASSWORD = define(4)
  def getName(value: GDriveStartStopType): Option[String] =
    value match
      case `G_DRIVE_START_STOP_TYPE_UNKNOWN` => Some("G_DRIVE_START_STOP_TYPE_UNKNOWN")
      case `G_DRIVE_START_STOP_TYPE_SHUTDOWN` => Some("G_DRIVE_START_STOP_TYPE_SHUTDOWN")
      case `G_DRIVE_START_STOP_TYPE_NETWORK` => Some("G_DRIVE_START_STOP_TYPE_NETWORK")
      case `G_DRIVE_START_STOP_TYPE_MULTIDISK` => Some("G_DRIVE_START_STOP_TYPE_MULTIDISK")
      case `G_DRIVE_START_STOP_TYPE_PASSWORD` => Some("G_DRIVE_START_STOP_TYPE_PASSWORD")
      case _ => _root_.scala.None
  extension (a: GDriveStartStopType)
    inline def &(b: GDriveStartStopType): GDriveStartStopType = a & b
    inline def |(b: GDriveStartStopType): GDriveStartStopType = a | b
    inline def is(b: GDriveStartStopType): Boolean = (a & b) == b