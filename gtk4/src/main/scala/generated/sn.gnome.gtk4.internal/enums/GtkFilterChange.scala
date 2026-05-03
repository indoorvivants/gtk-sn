package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkFilterChange: _FILTER_CHANGE_DIFFERENT: The filter change cannot be described with any of the other enumeration values. _FILTER_CHANGE_LESS_STRICT: The filter is less strict than it was before: All items that it used to return %TRUE for still return %TRUE, others now may, too. _FILTER_CHANGE_MORE_STRICT: The filter is more strict than it was before: All items that it used to return %FALSE for still return %FALSE, others now may, too.
*/
opaque type GtkFilterChange = CUnsignedInt
object GtkFilterChange extends _BindgenEnumCUnsignedInt[GtkFilterChange]:
  given _tag: Tag[GtkFilterChange] = Tag.UInt
  inline def define(inline a: Long): GtkFilterChange = a.toUInt
  val GTK_FILTER_CHANGE_DIFFERENT = define(0)
  val GTK_FILTER_CHANGE_LESS_STRICT = define(1)
  val GTK_FILTER_CHANGE_MORE_STRICT = define(2)
  def getName(value: GtkFilterChange): Option[String] =
    value match
      case `GTK_FILTER_CHANGE_DIFFERENT` => Some("GTK_FILTER_CHANGE_DIFFERENT")
      case `GTK_FILTER_CHANGE_LESS_STRICT` => Some("GTK_FILTER_CHANGE_LESS_STRICT")
      case `GTK_FILTER_CHANGE_MORE_STRICT` => Some("GTK_FILTER_CHANGE_MORE_STRICT")
      case _ => _root_.scala.None
  extension (a: GtkFilterChange)
    inline def &(b: GtkFilterChange): GtkFilterChange = a & b
    inline def |(b: GtkFilterChange): GtkFilterChange = a | b
    inline def is(b: GtkFilterChange): Boolean = (a & b) == b