package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTreeModelFlags: _TREE_MODEL_ITERS_PERSIST: iterators survive all signals emitted by the tree _TREE_MODEL_LIST_ONLY: the model is a list only, and never has children
*/
opaque type GtkTreeModelFlags = CUnsignedInt
object GtkTreeModelFlags extends _BindgenEnumCUnsignedInt[GtkTreeModelFlags]:
  given _tag: Tag[GtkTreeModelFlags] = Tag.UInt
  inline def define(inline a: Long): GtkTreeModelFlags = a.toUInt
  val GTK_TREE_MODEL_ITERS_PERSIST = define(1)
  val GTK_TREE_MODEL_LIST_ONLY = define(2)
  def getName(value: GtkTreeModelFlags): Option[String] =
    value match
      case `GTK_TREE_MODEL_ITERS_PERSIST` => Some("GTK_TREE_MODEL_ITERS_PERSIST")
      case `GTK_TREE_MODEL_LIST_ONLY` => Some("GTK_TREE_MODEL_LIST_ONLY")
      case _ => _root_.scala.None
  extension (a: GtkTreeModelFlags)
    inline def &(b: GtkTreeModelFlags): GtkTreeModelFlags = a & b
    inline def |(b: GtkTreeModelFlags): GtkTreeModelFlags = a | b
    inline def is(b: GtkTreeModelFlags): Boolean = (a & b) == b