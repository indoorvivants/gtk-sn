package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkSorterChange: _SORTER_CHANGE_DIFFERENT: The sorter change cannot be described by any of the other enumeration values _SORTER_CHANGE_INVERTED: The sort order was inverted. Comparisons that returned %GTK_ORDERING_SMALLER now return %GTK_ORDERING_LARGER and vice versa. Other comparisons return the same values as before. _SORTER_CHANGE_LESS_STRICT: The sorter is less strict: Comparisons may now return %GTK_ORDERING_EQUAL that did not do so before. _SORTER_CHANGE_MORE_STRICT: The sorter is more strict: Comparisons that did return %GTK_ORDERING_EQUAL may not do so anymore.
*/
opaque type GtkSorterChange = CUnsignedInt
object GtkSorterChange extends _BindgenEnumCUnsignedInt[GtkSorterChange]:
  given _tag: Tag[GtkSorterChange] = Tag.UInt
  inline def define(inline a: Long): GtkSorterChange = a.toUInt
  val GTK_SORTER_CHANGE_DIFFERENT = define(0)
  val GTK_SORTER_CHANGE_INVERTED = define(1)
  val GTK_SORTER_CHANGE_LESS_STRICT = define(2)
  val GTK_SORTER_CHANGE_MORE_STRICT = define(3)
  def getName(value: GtkSorterChange): Option[String] =
    value match
      case `GTK_SORTER_CHANGE_DIFFERENT` => Some("GTK_SORTER_CHANGE_DIFFERENT")
      case `GTK_SORTER_CHANGE_INVERTED` => Some("GTK_SORTER_CHANGE_INVERTED")
      case `GTK_SORTER_CHANGE_LESS_STRICT` => Some("GTK_SORTER_CHANGE_LESS_STRICT")
      case `GTK_SORTER_CHANGE_MORE_STRICT` => Some("GTK_SORTER_CHANGE_MORE_STRICT")
      case _ => _root_.scala.None
  extension (a: GtkSorterChange)
    inline def &(b: GtkSorterChange): GtkSorterChange = a & b
    inline def |(b: GtkSorterChange): GtkSorterChange = a | b
    inline def is(b: GtkSorterChange): Boolean = (a & b) == b