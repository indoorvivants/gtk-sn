package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GResolverNameLookupFlags: _RESOLVER_NAME_LOOKUP_FLAGS_DEFAULT: default behavior (same as g_resolver_lookup_by_name()) _RESOLVER_NAME_LOOKUP_FLAGS_IPV4_ONLY: only resolve ipv4 addresses _RESOLVER_NAME_LOOKUP_FLAGS_IPV6_ONLY: only resolve ipv6 addresses
*/
opaque type GResolverNameLookupFlags = CUnsignedInt
object GResolverNameLookupFlags extends _BindgenEnumCUnsignedInt[GResolverNameLookupFlags]:
  given _tag: Tag[GResolverNameLookupFlags] = Tag.UInt
  inline def define(inline a: Long): GResolverNameLookupFlags = a.toUInt
  val G_RESOLVER_NAME_LOOKUP_FLAGS_DEFAULT = define(0)
  val G_RESOLVER_NAME_LOOKUP_FLAGS_IPV4_ONLY = define(1)
  val G_RESOLVER_NAME_LOOKUP_FLAGS_IPV6_ONLY = define(2)
  def getName(value: GResolverNameLookupFlags): Option[String] =
    value match
      case `G_RESOLVER_NAME_LOOKUP_FLAGS_DEFAULT` => Some("G_RESOLVER_NAME_LOOKUP_FLAGS_DEFAULT")
      case `G_RESOLVER_NAME_LOOKUP_FLAGS_IPV4_ONLY` => Some("G_RESOLVER_NAME_LOOKUP_FLAGS_IPV4_ONLY")
      case `G_RESOLVER_NAME_LOOKUP_FLAGS_IPV6_ONLY` => Some("G_RESOLVER_NAME_LOOKUP_FLAGS_IPV6_ONLY")
      case _ => _root_.scala.None
  extension (a: GResolverNameLookupFlags)
    inline def &(b: GResolverNameLookupFlags): GResolverNameLookupFlags = a & b
    inline def |(b: GResolverNameLookupFlags): GResolverNameLookupFlags = a | b
    inline def is(b: GResolverNameLookupFlags): Boolean = (a & b) == b