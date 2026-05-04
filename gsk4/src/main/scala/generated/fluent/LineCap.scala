package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.GskLineCap

/** Specifies how to render the start and end points of contours or dashes when
  * stroking.
  *
  * The default line cap style is `GSK_LINE_CAP_BUTT`.
  *
  * New entries may be added in future versions.
  *
  * <figure> <picture> <source srcset="caps-dark.png"
  * media="(prefers-color-scheme: dark)"> <img alt="Line Cap Styles"
  * src="caps-light.png"> </picture> <figcaption>GSK_LINE_CAP_BUTT,
  * GSK_LINE_CAP_ROUND, GSK_LINE_CAP_SQUARE</figcaption> </figure>
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum LineCap(val raw: GskLineCap):
  /** Start and stop the line exactly at the start and end point
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BUTT extends LineCap(GskLineCap.GSK_LINE_CAP_BUTT)

  /** Use a round ending, the center of the circle is the start or end point
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ROUND extends LineCap(GskLineCap.GSK_LINE_CAP_ROUND)

  /** use squared ending, the center of the square is the start or end point
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SQUARE extends LineCap(GskLineCap.GSK_LINE_CAP_SQUARE)
end LineCap

object LineCap:
  def fromRaw(raw: GskLineCap): LineCap =
    raw match
      case GskLineCap.GSK_LINE_CAP_BUTT   => LineCap.BUTT
      case GskLineCap.GSK_LINE_CAP_ROUND  => LineCap.ROUND
      case GskLineCap.GSK_LINE_CAP_SQUARE => LineCap.SQUARE
  end fromRaw
end LineCap
