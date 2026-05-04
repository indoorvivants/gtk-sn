package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.GTypeFundamentalFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Bit masks used to check or determine specific characteristics of a
  * fundamental type.
  */
class TypeFundamentalFlags private (val raw: GTypeFundamentalFlags):
  def is(kv: TypeFundamentalFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[TypeFundamentalFlags.KnownValue]
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Bit masks used to check or determine specific characteristics of a
    * fundamental type.
    */
  enum KnownValue(override val raw: GTypeFundamentalFlags, name: String)
      extends TypeFundamentalFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Indicates a classed type
      */
    case CLASSED
        extends KnownValue(GTypeFundamentalFlags.G_TYPE_FLAG_CLASSED, "CLASSED")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Indicates an instantiatable type (implies classed)
      */
    case INSTANTIATABLE
        extends KnownValue(
          GTypeFundamentalFlags.G_TYPE_FLAG_INSTANTIATABLE,
          "INSTANTIATABLE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Indicates a flat derivable type
      */
    case DERIVABLE
        extends KnownValue(
          GTypeFundamentalFlags.G_TYPE_FLAG_DERIVABLE,
          "DERIVABLE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Indicates a deep derivable type (implies derivable)
      */
    case DEEP_DERIVABLE
        extends KnownValue(
          GTypeFundamentalFlags.G_TYPE_FLAG_DEEP_DERIVABLE,
          "DEEP_DERIVABLE"
        )
  end KnownValue
end TypeFundamentalFlags
