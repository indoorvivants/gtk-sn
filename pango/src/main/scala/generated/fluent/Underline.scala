package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoUnderline

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The `PangoUnderline` enumeration is used to specify whether text should be
  * underlined, and if so, the type of underlining.
  */
enum Underline(val raw: PangoUnderline):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * no underline should be drawn
    */
  case NONE extends Underline(PangoUnderline.PANGO_UNDERLINE_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a single underline should be drawn
    */
  case SINGLE extends Underline(PangoUnderline.PANGO_UNDERLINE_SINGLE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a double underline should be drawn
    */
  case DOUBLE extends Underline(PangoUnderline.PANGO_UNDERLINE_DOUBLE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a single underline should be drawn at a position beneath the ink extents
    * of the text being underlined. This should be used only for underlining
    * single characters, such as for keyboard accelerators.
    * %PANGO_UNDERLINE_SINGLE should be used for extended portions of text.
    */
  case LOW extends Underline(PangoUnderline.PANGO_UNDERLINE_LOW)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * an underline indicating an error should be drawn below. The exact style of
    * rendering is up to the `PangoRenderer` in use, but typical styles include
    * wavy or dotted lines. This underline is typically used to indicate an
    * error such as a possible mispelling; in some cases a contrasting color may
    * automatically be used. This type of underlining is available since Pango
    * 1.4.
    */
  case ERROR extends Underline(PangoUnderline.PANGO_UNDERLINE_ERROR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Like @PANGO_UNDERLINE_SINGLE, but drawn continuously across multiple runs.
    * This type of underlining is available since Pango 1.46.
    */
  case SINGLE_LINE extends Underline(PangoUnderline.PANGO_UNDERLINE_SINGLE_LINE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Like @PANGO_UNDERLINE_DOUBLE, but drawn continuously across multiple runs.
    * This type of underlining is available since Pango 1.46.
    */
  case DOUBLE_LINE extends Underline(PangoUnderline.PANGO_UNDERLINE_DOUBLE_LINE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Like @PANGO_UNDERLINE_ERROR, but drawn continuously across multiple runs.
    * This type of underlining is available since Pango 1.46.
    */
  case ERROR_LINE extends Underline(PangoUnderline.PANGO_UNDERLINE_ERROR_LINE)
end Underline

object Underline:
  def fromRaw(raw: PangoUnderline): Underline =
    raw match
      case PangoUnderline.PANGO_UNDERLINE_NONE        => Underline.NONE
      case PangoUnderline.PANGO_UNDERLINE_SINGLE      => Underline.SINGLE
      case PangoUnderline.PANGO_UNDERLINE_DOUBLE      => Underline.DOUBLE
      case PangoUnderline.PANGO_UNDERLINE_LOW         => Underline.LOW
      case PangoUnderline.PANGO_UNDERLINE_ERROR       => Underline.ERROR
      case PangoUnderline.PANGO_UNDERLINE_SINGLE_LINE => Underline.SINGLE_LINE
      case PangoUnderline.PANGO_UNDERLINE_DOUBLE_LINE => Underline.DOUBLE_LINE
      case PangoUnderline.PANGO_UNDERLINE_ERROR_LINE  => Underline.ERROR_LINE
  end fromRaw
end Underline
