package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoBidiType: _BIDI_TYPE_L: Left-to-Right _BIDI_TYPE_LRE: Left-to-Right Embedding _BIDI_TYPE_LRO: Left-to-Right Override _BIDI_TYPE_R: Right-to-Left _BIDI_TYPE_AL: Right-to-Left Arabic _BIDI_TYPE_RLE: Right-to-Left Embedding _BIDI_TYPE_RLO: Right-to-Left Override _BIDI_TYPE_PDF: Pop Directional Format _BIDI_TYPE_EN: European Number _BIDI_TYPE_ES: European Number Separator _BIDI_TYPE_ET: European Number Terminator _BIDI_TYPE_AN: Arabic Number _BIDI_TYPE_CS: Common Number Separator _BIDI_TYPE_NSM: Nonspacing Mark _BIDI_TYPE_BN: Boundary Neutral _BIDI_TYPE_B: Paragraph Separator _BIDI_TYPE_S: Segment Separator _BIDI_TYPE_WS: Whitespace _BIDI_TYPE_ON: Other Neutrals _BIDI_TYPE_LRI: Left-to-Right isolate. Since 1.48.6 _BIDI_TYPE_RLI: Right-to-Left isolate. Since 1.48.6 _BIDI_TYPE_FSI: First strong isolate. Since 1.48.6 _BIDI_TYPE_PDI: Pop directional isolate. Since 1.48.6
*/
opaque type PangoBidiType = CUnsignedInt
object PangoBidiType extends _BindgenEnumCUnsignedInt[PangoBidiType]:
  given _tag: Tag[PangoBidiType] = Tag.UInt
  inline def define(inline a: Long): PangoBidiType = a.toUInt
  val PANGO_BIDI_TYPE_L = define(0)
  val PANGO_BIDI_TYPE_LRE = define(1)
  val PANGO_BIDI_TYPE_LRO = define(2)
  val PANGO_BIDI_TYPE_R = define(3)
  val PANGO_BIDI_TYPE_AL = define(4)
  val PANGO_BIDI_TYPE_RLE = define(5)
  val PANGO_BIDI_TYPE_RLO = define(6)
  val PANGO_BIDI_TYPE_PDF = define(7)
  val PANGO_BIDI_TYPE_EN = define(8)
  val PANGO_BIDI_TYPE_ES = define(9)
  val PANGO_BIDI_TYPE_ET = define(10)
  val PANGO_BIDI_TYPE_AN = define(11)
  val PANGO_BIDI_TYPE_CS = define(12)
  val PANGO_BIDI_TYPE_NSM = define(13)
  val PANGO_BIDI_TYPE_BN = define(14)
  val PANGO_BIDI_TYPE_B = define(15)
  val PANGO_BIDI_TYPE_S = define(16)
  val PANGO_BIDI_TYPE_WS = define(17)
  val PANGO_BIDI_TYPE_ON = define(18)
  val PANGO_BIDI_TYPE_LRI = define(19)
  val PANGO_BIDI_TYPE_RLI = define(20)
  val PANGO_BIDI_TYPE_FSI = define(21)
  val PANGO_BIDI_TYPE_PDI = define(22)
  def getName(value: PangoBidiType): Option[String] =
    value match
      case `PANGO_BIDI_TYPE_L` => Some("PANGO_BIDI_TYPE_L")
      case `PANGO_BIDI_TYPE_LRE` => Some("PANGO_BIDI_TYPE_LRE")
      case `PANGO_BIDI_TYPE_LRO` => Some("PANGO_BIDI_TYPE_LRO")
      case `PANGO_BIDI_TYPE_R` => Some("PANGO_BIDI_TYPE_R")
      case `PANGO_BIDI_TYPE_AL` => Some("PANGO_BIDI_TYPE_AL")
      case `PANGO_BIDI_TYPE_RLE` => Some("PANGO_BIDI_TYPE_RLE")
      case `PANGO_BIDI_TYPE_RLO` => Some("PANGO_BIDI_TYPE_RLO")
      case `PANGO_BIDI_TYPE_PDF` => Some("PANGO_BIDI_TYPE_PDF")
      case `PANGO_BIDI_TYPE_EN` => Some("PANGO_BIDI_TYPE_EN")
      case `PANGO_BIDI_TYPE_ES` => Some("PANGO_BIDI_TYPE_ES")
      case `PANGO_BIDI_TYPE_ET` => Some("PANGO_BIDI_TYPE_ET")
      case `PANGO_BIDI_TYPE_AN` => Some("PANGO_BIDI_TYPE_AN")
      case `PANGO_BIDI_TYPE_CS` => Some("PANGO_BIDI_TYPE_CS")
      case `PANGO_BIDI_TYPE_NSM` => Some("PANGO_BIDI_TYPE_NSM")
      case `PANGO_BIDI_TYPE_BN` => Some("PANGO_BIDI_TYPE_BN")
      case `PANGO_BIDI_TYPE_B` => Some("PANGO_BIDI_TYPE_B")
      case `PANGO_BIDI_TYPE_S` => Some("PANGO_BIDI_TYPE_S")
      case `PANGO_BIDI_TYPE_WS` => Some("PANGO_BIDI_TYPE_WS")
      case `PANGO_BIDI_TYPE_ON` => Some("PANGO_BIDI_TYPE_ON")
      case `PANGO_BIDI_TYPE_LRI` => Some("PANGO_BIDI_TYPE_LRI")
      case `PANGO_BIDI_TYPE_RLI` => Some("PANGO_BIDI_TYPE_RLI")
      case `PANGO_BIDI_TYPE_FSI` => Some("PANGO_BIDI_TYPE_FSI")
      case `PANGO_BIDI_TYPE_PDI` => Some("PANGO_BIDI_TYPE_PDI")
      case _ => _root_.scala.None
  extension (a: PangoBidiType)
    inline def &(b: PangoBidiType): PangoBidiType = a & b
    inline def |(b: PangoBidiType): PangoBidiType = a | b
    inline def is(b: PangoBidiType): Boolean = (a & b) == b