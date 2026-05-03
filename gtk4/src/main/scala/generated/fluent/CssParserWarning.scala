package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkCssParserWarning

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Warnings that can occur while parsing CSS.
  *
  * Unlike `GtkCssParserError`s, warnings do not cause the parser to skip any
  * input, but they indicate issues that should be fixed.
  */
enum CssParserWarning(val raw: GtkCssParserWarning):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The given construct is deprecated and will be removed in a future version
    */
  case DEPRECATED
      extends CssParserWarning(
        GtkCssParserWarning.GTK_CSS_PARSER_WARNING_DEPRECATED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A syntax construct was used that should be avoided
    */
  case SYNTAX
      extends CssParserWarning(
        GtkCssParserWarning.GTK_CSS_PARSER_WARNING_SYNTAX
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A feature is not implemented
    */
  case UNIMPLEMENTED
      extends CssParserWarning(
        GtkCssParserWarning.GTK_CSS_PARSER_WARNING_UNIMPLEMENTED
      )
end CssParserWarning

object CssParserWarning:
  def fromRaw(raw: GtkCssParserWarning): CssParserWarning =
    raw match
      case GtkCssParserWarning.GTK_CSS_PARSER_WARNING_DEPRECATED =>
        CssParserWarning.DEPRECATED
      case GtkCssParserWarning.GTK_CSS_PARSER_WARNING_SYNTAX =>
        CssParserWarning.SYNTAX
      case GtkCssParserWarning.GTK_CSS_PARSER_WARNING_UNIMPLEMENTED =>
        CssParserWarning.UNIMPLEMENTED
  end fromRaw
end CssParserWarning
