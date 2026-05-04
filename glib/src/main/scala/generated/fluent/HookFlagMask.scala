package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GHookFlagMask

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags used internally in the #GHook implementation.
  */
class HookFlagMask private (val raw: GHookFlagMask):
  def is(kv: HookFlagMask): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[HookFlagMask.KnownValue]
    HookFlagMask.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"HookFlagMask(${sb.result().mkString(", ")})"
end HookFlagMask

object HookFlagMask:
  export KnownValue.*

  def fromRaw(raw: GHookFlagMask) = new HookFlagMask(raw)

  extension (af: HookFlagMask)
    def &(other: HookFlagMask) =
      HookFlagMask(af.raw & other.raw)
    def |(other: HookFlagMask) =
      HookFlagMask(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags used internally in the #GHook implementation.
    */
  enum KnownValue(override val raw: GHookFlagMask, name: String)
      extends HookFlagMask(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * set if the hook has not been destroyed
      */
    case ACTIVE extends KnownValue(GHookFlagMask.G_HOOK_FLAG_ACTIVE, "ACTIVE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * set if the hook is currently being run
      */
    case IN_CALL
        extends KnownValue(GHookFlagMask.G_HOOK_FLAG_IN_CALL, "IN_CALL")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * A mask covering all bits reserved for hook flags; see
      * %G_HOOK_FLAG_USER_SHIFT
      */
    case MASK extends KnownValue(GHookFlagMask.G_HOOK_FLAG_MASK, "MASK")
  end KnownValue
end HookFlagMask
