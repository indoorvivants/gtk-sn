package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GUriParamsFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags modifying the way parameters are handled by g_uri_parse_params() and
  * #GUriParamsIter.
  */
class UriParamsFlags private (val raw: GUriParamsFlags):
  def is(kv: UriParamsFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[UriParamsFlags.KnownValue]
    UriParamsFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"UriParamsFlags(${sb.result().mkString(", ")})"
end UriParamsFlags

object UriParamsFlags:
  export KnownValue.*

  def fromRaw(raw: GUriParamsFlags) = new UriParamsFlags(raw)

  extension (af: UriParamsFlags)
    def &(other: UriParamsFlags) =
      UriParamsFlags(af.raw & other.raw)
    def |(other: UriParamsFlags) =
      UriParamsFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags modifying the way parameters are handled by g_uri_parse_params() and
    * #GUriParamsIter.
    */
  enum KnownValue(override val raw: GUriParamsFlags, name: String)
      extends UriParamsFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags set.
      */
    case NONE extends KnownValue(GUriParamsFlags.G_URI_PARAMS_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Parameter names are case insensitive.
      */
    case CASE_INSENSITIVE
        extends KnownValue(
          GUriParamsFlags.G_URI_PARAMS_CASE_INSENSITIVE,
          "CASE_INSENSITIVE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Replace `+` with space character. Only useful for URLs on the web, using
      * the `https` or `http` schemas.
      */
    case WWW_FORM
        extends KnownValue(GUriParamsFlags.G_URI_PARAMS_WWW_FORM, "WWW_FORM")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * See %G_URI_FLAGS_PARSE_RELAXED.
      */
    case PARSE_RELAXED
        extends KnownValue(
          GUriParamsFlags.G_URI_PARAMS_PARSE_RELAXED,
          "PARSE_RELAXED"
        )
  end KnownValue
end UriParamsFlags
