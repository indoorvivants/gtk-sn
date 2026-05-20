package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GUriParamsFlags

/** Flags modifying the way parameters are handled by g_uri_parse_params() and
  * #GUriParamsIter.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class UriParamsFlags private (val raw: GUriParamsFlags):
  def is(kv: UriParamsFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[UriParamsFlags.KnownValue]
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

  /** Flags modifying the way parameters are handled by g_uri_parse_params() and
    * #GUriParamsIter.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GUriParamsFlags, name: scala.Predef.String)
      extends UriParamsFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** No flags set.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE extends KnownValue(GUriParamsFlags.G_URI_PARAMS_NONE, "NONE")

    /** Parameter names are case insensitive.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case CASE_INSENSITIVE
        extends KnownValue(
          GUriParamsFlags.G_URI_PARAMS_CASE_INSENSITIVE,
          "CASE_INSENSITIVE"
        )

    /** Replace `+` with space character. Only useful for URLs on the web, using
      * the `https` or `http` schemas.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case WWW_FORM
        extends KnownValue(GUriParamsFlags.G_URI_PARAMS_WWW_FORM, "WWW_FORM")

    /** See %G_URI_FLAGS_PARSE_RELAXED.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case PARSE_RELAXED
        extends KnownValue(
          GUriParamsFlags.G_URI_PARAMS_PARSE_RELAXED,
          "PARSE_RELAXED"
        )
  end KnownValue
end UriParamsFlags
