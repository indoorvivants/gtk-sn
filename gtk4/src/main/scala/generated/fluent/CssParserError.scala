package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkCssParserError

/** Errors that can occur while parsing CSS.
  *
  * These errors are unexpected and will cause parts of the given CSS to be
  * ignored.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum CssParserError(val raw: GtkCssParserError):
  /** Unknown failure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FAILED
      extends CssParserError(GtkCssParserError.GTK_CSS_PARSER_ERROR_FAILED)

  /** The given text does not form valid syntax
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SYNTAX
      extends CssParserError(GtkCssParserError.GTK_CSS_PARSER_ERROR_SYNTAX)

  /** Failed to import a resource
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case IMPORT
      extends CssParserError(GtkCssParserError.GTK_CSS_PARSER_ERROR_IMPORT)

  /** The given name has not been defined
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NAME extends CssParserError(GtkCssParserError.GTK_CSS_PARSER_ERROR_NAME)

  /** The given value is not correct
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNKNOWN_VALUE
      extends CssParserError(
        GtkCssParserError.GTK_CSS_PARSER_ERROR_UNKNOWN_VALUE
      )
end CssParserError

object CssParserError:
  def fromRaw(raw: GtkCssParserError): CssParserError =
    raw match
      case GtkCssParserError.GTK_CSS_PARSER_ERROR_FAILED =>
        CssParserError.FAILED
      case GtkCssParserError.GTK_CSS_PARSER_ERROR_SYNTAX =>
        CssParserError.SYNTAX
      case GtkCssParserError.GTK_CSS_PARSER_ERROR_IMPORT =>
        CssParserError.IMPORT
      case GtkCssParserError.GTK_CSS_PARSER_ERROR_NAME => CssParserError.NAME
      case GtkCssParserError.GTK_CSS_PARSER_ERROR_UNKNOWN_VALUE =>
        CssParserError.UNKNOWN_VALUE
  end fromRaw
end CssParserError
