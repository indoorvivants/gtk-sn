package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkCellRendererState: _CELL_RENDERER_SELECTED: The cell is currently selected, and probably has a selection colored background to render to. _CELL_RENDERER_PRELIT: The mouse is hovering over the cell. _CELL_RENDERER_INSENSITIVE: The cell is drawn in an insensitive manner _CELL_RENDERER_SORTED: The cell is in a sorted row _CELL_RENDERER_FOCUSED: The cell is in the focus row. _CELL_RENDERER_EXPANDABLE: The cell is in a row that can be expanded _CELL_RENDERER_EXPANDED: The cell is in a row that is expanded
*/
opaque type GtkCellRendererState = CUnsignedInt
object GtkCellRendererState extends _BindgenEnumCUnsignedInt[GtkCellRendererState]:
  given _tag: Tag[GtkCellRendererState] = Tag.UInt
  inline def define(inline a: Long): GtkCellRendererState = a.toUInt
  val GTK_CELL_RENDERER_SELECTED = define(1)
  val GTK_CELL_RENDERER_PRELIT = define(2)
  val GTK_CELL_RENDERER_INSENSITIVE = define(4)
  val GTK_CELL_RENDERER_SORTED = define(8)
  val GTK_CELL_RENDERER_FOCUSED = define(16)
  val GTK_CELL_RENDERER_EXPANDABLE = define(32)
  val GTK_CELL_RENDERER_EXPANDED = define(64)
  def getName(value: GtkCellRendererState): Option[String] =
    value match
      case `GTK_CELL_RENDERER_SELECTED` => Some("GTK_CELL_RENDERER_SELECTED")
      case `GTK_CELL_RENDERER_PRELIT` => Some("GTK_CELL_RENDERER_PRELIT")
      case `GTK_CELL_RENDERER_INSENSITIVE` => Some("GTK_CELL_RENDERER_INSENSITIVE")
      case `GTK_CELL_RENDERER_SORTED` => Some("GTK_CELL_RENDERER_SORTED")
      case `GTK_CELL_RENDERER_FOCUSED` => Some("GTK_CELL_RENDERER_FOCUSED")
      case `GTK_CELL_RENDERER_EXPANDABLE` => Some("GTK_CELL_RENDERER_EXPANDABLE")
      case `GTK_CELL_RENDERER_EXPANDED` => Some("GTK_CELL_RENDERER_EXPANDED")
      case _ => _root_.scala.None
  extension (a: GtkCellRendererState)
    inline def &(b: GtkCellRendererState): GtkCellRendererState = a & b
    inline def |(b: GtkCellRendererState): GtkCellRendererState = a | b
    inline def is(b: GtkCellRendererState): Boolean = (a & b) == b