package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.GTypeDebugFlags

/** These flags used to be passed to g_type_init_with_debug_flags() which is now
  * deprecated.
  *
  * If you need to enable debugging features, use the `GOBJECT_DEBUG`
  * environment variable.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TypeDebugFlags private (val raw: GTypeDebugFlags):
  def is(kv: TypeDebugFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[TypeDebugFlags.KnownValue]
    TypeDebugFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"TypeDebugFlags(${sb.result().mkString(", ")})"
end TypeDebugFlags

object TypeDebugFlags:
  export KnownValue.*

  def fromRaw(raw: GTypeDebugFlags) = new TypeDebugFlags(raw)

  extension (af: TypeDebugFlags)
    def &(other: TypeDebugFlags) =
      TypeDebugFlags(af.raw & other.raw)
    def |(other: TypeDebugFlags) =
      TypeDebugFlags(af.raw | other.raw)

  /** These flags used to be passed to g_type_init_with_debug_flags() which is
    * now deprecated.
    *
    * If you need to enable debugging features, use the `GOBJECT_DEBUG`
    * environment variable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GTypeDebugFlags, name: String)
      extends TypeDebugFlags(raw):
    override def toString(): String = this.name

    /** Print no messages
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE extends KnownValue(GTypeDebugFlags.G_TYPE_DEBUG_NONE, "NONE")

    /** Print messages about object bookkeeping
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case OBJECTS
        extends KnownValue(GTypeDebugFlags.G_TYPE_DEBUG_OBJECTS, "OBJECTS")

    /** Print messages about signal emissions
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SIGNALS
        extends KnownValue(GTypeDebugFlags.G_TYPE_DEBUG_SIGNALS, "SIGNALS")

    /** Keep a count of instances of each type
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case INSTANCE_COUNT
        extends KnownValue(
          GTypeDebugFlags.G_TYPE_DEBUG_INSTANCE_COUNT,
          "INSTANCE_COUNT"
        )

    /** Mask covering all debug flags
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case MASK extends KnownValue(GTypeDebugFlags.G_TYPE_DEBUG_MASK, "MASK")
  end KnownValue
end TypeDebugFlags
