package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkSizeGroupMode

/** The mode of the size group determines the directions in which the size group
  * affects the requested sizes of its component widgets.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum SizeGroupMode(val raw: GtkSizeGroupMode):
  /** group has no effect
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends SizeGroupMode(GtkSizeGroupMode.GTK_SIZE_GROUP_NONE)

  /** group affects horizontal requisition
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HORIZONTAL
      extends SizeGroupMode(GtkSizeGroupMode.GTK_SIZE_GROUP_HORIZONTAL)

  /** group affects vertical requisition
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case VERTICAL extends SizeGroupMode(GtkSizeGroupMode.GTK_SIZE_GROUP_VERTICAL)

  /** group affects both horizontal and vertical requisition
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
