package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoCoverageLevel: _COVERAGE_NONE: The character is not representable with the font. _COVERAGE_FALLBACK: The character is represented in a way that may be comprehensible but is not the correct graphical form. For instance, a Hangul character represented as a a sequence of Jamos, or a Latin transliteration of a Cyrillic word. _COVERAGE_APPROXIMATE: The character is represented as basically the correct graphical form, but with a stylistic variant inappropriate for the current script. _COVERAGE_EXACT: The character is represented as the correct graphical form.
*/
opaque type PangoCoverageLevel = CUnsignedInt
object PangoCoverageLevel extends _BindgenEnumCUnsignedInt[PangoCoverageLevel]:
  given _tag: Tag[PangoCoverageLevel] = Tag.UInt
  inline def define(inline a: Long): PangoCoverageLevel = a.toUInt
  val PANGO_COVERAGE_NONE = define(0)
  val PANGO_COVERAGE_FALLBACK = define(1)
  val PANGO_COVERAGE_APPROXIMATE = define(2)
  val PANGO_COVERAGE_EXACT = define(3)
  def getName(value: PangoCoverageLevel): Option[String] =
    value match
      case `PANGO_COVERAGE_NONE` => Some("PANGO_COVERAGE_NONE")
      case `PANGO_COVERAGE_FALLBACK` => Some("PANGO_COVERAGE_FALLBACK")
      case `PANGO_COVERAGE_APPROXIMATE` => Some("PANGO_COVERAGE_APPROXIMATE")
      case `PANGO_COVERAGE_EXACT` => Some("PANGO_COVERAGE_EXACT")
      case _ => _root_.scala.None
  extension (a: PangoCoverageLevel)
    inline def &(b: PangoCoverageLevel): PangoCoverageLevel = a & b
    inline def |(b: PangoCoverageLevel): PangoCoverageLevel = a | b
    inline def is(b: PangoCoverageLevel): Boolean = (a & b) == b