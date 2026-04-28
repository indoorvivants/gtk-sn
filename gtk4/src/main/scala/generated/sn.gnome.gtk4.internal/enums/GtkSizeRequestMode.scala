package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkSizeRequestMode: _SIZE_REQUEST_HEIGHT_FOR_WIDTH: Prefer height-for-width geometry management _SIZE_REQUEST_WIDTH_FOR_HEIGHT: Prefer width-for-height geometry management _SIZE_REQUEST_CONSTANT_SIZE: Don’t trade height-for-width or width-for-height
*/
opaque type GtkSizeRequestMode = CUnsignedInt
object GtkSizeRequestMode extends _BindgenEnumCUnsignedInt[GtkSizeRequestMode]:
  given _tag: Tag[GtkSizeRequestMode] = Tag.UInt
  inline def define(inline a: Long): GtkSizeRequestMode = a.toUInt
  val GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH = define(0)
  val GTK_SIZE_REQUEST_WIDTH_FOR_HEIGHT = define(1)
  val GTK_SIZE_REQUEST_CONSTANT_SIZE = define(2)
  def getName(value: GtkSizeRequestMode): Option[String] =
    value match
      case `GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH` => Some("GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH")
      case `GTK_SIZE_REQUEST_WIDTH_FOR_HEIGHT` => Some("GTK_SIZE_REQUEST_WIDTH_FOR_HEIGHT")
      case `GTK_SIZE_REQUEST_CONSTANT_SIZE` => Some("GTK_SIZE_REQUEST_CONSTANT_SIZE")
      case _ => _root_.scala.None
  extension (a: GtkSizeRequestMode)
    inline def &(b: GtkSizeRequestMode): GtkSizeRequestMode = a & b
    inline def |(b: GtkSizeRequestMode): GtkSizeRequestMode = a | b
    inline def is(b: GtkSizeRequestMode): Boolean = (a & b) == b