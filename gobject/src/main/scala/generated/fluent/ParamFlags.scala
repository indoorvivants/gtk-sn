package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.GParamFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Through the #GParamFlags flag values, certain aspects of parameters can be
  * configured.
  *
  * See also: %G_PARAM_STATIC_STRINGS
  */
class ParamFlags private (val raw: GParamFlags):
  def is(kv: ParamFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[ParamFlags.KnownValue]
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Through the #GParamFlags flag values, certain aspects of parameters can be
    * configured.
    *
    * See also: %G_PARAM_STATIC_STRINGS
    */
  enum KnownValue(override val raw: GParamFlags, name: String)
      extends ParamFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the parameter is readable
      */
    case READABLE extends KnownValue(GParamFlags.G_PARAM_READABLE, "READABLE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the parameter is writable
      */
    case WRITABLE extends KnownValue(GParamFlags.G_PARAM_WRITABLE, "WRITABLE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * alias for %G_PARAM_READABLE | %G_PARAM_WRITABLE
      */
    case READWRITE
        extends KnownValue(GParamFlags.G_PARAM_READWRITE, "READWRITE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the parameter will be set upon object construction
      */
    case CONSTRUCT
        extends KnownValue(GParamFlags.G_PARAM_CONSTRUCT, "CONSTRUCT")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the parameter can only be set upon object construction
      */
    case CONSTRUCT_ONLY
        extends KnownValue(GParamFlags.G_PARAM_CONSTRUCT_ONLY, "CONSTRUCT_ONLY")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * upon parameter conversion (see g_param_value_convert()) strict
      * validation is not required
      */
    case LAX_VALIDATION
        extends KnownValue(GParamFlags.G_PARAM_LAX_VALIDATION, "LAX_VALIDATION")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the string used as name when constructing the parameter is guaranteed to
      * remain valid and unmodified for the lifetime of the parameter. Since 2.8
      */
    case STATIC_NAME
        extends KnownValue(GParamFlags.G_PARAM_STATIC_NAME, "STATIC_NAME")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * internal
      */
    case PRIVATE extends KnownValue(GParamFlags.G_PARAM_PRIVATE, "PRIVATE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the string used as nick when constructing the parameter is guaranteed to
      * remain valid and unmmodified for the lifetime of the parameter. Since
      * 2.8
      */
    case STATIC_NICK
        extends KnownValue(GParamFlags.G_PARAM_STATIC_NICK, "STATIC_NICK")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the string used as blurb when constructing the parameter is guaranteed
      * to remain valid and unmodified for the lifetime of the parameter. Since
      * 2.8
      */
    case STATIC_BLURB
        extends KnownValue(GParamFlags.G_PARAM_STATIC_BLURB, "STATIC_BLURB")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * calls to g_object_set_property() for this property will not
      * automatically result in a "notify" signal being emitted: the
      * implementation must call g_object_notify() themselves in case the
      * property actually changes. Since: 2.42.
      */
    case EXPLICIT_NOTIFY
        extends KnownValue(
          GParamFlags.G_PARAM_EXPLICIT_NOTIFY,
          "EXPLICIT_NOTIFY"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the parameter is deprecated and will be removed in a future version. A
      * warning will be generated if it is used while running with
      * G_ENABLE_DIAGNOSTIC=1. Since 2.26
      */
    case DEPRECATED
        extends KnownValue(GParamFlags.G_PARAM_DEPRECATED, "DEPRECATED")
  end KnownValue
end ParamFlags
