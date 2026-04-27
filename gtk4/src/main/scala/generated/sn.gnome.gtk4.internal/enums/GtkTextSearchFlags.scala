package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTextSearchFlags: _TEXT_SEARCH_VISIBLE_ONLY: Search only visible data. A search match may have invisible text interspersed. _TEXT_SEARCH_TEXT_ONLY: Search only text. A match may have paintables or child widgets mixed inside the matched range. _TEXT_SEARCH_CASE_INSENSITIVE: The text will be matched regardless of what case it is in.
*/
opaque type GtkTextSearchFlags = CUnsignedInt
object GtkTextSearchFlags extends _BindgenEnumCUnsignedInt[GtkTextSearchFlags]:
  given _tag: Tag[GtkTextSearchFlags] = Tag.UInt
  inline def define(inline a: Long): GtkTextSearchFlags = a.toUInt
  val GTK_TEXT_SEARCH_VISIBLE_ONLY = define(1)
  val GTK_TEXT_SEARCH_TEXT_ONLY = define(2)
  val GTK_TEXT_SEARCH_CASE_INSENSITIVE = define(4)
  def getName(value: GtkTextSearchFlags): Option[String] =
    value match
      case `GTK_TEXT_SEARCH_VISIBLE_ONLY` => Some("GTK_TEXT_SEARCH_VISIBLE_ONLY")
      case `GTK_TEXT_SEARCH_TEXT_ONLY` => Some("GTK_TEXT_SEARCH_TEXT_ONLY")
      case `GTK_TEXT_SEARCH_CASE_INSENSITIVE` => Some("GTK_TEXT_SEARCH_CASE_INSENSITIVE")
      case _ => _root_.scala.None
  extension (a: GtkTextSearchFlags)
    inline def &(b: GtkTextSearchFlags): GtkTextSearchFlags = a & b
    inline def |(b: GtkTextSearchFlags): GtkTextSearchFlags = a | b
    inline def is(b: GtkTextSearchFlags): Boolean = (a & b) == b