package sn.gnome.gdkpixbuf.fluent

import _root_.sn.gnome.gdkpixbuf.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdkpixbuf.fluent.Pixbuf
import sn.gnome.gdkpixbuf.internal.GdkPixbufAnimationIter
import sn.gnome.glib.internal.GTimeVal
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object

class PixbufAnimationIter(raw: Ptr[GdkPixbufAnimationIter])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def advance(current_time: Ptr[GTimeVal]): Boolean =
    gdk_pixbuf_animation_iter_advance(this.raw.asInstanceOf, current_time).value
      .!=(0)

  def getDelayTime(): Int = gdk_pixbuf_animation_iter_get_delay_time(
    this.raw.asInstanceOf
  )

  def getPixbuf(): Pixbuf = new Pixbuf(
    gdk_pixbuf_animation_iter_get_pixbuf(this.raw.asInstanceOf).asInstanceOf
  )

  def onCurrentlyLoadingFrame(): Boolean =
    gdk_pixbuf_animation_iter_on_currently_loading_frame(
      this.raw.asInstanceOf
    ).value.!=(0)

end PixbufAnimationIter
