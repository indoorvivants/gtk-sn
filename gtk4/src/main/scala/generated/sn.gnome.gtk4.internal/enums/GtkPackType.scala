package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkPackType: _PACK_START: The child is packed into the start of the widget _PACK_END: The child is packed into the end of the widget
*/
opaque type GtkPackType = CUnsignedInt
object GtkPackType extends _BindgenEnumCUnsignedInt[GtkPackType]:
  given _tag: Tag[GtkPackType] = Tag.UInt
  inline def define(inline a: Long): GtkPackType = a.toUInt
  val GTK_PACK_START = define(0)
  val GTK_PACK_END = define(1)
  def getName(value: GtkPackType): Option[String] =
    value match
      case `GTK_PACK_START` => Some("GTK_PACK_START")
      case `GTK_PACK_END` => Some("GTK_PACK_END")
      case _ => _root_.scala.None
  extension (a: GtkPackType)
    inline def &(b: GtkPackType): GtkPackType = a & b
    inline def |(b: GtkPackType): GtkPackType = a | b
    inline def is(b: GtkPackType): Boolean = (a & b) == b