package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GMainContextFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags to pass to g_main_context_new_with_flags() which affect the behaviour
  * of a #GMainContext.
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags to pass to g_main_context_new_with_flags() which affect the
    * behaviour of a #GMainContext.
    */
  enum KnownValue(override val raw: GMainContextFlags, name: String)
      extends MainContextFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Default behaviour.
      */
    case NONE
        extends KnownValue(GMainContextFlags.G_MAIN_CONTEXT_FLAGS_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Assume that polling for events will free the thread to process other
      * jobs. That's useful if you're using
      * `g_main_context_{prepare,query,check,dispatch}` to integrate
      * GMainContext in other event loops.
      */
    case OWNERLESS_POLLING
        extends KnownValue(
          GMainContextFlags.G_MAIN_CONTEXT_FLAGS_OWNERLESS_POLLING,
          "OWNERLESS_POLLING"
        )
  end KnownValue
end MainContextFlags
