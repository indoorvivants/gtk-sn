package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GResolverNameLookupFlags

/** Flags to modify lookup behavior.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ResolverNameLookupFlags private (val raw: GResolverNameLookupFlags):
  def is(kv: ResolverNameLookupFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[ResolverNameLookupFlags.KnownValue]
    ResolverNameLookupFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"ResolverNameLookupFlags(${sb.result().mkString(", ")})"
end ResolverNameLookupFlags

object ResolverNameLookupFlags:
  export KnownValue.*

  def fromRaw(raw: GResolverNameLookupFlags) = new ResolverNameLookupFlags(raw)

  extension (af: ResolverNameLookupFlags)
    def &(other: ResolverNameLookupFlags) =
      ResolverNameLookupFlags(af.raw & other.raw)
    def |(other: ResolverNameLookupFlags) =
      ResolverNameLookupFlags(af.raw | other.raw)

  /** Flags to modify lookup behavior.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GResolverNameLookupFlags, name: String)
      extends ResolverNameLookupFlags(raw):
    override def toString(): String = this.name

    /** default behavior (same as g_resolver_lookup_by_name())
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DEFAULT
        extends KnownValue(
          GResolverNameLookupFlags.G_RESOLVER_NAME_LOOKUP_FLAGS_DEFAULT,
          "DEFAULT"
        )

    /** only resolve ipv4 addresses
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case IPV4_ONLY
        extends KnownValue(
          GResolverNameLookupFlags.G_RESOLVER_NAME_LOOKUP_FLAGS_IPV4_ONLY,
          "IPV4_ONLY"
        )

    /** only resolve ipv6 addresses
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case IPV6_ONLY
        extends KnownValue(
          GResolverNameLookupFlags.G_RESOLVER_NAME_LOOKUP_FLAGS_IPV6_ONLY,
          "IPV6_ONLY"
        )
  end KnownValue
end ResolverNameLookupFlags
