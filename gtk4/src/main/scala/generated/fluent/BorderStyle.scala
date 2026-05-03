package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkBorderStyle

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Describes how the border of a UI element should be rendered.
  */
enum BorderStyle(val raw: GtkBorderStyle):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No visible border
    */
  case NONE extends BorderStyle(GtkBorderStyle.GTK_BORDER_STYLE_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Same as %GTK_BORDER_STYLE_NONE
    */
  case HIDDEN extends BorderStyle(GtkBorderStyle.GTK_BORDER_STYLE_HIDDEN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A single line segment
    */
  case SOLID extends BorderStyle(GtkBorderStyle.GTK_BORDER_STYLE_SOLID)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Looks as if the content is sunken into the canvas
    */
  case INSET extends BorderStyle(GtkBorderStyle.GTK_BORDER_STYLE_INSET)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Looks as if the content is coming out of the canvas
    */
  case OUTSET extends BorderStyle(GtkBorderStyle.GTK_BORDER_STYLE_OUTSET)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A series of round dots
    */
  case DOTTED extends BorderStyle(GtkBorderStyle.GTK_BORDER_STYLE_DOTTED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A series of square-ended dashes
    */
  case DASHED extends BorderStyle(GtkBorderStyle.GTK_BORDER_STYLE_DASHED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Two parallel lines with some space between them
    */
  case DOUBLE extends BorderStyle(GtkBorderStyle.GTK_BORDER_STYLE_DOUBLE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Looks as if it were carved in the canvas
    */
  case GROOVE extends BorderStyle(GtkBorderStyle.GTK_BORDER_STYLE_GROOVE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Looks as if it were coming out of the canvas
    */
  case RIDGE extends BorderStyle(GtkBorderStyle.GTK_BORDER_STYLE_RIDGE)
end BorderStyle

object BorderStyle:
  def fromRaw(raw: GtkBorderStyle): BorderStyle =
    raw match
      case GtkBorderStyle.GTK_BORDER_STYLE_NONE   => BorderStyle.NONE
      case GtkBorderStyle.GTK_BORDER_STYLE_HIDDEN => BorderStyle.HIDDEN
      case GtkBorderStyle.GTK_BORDER_STYLE_SOLID  => BorderStyle.SOLID
      case GtkBorderStyle.GTK_BORDER_STYLE_INSET  => BorderStyle.INSET
      case GtkBorderStyle.GTK_BORDER_STYLE_OUTSET => BorderStyle.OUTSET
      case GtkBorderStyle.GTK_BORDER_STYLE_DOTTED => BorderStyle.DOTTED
      case GtkBorderStyle.GTK_BORDER_STYLE_DASHED => BorderStyle.DASHED
      case GtkBorderStyle.GTK_BORDER_STYLE_DOUBLE => BorderStyle.DOUBLE
      case GtkBorderStyle.GTK_BORDER_STYLE_GROOVE => BorderStyle.GROOVE
      case GtkBorderStyle.GTK_BORDER_STYLE_RIDGE  => BorderStyle.RIDGE
  end fromRaw
end BorderStyle
