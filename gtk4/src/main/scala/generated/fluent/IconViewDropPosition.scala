package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkIconViewDropPosition

/** An enum for determining where a dropped item goes.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum IconViewDropPosition(val raw: GtkIconViewDropPosition):
  /** no drop possible
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NO_DROP
      extends IconViewDropPosition(
        GtkIconViewDropPosition.GTK_ICON_VIEW_NO_DROP
      )

  /** dropped item replaces the item
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DROP_INTO
      extends IconViewDropPosition(
        GtkIconViewDropPosition.GTK_ICON_VIEW_DROP_INTO
      )

  /** dropped item is inserted to the left
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DROP_LEFT
      extends IconViewDropPosition(
        GtkIconViewDropPosition.GTK_ICON_VIEW_DROP_LEFT
      )

  /** dropped item is inserted to the right
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DROP_RIGHT
      extends IconViewDropPosition(
        GtkIconViewDropPosition.GTK_ICON_VIEW_DROP_RIGHT
      )

  /** dropped item is inserted above
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DROP_ABOVE
      extends IconViewDropPosition(
        GtkIconViewDropPosition.GTK_ICON_VIEW_DROP_ABOVE
      )

  /** dropped item is inserted below
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
