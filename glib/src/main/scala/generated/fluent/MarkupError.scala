package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GMarkupError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Error codes returned by markup parsing.
  */
enum MarkupError(val raw: GMarkupError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * text being parsed was not valid UTF-8
    */
  case BAD_UTF8 extends MarkupError(GMarkupError.G_MARKUP_ERROR_BAD_UTF8)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * document contained nothing, or only whitespace
    */
  case EMPTY extends MarkupError(GMarkupError.G_MARKUP_ERROR_EMPTY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * document was ill-formed
    */
  case PARSE extends MarkupError(GMarkupError.G_MARKUP_ERROR_PARSE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * error should be set by #GMarkupParser functions; element wasn't known
    */
  case UNKNOWN_ELEMENT
      extends MarkupError(GMarkupError.G_MARKUP_ERROR_UNKNOWN_ELEMENT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * error should be set by #GMarkupParser functions; attribute wasn't known
    */
  case UNKNOWN_ATTRIBUTE
      extends MarkupError(GMarkupError.G_MARKUP_ERROR_UNKNOWN_ATTRIBUTE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * error should be set by #GMarkupParser functions; content was invalid
    */
  case INVALID_CONTENT
      extends MarkupError(GMarkupError.G_MARKUP_ERROR_INVALID_CONTENT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * error should be set by #GMarkupParser functions; a required attribute was
    * missing
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
