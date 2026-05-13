package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GUriFlags

/** Flags that describe a URI.
  *
  * When parsing a URI, if you need to choose different flags based on the type
  * of URI, you can use g_uri_peek_scheme() on the URI string to check the
  * scheme first, and use that to decide what flags to parse it with.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class UriFlags private (val raw: GUriFlags):
  def is(kv: UriFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[UriFlags.KnownValue]
    UriFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"UriFlags(${sb.result().mkString(", ")})"
end UriFlags

object UriFlags:
  export KnownValue.*

  def fromRaw(raw: GUriFlags) = new UriFlags(raw)

  extension (af: UriFlags)
    def &(other: UriFlags) =
      UriFlags(af.raw & other.raw)
    def |(other: UriFlags) =
      UriFlags(af.raw | other.raw)

  /** Flags that describe a URI.
    *
    * When parsing a URI, if you need to choose different flags based on the
    * type of URI, you can use g_uri_peek_scheme() on the URI string to check
    * the scheme first, and use that to decide what flags to parse it with.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GUriFlags, name: String)
      extends UriFlags(raw):
    override def toString(): String = this.name

    /** No flags set.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE extends KnownValue(GUriFlags.G_URI_FLAGS_NONE, "NONE")

    /** Parse the URI more relaxedly than the [RFC
      * 3986](https://tools.ietf.org/html/rfc3986) grammar specifies, fixing up
      * or ignoring common mistakes in URIs coming from external sources. This
      * is also needed for some obscure URI schemes where `;` separates the host
      * from the path. Don’t use this flag unless you need to.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case PARSE_RELAXED
        extends KnownValue(GUriFlags.G_URI_FLAGS_PARSE_RELAXED, "PARSE_RELAXED")

    /** The userinfo field may contain a password, which will be separated from
      * the username by `:`.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case HAS_PASSWORD
        extends KnownValue(GUriFlags.G_URI_FLAGS_HAS_PASSWORD, "HAS_PASSWORD")

    /** The userinfo may contain additional authentication-related parameters,
      * which will be separated from the username and/or password by `;`.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case HAS_AUTH_PARAMS
        extends KnownValue(
          GUriFlags.G_URI_FLAGS_HAS_AUTH_PARAMS,
          "HAS_AUTH_PARAMS"
        )

    /** When parsing a URI, this indicates that `%`-encoded characters in the
      * userinfo, path, query, and fragment fields should not be decoded. (And
      * likewise the host field if %G_URI_FLAGS_NON_DNS is also set.) When
      * building a URI, it indicates that you have already `%`-encoded the
      * components, and so #GUri should not do any encoding itself.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ENCODED extends KnownValue(GUriFlags.G_URI_FLAGS_ENCODED, "ENCODED")

    /** The host component should not be assumed to be a DNS hostname or IP
      * address (for example, for `smb` URIs with NetBIOS hostnames).
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NON_DNS extends KnownValue(GUriFlags.G_URI_FLAGS_NON_DNS, "NON_DNS")

    /** Same as %G_URI_FLAGS_ENCODED, for the query field only.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ENCODED_QUERY
        extends KnownValue(GUriFlags.G_URI_FLAGS_ENCODED_QUERY, "ENCODED_QUERY")

    /** Same as %G_URI_FLAGS_ENCODED, for the path only.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ENCODED_PATH
        extends KnownValue(GUriFlags.G_URI_FLAGS_ENCODED_PATH, "ENCODED_PATH")

    /** Same as %G_URI_FLAGS_ENCODED, for the fragment only.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ENCODED_FRAGMENT
        extends KnownValue(
          GUriFlags.G_URI_FLAGS_ENCODED_FRAGMENT,
          "ENCODED_FRAGMENT"
        )

    /** A scheme-based normalization will be applied. For example, when parsing
      * an HTTP URI changing omitted path to `/` and omitted port to `80`; and
      * when building a URI, changing empty path to `/` and default port `80`).
      * This only supports a subset of known schemes. (Since: 2.68)
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SCHEME_NORMALIZE
        extends KnownValue(
          GUriFlags.G_URI_FLAGS_SCHEME_NORMALIZE,
          "SCHEME_NORMALIZE"
        )
  end KnownValue
end UriFlags
