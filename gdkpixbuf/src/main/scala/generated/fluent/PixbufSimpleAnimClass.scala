package sn.gnome.gdkpixbuf

import _root_.sn.gnome.gdkpixbuf.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdkpixbuf.internal.GdkPixbufSimpleAnimClass

class PixbufSimpleAnimClass private[gnome] (raw: Ptr[GdkPixbufSimpleAnimClass]):

  def getUnsafeRawPointer(): Ptr[GdkPixbufSimpleAnimClass] = this.raw
end PixbufSimpleAnimClass

object PixbufSimpleAnimClass:
  def fromRaw(ptr: Ptr[GdkPixbufSimpleAnimClass]): PixbufSimpleAnimClass =
    new PixbufSimpleAnimClass(ptr)
end PixbufSimpleAnimClass
