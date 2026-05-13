package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GBusType

/** An enumeration for well-known message buses.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum BusType(val raw: GBusType):
  /** An alias for the message bus that activated the process, if any.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STARTER extends BusType(GBusType.G_BUS_TYPE_STARTER)

  /** Not a message bus.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends BusType(GBusType.G_BUS_TYPE_NONE)

  /** The system-wide message bus.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SYSTEM extends BusType(GBusType.G_BUS_TYPE_SYSTEM)

  /** The login session message bus.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SESSION extends BusType(GBusType.G_BUS_TYPE_SESSION)
end BusType

object BusType:
  def fromRaw(raw: GBusType): BusType =
    raw match
      case GBusType.G_BUS_TYPE_STARTER => BusType.STARTER
      case GBusType.G_BUS_TYPE_NONE    => BusType.NONE
      case GBusType.G_BUS_TYPE_SYSTEM  => BusType.SYSTEM
      case GBusType.G_BUS_TYPE_SESSION => BusType.SESSION
  end fromRaw
end BusType
