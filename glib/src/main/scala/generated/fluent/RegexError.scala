package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GRegexError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Error codes returned by regular expressions functions.
  */
enum RegexError(val raw: GRegexError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Compilation of the regular expression failed.
    */
  case COMPILE extends RegexError(GRegexError.G_REGEX_ERROR_COMPILE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Optimization of the regular expression failed.
    */
  case OPTIMIZE extends RegexError(GRegexError.G_REGEX_ERROR_OPTIMIZE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Replacement failed due to an ill-formed replacement string.
    */
  case REPLACE extends RegexError(GRegexError.G_REGEX_ERROR_REPLACE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The match process failed.
    */
  case MATCH extends RegexError(GRegexError.G_REGEX_ERROR_MATCH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Internal error of the regular expression engine. Since 2.16
    */
  case INTERNAL extends RegexError(GRegexError.G_REGEX_ERROR_INTERNAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * "\\" at end of pattern. Since 2.16
    */
  case STRAY_BACKSLASH
      extends RegexError(GRegexError.G_REGEX_ERROR_STRAY_BACKSLASH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * "\\c" at end of pattern. Since 2.16
    */
  case MISSING_CONTROL_CHAR
      extends RegexError(GRegexError.G_REGEX_ERROR_MISSING_CONTROL_CHAR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unrecognized character follows "\\". Since 2.16
    */
  case UNRECOGNIZED_ESCAPE
      extends RegexError(GRegexError.G_REGEX_ERROR_UNRECOGNIZED_ESCAPE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Numbers out of order in "{}" quantifier. Since 2.16
    */
  case QUANTIFIERS_OUT_OF_ORDER
      extends RegexError(GRegexError.G_REGEX_ERROR_QUANTIFIERS_OUT_OF_ORDER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Number too big in "{}" quantifier. Since 2.16
    */
  case QUANTIFIER_TOO_BIG
      extends RegexError(GRegexError.G_REGEX_ERROR_QUANTIFIER_TOO_BIG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Missing terminating "]" for character class. Since 2.16
    */
  case UNTERMINATED_CHARACTER_CLASS
      extends RegexError(GRegexError.G_REGEX_ERROR_UNTERMINATED_CHARACTER_CLASS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Invalid escape sequence in character class. Since 2.16
    */
  case INVALID_ESCAPE_IN_CHARACTER_CLASS
      extends RegexError(
        GRegexError.G_REGEX_ERROR_INVALID_ESCAPE_IN_CHARACTER_CLASS
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Range out of order in character class. Since 2.16
    */
  case RANGE_OUT_OF_ORDER
      extends RegexError(GRegexError.G_REGEX_ERROR_RANGE_OUT_OF_ORDER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Nothing to repeat. Since 2.16
    */
  case NOTHING_TO_REPEAT
      extends RegexError(GRegexError.G_REGEX_ERROR_NOTHING_TO_REPEAT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unrecognized character after "(?", "(?<" or "(?P". Since 2.16
    */
  case UNRECOGNIZED_CHARACTER
      extends RegexError(GRegexError.G_REGEX_ERROR_UNRECOGNIZED_CHARACTER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * POSIX named classes are supported only within a class. Since 2.16
    */
  case POSIX_NAMED_CLASS_OUTSIDE_CLASS
      extends RegexError(
        GRegexError.G_REGEX_ERROR_POSIX_NAMED_CLASS_OUTSIDE_CLASS
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Missing terminating ")" or ")" without opening "(". Since 2.16
    */
  case UNMATCHED_PARENTHESIS
      extends RegexError(GRegexError.G_REGEX_ERROR_UNMATCHED_PARENTHESIS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reference to non-existent subpattern. Since 2.16
    */
  case INEXISTENT_SUBPATTERN_REFERENCE
      extends RegexError(
        GRegexError.G_REGEX_ERROR_INEXISTENT_SUBPATTERN_REFERENCE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Missing terminating ")" after comment. Since 2.16
    */
  case UNTERMINATED_COMMENT
      extends RegexError(GRegexError.G_REGEX_ERROR_UNTERMINATED_COMMENT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Regular expression too large. Since 2.16
    */
  case EXPRESSION_TOO_LARGE
      extends RegexError(GRegexError.G_REGEX_ERROR_EXPRESSION_TOO_LARGE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Failed to get memory. Since 2.16
    */
  case MEMORY_ERROR extends RegexError(GRegexError.G_REGEX_ERROR_MEMORY_ERROR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Lookbehind assertion is not fixed length. Since 2.16
    */
  case VARIABLE_LENGTH_LOOKBEHIND
      extends RegexError(GRegexError.G_REGEX_ERROR_VARIABLE_LENGTH_LOOKBEHIND)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Malformed number or name after "(?(". Since 2.16
    */
  case MALFORMED_CONDITION
      extends RegexError(GRegexError.G_REGEX_ERROR_MALFORMED_CONDITION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Conditional group contains more than two branches. Since 2.16
    */
  case TOO_MANY_CONDITIONAL_BRANCHES
      extends RegexError(
        GRegexError.G_REGEX_ERROR_TOO_MANY_CONDITIONAL_BRANCHES
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Assertion expected after "(?(". Since 2.16
    */
  case ASSERTION_EXPECTED
      extends RegexError(GRegexError.G_REGEX_ERROR_ASSERTION_EXPECTED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unknown POSIX class name. Since 2.16
    */
  case UNKNOWN_POSIX_CLASS_NAME
      extends RegexError(GRegexError.G_REGEX_ERROR_UNKNOWN_POSIX_CLASS_NAME)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * POSIX collating elements are not supported. Since 2.16
    */
  case POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED
      extends RegexError(
        GRegexError.G_REGEX_ERROR_POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Character value in "\\x{...}" sequence is too large. Since 2.16
    */
  case HEX_CODE_TOO_LARGE
      extends RegexError(GRegexError.G_REGEX_ERROR_HEX_CODE_TOO_LARGE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Invalid condition "(?(0)". Since 2.16
    */
  case INVALID_CONDITION
      extends RegexError(GRegexError.G_REGEX_ERROR_INVALID_CONDITION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * \\C not allowed in lookbehind assertion. Since 2.16
    */
  case SINGLE_BYTE_MATCH_IN_LOOKBEHIND
      extends RegexError(
        GRegexError.G_REGEX_ERROR_SINGLE_BYTE_MATCH_IN_LOOKBEHIND
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Recursive call could loop indefinitely. Since 2.16
    */
  case INFINITE_LOOP extends RegexError(GRegexError.G_REGEX_ERROR_INFINITE_LOOP)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Missing terminator in subpattern name. Since 2.16
    */
  case MISSING_SUBPATTERN_NAME_TERMINATOR
      extends RegexError(
        GRegexError.G_REGEX_ERROR_MISSING_SUBPATTERN_NAME_TERMINATOR
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Two named subpatterns have the same name. Since 2.16
    */
  case DUPLICATE_SUBPATTERN_NAME
      extends RegexError(GRegexError.G_REGEX_ERROR_DUPLICATE_SUBPATTERN_NAME)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Malformed "\\P" or "\\p" sequence. Since 2.16
    */
  case MALFORMED_PROPERTY
      extends RegexError(GRegexError.G_REGEX_ERROR_MALFORMED_PROPERTY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unknown property name after "\\P" or "\\p". Since 2.16
    */
  case UNKNOWN_PROPERTY
      extends RegexError(GRegexError.G_REGEX_ERROR_UNKNOWN_PROPERTY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Subpattern name is too long (maximum 32 characters). Since 2.16
    */
  case SUBPATTERN_NAME_TOO_LONG
      extends RegexError(GRegexError.G_REGEX_ERROR_SUBPATTERN_NAME_TOO_LONG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Too many named subpatterns (maximum 10,000). Since 2.16
    */
  case TOO_MANY_SUBPATTERNS
      extends RegexError(GRegexError.G_REGEX_ERROR_TOO_MANY_SUBPATTERNS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Octal value is greater than "\\377". Since 2.16
    */
  case INVALID_OCTAL_VALUE
      extends RegexError(GRegexError.G_REGEX_ERROR_INVALID_OCTAL_VALUE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * "DEFINE" group contains more than one branch. Since 2.16
    */
  case TOO_MANY_BRANCHES_IN_DEFINE
      extends RegexError(GRegexError.G_REGEX_ERROR_TOO_MANY_BRANCHES_IN_DEFINE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Repeating a "DEFINE" group is not allowed. This error is never raised.
    * Since: 2.16 Deprecated: 2.34
    */
  case DEFINE_REPETION
      extends RegexError(GRegexError.G_REGEX_ERROR_DEFINE_REPETION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Inconsistent newline options. Since 2.16
    */
  case INCONSISTENT_NEWLINE_OPTIONS
      extends RegexError(GRegexError.G_REGEX_ERROR_INCONSISTENT_NEWLINE_OPTIONS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * "\\g" is not followed by a braced, angle-bracketed, or quoted name or
    * number, or by a plain number. Since: 2.16
    */
  case MISSING_BACK_REFERENCE
      extends RegexError(GRegexError.G_REGEX_ERROR_MISSING_BACK_REFERENCE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * relative reference must not be zero. Since: 2.34
    */
  case INVALID_RELATIVE_REFERENCE
      extends RegexError(GRegexError.G_REGEX_ERROR_INVALID_RELATIVE_REFERENCE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the backtracing control verb used does not allow an argument. Since: 2.34
    */
  case BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN
      extends RegexError(
        GRegexError.G_REGEX_ERROR_BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * unknown backtracing control verb. Since: 2.34
    */
  case UNKNOWN_BACKTRACKING_CONTROL_VERB
      extends RegexError(
        GRegexError.G_REGEX_ERROR_UNKNOWN_BACKTRACKING_CONTROL_VERB
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * number is too big in escape sequence. Since: 2.34
    */
  case NUMBER_TOO_BIG
      extends RegexError(GRegexError.G_REGEX_ERROR_NUMBER_TOO_BIG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Missing subpattern name. Since: 2.34
    */
  case MISSING_SUBPATTERN_NAME
      extends RegexError(GRegexError.G_REGEX_ERROR_MISSING_SUBPATTERN_NAME)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Missing digit. Since 2.34
    */
  case MISSING_DIGIT extends RegexError(GRegexError.G_REGEX_ERROR_MISSING_DIGIT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * In JavaScript compatibility mode, "[" is an invalid data character. Since:
    * 2.34
    */
  case INVALID_DATA_CHARACTER
      extends RegexError(GRegexError.G_REGEX_ERROR_INVALID_DATA_CHARACTER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * different names for subpatterns of the same number are not allowed. Since:
    * 2.34
    */
  case EXTRA_SUBPATTERN_NAME
      extends RegexError(GRegexError.G_REGEX_ERROR_EXTRA_SUBPATTERN_NAME)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the backtracing control verb requires an argument. Since: 2.34
    */
  case BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED
      extends RegexError(
        GRegexError.G_REGEX_ERROR_BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * "\\c" must be followed by an ASCII character. Since: 2.34
    */
  case INVALID_CONTROL_CHAR
      extends RegexError(GRegexError.G_REGEX_ERROR_INVALID_CONTROL_CHAR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * "\\k" is not followed by a braced, angle-bracketed, or quoted name. Since:
    * 2.34
    */
  case MISSING_NAME extends RegexError(GRegexError.G_REGEX_ERROR_MISSING_NAME)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * "\\N" is not supported in a class. Since: 2.34
    */
  case NOT_SUPPORTED_IN_CLASS
      extends RegexError(GRegexError.G_REGEX_ERROR_NOT_SUPPORTED_IN_CLASS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * too many forward references. Since: 2.34
    */
  case TOO_MANY_FORWARD_REFERENCES
      extends RegexError(GRegexError.G_REGEX_ERROR_TOO_MANY_FORWARD_REFERENCES)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the name is too long in "(*MARK)", "(*PRUNE)", "(*SKIP)", or "(*THEN)".
    * Since: 2.34
    */
  case NAME_TOO_LONG extends RegexError(GRegexError.G_REGEX_ERROR_NAME_TOO_LONG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the character value in the \\u sequence is too large. Since: 2.34
    */
  case CHARACTER_VALUE_TOO_LARGE
      extends RegexError(GRegexError.G_REGEX_ERROR_CHARACTER_VALUE_TOO_LARGE)
end RegexError

object RegexError:
  def fromRaw(raw: GRegexError): RegexError =
    raw match
      case GRegexError.G_REGEX_ERROR_COMPILE         => RegexError.COMPILE
      case GRegexError.G_REGEX_ERROR_OPTIMIZE        => RegexError.OPTIMIZE
      case GRegexError.G_REGEX_ERROR_REPLACE         => RegexError.REPLACE
      case GRegexError.G_REGEX_ERROR_MATCH           => RegexError.MATCH
      case GRegexError.G_REGEX_ERROR_INTERNAL        => RegexError.INTERNAL
      case GRegexError.G_REGEX_ERROR_STRAY_BACKSLASH =>
        RegexError.STRAY_BACKSLASH
      case GRegexError.G_REGEX_ERROR_MISSING_CONTROL_CHAR =>
        RegexError.MISSING_CONTROL_CHAR
      case GRegexError.G_REGEX_ERROR_UNRECOGNIZED_ESCAPE =>
        RegexError.UNRECOGNIZED_ESCAPE
      case GRegexError.G_REGEX_ERROR_QUANTIFIERS_OUT_OF_ORDER =>
        RegexError.QUANTIFIERS_OUT_OF_ORDER
      case GRegexError.G_REGEX_ERROR_QUANTIFIER_TOO_BIG =>
        RegexError.QUANTIFIER_TOO_BIG
      case GRegexError.G_REGEX_ERROR_UNTERMINATED_CHARACTER_CLASS =>
        RegexError.UNTERMINATED_CHARACTER_CLASS
      case GRegexError.G_REGEX_ERROR_INVALID_ESCAPE_IN_CHARACTER_CLASS =>
        RegexError.INVALID_ESCAPE_IN_CHARACTER_CLASS
      case GRegexError.G_REGEX_ERROR_RANGE_OUT_OF_ORDER =>
        RegexError.RANGE_OUT_OF_ORDER
      case GRegexError.G_REGEX_ERROR_NOTHING_TO_REPEAT =>
        RegexError.NOTHING_TO_REPEAT
      case GRegexError.G_REGEX_ERROR_UNRECOGNIZED_CHARACTER =>
        RegexError.UNRECOGNIZED_CHARACTER
      case GRegexError.G_REGEX_ERROR_POSIX_NAMED_CLASS_OUTSIDE_CLASS =>
        RegexError.POSIX_NAMED_CLASS_OUTSIDE_CLASS
      case GRegexError.G_REGEX_ERROR_UNMATCHED_PARENTHESIS =>
        RegexError.UNMATCHED_PARENTHESIS
      case GRegexError.G_REGEX_ERROR_INEXISTENT_SUBPATTERN_REFERENCE =>
        RegexError.INEXISTENT_SUBPATTERN_REFERENCE
      case GRegexError.G_REGEX_ERROR_UNTERMINATED_COMMENT =>
        RegexError.UNTERMINATED_COMMENT
      case GRegexError.G_REGEX_ERROR_EXPRESSION_TOO_LARGE =>
        RegexError.EXPRESSION_TOO_LARGE
      case GRegexError.G_REGEX_ERROR_MEMORY_ERROR => RegexError.MEMORY_ERROR
      case GRegexError.G_REGEX_ERROR_VARIABLE_LENGTH_LOOKBEHIND =>
        RegexError.VARIABLE_LENGTH_LOOKBEHIND
      case GRegexError.G_REGEX_ERROR_MALFORMED_CONDITION =>
        RegexError.MALFORMED_CONDITION
      case GRegexError.G_REGEX_ERROR_TOO_MANY_CONDITIONAL_BRANCHES =>
        RegexError.TOO_MANY_CONDITIONAL_BRANCHES
      case GRegexError.G_REGEX_ERROR_ASSERTION_EXPECTED =>
        RegexError.ASSERTION_EXPECTED
      case GRegexError.G_REGEX_ERROR_UNKNOWN_POSIX_CLASS_NAME =>
        RegexError.UNKNOWN_POSIX_CLASS_NAME
      case GRegexError.G_REGEX_ERROR_POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED =>
        RegexError.POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED
      case GRegexError.G_REGEX_ERROR_HEX_CODE_TOO_LARGE =>
        RegexError.HEX_CODE_TOO_LARGE
      case GRegexError.G_REGEX_ERROR_INVALID_CONDITION =>
        RegexError.INVALID_CONDITION
      case GRegexError.G_REGEX_ERROR_SINGLE_BYTE_MATCH_IN_LOOKBEHIND =>
        RegexError.SINGLE_BYTE_MATCH_IN_LOOKBEHIND
      case GRegexError.G_REGEX_ERROR_INFINITE_LOOP => RegexError.INFINITE_LOOP
      case GRegexError.G_REGEX_ERROR_MISSING_SUBPATTERN_NAME_TERMINATOR =>
        RegexError.MISSING_SUBPATTERN_NAME_TERMINATOR
      case GRegexError.G_REGEX_ERROR_DUPLICATE_SUBPATTERN_NAME =>
        RegexError.DUPLICATE_SUBPATTERN_NAME
      case GRegexError.G_REGEX_ERROR_MALFORMED_PROPERTY =>
        RegexError.MALFORMED_PROPERTY
      case GRegexError.G_REGEX_ERROR_UNKNOWN_PROPERTY =>
        RegexError.UNKNOWN_PROPERTY
      case GRegexError.G_REGEX_ERROR_SUBPATTERN_NAME_TOO_LONG =>
        RegexError.SUBPATTERN_NAME_TOO_LONG
      case GRegexError.G_REGEX_ERROR_TOO_MANY_SUBPATTERNS =>
        RegexError.TOO_MANY_SUBPATTERNS
      case GRegexError.G_REGEX_ERROR_INVALID_OCTAL_VALUE =>
        RegexError.INVALID_OCTAL_VALUE
      case GRegexError.G_REGEX_ERROR_TOO_MANY_BRANCHES_IN_DEFINE =>
        RegexError.TOO_MANY_BRANCHES_IN_DEFINE
      case GRegexError.G_REGEX_ERROR_DEFINE_REPETION =>
        RegexError.DEFINE_REPETION
      case GRegexError.G_REGEX_ERROR_INCONSISTENT_NEWLINE_OPTIONS =>
        RegexError.INCONSISTENT_NEWLINE_OPTIONS
      case GRegexError.G_REGEX_ERROR_MISSING_BACK_REFERENCE =>
        RegexError.MISSING_BACK_REFERENCE
      case GRegexError.G_REGEX_ERROR_INVALID_RELATIVE_REFERENCE =>
        RegexError.INVALID_RELATIVE_REFERENCE
      case GRegexError.G_REGEX_ERROR_BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN =>
        RegexError.BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN
      case GRegexError.G_REGEX_ERROR_UNKNOWN_BACKTRACKING_CONTROL_VERB =>
        RegexError.UNKNOWN_BACKTRACKING_CONTROL_VERB
      case GRegexError.G_REGEX_ERROR_NUMBER_TOO_BIG => RegexError.NUMBER_TOO_BIG
      case GRegexError.G_REGEX_ERROR_MISSING_SUBPATTERN_NAME =>
        RegexError.MISSING_SUBPATTERN_NAME
      case GRegexError.G_REGEX_ERROR_MISSING_DIGIT => RegexError.MISSING_DIGIT
      case GRegexError.G_REGEX_ERROR_INVALID_DATA_CHARACTER =>
        RegexError.INVALID_DATA_CHARACTER
      case GRegexError.G_REGEX_ERROR_EXTRA_SUBPATTERN_NAME =>
        RegexError.EXTRA_SUBPATTERN_NAME
      case GRegexError.G_REGEX_ERROR_BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED =>
        RegexError.BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED
      case GRegexError.G_REGEX_ERROR_INVALID_CONTROL_CHAR =>
        RegexError.INVALID_CONTROL_CHAR
      case GRegexError.G_REGEX_ERROR_MISSING_NAME => RegexError.MISSING_NAME
      case GRegexError.G_REGEX_ERROR_NOT_SUPPORTED_IN_CLASS =>
        RegexError.NOT_SUPPORTED_IN_CLASS
      case GRegexError.G_REGEX_ERROR_TOO_MANY_FORWARD_REFERENCES =>
        RegexError.TOO_MANY_FORWARD_REFERENCES
      case GRegexError.G_REGEX_ERROR_NAME_TOO_LONG => RegexError.NAME_TOO_LONG
      case GRegexError.G_REGEX_ERROR_CHARACTER_VALUE_TOO_LARGE =>
        RegexError.CHARACTER_VALUE_TOO_LARGE
  end fromRaw
end RegexError
