package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkMovementStep: _MOVEMENT_LOGICAL_POSITIONS: Move forward or back by graphemes _MOVEMENT_VISUAL_POSITIONS: Move left or right by graphemes _MOVEMENT_WORDS: Move forward or back by words _MOVEMENT_DISPLAY_LINES: Move up or down lines (wrapped lines) _MOVEMENT_DISPLAY_LINE_ENDS: Move to either end of a line _MOVEMENT_PARAGRAPHS: Move up or down paragraphs (newline-ended lines) _MOVEMENT_PARAGRAPH_ENDS: Move to either end of a paragraph _MOVEMENT_PAGES: Move by pages _MOVEMENT_BUFFER_ENDS: Move to ends of the buffer _MOVEMENT_HORIZONTAL_PAGES: Move horizontally by pages
*/
opaque type GtkMovementStep = CUnsignedInt
object GtkMovementStep extends _BindgenEnumCUnsignedInt[GtkMovementStep]:
  given _tag: Tag[GtkMovementStep] = Tag.UInt
  inline def define(inline a: Long): GtkMovementStep = a.toUInt
  val GTK_MOVEMENT_LOGICAL_POSITIONS = define(0)
  val GTK_MOVEMENT_VISUAL_POSITIONS = define(1)
  val GTK_MOVEMENT_WORDS = define(2)
  val GTK_MOVEMENT_DISPLAY_LINES = define(3)
  val GTK_MOVEMENT_DISPLAY_LINE_ENDS = define(4)
  val GTK_MOVEMENT_PARAGRAPHS = define(5)
  val GTK_MOVEMENT_PARAGRAPH_ENDS = define(6)
  val GTK_MOVEMENT_PAGES = define(7)
  val GTK_MOVEMENT_BUFFER_ENDS = define(8)
  val GTK_MOVEMENT_HORIZONTAL_PAGES = define(9)
  def getName(value: GtkMovementStep): Option[String] =
    value match
      case `GTK_MOVEMENT_LOGICAL_POSITIONS` => Some("GTK_MOVEMENT_LOGICAL_POSITIONS")
      case `GTK_MOVEMENT_VISUAL_POSITIONS` => Some("GTK_MOVEMENT_VISUAL_POSITIONS")
      case `GTK_MOVEMENT_WORDS` => Some("GTK_MOVEMENT_WORDS")
      case `GTK_MOVEMENT_DISPLAY_LINES` => Some("GTK_MOVEMENT_DISPLAY_LINES")
      case `GTK_MOVEMENT_DISPLAY_LINE_ENDS` => Some("GTK_MOVEMENT_DISPLAY_LINE_ENDS")
      case `GTK_MOVEMENT_PARAGRAPHS` => Some("GTK_MOVEMENT_PARAGRAPHS")
      case `GTK_MOVEMENT_PARAGRAPH_ENDS` => Some("GTK_MOVEMENT_PARAGRAPH_ENDS")
      case `GTK_MOVEMENT_PAGES` => Some("GTK_MOVEMENT_PAGES")
      case `GTK_MOVEMENT_BUFFER_ENDS` => Some("GTK_MOVEMENT_BUFFER_ENDS")
      case `GTK_MOVEMENT_HORIZONTAL_PAGES` => Some("GTK_MOVEMENT_HORIZONTAL_PAGES")
      case _ => _root_.scala.None
  extension (a: GtkMovementStep)
    inline def &(b: GtkMovementStep): GtkMovementStep = a & b
    inline def |(b: GtkMovementStep): GtkMovementStep = a | b
    inline def is(b: GtkMovementStep): Boolean = (a & b) == b