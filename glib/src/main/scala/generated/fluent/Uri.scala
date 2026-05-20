package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.{GResult, Uri, UriFlags, UriHideFlags}
import sn.gnome.glib.internal.{GUri, gchar, gint}

/** The #GUri type and related functions can be used to parse URIs into their
  * components, and build valid URIs from individual components.
  *
  * Note that #GUri scope is to help manipulate URIs in various applications,
  * following [RFC 3986](https://tools.ietf.org/html/rfc3986). In particular, it
  * doesn't intend to cover web browser needs, and doesn't implement the [WHATWG
  * URL](https://url.spec.whatwg.org/) standard. No APIs are provided to help
  * prevent [homograph
  * attacks](https://en.wikipedia.org/wiki/IDN_homograph_attack), so #GUri is
  * not suitable for formatting URIs for display to the user for making
  * security-sensitive decisions.
  *
  * ## Relative and absolute URIs # {#relative-absolute-uris}
  *
  * As defined in [RFC 3986](https://tools.ietf.org/html/rfc3986#section-4), the
  * hierarchical nature of URIs means that they can either be ‘relative
  * references’ (sometimes referred to as ‘relative URIs’) or ‘URIs’ (for
  * clarity, ‘URIs’ are referred to in this documentation as ‘absolute URIs’ —
  * although [in constrast to RFC
  * 3986](https://tools.ietf.org/html/rfc3986#section-4.3), fragment identifiers
  * are always allowed).
  *
  * Relative references have one or more components of the URI missing. In
  * particular, they have no scheme. Any other component, such as hostname,
  * query, etc. may be missing, apart from a path, which has to be specified
  * (but may be empty). The path may be relative, starting with `./` rather than
  * `/`.
  *
  * For example, a valid relative reference is `./path?query`,
  * `/?query#fragment` or `//example.com`.
  *
  * Absolute URIs have a scheme specified. Any other components of the URI which
  * are missing are specified as explicitly unset in the URI, rather than being
  * resolved relative to a base URI using g_uri_parse_relative().
  *
  * For example, a valid absolute URI is `file:///home/bob` or
  * `https://search.com?query=string`.
  *
  * A #GUri instance is always an absolute URI. A string may be an absolute URI
  * or a relative reference; see the documentation for individual functions as
  * to what forms they accept.
  *
  * ## Parsing URIs
  *
  * The most minimalist APIs for parsing URIs are g_uri_split() and
  * g_uri_split_with_user(). These split a URI into its component parts, and
  * return the parts; the difference between the two is that g_uri_split()
  * treats the ‘userinfo’ component of the URI as a single element, while
  * g_uri_split_with_user() can (depending on the #GUriFlags you pass) treat it
  * as containing a username, password, and authentication parameters.
  * Alternatively, g_uri_split_network() can be used when you are only
  * interested in the components that are needed to initiate a network
  * connection to the service (scheme, host, and port).
  *
  * g_uri_parse() is similar to g_uri_split(), but instead of returning
  * individual strings, it returns a #GUri structure (and it requires that the
  * URI be an absolute URI).
  *
  * g_uri_resolve_relative() and g_uri_parse_relative() allow you to resolve a
  * relative URI relative to a base URI. g_uri_resolve_relative() takes two
  * strings and returns a string, and g_uri_parse_relative() takes a #GUri and a
  * string and returns a #GUri.
  *
  * All of the parsing functions take a #GUriFlags argument describing exactly
  * how to parse the URI; see the documentation for that type for more details
  * on the specific flags that you can pass. If you need to choose different
  * flags based on the type of URI, you can use g_uri_peek_scheme() on the URI
  * string to check the scheme first, and use that to decide what flags to parse
  * it with.
  *
  * For example, you might want to use %G_URI_PARAMS_WWW_FORM when parsing the
  * params for a web URI, so compare the result of g_uri_peek_scheme() against
  * `http` and `https`.
  *
  * ## Building URIs
  *
  * g_uri_join() and g_uri_join_with_user() can be used to construct valid URI
  * strings from a set of component strings. They are the inverse of
  * g_uri_split() and g_uri_split_with_user().
  *
  * Similarly, g_uri_build() and g_uri_build_with_user() can be used to
  * construct a #GUri from a set of component strings.
  *
  * As with the parsing functions, the building functions take a #GUriFlags
  * argument. In particular, it is important to keep in mind whether the URI
  * components you are using are already `%`-encoded. If so, you must pass the
  * %G_URI_FLAGS_ENCODED flag.
  *
  * ## `file://` URIs
  *
  * Note that Windows and Unix both define special rules for parsing `file://`
  * URIs (involving non-UTF-8 character sets on Unix, and the interpretation of
  * path separators on Windows). #GUri does not implement these rules. Use
  * g_filename_from_uri() and g_filename_to_uri() if you want to properly
  * convert between `file://` URIs and local filenames.
  *
  * ## URI Equality
  *
  * Note that there is no `g_uri_equal ()` function, because comparing URIs
  * usefully requires scheme-specific knowledge that #GUri does not have. #GUri
  * can help with normalization if you use the various encoded #GUriFlags as
  * well as %G_URI_FLAGS_SCHEME_NORMALIZE however it is not comprehensive. For
  * example, `data:,foo` and `data:;base64,Zm9v` resolve to the same thing
  * according to the `data:` URI specification which GLib does not handle.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Uri private[gnome] (raw: Ptr[GUri]):

  def getUnsafeRawPointer(): Ptr[GUri] = this.raw

  /** Gets @uri's authentication parameters, which may contain `%`-encoding,
    * depending on the flags with which @uri was created. (If @uri was not
    * created with %G_URI_FLAGS_HAS_AUTH_PARAMS then this will be %NULL.)
    *
    * Depending on the URI scheme, g_uri_parse_params() may be useful for
    * further parsing this information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAuthParams(): scala.Predef.String /* None */ =
    fromCString(
      g_uri_get_auth_params(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GUri]]
      ).asInstanceOf
    )
  end getAuthParams

  /** Gets @uri's flags set upon construction.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFlags(): sn.gnome.glib.UriFlags /* None */ =
    sn.gnome.glib.UriFlags.fromRaw(
      g_uri_get_flags(this.getUnsafeRawPointer().asInstanceOf[Ptr[GUri]])
    )
  end getFlags

  /** Gets @uri's fragment, which may contain `%`-encoding, depending on the
    * flags with which @uri was created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFragment(): scala.Predef.String /* None */ =
    fromCString(
      g_uri_get_fragment(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GUri]]
      ).asInstanceOf
    )
  end getFragment

  /** Gets @uri's host. This will never have `%`-encoded characters, unless it
    * is non-UTF-8 (which can only be the case if @uri was created with
    * %G_URI_FLAGS_NON_DNS).
    *
    * If @uri contained an IPv6 address literal, this value will be just that
    * address, without the brackets around it that are necessary in the string
    * form of the URI. Note that in this case there may also be a scope ID
    * attached to the address. Eg, `fe80::1234%``em1` (or `fe80::1234%``25em1`
    * if the string is still encoded).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHost(): scala.Predef.String /* None */ =
    fromCString(
      g_uri_get_host(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GUri]]
      ).asInstanceOf
    )
  end getHost

  /** Gets @uri's password, which may contain `%`-encoding, depending on the
    * flags with which @uri was created. (If @uri was not created with
    * %G_URI_FLAGS_HAS_PASSWORD then this will be %NULL.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPassword(): scala.Predef.String /* None */ =
    fromCString(
      g_uri_get_password(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GUri]]
      ).asInstanceOf
    )
  end getPassword

  /** Gets @uri's path, which may contain `%`-encoding, depending on the flags
    * with which @uri was created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPath(): scala.Predef.String /* None */ =
    fromCString(
      g_uri_get_path(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GUri]]
      ).asInstanceOf
    )
  end getPath

  /** Gets @uri's port.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPort(): Int /* None */ =
    g_uri_get_port(this.getUnsafeRawPointer().asInstanceOf[Ptr[GUri]]).value
  end getPort

  /** Gets @uri's query, which may contain `%`-encoding, depending on the flags
    * with which @uri was created.
    *
    * For queries consisting of a series of `name=value` parameters,
    * #GUriParamsIter or g_uri_parse_params() may be useful.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getQuery(): scala.Predef.String /* None */ =
    fromCString(
      g_uri_get_query(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GUri]]
      ).asInstanceOf
    )
  end getQuery

  /** Gets @uri's scheme. Note that this will always be all-lowercase,
    * regardless of the string or strings that @uri was created from.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getScheme(): scala.Predef.String /* None */ =
    fromCString(
      g_uri_get_scheme(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GUri]]
      ).asInstanceOf
    )
  end getScheme

  /** Gets the ‘username’ component of @uri's userinfo, which may contain
    * `%`-encoding, depending on the flags with which @uri was created. If @uri
    * was not created with %G_URI_FLAGS_HAS_PASSWORD or
    * %G_URI_FLAGS_HAS_AUTH_PARAMS, this is the same as g_uri_get_userinfo().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUser(): scala.Predef.String /* None */ =
    fromCString(
      g_uri_get_user(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GUri]]
      ).asInstanceOf
    )
  end getUser

  /** Gets @uri's userinfo, which may contain `%`-encoding, depending on the
    * flags with which @uri was created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUserinfo(): scala.Predef.String /* None */ =
    fromCString(
      g_uri_get_userinfo(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GUri]]
      ).asInstanceOf
    )
  end getUserinfo

  /** Parses @uri_ref according to @flags and, if it is a [relative
    * URI][relative-absolute-uris], resolves it relative to @base_uri. If the
    * result is not a valid absolute URI, it will be discarded, and an error
    * returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parseRelative(
      uri_ref: scala.Predef.String /* Some(Ptr[gchar]) */,
      flags: sn.gnome.glib.UriFlags /* Some(GUriFlags) */
  )(using Zone): GResult[sn.gnome.glib.Uri /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.glib.Uri.fromRaw(
        g_uri_parse_relative(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GUri]],
          toCString(uri_ref).asInstanceOf[Ptr[gchar]],
          flags.raw,
          __errorPtr
        )
      )
    )
  end parseRelative

  /** Increments the reference count of @uri by one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.glib.Uri /* None */ =
    sn.gnome.glib.Uri
      .fromRaw(g_uri_ref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GUri]]))
  end ref

  /** Returns a string representing @uri.
    *
    * This is not guaranteed to return a string which is identical to the string
    * that @uri was parsed from. However, if the source URI was syntactically
    * correct (according to RFC 3986), and it was parsed with
    * %G_URI_FLAGS_ENCODED, then g_uri_to_string() is guaranteed to return a
    * string which is at least semantically equivalent to the source URI
    * (according to RFC 3986).
    *
    * If @uri might contain sensitive details, such as authentication
    * parameters, or private data in its query string, and the returned string
    * is going to be logged, then consider using g_uri_to_string_partial() to
    * redact parts.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def _toString(): scala.Predef.String /* None */ =
    fromCString(
      g_uri_to_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GUri]]
      ).asInstanceOf
    )
  end _toString

  /** Returns a string representing @uri, subject to the options in
    * @flags.
    *   See g_uri_to_string() and #GUriHideFlags for more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toStringPartial(
      flags: sn.gnome.glib.UriHideFlags /* Some(GUriHideFlags) */
  ): scala.Predef.String /* None */ =
    fromCString(
      g_uri_to_string_partial(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GUri]],
        flags.raw
      ).asInstanceOf
    )
  end toStringPartial

  /** Atomically decrements the reference count of @uri by one.
    *
    * When the reference count reaches zero, the resources allocated by
    * @uri
    *   are freed
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_uri_unref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GUri]])
  end unref

end Uri

object Uri:
  def fromRaw(ptr: Ptr[GUri]): Uri = new Uri(ptr)
end Uri
