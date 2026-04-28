package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTextViewLayer: _TEXT_VIEW_LAYER_BELOW_TEXT: The layer rendered below the text (but above the background). _TEXT_VIEW_LAYER_ABOVE_TEXT: The layer rendered above the text.
*/
opaque type GtkTextViewLayer = CUnsignedInt
object GtkTextViewLayer extends _BindgenEnumCUnsignedInt[GtkTextViewLayer]:
  given _tag: Tag[GtkTextViewLayer] = Tag.UInt
  inline def define(inline a: Long): GtkTextViewLayer = a.toUInt
  val GTK_TEXT_VIEW_LAYER_BELOW_TEXT = define(0)
  val GTK_TEXT_VIEW_LAYER_ABOVE_TEXT = define(1)
  def getName(value: GtkTextViewLayer): Option[String] =
    value match
      case `GTK_TEXT_VIEW_LAYER_BELOW_TEXT` => Some("GTK_TEXT_VIEW_LAYER_BELOW_TEXT")
      case `GTK_TEXT_VIEW_LAYER_ABOVE_TEXT` => Some("GTK_TEXT_VIEW_LAYER_ABOVE_TEXT")
      case _ => _root_.scala.None
  extension (a: GtkTextViewLayer)
    inline def &(b: GtkTextViewLayer): GtkTextViewLayer = a & b
    inline def |(b: GtkTextViewLayer): GtkTextViewLayer = a | b
    inline def is(b: GtkTextViewLayer): Boolean = (a & b) == b