package sn.gnome.gdkpixbuf.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkPixbufRotation: _PIXBUF_ROTATE_NONE: No rotation. _PIXBUF_ROTATE_COUNTERCLOCKWISE: Rotate by 90 degrees. _PIXBUF_ROTATE_UPSIDEDOWN: Rotate by 180 degrees. _PIXBUF_ROTATE_CLOCKWISE: Rotate by 270 degrees.
*/
opaque type GdkPixbufRotation = CUnsignedInt
object GdkPixbufRotation extends _BindgenEnumCUnsignedInt[GdkPixbufRotation]:
  given _tag: Tag[GdkPixbufRotation] = Tag.UInt
  inline def define(inline a: Long): GdkPixbufRotation = a.toUInt
  val GDK_PIXBUF_ROTATE_NONE = define(0)
  val GDK_PIXBUF_ROTATE_COUNTERCLOCKWISE = define(90)
  val GDK_PIXBUF_ROTATE_UPSIDEDOWN = define(180)
  val GDK_PIXBUF_ROTATE_CLOCKWISE = define(270)
  def getName(value: GdkPixbufRotation): Option[String] =
    value match
      case `GDK_PIXBUF_ROTATE_NONE` => Some("GDK_PIXBUF_ROTATE_NONE")
      case `GDK_PIXBUF_ROTATE_COUNTERCLOCKWISE` => Some("GDK_PIXBUF_ROTATE_COUNTERCLOCKWISE")
      case `GDK_PIXBUF_ROTATE_UPSIDEDOWN` => Some("GDK_PIXBUF_ROTATE_UPSIDEDOWN")
      case `GDK_PIXBUF_ROTATE_CLOCKWISE` => Some("GDK_PIXBUF_ROTATE_CLOCKWISE")
      case _ => _root_.scala.None
  extension (a: GdkPixbufRotation)
    inline def &(b: GdkPixbufRotation): GdkPixbufRotation = a & b
    inline def |(b: GdkPixbufRotation): GdkPixbufRotation = a | b
    inline def is(b: GdkPixbufRotation): Boolean = (a & b) == b