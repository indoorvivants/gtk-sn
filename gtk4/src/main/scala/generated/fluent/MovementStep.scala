package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkMovementStep

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Passed as argument to various keybinding signals for moving the cursor
  * position.
  */
enum MovementStep(val raw: GtkMovementStep):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Move forward or back by graphemes
    */
  case LOGICAL_POSITIONS
      extends MovementStep(GtkMovementStep.GTK_MOVEMENT_LOGICAL_POSITIONS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Move left or right by graphemes
    */
  case VISUAL_POSITIONS
      extends MovementStep(GtkMovementStep.GTK_MOVEMENT_VISUAL_POSITIONS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Move forward or back by words
    */
  case WORDS extends MovementStep(GtkMovementStep.GTK_MOVEMENT_WORDS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Move up or down lines (wrapped lines)
    */
  case DISPLAY_LINES
      extends MovementStep(GtkMovementStep.GTK_MOVEMENT_DISPLAY_LINES)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Move to either end of a line
    */
  case DISPLAY_LINE_ENDS
      extends MovementStep(GtkMovementStep.GTK_MOVEMENT_DISPLAY_LINE_ENDS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Move up or down paragraphs (newline-ended lines)
    */
  case PARAGRAPHS extends MovementStep(GtkMovementStep.GTK_MOVEMENT_PARAGRAPHS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Move to either end of a paragraph
    */
  case PARAGRAPH_ENDS
      extends MovementStep(GtkMovementStep.GTK_MOVEMENT_PARAGRAPH_ENDS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Move by pages
    */
  case PAGES extends MovementStep(GtkMovementStep.GTK_MOVEMENT_PAGES)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Move to ends of the buffer
    */
  case BUFFER_ENDS
      extends MovementStep(GtkMovementStep.GTK_MOVEMENT_BUFFER_ENDS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Move horizontally by pages
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
