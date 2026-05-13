package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GNormalizeMode

/** Defines how a Unicode string is transformed in a canonical form,
  * standardizing such issues as whether a character with an accent is
  * represented as a base character and combining accent or as a single
  * precomposed character. Unicode strings should generally be normalized before
  * comparing them.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum NormalizeMode(val raw: GNormalizeMode):
  /** standardize differences that do not affect the text content, such as the
    * above-mentioned accent representation
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DEFAULT extends NormalizeMode(GNormalizeMode.G_NORMALIZE_DEFAULT)

  /** another name for %G_NORMALIZE_DEFAULT
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NFD extends NormalizeMode(GNormalizeMode.G_NORMALIZE_NFD)

  /** like %G_NORMALIZE_DEFAULT, but with composed forms rather than a maximally
    * decomposed form
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DEFAULT_COMPOSE
      extends NormalizeMode(GNormalizeMode.G_NORMALIZE_DEFAULT_COMPOSE)

  /** another name for %G_NORMALIZE_DEFAULT_COMPOSE
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NFC extends NormalizeMode(GNormalizeMode.G_NORMALIZE_NFC)

  /** beyond %G_NORMALIZE_DEFAULT also standardize the "compatibility"
    * characters in Unicode, such as SUPERSCRIPT THREE to the standard forms (in
    * this case DIGIT THREE). Formatting information may be lost but for most
    * text operations such characters should be considered the same
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ALL extends NormalizeMode(GNormalizeMode.G_NORMALIZE_ALL)

  /** another name for %G_NORMALIZE_ALL
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NFKD extends NormalizeMode(GNormalizeMode.G_NORMALIZE_NFKD)

  /** like %G_NORMALIZE_ALL, but with composed forms rather than a maximally
    * decomposed form
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ALL_COMPOSE extends NormalizeMode(GNormalizeMode.G_NORMALIZE_ALL_COMPOSE)

  /** another name for %G_NORMALIZE_ALL_COMPOSE
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NFKC extends NormalizeMode(GNormalizeMode.G_NORMALIZE_NFKC)
end NormalizeMode

object NormalizeMode:
  def fromRaw(raw: GNormalizeMode): NormalizeMode =
    raw match
      case GNormalizeMode.G_NORMALIZE_DEFAULT         => NormalizeMode.DEFAULT
      case GNormalizeMode.G_NORMALIZE_NFD             => NormalizeMode.NFD
      case GNormalizeMode.G_NORMALIZE_DEFAULT_COMPOSE =>
        NormalizeMode.DEFAULT_COMPOSE
      case GNormalizeMode.G_NORMALIZE_NFC         => NormalizeMode.NFC
      case GNormalizeMode.G_NORMALIZE_ALL         => NormalizeMode.ALL
      case GNormalizeMode.G_NORMALIZE_NFKD        => NormalizeMode.NFKD
      case GNormalizeMode.G_NORMALIZE_ALL_COMPOSE => NormalizeMode.ALL_COMPOSE
      case GNormalizeMode.G_NORMALIZE_NFKC        => NormalizeMode.NFKC
  end fromRaw
end NormalizeMode
