package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.gdkpixbuf.fluent.Pixbuf
import sn.gnome.gio.fluent.File
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkContentFit
import sn.gnome.gtk4.internal.GtkPicture

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The `GtkPicture` widget displays a `GdkPaintable`.
  *
  * ![An example GtkPicture](picture.png)
  *
  * Many convenience functions are provided to make pictures simple to use. For
  * example, if you want to load an image from a file, and then display it,
  * there’s a convenience function to do this:
  *
  * ```c
  * GtkWidget *widget = gtk_picture_new_for_filename ("myfile.png");
  * ```
  *
  * If the file isn’t loaded successfully, the picture will contain a “broken
  * image” icon similar to that used in many web browsers. If you want to handle
  * errors in loading the file yourself, for example by displaying an error
  * message, then load the image with [ctor@Gdk.Texture.new_from_file], then
  * create the `GtkPicture` with [ctor@Gtk.Picture.new_for_paintable].
  *
  * Sometimes an application will want to avoid depending on external data
  * files, such as image files. See the documentation of `GResource` for
  * details. In this case, [ctor@Gtk.Picture.new_for_resource] and
  * [method@Gtk.Picture.set_resource] should be used.
  *
  * `GtkPicture` displays an image at its natural size. See [class@Gtk.Image] if
  * you want to display a fixed-size image, such as an icon.
  *
  * ## Sizing the paintable
  *
  * You can influence how the paintable is displayed inside the `GtkPicture` by
  * changing [property@Gtk.Picture:content-fit]. See [enum@Gtk.ContentFit] for
  * details. [property@Gtk.Picture:can-shrink] can be unset to make sure that
  * paintables are never made smaller than their ideal size - but be careful if
  * you do not know the size of the paintable in use (like when displaying
  * user-loaded images). This can easily cause the picture to grow larger than
  * the screen. And [property@Gtk.Widget:halign] and
  * [property@Gtk.Widget:valign] can be used to make sure the paintable doesn't
  * fill all available space but is instead displayed at its original size.
  *
  * ## CSS nodes
  *
  * `GtkPicture` has a single CSS node with the name `picture`.
  *
  * ## Accessibility
  *
  * `GtkPicture` uses the `GTK_ACCESSIBLE_ROLE_IMG` role.
  */
class Picture(raw: Ptr[GtkPicture])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the alternative textual description of the picture.
    *
    * The returned string will be %NULL if the picture cannot be described
    * textually.
    */
  def getAlternativeText()(using Zone): String /* None */ = fromCString(
    gtk_picture_get_alternative_text(
      this.raw.asInstanceOf[Ptr[GtkPicture]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the `GtkPicture` respects its contents size.
    */
  def getCanShrink(): Boolean /* None */ = gtk_picture_get_can_shrink(
    this.raw.asInstanceOf[Ptr[GtkPicture]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the fit mode for the content of the `GtkPicture`.
    *
    * See [enum@Gtk.ContentFit] for details.
    */
  def getContentFit(): GtkContentFit /* None */ = gtk_picture_get_content_fit(
    this.raw.asInstanceOf[Ptr[GtkPicture]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `GFile` currently displayed if @self is displaying a file.
    *
    * If @self is not displaying a file, for example when
    * [method@Gtk.Picture.set_paintable] was used, then %NULL is returned.
    */
  def getFile(): File /* None */ = new File.Abstract(
    gtk_picture_get_file(this.raw.asInstanceOf[Ptr[GtkPicture]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the `GtkPicture` preserves its contents aspect ratio.
    */
  def getKeepAspectRatio(): Boolean /* None */ =
    gtk_picture_get_keep_aspect_ratio(
      this.raw.asInstanceOf[Ptr[GtkPicture]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `GdkPaintable` being displayed by the `GtkPicture`.
    */
  def getPaintable(): Paintable /* None */ = new Paintable.Abstract(
    gtk_picture_get_paintable(
      this.raw.asInstanceOf[Ptr[GtkPicture]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets an alternative textual description for the picture contents.
    *
    * It is equivalent to the "alt" attribute for images on websites.
    *
    * This text will be made available to accessibility tools.
    *
    * If the picture cannot be described textually, set this property to %NULL.
    */
  def setAlternativeText(
      alternative_text: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_picture_set_alternative_text(
    this.raw.asInstanceOf[Ptr[GtkPicture]],
    alternative_text
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If set to %TRUE, the @self can be made smaller than its contents.
    *
    * The contents will then be scaled down when rendering.
    *
    * If you want to still force a minimum size manually, consider using
    * [method@Gtk.Widget.set_size_request].
    *
    * Also of note is that a similar function for growing does not exist because
    * the grow behavior can be controlled via [method@Gtk.Widget.set_halign] and
    * [method@Gtk.Widget.set_valign].
    */
  def setCanShrink(
      can_shrink: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_picture_set_can_shrink(
    this.raw.asInstanceOf[Ptr[GtkPicture]],
    gboolean(gint((if can_shrink == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets how the content should be resized to fit the `GtkPicture`.
    *
    * See [enum@Gtk.ContentFit] for details.
    */
  def setContentFit(
      content_fit: GtkContentFit /* Some(GtkContentFit) */
  ): Unit /* None */ = gtk_picture_set_content_fit(
    this.raw.asInstanceOf[Ptr[GtkPicture]],
    content_fit
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Makes @self load and display @file.
    *
    * See [ctor@Gtk.Picture.new_for_file] for details.
    */
  def setFile(
      file: Option[File /* Some(Ptr[_root_.sn.gnome.gio.internal.GFile]) */ ]
  ): Unit /* None */ = gtk_picture_set_file(
    this.raw.asInstanceOf[Ptr[GtkPicture]],
    file
      .map[Ptr[_root_.sn.gnome.gio.internal.GFile]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GFile]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Makes @self load and display the given @filename.
    *
    * This is a utility function that calls [method@Gtk.Picture.set_file].
    */
  def setFilename(
      filename: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_picture_set_filename(
    this.raw.asInstanceOf[Ptr[GtkPicture]],
    filename
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If set to %TRUE, the @self will render its contents according to their
    * aspect ratio.
    *
    * That means that empty space may show up at the top/bottom or left/right of @self.
    *
    * If set to %FALSE or if the contents provide no aspect ratio, the contents
    * will be stretched over the picture's whole area.
    */
  def setKeepAspectRatio(
      keep_aspect_ratio: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_picture_set_keep_aspect_ratio(
    this.raw.asInstanceOf[Ptr[GtkPicture]],
    gboolean(gint((if keep_aspect_ratio == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Makes @self display the given @paintable.
    *
    * If @paintable is %NULL, nothing will be displayed.
    *
    * See [ctor@Gtk.Picture.new_for_paintable] for details.
    */
  def setPaintable(
      paintable: Option[
        Paintable /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]) */
      ]
  ): Unit /* None */ = gtk_picture_set_paintable(
    this.raw.asInstanceOf[Ptr[GtkPicture]],
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
    * Sets a `GtkPicture` to show a `GdkPixbuf`.
    *
    * See [ctor@Gtk.Picture.new_for_pixbuf] for details.
    *
    * This is a utility function that calls [method@Gtk.Picture.set_paintable].
    */
  def setPixbuf(
      pixbuf: Option[
        Pixbuf /* Some(Ptr[_root_.sn.gnome.gdkpixbuf.internal.GdkPixbuf]) */
      ]
  ): Unit /* None */ = gtk_picture_set_pixbuf(
    this.raw.asInstanceOf[Ptr[GtkPicture]],
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
    * Makes @self load and display the resource at the given
    * @resource_path.
    *
    * This is a utility function that calls [method@Gtk.Picture.set_file].
    */
  def setResource(
      resource_path: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_picture_set_resource(
    this.raw.asInstanceOf[Ptr[GtkPicture]],
    resource_path
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Picture

object Picture:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new empty `GtkPicture` widget.
    */
  def apply(): Picture = new Picture(gtk_picture_new().asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkPicture` displaying the given @file.
    *
    * If the file isn’t found or can’t be loaded, the resulting `GtkPicture` is
    * empty.
    *
    * If you need to detect failures to load the file, use
    * [ctor@Gdk.Texture.new_from_file] to load the file yourself, then create
    * the `GtkPicture` from the texture.
    */
  def forFile(
      file: Option[File /* Some(Ptr[_root_.sn.gnome.gio.internal.GFile]) */ ]
  ): Picture = new Picture(
    gtk_picture_new_for_file(
      file
        .map[Ptr[_root_.sn.gnome.gio.internal.GFile]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GFile]])
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkPicture` displaying the file @filename.
    *
    * This is a utility function that calls [ctor@Gtk.Picture.new_for_file]. See
    * that function for details.
    */
  def forFilename(
      filename: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Picture = new Picture(
    gtk_picture_new_for_filename(
      filename
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkPicture` displaying @paintable.
    *
    * The `GtkPicture` will track changes to the @paintable and update its size
    * and contents in response to it.
    */
  def forPaintable(
      paintable: Option[
        Paintable /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]) */
      ]
  ): Picture = new Picture(
    gtk_picture_new_for_paintable(
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
    * Creates a new `GtkPicture` displaying @pixbuf.
    *
    * This is a utility function that calls
    * [ctor@Gtk.Picture.new_for_paintable], See that function for details.
    *
    * The pixbuf must not be modified after passing it to this function.
    */
  def forPixbuf(
      pixbuf: Option[
        Pixbuf /* Some(Ptr[_root_.sn.gnome.gdkpixbuf.internal.GdkPixbuf]) */
      ]
  ): Picture = new Picture(
    gtk_picture_new_for_pixbuf(
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
    * Creates a new `GtkPicture` displaying the resource at @resource_path.
    *
    * This is a utility function that calls [ctor@Gtk.Picture.new_for_file]. See
    * that function for details.
    */
  def forResource(
      resource_path: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Picture = new Picture(
    gtk_picture_new_for_resource(
      resource_path
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Picture
