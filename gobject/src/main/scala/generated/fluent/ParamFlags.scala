package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.GParamFlags

/** Through the #GParamFlags flag values, certain aspects of parameters can be
  * configured.
  *
  * See also: %G_PARAM_STATIC_STRINGS
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ParamFlags private (val raw: GParamFlags):
  def is(kv: ParamFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[ParamFlags.KnownValue]
    ParamFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"ParamFlags(${sb.result().mkString(", ")})"
end ParamFlags

object ParamFlags:
  export KnownValue.*

  def fromRaw(raw: GParamFlags) = new ParamFlags(raw)

  extension (af: ParamFlags)
    def &(other: ParamFlags) =
      ParamFlags(af.raw & other.raw)
    def |(other: ParamFlags) =
      ParamFlags(af.raw | other.raw)

  /** Through the #GParamFlags flag values, certain aspects of parameters can be
    * configured.
    *
    * See also: %G_PARAM_STATIC_STRINGS
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GParamFlags, name: scala.Predef.String)
      extends ParamFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** the parameter is readable
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case READABLE extends KnownValue(GParamFlags.G_PARAM_READABLE, "READABLE")

    /** the parameter is writable
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case WRITABLE extends KnownValue(GParamFlags.G_PARAM_WRITABLE, "WRITABLE")

    /** alias for %G_PARAM_READABLE | %G_PARAM_WRITABLE
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case READWRITE
        extends KnownValue(GParamFlags.G_PARAM_READWRITE, "READWRITE")

    /** the parameter will be set upon object construction
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case CONSTRUCT
        extends KnownValue(GParamFlags.G_PARAM_CONSTRUCT, "CONSTRUCT")

    /** the parameter can only be set upon object construction
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case CONSTRUCT_ONLY
        extends KnownValue(GParamFlags.G_PARAM_CONSTRUCT_ONLY, "CONSTRUCT_ONLY")

    /** upon parameter conversion (see g_param_value_convert()) strict
      * validation is not required
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case LAX_VALIDATION
        extends KnownValue(GParamFlags.G_PARAM_LAX_VALIDATION, "LAX_VALIDATION")

    /** the string used as name when constructing the parameter is guaranteed to
      * remain valid and unmodified for the lifetime of the parameter. Since 2.8
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case STATIC_NAME
        extends KnownValue(GParamFlags.G_PARAM_STATIC_NAME, "STATIC_NAME")

    /** internal
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case PRIVATE extends KnownValue(GParamFlags.G_PARAM_PRIVATE, "PRIVATE")

    /** the string used as nick when constructing the parameter is guaranteed to
      * remain valid and unmmodified for the lifetime of the parameter. Since
      * 2.8
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case STATIC_NICK
        extends KnownValue(GParamFlags.G_PARAM_STATIC_NICK, "STATIC_NICK")

    /** the string used as blurb when constructing the parameter is guaranteed
      * to remain valid and unmodified for the lifetime of the parameter. Since
      * 2.8
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case STATIC_BLURB
        extends KnownValue(GParamFlags.G_PARAM_STATIC_BLURB, "STATIC_BLURB")

    /** calls to g_object_set_property() for this property will not
      * automatically result in a "notify" signal being emitted: the
      * implementation must call g_object_notify() themselves in case the
      * property actually changes. Since: 2.42.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case EXPLICIT_NOTIFY
        extends KnownValue(
          GParamFlags.G_PARAM_EXPLICIT_NOTIFY,
          "EXPLICIT_NOTIFY"
        )

    /** the parameter is deprecated and will be removed in a future version. A
      * warning will be generated if it is used while running with
      * G_ENABLE_DIAGNOSTIC=1. Since 2.26
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DEPRECATED
        extends KnownValue(GParamFlags.G_PARAM_DEPRECATED, "DEPRECATED")
  end KnownValue
end ParamFlags
