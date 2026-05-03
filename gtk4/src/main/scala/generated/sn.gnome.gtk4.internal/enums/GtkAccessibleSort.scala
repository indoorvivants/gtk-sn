package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkAccessibleSort: _ACCESSIBLE_SORT_NONE: There is no defined sort applied to the column. _ACCESSIBLE_SORT_ASCENDING: Items are sorted in ascending order by this column. _ACCESSIBLE_SORT_DESCENDING: Items are sorted in descending order by this column. _ACCESSIBLE_SORT_OTHER: A sort algorithm other than ascending or descending has been applied.
*/
opaque type GtkAccessibleSort = CUnsignedInt
object GtkAccessibleSort extends _BindgenEnumCUnsignedInt[GtkAccessibleSort]:
  given _tag: Tag[GtkAccessibleSort] = Tag.UInt
  inline def define(inline a: Long): GtkAccessibleSort = a.toUInt
  val GTK_ACCESSIBLE_SORT_NONE = define(0)
  val GTK_ACCESSIBLE_SORT_ASCENDING = define(1)
  val GTK_ACCESSIBLE_SORT_DESCENDING = define(2)
  val GTK_ACCESSIBLE_SORT_OTHER = define(3)
  def getName(value: GtkAccessibleSort): Option[String] =
    value match
      case `GTK_ACCESSIBLE_SORT_NONE` => Some("GTK_ACCESSIBLE_SORT_NONE")
      case `GTK_ACCESSIBLE_SORT_ASCENDING` => Some("GTK_ACCESSIBLE_SORT_ASCENDING")
      case `GTK_ACCESSIBLE_SORT_DESCENDING` => Some("GTK_ACCESSIBLE_SORT_DESCENDING")
      case `GTK_ACCESSIBLE_SORT_OTHER` => Some("GTK_ACCESSIBLE_SORT_OTHER")
      case _ => _root_.scala.None
  extension (a: GtkAccessibleSort)
    inline def &(b: GtkAccessibleSort): GtkAccessibleSort = a & b
    inline def |(b: GtkAccessibleSort): GtkAccessibleSort = a | b
    inline def is(b: GtkAccessibleSort): Boolean = (a & b) == b