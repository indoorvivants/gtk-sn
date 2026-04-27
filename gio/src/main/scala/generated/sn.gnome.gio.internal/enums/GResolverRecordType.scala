package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GResolverRecordType: _RESOLVER_RECORD_SRV: look up DNS SRV records for a domain _RESOLVER_RECORD_MX: look up DNS MX records for a domain _RESOLVER_RECORD_TXT: look up DNS TXT records for a name _RESOLVER_RECORD_SOA: look up DNS SOA records for a zone _RESOLVER_RECORD_NS: look up DNS NS records for a domain
*/
opaque type GResolverRecordType = CUnsignedInt
object GResolverRecordType extends _BindgenEnumCUnsignedInt[GResolverRecordType]:
  given _tag: Tag[GResolverRecordType] = Tag.UInt
  inline def define(inline a: Long): GResolverRecordType = a.toUInt
  val G_RESOLVER_RECORD_SRV = define(1)
  val G_RESOLVER_RECORD_MX = define(2)
  val G_RESOLVER_RECORD_TXT = define(3)
  val G_RESOLVER_RECORD_SOA = define(4)
  val G_RESOLVER_RECORD_NS = define(5)
  def getName(value: GResolverRecordType): Option[String] =
    value match
      case `G_RESOLVER_RECORD_SRV` => Some("G_RESOLVER_RECORD_SRV")
      case `G_RESOLVER_RECORD_MX` => Some("G_RESOLVER_RECORD_MX")
      case `G_RESOLVER_RECORD_TXT` => Some("G_RESOLVER_RECORD_TXT")
      case `G_RESOLVER_RECORD_SOA` => Some("G_RESOLVER_RECORD_SOA")
      case `G_RESOLVER_RECORD_NS` => Some("G_RESOLVER_RECORD_NS")
      case _ => _root_.scala.None
  extension (a: GResolverRecordType)
    inline def &(b: GResolverRecordType): GResolverRecordType = a & b
    inline def |(b: GResolverRecordType): GResolverRecordType = a | b
    inline def is(b: GResolverRecordType): Boolean = (a & b) == b