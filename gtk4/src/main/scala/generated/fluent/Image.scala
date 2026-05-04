package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.gdkpixbuf.fluent.Pixbuf
import sn.gnome.gio.fluent.Icon
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  ConstraintTarget,
  IconSize,
  ImageType,
  Widget
}
import sn.gnome.gtk4.internal.GtkImage

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The `GtkImage` widget displays an image.
  *
  * ![An example GtkImage](image.png)
  *
  * Various kinds of object can be displayed as an image; most typically, you
  * would load a `GdkTexture` from a file, using the convenience function
  * [ctor@Gtk.Image.new_from_file], for instance:
  *
  * ```c
  * GtkWidget *image = gtk_image_new_from_file ("myfile.png");
  * ```
  *
  * If the file isn’t loaded successfully, the image will contain a “broken
  * image” icon similar to that used in many web browsers.
  *
  * If you want to handle errors in loading the file yourself, for example by
  * displaying an error message, then load the image with
  * [ctor@Gdk.Texture.new_from_file], then create the `GtkImage` with
  * [ctor@Gtk.Image.new_from_paintable].
  *
  * Sometimes an application will want to avoid depending on external data
  * files, such as image files. See the documentation of `GResource` inside GIO,
  * for details. In this case, [property@Gtk.Image:resource],
  * [ctor@Gtk.Image.new_from_resource], and [method@Gtk.Image.set_from_resource]
  * should be used.
  *
  * `GtkImage` displays its image as an icon, with a size that is determined by
  * the application. See [class@Gtk.Picture] if you want to show an image at is
  * actual size.
  *
  * ## CSS nodes
  *
  * `GtkImage` has a single CSS node with the name `image`. The style classes
  * `.normal-icons` or `.large-icons` may appear, depending on the
  * [property@Gtk.Image:icon-size] property.
  *
  * ## Accessibility
  *
  * `GtkImage` uses the `GTK_ACCESSIBLE_ROLE_IMG` role.
  */
class Image(raw: Ptr[GtkImage])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Resets the image to be empty.
    */
  def clear(): Unit /* None */ = gtk_image_clear(
    this.raw.asInstanceOf[Ptr[GtkImage]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `GIcon` being displayed by the `GtkImage`.
    *
    * The storage type of the image must be %GTK_IMAGE_EMPTY or %GTK_IMAGE_GICON
    * (see [method@Gtk.Image.get_storage_type]). The caller of this function
    * does not own a reference to the returned `GIcon`.
    */
  def getGicon(): Icon /* None */ = new Icon.Abstract(
    gtk_image_get_gicon(this.raw.asInstanceOf[Ptr[GtkImage]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the icon name and size being displayed by the `GtkImage`.
    *
    * The storage type of the image must be %GTK_IMAGE_EMPTY or
    * %GTK_IMAGE_ICON_NAME (see [method@Gtk.Image.get_storage_type]). The
    * returned string is owned by the `GtkImage` and should not be freed.
    */
  def getIconName()(using Zone): String /* None */ = fromCString(
    gtk_image_get_icon_name(this.raw.asInstanceOf[Ptr[GtkImage]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the icon size used by the @image when rendering icons.
    */
  def getIconSize(): IconSize /* None */ = IconSize.fromRaw(
    gtk_image_get_icon_size(this.raw.asInstanceOf[Ptr[GtkImage]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the image `GdkPaintable` being displayed by the `GtkImage`.
    *
    * The storage type of the image must be %GTK_IMAGE_EMPTY or
    * %GTK_IMAGE_PAINTABLE (see [method@Gtk.Image.get_storage_type]). The caller
    * of this function does not own a reference to the returned paintable.
    */
  def getPaintable(): Paintable /* None */ = new Paintable.Abstract(
    gtk_image_get_paintable(this.raw.asInstanceOf[Ptr[GtkImage]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the pixel size used for named icons.
    */
  def getPixelSize(): Int /* None */ = gtk_image_get_pixel_size(
    this.raw.asInstanceOf[Ptr[GtkImage]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the type of representation being used by the `GtkImage` to store
    * image data.
    *
    * If the `GtkImage` has no image data, the return value will be
    * %GTK_IMAGE_EMPTY.
    */
  def getStorageType(): ImageType /* None */ = ImageType.fromRaw(
    gtk_image_get_storage_type(this.raw.asInstanceOf[Ptr[GtkImage]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a `GtkImage` to show a file.
    *
    * See [ctor@Gtk.Image.new_from_file] for details.
    */
  def setFromFile(
      filename: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_image_set_from_file(
    this.raw.asInstanceOf[Ptr[GtkImage]],
    filename
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a `GtkImage` to show a `GIcon`.
    *
    * See [ctor@Gtk.Image.new_from_gicon] for details.
    */
  def setFromGicon(
      icon: Icon /* Some(Ptr[_root_.sn.gnome.gio.internal.GIcon]) */
  ): Unit /* None */ = gtk_image_set_from_gicon(
    this.raw.asInstanceOf[Ptr[GtkImage]],
    icon.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a `GtkImage` to show a named icon.
    *
    * See [ctor@Gtk.Image.new_from_icon_name] for details.
    */
  def setFromIconName(
      icon_name: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_image_set_from_icon_name(
    this.raw.asInstanceOf[Ptr[GtkImage]],
    icon_name
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a `GtkImage` to show a `GdkPaintable`.
    *
    * See [ctor@Gtk.Image.new_from_paintable] for details.
    */
  def setFromPaintable(
      paintable: Option[
        Paintable /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]) */
      ]
  ): Unit /* None */ = gtk_image_set_from_paintable(
    this.raw.asInstanceOf[Ptr[GtkImage]],
    paintable
      .map[Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]]
      )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a `GtkImage` to show a `GdkPixbuf`.
    *
    * See [ctor@Gtk.Image.new_from_pixbuf] for details.
    *
    * Note: This is a helper for [method@Gtk.Image.set_from_paintable], and you
    * can't get back the exact pixbuf once this is called, only a paintable.
    */
  def setFromPixbuf(
      pixbuf: Option[
        Pixbuf /* Some(Ptr[_root_.sn.gnome.gdkpixbuf.internal.GdkPixbuf]) */
      ]
  ): Unit /* None */ = gtk_image_set_from_pixbuf(
    this.raw.asInstanceOf[Ptr[GtkImage]],
    pixbuf
      .map[Ptr[_root_.sn.gnome.gdkpixbuf.internal.GdkPixbuf]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gdkpixbuf.internal.GdkPixbuf]]
      )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a `GtkImage` to show a resource.
    *
    * See [ctor@Gtk.Image.new_from_resource] for details.
    */
  def setFromResource(
      resource_path: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_image_set_from_resource(
    this.raw.asInstanceOf[Ptr[GtkImage]],
    resource_path
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Suggests an icon size to the theme for named icons.
    */
  def setIconSize(
      icon_size: IconSize /* Some(GtkIconSize) */
  ): Unit /* None */ =
    gtk_image_set_icon_size(this.raw.asInstanceOf[Ptr[GtkImage]], icon_size.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the pixel size to use for named icons.
    *
    * If the pixel size is set to a value != -1, it is used instead of the icon
    * size set by [method@Gtk.Image.set_from_icon_name].
    */
  def setPixelSize(pixel_size: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_image_set_pixel_size(this.raw.asInstanceOf[Ptr[GtkImage]], pixel_size)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Image

object Image:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new empty `GtkImage` widget.
    */
  def apply(): Image = new Image(gtk_image_new().asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkImage` displaying the file @filename.
    *
    * If the file isn’t found or can’t be loaded, the resulting `GtkImage` will
    * display a “broken image” icon. This function never returns %NULL, it
    * always returns a valid `GtkImage` widget.
    *
    * If you need to detect failures to load the file, use
    * [ctor@Gdk.Texture.new_from_file] to load the file yourself, then create
    * the `GtkImage` from the texture.
    *
    * The storage type (see [method@Gtk.Image.get_storage_type]) of the returned
    * image is not defined, it will be whatever is appropriate for displaying
    * the file.
    */
  def fromFile(
      filename: String | CString /* Some(CString) */
  )(using Zone): Image = new Image(
    gtk_image_new_from_file(__sn_extract_string(filename)).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GtkImage` displaying an icon from the current icon theme.
    *
    * If the icon name isn’t known, a “broken image” icon will be displayed
    * instead. If the current icon theme is changed, the icon will be updated
    * appropriately.
    */
  def fromGicon(
      icon: Icon /* Some(Ptr[_root_.sn.gnome.gio.internal.GIcon]) */
  ): Image = new Image(
    gtk_image_new_from_gicon(
      icon.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GtkImage` displaying an icon from the current icon theme.
    *
    * If the icon name isn’t known, a “broken image” icon will be displayed
    * instead. If the current icon theme is changed, the icon will be updated
    * appropriately.
    */
  def fromIconName(
      icon_name: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Image = new Image(
    gtk_image_new_from_icon_name(
      icon_name
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkImage` displaying @paintable.
    *
    * The `GtkImage` does not assume a reference to the paintable; you still
    * need to unref it if you own references. `GtkImage` will add its own
    * reference rather than adopting yours.
    *
    * The `GtkImage` will track changes to the @paintable and update its size
    * and contents in response to it.
    */
  def fromPaintable(
      paintable: Option[
        Paintable /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]) */
      ]
  ): Image = new Image(
    gtk_image_new_from_paintable(
      paintable
        .map[Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]]
        )
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkImage` displaying @pixbuf.
    *
    * The `GtkImage` does not assume a reference to the pixbuf; you still need
    * to unref it if you own references. `GtkImage` will add its own reference
    * rather than adopting yours.
    *
    * This is a helper for [ctor@Gtk.Image.new_from_paintable], and you can't
    * get back the exact pixbuf once this is called, only a texture.
    *
    * Note that this function just creates an `GtkImage` from the pixbuf. The
    * `GtkImage` created will not react to state changes. Should you want that,
    * you should use [ctor@Gtk.Image.new_from_icon_name].
    */
  def fromPixbuf(
      pixbuf: Option[
        Pixbuf /* Some(Ptr[_root_.sn.gnome.gdkpixbuf.internal.GdkPixbuf]) */
      ]
  ): Image = new Image(
    gtk_image_new_from_pixbuf(
      pixbuf
        .map[Ptr[_root_.sn.gnome.gdkpixbuf.internal.GdkPixbuf]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gdkpixbuf.internal.GdkPixbuf]]
        )
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkImage` displaying the resource file @resource_path.
    *
    * If the file isn’t found or can’t be loaded, the resulting `GtkImage` will
    * display a “broken image” icon. This function never returns %NULL, it
    * always returns a valid `GtkImage` widget.
    *
    * If you need to detect failures to load the file, use
    * [ctor@GdkPixbuf.Pixbuf.new_from_file] to load the file yourself, then
    * create the `GtkImage` from the pixbuf.
    *
    * The storage type (see [method@Gtk.Image.get_storage_type]) of the returned
    * image is not defined, it will be whatever is appropriate for displaying
    * the file.
    */
  def fromResource(
      resource_path: String | CString /* Some(CString) */
  )(using Zone): Image = new Image(
    gtk_image_new_from_resource(__sn_extract_string(resource_path)).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Image
