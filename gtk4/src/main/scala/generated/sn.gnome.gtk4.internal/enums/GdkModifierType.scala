package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkModifierType: _SHIFT_MASK: the Shift key. _LOCK_MASK: a Lock key (depending on the modifier mapping of the X server this may either be CapsLock or ShiftLock). _CONTROL_MASK: the Control key. _ALT_MASK: the fourth modifier key (it depends on the modifier mapping of the X server which key is interpreted as this modifier, but normally it is the Alt key). _BUTTON1_MASK: the first mouse button. _BUTTON2_MASK: the second mouse button. _BUTTON3_MASK: the third mouse button. _BUTTON4_MASK: the fourth mouse button. _BUTTON5_MASK: the fifth mouse button. _SUPER_MASK: the Super modifier _HYPER_MASK: the Hyper modifier _META_MASK: the Meta modifier
*/
opaque type GdkModifierType = CUnsignedInt
object GdkModifierType extends _BindgenEnumCUnsignedInt[GdkModifierType]:
  given _tag: Tag[GdkModifierType] = Tag.UInt
  inline def define(inline a: Long): GdkModifierType = a.toUInt
  val GDK_NO_MODIFIER_MASK = define(0)
  val GDK_SHIFT_MASK = define(1)
  val GDK_LOCK_MASK = define(2)
  val GDK_CONTROL_MASK = define(4)
  val GDK_ALT_MASK = define(8)
  val GDK_BUTTON1_MASK = define(256)
  val GDK_BUTTON2_MASK = define(512)
  val GDK_BUTTON3_MASK = define(1024)
  val GDK_BUTTON4_MASK = define(2048)
  val GDK_BUTTON5_MASK = define(4096)
  val GDK_SUPER_MASK = define(67108864)
  val GDK_HYPER_MASK = define(134217728)
  val GDK_META_MASK = define(268435456)
  def getName(value: GdkModifierType): Option[String] =
    value match
      case `GDK_NO_MODIFIER_MASK` => Some("GDK_NO_MODIFIER_MASK")
      case `GDK_SHIFT_MASK` => Some("GDK_SHIFT_MASK")
      case `GDK_LOCK_MASK` => Some("GDK_LOCK_MASK")
      case `GDK_CONTROL_MASK` => Some("GDK_CONTROL_MASK")
      case `GDK_ALT_MASK` => Some("GDK_ALT_MASK")
      case `GDK_BUTTON1_MASK` => Some("GDK_BUTTON1_MASK")
      case `GDK_BUTTON2_MASK` => Some("GDK_BUTTON2_MASK")
      case `GDK_BUTTON3_MASK` => Some("GDK_BUTTON3_MASK")
      case `GDK_BUTTON4_MASK` => Some("GDK_BUTTON4_MASK")
      case `GDK_BUTTON5_MASK` => Some("GDK_BUTTON5_MASK")
      case `GDK_SUPER_MASK` => Some("GDK_SUPER_MASK")
      case `GDK_HYPER_MASK` => Some("GDK_HYPER_MASK")
      case `GDK_META_MASK` => Some("GDK_META_MASK")
      case _ => _root_.scala.None
  extension (a: GdkModifierType)
    inline def &(b: GdkModifierType): GdkModifierType = a & b
    inline def |(b: GdkModifierType): GdkModifierType = a | b
    inline def is(b: GdkModifierType): Boolean = (a & b) == b