package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type PangoRenderPart = CUnsignedInt
object PangoRenderPart extends _BindgenEnumCUnsignedInt[PangoRenderPart]:
  given _tag: Tag[PangoRenderPart] = Tag.UInt
  inline def define(inline a: Long): PangoRenderPart = a.toUInt
  val PANGO_RENDER_PART_FOREGROUND = define(0)
  val PANGO_RENDER_PART_BACKGROUND = define(1)
  val PANGO_RENDER_PART_UNDERLINE = define(2)
  val PANGO_RENDER_PART_STRIKETHROUGH = define(3)
  val PANGO_RENDER_PART_OVERLINE = define(4)
  def getName(value: PangoRenderPart): Option[String] =
    value match
      case `PANGO_RENDER_PART_FOREGROUND` => Some("PANGO_RENDER_PART_FOREGROUND")
      case `PANGO_RENDER_PART_BACKGROUND` => Some("PANGO_RENDER_PART_BACKGROUND")
      case `PANGO_RENDER_PART_UNDERLINE` => Some("PANGO_RENDER_PART_UNDERLINE")
      case `PANGO_RENDER_PART_STRIKETHROUGH` => Some("PANGO_RENDER_PART_STRIKETHROUGH")
      case `PANGO_RENDER_PART_OVERLINE` => Some("PANGO_RENDER_PART_OVERLINE")
      case _ => _root_.scala.None
  extension (a: PangoRenderPart)
    inline def &(b: PangoRenderPart): PangoRenderPart = a & b
    inline def |(b: PangoRenderPart): PangoRenderPart = a | b
    inline def is(b: PangoRenderPart): Boolean = (a & b) == b