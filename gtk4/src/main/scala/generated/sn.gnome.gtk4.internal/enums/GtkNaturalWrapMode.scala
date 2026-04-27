package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkNaturalWrapMode: _NATURAL_WRAP_INHERIT: Inherit the minimum size request. In particular, this should be used with %PANGO_WRAP_CHAR. _NATURAL_WRAP_NONE: Try not to wrap the text. This mode is the closest to GTK3's behavior but can lead to a wide label leaving lots of empty space below the text. _NATURAL_WRAP_WORD: Attempt to wrap at word boundaries. This is useful in particular when using %PANGO_WRAP_WORD_CHAR as the wrap mode.
*/
opaque type GtkNaturalWrapMode = CUnsignedInt
object GtkNaturalWrapMode extends _BindgenEnumCUnsignedInt[GtkNaturalWrapMode]:
  given _tag: Tag[GtkNaturalWrapMode] = Tag.UInt
  inline def define(inline a: Long): GtkNaturalWrapMode = a.toUInt
  val GTK_NATURAL_WRAP_INHERIT = define(0)
  val GTK_NATURAL_WRAP_NONE = define(1)
  val GTK_NATURAL_WRAP_WORD = define(2)
  def getName(value: GtkNaturalWrapMode): Option[String] =
    value match
      case `GTK_NATURAL_WRAP_INHERIT` => Some("GTK_NATURAL_WRAP_INHERIT")
      case `GTK_NATURAL_WRAP_NONE` => Some("GTK_NATURAL_WRAP_NONE")
      case `GTK_NATURAL_WRAP_WORD` => Some("GTK_NATURAL_WRAP_WORD")
      case _ => _root_.scala.None
  extension (a: GtkNaturalWrapMode)
    inline def &(b: GtkNaturalWrapMode): GtkNaturalWrapMode = a & b
    inline def |(b: GtkNaturalWrapMode): GtkNaturalWrapMode = a | b
    inline def is(b: GtkNaturalWrapMode): Boolean = (a & b) == b