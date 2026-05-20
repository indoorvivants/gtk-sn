package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{GScannerConfig, gchar, guint}

/** Specifies the #GScanner parser configuration. Most settings can be changed
  * during the parsing phase and will affect the lexical parsing of the next
  * unpeeked token.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ScannerConfig private[gnome] (raw: Ptr[GScannerConfig]):

  def getUnsafeRawPointer(): Ptr[GScannerConfig] = this.raw

  /** specifies which characters should be skipped by the scanner (the default
    * is the whitespace characters: space, tab, carriage-return and line-feed).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def csetSkipCharacters(using Zone): scala.Predef.String /* None */ =
    (!raw).cset_skip_characters.asInstanceOf[Ptr[gchar]]

  /** specifies which characters should be skipped by the scanner (the default
    * is the whitespace characters: space, tab, carriage-return and line-feed).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def csetSkipCharacters_=(
      value: scala.Predef.String /* None */
  )(using Zone): Unit = (!raw).cset_skip_characters_=(
    toCString(value).asInstanceOf[Ptr[gchar]].asInstanceOf[Ptr[gchar]]
  )

  /** specifies the characters which can start identifiers (the default is
    * %G_CSET_a_2_z, "_", and %G_CSET_A_2_Z).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def csetIdentifierFirst(using Zone): scala.Predef.String /* None */ =
    (!raw).cset_identifier_first.asInstanceOf[Ptr[gchar]]

  /** specifies the characters which can start identifiers (the default is
    * %G_CSET_a_2_z, "_", and %G_CSET_A_2_Z).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def csetIdentifierFirst_=(
      value: scala.Predef.String /* None */
  )(using Zone): Unit = (!raw).cset_identifier_first_=(
    toCString(value).asInstanceOf[Ptr[gchar]].asInstanceOf[Ptr[gchar]]
  )

  /** specifies the characters which can be used in identifiers, after the first
    * character (the default is %G_CSET_a_2_z, "_0123456789", %G_CSET_A_2_Z,
    * %G_CSET_LATINS, %G_CSET_LATINC).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def csetIdentifierNth(using Zone): scala.Predef.String /* None */ =
    (!raw).cset_identifier_nth.asInstanceOf[Ptr[gchar]]

  /** specifies the characters which can be used in identifiers, after the first
    * character (the default is %G_CSET_a_2_z, "_0123456789", %G_CSET_A_2_Z,
    * %G_CSET_LATINS, %G_CSET_LATINC).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def csetIdentifierNth_=(
      value: scala.Predef.String /* None */
  )(using Zone): Unit = (!raw).cset_identifier_nth_=(
    toCString(value).asInstanceOf[Ptr[gchar]].asInstanceOf[Ptr[gchar]]
  )

  /** specifies the characters at the start and end of single-line comments. The
    * default is "#\n" which means that single-line comments start with a '#'
    * and continue until a '\n' (end of line).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def cpairCommentSingle(using Zone): scala.Predef.String /* None */ =
    (!raw).cpair_comment_single.asInstanceOf[Ptr[gchar]]

  /** specifies the characters at the start and end of single-line comments. The
    * default is "#\n" which means that single-line comments start with a '#'
    * and continue until a '\n' (end of line).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def cpairCommentSingle_=(
      value: scala.Predef.String /* None */
  )(using Zone): Unit = (!raw).cpair_comment_single_=(
    toCString(value).asInstanceOf[Ptr[gchar]].asInstanceOf[Ptr[gchar]]
  )

  /** specifies if symbols are case sensitive (the default is %FALSE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def caseSensitive: UInt /* None */ = (!raw).case_sensitive.asInstanceOf[guint]

  /** specifies if symbols are case sensitive (the default is %FALSE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def caseSensitive_=(value: UInt /* None */ ): Unit =
    (!raw).case_sensitive_=(guint(value).asInstanceOf[guint])

  /** specifies if multi-line comments are skipped and not returned as tokens
    * (the default is %TRUE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def skipCommentMulti: UInt /* None */ =
    (!raw).skip_comment_multi.asInstanceOf[guint]

  /** specifies if multi-line comments are skipped and not returned as tokens
    * (the default is %TRUE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def skipCommentMulti_=(value: UInt /* None */ ): Unit =
    (!raw).skip_comment_multi_=(guint(value).asInstanceOf[guint])

  /** specifies if single-line comments are skipped and not returned as tokens
    * (the default is %TRUE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def skipCommentSingle: UInt /* None */ =
    (!raw).skip_comment_single.asInstanceOf[guint]

  /** specifies if single-line comments are skipped and not returned as tokens
    * (the default is %TRUE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def skipCommentSingle_=(value: UInt /* None */ ): Unit =
    (!raw).skip_comment_single_=(guint(value).asInstanceOf[guint])

  /** specifies if multi-line comments are recognized (the default is %TRUE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scanCommentMulti: UInt /* None */ =
    (!raw).scan_comment_multi.asInstanceOf[guint]

  /** specifies if multi-line comments are recognized (the default is %TRUE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scanCommentMulti_=(value: UInt /* None */ ): Unit =
    (!raw).scan_comment_multi_=(guint(value).asInstanceOf[guint])

  /** specifies if identifiers are recognized (the default is %TRUE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scanIdentifier: UInt /* None */ =
    (!raw).scan_identifier.asInstanceOf[guint]

  /** specifies if identifiers are recognized (the default is %TRUE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scanIdentifier_=(value: UInt /* None */ ): Unit =
    (!raw).scan_identifier_=(guint(value).asInstanceOf[guint])

  /** specifies if single-character identifiers are recognized (the default is
    * %FALSE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scanIdentifier1char: UInt /* None */ =
    (!raw).scan_identifier_1char.asInstanceOf[guint]

  /** specifies if single-character identifiers are recognized (the default is
    * %FALSE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scanIdentifier1char_=(value: UInt /* None */ ): Unit =
    (!raw).scan_identifier_1char_=(guint(value).asInstanceOf[guint])

  /** specifies if %NULL is reported as %G_TOKEN_IDENTIFIER_NULL (the default is
    * %FALSE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scanIdentifierNULL: UInt /* None */ =
    (!raw).scan_identifier_NULL.asInstanceOf[guint]

  /** specifies if %NULL is reported as %G_TOKEN_IDENTIFIER_NULL (the default is
    * %FALSE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scanIdentifierNULL_=(value: UInt /* None */ ): Unit =
    (!raw).scan_identifier_NULL_=(guint(value).asInstanceOf[guint])

  /** specifies if symbols are recognized (the default is %TRUE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scanSymbols: UInt /* None */ = (!raw).scan_symbols.asInstanceOf[guint]

  /** specifies if symbols are recognized (the default is %TRUE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scanSymbols_=(value: UInt /* None */ ): Unit =
    (!raw).scan_symbols_=(guint(value).asInstanceOf[guint])

  /** specifies if binary numbers are recognized (the default is %FALSE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scanBinary: UInt /* None */ = (!raw).scan_binary.asInstanceOf[guint]

  /** specifies if binary numbers are recognized (the default is %FALSE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scanBinary_=(value: UInt /* None */ ): Unit =
    (!raw).scan_binary_=(guint(value).asInstanceOf[guint])

  /** specifies if octal numbers are recognized (the default is %TRUE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scanOctal: UInt /* None */ = (!raw).scan_octal.asInstanceOf[guint]

  /** specifies if octal numbers are recognized (the default is %TRUE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scanOctal_=(value: UInt /* None */ ): Unit =
    (!raw).scan_octal_=(guint(value).asInstanceOf[guint])

  /** specifies if floating point numbers are recognized (the default is %TRUE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scanFloat: UInt /* None */ = (!raw).scan_float.asInstanceOf[guint]

  /** specifies if floating point numbers are recognized (the default is %TRUE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scanFloat_=(value: UInt /* None */ ): Unit =
    (!raw).scan_float_=(guint(value).asInstanceOf[guint])

  /** specifies if hexadecimal numbers are recognized (the default is %TRUE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scanHex: UInt /* None */ = (!raw).scan_hex.asInstanceOf[guint]

  /** specifies if hexadecimal numbers are recognized (the default is %TRUE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scanHex_=(value: UInt /* None */ ): Unit =
    (!raw).scan_hex_=(guint(value).asInstanceOf[guint])

  /** specifies if '$' is recognized as a prefix for hexadecimal numbers (the
    * default is %FALSE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scanHexDollar: UInt /* None */ =
    (!raw).scan_hex_dollar.asInstanceOf[guint]

  /** specifies if '$' is recognized as a prefix for hexadecimal numbers (the
    * default is %FALSE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scanHexDollar_=(value: UInt /* None */ ): Unit =
    (!raw).scan_hex_dollar_=(guint(value).asInstanceOf[guint])

  /** specifies if strings can be enclosed in single quotes (the default is
    * %TRUE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scanStringSq: UInt /* None */ = (!raw).scan_string_sq.asInstanceOf[guint]

  /** specifies if strings can be enclosed in single quotes (the default is
    * %TRUE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scanStringSq_=(value: UInt /* None */ ): Unit =
    (!raw).scan_string_sq_=(guint(value).asInstanceOf[guint])

  /** specifies if strings can be enclosed in double quotes (the default is
    * %TRUE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scanStringDq: UInt /* None */ = (!raw).scan_string_dq.asInstanceOf[guint]

  /** specifies if strings can be enclosed in double quotes (the default is
    * %TRUE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scanStringDq_=(value: UInt /* None */ ): Unit =
    (!raw).scan_string_dq_=(guint(value).asInstanceOf[guint])

  /** specifies if binary, octal and hexadecimal numbers are reported as
    * %G_TOKEN_INT (the default is %TRUE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def numbers2Int: UInt /* None */ = (!raw).numbers_2_int.asInstanceOf[guint]

  /** specifies if binary, octal and hexadecimal numbers are reported as
    * %G_TOKEN_INT (the default is %TRUE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def numbers2Int_=(value: UInt /* None */ ): Unit =
    (!raw).numbers_2_int_=(guint(value).asInstanceOf[guint])

  /** specifies if all numbers are reported as %G_TOKEN_FLOAT (the default is
    * %FALSE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def int2Float: UInt /* None */ = (!raw).int_2_float.asInstanceOf[guint]

  /** specifies if all numbers are reported as %G_TOKEN_FLOAT (the default is
    * %FALSE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def int2Float_=(value: UInt /* None */ ): Unit =
    (!raw).int_2_float_=(guint(value).asInstanceOf[guint])

  /** specifies if identifiers are reported as strings (the default is %FALSE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def identifier2String: UInt /* None */ =
    (!raw).identifier_2_string.asInstanceOf[guint]

  /** specifies if identifiers are reported as strings (the default is %FALSE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def identifier2String_=(value: UInt /* None */ ): Unit =
    (!raw).identifier_2_string_=(guint(value).asInstanceOf[guint])

  /** specifies if characters are reported by setting `token = ch` or as
    * %G_TOKEN_CHAR (the default is %TRUE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def char2Token: UInt /* None */ = (!raw).char_2_token.asInstanceOf[guint]

  /** specifies if characters are reported by setting `token = ch` or as
    * %G_TOKEN_CHAR (the default is %TRUE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def char2Token_=(value: UInt /* None */ ): Unit =
    (!raw).char_2_token_=(guint(value).asInstanceOf[guint])

  /** specifies if symbols are reported by setting `token = v_symbol` or as
    * %G_TOKEN_SYMBOL (the default is %FALSE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def symbol2Token: UInt /* None */ = (!raw).symbol_2_token.asInstanceOf[guint]

  /** specifies if symbols are reported by setting `token = v_symbol` or as
    * %G_TOKEN_SYMBOL (the default is %FALSE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def symbol2Token_=(value: UInt /* None */ ): Unit =
    (!raw).symbol_2_token_=(guint(value).asInstanceOf[guint])

  /** specifies if a symbol is searched for in the default scope in addition to
    * the current scope (the default is %FALSE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scope0Fallback: UInt /* None */ =
    (!raw).scope_0_fallback.asInstanceOf[guint]

  /** specifies if a symbol is searched for in the default scope in addition to
    * the current scope (the default is %FALSE).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scope0Fallback_=(value: UInt /* None */ ): Unit =
    (!raw).scope_0_fallback_=(guint(value).asInstanceOf[guint])

  /** use value.v_int64 rather than v_int
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def storeInt64: UInt /* None */ = (!raw).store_int64.asInstanceOf[guint]

  /** use value.v_int64 rather than v_int
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def storeInt64_=(value: UInt /* None */ ): Unit =
    (!raw).store_int64_=(guint(value).asInstanceOf[guint])

end ScannerConfig

object ScannerConfig:
  def fromRaw(ptr: Ptr[GScannerConfig]): ScannerConfig = new ScannerConfig(ptr)
end ScannerConfig
