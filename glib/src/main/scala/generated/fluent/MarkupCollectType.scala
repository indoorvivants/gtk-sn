package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GMarkupCollectType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A mixed enumerated type and flags field. You must specify one type (string,
  * strdup, boolean, tristate). Additionally, you may optionally bitwise OR the
  * type with the flag %G_MARKUP_COLLECT_OPTIONAL.
  *
  * It is likely that this enum will be extended in the future to support other
  * types.
  */
class MarkupCollectType private (val raw: GMarkupCollectType):
  def is(kv: MarkupCollectType): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[MarkupCollectType.KnownValue]
    MarkupCollectType.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"MarkupCollectType(${sb.result().mkString(", ")})"
end MarkupCollectType

object MarkupCollectType:
  export KnownValue.*

  def fromRaw(raw: GMarkupCollectType) = new MarkupCollectType(raw)

  extension (af: MarkupCollectType)
    def &(other: MarkupCollectType) =
      MarkupCollectType(af.raw & other.raw)
    def |(other: MarkupCollectType) =
      MarkupCollectType(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A mixed enumerated type and flags field. You must specify one type
    * (string, strdup, boolean, tristate). Additionally, you may optionally
    * bitwise OR the type with the flag %G_MARKUP_COLLECT_OPTIONAL.
    *
    * It is likely that this enum will be extended in the future to support
    * other types.
    */
  enum KnownValue(override val raw: GMarkupCollectType, name: String)
      extends MarkupCollectType(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * used to terminate the list of attributes to collect
      */
    case INVALID
        extends KnownValue(
          GMarkupCollectType.G_MARKUP_COLLECT_INVALID,
          "INVALID"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * collect the string pointer directly from the attribute_values[] array.
      * Expects a parameter of type (const char **). If
      * %G_MARKUP_COLLECT_OPTIONAL is specified and the attribute isn't present
      * then the pointer will be set to %NULL
      */
    case STRING
        extends KnownValue(GMarkupCollectType.G_MARKUP_COLLECT_STRING, "STRING")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * as with %G_MARKUP_COLLECT_STRING, but expects a parameter of type (char
      * **) and g_strdup()s the returned pointer. The pointer must be freed with
      * g_free()
      */
    case STRDUP
        extends KnownValue(GMarkupCollectType.G_MARKUP_COLLECT_STRDUP, "STRDUP")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * expects a parameter of type (gboolean *) and parses the attribute value
      * as a boolean. Sets %FALSE if the attribute isn't present. Valid boolean
      * values consist of (case-insensitive) "false", "f", "no", "n", "0" and
      * "true", "t", "yes", "y", "1"
      */
    case BOOLEAN
        extends KnownValue(
          GMarkupCollectType.G_MARKUP_COLLECT_BOOLEAN,
          "BOOLEAN"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * as with %G_MARKUP_COLLECT_BOOLEAN, but in the case of a missing
      * attribute a value is set that compares equal to neither %FALSE nor %TRUE
      * G_MARKUP_COLLECT_OPTIONAL is implied
      */
    case TRISTATE
        extends KnownValue(
          GMarkupCollectType.G_MARKUP_COLLECT_TRISTATE,
          "TRISTATE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * can be bitwise ORed with the other fields. If present, allows the
      * attribute not to appear. A default value is set depending on what value
      * type is used
      */
    case OPTIONAL
        extends KnownValue(
          GMarkupCollectType.G_MARKUP_COLLECT_OPTIONAL,
          "OPTIONAL"
        )
  end KnownValue
end MarkupCollectType
