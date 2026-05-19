package sn.gnome.gdkpixbuf

import _root_.sn.gnome.gdkpixbuf.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdkpixbuf.{Colorspace, InterpType, Pixbuf, PixbufRotation}
import sn.gnome.gdkpixbuf.internal.GdkPixbuf
import sn.gnome.gio.{
  AsyncResult,
  Cancellable,
  Icon,
  InputStream,
  LoadableIcon,
  OutputStream
}
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.{
  gboolean,
  gchar,
  gfloat,
  gint,
  gsize,
  guchar,
  guint32,
  guint8
}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/** A pixel buffer.
  *
  * `GdkPixbuf` contains information about an image's pixel data, its color
  * space, bits per sample, width and height, and the rowstride (the number of
  * bytes between the start of one row and the start of the next).
  *
  * ## Creating new `GdkPixbuf`
  *
  * The most basic way to create a pixbuf is to wrap an existing pixel buffer
  * with a [class@GdkPixbuf.Pixbuf] instance. You can use the
  * [`ctor@GdkPixbuf.Pixbuf.new_from_data`] function to do this.
  *
  * Every time you create a new `GdkPixbuf` instance for some data, you will
  * need to specify the destroy notification function that will be called when
  * the data buffer needs to be freed; this will happen when a `GdkPixbuf` is
  * finalized by the reference counting functions. If you have a chunk of static
  * data compiled into your application, you can pass in `NULL` as the destroy
  * notification function so that the data will not be freed.
  *
  * The [`ctor@GdkPixbuf.Pixbuf.new`] constructor function can be used as a
  * convenience to create a pixbuf with an empty buffer; this is equivalent to
  * allocating a data buffer using `malloc()` and then wrapping it with
  * `gdk_pixbuf_new_from_data()`. The `gdk_pixbuf_new()` function will compute
  * an optimal rowstride so that rendering can be performed with an efficient
  * algorithm.
  *
  * As a special case, you can use the
  * [`ctor@GdkPixbuf.Pixbuf.new_from_xpm_data`] function to create a pixbuf from
  * inline XPM image data.
  *
  * You can also copy an existing pixbuf with the [method@Pixbuf.copy] function.
  * This is not the same as just acquiring a reference to the old pixbuf
  * instance: the copy function will actually duplicate the pixel data in memory
  * and create a new [class@Pixbuf] instance for it.
  *
  * ## Reference counting
  *
  * `GdkPixbuf` structures are reference counted. This means that an application
  * can share a single pixbuf among many parts of the code. When a piece of the
  * program needs to use a pixbuf, it should acquire a reference to it by
  * calling `g_object_ref()`; when it no longer needs the pixbuf, it should
  * release the reference it acquired by calling `g_object_unref()`. The
  * resources associated with a `GdkPixbuf` will be freed when its reference
  * count drops to zero. Newly-created `GdkPixbuf` instances start with a
  * reference count of one.
  *
  * ## Image Data
  *
  * Image data in a pixbuf is stored in memory in an uncompressed, packed
  * format. Rows in the image are stored top to bottom, and in each row pixels
  * are stored from left to right.
  *
  * There may be padding at the end of a row.
  *
  * The "rowstride" value of a pixbuf, as returned by
  * [`method@GdkPixbuf.Pixbuf.get_rowstride`], indicates the number of bytes
  * between rows.
  *
  * **NOTE**: If you are copying raw pixbuf data with `memcpy()` note that the
  * last row in the pixbuf may not be as wide as the full rowstride, but rather
  * just as wide as the pixel data needs to be; that is: it is unsafe to do
  * `memcpy (dest, pixels, rowstride * height)` to copy a whole pixbuf. Use
  * [method@GdkPixbuf.Pixbuf.copy] instead, or compute the width in bytes of the
  * last row as:
  *
  * ```c
  * last_row = width * ((n_channels * bits_per_sample + 7) / 8);
  * ```
  *
  * The same rule applies when iterating over each row of a `GdkPixbuf` pixels
  * array.
  *
  * The following code illustrates a simple `put_pixel()` function for RGB
  * pixbufs with 8 bits per channel with an alpha channel.
  *
  * ```c
  * static void
  * put_pixel (GdkPixbuf *pixbuf,
  *            int x,
  * 	   int y,
  * 	   guchar red,
  * 	   guchar green,
  * 	   guchar blue,
  * 	   guchar alpha)
  * {
  *   int n_channels = gdk_pixbuf_get_n_channels (pixbuf);
  *
  *   // Ensure that the pixbuf is valid
  *   g_assert (gdk_pixbuf_get_colorspace (pixbuf) == GDK_COLORSPACE_RGB);
  *   g_assert (gdk_pixbuf_get_bits_per_sample (pixbuf) == 8);
  *   g_assert (gdk_pixbuf_get_has_alpha (pixbuf));
  *   g_assert (n_channels == 4);
  *
  *   int width = gdk_pixbuf_get_width (pixbuf);
  *   int height = gdk_pixbuf_get_height (pixbuf);
  *
  *   // Ensure that the coordinates are in a valid range
  *   g_assert (x >= 0 && x < width);
  *   g_assert (y >= 0 && y < height);
  *
  *   int rowstride = gdk_pixbuf_get_rowstride (pixbuf);
  *
  *   // The pixel buffer in the GdkPixbuf instance
  *   guchar *pixels = gdk_pixbuf_get_pixels (pixbuf);
  *
  *   // The pixel we wish to modify
  *   guchar *p = pixels + y * rowstride + x * n_channels;
  *   p[0] = red;
  *   p[1] = green;
  *   p[2] = blue;
  *   p[3] = alpha;
  * }
  * ```
  *
  * ## Loading images
  *
  * The `GdkPixBuf` class provides a simple mechanism for loading an image from
  * a file in synchronous and asynchronous fashion.
  *
  * For GUI applications, it is recommended to use the asynchronous stream API
  * to avoid blocking the control flow of the application.
  *
  * Additionally, `GdkPixbuf` provides the [class@GdkPixbuf.PixbufLoader`] API
  * for progressive image loading.
  *
  * ## Saving images
  *
  * The `GdkPixbuf` class provides methods for saving image data in a number of
  * file formats. The formatted data can be written to a file or to a memory
  * buffer. `GdkPixbuf` can also call a user-defined callback on the data, which
  * allows to e.g. write the image to a socket or store it in a database.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Pixbuf private[gnome] (raw: Ptr[GdkPixbuf])
    extends Object(raw.asInstanceOf),
      Icon,
      LoadableIcon:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Takes an existing pixbuf and adds an alpha channel to it.
    *
    * If the existing pixbuf already had an alpha channel, the channel values
    * are copied from the original; otherwise, the alpha channel is initialized
    * to 255 (full opacity).
    *
    * If `substitute_color` is `TRUE`, then the color specified by the (`r`,
    * `g`, `b`) arguments will be assigned zero opacity. That is, if you pass
    * `(255, 255, 255)` for the substitute color, all white pixels will become
    * fully transparent.
    *
    * If `substitute_color` is `FALSE`, then the (`r`, `g`, `b`) arguments will
    * be ignored.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addAlpha(
      substitute_color: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      r: UByte /* Some(_root_.sn.gnome.glib.internal.guchar) */,
      g: UByte /* Some(_root_.sn.gnome.glib.internal.guchar) */,
      b: UByte /* Some(_root_.sn.gnome.glib.internal.guchar) */
  )(using Runtime): sn.gnome.gdkpixbuf.Pixbuf /* None */ =
    sn.gnome.gdkpixbuf.Pixbuf.applyUnsafe(
      gdk_pixbuf_add_alpha(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]],
        gboolean(gint((if substitute_color == true then 1 else 0))),
        guchar(r),
        guchar(g),
        guchar(b)
      ).asInstanceOf
    )
  end addAlpha

  /** Takes an existing pixbuf and checks for the presence of an associated
    * "orientation" option.
    *
    * The orientation option may be provided by the JPEG loader (which reads the
    * exif orientation tag) or the TIFF loader (which reads the TIFF orientation
    * tag, and compensates it for the partial transforms performed by libtiff).
    *
    * If an orientation option/tag is present, the appropriate transform will be
    * performed so that the pixbuf is oriented correctly.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def applyEmbeddedOrientation()(using
      Runtime
  ): sn.gnome.gdkpixbuf.Pixbuf /* None */ =
    sn.gnome.gdkpixbuf.Pixbuf.applyUnsafe(
      gdk_pixbuf_apply_embedded_orientation(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]]
      ).asInstanceOf
    )
  end applyEmbeddedOrientation

  /** Creates a transformation of the source image @src by scaling by
    * @scale_x
    *   and @scale_y then translating by @offset_x and @offset_y.
    *
    * This gives an image in the coordinates of the destination pixbuf. The
    * rectangle (@dest_x, @dest_y, @dest_width, @dest_height) is then alpha
    * blended onto the corresponding rectangle of the original destination
    * image.
    *
    * When the destination rectangle contains parts not in the source image, the
    * data at the edges of the source image is replicated to infinity.
    *
    * ![](composite.png)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def composite(
      dest: sn.gnome.gdkpixbuf.Pixbuf /* Some(Ptr[GdkPixbuf]) */,
      dest_x: Int /* Some(CInt) */,
      dest_y: Int /* Some(CInt) */,
      dest_width: Int /* Some(CInt) */,
      dest_height: Int /* Some(CInt) */,
      offset_x: Double /* Some(Double) */,
      offset_y: Double /* Some(Double) */,
      scale_x: Double /* Some(Double) */,
      scale_y: Double /* Some(Double) */,
      interp_type: InterpType /* Some(GdkInterpType) */,
      overall_alpha: Int /* Some(CInt) */
  )(using Runtime): Unit /* None */ =
    gdk_pixbuf_composite(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]],
      dest.getUnsafeRawPointer().asInstanceOf,
      dest_x,
      dest_y,
      dest_width,
      dest_height,
      offset_x,
      offset_y,
      scale_x,
      scale_y,
      interp_type.raw,
      overall_alpha
    )
  end composite

  /** Creates a transformation of the source image @src by scaling by
    * @scale_x
    *   and @scale_y then translating by @offset_x and @offset_y, then alpha
    *   blends the rectangle (@dest_x ,@dest_y, @dest_width,
    * @dest_height)
    *   of the resulting image with a checkboard of the colors @color1 and @color2
    *   and renders it onto the destination image.
    *
    * If the source image has no alpha channel, and @overall_alpha is 255, a
    * fast path is used which omits the alpha blending and just performs the
    * scaling.
    *
    * See gdk_pixbuf_composite_color_simple() for a simpler variant of this
    * function suitable for many tasks.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def compositeColor(
      dest: sn.gnome.gdkpixbuf.Pixbuf /* Some(Ptr[GdkPixbuf]) */,
      dest_x: Int /* Some(CInt) */,
      dest_y: Int /* Some(CInt) */,
      dest_width: Int /* Some(CInt) */,
      dest_height: Int /* Some(CInt) */,
      offset_x: Double /* Some(Double) */,
      offset_y: Double /* Some(Double) */,
      scale_x: Double /* Some(Double) */,
      scale_y: Double /* Some(Double) */,
      interp_type: InterpType /* Some(GdkInterpType) */,
      overall_alpha: Int /* Some(CInt) */,
      check_x: Int /* Some(CInt) */,
      check_y: Int /* Some(CInt) */,
      check_size: Int /* Some(CInt) */,
      color1: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */,
      color2: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */
  )(using Runtime): Unit /* None */ =
    gdk_pixbuf_composite_color(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]],
      dest.getUnsafeRawPointer().asInstanceOf,
      dest_x,
      dest_y,
      dest_width,
      dest_height,
      offset_x,
      offset_y,
      scale_x,
      scale_y,
      interp_type.raw,
      overall_alpha,
      check_x,
      check_y,
      check_size,
      guint32(color1),
      guint32(color2)
    )
  end compositeColor

  /** Creates a new pixbuf by scaling `src` to `dest_width` x `dest_height` and
    * alpha blending the result with a checkboard of colors `color1` and
    * `color2`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def compositeColorSimple(
      dest_width: Int /* Some(CInt) */,
      dest_height: Int /* Some(CInt) */,
      interp_type: InterpType /* Some(GdkInterpType) */,
      overall_alpha: Int /* Some(CInt) */,
      check_size: Int /* Some(CInt) */,
      color1: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */,
      color2: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */
  )(using Runtime): sn.gnome.gdkpixbuf.Pixbuf /* None */ =
    sn.gnome.gdkpixbuf.Pixbuf.applyUnsafe(
      gdk_pixbuf_composite_color_simple(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]],
        dest_width,
        dest_height,
        interp_type.raw,
        overall_alpha,
        check_size,
        guint32(color1),
        guint32(color2)
      ).asInstanceOf
    )
  end compositeColorSimple

  /** Creates a new `GdkPixbuf` with a copy of the information in the specified
    * `pixbuf`.
    *
    * Note that this does not copy the options set on the original `GdkPixbuf`,
    * use gdk_pixbuf_copy_options() for this.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy()(using Runtime): sn.gnome.gdkpixbuf.Pixbuf /* None */ =
    sn.gnome.gdkpixbuf.Pixbuf.applyUnsafe(
      gdk_pixbuf_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]]
      ).asInstanceOf
    )
  end copy

  /** Copies a rectangular area from `src_pixbuf` to `dest_pixbuf`.
    *
    * Conversion of pixbuf formats is done automatically.
    *
    * If the source rectangle overlaps the destination rectangle on the same
    * pixbuf, it will be overwritten during the copy operation. Therefore, you
    * can not use this function to scroll a pixbuf.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copyArea(
      src_x: Int /* Some(CInt) */,
      src_y: Int /* Some(CInt) */,
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */,
      dest_pixbuf: sn.gnome.gdkpixbuf.Pixbuf /* Some(Ptr[GdkPixbuf]) */,
      dest_x: Int /* Some(CInt) */,
      dest_y: Int /* Some(CInt) */
  )(using Runtime): Unit /* None */ =
    gdk_pixbuf_copy_area(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]],
      src_x,
      src_y,
      width,
      height,
      dest_pixbuf.getUnsafeRawPointer().asInstanceOf,
      dest_x,
      dest_y
    )
  end copyArea

  /** Copies the key/value pair options attached to a `GdkPixbuf` to another
    * `GdkPixbuf`.
    *
    * This is useful to keep original metadata after having manipulated a file.
    * However be careful to remove metadata which you've already applied, such
    * as the "orientation" option after rotating the image.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copyOptions(
      dest_pixbuf: sn.gnome.gdkpixbuf.Pixbuf /* Some(Ptr[GdkPixbuf]) */
  )(using Runtime): Boolean /* None */ =
    gdk_pixbuf_copy_options(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]],
      dest_pixbuf.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end copyOptions

  /** Clears a pixbuf to the given RGBA value, converting the RGBA value into
    * the pixbuf's pixel format.
    *
    * The alpha component will be ignored if the pixbuf doesn't have an alpha
    * channel.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fill(
      pixel: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */
  ): Unit /* None */ =
    gdk_pixbuf_fill(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]],
      guint32(pixel)
    )
  end fill

  /** Flips a pixbuf horizontally or vertically and returns the result in a new
    * pixbuf.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flip(
      horizontal: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Runtime): sn.gnome.gdkpixbuf.Pixbuf /* None */ =
    sn.gnome.gdkpixbuf.Pixbuf.applyUnsafe(
      gdk_pixbuf_flip(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]],
        gboolean(gint((if horizontal == true then 1 else 0)))
      ).asInstanceOf
    )
  end flip

  /** Queries the number of bits per color sample in a pixbuf.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBitsPerSample(): Int /* None */ =
    gdk_pixbuf_get_bits_per_sample(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]]
    )
  end getBitsPerSample

  /** Returns the length of the pixel data, in bytes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getByteLength(): CUnsignedLongInt /* None */ =
    gdk_pixbuf_get_byte_length(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]]
    ).value
  end getByteLength

  /** Queries the color space of a pixbuf.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getColorspace(): Colorspace /* None */ =
    Colorspace.fromRaw(
      gdk_pixbuf_get_colorspace(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]]
      )
    )
  end getColorspace

  /** Queries whether a pixbuf has an alpha channel (opacity information).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHasAlpha(): Boolean /* None */ =
    gdk_pixbuf_get_has_alpha(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]]
    ).value.!=(0)
  end getHasAlpha

  /** Queries the height of a pixbuf.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHeight(): Int /* None */ =
    gdk_pixbuf_get_height(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]]
    )
  end getHeight

  /** Queries the number of channels of a pixbuf.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNChannels(): Int /* None */ =
    gdk_pixbuf_get_n_channels(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]]
    )
  end getNChannels

  /** Looks up @key in the list of options that may have been attached to the
    * @pixbuf
    *   when it was loaded, or that may have been attached by another function
    *   using gdk_pixbuf_set_option().
    *
    * For instance, the ANI loader provides "Title" and "Artist" options. The
    * ICO, XBM, and XPM loaders provide "x_hot" and "y_hot" hot-spot options for
    * cursor definitions. The PNG loader provides the tEXt ancillary chunk
    * key/value pairs as options. Since 2.12, the TIFF and JPEG loaders return
    * an "orientation" option string that corresponds to the embedded TIFF/Exif
    * orientation tag (if present). Since 2.32, the TIFF loader sets the
    * "multipage" option string to "yes" when a multi-page TIFF is loaded. Since
    * 2.32 the JPEG and PNG loaders set "x-dpi" and "y-dpi" if the file contains
    * image density information in dots per inch. Since 2.36.6, the JPEG loader
    * sets the "comment" option with the comment EXIF tag.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getOption(
      key: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): String /* None */ =
    fromCString(
      gdk_pixbuf_get_option(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]],
        toCString(key).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )
  end getOption

  /** Returns a `GHashTable` with a list of all the options that may have been
    * attached to the `pixbuf` when it was loaded, or that may have been
    * attached by another function using [method@GdkPixbuf.Pixbuf.set_option].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_options/return type]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))), DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8))))),ListMap(@name -> DataRecord(GLib.HashTable), @type -> DataRecord(GHashTable*)))"
  )
  private def getOptions__ = ???

  /** Queries a pointer to the pixel data of a pixbuf.
    *
    * This function will cause an implicit copy of the pixbuf data if the pixbuf
    * was created from read-only data.
    *
    * Please see the section on [image data](class.Pixbuf.html#image-data) for
    * information about how the pixel data is stored in memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_pixels/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guchar)))),ListMap(@zero-terminated -> DataRecord(0), @type -> DataRecord(guchar*)))"
  )
  private def getPixels__ = ???

  /** Queries a pointer to the pixel data of a pixbuf.
    *
    * This function will cause an implicit copy of the pixbuf data if the pixbuf
    * was created from read-only data.
    *
    * Please see the section on [image data](class.Pixbuf.html#image-data) for
    * information about how the pixel data is stored in memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_pixels_with_length]: Method get_pixels_with_length contains an OUT parameter, which is not supported yet"
  )
  private def getPixelsWithLength__ = ???

  /** Queries the rowstride of a pixbuf, which is the number of bytes between
    * the start of a row and the start of the next row.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRowstride(): Int /* None */ =
    gdk_pixbuf_get_rowstride(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]]
    )
  end getRowstride

  /** Queries the width of a pixbuf.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWidth(): Int /* None */ =
    gdk_pixbuf_get_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]]
    )
  end getWidth

  /** Creates a new pixbuf which represents a sub-region of `src_pixbuf`.
    *
    * The new pixbuf shares its pixels with the original pixbuf, so writing to
    * one affects both. The new pixbuf holds a reference to `src_pixbuf`, so
    * `src_pixbuf` will not be finalized until the new pixbuf is finalized.
    *
    * Note that if `src_pixbuf` is read-only, this function will force it to be
    * mutable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def newSubpixbuf(
      src_x: Int /* Some(CInt) */,
      src_y: Int /* Some(CInt) */,
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */
  )(using Runtime): sn.gnome.gdkpixbuf.Pixbuf /* None */ =
    sn.gnome.gdkpixbuf.Pixbuf.applyUnsafe(
      gdk_pixbuf_new_subpixbuf(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]],
        src_x,
        src_y,
        width,
        height
      ).asInstanceOf
    )
  end newSubpixbuf

  /** Provides a #GBytes buffer containing the raw pixel data; the data must not
    * be modified.
    *
    * This function allows skipping the implicit copy that must be made if
    * gdk_pixbuf_get_pixels() is called on a read-only pixbuf.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_pixel_bytes/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def readPixelBytes__ = ???

  /** Provides a read-only pointer to the raw pixel data.
    *
    * This function allows skipping the implicit copy that must be made if
    * gdk_pixbuf_get_pixels() is called on a read-only pixbuf.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def readPixels(): Ptr[guint8] /* None */ =
    gdk_pixbuf_read_pixels(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]]
    )
  end readPixels

  /** Adds a reference to a pixbuf.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def ref()(using Runtime): sn.gnome.gdkpixbuf.Pixbuf /* None */ =
    sn.gnome.gdkpixbuf.Pixbuf.applyUnsafe(
      gdk_pixbuf_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]]
      ).asInstanceOf
    )
  end ref

  /** Removes the key/value pair option attached to a `GdkPixbuf`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeOption(
      key: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* None */ =
    gdk_pixbuf_remove_option(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]],
      toCString(key).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)
  end removeOption

  /** Rotates a pixbuf by a multiple of 90 degrees, and returns the result in a
    * new pixbuf.
    *
    * If `angle` is 0, this function will return a copy of `src`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def rotateSimple(
      angle: PixbufRotation /* Some(GdkPixbufRotation) */
  )(using Runtime): sn.gnome.gdkpixbuf.Pixbuf /* None */ =
    sn.gnome.gdkpixbuf.Pixbuf.applyUnsafe(
      gdk_pixbuf_rotate_simple(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]],
        angle.raw
      ).asInstanceOf
    )
  end rotateSimple

  /** Modifies saturation and optionally pixelates `src`, placing the result in
    * `dest`.
    *
    * The `src` and `dest` pixbufs must have the same image format, size, and
    * rowstride.
    *
    * The `src` and `dest` arguments may be the same pixbuf with no ill effects.
    *
    * If `saturation` is 1.0 then saturation is not changed. If it's less than
    * 1.0, saturation is reduced (the image turns toward grayscale); if greater
    * than 1.0, saturation is increased (the image gets more vivid colors).
    *
    * If `pixelate` is `TRUE`, then pixels are faded in a checkerboard pattern
    * to create a pixelated image.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def saturateAndPixelate(
      dest: sn.gnome.gdkpixbuf.Pixbuf /* Some(Ptr[GdkPixbuf]) */,
      saturation: Float /* Some(_root_.sn.gnome.glib.internal.gfloat) */,
      pixelate: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Runtime): Unit /* None */ =
    gdk_pixbuf_saturate_and_pixelate(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]],
      dest.getUnsafeRawPointer().asInstanceOf,
      gfloat(saturation),
      gboolean(gint((if pixelate == true then 1 else 0)))
    )
  end saturateAndPixelate

  /** Saves pixbuf to a file in format @type. By default, "jpeg", "png", "ico"
    * and "bmp" are possible file formats to save in, but more formats may be
    * installed. The list of all writable formats can be determined in the
    * following way:
    *
    * ```c
    * void add_if_writable (GdkPixbufFormat *data, GSList **list)
    * {
    *   if (gdk_pixbuf_format_is_writable (data))
    *     *list = g_slist_prepend (*list, data);
    * }
    *
    * GSList *formats = gdk_pixbuf_get_formats ();
    * GSList *writable_formats = NULL;
    * g_slist_foreach (formats, add_if_writable, &writable_formats);
    * g_slist_free (formats);
    * ```
    *
    * If `error` is set, `FALSE` will be returned. Possible errors include those
    * in the `GDK_PIXBUF_ERROR` domain and those in the `G_FILE_ERROR` domain.
    *
    * The variable argument list should be `NULL`-terminated; if not empty, it
    * should contain pairs of strings that modify the save parameters. For
    * example:
    *
    * ```c
    * gdk_pixbuf_save (pixbuf, handle, "jpeg", &error, "quality", "100", NULL);
    * ```
    *
    * Currently only few parameters exist.
    *
    * JPEG images can be saved with a "quality" parameter; its value should be
    * in the range `[0, 100]`. JPEG and PNG density can be set by setting the
    * "x-dpi" and "y-dpi" parameters to the appropriate values in dots per inch.
    *
    * Text chunks can be attached to PNG images by specifying parameters of the
    * form "tEXt::key", where key is an ASCII string of length 1-79. The values
    * are UTF-8 encoded strings. The PNG compression level can be specified
    * using the "compression" parameter; it's value is in an integer in the
    * range of `[0, 9]`.
    *
    * ICC color profiles can also be embedded into PNG, JPEG and TIFF images.
    * The "icc-profile" value should be the complete ICC profile encoded into
    * base64.
    *
    * ```c
    * char *contents;
    * gsize length;
    *
    * // icm_path is set elsewhere
    * g_file_get_contents (icm_path, &contents, &length, NULL);
    *
    * char *contents_encode = g_base64_encode ((const guchar *) contents, length);
    *
    * gdk_pixbuf_save (pixbuf, handle, "png", &error, "icc-profile", contents_encode, NULL);
    * ```
    *
    * TIFF images recognize:
    *
    *   1. a "bits-per-sample" option (integer) which can be either 1 for saving
    *      bi-level CCITTFAX4 images, or 8 for saving 8-bits per sample
    *   2. a "compression" option (integer) which can be 1 for no compression, 2
    *      for Huffman, 5 for LZW, 7 for JPEG and 8 for DEFLATE (see the libtiff
    *      documentation and tiff.h for all supported codec values)
    *   3. an "icc-profile" option (zero-terminated string) containing a base64
    *      encoded ICC color profile.
    *
    * ICO images can be saved in depth 16, 24, or 32, by using the "depth"
    * parameter. When the ICO saver is given "x_hot" and "y_hot" parameters, it
    * produces a CUR instead of an ICO.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method save/<method parameters>/error]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(GError**)))"
  )
  private def save__ = ???

  /** Saves pixbuf to a new buffer in format `type`, which is currently "jpeg",
    * "png", "tiff", "ico" or "bmp".
    *
    * This is a convenience function that uses `gdk_pixbuf_save_to_callback()`
    * to do the real work.
    *
    * Note that the buffer is not `NUL`-terminated and may contain embedded
    * `NUL` characters.
    *
    * If @error is set, `FALSE` will be returned and @buffer will be set to
    * `NULL`. Possible errors include those in the `GDK_PIXBUF_ERROR` domain.
    *
    * See `gdk_pixbuf_save()` for more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method save_to_buffer]: Method save_to_buffer contains an OUT parameter, which is not supported yet"
  )
  private def saveToBuffer__ = ???

  /** Vector version of `gdk_pixbuf_save_to_buffer()`.
    *
    * Saves pixbuf to a new buffer in format @type, which is currently "jpeg",
    * "tiff", "png", "ico" or "bmp".
    *
    * See [method@GdkPixbuf.Pixbuf.save_to_buffer] for more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method save_to_bufferv]: Method save_to_bufferv contains an OUT parameter, which is not supported yet"
  )
  private def saveToBufferv__ = ???

  /** Saves pixbuf in format `type` by feeding the produced data to a callback.
    *
    * This function can be used when you want to store the image to something
    * other than a file, such as an in-memory buffer or a socket.
    *
    * If @error is set, `FALSE` will be returned. Possible errors include those
    * in the `GDK_PIXBUF_ERROR` domain and whatever the save function generates.
    *
    * See [method@GdkPixbuf.Pixbuf.save] for more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method save_to_callback/<method parameters>/save_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PixbufSaveFunc), @type -> DataRecord(GdkPixbufSaveFunc)))"
  )
  private def saveToCallback__ = ???

  /** Vector version of `gdk_pixbuf_save_to_callback()`.
    *
    * Saves pixbuf to a callback in format @type, which is currently "jpeg",
    * "png", "tiff", "ico" or "bmp".
    *
    * If @error is set, `FALSE` will be returned.
    *
    * See [method@GdkPixbuf.Pixbuf.save_to_callback] for more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method save_to_callbackv/<method parameters>/save_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PixbufSaveFunc), @type -> DataRecord(GdkPixbufSaveFunc)))"
  )
  private def saveToCallbackv__ = ???

  /** Saves `pixbuf` to an output stream.
    *
    * Supported file formats are currently "jpeg", "tiff", "png", "ico" or
    * "bmp". See `gdk_pixbuf_save_to_buffer()` for more details.
    *
    * The `cancellable` can be used to abort the operation from another thread.
    * If the operation was cancelled, the error `G_IO_ERROR_CANCELLED` will be
    * returned. Other possible errors are in the `GDK_PIXBUF_ERROR` and
    * `G_IO_ERROR` domains.
    *
    * The stream is not closed at the end of this call.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method save_to_stream/<method parameters>/error]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(GError**)))"
  )
  private def saveToStream__ = ???

  /** Saves `pixbuf` to an output stream asynchronously.
    *
    * For more details see gdk_pixbuf_save_to_stream(), which is the synchronous
    * version of this function.
    *
    * When the operation is finished, `callback` will be called in the main
    * thread.
    *
    * You can then call gdk_pixbuf_save_to_stream_finish() to get the result of
    * the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method save_to_stream_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def saveToStreamAsync__ = ???

  /** Saves `pixbuf` to an output stream.
    *
    * Supported file formats are currently "jpeg", "tiff", "png", "ico" or
    * "bmp".
    *
    * See [method@GdkPixbuf.Pixbuf.save_to_stream] for more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def saveToStreamv(
      stream: sn.gnome.gio.OutputStream /* Some(Ptr[_root_.sn.gnome.gio.internal.GOutputStream]) */,
      `type`: String /* Some(CString) */,
      option_keys: Option[Array[String] /* Some(Ptr[CString]) */ ],
      option_values: Option[Array[String] /* Some(Ptr[CString]) */ ],
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[_root_.sn.gnome.gio.internal.GCancellable]) */
      ]
  )(using Zone, Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      gdk_pixbuf_save_to_streamv(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]],
        stream.getUnsafeRawPointer().asInstanceOf,
        toCString(`type`),
        option_keys
          .map[Ptr[CString]](o => MemoryWrite.nullTerminatedStringArray(o))
          .getOrElse(null.asInstanceOf[Ptr[CString]]),
        option_values
          .map[Ptr[CString]](o => MemoryWrite.nullTerminatedStringArray(o))
          .getOrElse(null.asInstanceOf[Ptr[CString]]),
        cancellable
          .map[Ptr[_root_.sn.gnome.gio.internal.GCancellable]](o =>
            o.getUnsafeRawPointer().asInstanceOf
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GCancellable]]
          ),
        __errorPtr
      ).value.!=(0)
    )
  end saveToStreamv

  /** Saves `pixbuf` to an output stream asynchronously.
    *
    * For more details see gdk_pixbuf_save_to_streamv(), which is the
    * synchronous version of this function.
    *
    * When the operation is finished, `callback` will be called in the main
    * thread.
    *
    * You can then call gdk_pixbuf_save_to_stream_finish() to get the result of
    * the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method save_to_streamv_async/<method parameters>/option_keys]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def saveToStreamvAsync__ = ???

  /** Vector version of `gdk_pixbuf_save()`.
    *
    * Saves pixbuf to a file in `type`, which is currently "jpeg", "png",
    * "tiff", "ico" or "bmp".
    *
    * If @error is set, `FALSE` will be returned.
    *
    * See [method@GdkPixbuf.Pixbuf.save] for more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def savev(
      filename: String /* Some(CString) */,
      `type`: String /* Some(CString) */,
      option_keys: Option[Array[String] /* Some(Ptr[CString]) */ ],
      option_values: Option[Array[String] /* Some(Ptr[CString]) */ ]
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      gdk_pixbuf_savev(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]],
        toCString(filename),
        toCString(`type`),
        option_keys
          .map[Ptr[CString]](o => MemoryWrite.nullTerminatedStringArray(o))
          .getOrElse(null.asInstanceOf[Ptr[CString]]),
        option_values
          .map[Ptr[CString]](o => MemoryWrite.nullTerminatedStringArray(o))
          .getOrElse(null.asInstanceOf[Ptr[CString]]),
        __errorPtr
      ).value.!=(0)
    )
  end savev

  /** Creates a transformation of the source image @src by scaling by
    * @scale_x
    *   and @scale_y then translating by @offset_x and @offset_y, then renders
    *   the rectangle (@dest_x, @dest_y, @dest_width,
    * @dest_height)
    *   of the resulting image onto the destination image replacing the previous
    *   contents.
    *
    * Try to use gdk_pixbuf_scale_simple() first; this function is the
    * industrial-strength power tool you can fall back to, if
    * gdk_pixbuf_scale_simple() isn't powerful enough.
    *
    * If the source rectangle overlaps the destination rectangle on the same
    * pixbuf, it will be overwritten during the scaling which results in
    * rendering artifacts.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scale(
      dest: sn.gnome.gdkpixbuf.Pixbuf /* Some(Ptr[GdkPixbuf]) */,
      dest_x: Int /* Some(CInt) */,
      dest_y: Int /* Some(CInt) */,
      dest_width: Int /* Some(CInt) */,
      dest_height: Int /* Some(CInt) */,
      offset_x: Double /* Some(Double) */,
      offset_y: Double /* Some(Double) */,
      scale_x: Double /* Some(Double) */,
      scale_y: Double /* Some(Double) */,
      interp_type: InterpType /* Some(GdkInterpType) */
  )(using Runtime): Unit /* None */ =
    gdk_pixbuf_scale(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]],
      dest.getUnsafeRawPointer().asInstanceOf,
      dest_x,
      dest_y,
      dest_width,
      dest_height,
      offset_x,
      offset_y,
      scale_x,
      scale_y,
      interp_type.raw
    )
  end scale

  /** Create a new pixbuf containing a copy of `src` scaled to `dest_width` x
    * `dest_height`.
    *
    * This function leaves `src` unaffected.
    *
    * The `interp_type` should be `GDK_INTERP_NEAREST` if you want maximum speed
    * (but when scaling down `GDK_INTERP_NEAREST` is usually unusably ugly). The
    * default `interp_type` should be `GDK_INTERP_BILINEAR` which offers
    * reasonable quality and speed.
    *
    * You can scale a sub-portion of `src` by creating a sub-pixbuf pointing
    * into `src`; see [method@GdkPixbuf.Pixbuf.new_subpixbuf].
    *
    * If `dest_width` and `dest_height` are equal to the width and height of
    * `src`, this function will return an unscaled copy of `src`.
    *
    * For more complicated scaling/alpha blending see
    * [method@GdkPixbuf.Pixbuf.scale] and [method@GdkPixbuf.Pixbuf.composite].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scaleSimple(
      dest_width: Int /* Some(CInt) */,
      dest_height: Int /* Some(CInt) */,
      interp_type: InterpType /* Some(GdkInterpType) */
  )(using Runtime): sn.gnome.gdkpixbuf.Pixbuf /* None */ =
    sn.gnome.gdkpixbuf.Pixbuf.applyUnsafe(
      gdk_pixbuf_scale_simple(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]],
        dest_width,
        dest_height,
        interp_type.raw
      ).asInstanceOf
    )
  end scaleSimple

  /** Attaches a key/value pair as an option to a `GdkPixbuf`.
    *
    * If `key` already exists in the list of options attached to the `pixbuf`,
    * the new value is ignored and `FALSE` is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setOption(
      key: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      value: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* None */ =
    gdk_pixbuf_set_option(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]],
      toCString(key).asInstanceOf[Ptr[gchar]],
      toCString(value).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)
  end setOption

  /** Removes a reference from a pixbuf.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def unref(): Unit /* None */ =
    gdk_pixbuf_unref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbuf]])
  end unref

end Pixbuf

object Pixbuf:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GdkPixbuf])(using Runtime) = summon[Runtime]
    .getOrCreate[Pixbuf](ptr.asInstanceOf[Ptr[Byte]], p => new Pixbuf(ptr))

  /** Creates a new `GdkPixbuf` structure and allocates a buffer for it.
    *
    * If the allocation of the buffer failed, this function will return `NULL`.
    *
    * The buffer has an optimal rowstride. Note that the buffer is not cleared;
    * you will have to fill it completely yourself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      colorspace: Colorspace /* Some(GdkColorspace) */,
      has_alpha: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      bits_per_sample: Int /* Some(CInt) */,
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */
  )(using Runtime): Pixbuf =
    val raw: Ptr[Byte] = gdk_pixbuf_new(
      colorspace.raw,
      gboolean(gint((if has_alpha == true then 1 else 0))),
      bits_per_sample,
      width,
      height
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Pixbuf](raw, r => Pixbuf.applyUnsafe(r.asInstanceOf))
  end apply

  /** Creates a new #GdkPixbuf out of in-memory readonly image data.
    *
    * Currently only RGB images with 8 bits per sample are supported.
    *
    * This is the `GBytes` variant of gdk_pixbuf_new_from_data(), useful for
    * language bindings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[constructor new_from_bytes/data]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def fromBytes() = ???

  /** Creates a new #GdkPixbuf out of in-memory image data.
    *
    * Currently only RGB images with 8 bits per sample are supported.
    *
    * Since you are providing a pre-allocated pixel buffer, you must also
    * specify a way to free that data. This is done with a function of type
    * `GdkPixbufDestroyNotify`. When a pixbuf created with is finalized, your
    * destroy notification function will be called, and it is its responsibility
    * to free the pixel array.
    *
    * See also: [ctor@GdkPixbuf.Pixbuf.new_from_bytes]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[constructor new_from_data/data]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guchar)))),ListMap(@zero-terminated -> DataRecord(0), @type -> DataRecord(const guchar*)))"
  )
  private def fromData() = ???

  /** Creates a new pixbuf by loading an image from a file.
    *
    * The file format is detected automatically.
    *
    * If `NULL` is returned, then @error will be set. Possible errors are:
    *
    *   - the file could not be opened
    *   - there is no loader for the file's format
    *   - there is not enough memory to allocate the image buffer
    *   - the image buffer contains invalid data
    *
    * The error domains are `GDK_PIXBUF_ERROR` and `G_FILE_ERROR`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromFile(
      filename: String /* Some(CString) */
  )(using Zone, Runtime): GResult[Pixbuf] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] =
        gdk_pixbuf_new_from_file(toCString(filename), __errorPtr)
          .asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime]
          .getOrCreate[Pixbuf](raw, r => Pixbuf.applyUnsafe(r.asInstanceOf))

  end fromFile

  /** Creates a new pixbuf by loading an image from a file.
    *
    * The file format is detected automatically.
    *
    * If `NULL` is returned, then @error will be set. Possible errors are:
    *
    *   - the file could not be opened
    *   - there is no loader for the file's format
    *   - there is not enough memory to allocate the image buffer
    *   - the image buffer contains invalid data
    *
    * The error domains are `GDK_PIXBUF_ERROR` and `G_FILE_ERROR`.
    *
    * The image will be scaled to fit in the requested size, optionally
    * preserving the image's aspect ratio.
    *
    * When preserving the aspect ratio, a `width` of -1 will cause the image to
    * be scaled to the exact given height, and a `height` of -1 will cause the
    * image to be scaled to the exact given width. When not preserving aspect
    * ratio, a `width` or `height` of -1 means to not scale the image at all in
    * that dimension. Negative values for `width` and `height` are allowed since
    * 2.8.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromFileAtScale(
      filename: String /* Some(CString) */,
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */,
      preserve_aspect_ratio: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Zone, Runtime): GResult[Pixbuf] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] = gdk_pixbuf_new_from_file_at_scale(
        toCString(filename),
        width,
        height,
        gboolean(gint((if preserve_aspect_ratio == true then 1 else 0))),
        __errorPtr
      ).asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime]
          .getOrCreate[Pixbuf](raw, r => Pixbuf.applyUnsafe(r.asInstanceOf))

  end fromFileAtScale

  /** Creates a new pixbuf by loading an image from a file.
    *
    * The file format is detected automatically.
    *
    * If `NULL` is returned, then @error will be set. Possible errors are:
    *
    *   - the file could not be opened
    *   - there is no loader for the file's format
    *   - there is not enough memory to allocate the image buffer
    *   - the image buffer contains invalid data
    *
    * The error domains are `GDK_PIXBUF_ERROR` and `G_FILE_ERROR`.
    *
    * The image will be scaled to fit in the requested size, preserving the
    * image's aspect ratio. Note that the returned pixbuf may be smaller than
    * `width` x `height`, if the aspect ratio requires it. To load and image at
    * the requested size, regardless of aspect ratio, use
    * [ctor@GdkPixbuf.Pixbuf.new_from_file_at_scale].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromFileAtSize(
      filename: String /* Some(CString) */,
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */
  )(using Zone, Runtime): GResult[Pixbuf] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] = gdk_pixbuf_new_from_file_at_size(
        toCString(filename),
        width,
        height,
        __errorPtr
      ).asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime]
          .getOrCreate[Pixbuf](raw, r => Pixbuf.applyUnsafe(r.asInstanceOf))

  end fromFileAtSize

  /** Creates a `GdkPixbuf` from a flat representation that is suitable for
    * storing as inline data in a program.
    *
    * This is useful if you want to ship a program with images, but don't want
    * to depend on any external files.
    *
    * GdkPixbuf ships with a program called `gdk-pixbuf-csource`, which allows
    * for conversion of `GdkPixbuf`s into such a inline representation.
    *
    * In almost all cases, you should pass the `--raw` option to
    * `gdk-pixbuf-csource`. A sample invocation would be:
    *
    * ```
    * gdk-pixbuf-csource --raw --name=myimage_inline myimage.png
    * ```
    *
    * For the typical case where the inline pixbuf is read-only static data, you
    * don't need to copy the pixel data unless you intend to write to it, so you
    * can pass `FALSE` for `copy_pixels`. If you pass `--rle` to
    * `gdk-pixbuf-csource`, a copy will be made even if `copy_pixels` is
    * `FALSE`, so using this option is generally a bad idea.
    *
    * If you create a pixbuf from const inline data compiled into your program,
    * it's probably safe to ignore errors and disable length checks, since
    * things will always succeed:
    *
    * ```c
    * pixbuf = gdk_pixbuf_new_from_inline (-1, myimage_inline, FALSE, NULL);
    * ```
    *
    * For non-const inline data, you could get out of memory. For untrusted
    * inline data located at runtime, you could have corrupt inline data in
    * addition.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[constructor new_from_inline/data]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(0), @type -> DataRecord(const guint8*)))"
  )
  private def fromInline() = ???

  /** Creates a new pixbuf by loading an image from an resource.
    *
    * The file format is detected automatically. If `NULL` is returned, then
    * @error
    *   will be set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromResource(
      resource_path: String /* Some(CString) */
  )(using Zone, Runtime): GResult[Pixbuf] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] =
        gdk_pixbuf_new_from_resource(toCString(resource_path), __errorPtr)
          .asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime]
          .getOrCreate[Pixbuf](raw, r => Pixbuf.applyUnsafe(r.asInstanceOf))

  end fromResource

  /** Creates a new pixbuf by loading an image from an resource.
    *
    * The file format is detected automatically. If `NULL` is returned, then
    * @error
    *   will be set.
    *
    * The image will be scaled to fit in the requested size, optionally
    * preserving the image's aspect ratio. When preserving the aspect ratio, a @width
    * of -1 will cause the image to be scaled to the exact given height, and a @height
    * of -1 will cause the image to be scaled to the exact given width. When not
    * preserving aspect ratio, a @width or
    * @height
    *   of -1 means to not scale the image at all in that dimension.
    *
    * The stream is not closed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromResourceAtScale(
      resource_path: String /* Some(CString) */,
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */,
      preserve_aspect_ratio: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Zone, Runtime): GResult[Pixbuf] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] = gdk_pixbuf_new_from_resource_at_scale(
        toCString(resource_path),
        width,
        height,
        gboolean(gint((if preserve_aspect_ratio == true then 1 else 0))),
        __errorPtr
      ).asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime]
          .getOrCreate[Pixbuf](raw, r => Pixbuf.applyUnsafe(r.asInstanceOf))

  end fromResourceAtScale

  /** Creates a new pixbuf by loading an image from an input stream.
    *
    * The file format is detected automatically.
    *
    * If `NULL` is returned, then `error` will be set.
    *
    * The `cancellable` can be used to abort the operation from another thread.
    * If the operation was cancelled, the error `G_IO_ERROR_CANCELLED` will be
    * returned. Other possible errors are in the `GDK_PIXBUF_ERROR` and
    * `G_IO_ERROR` domains.
    *
    * The stream is not closed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromStream(
      stream: sn.gnome.gio.InputStream /* Some(Ptr[_root_.sn.gnome.gio.internal.GInputStream]) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[_root_.sn.gnome.gio.internal.GCancellable]) */
      ]
  )(using Runtime): GResult[Pixbuf] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] = gdk_pixbuf_new_from_stream(
        stream.getUnsafeRawPointer().asInstanceOf,
        cancellable
          .map[Ptr[_root_.sn.gnome.gio.internal.GCancellable]](o =>
            o.getUnsafeRawPointer().asInstanceOf
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GCancellable]]
          ),
        __errorPtr
      ).asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime]
          .getOrCreate[Pixbuf](raw, r => Pixbuf.applyUnsafe(r.asInstanceOf))

  end fromStream

  /** Creates a new pixbuf by loading an image from an input stream.
    *
    * The file format is detected automatically. If `NULL` is returned, then
    * @error
    *   will be set. The @cancellable can be used to abort the operation from
    *   another thread. If the operation was cancelled, the error
    *   `G_IO_ERROR_CANCELLED` will be returned. Other possible errors are in
    *   the `GDK_PIXBUF_ERROR` and `G_IO_ERROR` domains.
    *
    * The image will be scaled to fit in the requested size, optionally
    * preserving the image's aspect ratio.
    *
    * When preserving the aspect ratio, a `width` of -1 will cause the image to
    * be scaled to the exact given height, and a `height` of -1 will cause the
    * image to be scaled to the exact given width. If both `width` and `height`
    * are given, this function will behave as if the smaller of the two values
    * is passed as -1.
    *
    * When not preserving aspect ratio, a `width` or `height` of -1 means to not
    * scale the image at all in that dimension.
    *
    * The stream is not closed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromStreamAtScale(
      stream: sn.gnome.gio.InputStream /* Some(Ptr[_root_.sn.gnome.gio.internal.GInputStream]) */,
      width: Int /* Some(_root_.sn.gnome.glib.internal.gint) */,
      height: Int /* Some(_root_.sn.gnome.glib.internal.gint) */,
      preserve_aspect_ratio: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[_root_.sn.gnome.gio.internal.GCancellable]) */
      ]
  )(using Runtime): GResult[Pixbuf] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] = gdk_pixbuf_new_from_stream_at_scale(
        stream.getUnsafeRawPointer().asInstanceOf,
        gint(width),
        gint(height),
        gboolean(gint((if preserve_aspect_ratio == true then 1 else 0))),
        cancellable
          .map[Ptr[_root_.sn.gnome.gio.internal.GCancellable]](o =>
            o.getUnsafeRawPointer().asInstanceOf
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GCancellable]]
          ),
        __errorPtr
      ).asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime]
          .getOrCreate[Pixbuf](raw, r => Pixbuf.applyUnsafe(r.asInstanceOf))

  end fromStreamAtScale

  /** Finishes an asynchronous pixbuf creation operation started with
    * gdk_pixbuf_new_from_stream_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromStreamFinish(
      async_result: AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  )(using Runtime): GResult[Pixbuf] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] = gdk_pixbuf_new_from_stream_finish(
        async_result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime]
          .getOrCreate[Pixbuf](raw, r => Pixbuf.applyUnsafe(r.asInstanceOf))

  end fromStreamFinish

  /** Creates a new pixbuf by parsing XPM data in memory.
    *
    * This data is commonly the result of including an XPM file into a program's
    * C source.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromXpmData(
      data: Array[String] /* Some(Ptr[CString]) */
  )(using Zone, Runtime): Pixbuf =
    val raw: Ptr[Byte] = gdk_pixbuf_new_from_xpm_data(
      MemoryWrite.nullTerminatedStringArray(data)
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Pixbuf](raw, r => Pixbuf.applyUnsafe(r.asInstanceOf))
  end fromXpmData

  /** Calculates the rowstride that an image created with those values would
    * have.
    *
    * This function is useful for front-ends and backends that want to check
    * image values without needing to create a `GdkPixbuf`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def calculateRowstride(
      colorspace: Colorspace /* Some(GdkColorspace) */,
      has_alpha: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      bits_per_sample: Int /* Some(CInt) */,
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */
  ): Int /* Some(_root_.sn.gnome.glib.internal.gint) */ =
    gdk_pixbuf_calculate_rowstride(
      colorspace.raw,
      gboolean(gint((if has_alpha == true then 1 else 0))),
      bits_per_sample,
      width,
      height
    ).value

  /** Parses an image file far enough to determine its format and size.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[function get_file_info]: Function get_file_info contains an OUT parameter, which is not supported yet"
  )
  private def getFileInfo() = ???

  /** Asynchronously parses an image file far enough to determine its format and
    * size.
    *
    * For more details see gdk_pixbuf_get_file_info(), which is the synchronous
    * version of this function.
    *
    * When the operation is finished, @callback will be called in the main
    * thread. You can then call gdk_pixbuf_get_file_info_finish() to get the
    * result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[function get_file_info_async/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def getFileInfoAsync() = ???

  /** Finishes an asynchronous pixbuf parsing operation started with
    * gdk_pixbuf_get_file_info_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[function get_file_info_finish]: Function get_file_info_finish contains an OUT parameter, which is not supported yet"
  )
  private def getFileInfoFinish() = ???

  /** Obtains the available information about the image formats supported by
    * GdkPixbuf.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[function get_formats/<return type>]: Rendering references to records is not supported yet: Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(PixbufFormat))))),ListMap(@name -> DataRecord(GLib.SList), @type -> DataRecord(GSList*)))"
  )
  private def getFormats() = ???

  /** Initalizes the gdk-pixbuf loader modules referenced by the `loaders.cache`
    * file present inside that directory.
    *
    * This is to be used by applications that want to ship certain loaders in a
    * different location from the system ones.
    *
    * This is needed when the OS or runtime ships a minimal number of loaders so
    * as to reduce the potential attack surface of carefully crafted image
    * files, especially for uncommon file types. Applications that require
    * broader image file types coverage, such as image viewers, would be
    * expected to ship the gdk-pixbuf modules in a separate location, bundled
    * with the application in a separate directory from the OS or runtime-
    * provided modules.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def initModules(path: String /* Some(CString) */ )(using
      Zone
  ): GResult[Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ ] =
    GResult.wrap(__errorPtr =>
      gdk_pixbuf_init_modules(toCString(path), __errorPtr).value.!=(0)
    )

  /** Creates a new pixbuf by asynchronously loading an image from an input
    * stream.
    *
    * For more details see gdk_pixbuf_new_from_stream(), which is the
    * synchronous version of this function.
    *
    * When the operation is finished, @callback will be called in the main
    * thread. You can then call gdk_pixbuf_new_from_stream_finish() to get the
    * result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[function new_from_stream_async/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def newFromStreamAsync() = ???

  /** Creates a new pixbuf by asynchronously loading an image from an input
    * stream.
    *
    * For more details see gdk_pixbuf_new_from_stream_at_scale(), which is the
    * synchronous version of this function.
    *
    * When the operation is finished, @callback will be called in the main
    * thread. You can then call gdk_pixbuf_new_from_stream_finish() to get the
    * result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[function new_from_stream_at_scale_async/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def newFromStreamAtScaleAsync() = ???

  /** Finishes an asynchronous pixbuf save operation started with
    * gdk_pixbuf_save_to_stream_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def saveToStreamFinish(
      async_result: AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  ): GResult[Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ ] =
    GResult.wrap(__errorPtr =>
      gdk_pixbuf_save_to_stream_finish(
        async_result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

end Pixbuf
