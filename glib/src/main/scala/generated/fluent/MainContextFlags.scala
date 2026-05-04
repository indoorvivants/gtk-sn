package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GMainContextFlags

/** Flags to pass to g_main_context_new_with_flags() which affect the behaviour
  * of a #GMainContext.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MainContextFlags private (val raw: GMainContextFlags):
  def is(kv: MainContextFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[MainContextFlags.KnownValue]
    MainContextFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"MainContextFlags(${sb.result().mkString(", ")})"
end MainContextFlags

object MainContextFlags:
  export KnownValue.*

  def fromRaw(raw: GMainContextFlags) = new MainContextFlags(raw)

  extension (af: MainContextFlags)
    def &(other: MainContextFlags) =
      MainContextFlags(af.raw & other.raw)
    def |(other: MainContextFlags) =
      MainContextFlags(af.raw | other.raw)

  /** Flags to pass to g_main_context_new_with_flags() which affect the
    * behaviour of a #GMainContext.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GMainContextFlags, name: String)
      extends MainContextFlags(raw):
    override def toString(): String = this.name

    /** Default behaviour.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE
        extends KnownValue(GMainContextFlags.G_MAIN_CONTEXT_FLAGS_NONE, "NONE")

    /** Assume that polling for events will free the thread to process other
      * jobs. That's useful if you're using
      * `g_main_context_{prepare,query,check,dispatch}` to integrate
      * GMainContext in other event loops.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case OWNERLESS_POLLING
        extends KnownValue(
          GMainContextFlags.G_MAIN_CONTEXT_FLAGS_OWNERLESS_POLLING,
          "OWNERLESS_POLLING"
        )
  end KnownValue
end MainContextFlags
