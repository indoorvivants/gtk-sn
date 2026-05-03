package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GBusType: _BUS_TYPE_STARTER: An alias for the message bus that activated the process, if any. _BUS_TYPE_NONE: Not a message bus. _BUS_TYPE_SYSTEM: The system-wide message bus. _BUS_TYPE_SESSION: The login session message bus.
*/
opaque type GBusType = CInt
object GBusType extends _BindgenEnumCInt[GBusType]:
  given _tag: Tag[GBusType] = Tag.Int
  inline def define(inline a: CInt): GBusType = a
  val G_BUS_TYPE_STARTER = define(-1)
  val G_BUS_TYPE_NONE = define(0)
  val G_BUS_TYPE_SYSTEM = define(1)
  val G_BUS_TYPE_SESSION = define(2)
  def getName(value: GBusType): Option[String] =
    value match
      case `G_BUS_TYPE_STARTER` => Some("G_BUS_TYPE_STARTER")
      case `G_BUS_TYPE_NONE` => Some("G_BUS_TYPE_NONE")
      case `G_BUS_TYPE_SYSTEM` => Some("G_BUS_TYPE_SYSTEM")
      case `G_BUS_TYPE_SESSION` => Some("G_BUS_TYPE_SESSION")
      case _ => _root_.scala.None
  extension (a: GBusType)
    inline def &(b: GBusType): GBusType = a & b
    inline def |(b: GBusType): GBusType = a | b
    inline def is(b: GBusType): Boolean = (a & b) == b