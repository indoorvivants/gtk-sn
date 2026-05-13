package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkPadActionType

/** The type of a pad action.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum PadActionType(val raw: GtkPadActionType):
  /** Action is triggered by a pad button
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BUTTON extends PadActionType(GtkPadActionType.GTK_PAD_ACTION_BUTTON)

  /** Action is triggered by a pad ring
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RING extends PadActionType(GtkPadActionType.GTK_PAD_ACTION_RING)

  /** Action is triggered by a pad strip
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
