package sn.gnome.gdkpixbuf.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkPixbufAlphaMode: _PIXBUF_ALPHA_BILEVEL: A bilevel clipping mask (black and white) will be created and used to draw the image. Pixels below 0.5 opacity will be considered fully transparent, and all others will be considered fully opaque. _PIXBUF_ALPHA_FULL: For now falls back to #GDK_PIXBUF_ALPHA_BILEVEL. In the future it will do full alpha compositing.
*/
opaque type GdkPixbufAlphaMode = CUnsignedInt
object GdkPixbufAlphaMode extends _BindgenEnumCUnsignedInt[GdkPixbufAlphaMode]:
  given _tag: Tag[GdkPixbufAlphaMode] = Tag.UInt
  inline def define(inline a: Long): GdkPixbufAlphaMode = a.toUInt
  val GDK_PIXBUF_ALPHA_BILEVEL = define(0)
  val GDK_PIXBUF_ALPHA_FULL = define(1)
  def getName(value: GdkPixbufAlphaMode): Option[String] =
    value match
      case `GDK_PIXBUF_ALPHA_BILEVEL` => Some("GDK_PIXBUF_ALPHA_BILEVEL")
      case `GDK_PIXBUF_ALPHA_FULL` => Some("GDK_PIXBUF_ALPHA_FULL")
      case _ => _root_.scala.None
  extension (a: GdkPixbufAlphaMode)
    inline def &(b: GdkPixbufAlphaMode): GdkPixbufAlphaMode = a & b
    inline def |(b: GdkPixbufAlphaMode): GdkPixbufAlphaMode = a | b
    inline def is(b: GdkPixbufAlphaMode): Boolean = (a & b) == b