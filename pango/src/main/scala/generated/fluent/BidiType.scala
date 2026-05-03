package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoBidiType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `PangoBidiType` represents the bidirectional character type of a Unicode
  * character.
  *
  * The values in this enumeration are specified by the [Unicode bidirectional
  * algorithm](http://www.unicode.org/reports/tr9/).
  */
enum BidiType(val raw: PangoBidiType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Left-to-Right
    */
  case L extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_L)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Left-to-Right Embedding
    */
  case LRE extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_LRE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Left-to-Right Override
    */
  case LRO extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_LRO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Right-to-Left
    */
  case R extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_R)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Right-to-Left Arabic
    */
  case AL extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_AL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Right-to-Left Embedding
    */
  case RLE extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_RLE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Right-to-Left Override
    */
  case RLO extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_RLO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Pop Directional Format
    */
  case PDF extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_PDF)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * European Number
    */
  case EN extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_EN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * European Number Separator
    */
  case ES extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_ES)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * European Number Terminator
    */
  case ET extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_ET)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Arabic Number
    */
  case AN extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_AN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Common Number Separator
    */
  case CS extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_CS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Nonspacing Mark
    */
  case NSM extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_NSM)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Boundary Neutral
    */
  case BN extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_BN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Paragraph Separator
    */
  case B extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_B)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Segment Separator
    */
  case S extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_S)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Whitespace
    */
  case WS extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_WS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Other Neutrals
    */
  case ON extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_ON)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Left-to-Right isolate. Since 1.48.6
    */
  case LRI extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_LRI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Right-to-Left isolate. Since 1.48.6
    */
  case RLI extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_RLI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * First strong isolate. Since 1.48.6
    */
  case FSI extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_FSI)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Pop directional isolate. Since 1.48.6
    */
  case PDI extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_PDI)
end BidiType

object BidiType:
  def fromRaw(raw: PangoBidiType): BidiType =
    raw match
      case PangoBidiType.PANGO_BIDI_TYPE_L   => BidiType.L
      case PangoBidiType.PANGO_BIDI_TYPE_LRE => BidiType.LRE
      case PangoBidiType.PANGO_BIDI_TYPE_LRO => BidiType.LRO
      case PangoBidiType.PANGO_BIDI_TYPE_R   => BidiType.R
      case PangoBidiType.PANGO_BIDI_TYPE_AL  => BidiType.AL
      case PangoBidiType.PANGO_BIDI_TYPE_RLE => BidiType.RLE
      case PangoBidiType.PANGO_BIDI_TYPE_RLO => BidiType.RLO
      case PangoBidiType.PANGO_BIDI_TYPE_PDF => BidiType.PDF
      case PangoBidiType.PANGO_BIDI_TYPE_EN  => BidiType.EN
      case PangoBidiType.PANGO_BIDI_TYPE_ES  => BidiType.ES
      case PangoBidiType.PANGO_BIDI_TYPE_ET  => BidiType.ET
      case PangoBidiType.PANGO_BIDI_TYPE_AN  => BidiType.AN
      case PangoBidiType.PANGO_BIDI_TYPE_CS  => BidiType.CS
      case PangoBidiType.PANGO_BIDI_TYPE_NSM => BidiType.NSM
      case PangoBidiType.PANGO_BIDI_TYPE_BN  => BidiType.BN
      case PangoBidiType.PANGO_BIDI_TYPE_B   => BidiType.B
      case PangoBidiType.PANGO_BIDI_TYPE_S   => BidiType.S
      case PangoBidiType.PANGO_BIDI_TYPE_WS  => BidiType.WS
      case PangoBidiType.PANGO_BIDI_TYPE_ON  => BidiType.ON
      case PangoBidiType.PANGO_BIDI_TYPE_LRI => BidiType.LRI
      case PangoBidiType.PANGO_BIDI_TYPE_RLI => BidiType.RLI
      case PangoBidiType.PANGO_BIDI_TYPE_FSI => BidiType.FSI
      case PangoBidiType.PANGO_BIDI_TYPE_PDI => BidiType.PDI
  end fromRaw
end BidiType
