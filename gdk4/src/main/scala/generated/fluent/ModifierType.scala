package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.GdkModifierType

/** Flags to indicate the state of modifier keys and mouse buttons in events.
  *
  * Typical modifier keys are Shift, Control, Meta, Super, Hyper, Alt, Compose,
  * Apple, CapsLock or ShiftLock.
  *
  * Note that GDK may add internal values to events which include values outside
  * of this enumeration. Your code should preserve and ignore them. You can use
  * %GDK_MODIFIER_MASK to remove all private values.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ModifierType private (val raw: GdkModifierType):
  def is(kv: ModifierType): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[ModifierType.KnownValue]
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

  /** Flags to indicate the state of modifier keys and mouse buttons in events.
    *
    * Typical modifier keys are Shift, Control, Meta, Super, Hyper, Alt,
    * Compose, Apple, CapsLock or ShiftLock.
    *
    * Note that GDK may add internal values to events which include values
    * outside of this enumeration. Your code should preserve and ignore them.
    * You can use %GDK_MODIFIER_MASK to remove all private values.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GdkModifierType, name: scala.Predef.String)
      extends ModifierType(raw):
    override def toString(): scala.Predef.String = this.name

    /** the Shift key.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SHIFT_MASK
        extends KnownValue(GdkModifierType.GDK_SHIFT_MASK, "SHIFT_MASK")

    /** a Lock key (depending on the modifier mapping of the X server this may
      * either be CapsLock or ShiftLock).
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case LOCK_MASK
        extends KnownValue(GdkModifierType.GDK_LOCK_MASK, "LOCK_MASK")

    /** the Control key.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case CONTROL_MASK
        extends KnownValue(GdkModifierType.GDK_CONTROL_MASK, "CONTROL_MASK")

    /** the fourth modifier key (it depends on the modifier mapping of the X
      * server which key is interpreted as this modifier, but normally it is the
      * Alt key).
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ALT_MASK extends KnownValue(GdkModifierType.GDK_ALT_MASK, "ALT_MASK")

    /** the first mouse button.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case BUTTON1_MASK
        extends KnownValue(GdkModifierType.GDK_BUTTON1_MASK, "BUTTON1_MASK")

    /** the second mouse button.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case BUTTON2_MASK
        extends KnownValue(GdkModifierType.GDK_BUTTON2_MASK, "BUTTON2_MASK")

    /** the third mouse button.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case BUTTON3_MASK
        extends KnownValue(GdkModifierType.GDK_BUTTON3_MASK, "BUTTON3_MASK")

    /** the fourth mouse button.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case BUTTON4_MASK
        extends KnownValue(GdkModifierType.GDK_BUTTON4_MASK, "BUTTON4_MASK")

    /** the fifth mouse button.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case BUTTON5_MASK
        extends KnownValue(GdkModifierType.GDK_BUTTON5_MASK, "BUTTON5_MASK")

    /** the Super modifier
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SUPER_MASK
        extends KnownValue(GdkModifierType.GDK_SUPER_MASK, "SUPER_MASK")

    /** the Hyper modifier
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case HYPER_MASK
        extends KnownValue(GdkModifierType.GDK_HYPER_MASK, "HYPER_MASK")

    /** the Meta modifier
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case META_MASK
        extends KnownValue(GdkModifierType.GDK_META_MASK, "META_MASK")
  end KnownValue
end ModifierType
