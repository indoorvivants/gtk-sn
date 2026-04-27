package sn.gnome.gdkpixbuf.fluent

import _root_.sn.gnome.gdkpixbuf.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdkpixbuf.fluent.Pixbuf
import sn.gnome.gdkpixbuf.fluent.PixbufAnimation
import sn.gnome.gdkpixbuf.internal.GdkPixbufSimpleAnim
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gfloat
import sn.gnome.glib.internal.gint

class PixbufSimpleAnim(raw: Ptr[GdkPixbufSimpleAnim])
    extends PixbufAnimation(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addFrame(pixbuf: Pixbuf): Unit = gdk_pixbuf_simple_anim_add_frame(
    this.raw.asInstanceOf,
    pixbuf.getUnsafeRawPointer().asInstanceOf
  )

  def getLoop(): Boolean =
    gdk_pixbuf_simple_anim_get_loop(this.raw.asInstanceOf).value.!=(0)

  def setLoop(loop: Boolean): Unit = gdk_pixbuf_simple_anim_set_loop(
    this.raw.asInstanceOf,
    gboolean(gint((if loop == true then 1 else 0)))
  )

end PixbufSimpleAnim

object PixbufSimpleAnim:
  def apply(width: Int, height: Int, rate: Float): PixbufSimpleAnim =
    new PixbufSimpleAnim(
      gdk_pixbuf_simple_anim_new(
        gint(width),
        gint(height),
        gfloat(rate)
      ).asInstanceOf
    )
end PixbufSimpleAnim
