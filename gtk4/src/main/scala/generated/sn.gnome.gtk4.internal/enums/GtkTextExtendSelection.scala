package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTextExtendSelection: _TEXT_EXTEND_SELECTION_WORD: Selects the current word. It is triggered by a double-click for example. _TEXT_EXTEND_SELECTION_LINE: Selects the current line. It is triggered by a triple-click for example.
*/
opaque type GtkTextExtendSelection = CUnsignedInt
object GtkTextExtendSelection extends _BindgenEnumCUnsignedInt[GtkTextExtendSelection]:
  given _tag: Tag[GtkTextExtendSelection] = Tag.UInt
  inline def define(inline a: Long): GtkTextExtendSelection = a.toUInt
  val GTK_TEXT_EXTEND_SELECTION_WORD = define(0)
  val GTK_TEXT_EXTEND_SELECTION_LINE = define(1)
  def getName(value: GtkTextExtendSelection): Option[String] =
    value match
      case `GTK_TEXT_EXTEND_SELECTION_WORD` => Some("GTK_TEXT_EXTEND_SELECTION_WORD")
      case `GTK_TEXT_EXTEND_SELECTION_LINE` => Some("GTK_TEXT_EXTEND_SELECTION_LINE")
      case _ => _root_.scala.None
  extension (a: GtkTextExtendSelection)
    inline def &(b: GtkTextExtendSelection): GtkTextExtendSelection = a & b
    inline def |(b: GtkTextExtendSelection): GtkTextExtendSelection = a | b
    inline def is(b: GtkTextExtendSelection): Boolean = (a & b) == b