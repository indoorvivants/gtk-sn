package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.GTypeFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Bit masks used to check or determine characteristics of a type.
  */
class TypeFlags private (val raw: GTypeFlags):
  def is(kv: TypeFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[TypeFlags.KnownValue]
    TypeFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"TypeFlags(${sb.result().mkString(", ")})"
end TypeFlags

object TypeFlags:
  export KnownValue.*

  def fromRaw(raw: GTypeFlags) = new TypeFlags(raw)

  extension (af: TypeFlags)
    def &(other: TypeFlags) =
      TypeFlags(af.raw & other.raw)
    def |(other: TypeFlags) =
      TypeFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Bit masks used to check or determine characteristics of a type.
    */
  enum KnownValue(override val raw: GTypeFlags, name: String)
      extends TypeFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No special flags. Since: 2.74
      */
    case NONE extends KnownValue(GTypeFlags.G_TYPE_FLAG_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Indicates an abstract type. No instances can be created for an abstract
      * type
      */
    case ABSTRACT
        extends KnownValue(GTypeFlags.G_TYPE_FLAG_ABSTRACT, "ABSTRACT")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Indicates an abstract value type, i.e. a type that introduces a value
      * table, but can't be used for g_value_init()
      */
    case VALUE_ABSTRACT
        extends KnownValue(
          GTypeFlags.G_TYPE_FLAG_VALUE_ABSTRACT,
          "VALUE_ABSTRACT"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Indicates a final type. A final type is a non-derivable leaf node in a
      * deep derivable type hierarchy tree. Since: 2.70
      */
    case FINAL extends KnownValue(GTypeFlags.G_TYPE_FLAG_FINAL, "FINAL")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The type is deprecated and may be removed in a future version. A warning
      * will be emitted if it is instantiated while running with
      * `G_ENABLE_DIAGNOSTIC=1`. Since 2.76
      */
    case DEPRECATED
        extends KnownValue(GTypeFlags.G_TYPE_FLAG_DEPRECATED, "DEPRECATED")
  end KnownValue
end TypeFlags
