package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GMarkupError

/** Error codes returned by markup parsing.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum MarkupError(val raw: GMarkupError):
  /** text being parsed was not valid UTF-8
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BAD_UTF8 extends MarkupError(GMarkupError.G_MARKUP_ERROR_BAD_UTF8)

  /** document contained nothing, or only whitespace
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EMPTY extends MarkupError(GMarkupError.G_MARKUP_ERROR_EMPTY)

  /** document was ill-formed
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PARSE extends MarkupError(GMarkupError.G_MARKUP_ERROR_PARSE)

  /** error should be set by #GMarkupParser functions; element wasn't known
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNKNOWN_ELEMENT
      extends MarkupError(GMarkupError.G_MARKUP_ERROR_UNKNOWN_ELEMENT)

  /** error should be set by #GMarkupParser functions; attribute wasn't known
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNKNOWN_ATTRIBUTE
      extends MarkupError(GMarkupError.G_MARKUP_ERROR_UNKNOWN_ATTRIBUTE)

  /** error should be set by #GMarkupParser functions; content was invalid
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_CONTENT
      extends MarkupError(GMarkupError.G_MARKUP_ERROR_INVALID_CONTENT)

  /** error should be set by #GMarkupParser functions; a required attribute was
    * missing
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MISSING_ATTRIBUTE
      extends MarkupError(GMarkupError.G_MARKUP_ERROR_MISSING_ATTRIBUTE)
end MarkupError

object MarkupError:
  def fromRaw(raw: GMarkupError): MarkupError =
    raw match
      case GMarkupError.G_MARKUP_ERROR_BAD_UTF8        => MarkupError.BAD_UTF8
      case GMarkupError.G_MARKUP_ERROR_EMPTY           => MarkupError.EMPTY
      case GMarkupError.G_MARKUP_ERROR_PARSE           => MarkupError.PARSE
      case GMarkupError.G_MARKUP_ERROR_UNKNOWN_ELEMENT =>
        MarkupError.UNKNOWN_ELEMENT
      case GMarkupError.G_MARKUP_ERROR_UNKNOWN_ATTRIBUTE =>
        MarkupError.UNKNOWN_ATTRIBUTE
      case GMarkupError.G_MARKUP_ERROR_INVALID_CONTENT =>
        MarkupError.INVALID_CONTENT
      case GMarkupError.G_MARKUP_ERROR_MISSING_ATTRIBUTE =>
        MarkupError.MISSING_ATTRIBUTE
  end fromRaw
end MarkupError
