package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GUriHideFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags describing what parts of the URI to hide in g_uri_to_string_partial().
  * Note that %G_URI_HIDE_PASSWORD and %G_URI_HIDE_AUTH_PARAMS will only work if
  * the #GUri was parsed with the corresponding flags.
  */
class UriHideFlags private (val raw: GUriHideFlags):
  def is(kv: UriHideFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[UriHideFlags.KnownValue]
    UriHideFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"UriHideFlags(${sb.result().mkString(", ")})"
end UriHideFlags

object UriHideFlags:
  export KnownValue.*

  def fromRaw(raw: GUriHideFlags) = new UriHideFlags(raw)

  extension (af: UriHideFlags)
    def &(other: UriHideFlags) =
      UriHideFlags(af.raw & other.raw)
    def |(other: UriHideFlags) =
      UriHideFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags describing what parts of the URI to hide in
    * g_uri_to_string_partial(). Note that %G_URI_HIDE_PASSWORD and
    * %G_URI_HIDE_AUTH_PARAMS will only work if the #GUri was parsed with the
    * corresponding flags.
    */
  enum KnownValue(override val raw: GUriHideFlags, name: String)
      extends UriHideFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags set.
      */
    case NONE extends KnownValue(GUriHideFlags.G_URI_HIDE_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Hide the userinfo.
      */
    case USERINFO
        extends KnownValue(GUriHideFlags.G_URI_HIDE_USERINFO, "USERINFO")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Hide the password.
      */
    case PASSWORD
        extends KnownValue(GUriHideFlags.G_URI_HIDE_PASSWORD, "PASSWORD")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Hide the auth_params.
      */
    case AUTH_PARAMS
        extends KnownValue(GUriHideFlags.G_URI_HIDE_AUTH_PARAMS, "AUTH_PARAMS")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Hide the query.
      */
    case QUERY extends KnownValue(GUriHideFlags.G_URI_HIDE_QUERY, "QUERY")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Hide the fragment.
      */
    case FRAGMENT
        extends KnownValue(GUriHideFlags.G_URI_HIDE_FRAGMENT, "FRAGMENT")
  end KnownValue
end UriHideFlags
