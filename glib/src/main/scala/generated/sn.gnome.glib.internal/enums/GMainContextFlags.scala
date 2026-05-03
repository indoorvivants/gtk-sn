package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GMainContextFlags: _MAIN_CONTEXT_FLAGS_NONE: Default behaviour. _MAIN_CONTEXT_FLAGS_OWNERLESS_POLLING: Assume that polling for events will free the thread to process other jobs. That's useful if you're using `g_main_context_{prepare,query,check,dispatch}` to integrate GMainContext in other event loops.
*/
opaque type GMainContextFlags = CUnsignedInt
object GMainContextFlags extends _BindgenEnumCUnsignedInt[GMainContextFlags]:
  given _tag: Tag[GMainContextFlags] = Tag.UInt
  inline def define(inline a: Long): GMainContextFlags = a.toUInt
  val G_MAIN_CONTEXT_FLAGS_NONE = define(0)
  val G_MAIN_CONTEXT_FLAGS_OWNERLESS_POLLING = define(1)
  def getName(value: GMainContextFlags): Option[String] =
    value match
      case `G_MAIN_CONTEXT_FLAGS_NONE` => Some("G_MAIN_CONTEXT_FLAGS_NONE")
      case `G_MAIN_CONTEXT_FLAGS_OWNERLESS_POLLING` => Some("G_MAIN_CONTEXT_FLAGS_OWNERLESS_POLLING")
      case _ => _root_.scala.None
  extension (a: GMainContextFlags)
    inline def &(b: GMainContextFlags): GMainContextFlags = a & b
    inline def |(b: GMainContextFlags): GMainContextFlags = a | b
    inline def is(b: GMainContextFlags): Boolean = (a & b) == b