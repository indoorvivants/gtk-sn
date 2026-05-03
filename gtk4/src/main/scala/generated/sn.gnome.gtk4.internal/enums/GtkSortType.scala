package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkSortType: _SORT_ASCENDING: Sorting is in ascending order. _SORT_DESCENDING: Sorting is in descending order.
*/
opaque type GtkSortType = CUnsignedInt
object GtkSortType extends _BindgenEnumCUnsignedInt[GtkSortType]:
  given _tag: Tag[GtkSortType] = Tag.UInt
  inline def define(inline a: Long): GtkSortType = a.toUInt
  val GTK_SORT_ASCENDING = define(0)
  val GTK_SORT_DESCENDING = define(1)
  def getName(value: GtkSortType): Option[String] =
    value match
      case `GTK_SORT_ASCENDING` => Some("GTK_SORT_ASCENDING")
      case `GTK_SORT_DESCENDING` => Some("GTK_SORT_DESCENDING")
      case _ => _root_.scala.None
  extension (a: GtkSortType)
    inline def &(b: GtkSortType): GtkSortType = a & b
    inline def |(b: GtkSortType): GtkSortType = a | b
    inline def is(b: GtkSortType): Boolean = (a & b) == b