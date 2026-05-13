package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkJustification

/** Used for justifying the text inside a [class@Label] widget.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum Justification(val raw: GtkJustification):
  /** The text is placed at the left edge of the label.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LEFT extends Justification(GtkJustification.GTK_JUSTIFY_LEFT)

  /** The text is placed at the right edge of the label.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RIGHT extends Justification(GtkJustification.GTK_JUSTIFY_RIGHT)

  /** The text is placed in the center of the label.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CENTER extends Justification(GtkJustification.GTK_JUSTIFY_CENTER)

  /** The text is placed is distributed across the label.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FILL extends Justification(GtkJustification.GTK_JUSTIFY_FILL)
end Justification

object Justification:
  def fromRaw(raw: GtkJustification): Justification =
    raw match
      case GtkJustification.GTK_JUSTIFY_LEFT   => Justification.LEFT
      case GtkJustification.GTK_JUSTIFY_RIGHT  => Justification.RIGHT
      case GtkJustification.GTK_JUSTIFY_CENTER => Justification.CENTER
      case GtkJustification.GTK_JUSTIFY_FILL   => Justification.FILL
  end fromRaw
end Justification
