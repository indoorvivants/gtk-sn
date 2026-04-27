package sn.gnome.gdkpixbuf.fluent

import _root_.sn.gnome.gdkpixbuf.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdkpixbuf.fluent.Pixbuf
import sn.gnome.gdkpixbuf.internal.GdkColorspace
import sn.gnome.gdkpixbuf.internal.GdkInterpType
import sn.gnome.gdkpixbuf.internal.GdkPixbuf
import sn.gnome.gdkpixbuf.internal.GdkPixbufDestroyNotify
import sn.gnome.gdkpixbuf.internal.GdkPixbufRotation
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.Icon
import sn.gnome.gio.fluent.InputStream
import sn.gnome.gio.fluent.LoadableIcon
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GBytes
import sn.gnome.glib.internal.GHashTable
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gfloat
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.gsize
import sn.gnome.glib.internal.guchar
import sn.gnome.glib.internal.guint32
import sn.gnome.glib.internal.guint8
import sn.gnome.gobject.fluent.Object

class Pixbuf(raw: Ptr[GdkPixbuf])
    extends Object(raw.asInstanceOf),
      Icon,
      LoadableIcon:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addAlpha(
      substitute_color: Boolean,
      r: UByte,
      g: UByte,
      b: UByte
  ): Pixbuf = new Pixbuf(
    gdk_pixbuf_add_alpha(
      this.raw.asInstanceOf,
      gboolean(gint((if substitute_color == true then 1 else 0))),
      guchar(r),
      guchar(g),
      guchar(b)
    ).asInstanceOf
  )

  def applyEmbeddedOrientation(): Pixbuf = new Pixbuf(
    gdk_pixbuf_apply_embedded_orientation(this.raw.asInstanceOf).asInstanceOf
  )

  def composite(
      dest: Pixbuf,
      dest_x: Int,
      dest_y: Int,
      dest_width: Int,
      dest_height: Int,
      offset_x: Double,
      offset_y: Double,
      scale_x: Double,
      scale_y: Double,
      interp_type: GdkInterpType,
      overall_alpha: Int
  ): Unit = gdk_pixbuf_composite(
    this.raw.asInstanceOf,
    dest.getUnsafeRawPointer().asInstanceOf,
    dest_x,
    dest_y,
    dest_width,
    dest_height,
    offset_x,
    offset_y,
    scale_x,
    scale_y,
    interp_type,
    overall_alpha
  )

  def compositeColor(
      dest: Pixbuf,
      dest_x: Int,
      dest_y: Int,
      dest_width: Int,
      dest_height: Int,
      offset_x: Double,
      offset_y: Double,
      scale_x: Double,
      scale_y: Double,
      interp_type: GdkInterpType,
      overall_alpha: Int,
      check_x: Int,
      check_y: Int,
      check_size: Int,
      color1: UInt,
      color2: UInt
  ): Unit = gdk_pixbuf_composite_color(
    this.raw.asInstanceOf,
    dest.getUnsafeRawPointer().asInstanceOf,
    dest_x,
    dest_y,
    dest_width,
    dest_height,
    offset_x,
    offset_y,
    scale_x,
    scale_y,
    interp_type,
    overall_alpha,
    check_x,
    check_y,
    check_size,
    guint32(color1),
    guint32(color2)
  )

  def compositeColorSimple(
      dest_width: Int,
      dest_height: Int,
      interp_type: GdkInterpType,
      overall_alpha: Int,
      check_size: Int,
      color1: UInt,
      color2: UInt
  ): Pixbuf = new Pixbuf(
    gdk_pixbuf_composite_color_simple(
      this.raw.asInstanceOf,
      dest_width,
      dest_height,
      interp_type,
      overall_alpha,
      check_size,
      guint32(color1),
      guint32(color2)
    ).asInstanceOf
  )

  def copy(): Pixbuf = new Pixbuf(
    gdk_pixbuf_copy(this.raw.asInstanceOf).asInstanceOf
  )

  def copyArea(
      src_x: Int,
      src_y: Int,
      width: Int,
      height: Int,
      dest_pixbuf: Pixbuf,
      dest_x: Int,
      dest_y: Int
  ): Unit = gdk_pixbuf_copy_area(
    this.raw.asInstanceOf,
    src_x,
    src_y,
    width,
    height,
    dest_pixbuf.getUnsafeRawPointer().asInstanceOf,
    dest_x,
    dest_y
  )

  def copyOptions(dest_pixbuf: Pixbuf): Boolean = gdk_pixbuf_copy_options(
    this.raw.asInstanceOf,
    dest_pixbuf.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  def fill(pixel: UInt): Unit =
    gdk_pixbuf_fill(this.raw.asInstanceOf, guint32(pixel))

  def flip(horizontal: Boolean): Pixbuf = new Pixbuf(
    gdk_pixbuf_flip(
      this.raw.asInstanceOf,
      gboolean(gint((if horizontal == true then 1 else 0)))
    ).asInstanceOf
  )

  def getBitsPerSample(): Int = gdk_pixbuf_get_bits_per_sample(
    this.raw.asInstanceOf
  )

  def getByteLength(): CUnsignedLongInt = gdk_pixbuf_get_byte_length(
    this.raw.asInstanceOf
  ).value

  def getColorspace(): GdkColorspace = gdk_pixbuf_get_colorspace(
    this.raw.asInstanceOf
  )

  def getHasAlpha(): Boolean =
    gdk_pixbuf_get_has_alpha(this.raw.asInstanceOf).value.!=(0)

  def getHeight(): Int = gdk_pixbuf_get_height(this.raw.asInstanceOf)

  def getNChannels(): Int = gdk_pixbuf_get_n_channels(this.raw.asInstanceOf)

  def getOption(key: String | CString)(using Zone): String = fromCString(
    gdk_pixbuf_get_option(
      this.raw.asInstanceOf,
      __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  def getOptions(): Ptr[GHashTable] = gdk_pixbuf_get_options(
    this.raw.asInstanceOf
  )

  def getPixels(): Ptr[UByte] = gdk_pixbuf_get_pixels(
    this.raw.asInstanceOf
  ).asInstanceOf

  // Method get_pixels_with_length contains an OUT parameter, which is not supported yet

  def getRowstride(): Int = gdk_pixbuf_get_rowstride(this.raw.asInstanceOf)

  def getWidth(): Int = gdk_pixbuf_get_width(this.raw.asInstanceOf)

  def newSubpixbuf(src_x: Int, src_y: Int, width: Int, height: Int): Pixbuf =
    new Pixbuf(
      gdk_pixbuf_new_subpixbuf(
        this.raw.asInstanceOf,
        src_x,
        src_y,
        width,
        height
      ).asInstanceOf
    )

  def readPixelBytes(): Ptr[GBytes] = gdk_pixbuf_read_pixel_bytes(
    this.raw.asInstanceOf
  )

  def readPixels(): Ptr[guint8] = gdk_pixbuf_read_pixels(this.raw.asInstanceOf)

  override def ref(): Pixbuf = new Pixbuf(
    gdk_pixbuf_ref(this.raw.asInstanceOf).asInstanceOf
  )

  def removeOption(key: String | CString)(using Zone): Boolean =
    gdk_pixbuf_remove_option(
      this.raw.asInstanceOf,
      __sn_extract_string(key).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)

  def rotateSimple(angle: GdkPixbufRotation): Pixbuf = new Pixbuf(
    gdk_pixbuf_rotate_simple(this.raw.asInstanceOf, angle).asInstanceOf
  )

  def saturateAndPixelate(
      dest: Pixbuf,
      saturation: Float,
      pixelate: Boolean
  ): Unit = gdk_pixbuf_saturate_and_pixelate(
    this.raw.asInstanceOf,
    dest.getUnsafeRawPointer().asInstanceOf,
    gfloat(saturation),
    gboolean(gint((if pixelate == true then 1 else 0)))
  )

  // Method save_to_buffer contains an array parameter, which is not supported yet

  // Method save_to_bufferv contains an array parameter, which is not supported yet

  // Method save_to_callbackv contains an array parameter, which is not supported yet

  // Method save_to_streamv contains an array parameter, which is not supported yet

  // Method save_to_streamv_async contains an array parameter, which is not supported yet

  // Method savev contains an array parameter, which is not supported yet

  def scale(
      dest: Pixbuf,
      dest_x: Int,
      dest_y: Int,
      dest_width: Int,
      dest_height: Int,
      offset_x: Double,
      offset_y: Double,
      scale_x: Double,
      scale_y: Double,
      interp_type: GdkInterpType
  ): Unit = gdk_pixbuf_scale(
    this.raw.asInstanceOf,
    dest.getUnsafeRawPointer().asInstanceOf,
    dest_x,
    dest_y,
    dest_width,
    dest_height,
    offset_x,
    offset_y,
    scale_x,
    scale_y,
    interp_type
  )

  def scaleSimple(
      dest_width: Int,
      dest_height: Int,
      interp_type: GdkInterpType
  ): Pixbuf = new Pixbuf(
    gdk_pixbuf_scale_simple(
      this.raw.asInstanceOf,
      dest_width,
      dest_height,
      interp_type
    ).asInstanceOf
  )

  def setOption(key: String | CString, value: String | CString)(using
      Zone
  ): Boolean = gdk_pixbuf_set_option(
    this.raw.asInstanceOf,
    __sn_extract_string(key).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(value).asInstanceOf[Ptr[gchar]]
  ).value.!=(0)

  override def unref(): Unit = gdk_pixbuf_unref(this.raw.asInstanceOf)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Pixbuf

object Pixbuf:
  def apply(
      colorspace: GdkColorspace,
      has_alpha: Boolean,
      bits_per_sample: Int,
      width: Int,
      height: Int
  ): Pixbuf = new Pixbuf(
    gdk_pixbuf_new(
      colorspace,
      gboolean(gint((if has_alpha == true then 1 else 0))),
      bits_per_sample,
      width,
      height
    ).asInstanceOf
  )
  def fromBytes(
      data: Ptr[GBytes],
      colorspace: GdkColorspace,
      has_alpha: Boolean,
      bits_per_sample: Int,
      width: Int,
      height: Int,
      rowstride: Int
  ): Pixbuf = new Pixbuf(
    gdk_pixbuf_new_from_bytes(
      data,
      colorspace,
      gboolean(gint((if has_alpha == true then 1 else 0))),
      bits_per_sample,
      width,
      height,
      rowstride
    ).asInstanceOf
  )
  def fromData(
      data: Ptr[UByte],
      colorspace: GdkColorspace,
      has_alpha: Boolean,
      bits_per_sample: Int,
      width: Int,
      height: Int,
      rowstride: Int,
      destroy_fn: GdkPixbufDestroyNotify,
      destroy_fn_data: Ptr[Byte]
  ): Pixbuf = new Pixbuf(
    gdk_pixbuf_new_from_data(
      data.asInstanceOf,
      colorspace,
      gboolean(gint((if has_alpha == true then 1 else 0))),
      bits_per_sample,
      width,
      height,
      rowstride,
      destroy_fn,
      gpointer(destroy_fn_data)
    ).asInstanceOf
  )
  def fromFile(filename: String | CString)(using Zone): GResult[Pixbuf] =
    GResult.wrap(__errorPtr =>
      new Pixbuf(
        gdk_pixbuf_new_from_file(
          __sn_extract_string(filename),
          __errorPtr
        ).asInstanceOf
      )
    )
  def fromFileAtScale(
      filename: String | CString,
      width: Int,
      height: Int,
      preserve_aspect_ratio: Boolean
  )(using Zone): GResult[Pixbuf] = GResult.wrap(__errorPtr =>
    new Pixbuf(
      gdk_pixbuf_new_from_file_at_scale(
        __sn_extract_string(filename),
        width,
        height,
        gboolean(gint((if preserve_aspect_ratio == true then 1 else 0))),
        __errorPtr
      ).asInstanceOf
    )
  )
  def fromFileAtSize(filename: String | CString, width: Int, height: Int)(using
      Zone
  ): GResult[Pixbuf] = GResult.wrap(__errorPtr =>
    new Pixbuf(
      gdk_pixbuf_new_from_file_at_size(
        __sn_extract_string(filename),
        width,
        height,
        __errorPtr
      ).asInstanceOf
    )
  )
  def fromInline(
      data_length: Int,
      data: Ptr[guint8],
      copy_pixels: Boolean
  ): GResult[Pixbuf] = GResult.wrap(__errorPtr =>
    new Pixbuf(
      gdk_pixbuf_new_from_inline(
        gint(data_length),
        data.asInstanceOf,
        gboolean(gint((if copy_pixels == true then 1 else 0))),
        __errorPtr
      ).asInstanceOf
    )
  )
  def fromResource(
      resource_path: String | CString
  )(using Zone): GResult[Pixbuf] = GResult.wrap(__errorPtr =>
    new Pixbuf(
      gdk_pixbuf_new_from_resource(
        __sn_extract_string(resource_path),
        __errorPtr
      ).asInstanceOf
    )
  )
  def fromResourceAtScale(
      resource_path: String | CString,
      width: Int,
      height: Int,
      preserve_aspect_ratio: Boolean
  )(using Zone): GResult[Pixbuf] = GResult.wrap(__errorPtr =>
    new Pixbuf(
      gdk_pixbuf_new_from_resource_at_scale(
        __sn_extract_string(resource_path),
        width,
        height,
        gboolean(gint((if preserve_aspect_ratio == true then 1 else 0))),
        __errorPtr
      ).asInstanceOf
    )
  )
  def fromStream(
      stream: InputStream,
      cancellable: Cancellable
  ): GResult[Pixbuf] = GResult.wrap(__errorPtr =>
    new Pixbuf(
      gdk_pixbuf_new_from_stream(
        stream.getUnsafeRawPointer().asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )
  def fromStreamAtScale(
      stream: InputStream,
      width: Int,
      height: Int,
      preserve_aspect_ratio: Boolean,
      cancellable: Cancellable
  ): GResult[Pixbuf] = GResult.wrap(__errorPtr =>
    new Pixbuf(
      gdk_pixbuf_new_from_stream_at_scale(
        stream.getUnsafeRawPointer().asInstanceOf,
        gint(width),
        gint(height),
        gboolean(gint((if preserve_aspect_ratio == true then 1 else 0))),
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )
  def fromStreamFinish(async_result: AsyncResult): GResult[Pixbuf] =
    GResult.wrap(__errorPtr =>
      new Pixbuf(
        gdk_pixbuf_new_from_stream_finish(
          async_result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  def fromXpmData(data: Ptr[CString])(using Zone): Pixbuf = new Pixbuf(
    gdk_pixbuf_new_from_xpm_data(data).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Pixbuf
