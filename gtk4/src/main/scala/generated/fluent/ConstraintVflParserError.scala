package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkConstraintVflParserError

/** Domain for VFL parsing errors.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum ConstraintVflParserError(val raw: GtkConstraintVflParserError):
  /** Invalid or unknown symbol
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SYMBOL
      extends ConstraintVflParserError(
        GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_SYMBOL
      )

  /** Invalid or unknown attribute
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ATTRIBUTE
      extends ConstraintVflParserError(
        GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_ATTRIBUTE
      )

  /** Invalid or unknown view
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case VIEW
      extends ConstraintVflParserError(
        GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_VIEW
      )

  /** Invalid or unknown metric
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case METRIC
      extends ConstraintVflParserError(
        GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_METRIC
      )

  /** Invalid or unknown priority
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PRIORITY
      extends ConstraintVflParserError(
        GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_PRIORITY
      )

  /** Invalid or unknown relation
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
