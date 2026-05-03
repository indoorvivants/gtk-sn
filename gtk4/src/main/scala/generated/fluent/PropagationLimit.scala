package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPropagationLimit

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Describes limits of a [class@EventController] for handling events targeting
  * other widgets.
  */
enum PropagationLimit(val raw: GtkPropagationLimit):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Events are handled regardless of what their target is.
    */
  case NONE extends PropagationLimit(GtkPropagationLimit.GTK_LIMIT_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Events are only handled if their target is in the same [iface@Native] as
    * the event controllers widget. Note that some event types have two targets
    * (origin and destination).
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
