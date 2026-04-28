package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkAnchorHints: _ANCHOR_FLIP_X: allow flipping anchors horizontally _ANCHOR_FLIP_Y: allow flipping anchors vertically _ANCHOR_SLIDE_X: allow sliding surface horizontally _ANCHOR_SLIDE_Y: allow sliding surface vertically _ANCHOR_RESIZE_X: allow resizing surface horizontally _ANCHOR_RESIZE_Y: allow resizing surface vertically _ANCHOR_FLIP: allow flipping anchors on both axes _ANCHOR_SLIDE: allow sliding surface on both axes _ANCHOR_RESIZE: allow resizing surface on both axes
*/
opaque type GdkAnchorHints = CUnsignedInt
object GdkAnchorHints extends _BindgenEnumCUnsignedInt[GdkAnchorHints]:
  given _tag: Tag[GdkAnchorHints] = Tag.UInt
  inline def define(inline a: Long): GdkAnchorHints = a.toUInt
  val GDK_ANCHOR_FLIP_X = define(1)
  val GDK_ANCHOR_FLIP_Y = define(2)
  val GDK_ANCHOR_SLIDE_X = define(4)
  val GDK_ANCHOR_SLIDE_Y = define(8)
  val GDK_ANCHOR_RESIZE_X = define(16)
  val GDK_ANCHOR_RESIZE_Y = define(32)
  val GDK_ANCHOR_FLIP = define(3)
  val GDK_ANCHOR_SLIDE = define(12)
  val GDK_ANCHOR_RESIZE = define(48)
  def getName(value: GdkAnchorHints): Option[String] =
    value match
      case `GDK_ANCHOR_FLIP_X` => Some("GDK_ANCHOR_FLIP_X")
      case `GDK_ANCHOR_FLIP_Y` => Some("GDK_ANCHOR_FLIP_Y")
      case `GDK_ANCHOR_SLIDE_X` => Some("GDK_ANCHOR_SLIDE_X")
      case `GDK_ANCHOR_SLIDE_Y` => Some("GDK_ANCHOR_SLIDE_Y")
      case `GDK_ANCHOR_RESIZE_X` => Some("GDK_ANCHOR_RESIZE_X")
      case `GDK_ANCHOR_RESIZE_Y` => Some("GDK_ANCHOR_RESIZE_Y")
      case `GDK_ANCHOR_FLIP` => Some("GDK_ANCHOR_FLIP")
      case `GDK_ANCHOR_SLIDE` => Some("GDK_ANCHOR_SLIDE")
      case `GDK_ANCHOR_RESIZE` => Some("GDK_ANCHOR_RESIZE")
      case _ => _root_.scala.None
  extension (a: GdkAnchorHints)
    inline def &(b: GdkAnchorHints): GdkAnchorHints = a & b
    inline def |(b: GdkAnchorHints): GdkAnchorHints = a | b
    inline def is(b: GdkAnchorHints): Boolean = (a & b) == b