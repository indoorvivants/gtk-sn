package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkIconSize

/** Built-in icon sizes.
  *
  * Icon sizes default to being inherited. Where they cannot be inherited, text
  * size is the default.
  *
  * All widgets which use `GtkIconSize` set the normal-icons or large-icons
  * style classes correspondingly, and let themes determine the actual size to
  * be used with the `-gtk-icon-size` CSS property.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum IconSize(val raw: GtkIconSize):
  /** Keep the size of the parent element
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INHERIT extends IconSize(GtkIconSize.GTK_ICON_SIZE_INHERIT)

  /** Size similar to text size
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NORMAL extends IconSize(GtkIconSize.GTK_ICON_SIZE_NORMAL)

  /** Large size, for example in an icon view
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LARGE extends IconSize(GtkIconSize.GTK_ICON_SIZE_LARGE)
end IconSize

object IconSize:
  def fromRaw(raw: GtkIconSize): IconSize =
    raw match
      case GtkIconSize.GTK_ICON_SIZE_INHERIT => IconSize.INHERIT
      case GtkIconSize.GTK_ICON_SIZE_NORMAL  => IconSize.NORMAL
      case GtkIconSize.GTK_ICON_SIZE_LARGE   => IconSize.LARGE
  end fromRaw
end IconSize
