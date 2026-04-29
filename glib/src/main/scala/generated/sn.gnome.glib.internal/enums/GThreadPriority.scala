package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GThreadPriority = CUnsignedInt
object GThreadPriority extends _BindgenEnumCUnsignedInt[GThreadPriority]:
  given _tag: Tag[GThreadPriority] = Tag.UInt
  inline def define(inline a: Long): GThreadPriority = a.toUInt
  val G_THREAD_PRIORITY_LOW = define(0)
  val G_THREAD_PRIORITY_NORMAL = define(1)
  val G_THREAD_PRIORITY_HIGH = define(2)
  val G_THREAD_PRIORITY_URGENT = define(3)
  def getName(value: GThreadPriority): Option[String] =
    value match
      case `G_THREAD_PRIORITY_LOW` => Some("G_THREAD_PRIORITY_LOW")
      case `G_THREAD_PRIORITY_NORMAL` => Some("G_THREAD_PRIORITY_NORMAL")
      case `G_THREAD_PRIORITY_HIGH` => Some("G_THREAD_PRIORITY_HIGH")
      case `G_THREAD_PRIORITY_URGENT` => Some("G_THREAD_PRIORITY_URGENT")
      case _ => _root_.scala.None
  extension (a: GThreadPriority)
    inline def &(b: GThreadPriority): GThreadPriority = a & b
    inline def |(b: GThreadPriority): GThreadPriority = a | b
    inline def is(b: GThreadPriority): Boolean = (a & b) == b