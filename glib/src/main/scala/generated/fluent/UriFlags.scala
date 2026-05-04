package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GUriFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags that describe a URI.
  *
  * When parsing a URI, if you need to choose different flags based on the type
  * of URI, you can use g_uri_peek_scheme() on the URI string to check the
  * scheme first, and use that to decide what flags to parse it with.
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags that describe a URI.
    *
    * When parsing a URI, if you need to choose different flags based on the
    * type of URI, you can use g_uri_peek_scheme() on the URI string to check
    * the scheme first, and use that to decide what flags to parse it with.
    */
  enum KnownValue(override val raw: GUriFlags, name: String)
      extends UriFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags set.
      */
    case NONE extends KnownValue(GUriFlags.G_URI_FLAGS_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Parse the URI more relaxedly than the [RFC
      * 3986](https://tools.ietf.org/html/rfc3986) grammar specifies, fixing up
      * or ignoring common mistakes in URIs coming from external sources. This
      * is also needed for some obscure URI schemes where `;` separates the host
      * from the path. Don’t use this flag unless you need to.
      */
    case PARSE_RELAXED
        extends KnownValue(GUriFlags.G_URI_FLAGS_PARSE_RELAXED, "PARSE_RELAXED")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The userinfo field may contain a password, which will be separated from
      * the username by `:`.
      */
    case HAS_PASSWORD
        extends KnownValue(GUriFlags.G_URI_FLAGS_HAS_PASSWORD, "HAS_PASSWORD")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The userinfo may contain additional authentication-related parameters,
      * which will be separated from the username and/or password by `;`.
      */
    case HAS_AUTH_PARAMS
        extends KnownValue(
          GUriFlags.G_URI_FLAGS_HAS_AUTH_PARAMS,
          "HAS_AUTH_PARAMS"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * When parsing a URI, this indicates that `%`-encoded characters in the
      * userinfo, path, query, and fragment fields should not be decoded. (And
      * likewise the host field if %G_URI_FLAGS_NON_DNS is also set.) When
      * building a URI, it indicates that you have already `%`-encoded the
      * components, and so #GUri should not do any encoding itself.
      */
    case ENCODED extends KnownValue(GUriFlags.G_URI_FLAGS_ENCODED, "ENCODED")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The host component should not be assumed to be a DNS hostname or IP
      * address (for example, for `smb` URIs with NetBIOS hostnames).
      */
    case NON_DNS extends KnownValue(GUriFlags.G_URI_FLAGS_NON_DNS, "NON_DNS")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Same as %G_URI_FLAGS_ENCODED, for the query field only.
      */
    case ENCODED_QUERY
        extends KnownValue(GUriFlags.G_URI_FLAGS_ENCODED_QUERY, "ENCODED_QUERY")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Same as %G_URI_FLAGS_ENCODED, for the path only.
      */
    case ENCODED_PATH
        extends KnownValue(GUriFlags.G_URI_FLAGS_ENCODED_PATH, "ENCODED_PATH")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Same as %G_URI_FLAGS_ENCODED, for the fragment only.
      */
    case ENCODED_FRAGMENT
        extends KnownValue(
          GUriFlags.G_URI_FLAGS_ENCODED_FRAGMENT,
          "ENCODED_FRAGMENT"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * A scheme-based normalization will be applied. For example, when parsing
      * an HTTP URI changing omitted path to `/` and omitted port to `80`; and
      * when building a URI, changing empty path to `/` and default port `80`).
      * This only supports a subset of known schemes. (Since: 2.68)
      */
    case SCHEME_NORMALIZE
        extends KnownValue(
          GUriFlags.G_URI_FLAGS_SCHEME_NORMALIZE,
          "SCHEME_NORMALIZE"
        )
  end KnownValue
end UriFlags
