package sn.gnome.gdkpixbuf.fluent

import _root_.sn.gnome.gdkpixbuf.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdkpixbuf.fluent.Pixbuf
import sn.gnome.gdkpixbuf.fluent.PixbufAnimation
import sn.gnome.gdkpixbuf.internal.GdkPixbufFormat
import sn.gnome.gdkpixbuf.internal.GdkPixbufLoader
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GBytes
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object

class PixbufLoader(raw: Ptr[GdkPixbufLoader]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def close(): GResult[Boolean] = GResult.wrap(__errorPtr =>
    gdk_pixbuf_loader_close(this.raw.asInstanceOf, __errorPtr).value.!=(0)
  )

  def getAnimation(): PixbufAnimation = new PixbufAnimation(
    gdk_pixbuf_loader_get_animation(this.raw.asInstanceOf).asInstanceOf
  )

  def getFormat(): Ptr[GdkPixbufFormat] = gdk_pixbuf_loader_get_format(
    this.raw.asInstanceOf
  )

  def getPixbuf(): Pixbuf = new Pixbuf(
    gdk_pixbuf_loader_get_pixbuf(this.raw.asInstanceOf).asInstanceOf
  )

  def setSize(width: Int, height: Int): Unit =
    gdk_pixbuf_loader_set_size(this.raw.asInstanceOf, width, height)

  // Method write contains an array parameter, which is not supported yet

  def writeBytes(buffer: Ptr[GBytes]): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      gdk_pixbuf_loader_write_bytes(
        this.raw.asInstanceOf,
        buffer,
        __errorPtr
      ).value.!=(0)
    )

end PixbufLoader

object PixbufLoader:
  def apply(): PixbufLoader = new PixbufLoader(
    gdk_pixbuf_loader_new().asInstanceOf
  )
  def withMimeType(
      mime_type: String | CString
  )(using Zone): GResult[PixbufLoader] = GResult.wrap(__errorPtr =>
    new PixbufLoader(
      gdk_pixbuf_loader_new_with_mime_type(
        __sn_extract_string(mime_type),
        __errorPtr
      ).asInstanceOf
    )
  )
  def withType(
      image_type: String | CString
  )(using Zone): GResult[PixbufLoader] = GResult.wrap(__errorPtr =>
    new PixbufLoader(
      gdk_pixbuf_loader_new_with_type(
        __sn_extract_string(image_type),
        __errorPtr
      ).asInstanceOf
    )
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end PixbufLoader
