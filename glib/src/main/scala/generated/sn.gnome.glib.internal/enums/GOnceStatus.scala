package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GOnceStatus = CUnsignedInt
object GOnceStatus extends _BindgenEnumCUnsignedInt[GOnceStatus]:
  given _tag: Tag[GOnceStatus] = Tag.UInt
  inline def define(inline a: Long): GOnceStatus = a.toUInt
  val G_ONCE_STATUS_NOTCALLED = define(0)
  val G_ONCE_STATUS_PROGRESS = define(1)
  val G_ONCE_STATUS_READY = define(2)
  def getName(value: GOnceStatus): Option[String] =
    value match
      case `G_ONCE_STATUS_NOTCALLED` => Some("G_ONCE_STATUS_NOTCALLED")
      case `G_ONCE_STATUS_PROGRESS` => Some("G_ONCE_STATUS_PROGRESS")
      case `G_ONCE_STATUS_READY` => Some("G_ONCE_STATUS_READY")
      case _ => _root_.scala.None
  extension (a: GOnceStatus)
    inline def &(b: GOnceStatus): GOnceStatus = a & b
    inline def |(b: GOnceStatus): GOnceStatus = a | b
    inline def is(b: GOnceStatus): Boolean = (a & b) == b