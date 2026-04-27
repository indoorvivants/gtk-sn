package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GRegexCompileFlags: _REGEX_DEFAULT: No special options set. Since: 2.74 _REGEX_CASELESS: Letters in the pattern match both upper- and lowercase letters. This option can be changed within a pattern by a "(?i)" option setting. _REGEX_MULTILINE: By default, GRegex treats the strings as consisting of a single line of characters (even if it actually contains newlines). The "start of line" metacharacter ("^") matches only at the start of the string, while the "end of line" metacharacter ("$") matches only at the end of the string, or before a terminating newline (unless %G_REGEX_DOLLAR_ENDONLY is set). When %G_REGEX_MULTILINE is set, the "start of line" and "end of line" constructs match immediately following or immediately before any newline in the string, respectively, as well as at the very start and end. This can be changed within a pattern by a "(?m)" option setting. _REGEX_DOTALL: A dot metacharacter (".") in the pattern matches all characters, including newlines. Without it, newlines are excluded. This option can be changed within a pattern by a ("?s") option setting. _REGEX_EXTENDED: Whitespace data characters in the pattern are totally ignored except when escaped or inside a character class. Whitespace does not include the VT character (code 11). In addition, characters between an unescaped "#" outside a character class and the next newline character, inclusive, are also ignored. This can be changed within a pattern by a "(?x)" option setting. _REGEX_ANCHORED: The pattern is forced to be "anchored", that is, it is constrained to match only at the first matching point in the string that is being searched. This effect can also be achieved by appropriate constructs in the pattern itself such as the "^" metacharacter. _REGEX_DOLLAR_ENDONLY: A dollar metacharacter ("$") in the pattern matches only at the end of the string. Without this option, a dollar also matches immediately before the final character if it is a newline (but not before any other newlines). This option is ignored if %G_REGEX_MULTILINE is set. _REGEX_UNGREEDY: Inverts the "greediness" of the quantifiers so that they are not greedy by default, but become greedy if followed by "?". It can also be set by a "(?U)" option setting within the pattern. _REGEX_RAW: Usually strings must be valid UTF-8 strings, using this flag they are considered as a raw sequence of bytes. _REGEX_NO_AUTO_CAPTURE: Disables the use of numbered capturing parentheses in the pattern. Any opening parenthesis that is not followed by "?" behaves as if it were followed by "?:" but named parentheses can still be used for capturing (and they acquire numbers in the usual way). _REGEX_OPTIMIZE: Since 2.74 and the port to pcre2, requests JIT compilation, which, if the just-in-time compiler is available, further processes a compiled pattern into machine code that executes much faster. However, it comes at the cost of extra processing before the match is performed, so it is most beneficial to use this when the same compiled pattern is used for matching many times. Before 2.74 this option used the built-in non-JIT optimizations in pcre1. _REGEX_FIRSTLINE: Limits an unanchored pattern to match before (or at) the first newline. Since: 2.34 _REGEX_DUPNAMES: Names used to identify capturing subpatterns need not be unique. This can be helpful for certain types of pattern when it is known that only one instance of the named subpattern can ever be matched. _REGEX_NEWLINE_CR: Usually any newline character or character sequence is recognized. If this option is set, the only recognized newline character is ''. _REGEX_NEWLINE_LF: Usually any newline character or character sequence is recognized. If this option is set, the only recognized newline character is ''. _REGEX_NEWLINE_CRLF: Usually any newline character or character sequence is recognized. If this option is set, the only recognized newline character sequence is ''. _REGEX_NEWLINE_ANYCRLF: Usually any newline character or character sequence is recognized. If this option is set, the only recognized newline character sequences are '', '', and ''. Since: 2.34 _REGEX_BSR_ANYCRLF: Usually any newline character or character sequence is recognised. If this option is set, then "\R" only recognizes the newline characters '', '' and ''. Since: 2.34 _REGEX_JAVASCRIPT_COMPAT: Changes behaviour so that it is compatible with JavaScript rather than PCRE. Since GLib 2.74 this is no longer supported, as libpcre2 does not support it. Since: 2.34 Deprecated: 2.74
*/
opaque type GRegexCompileFlags = CUnsignedInt
object GRegexCompileFlags extends _BindgenEnumCUnsignedInt[GRegexCompileFlags]:
  given _tag: Tag[GRegexCompileFlags] = Tag.UInt
  inline def define(inline a: Long): GRegexCompileFlags = a.toUInt
  val G_REGEX_DEFAULT = define(0)
  val G_REGEX_CASELESS = define(1)
  val G_REGEX_MULTILINE = define(2)
  val G_REGEX_DOTALL = define(4)
  val G_REGEX_EXTENDED = define(8)
  val G_REGEX_ANCHORED = define(16)
  val G_REGEX_DOLLAR_ENDONLY = define(32)
  val G_REGEX_UNGREEDY = define(512)
  val G_REGEX_RAW = define(2048)
  val G_REGEX_NO_AUTO_CAPTURE = define(4096)
  val G_REGEX_OPTIMIZE = define(8192)
  val G_REGEX_FIRSTLINE = define(262144)
  val G_REGEX_DUPNAMES = define(524288)
  val G_REGEX_NEWLINE_CR = define(1048576)
  val G_REGEX_NEWLINE_LF = define(2097152)
  val G_REGEX_NEWLINE_CRLF = define(3145728)
  val G_REGEX_NEWLINE_ANYCRLF = define(5242880)
  val G_REGEX_BSR_ANYCRLF = define(8388608)
  val G_REGEX_JAVASCRIPT_COMPAT = define(33554432)
  def getName(value: GRegexCompileFlags): Option[String] =
    value match
      case `G_REGEX_DEFAULT` => Some("G_REGEX_DEFAULT")
      case `G_REGEX_CASELESS` => Some("G_REGEX_CASELESS")
      case `G_REGEX_MULTILINE` => Some("G_REGEX_MULTILINE")
      case `G_REGEX_DOTALL` => Some("G_REGEX_DOTALL")
      case `G_REGEX_EXTENDED` => Some("G_REGEX_EXTENDED")
      case `G_REGEX_ANCHORED` => Some("G_REGEX_ANCHORED")
      case `G_REGEX_DOLLAR_ENDONLY` => Some("G_REGEX_DOLLAR_ENDONLY")
      case `G_REGEX_UNGREEDY` => Some("G_REGEX_UNGREEDY")
      case `G_REGEX_RAW` => Some("G_REGEX_RAW")
      case `G_REGEX_NO_AUTO_CAPTURE` => Some("G_REGEX_NO_AUTO_CAPTURE")
      case `G_REGEX_OPTIMIZE` => Some("G_REGEX_OPTIMIZE")
      case `G_REGEX_FIRSTLINE` => Some("G_REGEX_FIRSTLINE")
      case `G_REGEX_DUPNAMES` => Some("G_REGEX_DUPNAMES")
      case `G_REGEX_NEWLINE_CR` => Some("G_REGEX_NEWLINE_CR")
      case `G_REGEX_NEWLINE_LF` => Some("G_REGEX_NEWLINE_LF")
      case `G_REGEX_NEWLINE_CRLF` => Some("G_REGEX_NEWLINE_CRLF")
      case `G_REGEX_NEWLINE_ANYCRLF` => Some("G_REGEX_NEWLINE_ANYCRLF")
      case `G_REGEX_BSR_ANYCRLF` => Some("G_REGEX_BSR_ANYCRLF")
      case `G_REGEX_JAVASCRIPT_COMPAT` => Some("G_REGEX_JAVASCRIPT_COMPAT")
      case _ => _root_.scala.None
  extension (a: GRegexCompileFlags)
    inline def &(b: GRegexCompileFlags): GRegexCompileFlags = a & b
    inline def |(b: GRegexCompileFlags): GRegexCompileFlags = a | b
    inline def is(b: GRegexCompileFlags): Boolean = (a & b) == b