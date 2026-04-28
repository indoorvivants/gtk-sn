package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTreeViewDropPosition: _TREE_VIEW_DROP_BEFORE: dropped row is inserted before _TREE_VIEW_DROP_AFTER: dropped row is inserted after _TREE_VIEW_DROP_INTO_OR_BEFORE: dropped row becomes a child or is inserted before _TREE_VIEW_DROP_INTO_OR_AFTER: dropped row becomes a child or is inserted after
*/
opaque type GtkTreeViewDropPosition = CUnsignedInt
object GtkTreeViewDropPosition extends _BindgenEnumCUnsignedInt[GtkTreeViewDropPosition]:
  given _tag: Tag[GtkTreeViewDropPosition] = Tag.UInt
  inline def define(inline a: Long): GtkTreeViewDropPosition = a.toUInt
  val GTK_TREE_VIEW_DROP_BEFORE = define(0)
  val GTK_TREE_VIEW_DROP_AFTER = define(1)
  val GTK_TREE_VIEW_DROP_INTO_OR_BEFORE = define(2)
  val GTK_TREE_VIEW_DROP_INTO_OR_AFTER = define(3)
  def getName(value: GtkTreeViewDropPosition): Option[String] =
    value match
      case `GTK_TREE_VIEW_DROP_BEFORE` => Some("GTK_TREE_VIEW_DROP_BEFORE")
      case `GTK_TREE_VIEW_DROP_AFTER` => Some("GTK_TREE_VIEW_DROP_AFTER")
      case `GTK_TREE_VIEW_DROP_INTO_OR_BEFORE` => Some("GTK_TREE_VIEW_DROP_INTO_OR_BEFORE")
      case `GTK_TREE_VIEW_DROP_INTO_OR_AFTER` => Some("GTK_TREE_VIEW_DROP_INTO_OR_AFTER")
      case _ => _root_.scala.None
  extension (a: GtkTreeViewDropPosition)
    inline def &(b: GtkTreeViewDropPosition): GtkTreeViewDropPosition = a & b
    inline def |(b: GtkTreeViewDropPosition): GtkTreeViewDropPosition = a | b
    inline def is(b: GtkTreeViewDropPosition): Boolean = (a & b) == b