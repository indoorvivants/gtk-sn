package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GHookFlagMask = CUnsignedInt
object GHookFlagMask extends _BindgenEnumCUnsignedInt[GHookFlagMask]:
  given _tag: Tag[GHookFlagMask] = Tag.UInt
  inline def define(inline a: Long): GHookFlagMask = a.toUInt
  val G_HOOK_FLAG_ACTIVE = define(1)
  val G_HOOK_FLAG_IN_CALL = define(2)
  val G_HOOK_FLAG_MASK = define(15)
  def getName(value: GHookFlagMask): Option[String] =
    value match
      case `G_HOOK_FLAG_ACTIVE` => Some("G_HOOK_FLAG_ACTIVE")
      case `G_HOOK_FLAG_IN_CALL` => Some("G_HOOK_FLAG_IN_CALL")
      case `G_HOOK_FLAG_MASK` => Some("G_HOOK_FLAG_MASK")
      case _ => _root_.scala.None
  extension (a: GHookFlagMask)
    inline def &(b: GHookFlagMask): GHookFlagMask = a & b
    inline def |(b: GHookFlagMask): GHookFlagMask = a | b
    inline def is(b: GHookFlagMask): Boolean = (a & b) == b