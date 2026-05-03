package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPadActionType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The type of a pad action.
  */
enum PadActionType(val raw: GtkPadActionType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Action is triggered by a pad button
    */
  case BUTTON extends PadActionType(GtkPadActionType.GTK_PAD_ACTION_BUTTON)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Action is triggered by a pad ring
    */
  case RING extends PadActionType(GtkPadActionType.GTK_PAD_ACTION_RING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Action is triggered by a pad strip
    */
  case STRIP extends PadActionType(GtkPadActionType.GTK_PAD_ACTION_STRIP)
end PadActionType

object PadActionType:
  def fromRaw(raw: GtkPadActionType): PadActionType =
    raw match
      case GtkPadActionType.GTK_PAD_ACTION_BUTTON => PadActionType.BUTTON
      case GtkPadActionType.GTK_PAD_ACTION_RING   => PadActionType.RING
      case GtkPadActionType.GTK_PAD_ACTION_STRIP  => PadActionType.STRIP
  end fromRaw
end PadActionType
