package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkDragAction: _ACTION_COPY: Copy the data. _ACTION_MOVE: Move the data, i.e. first copy it, then delete it from the source using the DELETE target of the X selection protocol. _ACTION_LINK: Add a link to the data. Note that this is only useful if source and destination agree on what it means, and is not supported on all platforms. _ACTION_ASK: Ask the user what to do with the data.
*/
opaque type GdkDragAction = CUnsignedInt
object GdkDragAction extends _BindgenEnumCUnsignedInt[GdkDragAction]:
  given _tag: Tag[GdkDragAction] = Tag.UInt
  inline def define(inline a: Long): GdkDragAction = a.toUInt
  val GDK_ACTION_COPY = define(1)
  val GDK_ACTION_MOVE = define(2)
  val GDK_ACTION_LINK = define(4)
  val GDK_ACTION_ASK = define(8)
  def getName(value: GdkDragAction): Option[String] =
    value match
      case `GDK_ACTION_COPY` => Some("GDK_ACTION_COPY")
      case `GDK_ACTION_MOVE` => Some("GDK_ACTION_MOVE")
      case `GDK_ACTION_LINK` => Some("GDK_ACTION_LINK")
      case `GDK_ACTION_ASK` => Some("GDK_ACTION_ASK")
      case _ => _root_.scala.None
  extension (a: GdkDragAction)
    inline def &(b: GdkDragAction): GdkDragAction = a & b
    inline def |(b: GdkDragAction): GdkDragAction = a | b
    inline def is(b: GdkDragAction): Boolean = (a & b) == b