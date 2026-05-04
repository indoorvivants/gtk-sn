package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GRegexCompileFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags specifying compile-time options.
  */
class RegexCompileFlags private (val raw: GRegexCompileFlags):
  def is(kv: RegexCompileFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[RegexCompileFlags.KnownValue]
    RegexCompileFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"RegexCompileFlags(${sb.result().mkString(", ")})"
end RegexCompileFlags

object RegexCompileFlags:
  export KnownValue.*

  def fromRaw(raw: GRegexCompileFlags) = new RegexCompileFlags(raw)

  extension (af: RegexCompileFlags)
    def &(other: RegexCompileFlags) =
      RegexCompileFlags(af.raw & other.raw)
    def |(other: RegexCompileFlags) =
      RegexCompileFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags specifying compile-time options.
    */
  enum KnownValue(override val raw: GRegexCompileFlags, name: String)
      extends RegexCompileFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No special options set. Since: 2.74
      */
    case DEFAULT
        extends KnownValue(GRegexCompileFlags.G_REGEX_DEFAULT, "DEFAULT")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Letters in the pattern match both upper- and lowercase letters. This
      * option can be changed within a pattern by a "(?i)" option setting.
      */
    case CASELESS
        extends KnownValue(GRegexCompileFlags.G_REGEX_CASELESS, "CASELESS")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * By default, GRegex treats the strings as consisting of a single line of
      * characters (even if it actually contains newlines). The "start of line"
      * metacharacter ("^") matches only at the start of the string, while the
      * "end of line" metacharacter ("$") matches only at the end of the string,
      * or before a terminating newline (unless %G_REGEX_DOLLAR_ENDONLY is set).
      * When %G_REGEX_MULTILINE is set, the "start of line" and "end of line"
      * constructs match immediately following or immediately before any newline
      * in the string, respectively, as well as at the very start and end. This
      * can be changed within a pattern by a "(?m)" option setting.
      */
    case MULTILINE
        extends KnownValue(GRegexCompileFlags.G_REGEX_MULTILINE, "MULTILINE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * A dot metacharacter (".") in the pattern matches all characters,
      * including newlines. Without it, newlines are excluded. This option can
      * be changed within a pattern by a ("?s") option setting.
      */
    case DOTALL extends KnownValue(GRegexCompileFlags.G_REGEX_DOTALL, "DOTALL")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Whitespace data characters in the pattern are totally ignored except
      * when escaped or inside a character class. Whitespace does not include
      * the VT character (code 11). In addition, characters between an unescaped
      * "#" outside a character class and the next newline character, inclusive,
      * are also ignored. This can be changed within a pattern by a "(?x)"
      * option setting.
      */
    case EXTENDED
        extends KnownValue(GRegexCompileFlags.G_REGEX_EXTENDED, "EXTENDED")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The pattern is forced to be "anchored", that is, it is constrained to
      * match only at the first matching point in the string that is being
      * searched. This effect can also be achieved by appropriate constructs in
      * the pattern itself such as the "^" metacharacter.
      */
    case ANCHORED
        extends KnownValue(GRegexCompileFlags.G_REGEX_ANCHORED, "ANCHORED")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * A dollar metacharacter ("$") in the pattern matches only at the end of
      * the string. Without this option, a dollar also matches immediately
      * before the final character if it is a newline (but not before any other
      * newlines). This option is ignored if %G_REGEX_MULTILINE is set.
      */
    case DOLLAR_ENDONLY
        extends KnownValue(
          GRegexCompileFlags.G_REGEX_DOLLAR_ENDONLY,
          "DOLLAR_ENDONLY"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Inverts the "greediness" of the quantifiers so that they are not greedy
      * by default, but become greedy if followed by "?". It can also be set by
      * a "(?U)" option setting within the pattern.
      */
    case UNGREEDY
        extends KnownValue(GRegexCompileFlags.G_REGEX_UNGREEDY, "UNGREEDY")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Usually strings must be valid UTF-8 strings, using this flag they are
      * considered as a raw sequence of bytes.
      */
    case RAW extends KnownValue(GRegexCompileFlags.G_REGEX_RAW, "RAW")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Disables the use of numbered capturing parentheses in the pattern. Any
      * opening parenthesis that is not followed by "?" behaves as if it were
      * followed by "?:" but named parentheses can still be used for capturing
      * (and they acquire numbers in the usual way).
      */
    case NO_AUTO_CAPTURE
        extends KnownValue(
          GRegexCompileFlags.G_REGEX_NO_AUTO_CAPTURE,
          "NO_AUTO_CAPTURE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Since 2.74 and the port to pcre2, requests JIT compilation, which, if
      * the just-in-time compiler is available, further processes a compiled
      * pattern into machine code that executes much faster. However, it comes
      * at the cost of extra processing before the match is performed, so it is
      * most beneficial to use this when the same compiled pattern is used for
      * matching many times. Before 2.74 this option used the built-in non-JIT
      * optimizations in pcre1.
      */
    case OPTIMIZE
        extends KnownValue(GRegexCompileFlags.G_REGEX_OPTIMIZE, "OPTIMIZE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Limits an unanchored pattern to match before (or at) the first newline.
      * Since: 2.34
      */
    case FIRSTLINE
        extends KnownValue(GRegexCompileFlags.G_REGEX_FIRSTLINE, "FIRSTLINE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Names used to identify capturing subpatterns need not be unique. This
      * can be helpful for certain types of pattern when it is known that only
      * one instance of the named subpattern can ever be matched.
      */
    case DUPNAMES
        extends KnownValue(GRegexCompileFlags.G_REGEX_DUPNAMES, "DUPNAMES")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Usually any newline character or character sequence is recognized. If
      * this option is set, the only recognized newline character is '\r'.
      */
    case NEWLINE_CR
        extends KnownValue(GRegexCompileFlags.G_REGEX_NEWLINE_CR, "NEWLINE_CR")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Usually any newline character or character sequence is recognized. If
      * this option is set, the only recognized newline character is '\n'.
      */
    case NEWLINE_LF
        extends KnownValue(GRegexCompileFlags.G_REGEX_NEWLINE_LF, "NEWLINE_LF")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Usually any newline character or character sequence is recognized. If
      * this option is set, the only recognized newline character sequence is
      * '\r\n'.
      */
    case NEWLINE_CRLF
        extends KnownValue(
          GRegexCompileFlags.G_REGEX_NEWLINE_CRLF,
          "NEWLINE_CRLF"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Usually any newline character or character sequence is recognized. If
      * this option is set, the only recognized newline character sequences are
      * '\r', '\n', and '\r\n'. Since: 2.34
      */
    case NEWLINE_ANYCRLF
        extends KnownValue(
          GRegexCompileFlags.G_REGEX_NEWLINE_ANYCRLF,
          "NEWLINE_ANYCRLF"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Usually any newline character or character sequence is recognised. If
      * this option is set, then "\R" only recognizes the newline characters
      * '\r', '\n' and '\r\n'. Since: 2.34
      */
    case BSR_ANYCRLF
        extends KnownValue(
          GRegexCompileFlags.G_REGEX_BSR_ANYCRLF,
          "BSR_ANYCRLF"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Changes behaviour so that it is compatible with JavaScript rather than
      * PCRE. Since GLib 2.74 this is no longer supported, as libpcre2 does not
      * support it. Since: 2.34 Deprecated: 2.74
      */
    case JAVASCRIPT_COMPAT
        extends KnownValue(
          GRegexCompileFlags.G_REGEX_JAVASCRIPT_COMPAT,
          "JAVASCRIPT_COMPAT"
        )
  end KnownValue
end RegexCompileFlags
