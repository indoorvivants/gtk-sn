package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkCssParserError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Errors that can occur while parsing CSS.
  *
  * These errors are unexpected and will cause parts of the given CSS to be
  * ignored.
  */
enum CssParserError(val raw: GtkCssParserError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unknown failure.
    */
  case FAILED
      extends CssParserError(GtkCssParserError.GTK_CSS_PARSER_ERROR_FAILED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The given text does not form valid syntax
    */
  case SYNTAX
      extends CssParserError(GtkCssParserError.GTK_CSS_PARSER_ERROR_SYNTAX)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Failed to import a resource
    */
  case IMPORT
      extends CssParserError(GtkCssParserError.GTK_CSS_PARSER_ERROR_IMPORT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The given name has not been defined
    */
  case NAME extends CssParserError(GtkCssParserError.GTK_CSS_PARSER_ERROR_NAME)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The given value is not correct
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
