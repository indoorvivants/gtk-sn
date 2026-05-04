package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GRegexMatchFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags specifying match-time options.
  */
class RegexMatchFlags private (val raw: GRegexMatchFlags):
  def is(kv: RegexMatchFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[RegexMatchFlags.KnownValue]
    RegexMatchFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"RegexMatchFlags(${sb.result().mkString(", ")})"
end RegexMatchFlags

object RegexMatchFlags:
  export KnownValue.*

  def fromRaw(raw: GRegexMatchFlags) = new RegexMatchFlags(raw)

  extension (af: RegexMatchFlags)
    def &(other: RegexMatchFlags) =
      RegexMatchFlags(af.raw & other.raw)
    def |(other: RegexMatchFlags) =
      RegexMatchFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags specifying match-time options.
    */
  enum KnownValue(override val raw: GRegexMatchFlags, name: String)
      extends RegexMatchFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No special options set. Since: 2.74
      */
    case DEFAULT
        extends KnownValue(GRegexMatchFlags.G_REGEX_MATCH_DEFAULT, "DEFAULT")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The pattern is forced to be "anchored", that is, it is constrained to
      * match only at the first matching point in the string that is being
      * searched. This effect can also be achieved by appropriate constructs in
      * the pattern itself such as the "^" metacharacter.
      */
    case ANCHORED
        extends KnownValue(GRegexMatchFlags.G_REGEX_MATCH_ANCHORED, "ANCHORED")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Specifies that first character of the string is not the beginning of a
      * line, so the circumflex metacharacter should not match before it.
      * Setting this without %G_REGEX_MULTILINE (at compile time) causes
      * circumflex never to match. This option affects only the behaviour of the
      * circumflex metacharacter, it does not affect "\A".
      */
    case NOTBOL
        extends KnownValue(GRegexMatchFlags.G_REGEX_MATCH_NOTBOL, "NOTBOL")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Specifies that the end of the subject string is not the end of a line,
      * so the dollar metacharacter should not match it nor (except in multiline
      * mode) a newline immediately before it. Setting this without
      * %G_REGEX_MULTILINE (at compile time) causes dollar never to match. This
      * option affects only the behaviour of the dollar metacharacter, it does
      * not affect "\Z" or "\z".
      */
    case NOTEOL
        extends KnownValue(GRegexMatchFlags.G_REGEX_MATCH_NOTEOL, "NOTEOL")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * An empty string is not considered to be a valid match if this option is
      * set. If there are alternatives in the pattern, they are tried. If all
      * the alternatives match the empty string, the entire match fails. For
      * example, if the pattern "a?b?" is applied to a string not beginning with
      * "a" or "b", it matches the empty string at the start of the string. With
      * this flag set, this match is not valid, so GRegex searches further into
      * the string for occurrences of "a" or "b".
      */
    case NOTEMPTY
        extends KnownValue(GRegexMatchFlags.G_REGEX_MATCH_NOTEMPTY, "NOTEMPTY")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Turns on the partial matching feature, for more documentation on partial
      * matching see g_match_info_is_partial_match().
      */
    case PARTIAL
        extends KnownValue(GRegexMatchFlags.G_REGEX_MATCH_PARTIAL, "PARTIAL")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Overrides the newline definition set when creating a new #GRegex,
      * setting the '\r' character as line terminator.
      */
    case NEWLINE_CR
        extends KnownValue(
          GRegexMatchFlags.G_REGEX_MATCH_NEWLINE_CR,
          "NEWLINE_CR"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Overrides the newline definition set when creating a new #GRegex,
      * setting the '\n' character as line terminator.
      */
    case NEWLINE_LF
        extends KnownValue(
          GRegexMatchFlags.G_REGEX_MATCH_NEWLINE_LF,
          "NEWLINE_LF"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Overrides the newline definition set when creating a new #GRegex,
      * setting the '\r\n' characters sequence as line terminator.
      */
    case NEWLINE_CRLF
        extends KnownValue(
          GRegexMatchFlags.G_REGEX_MATCH_NEWLINE_CRLF,
          "NEWLINE_CRLF"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Overrides the newline definition set when creating a new #GRegex, any
      * Unicode newline sequence is recognised as a newline. These are '\r',
      * '\n' and '\rn', and the single characters U+000B LINE TABULATION, U+000C
      * FORM FEED (FF), U+0085 NEXT LINE (NEL), U+2028 LINE SEPARATOR and U+2029
      * PARAGRAPH SEPARATOR.
      */
    case NEWLINE_ANY
        extends KnownValue(
          GRegexMatchFlags.G_REGEX_MATCH_NEWLINE_ANY,
          "NEWLINE_ANY"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Overrides the newline definition set when creating a new #GRegex; any
      * '\r', '\n', or '\r\n' character sequence is recognized as a newline.
      * Since: 2.34
      */
    case NEWLINE_ANYCRLF
        extends KnownValue(
          GRegexMatchFlags.G_REGEX_MATCH_NEWLINE_ANYCRLF,
          "NEWLINE_ANYCRLF"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Overrides the newline definition for "\R" set when creating a new
      * #GRegex; only '\r', '\n', or '\r\n' character sequences are recognized
      * as a newline by "\R". Since: 2.34
      */
    case BSR_ANYCRLF
        extends KnownValue(
          GRegexMatchFlags.G_REGEX_MATCH_BSR_ANYCRLF,
          "BSR_ANYCRLF"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Overrides the newline definition for "\R" set when creating a new
      * #GRegex; any Unicode newline character or character sequence are
      * recognized as a newline by "\R". These are '\r', '\n' and '\rn', and the
      * single characters U+000B LINE TABULATION, U+000C FORM FEED (FF), U+0085
      * NEXT LINE (NEL), U+2028 LINE SEPARATOR and U+2029 PARAGRAPH SEPARATOR.
      * Since: 2.34
      */
    case BSR_ANY
        extends KnownValue(GRegexMatchFlags.G_REGEX_MATCH_BSR_ANY, "BSR_ANY")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * An alias for %G_REGEX_MATCH_PARTIAL. Since: 2.34
      */
    case PARTIAL_SOFT
        extends KnownValue(
          GRegexMatchFlags.G_REGEX_MATCH_PARTIAL_SOFT,
          "PARTIAL_SOFT"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Turns on the partial matching feature. In contrast to to
      * %G_REGEX_MATCH_PARTIAL_SOFT, this stops matching as soon as a partial
      * match is found, without continuing to search for a possible complete
      * match. See g_match_info_is_partial_match() for more information. Since:
      * 2.34
      */
    case PARTIAL_HARD
        extends KnownValue(
          GRegexMatchFlags.G_REGEX_MATCH_PARTIAL_HARD,
          "PARTIAL_HARD"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Like %G_REGEX_MATCH_NOTEMPTY, but only applied to the start of the
      * matched string. For anchored patterns this can only happen for pattern
      * containing "\K". Since: 2.34
      */
    case NOTEMPTY_ATSTART
        extends KnownValue(
          GRegexMatchFlags.G_REGEX_MATCH_NOTEMPTY_ATSTART,
          "NOTEMPTY_ATSTART"
        )
  end KnownValue
end RegexMatchFlags
