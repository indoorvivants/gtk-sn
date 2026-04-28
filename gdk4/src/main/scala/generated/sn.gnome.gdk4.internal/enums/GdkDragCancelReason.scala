package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkDragCancelReason: _DRAG_CANCEL_NO_TARGET: There is no suitable drop target. _DRAG_CANCEL_USER_CANCELLED: Drag cancelled by the user _DRAG_CANCEL_ERROR: Unspecified error.
*/
opaque type GdkDragCancelReason = CUnsignedInt
object GdkDragCancelReason extends _BindgenEnumCUnsignedInt[GdkDragCancelReason]:
  given _tag: Tag[GdkDragCancelReason] = Tag.UInt
  inline def define(inline a: Long): GdkDragCancelReason = a.toUInt
  val GDK_DRAG_CANCEL_NO_TARGET = define(0)
  val GDK_DRAG_CANCEL_USER_CANCELLED = define(1)
  val GDK_DRAG_CANCEL_ERROR = define(2)
  def getName(value: GdkDragCancelReason): Option[String] =
    value match
      case `GDK_DRAG_CANCEL_NO_TARGET` => Some("GDK_DRAG_CANCEL_NO_TARGET")
      case `GDK_DRAG_CANCEL_USER_CANCELLED` => Some("GDK_DRAG_CANCEL_USER_CANCELLED")
      case `GDK_DRAG_CANCEL_ERROR` => Some("GDK_DRAG_CANCEL_ERROR")
      case _ => _root_.scala.None
  extension (a: GdkDragCancelReason)
    inline def &(b: GdkDragCancelReason): GdkDragCancelReason = a & b
    inline def |(b: GdkDragCancelReason): GdkDragCancelReason = a | b
    inline def is(b: GdkDragCancelReason): Boolean = (a & b) == b