package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkEventSequenceState

/** Describes the state of a [struct@Gdk.EventSequence] in a [class@Gesture].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum EventSequenceState(val raw: GtkEventSequenceState):
  /** The sequence is handled, but not grabbed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE
      extends EventSequenceState(GtkEventSequenceState.GTK_EVENT_SEQUENCE_NONE)

  /** The sequence is handled and grabbed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CLAIMED
      extends EventSequenceState(
        GtkEventSequenceState.GTK_EVENT_SEQUENCE_CLAIMED
      )

  /** The sequence is denied.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
