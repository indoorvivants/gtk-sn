package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTreeViewGridLines: _TREE_VIEW_GRID_LINES_NONE: No grid lines. _TREE_VIEW_GRID_LINES_HORIZONTAL: Horizontal grid lines. _TREE_VIEW_GRID_LINES_VERTICAL: Vertical grid lines. _TREE_VIEW_GRID_LINES_BOTH: Horizontal and vertical grid lines.
*/
opaque type GtkTreeViewGridLines = CUnsignedInt
object GtkTreeViewGridLines extends _BindgenEnumCUnsignedInt[GtkTreeViewGridLines]:
  given _tag: Tag[GtkTreeViewGridLines] = Tag.UInt
  inline def define(inline a: Long): GtkTreeViewGridLines = a.toUInt
  val GTK_TREE_VIEW_GRID_LINES_NONE = define(0)
  val GTK_TREE_VIEW_GRID_LINES_HORIZONTAL = define(1)
  val GTK_TREE_VIEW_GRID_LINES_VERTICAL = define(2)
  val GTK_TREE_VIEW_GRID_LINES_BOTH = define(3)
  def getName(value: GtkTreeViewGridLines): Option[String] =
    value match
      case `GTK_TREE_VIEW_GRID_LINES_NONE` => Some("GTK_TREE_VIEW_GRID_LINES_NONE")
      case `GTK_TREE_VIEW_GRID_LINES_HORIZONTAL` => Some("GTK_TREE_VIEW_GRID_LINES_HORIZONTAL")
      case `GTK_TREE_VIEW_GRID_LINES_VERTICAL` => Some("GTK_TREE_VIEW_GRID_LINES_VERTICAL")
      case `GTK_TREE_VIEW_GRID_LINES_BOTH` => Some("GTK_TREE_VIEW_GRID_LINES_BOTH")
      case _ => _root_.scala.None
  extension (a: GtkTreeViewGridLines)
    inline def &(b: GtkTreeViewGridLines): GtkTreeViewGridLines = a & b
    inline def |(b: GtkTreeViewGridLines): GtkTreeViewGridLines = a | b
    inline def is(b: GtkTreeViewGridLines): Boolean = (a & b) == b