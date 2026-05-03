package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkIconViewDropPosition

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An enum for determining where a dropped item goes.
  */
enum IconViewDropPosition(val raw: GtkIconViewDropPosition):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * no drop possible
    */
  case NO_DROP
      extends IconViewDropPosition(
        GtkIconViewDropPosition.GTK_ICON_VIEW_NO_DROP
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * dropped item replaces the item
    */
  case DROP_INTO
      extends IconViewDropPosition(
        GtkIconViewDropPosition.GTK_ICON_VIEW_DROP_INTO
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * dropped item is inserted to the left
    */
  case DROP_LEFT
      extends IconViewDropPosition(
        GtkIconViewDropPosition.GTK_ICON_VIEW_DROP_LEFT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * dropped item is inserted to the right
    */
  case DROP_RIGHT
      extends IconViewDropPosition(
        GtkIconViewDropPosition.GTK_ICON_VIEW_DROP_RIGHT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * dropped item is inserted above
    */
  case DROP_ABOVE
      extends IconViewDropPosition(
        GtkIconViewDropPosition.GTK_ICON_VIEW_DROP_ABOVE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * dropped item is inserted below
    */
  case DROP_BELOW
      extends IconViewDropPosition(
        GtkIconViewDropPosition.GTK_ICON_VIEW_DROP_BELOW
      )
end IconViewDropPosition

object IconViewDropPosition:
  def fromRaw(raw: GtkIconViewDropPosition): IconViewDropPosition =
    raw match
      case GtkIconViewDropPosition.GTK_ICON_VIEW_NO_DROP =>
        IconViewDropPosition.NO_DROP
      case GtkIconViewDropPosition.GTK_ICON_VIEW_DROP_INTO =>
        IconViewDropPosition.DROP_INTO
      case GtkIconViewDropPosition.GTK_ICON_VIEW_DROP_LEFT =>
        IconViewDropPosition.DROP_LEFT
      case GtkIconViewDropPosition.GTK_ICON_VIEW_DROP_RIGHT =>
        IconViewDropPosition.DROP_RIGHT
      case GtkIconViewDropPosition.GTK_ICON_VIEW_DROP_ABOVE =>
        IconViewDropPosition.DROP_ABOVE
      case GtkIconViewDropPosition.GTK_ICON_VIEW_DROP_BELOW =>
        IconViewDropPosition.DROP_BELOW
  end fromRaw
end IconViewDropPosition
