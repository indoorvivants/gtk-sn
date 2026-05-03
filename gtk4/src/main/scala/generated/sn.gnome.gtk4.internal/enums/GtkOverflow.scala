package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkOverflow: _OVERFLOW_VISIBLE: No change is applied. Content is drawn at the specified position. _OVERFLOW_HIDDEN: Content is clipped to the bounds of the area. Content outside the area is not drawn and cannot be interacted with.
*/
opaque type GtkOverflow = CUnsignedInt
object GtkOverflow extends _BindgenEnumCUnsignedInt[GtkOverflow]:
  given _tag: Tag[GtkOverflow] = Tag.UInt
  inline def define(inline a: Long): GtkOverflow = a.toUInt
  val GTK_OVERFLOW_VISIBLE = define(0)
  val GTK_OVERFLOW_HIDDEN = define(1)
  def getName(value: GtkOverflow): Option[String] =
    value match
      case `GTK_OVERFLOW_VISIBLE` => Some("GTK_OVERFLOW_VISIBLE")
      case `GTK_OVERFLOW_HIDDEN` => Some("GTK_OVERFLOW_HIDDEN")
      case _ => _root_.scala.None
  extension (a: GtkOverflow)
    inline def &(b: GtkOverflow): GtkOverflow = a & b
    inline def |(b: GtkOverflow): GtkOverflow = a | b
    inline def is(b: GtkOverflow): Boolean = (a & b) == b