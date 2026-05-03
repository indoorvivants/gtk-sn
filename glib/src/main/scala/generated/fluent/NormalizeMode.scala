package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GNormalizeMode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Defines how a Unicode string is transformed in a canonical form,
  * standardizing such issues as whether a character with an accent is
  * represented as a base character and combining accent or as a single
  * precomposed character. Unicode strings should generally be normalized before
  * comparing them.
  */
enum NormalizeMode(val raw: GNormalizeMode):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * standardize differences that do not affect the text content, such as the
    * above-mentioned accent representation
    */
  case DEFAULT extends NormalizeMode(GNormalizeMode.G_NORMALIZE_DEFAULT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * another name for %G_NORMALIZE_DEFAULT
    */
  case NFD extends NormalizeMode(GNormalizeMode.G_NORMALIZE_NFD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * like %G_NORMALIZE_DEFAULT, but with composed forms rather than a maximally
    * decomposed form
    */
  case DEFAULT_COMPOSE
      extends NormalizeMode(GNormalizeMode.G_NORMALIZE_DEFAULT_COMPOSE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * another name for %G_NORMALIZE_DEFAULT_COMPOSE
    */
  case NFC extends NormalizeMode(GNormalizeMode.G_NORMALIZE_NFC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * beyond %G_NORMALIZE_DEFAULT also standardize the "compatibility"
    * characters in Unicode, such as SUPERSCRIPT THREE to the standard forms (in
    * this case DIGIT THREE). Formatting information may be lost but for most
    * text operations such characters should be considered the same
    */
  case ALL extends NormalizeMode(GNormalizeMode.G_NORMALIZE_ALL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * another name for %G_NORMALIZE_ALL
    */
  case NFKD extends NormalizeMode(GNormalizeMode.G_NORMALIZE_NFKD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * like %G_NORMALIZE_ALL, but with composed forms rather than a maximally
    * decomposed form
    */
  case ALL_COMPOSE extends NormalizeMode(GNormalizeMode.G_NORMALIZE_ALL_COMPOSE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * another name for %G_NORMALIZE_ALL_COMPOSE
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
