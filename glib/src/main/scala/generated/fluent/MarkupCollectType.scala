package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GMarkupCollectType

/** A mixed enumerated type and flags field. You must specify one type (string,
  * strdup, boolean, tristate). Additionally, you may optionally bitwise OR the
  * type with the flag %G_MARKUP_COLLECT_OPTIONAL.
  *
  * It is likely that this enum will be extended in the future to support other
  * types.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MarkupCollectType private (val raw: GMarkupCollectType):
  def is(kv: MarkupCollectType): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[MarkupCollectType.KnownValue]
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

  /** A mixed enumerated type and flags field. You must specify one type
    * (string, strdup, boolean, tristate). Additionally, you may optionally
    * bitwise OR the type with the flag %G_MARKUP_COLLECT_OPTIONAL.
    *
    * It is likely that this enum will be extended in the future to support
    * other types.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(
      override val raw: GMarkupCollectType,
      name: scala.Predef.String
  ) extends MarkupCollectType(raw):
    override def toString(): scala.Predef.String = this.name

    /** used to terminate the list of attributes to collect
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case INVALID
        extends KnownValue(
          GMarkupCollectType.G_MARKUP_COLLECT_INVALID,
          "INVALID"
        )

    /** collect the string pointer directly from the attribute_values[] array.
      * Expects a parameter of type (const char **). If
      * %G_MARKUP_COLLECT_OPTIONAL is specified and the attribute isn't present
      * then the pointer will be set to %NULL
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case STRING
        extends KnownValue(GMarkupCollectType.G_MARKUP_COLLECT_STRING, "STRING")

    /** as with %G_MARKUP_COLLECT_STRING, but expects a parameter of type (char
      * **) and g_strdup()s the returned pointer. The pointer must be freed with
      * g_free()
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case STRDUP
        extends KnownValue(GMarkupCollectType.G_MARKUP_COLLECT_STRDUP, "STRDUP")

    /** expects a parameter of type (gboolean *) and parses the attribute value
      * as a boolean. Sets %FALSE if the attribute isn't present. Valid boolean
      * values consist of (case-insensitive) "false", "f", "no", "n", "0" and
      * "true", "t", "yes", "y", "1"
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case BOOLEAN
        extends KnownValue(
          GMarkupCollectType.G_MARKUP_COLLECT_BOOLEAN,
          "BOOLEAN"
        )

    /** as with %G_MARKUP_COLLECT_BOOLEAN, but in the case of a missing
      * attribute a value is set that compares equal to neither %FALSE nor %TRUE
      * G_MARKUP_COLLECT_OPTIONAL is implied
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case TRISTATE
        extends KnownValue(
          GMarkupCollectType.G_MARKUP_COLLECT_TRISTATE,
          "TRISTATE"
        )

    /** can be bitwise ORed with the other fields. If present, allows the
      * attribute not to appear. A default value is set depending on what value
      * type is used
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case OPTIONAL
        extends KnownValue(
          GMarkupCollectType.G_MARKUP_COLLECT_OPTIONAL,
          "OPTIONAL"
        )
  end KnownValue
end MarkupCollectType
