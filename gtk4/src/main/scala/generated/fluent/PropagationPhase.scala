package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPropagationPhase

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Describes the stage at which events are fed into a [class@EventController].
  */
enum PropagationPhase(val raw: GtkPropagationPhase):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Events are not delivered.
    */
  case NONE extends PropagationPhase(GtkPropagationPhase.GTK_PHASE_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Events are delivered in the capture phase. The capture phase happens
    * before the bubble phase, runs from the toplevel down to the event widget.
    * This option should only be used on containers that might possibly handle
    * events before their children do.
    */
  case CAPTURE extends PropagationPhase(GtkPropagationPhase.GTK_PHASE_CAPTURE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Events are delivered in the bubble phase. The bubble phase happens after
    * the capture phase, and before the default handlers are run. This phase
    * runs from the event widget, up to the toplevel.
    */
  case BUBBLE extends PropagationPhase(GtkPropagationPhase.GTK_PHASE_BUBBLE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Events are delivered in the default widget event handlers, note that
    * widget implementations must chain up on button, motion, touch and grab
    * broken handlers for controllers in this phase to be run.
    */
  case TARGET extends PropagationPhase(GtkPropagationPhase.GTK_PHASE_TARGET)
end PropagationPhase

object PropagationPhase:
  def fromRaw(raw: GtkPropagationPhase): PropagationPhase =
    raw match
      case GtkPropagationPhase.GTK_PHASE_NONE    => PropagationPhase.NONE
      case GtkPropagationPhase.GTK_PHASE_CAPTURE => PropagationPhase.CAPTURE
      case GtkPropagationPhase.GTK_PHASE_BUBBLE  => PropagationPhase.BUBBLE
      case GtkPropagationPhase.GTK_PHASE_TARGET  => PropagationPhase.TARGET
  end fromRaw
end PropagationPhase
