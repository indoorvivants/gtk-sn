package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GNormalizeMode: _NORMALIZE_DEFAULT: standardize differences that do not affect the text content, such as the above-mentioned accent representation _NORMALIZE_NFD: another name for %G_NORMALIZE_DEFAULT _NORMALIZE_DEFAULT_COMPOSE: like %G_NORMALIZE_DEFAULT, but with composed forms rather than a maximally decomposed form _NORMALIZE_NFC: another name for %G_NORMALIZE_DEFAULT_COMPOSE _NORMALIZE_ALL: beyond %G_NORMALIZE_DEFAULT also standardize the "compatibility" characters in Unicode, such as SUPERSCRIPT THREE to the standard forms (in this case DIGIT THREE). Formatting information may be lost but for most text operations such characters should be considered the same _NORMALIZE_NFKD: another name for %G_NORMALIZE_ALL _NORMALIZE_ALL_COMPOSE: like %G_NORMALIZE_ALL, but with composed forms rather than a maximally decomposed form _NORMALIZE_NFKC: another name for %G_NORMALIZE_ALL_COMPOSE
*/
opaque type GNormalizeMode = CUnsignedInt
object GNormalizeMode extends _BindgenEnumCUnsignedInt[GNormalizeMode]:
  given _tag: Tag[GNormalizeMode] = Tag.UInt
  inline def define(inline a: Long): GNormalizeMode = a.toUInt
  val G_NORMALIZE_DEFAULT = define(0)
  val G_NORMALIZE_NFD = define(0)
  val G_NORMALIZE_DEFAULT_COMPOSE = define(1)
  val G_NORMALIZE_NFC = define(1)
  val G_NORMALIZE_ALL = define(2)
  val G_NORMALIZE_NFKD = define(2)
  val G_NORMALIZE_ALL_COMPOSE = define(3)
  val G_NORMALIZE_NFKC = define(3)
  def getName(value: GNormalizeMode): Option[String] =
    value match
      case `G_NORMALIZE_DEFAULT` => Some("G_NORMALIZE_DEFAULT")
      case `G_NORMALIZE_NFD` => Some("G_NORMALIZE_NFD")
      case `G_NORMALIZE_DEFAULT_COMPOSE` => Some("G_NORMALIZE_DEFAULT_COMPOSE")
      case `G_NORMALIZE_NFC` => Some("G_NORMALIZE_NFC")
      case `G_NORMALIZE_ALL` => Some("G_NORMALIZE_ALL")
      case `G_NORMALIZE_NFKD` => Some("G_NORMALIZE_NFKD")
      case `G_NORMALIZE_ALL_COMPOSE` => Some("G_NORMALIZE_ALL_COMPOSE")
      case `G_NORMALIZE_NFKC` => Some("G_NORMALIZE_NFKC")
      case _ => _root_.scala.None
  extension (a: GNormalizeMode)
    inline def &(b: GNormalizeMode): GNormalizeMode = a & b
    inline def |(b: GNormalizeMode): GNormalizeMode = a | b
    inline def is(b: GNormalizeMode): Boolean = (a & b) == b