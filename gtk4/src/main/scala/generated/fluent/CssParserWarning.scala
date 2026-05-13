package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkCssParserWarning

/** Warnings that can occur while parsing CSS.
  *
  * Unlike `GtkCssParserError`s, warnings do not cause the parser to skip any
  * input, but they indicate issues that should be fixed.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum CssParserWarning(val raw: GtkCssParserWarning):
  /** The given construct is deprecated and will be removed in a future version
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DEPRECATED
      extends CssParserWarning(
        GtkCssParserWarning.GTK_CSS_PARSER_WARNING_DEPRECATED
      )

  /** A syntax construct was used that should be avoided
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SYNTAX
      extends CssParserWarning(
        GtkCssParserWarning.GTK_CSS_PARSER_WARNING_SYNTAX
      )

  /** A feature is not implemented
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
