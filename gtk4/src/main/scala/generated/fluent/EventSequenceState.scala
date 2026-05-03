package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkEventSequenceState

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Describes the state of a [struct@Gdk.EventSequence] in a [class@Gesture].
  */
enum EventSequenceState(val raw: GtkEventSequenceState):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The sequence is handled, but not grabbed.
    */
  case NONE
      extends EventSequenceState(GtkEventSequenceState.GTK_EVENT_SEQUENCE_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The sequence is handled and grabbed.
    */
  case CLAIMED
      extends EventSequenceState(
        GtkEventSequenceState.GTK_EVENT_SEQUENCE_CLAIMED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The sequence is denied.
    */
  case DENIED
      extends EventSequenceState(
        GtkEventSequenceState.GTK_EVENT_SEQUENCE_DENIED
      )
end EventSequenceState

object EventSequenceState:
  def fromRaw(raw: GtkEventSequenceState): EventSequenceState =
    raw match
      case GtkEventSequenceState.GTK_EVENT_SEQUENCE_NONE =>
        EventSequenceState.NONE
      case GtkEventSequenceState.GTK_EVENT_SEQUENCE_CLAIMED =>
        EventSequenceState.CLAIMED
      case GtkEventSequenceState.GTK_EVENT_SEQUENCE_DENIED =>
        EventSequenceState.DENIED
  end fromRaw
end EventSequenceState
