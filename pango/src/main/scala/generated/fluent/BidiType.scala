package sn.gnome.pango

import _root_.sn.gnome.pango.internal.PangoBidiType

/** `PangoBidiType` represents the bidirectional character type of a Unicode
  * character.
  *
  * The values in this enumeration are specified by the [Unicode bidirectional
  * algorithm](http://www.unicode.org/reports/tr9/).
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum BidiType(val raw: PangoBidiType):
  /** Left-to-Right
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case L extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_L)

  /** Left-to-Right Embedding
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LRE extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_LRE)

  /** Left-to-Right Override
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LRO extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_LRO)

  /** Right-to-Left
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case R extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_R)

  /** Right-to-Left Arabic
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case AL extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_AL)

  /** Right-to-Left Embedding
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RLE extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_RLE)

  /** Right-to-Left Override
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RLO extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_RLO)

  /** Pop Directional Format
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PDF extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_PDF)

  /** European Number
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EN extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_EN)

  /** European Number Separator
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ES extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_ES)

  /** European Number Terminator
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ET extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_ET)

  /** Arabic Number
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case AN extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_AN)

  /** Common Number Separator
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CS extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_CS)

  /** Nonspacing Mark
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NSM extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_NSM)

  /** Boundary Neutral
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BN extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_BN)

  /** Paragraph Separator
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case B extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_B)

  /** Segment Separator
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case S extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_S)

  /** Whitespace
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WS extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_WS)

  /** Other Neutrals
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ON extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_ON)

  /** Left-to-Right isolate. Since 1.48.6
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LRI extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_LRI)

  /** Right-to-Left isolate. Since 1.48.6
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RLI extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_RLI)

  /** First strong isolate. Since 1.48.6
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FSI extends BidiType(PangoBidiType.PANGO_BIDI_TYPE_FSI)

  /** Pop directional isolate. Since 1.48.6
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
