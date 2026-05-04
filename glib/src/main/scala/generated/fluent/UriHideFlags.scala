package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GUriHideFlags

/** Flags describing what parts of the URI to hide in g_uri_to_string_partial().
  * Note that %G_URI_HIDE_PASSWORD and %G_URI_HIDE_AUTH_PARAMS will only work if
  * the #GUri was parsed with the corresponding flags.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
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

  /** Flags describing what parts of the URI to hide in
    * g_uri_to_string_partial(). Note that %G_URI_HIDE_PASSWORD and
    * %G_URI_HIDE_AUTH_PARAMS will only work if the #GUri was parsed with the
    * corresponding flags.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GUriHideFlags, name: String)
      extends UriHideFlags(raw):
    override def toString(): String = this.name

    /** No flags set.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE extends KnownValue(GUriHideFlags.G_URI_HIDE_NONE, "NONE")

    /** Hide the userinfo.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case USERINFO
        extends KnownValue(GUriHideFlags.G_URI_HIDE_USERINFO, "USERINFO")

    /** Hide the password.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case PASSWORD
        extends KnownValue(GUriHideFlags.G_URI_HIDE_PASSWORD, "PASSWORD")

    /** Hide the auth_params.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case AUTH_PARAMS
        extends KnownValue(GUriHideFlags.G_URI_HIDE_AUTH_PARAMS, "AUTH_PARAMS")

    /** Hide the query.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case QUERY extends KnownValue(GUriHideFlags.G_URI_HIDE_QUERY, "QUERY")

    /** Hide the fragment.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case FRAGMENT
        extends KnownValue(GUriHideFlags.G_URI_HIDE_FRAGMENT, "FRAGMENT")
  end KnownValue
end UriHideFlags
