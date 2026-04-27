package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GRegexMatchFlags: _REGEX_MATCH_DEFAULT: No special options set. Since: 2.74 _REGEX_MATCH_ANCHORED: The pattern is forced to be "anchored", that is, it is constrained to match only at the first matching point in the string that is being searched. This effect can also be achieved by appropriate constructs in the pattern itself such as the "^" metacharacter. _REGEX_MATCH_NOTBOL: Specifies that first character of the string is not the beginning of a line, so the circumflex metacharacter should not match before it. Setting this without %G_REGEX_MULTILINE (at compile time) causes circumflex never to match. This option affects only the behaviour of the circumflex metacharacter, it does not affect "\A". _REGEX_MATCH_NOTEOL: Specifies that the end of the subject string is not the end of a line, so the dollar metacharacter should not match it nor (except in multiline mode) a newline immediately before it. Setting this without %G_REGEX_MULTILINE (at compile time) causes dollar never to match. This option affects only the behaviour of the dollar metacharacter, it does not affect "\Z" or "\z". _REGEX_MATCH_NOTEMPTY: An empty string is not considered to be a valid match if this option is set. If there are alternatives in the pattern, they are tried. If all the alternatives match the empty string, the entire match fails. For example, if the pattern "a?b?" is applied to a string not beginning with "a" or "b", it matches the empty string at the start of the string. With this flag set, this match is not valid, so GRegex searches further into the string for occurrences of "a" or "b". _REGEX_MATCH_PARTIAL: Turns on the partial matching feature, for more documentation on partial matching see g_match_info_is_partial_match(). _REGEX_MATCH_NEWLINE_CR: Overrides the newline definition set when creating a new #GRegex, setting the '' character as line terminator. _REGEX_MATCH_NEWLINE_LF: Overrides the newline definition set when creating a new #GRegex, setting the '' character as line terminator. _REGEX_MATCH_NEWLINE_CRLF: Overrides the newline definition set when creating a new #GRegex, setting the '' characters sequence as line terminator. _REGEX_MATCH_NEWLINE_ANY: Overrides the newline definition set when creating a new #GRegex, any Unicode newline sequence is recognised as a newline. These are '', '' and '', and the single characters U+000B LINE TABULATION, U+000C FORM FEED (FF), U+0085 NEXT LINE (NEL), U+2028 LINE SEPARATOR and U+2029 PARAGRAPH SEPARATOR. _REGEX_MATCH_NEWLINE_ANYCRLF: Overrides the newline definition set when creating a new #GRegex; any '', '', or '' character sequence is recognized as a newline. Since: 2.34 _REGEX_MATCH_BSR_ANYCRLF: Overrides the newline definition for "\R" set when creating a new #GRegex; only '', '', or '' character sequences are recognized as a newline by "\R". Since: 2.34 _REGEX_MATCH_BSR_ANY: Overrides the newline definition for "\R" set when creating a new #GRegex; any Unicode newline character or character sequence are recognized as a newline by "\R". These are '', '' and '', and the single characters U+000B LINE TABULATION, U+000C FORM FEED (FF), U+0085 NEXT LINE (NEL), U+2028 LINE SEPARATOR and U+2029 PARAGRAPH SEPARATOR. Since: 2.34 _REGEX_MATCH_PARTIAL_SOFT: An alias for %G_REGEX_MATCH_PARTIAL. Since: 2.34 _REGEX_MATCH_PARTIAL_HARD: Turns on the partial matching feature. In contrast to to %G_REGEX_MATCH_PARTIAL_SOFT, this stops matching as soon as a partial match is found, without continuing to search for a possible complete match. See g_match_info_is_partial_match() for more information. Since: 2.34 _REGEX_MATCH_NOTEMPTY_ATSTART: Like %G_REGEX_MATCH_NOTEMPTY, but only applied to the start of the matched string. For anchored patterns this can only happen for pattern containing "\K". Since: 2.34
*/
opaque type GRegexMatchFlags = CUnsignedInt
object GRegexMatchFlags extends _BindgenEnumCUnsignedInt[GRegexMatchFlags]:
  given _tag: Tag[GRegexMatchFlags] = Tag.UInt
  inline def define(inline a: Long): GRegexMatchFlags = a.toUInt
  val G_REGEX_MATCH_DEFAULT = define(0)
  val G_REGEX_MATCH_ANCHORED = define(16)
  val G_REGEX_MATCH_NOTBOL = define(128)
  val G_REGEX_MATCH_NOTEOL = define(256)
  val G_REGEX_MATCH_NOTEMPTY = define(1024)
  val G_REGEX_MATCH_PARTIAL = define(32768)
  val G_REGEX_MATCH_NEWLINE_CR = define(1048576)
  val G_REGEX_MATCH_NEWLINE_LF = define(2097152)
  val G_REGEX_MATCH_NEWLINE_CRLF = define(3145728)
  val G_REGEX_MATCH_NEWLINE_ANY = define(4194304)
  val G_REGEX_MATCH_NEWLINE_ANYCRLF = define(5242880)
  val G_REGEX_MATCH_BSR_ANYCRLF = define(8388608)
  val G_REGEX_MATCH_BSR_ANY = define(16777216)
  val G_REGEX_MATCH_PARTIAL_SOFT = define(32768)
  val G_REGEX_MATCH_PARTIAL_HARD = define(134217728)
  val G_REGEX_MATCH_NOTEMPTY_ATSTART = define(268435456)
  def getName(value: GRegexMatchFlags): Option[String] =
    value match
      case `G_REGEX_MATCH_DEFAULT` => Some("G_REGEX_MATCH_DEFAULT")
      case `G_REGEX_MATCH_ANCHORED` => Some("G_REGEX_MATCH_ANCHORED")
      case `G_REGEX_MATCH_NOTBOL` => Some("G_REGEX_MATCH_NOTBOL")
      case `G_REGEX_MATCH_NOTEOL` => Some("G_REGEX_MATCH_NOTEOL")
      case `G_REGEX_MATCH_NOTEMPTY` => Some("G_REGEX_MATCH_NOTEMPTY")
      case `G_REGEX_MATCH_PARTIAL` => Some("G_REGEX_MATCH_PARTIAL")
      case `G_REGEX_MATCH_NEWLINE_CR` => Some("G_REGEX_MATCH_NEWLINE_CR")
      case `G_REGEX_MATCH_NEWLINE_LF` => Some("G_REGEX_MATCH_NEWLINE_LF")
      case `G_REGEX_MATCH_NEWLINE_CRLF` => Some("G_REGEX_MATCH_NEWLINE_CRLF")
      case `G_REGEX_MATCH_NEWLINE_ANY` => Some("G_REGEX_MATCH_NEWLINE_ANY")
      case `G_REGEX_MATCH_NEWLINE_ANYCRLF` => Some("G_REGEX_MATCH_NEWLINE_ANYCRLF")
      case `G_REGEX_MATCH_BSR_ANYCRLF` => Some("G_REGEX_MATCH_BSR_ANYCRLF")
      case `G_REGEX_MATCH_BSR_ANY` => Some("G_REGEX_MATCH_BSR_ANY")
      case `G_REGEX_MATCH_PARTIAL_SOFT` => Some("G_REGEX_MATCH_PARTIAL_SOFT")
      case `G_REGEX_MATCH_PARTIAL_HARD` => Some("G_REGEX_MATCH_PARTIAL_HARD")
      case `G_REGEX_MATCH_NOTEMPTY_ATSTART` => Some("G_REGEX_MATCH_NOTEMPTY_ATSTART")
      case _ => _root_.scala.None
  extension (a: GRegexMatchFlags)
    inline def &(b: GRegexMatchFlags): GRegexMatchFlags = a & b
    inline def |(b: GRegexMatchFlags): GRegexMatchFlags = a | b
    inline def is(b: GRegexMatchFlags): Boolean = (a & b) == b