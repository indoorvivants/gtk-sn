package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkConstraintVflParserError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Domain for VFL parsing errors.
  */
enum ConstraintVflParserError(val raw: GtkConstraintVflParserError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Invalid or unknown symbol
    */
  case SYMBOL
      extends ConstraintVflParserError(
        GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_SYMBOL
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Invalid or unknown attribute
    */
  case ATTRIBUTE
      extends ConstraintVflParserError(
        GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_ATTRIBUTE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Invalid or unknown view
    */
  case VIEW
      extends ConstraintVflParserError(
        GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_VIEW
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Invalid or unknown metric
    */
  case METRIC
      extends ConstraintVflParserError(
        GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_METRIC
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Invalid or unknown priority
    */
  case PRIORITY
      extends ConstraintVflParserError(
        GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_PRIORITY
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Invalid or unknown relation
    */
  case RELATION
      extends ConstraintVflParserError(
        GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_RELATION
      )
end ConstraintVflParserError

object ConstraintVflParserError:
  def fromRaw(raw: GtkConstraintVflParserError): ConstraintVflParserError =
    raw match
      case GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_SYMBOL =>
        ConstraintVflParserError.SYMBOL
      case GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_ATTRIBUTE =>
        ConstraintVflParserError.ATTRIBUTE
      case GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_VIEW =>
        ConstraintVflParserError.VIEW
      case GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_METRIC =>
        ConstraintVflParserError.METRIC
      case GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_PRIORITY =>
        ConstraintVflParserError.PRIORITY
      case GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_RELATION =>
        ConstraintVflParserError.RELATION
  end fromRaw
end ConstraintVflParserError
