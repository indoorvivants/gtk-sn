package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkShortcutActionFlags

/** List of flags that can be passed to action activation.
  *
  * More flags may be added in the future.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ShortcutActionFlags private (val raw: GtkShortcutActionFlags):
  def is(kv: ShortcutActionFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[ShortcutActionFlags.KnownValue]
    ShortcutActionFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"ShortcutActionFlags(${sb.result().mkString(", ")})"
end ShortcutActionFlags

object ShortcutActionFlags:
  export KnownValue.*

  def fromRaw(raw: GtkShortcutActionFlags) = new ShortcutActionFlags(raw)

  extension (af: ShortcutActionFlags)
    def &(other: ShortcutActionFlags) =
      ShortcutActionFlags(af.raw & other.raw)
    def |(other: ShortcutActionFlags) =
      ShortcutActionFlags(af.raw | other.raw)

  /** List of flags that can be passed to action activation.
    *
    * More flags may be added in the future.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GtkShortcutActionFlags, name: String)
      extends ShortcutActionFlags(raw):
    override def toString(): String = this.name

    /** The action is the only action that can be activated. If this flag is not
      * set, a future activation may select a different action.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case EXCLUSIVE
        extends KnownValue(
          GtkShortcutActionFlags.GTK_SHORTCUT_ACTION_EXCLUSIVE,
          "EXCLUSIVE"
        )
  end KnownValue
end ShortcutActionFlags
