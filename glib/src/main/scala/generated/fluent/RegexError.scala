package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GRegexError

/** Error codes returned by regular expressions functions.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum RegexError(val raw: GRegexError):
  /** Compilation of the regular expression failed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case COMPILE extends RegexError(GRegexError.G_REGEX_ERROR_COMPILE)

  /** Optimization of the regular expression failed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OPTIMIZE extends RegexError(GRegexError.G_REGEX_ERROR_OPTIMIZE)

  /** Replacement failed due to an ill-formed replacement string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case REPLACE extends RegexError(GRegexError.G_REGEX_ERROR_REPLACE)

  /** The match process failed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MATCH extends RegexError(GRegexError.G_REGEX_ERROR_MATCH)

  /** Internal error of the regular expression engine. Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INTERNAL extends RegexError(GRegexError.G_REGEX_ERROR_INTERNAL)

  /** "\\" at end of pattern. Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STRAY_BACKSLASH
      extends RegexError(GRegexError.G_REGEX_ERROR_STRAY_BACKSLASH)

  /** "\\c" at end of pattern. Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MISSING_CONTROL_CHAR
      extends RegexError(GRegexError.G_REGEX_ERROR_MISSING_CONTROL_CHAR)

  /** Unrecognized character follows "\\". Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNRECOGNIZED_ESCAPE
      extends RegexError(GRegexError.G_REGEX_ERROR_UNRECOGNIZED_ESCAPE)

  /** Numbers out of order in "{}" quantifier. Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case QUANTIFIERS_OUT_OF_ORDER
      extends RegexError(GRegexError.G_REGEX_ERROR_QUANTIFIERS_OUT_OF_ORDER)

  /** Number too big in "{}" quantifier. Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case QUANTIFIER_TOO_BIG
      extends RegexError(GRegexError.G_REGEX_ERROR_QUANTIFIER_TOO_BIG)

  /** Missing terminating "]" for character class. Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNTERMINATED_CHARACTER_CLASS
      extends RegexError(GRegexError.G_REGEX_ERROR_UNTERMINATED_CHARACTER_CLASS)

  /** Invalid escape sequence in character class. Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_ESCAPE_IN_CHARACTER_CLASS
      extends RegexError(
        GRegexError.G_REGEX_ERROR_INVALID_ESCAPE_IN_CHARACTER_CLASS
      )

  /** Range out of order in character class. Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RANGE_OUT_OF_ORDER
      extends RegexError(GRegexError.G_REGEX_ERROR_RANGE_OUT_OF_ORDER)

  /** Nothing to repeat. Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOTHING_TO_REPEAT
      extends RegexError(GRegexError.G_REGEX_ERROR_NOTHING_TO_REPEAT)

  /** Unrecognized character after "(?", "(?<" or "(?P". Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNRECOGNIZED_CHARACTER
      extends RegexError(GRegexError.G_REGEX_ERROR_UNRECOGNIZED_CHARACTER)

  /** POSIX named classes are supported only within a class. Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case POSIX_NAMED_CLASS_OUTSIDE_CLASS
      extends RegexError(
        GRegexError.G_REGEX_ERROR_POSIX_NAMED_CLASS_OUTSIDE_CLASS
      )

  /** Missing terminating ")" or ")" without opening "(". Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNMATCHED_PARENTHESIS
      extends RegexError(GRegexError.G_REGEX_ERROR_UNMATCHED_PARENTHESIS)

  /** Reference to non-existent subpattern. Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INEXISTENT_SUBPATTERN_REFERENCE
      extends RegexError(
        GRegexError.G_REGEX_ERROR_INEXISTENT_SUBPATTERN_REFERENCE
      )

  /** Missing terminating ")" after comment. Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNTERMINATED_COMMENT
      extends RegexError(GRegexError.G_REGEX_ERROR_UNTERMINATED_COMMENT)

  /** Regular expression too large. Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EXPRESSION_TOO_LARGE
      extends RegexError(GRegexError.G_REGEX_ERROR_EXPRESSION_TOO_LARGE)

  /** Failed to get memory. Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MEMORY_ERROR extends RegexError(GRegexError.G_REGEX_ERROR_MEMORY_ERROR)

  /** Lookbehind assertion is not fixed length. Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case VARIABLE_LENGTH_LOOKBEHIND
      extends RegexError(GRegexError.G_REGEX_ERROR_VARIABLE_LENGTH_LOOKBEHIND)

  /** Malformed number or name after "(?(". Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MALFORMED_CONDITION
      extends RegexError(GRegexError.G_REGEX_ERROR_MALFORMED_CONDITION)

  /** Conditional group contains more than two branches. Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOO_MANY_CONDITIONAL_BRANCHES
      extends RegexError(
        GRegexError.G_REGEX_ERROR_TOO_MANY_CONDITIONAL_BRANCHES
      )

  /** Assertion expected after "(?(". Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ASSERTION_EXPECTED
      extends RegexError(GRegexError.G_REGEX_ERROR_ASSERTION_EXPECTED)

  /** Unknown POSIX class name. Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNKNOWN_POSIX_CLASS_NAME
      extends RegexError(GRegexError.G_REGEX_ERROR_UNKNOWN_POSIX_CLASS_NAME)

  /** POSIX collating elements are not supported. Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED
      extends RegexError(
        GRegexError.G_REGEX_ERROR_POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED
      )

  /** Character value in "\\x{...}" sequence is too large. Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HEX_CODE_TOO_LARGE
      extends RegexError(GRegexError.G_REGEX_ERROR_HEX_CODE_TOO_LARGE)

  /** Invalid condition "(?(0)". Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_CONDITION
      extends RegexError(GRegexError.G_REGEX_ERROR_INVALID_CONDITION)

  /** \\C not allowed in lookbehind assertion. Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SINGLE_BYTE_MATCH_IN_LOOKBEHIND
      extends RegexError(
        GRegexError.G_REGEX_ERROR_SINGLE_BYTE_MATCH_IN_LOOKBEHIND
      )

  /** Recursive call could loop indefinitely. Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INFINITE_LOOP extends RegexError(GRegexError.G_REGEX_ERROR_INFINITE_LOOP)

  /** Missing terminator in subpattern name. Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MISSING_SUBPATTERN_NAME_TERMINATOR
      extends RegexError(
        GRegexError.G_REGEX_ERROR_MISSING_SUBPATTERN_NAME_TERMINATOR
      )

  /** Two named subpatterns have the same name. Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DUPLICATE_SUBPATTERN_NAME
      extends RegexError(GRegexError.G_REGEX_ERROR_DUPLICATE_SUBPATTERN_NAME)

  /** Malformed "\\P" or "\\p" sequence. Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MALFORMED_PROPERTY
      extends RegexError(GRegexError.G_REGEX_ERROR_MALFORMED_PROPERTY)

  /** Unknown property name after "\\P" or "\\p". Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNKNOWN_PROPERTY
      extends RegexError(GRegexError.G_REGEX_ERROR_UNKNOWN_PROPERTY)

  /** Subpattern name is too long (maximum 32 characters). Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SUBPATTERN_NAME_TOO_LONG
      extends RegexError(GRegexError.G_REGEX_ERROR_SUBPATTERN_NAME_TOO_LONG)

  /** Too many named subpatterns (maximum 10,000). Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOO_MANY_SUBPATTERNS
      extends RegexError(GRegexError.G_REGEX_ERROR_TOO_MANY_SUBPATTERNS)

  /** Octal value is greater than "\\377". Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_OCTAL_VALUE
      extends RegexError(GRegexError.G_REGEX_ERROR_INVALID_OCTAL_VALUE)

  /** "DEFINE" group contains more than one branch. Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOO_MANY_BRANCHES_IN_DEFINE
      extends RegexError(GRegexError.G_REGEX_ERROR_TOO_MANY_BRANCHES_IN_DEFINE)

  /** Repeating a "DEFINE" group is not allowed. This error is never raised.
    * Since: 2.16 Deprecated: 2.34
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DEFINE_REPETION
      extends RegexError(GRegexError.G_REGEX_ERROR_DEFINE_REPETION)

  /** Inconsistent newline options. Since 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INCONSISTENT_NEWLINE_OPTIONS
      extends RegexError(GRegexError.G_REGEX_ERROR_INCONSISTENT_NEWLINE_OPTIONS)

  /** "\\g" is not followed by a braced, angle-bracketed, or quoted name or
    * number, or by a plain number. Since: 2.16
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MISSING_BACK_REFERENCE
      extends RegexError(GRegexError.G_REGEX_ERROR_MISSING_BACK_REFERENCE)

  /** relative reference must not be zero. Since: 2.34
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_RELATIVE_REFERENCE
      extends RegexError(GRegexError.G_REGEX_ERROR_INVALID_RELATIVE_REFERENCE)

  /** the backtracing control verb used does not allow an argument. Since: 2.34
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN
      extends RegexError(
        GRegexError.G_REGEX_ERROR_BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN
      )

  /** unknown backtracing control verb. Since: 2.34
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNKNOWN_BACKTRACKING_CONTROL_VERB
      extends RegexError(
        GRegexError.G_REGEX_ERROR_UNKNOWN_BACKTRACKING_CONTROL_VERB
      )

  /** number is too big in escape sequence. Since: 2.34
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NUMBER_TOO_BIG
      extends RegexError(GRegexError.G_REGEX_ERROR_NUMBER_TOO_BIG)

  /** Missing subpattern name. Since: 2.34
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MISSING_SUBPATTERN_NAME
      extends RegexError(GRegexError.G_REGEX_ERROR_MISSING_SUBPATTERN_NAME)

  /** Missing digit. Since 2.34
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MISSING_DIGIT extends RegexError(GRegexError.G_REGEX_ERROR_MISSING_DIGIT)

  /** In JavaScript compatibility mode, "[" is an invalid data character. Since:
    * 2.34
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_DATA_CHARACTER
      extends RegexError(GRegexError.G_REGEX_ERROR_INVALID_DATA_CHARACTER)

  /** different names for subpatterns of the same number are not allowed. Since:
    * 2.34
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EXTRA_SUBPATTERN_NAME
      extends RegexError(GRegexError.G_REGEX_ERROR_EXTRA_SUBPATTERN_NAME)

  /** the backtracing control verb requires an argument. Since: 2.34
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED
      extends RegexError(
        GRegexError.G_REGEX_ERROR_BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED
      )

  /** "\\c" must be followed by an ASCII character. Since: 2.34
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_CONTROL_CHAR
      extends RegexError(GRegexError.G_REGEX_ERROR_INVALID_CONTROL_CHAR)

  /** "\\k" is not followed by a braced, angle-bracketed, or quoted name. Since:
    * 2.34
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MISSING_NAME extends RegexError(GRegexError.G_REGEX_ERROR_MISSING_NAME)

  /** "\\N" is not supported in a class. Since: 2.34
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOT_SUPPORTED_IN_CLASS
      extends RegexError(GRegexError.G_REGEX_ERROR_NOT_SUPPORTED_IN_CLASS)

  /** too many forward references. Since: 2.34
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOO_MANY_FORWARD_REFERENCES
      extends RegexError(GRegexError.G_REGEX_ERROR_TOO_MANY_FORWARD_REFERENCES)

  /** the name is too long in "(*MARK)", "(*PRUNE)", "(*SKIP)", or "(*THEN)".
    * Since: 2.34
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NAME_TOO_LONG extends RegexError(GRegexError.G_REGEX_ERROR_NAME_TOO_LONG)

  /** the character value in the \\u sequence is too large. Since: 2.34
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
