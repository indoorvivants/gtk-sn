package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkInscriptionOverflow: _INSCRIPTION_OVERFLOW_CLIP: Clip the remaining text _INSCRIPTION_OVERFLOW_ELLIPSIZE_START: Omit characters at the start of the text _INSCRIPTION_OVERFLOW_ELLIPSIZE_MIDDLE: Omit characters at the middle of the text _INSCRIPTION_OVERFLOW_ELLIPSIZE_END: Omit characters at the end of the text
*/
opaque type GtkInscriptionOverflow = CUnsignedInt
object GtkInscriptionOverflow extends _BindgenEnumCUnsignedInt[GtkInscriptionOverflow]:
  given _tag: Tag[GtkInscriptionOverflow] = Tag.UInt
  inline def define(inline a: Long): GtkInscriptionOverflow = a.toUInt
  val GTK_INSCRIPTION_OVERFLOW_CLIP = define(0)
  val GTK_INSCRIPTION_OVERFLOW_ELLIPSIZE_START = define(1)
  val GTK_INSCRIPTION_OVERFLOW_ELLIPSIZE_MIDDLE = define(2)
  val GTK_INSCRIPTION_OVERFLOW_ELLIPSIZE_END = define(3)
  def getName(value: GtkInscriptionOverflow): Option[String] =
    value match
      case `GTK_INSCRIPTION_OVERFLOW_CLIP` => Some("GTK_INSCRIPTION_OVERFLOW_CLIP")
      case `GTK_INSCRIPTION_OVERFLOW_ELLIPSIZE_START` => Some("GTK_INSCRIPTION_OVERFLOW_ELLIPSIZE_START")
      case `GTK_INSCRIPTION_OVERFLOW_ELLIPSIZE_MIDDLE` => Some("GTK_INSCRIPTION_OVERFLOW_ELLIPSIZE_MIDDLE")
      case `GTK_INSCRIPTION_OVERFLOW_ELLIPSIZE_END` => Some("GTK_INSCRIPTION_OVERFLOW_ELLIPSIZE_END")
      case _ => _root_.scala.None
  extension (a: GtkInscriptionOverflow)
    inline def &(b: GtkInscriptionOverflow): GtkInscriptionOverflow = a & b
    inline def |(b: GtkInscriptionOverflow): GtkInscriptionOverflow = a | b
    inline def is(b: GtkInscriptionOverflow): Boolean = (a & b) == b