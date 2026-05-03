package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkIconSize

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Built-in icon sizes.
  *
  * Icon sizes default to being inherited. Where they cannot be inherited, text
  * size is the default.
  *
  * All widgets which use `GtkIconSize` set the normal-icons or large-icons
  * style classes correspondingly, and let themes determine the actual size to
  * be used with the `-gtk-icon-size` CSS property.
  */
enum IconSize(val raw: GtkIconSize):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Keep the size of the parent element
    */
  case INHERIT extends IconSize(GtkIconSize.GTK_ICON_SIZE_INHERIT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Size similar to text size
    */
  case NORMAL extends IconSize(GtkIconSize.GTK_ICON_SIZE_NORMAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Large size, for example in an icon view
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
