package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkJustification

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Used for justifying the text inside a [class@Label] widget.
  */
enum Justification(val raw: GtkJustification):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The text is placed at the left edge of the label.
    */
  case LEFT extends Justification(GtkJustification.GTK_JUSTIFY_LEFT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The text is placed at the right edge of the label.
    */
  case RIGHT extends Justification(GtkJustification.GTK_JUSTIFY_RIGHT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The text is placed in the center of the label.
    */
  case CENTER extends Justification(GtkJustification.GTK_JUSTIFY_CENTER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The text is placed is distributed across the label.
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
