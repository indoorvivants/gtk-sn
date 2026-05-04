package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GIOCondition

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A bitwise combination representing a condition to watch for on an event
  * source.
  */
class IOCondition private (val raw: GIOCondition):
  def is(kv: IOCondition): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[IOCondition.KnownValue]
    IOCondition.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"IOCondition(${sb.result().mkString(", ")})"
end IOCondition

object IOCondition:
  export KnownValue.*

  def fromRaw(raw: GIOCondition) = new IOCondition(raw)

  extension (af: IOCondition)
    def &(other: IOCondition) =
      IOCondition(af.raw & other.raw)
    def |(other: IOCondition) =
      IOCondition(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A bitwise combination representing a condition to watch for on an event
    * source.
    */
  enum KnownValue(override val raw: GIOCondition, name: String)
      extends IOCondition(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * There is data to read.
      */
    case IN extends KnownValue(GIOCondition.G_IO_IN, "IN")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Data can be written (without blocking).
      */
    case OUT extends KnownValue(GIOCondition.G_IO_OUT, "OUT")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * There is urgent data to read.
      */
    case PRI extends KnownValue(GIOCondition.G_IO_PRI, "PRI")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Error condition.
      */
    case ERR extends KnownValue(GIOCondition.G_IO_ERR, "ERR")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Hung up (the connection has been broken, usually for pipes and sockets).
      */
    case HUP extends KnownValue(GIOCondition.G_IO_HUP, "HUP")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Invalid request. The file descriptor is not open.
      */
    case NVAL extends KnownValue(GIOCondition.G_IO_NVAL, "NVAL")
  end KnownValue
end IOCondition
