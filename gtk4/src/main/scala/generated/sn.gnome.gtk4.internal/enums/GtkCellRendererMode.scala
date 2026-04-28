package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkCellRendererMode: _CELL_RENDERER_MODE_INERT: The cell is just for display and cannot be interacted with. Note that this doesn’t mean that eg. the row being drawn can’t be selected -- just that a particular element of it cannot be individually modified. _CELL_RENDERER_MODE_ACTIVATABLE: The cell can be clicked. _CELL_RENDERER_MODE_EDITABLE: The cell can be edited or otherwise modified.
*/
opaque type GtkCellRendererMode = CUnsignedInt
object GtkCellRendererMode extends _BindgenEnumCUnsignedInt[GtkCellRendererMode]:
  given _tag: Tag[GtkCellRendererMode] = Tag.UInt
  inline def define(inline a: Long): GtkCellRendererMode = a.toUInt
  val GTK_CELL_RENDERER_MODE_INERT = define(0)
  val GTK_CELL_RENDERER_MODE_ACTIVATABLE = define(1)
  val GTK_CELL_RENDERER_MODE_EDITABLE = define(2)
  def getName(value: GtkCellRendererMode): Option[String] =
    value match
      case `GTK_CELL_RENDERER_MODE_INERT` => Some("GTK_CELL_RENDERER_MODE_INERT")
      case `GTK_CELL_RENDERER_MODE_ACTIVATABLE` => Some("GTK_CELL_RENDERER_MODE_ACTIVATABLE")
      case `GTK_CELL_RENDERER_MODE_EDITABLE` => Some("GTK_CELL_RENDERER_MODE_EDITABLE")
      case _ => _root_.scala.None
  extension (a: GtkCellRendererMode)
    inline def &(b: GtkCellRendererMode): GtkCellRendererMode = a & b
    inline def |(b: GtkCellRendererMode): GtkCellRendererMode = a | b
    inline def is(b: GtkCellRendererMode): Boolean = (a & b) == b