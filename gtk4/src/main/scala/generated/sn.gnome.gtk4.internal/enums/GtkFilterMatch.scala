package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkFilterMatch: _FILTER_MATCH_SOME: The filter matches some items, gtk_filter_match() may return %TRUE or %FALSE _FILTER_MATCH_NONE: The filter does not match any item, gtk_filter_match() will always return %FALSE. _FILTER_MATCH_ALL: The filter matches all items, gtk_filter_match() will alays return %TRUE.
*/
opaque type GtkFilterMatch = CUnsignedInt
object GtkFilterMatch extends _BindgenEnumCUnsignedInt[GtkFilterMatch]:
  given _tag: Tag[GtkFilterMatch] = Tag.UInt
  inline def define(inline a: Long): GtkFilterMatch = a.toUInt
  val GTK_FILTER_MATCH_SOME = define(0)
  val GTK_FILTER_MATCH_NONE = define(1)
  val GTK_FILTER_MATCH_ALL = define(2)
  def getName(value: GtkFilterMatch): Option[String] =
    value match
      case `GTK_FILTER_MATCH_SOME` => Some("GTK_FILTER_MATCH_SOME")
      case `GTK_FILTER_MATCH_NONE` => Some("GTK_FILTER_MATCH_NONE")
      case `GTK_FILTER_MATCH_ALL` => Some("GTK_FILTER_MATCH_ALL")
      case _ => _root_.scala.None
  extension (a: GtkFilterMatch)
    inline def &(b: GtkFilterMatch): GtkFilterMatch = a & b
    inline def |(b: GtkFilterMatch): GtkFilterMatch = a | b
    inline def is(b: GtkFilterMatch): Boolean = (a & b) == b