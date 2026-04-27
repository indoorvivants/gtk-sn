package sn.gnome.gdkpixbuf.fluent

import _root_.sn.gnome.gdkpixbuf.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdkpixbuf.fluent.Pixbuf
import sn.gnome.gdkpixbuf.fluent.PixbufAnimation
import sn.gnome.gdkpixbuf.fluent.PixbufAnimationIter
import sn.gnome.gdkpixbuf.internal.GdkPixbufAnimation
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.InputStream
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GTimeVal
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object

class PixbufAnimation(raw: Ptr[GdkPixbufAnimation])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getHeight(): Int = gdk_pixbuf_animation_get_height(this.raw.asInstanceOf)

  def getIter(start_time: Ptr[GTimeVal]): PixbufAnimationIter =
    new PixbufAnimationIter(
      gdk_pixbuf_animation_get_iter(
        this.raw.asInstanceOf,
        start_time
      ).asInstanceOf
    )

  def getStaticImage(): Pixbuf = new Pixbuf(
    gdk_pixbuf_animation_get_static_image(this.raw.asInstanceOf).asInstanceOf
  )

  def getWidth(): Int = gdk_pixbuf_animation_get_width(this.raw.asInstanceOf)

  def isStaticImage(): Boolean =
    gdk_pixbuf_animation_is_static_image(this.raw.asInstanceOf).value.!=(0)

  override def ref(): PixbufAnimation = new PixbufAnimation(
    gdk_pixbuf_animation_ref(this.raw.asInstanceOf).asInstanceOf
  )

  override def unref(): Unit = gdk_pixbuf_animation_unref(this.raw.asInstanceOf)

end PixbufAnimation

object PixbufAnimation:
  def fromFile(
      filename: String | CString
  )(using Zone): GResult[PixbufAnimation] = GResult.wrap(__errorPtr =>
    new PixbufAnimation(
      gdk_pixbuf_animation_new_from_file(
        __sn_extract_string(filename),
        __errorPtr
      ).asInstanceOf
    )
  )
  def fromResource(
      resource_path: String | CString
  )(using Zone): GResult[PixbufAnimation] = GResult.wrap(__errorPtr =>
    new PixbufAnimation(
      gdk_pixbuf_animation_new_from_resource(
        __sn_extract_string(resource_path),
        __errorPtr
      ).asInstanceOf
    )
  )
  def fromStream(
      stream: InputStream,
      cancellable: Cancellable
  ): GResult[PixbufAnimation] = GResult.wrap(__errorPtr =>
    new PixbufAnimation(
      gdk_pixbuf_animation_new_from_stream(
        stream.getUnsafeRawPointer().asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )
  def fromStreamFinish(async_result: AsyncResult): GResult[PixbufAnimation] =
    GResult.wrap(__errorPtr =>
      new PixbufAnimation(
        gdk_pixbuf_animation_new_from_stream_finish(
          async_result.getUnsafeRawPointer().asInstanceOf,
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
end PixbufAnimation
