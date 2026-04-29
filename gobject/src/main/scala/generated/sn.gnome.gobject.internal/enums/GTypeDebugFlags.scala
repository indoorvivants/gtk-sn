package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTypeDebugFlags: _TYPE_DEBUG_NONE: Print no messages _TYPE_DEBUG_OBJECTS: Print messages about object bookkeeping _TYPE_DEBUG_SIGNALS: Print messages about signal emissions _TYPE_DEBUG_MASK: Mask covering all debug flags _TYPE_DEBUG_INSTANCE_COUNT: Keep a count of instances of each type
*/
opaque type GTypeDebugFlags = CUnsignedInt
object GTypeDebugFlags extends _BindgenEnumCUnsignedInt[GTypeDebugFlags]:
  given _tag: Tag[GTypeDebugFlags] = Tag.UInt
  inline def define(inline a: Long): GTypeDebugFlags = a.toUInt
  val G_TYPE_DEBUG_NONE = define(0)
  val G_TYPE_DEBUG_OBJECTS = define(1)
  val G_TYPE_DEBUG_SIGNALS = define(2)
  val G_TYPE_DEBUG_INSTANCE_COUNT = define(4)
  val G_TYPE_DEBUG_MASK = define(7)
  def getName(value: GTypeDebugFlags): Option[String] =
    value match
      case `G_TYPE_DEBUG_NONE` => Some("G_TYPE_DEBUG_NONE")
      case `G_TYPE_DEBUG_OBJECTS` => Some("G_TYPE_DEBUG_OBJECTS")
      case `G_TYPE_DEBUG_SIGNALS` => Some("G_TYPE_DEBUG_SIGNALS")
      case `G_TYPE_DEBUG_INSTANCE_COUNT` => Some("G_TYPE_DEBUG_INSTANCE_COUNT")
      case `G_TYPE_DEBUG_MASK` => Some("G_TYPE_DEBUG_MASK")
      case _ => _root_.scala.None
  extension (a: GTypeDebugFlags)
    inline def &(b: GTypeDebugFlags): GTypeDebugFlags = a & b
    inline def |(b: GTypeDebugFlags): GTypeDebugFlags = a | b
    inline def is(b: GTypeDebugFlags): Boolean = (a & b) == b