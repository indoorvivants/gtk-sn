package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTreeViewColumnSizing: _TREE_VIEW_COLUMN_GROW_ONLY: Columns only get bigger in reaction to changes in the model _TREE_VIEW_COLUMN_AUTOSIZE: Columns resize to be the optimal size every time the model changes. _TREE_VIEW_COLUMN_FIXED: Columns are a fixed numbers of pixels wide.
*/
opaque type GtkTreeViewColumnSizing = CUnsignedInt
object GtkTreeViewColumnSizing extends _BindgenEnumCUnsignedInt[GtkTreeViewColumnSizing]:
  given _tag: Tag[GtkTreeViewColumnSizing] = Tag.UInt
  inline def define(inline a: Long): GtkTreeViewColumnSizing = a.toUInt
  val GTK_TREE_VIEW_COLUMN_GROW_ONLY = define(0)
  val GTK_TREE_VIEW_COLUMN_AUTOSIZE = define(1)
  val GTK_TREE_VIEW_COLUMN_FIXED = define(2)
  def getName(value: GtkTreeViewColumnSizing): Option[String] =
    value match
      case `GTK_TREE_VIEW_COLUMN_GROW_ONLY` => Some("GTK_TREE_VIEW_COLUMN_GROW_ONLY")
      case `GTK_TREE_VIEW_COLUMN_AUTOSIZE` => Some("GTK_TREE_VIEW_COLUMN_AUTOSIZE")
      case `GTK_TREE_VIEW_COLUMN_FIXED` => Some("GTK_TREE_VIEW_COLUMN_FIXED")
      case _ => _root_.scala.None
  extension (a: GtkTreeViewColumnSizing)
    inline def &(b: GtkTreeViewColumnSizing): GtkTreeViewColumnSizing = a & b
    inline def |(b: GtkTreeViewColumnSizing): GtkTreeViewColumnSizing = a | b
    inline def is(b: GtkTreeViewColumnSizing): Boolean = (a & b) == b