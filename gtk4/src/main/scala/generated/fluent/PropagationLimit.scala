package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkPropagationLimit

/** Describes limits of a [class@EventController] for handling events targeting
  * other widgets.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum PropagationLimit(val raw: GtkPropagationLimit):
  /** Events are handled regardless of what their target is.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends PropagationLimit(GtkPropagationLimit.GTK_LIMIT_NONE)

  /** Events are only handled if their target is in the same [iface@Native] as
    * the event controllers widget. Note that some event types have two targets
    * (origin and destination).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SAME_NATIVE
      extends PropagationLimit(GtkPropagationLimit.GTK_LIMIT_SAME_NATIVE)
end PropagationLimit

object PropagationLimit:
  def fromRaw(raw: GtkPropagationLimit): PropagationLimit =
    raw match
      case GtkPropagationLimit.GTK_LIMIT_NONE        => PropagationLimit.NONE
      case GtkPropagationLimit.GTK_LIMIT_SAME_NATIVE =>
        PropagationLimit.SAME_NATIVE
  end fromRaw
end PropagationLimit
