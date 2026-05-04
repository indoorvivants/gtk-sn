package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkBorderStyle

/** Describes how the border of a UI element should be rendered.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum BorderStyle(val raw: GtkBorderStyle):
  /** No visible border
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends BorderStyle(GtkBorderStyle.GTK_BORDER_STYLE_NONE)

  /** Same as %GTK_BORDER_STYLE_NONE
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HIDDEN extends BorderStyle(GtkBorderStyle.GTK_BORDER_STYLE_HIDDEN)

  /** A single line segment
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SOLID extends BorderStyle(GtkBorderStyle.GTK_BORDER_STYLE_SOLID)

  /** Looks as if the content is sunken into the canvas
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INSET extends BorderStyle(GtkBorderStyle.GTK_BORDER_STYLE_INSET)

  /** Looks as if the content is coming out of the canvas
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OUTSET extends BorderStyle(GtkBorderStyle.GTK_BORDER_STYLE_OUTSET)

  /** A series of round dots
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DOTTED extends BorderStyle(GtkBorderStyle.GTK_BORDER_STYLE_DOTTED)

  /** A series of square-ended dashes
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DASHED extends BorderStyle(GtkBorderStyle.GTK_BORDER_STYLE_DASHED)

  /** Two parallel lines with some space between them
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DOUBLE extends BorderStyle(GtkBorderStyle.GTK_BORDER_STYLE_DOUBLE)

  /** Looks as if it were carved in the canvas
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GROOVE extends BorderStyle(GtkBorderStyle.GTK_BORDER_STYLE_GROOVE)

  /** Looks as if it were coming out of the canvas
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
