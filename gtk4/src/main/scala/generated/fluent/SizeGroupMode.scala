package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkSizeGroupMode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The mode of the size group determines the directions in which the size group
  * affects the requested sizes of its component widgets.
  */
enum SizeGroupMode(val raw: GtkSizeGroupMode):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * group has no effect
    */
  case NONE extends SizeGroupMode(GtkSizeGroupMode.GTK_SIZE_GROUP_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * group affects horizontal requisition
    */
  case HORIZONTAL
      extends SizeGroupMode(GtkSizeGroupMode.GTK_SIZE_GROUP_HORIZONTAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * group affects vertical requisition
    */
  case VERTICAL extends SizeGroupMode(GtkSizeGroupMode.GTK_SIZE_GROUP_VERTICAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * group affects both horizontal and vertical requisition
    */
  case BOTH extends SizeGroupMode(GtkSizeGroupMode.GTK_SIZE_GROUP_BOTH)
end SizeGroupMode

object SizeGroupMode:
  def fromRaw(raw: GtkSizeGroupMode): SizeGroupMode =
    raw match
      case GtkSizeGroupMode.GTK_SIZE_GROUP_NONE       => SizeGroupMode.NONE
      case GtkSizeGroupMode.GTK_SIZE_GROUP_HORIZONTAL =>
        SizeGroupMode.HORIZONTAL
      case GtkSizeGroupMode.GTK_SIZE_GROUP_VERTICAL => SizeGroupMode.VERTICAL
      case GtkSizeGroupMode.GTK_SIZE_GROUP_BOTH     => SizeGroupMode.BOTH
  end fromRaw
end SizeGroupMode
