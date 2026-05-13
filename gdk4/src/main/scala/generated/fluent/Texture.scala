package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.{MemoryFormat, Paintable}
import sn.gnome.gdk4.internal.GdkTexture
import sn.gnome.gdkpixbuf.Pixbuf
import sn.gnome.gio.{File, Icon, LoadableIcon}
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/** `GdkTexture` is the basic element used to refer to pixel data.
  *
  * It is primarily meant for pixel data that will not change over multiple
  * frames, and will be used for a long time.
  *
  * There are various ways to create `GdkTexture` objects from a
  * [class@GdkPixbuf.Pixbuf], or from bytes stored in memory, a file, or a
  * [struct@Gio.Resource].
  *
  * The ownership of the pixel data is transferred to the `GdkTexture` instance;
  * you can only make a copy of it, via [method@Gdk.Texture.download].
  *
  * `GdkTexture` is an immutable object: That means you cannot change anything
  * about it other than increasing the reference count via
  * [method@GObject.Object.ref], and consequently, it is a thread-safe object.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Texture private[gnome] (raw: Ptr[GdkTexture])
    extends Object(raw.asInstanceOf),
      Paintable,
      Icon,
      LoadableIcon:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Downloads the @texture into local memory.
    *
    * This may be an expensive operation, as the actual texture data may reside
    * on a GPU or on a remote display server.
    *
    * The data format of the downloaded data is equivalent to
    * %CAIRO_FORMAT_ARGB32, so every downloaded pixel requires 4 bytes of
    * memory.
    *
    * Downloading a texture into a Cairo image surface:
    * ```c
    * surface = cairo_image_surface_create (CAIRO_FORMAT_ARGB32,
    *                                       gdk_texture_get_width (texture),
    *                                       gdk_texture_get_height (texture));
    * gdk_texture_download (texture,
    *                       cairo_image_surface_get_data (surface),
    *                       cairo_image_surface_get_stride (surface));
    * cairo_surface_mark_dirty (surface);
    * ```
    *
    * For more flexible download capabilites, see
    * [struct@Gdk.TextureDownloader].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method download/<method parameters>/data]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guchar)))),ListMap(@zero-terminated -> DataRecord(0), @type -> DataRecord(guchar*)))"
  )
  private def download__ = ???

  /** Gets the memory format most closely associated with the data of the
    * texture.
    *
    * Note that it may not be an exact match for texture data stored on the GPU
    * or with compression.
    *
    * The format can give an indication about the bit depth and opacity of the
    * texture and is useful to determine the best format for downloading the
    * texture.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFormat(): MemoryFormat /* None */ =
    MemoryFormat.fromRaw(
      gdk_texture_get_format(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkTexture]]
      )
    )
  end getFormat

  /** Returns the height of the @texture, in pixels.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHeight(): Int /* None */ =
    gdk_texture_get_height(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkTexture]]
    )
  end getHeight

  /** Returns the width of @texture, in pixels.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWidth(): Int /* None */ =
    gdk_texture_get_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkTexture]]
    )
  end getWidth

  /** Store the given @texture to the @filename as a PNG file.
    *
    * This is a utility function intended for debugging and testing. If you want
    * more control over formats, proper error handling or want to store to a
    * [iface@Gio.File] or other location, you might want to use
    * [method@Gdk.Texture.save_to_png_bytes] or look into the gdk-pixbuf
    * library.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def saveToPng(
      filename: String /* Some(CString) */
  )(using Zone): Boolean /* None */ =
    gdk_texture_save_to_png(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkTexture]],
      toCString(filename)
    ).value.!=(0)
  end saveToPng

  /** Store the given @texture in memory as a PNG file.
    *
    * Use [ctor@Gdk.Texture.new_from_bytes] to read it back.
    *
    * If you want to serialize a texture, this is a convenient and portable way
    * to do that.
    *
    * If you need more control over the generated image, such as attaching
    * metadata, you should look into an image handling library such as the
    * gdk-pixbuf library.
    *
    * If you are dealing with high dynamic range float data, you might also want
    * to consider [method@Gdk.Texture.save_to_tiff_bytes] instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method save_to_png_bytes/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def saveToPngBytes__ = ???

  /** Store the given @texture to the @filename as a TIFF file.
    *
    * GTK will attempt to store data without loss.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def saveToTiff(
      filename: String /* Some(CString) */
  )(using Zone): Boolean /* None */ =
    gdk_texture_save_to_tiff(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkTexture]],
      toCString(filename)
    ).value.!=(0)
  end saveToTiff

  /** Store the given @texture in memory as a TIFF file.
    *
    * Use [ctor@Gdk.Texture.new_from_bytes] to read it back.
    *
    * This function is intended to store a representation of the texture's data
    * that is as accurate as possible. This is particularly relevant when
    * working with high dynamic range images and floating-point texture data.
    *
    * If that is not your concern and you are interested in a smaller size and a
    * more portable format, you might want to use
    * [method@Gdk.Texture.save_to_png_bytes].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method save_to_tiff_bytes/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def saveToTiffBytes__ = ???

end Texture

object Texture:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GdkTexture])(using Runtime) = summon[Runtime]
    .getOrCreate[Texture](ptr.asInstanceOf[Ptr[Byte]], p => new Texture(ptr))

  /** Creates a new texture object representing the `GdkPixbuf`.
    *
    * This function is threadsafe, so that you can e.g. use GTask and
    * [method@Gio.Task.run_in_thread] to avoid blocking the main thread while
    * loading a big image.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forPixbuf(
      pixbuf: sn.gnome.gdkpixbuf.Pixbuf /* Some(Ptr[_root_.sn.gnome.gdkpixbuf.internal.GdkPixbuf]) */
  )(using Runtime): Texture =
    val raw: Ptr[Byte] = gdk_texture_new_for_pixbuf(
      pixbuf.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Texture](raw, r => Texture.applyUnsafe(r.asInstanceOf))
  end forPixbuf

  /** Creates a new texture by loading an image from memory,
    *
    * The file format is detected automatically. The supported formats are PNG,
    * JPEG and TIFF, though more formats might be available.
    *
    * If %NULL is returned, then @error will be set.
    *
    * This function is threadsafe, so that you can e.g. use GTask and
    * [method@Gio.Task.run_in_thread] to avoid blocking the main thread while
    * loading a big image.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[constructor new_from_bytes/bytes]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def fromBytes() = ???

  /** Creates a new texture by loading an image from a file.
    *
    * The file format is detected automatically. The supported formats are PNG,
    * JPEG and TIFF, though more formats might be available.
    *
    * If %NULL is returned, then @error will be set.
    *
    * This function is threadsafe, so that you can e.g. use GTask and
    * [method@Gio.Task.run_in_thread] to avoid blocking the main thread while
    * loading a big image.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromFile(file: File /* Some(Ptr[_root_.sn.gnome.gio.internal.GFile]) */ )(
      using Runtime
  ): GResult[Texture] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] = gdk_texture_new_from_file(
        file.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime]
          .getOrCreate[Texture](raw, r => Texture.applyUnsafe(r.asInstanceOf))

  end fromFile

  /** Creates a new texture by loading an image from a file.
    *
    * The file format is detected automatically. The supported formats are PNG,
    * JPEG and TIFF, though more formats might be available.
    *
    * If %NULL is returned, then @error will be set.
    *
    * This function is threadsafe, so that you can e.g. use GTask and
    * [method@Gio.Task.run_in_thread] to avoid blocking the main thread while
    * loading a big image.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromFilename(
      path: String /* Some(CString) */
  )(using Zone, Runtime): GResult[Texture] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] =
        gdk_texture_new_from_filename(toCString(path), __errorPtr)
          .asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime]
          .getOrCreate[Texture](raw, r => Texture.applyUnsafe(r.asInstanceOf))

  end fromFilename

  /** Creates a new texture by loading an image from a resource.
    *
    * The file format is detected automatically. The supported formats are PNG
    * and JPEG, though more formats might be available.
    *
    * It is a fatal error if @resource_path does not specify a valid image
    * resource and the program will abort if that happens. If you are unsure
    * about the validity of a resource, use [ctor@Gdk.Texture.new_from_file] to
    * load it.
    *
    * This function is threadsafe, so that you can e.g. use GTask and
    * [method@Gio.Task.run_in_thread] to avoid blocking the main thread while
    * loading a big image.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromResource(
      resource_path: String /* Some(CString) */
  )(using Zone, Runtime): Texture =
    val raw: Ptr[Byte] = gdk_texture_new_from_resource(
      toCString(resource_path)
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Texture](raw, r => Texture.applyUnsafe(r.asInstanceOf))
  end fromResource
end Texture
