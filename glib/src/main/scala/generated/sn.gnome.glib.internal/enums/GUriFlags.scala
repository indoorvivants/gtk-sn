package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GUriFlags: _URI_FLAGS_NONE: No flags set. _URI_FLAGS_PARSE_RELAXED: Parse the URI more relaxedly than the [RFC 3986](https://tools.ietf.org/html/rfc3986) grammar specifies, fixing up or ignoring common mistakes in URIs coming from external sources. This is also needed for some obscure URI schemes where `;` separates the host from the path. Don’t use this flag unless you need to. _URI_FLAGS_HAS_PASSWORD: The userinfo field may contain a password, which will be separated from the username by `:`. _URI_FLAGS_HAS_AUTH_PARAMS: The userinfo may contain additional authentication-related parameters, which will be separated from the username and/or password by `;`. _URI_FLAGS_NON_DNS: The host component should not be assumed to be a DNS hostname or IP address (for example, for `smb` URIs with NetBIOS hostnames). _URI_FLAGS_ENCODED: When parsing a URI, this indicates that `%`-encoded characters in the userinfo, path, query, and fragment fields should not be decoded. (And likewise the host field if %G_URI_FLAGS_NON_DNS is also set.) When building a URI, it indicates that you have already `%`-encoded the components, and so #GUri should not do any encoding itself. _URI_FLAGS_ENCODED_QUERY: Same as %G_URI_FLAGS_ENCODED, for the query field only. _URI_FLAGS_ENCODED_PATH: Same as %G_URI_FLAGS_ENCODED, for the path only. _URI_FLAGS_ENCODED_FRAGMENT: Same as %G_URI_FLAGS_ENCODED, for the fragment only. _URI_FLAGS_SCHEME_NORMALIZE: A scheme-based normalization will be applied. For example, when parsing an HTTP URI changing omitted path to `/` and omitted port to `80`; and when building a URI, changing empty path to `/` and default port `80`). This only supports a subset of known schemes. (Since: 2.68)
*/
opaque type GUriFlags = CUnsignedInt
object GUriFlags extends _BindgenEnumCUnsignedInt[GUriFlags]:
  given _tag: Tag[GUriFlags] = Tag.UInt
  inline def define(inline a: Long): GUriFlags = a.toUInt
  val G_URI_FLAGS_NONE = define(0)
  val G_URI_FLAGS_PARSE_RELAXED = define(1)
  val G_URI_FLAGS_HAS_PASSWORD = define(2)
  val G_URI_FLAGS_HAS_AUTH_PARAMS = define(4)
  val G_URI_FLAGS_ENCODED = define(8)
  val G_URI_FLAGS_NON_DNS = define(16)
  val G_URI_FLAGS_ENCODED_QUERY = define(32)
  val G_URI_FLAGS_ENCODED_PATH = define(64)
  val G_URI_FLAGS_ENCODED_FRAGMENT = define(128)
  val G_URI_FLAGS_SCHEME_NORMALIZE = define(256)
  def getName(value: GUriFlags): Option[String] =
    value match
      case `G_URI_FLAGS_NONE` => Some("G_URI_FLAGS_NONE")
      case `G_URI_FLAGS_PARSE_RELAXED` => Some("G_URI_FLAGS_PARSE_RELAXED")
      case `G_URI_FLAGS_HAS_PASSWORD` => Some("G_URI_FLAGS_HAS_PASSWORD")
      case `G_URI_FLAGS_HAS_AUTH_PARAMS` => Some("G_URI_FLAGS_HAS_AUTH_PARAMS")
      case `G_URI_FLAGS_ENCODED` => Some("G_URI_FLAGS_ENCODED")
      case `G_URI_FLAGS_NON_DNS` => Some("G_URI_FLAGS_NON_DNS")
      case `G_URI_FLAGS_ENCODED_QUERY` => Some("G_URI_FLAGS_ENCODED_QUERY")
      case `G_URI_FLAGS_ENCODED_PATH` => Some("G_URI_FLAGS_ENCODED_PATH")
      case `G_URI_FLAGS_ENCODED_FRAGMENT` => Some("G_URI_FLAGS_ENCODED_FRAGMENT")
      case `G_URI_FLAGS_SCHEME_NORMALIZE` => Some("G_URI_FLAGS_SCHEME_NORMALIZE")
      case _ => _root_.scala.None
  extension (a: GUriFlags)
    inline def &(b: GUriFlags): GUriFlags = a & b
    inline def |(b: GUriFlags): GUriFlags = a | b
    inline def is(b: GUriFlags): Boolean = (a & b) == b