package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GResolverNameLookupFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags to modify lookup behavior.
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags to modify lookup behavior.
    */
  enum KnownValue(override val raw: GResolverNameLookupFlags, name: String)
      extends ResolverNameLookupFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * default behavior (same as g_resolver_lookup_by_name())
      */
    case DEFAULT
        extends KnownValue(
          GResolverNameLookupFlags.G_RESOLVER_NAME_LOOKUP_FLAGS_DEFAULT,
          "DEFAULT"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * only resolve ipv4 addresses
      */
    case IPV4_ONLY
        extends KnownValue(
          GResolverNameLookupFlags.G_RESOLVER_NAME_LOOKUP_FLAGS_IPV4_ONLY,
          "IPV4_ONLY"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * only resolve ipv6 addresses
      */
    case IPV6_ONLY
        extends KnownValue(
          GResolverNameLookupFlags.G_RESOLVER_NAME_LOOKUP_FLAGS_IPV6_ONLY,
          "IPV6_ONLY"
        )
  end KnownValue
end ResolverNameLookupFlags
