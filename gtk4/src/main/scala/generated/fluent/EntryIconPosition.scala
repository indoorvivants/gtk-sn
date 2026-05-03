package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkEntryIconPosition

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Specifies the side of the entry at which an icon is placed.
  */
enum EntryIconPosition(val raw: GtkEntryIconPosition):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * At the beginning of the entry (depending on the text direction).
    */
  case PRIMARY
      extends EntryIconPosition(GtkEntryIconPosition.GTK_ENTRY_ICON_PRIMARY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * At the end of the entry (depending on the text direction).
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
