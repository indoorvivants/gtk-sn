package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkStringFilterMatchMode: _STRING_FILTER_MATCH_MODE_EXACT: The search string and text must match exactly. _STRING_FILTER_MATCH_MODE_SUBSTRING: The search string must be contained as a substring inside the text. _STRING_FILTER_MATCH_MODE_PREFIX: The text must begin with the search string.
*/
opaque type GtkStringFilterMatchMode = CUnsignedInt
object GtkStringFilterMatchMode extends _BindgenEnumCUnsignedInt[GtkStringFilterMatchMode]:
  given _tag: Tag[GtkStringFilterMatchMode] = Tag.UInt
  inline def define(inline a: Long): GtkStringFilterMatchMode = a.toUInt
  val GTK_STRING_FILTER_MATCH_MODE_EXACT = define(0)
  val GTK_STRING_FILTER_MATCH_MODE_SUBSTRING = define(1)
  val GTK_STRING_FILTER_MATCH_MODE_PREFIX = define(2)
  def getName(value: GtkStringFilterMatchMode): Option[String] =
    value match
      case `GTK_STRING_FILTER_MATCH_MODE_EXACT` => Some("GTK_STRING_FILTER_MATCH_MODE_EXACT")
      case `GTK_STRING_FILTER_MATCH_MODE_SUBSTRING` => Some("GTK_STRING_FILTER_MATCH_MODE_SUBSTRING")
      case `GTK_STRING_FILTER_MATCH_MODE_PREFIX` => Some("GTK_STRING_FILTER_MATCH_MODE_PREFIX")
      case _ => _root_.scala.None
  extension (a: GtkStringFilterMatchMode)
    inline def &(b: GtkStringFilterMatchMode): GtkStringFilterMatchMode = a & b
    inline def |(b: GtkStringFilterMatchMode): GtkStringFilterMatchMode = a | b
    inline def is(b: GtkStringFilterMatchMode): Boolean = (a & b) == b