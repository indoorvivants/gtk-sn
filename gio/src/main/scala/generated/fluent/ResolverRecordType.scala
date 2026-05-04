package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GResolverRecordType

/** The type of record that g_resolver_lookup_records() or
  * g_resolver_lookup_records_async() should retrieve. The records are returned
  * as lists of #GVariant tuples. Each record type has different values in the
  * variant tuples returned.
  *
  * %G_RESOLVER_RECORD_SRV records are returned as variants with the signature
  * `(qqqs)`, containing a `guint16` with the priority, a `guint16` with the
  * weight, a `guint16` with the port, and a string of the hostname.
  *
  * %G_RESOLVER_RECORD_MX records are returned as variants with the signature
  * `(qs)`, representing a `guint16` with the preference, and a string
  * containing the mail exchanger hostname.
  *
  * %G_RESOLVER_RECORD_TXT records are returned as variants with the signature
  * `(as)`, representing an array of the strings in the text record. Note: Most
  * TXT records only contain a single string, but [RFC
  * 1035](https://tools.ietf.org/html/rfc1035#section-3.3.14) does allow a
  * record to contain multiple strings. The RFC which defines the interpretation
  * of a specific TXT record will likely require concatenation of multiple
  * strings if they are present, as with [RFC
  * 7208](https://tools.ietf.org/html/rfc7208#section-3.3).
  *
  * %G_RESOLVER_RECORD_SOA records are returned as variants with the signature
  * `(ssuuuuu)`, representing a string containing the primary name server, a
  * string containing the administrator, the serial as a `guint32`, the refresh
  * interval as a `guint32`, the retry interval as a `guint32`, the expire
  * timeout as a `guint32`, and the TTL as a `guint32`.
  *
  * %G_RESOLVER_RECORD_NS records are returned as variants with the signature
  * `(s)`, representing a string of the hostname of the name server.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum ResolverRecordType(val raw: GResolverRecordType):
  /** look up DNS SRV records for a domain
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SRV extends ResolverRecordType(GResolverRecordType.G_RESOLVER_RECORD_SRV)

  /** look up DNS MX records for a domain
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MX extends ResolverRecordType(GResolverRecordType.G_RESOLVER_RECORD_MX)

  /** look up DNS TXT records for a name
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TXT extends ResolverRecordType(GResolverRecordType.G_RESOLVER_RECORD_TXT)

  /** look up DNS SOA records for a zone
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SOA extends ResolverRecordType(GResolverRecordType.G_RESOLVER_RECORD_SOA)

  /** look up DNS NS records for a domain
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NS extends ResolverRecordType(GResolverRecordType.G_RESOLVER_RECORD_NS)
end ResolverRecordType

object ResolverRecordType:
  def fromRaw(raw: GResolverRecordType): ResolverRecordType =
    raw match
      case GResolverRecordType.G_RESOLVER_RECORD_SRV => ResolverRecordType.SRV
      case GResolverRecordType.G_RESOLVER_RECORD_MX  => ResolverRecordType.MX
      case GResolverRecordType.G_RESOLVER_RECORD_TXT => ResolverRecordType.TXT
      case GResolverRecordType.G_RESOLVER_RECORD_SOA => ResolverRecordType.SOA
      case GResolverRecordType.G_RESOLVER_RECORD_NS  => ResolverRecordType.NS
  end fromRaw
end ResolverRecordType
