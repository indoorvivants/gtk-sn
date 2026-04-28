package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkCellRendererAccelMode: _CELL_RENDERER_ACCEL_MODE_GTK: GTK accelerators mode _CELL_RENDERER_ACCEL_MODE_OTHER: Other accelerator mode
*/
opaque type GtkCellRendererAccelMode = CUnsignedInt
object GtkCellRendererAccelMode extends _BindgenEnumCUnsignedInt[GtkCellRendererAccelMode]:
  given _tag: Tag[GtkCellRendererAccelMode] = Tag.UInt
  inline def define(inline a: Long): GtkCellRendererAccelMode = a.toUInt
  val GTK_CELL_RENDERER_ACCEL_MODE_GTK = define(0)
  val GTK_CELL_RENDERER_ACCEL_MODE_OTHER = define(1)
  def getName(value: GtkCellRendererAccelMode): Option[String] =
    value match
      case `GTK_CELL_RENDERER_ACCEL_MODE_GTK` => Some("GTK_CELL_RENDERER_ACCEL_MODE_GTK")
      case `GTK_CELL_RENDERER_ACCEL_MODE_OTHER` => Some("GTK_CELL_RENDERER_ACCEL_MODE_OTHER")
      case _ => _root_.scala.None
  extension (a: GtkCellRendererAccelMode)
    inline def &(b: GtkCellRendererAccelMode): GtkCellRendererAccelMode = a & b
    inline def |(b: GtkCellRendererAccelMode): GtkCellRendererAccelMode = a | b
    inline def is(b: GtkCellRendererAccelMode): Boolean = (a & b) == b