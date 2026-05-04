package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkImageType

/** Describes the image data representation used by a [class@Gtk.Image].
  *
  * If you want to get the image from the widget, you can only get the
  * currently-stored representation; for instance, if the
  * gtk_image_get_storage_type() returns %GTK_IMAGE_PAINTABLE, then you can call
  * gtk_image_get_paintable().
  *
  * For empty images, you can request any storage type (call any of the "get"
  * functions), but they will all return %NULL values.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum ImageType(val raw: GtkImageType):
  /** there is no image displayed by the widget
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EMPTY extends ImageType(GtkImageType.GTK_IMAGE_EMPTY)

  /** the widget contains a named icon
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ICON_NAME extends ImageType(GtkImageType.GTK_IMAGE_ICON_NAME)

  /** the widget contains a `GIcon`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GICON extends ImageType(GtkImageType.GTK_IMAGE_GICON)

  /** the widget contains a `GdkPaintable`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PAINTABLE extends ImageType(GtkImageType.GTK_IMAGE_PAINTABLE)
end ImageType

object ImageType:
  def fromRaw(raw: GtkImageType): ImageType =
    raw match
      case GtkImageType.GTK_IMAGE_EMPTY     => ImageType.EMPTY
      case GtkImageType.GTK_IMAGE_ICON_NAME => ImageType.ICON_NAME
      case GtkImageType.GTK_IMAGE_GICON     => ImageType.GICON
      case GtkImageType.GTK_IMAGE_PAINTABLE => ImageType.PAINTABLE
  end fromRaw
end ImageType
