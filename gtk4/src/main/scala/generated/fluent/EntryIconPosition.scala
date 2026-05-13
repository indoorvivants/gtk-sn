package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkEntryIconPosition

/** Specifies the side of the entry at which an icon is placed.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum EntryIconPosition(val raw: GtkEntryIconPosition):
  /** At the beginning of the entry (depending on the text direction).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PRIMARY
      extends EntryIconPosition(GtkEntryIconPosition.GTK_ENTRY_ICON_PRIMARY)

  /** At the end of the entry (depending on the text direction).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SECONDARY
      extends EntryIconPosition(GtkEntryIconPosition.GTK_ENTRY_ICON_SECONDARY)
end EntryIconPosition

object EntryIconPosition:
  def fromRaw(raw: GtkEntryIconPosition): EntryIconPosition =
    raw match
      case GtkEntryIconPosition.GTK_ENTRY_ICON_PRIMARY =>
        EntryIconPosition.PRIMARY
      case GtkEntryIconPosition.GTK_ENTRY_ICON_SECONDARY =>
        EntryIconPosition.SECONDARY
  end fromRaw
end EntryIconPosition
