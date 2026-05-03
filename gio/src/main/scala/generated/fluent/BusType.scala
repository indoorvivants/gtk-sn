package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GBusType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An enumeration for well-known message buses.
  */
enum BusType(val raw: GBusType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * An alias for the message bus that activated the process, if any.
    */
  case STARTER extends BusType(GBusType.G_BUS_TYPE_STARTER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Not a message bus.
    */
  case NONE extends BusType(GBusType.G_BUS_TYPE_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The system-wide message bus.
    */
  case SYSTEM extends BusType(GBusType.G_BUS_TYPE_SYSTEM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The login session message bus.
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
