package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.GTypeFundamentalFlags

/** Bit masks used to check or determine specific characteristics of a
  * fundamental type.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TypeFundamentalFlags private (val raw: GTypeFundamentalFlags):
  def is(kv: TypeFundamentalFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[TypeFundamentalFlags.KnownValue]
    TypeFundamentalFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"TypeFundamentalFlags(${sb.result().mkString(", ")})"
end TypeFundamentalFlags

object TypeFundamentalFlags:
  export KnownValue.*

  def fromRaw(raw: GTypeFundamentalFlags) = new TypeFundamentalFlags(raw)

  extension (af: TypeFundamentalFlags)
    def &(other: TypeFundamentalFlags) =
      TypeFundamentalFlags(af.raw & other.raw)
    def |(other: TypeFundamentalFlags) =
      TypeFundamentalFlags(af.raw | other.raw)

  /** Bit masks used to check or determine specific characteristics of a
    * fundamental type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(
      override val raw: GTypeFundamentalFlags,
      name: scala.Predef.String
  ) extends TypeFundamentalFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** Indicates a classed type
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case CLASSED
        extends KnownValue(GTypeFundamentalFlags.G_TYPE_FLAG_CLASSED, "CLASSED")

    /** Indicates an instantiatable type (implies classed)
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case INSTANTIATABLE
        extends KnownValue(
          GTypeFundamentalFlags.G_TYPE_FLAG_INSTANTIATABLE,
          "INSTANTIATABLE"
        )

    /** Indicates a flat derivable type
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DERIVABLE
        extends KnownValue(
          GTypeFundamentalFlags.G_TYPE_FLAG_DERIVABLE,
          "DERIVABLE"
        )

    /** Indicates a deep derivable type (implies derivable)
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DEEP_DERIVABLE
        extends KnownValue(
          GTypeFundamentalFlags.G_TYPE_FLAG_DEEP_DERIVABLE,
          "DEEP_DERIVABLE"
        )
  end KnownValue
end TypeFundamentalFlags
