package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkMovementStep

/** Passed as argument to various keybinding signals for moving the cursor
  * position.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum MovementStep(val raw: GtkMovementStep):
  /** Move forward or back by graphemes
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LOGICAL_POSITIONS
      extends MovementStep(GtkMovementStep.GTK_MOVEMENT_LOGICAL_POSITIONS)

  /** Move left or right by graphemes
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case VISUAL_POSITIONS
      extends MovementStep(GtkMovementStep.GTK_MOVEMENT_VISUAL_POSITIONS)

  /** Move forward or back by words
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WORDS extends MovementStep(GtkMovementStep.GTK_MOVEMENT_WORDS)

  /** Move up or down lines (wrapped lines)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DISPLAY_LINES
      extends MovementStep(GtkMovementStep.GTK_MOVEMENT_DISPLAY_LINES)

  /** Move to either end of a line
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DISPLAY_LINE_ENDS
      extends MovementStep(GtkMovementStep.GTK_MOVEMENT_DISPLAY_LINE_ENDS)

  /** Move up or down paragraphs (newline-ended lines)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PARAGRAPHS extends MovementStep(GtkMovementStep.GTK_MOVEMENT_PARAGRAPHS)

  /** Move to either end of a paragraph
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PARAGRAPH_ENDS
      extends MovementStep(GtkMovementStep.GTK_MOVEMENT_PARAGRAPH_ENDS)

  /** Move by pages
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PAGES extends MovementStep(GtkMovementStep.GTK_MOVEMENT_PAGES)

  /** Move to ends of the buffer
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BUFFER_ENDS
      extends MovementStep(GtkMovementStep.GTK_MOVEMENT_BUFFER_ENDS)

  /** Move horizontally by pages
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HORIZONTAL_PAGES
      extends MovementStep(GtkMovementStep.GTK_MOVEMENT_HORIZONTAL_PAGES)
end MovementStep

object MovementStep:
  def fromRaw(raw: GtkMovementStep): MovementStep =
    raw match
      case GtkMovementStep.GTK_MOVEMENT_LOGICAL_POSITIONS =>
        MovementStep.LOGICAL_POSITIONS
      case GtkMovementStep.GTK_MOVEMENT_VISUAL_POSITIONS =>
        MovementStep.VISUAL_POSITIONS
      case GtkMovementStep.GTK_MOVEMENT_WORDS         => MovementStep.WORDS
      case GtkMovementStep.GTK_MOVEMENT_DISPLAY_LINES =>
        MovementStep.DISPLAY_LINES
      case GtkMovementStep.GTK_MOVEMENT_DISPLAY_LINE_ENDS =>
        MovementStep.DISPLAY_LINE_ENDS
      case GtkMovementStep.GTK_MOVEMENT_PARAGRAPHS => MovementStep.PARAGRAPHS
      case GtkMovementStep.GTK_MOVEMENT_PARAGRAPH_ENDS =>
        MovementStep.PARAGRAPH_ENDS
      case GtkMovementStep.GTK_MOVEMENT_PAGES       => MovementStep.PAGES
      case GtkMovementStep.GTK_MOVEMENT_BUFFER_ENDS => MovementStep.BUFFER_ENDS
      case GtkMovementStep.GTK_MOVEMENT_HORIZONTAL_PAGES =>
        MovementStep.HORIZONTAL_PAGES
  end fromRaw
end MovementStep
