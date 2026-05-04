package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.GTypeDebugFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * These flags used to be passed to g_type_init_with_debug_flags() which is now
  * deprecated.
  *
  * If you need to enable debugging features, use the `GOBJECT_DEBUG`
  * environment variable.
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * These flags used to be passed to g_type_init_with_debug_flags() which is
    * now deprecated.
    *
    * If you need to enable debugging features, use the `GOBJECT_DEBUG`
    * environment variable.
    */
  enum KnownValue(override val raw: GTypeDebugFlags, name: String)
      extends TypeDebugFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Print no messages
      */
    case NONE extends KnownValue(GTypeDebugFlags.G_TYPE_DEBUG_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Print messages about object bookkeeping
      */
    case OBJECTS
        extends KnownValue(GTypeDebugFlags.G_TYPE_DEBUG_OBJECTS, "OBJECTS")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Print messages about signal emissions
      */
    case SIGNALS
        extends KnownValue(GTypeDebugFlags.G_TYPE_DEBUG_SIGNALS, "SIGNALS")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Keep a count of instances of each type
      */
    case INSTANCE_COUNT
        extends KnownValue(
          GTypeDebugFlags.G_TYPE_DEBUG_INSTANCE_COUNT,
          "INSTANCE_COUNT"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Mask covering all debug flags
      */
    case MASK extends KnownValue(GTypeDebugFlags.G_TYPE_DEBUG_MASK, "MASK")
  end KnownValue
end TypeDebugFlags
