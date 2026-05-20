package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GIOCondition

/** A bitwise combination representing a condition to watch for on an event
  * source.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class IOCondition private (val raw: GIOCondition):
  def is(kv: IOCondition): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[IOCondition.KnownValue]
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

  /** A bitwise combination representing a condition to watch for on an event
    * source.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GIOCondition, name: scala.Predef.String)
      extends IOCondition(raw):
    override def toString(): scala.Predef.String = this.name

    /** There is data to read.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case IN extends KnownValue(GIOCondition.G_IO_IN, "IN")

    /** Data can be written (without blocking).
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case OUT extends KnownValue(GIOCondition.G_IO_OUT, "OUT")

    /** There is urgent data to read.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case PRI extends KnownValue(GIOCondition.G_IO_PRI, "PRI")

    /** Error condition.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ERR extends KnownValue(GIOCondition.G_IO_ERR, "ERR")

    /** Hung up (the connection has been broken, usually for pipes and sockets).
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case HUP extends KnownValue(GIOCondition.G_IO_HUP, "HUP")

    /** Invalid request. The file descriptor is not open.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NVAL extends KnownValue(GIOCondition.G_IO_NVAL, "NVAL")
  end KnownValue
end IOCondition
