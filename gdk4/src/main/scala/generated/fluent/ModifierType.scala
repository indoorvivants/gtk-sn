package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkModifierType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags to indicate the state of modifier keys and mouse buttons in events.
  *
  * Typical modifier keys are Shift, Control, Meta, Super, Hyper, Alt, Compose,
  * Apple, CapsLock or ShiftLock.
  *
  * Note that GDK may add internal values to events which include values outside
  * of this enumeration. Your code should preserve and ignore them. You can use
  * %GDK_MODIFIER_MASK to remove all private values.
  */
class ModifierType private (val raw: GdkModifierType):
  def is(kv: ModifierType): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[ModifierType.KnownValue]
    ModifierType.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"ModifierType(${sb.result().mkString(", ")})"
end ModifierType

object ModifierType:
  export KnownValue.*

  def fromRaw(raw: GdkModifierType) = new ModifierType(raw)

  extension (af: ModifierType)
    def &(other: ModifierType) =
      ModifierType(af.raw & other.raw)
    def |(other: ModifierType) =
      ModifierType(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags to indicate the state of modifier keys and mouse buttons in events.
    *
    * Typical modifier keys are Shift, Control, Meta, Super, Hyper, Alt,
    * Compose, Apple, CapsLock or ShiftLock.
    *
    * Note that GDK may add internal values to events which include values
    * outside of this enumeration. Your code should preserve and ignore them.
    * You can use %GDK_MODIFIER_MASK to remove all private values.
    */
  enum KnownValue(override val raw: GdkModifierType, name: String)
      extends ModifierType(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the Shift key.
      */
    case SHIFT_MASK
        extends KnownValue(GdkModifierType.GDK_SHIFT_MASK, "SHIFT_MASK")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * a Lock key (depending on the modifier mapping of the X server this may
      * either be CapsLock or ShiftLock).
      */
    case LOCK_MASK
        extends KnownValue(GdkModifierType.GDK_LOCK_MASK, "LOCK_MASK")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the Control key.
      */
    case CONTROL_MASK
        extends KnownValue(GdkModifierType.GDK_CONTROL_MASK, "CONTROL_MASK")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the fourth modifier key (it depends on the modifier mapping of the X
      * server which key is interpreted as this modifier, but normally it is the
      * Alt key).
      */
    case ALT_MASK extends KnownValue(GdkModifierType.GDK_ALT_MASK, "ALT_MASK")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the first mouse button.
      */
    case BUTTON1_MASK
        extends KnownValue(GdkModifierType.GDK_BUTTON1_MASK, "BUTTON1_MASK")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the second mouse button.
      */
    case BUTTON2_MASK
        extends KnownValue(GdkModifierType.GDK_BUTTON2_MASK, "BUTTON2_MASK")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the third mouse button.
      */
    case BUTTON3_MASK
        extends KnownValue(GdkModifierType.GDK_BUTTON3_MASK, "BUTTON3_MASK")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the fourth mouse button.
      */
    case BUTTON4_MASK
        extends KnownValue(GdkModifierType.GDK_BUTTON4_MASK, "BUTTON4_MASK")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the fifth mouse button.
      */
    case BUTTON5_MASK
        extends KnownValue(GdkModifierType.GDK_BUTTON5_MASK, "BUTTON5_MASK")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the Super modifier
      */
    case SUPER_MASK
        extends KnownValue(GdkModifierType.GDK_SUPER_MASK, "SUPER_MASK")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the Hyper modifier
      */
    case HYPER_MASK
        extends KnownValue(GdkModifierType.GDK_HYPER_MASK, "HYPER_MASK")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the Meta modifier
      */
    case META_MASK
        extends KnownValue(GdkModifierType.GDK_META_MASK, "META_MASK")
  end KnownValue
end ModifierType
