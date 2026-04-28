package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkPaintableFlags: _PAINTABLE_STATIC_SIZE: The size is immutable. The [signal.Paintable::invalidate-size] signal will never be emitted. _PAINTABLE_STATIC_CONTENTS: The content is immutable. The [signal.Paintable::invalidate-contents] signal will never be emitted.
*/
opaque type GdkPaintableFlags = CUnsignedInt
object GdkPaintableFlags extends _BindgenEnumCUnsignedInt[GdkPaintableFlags]:
  given _tag: Tag[GdkPaintableFlags] = Tag.UInt
  inline def define(inline a: Long): GdkPaintableFlags = a.toUInt
  val GDK_PAINTABLE_STATIC_SIZE = define(1)
  val GDK_PAINTABLE_STATIC_CONTENTS = define(2)
  def getName(value: GdkPaintableFlags): Option[String] =
    value match
      case `GDK_PAINTABLE_STATIC_SIZE` => Some("GDK_PAINTABLE_STATIC_SIZE")
      case `GDK_PAINTABLE_STATIC_CONTENTS` => Some("GDK_PAINTABLE_STATIC_CONTENTS")
      case _ => _root_.scala.None
  extension (a: GdkPaintableFlags)
    inline def &(b: GdkPaintableFlags): GdkPaintableFlags = a & b
    inline def |(b: GdkPaintableFlags): GdkPaintableFlags = a | b
    inline def is(b: GdkPaintableFlags): Boolean = (a & b) == b