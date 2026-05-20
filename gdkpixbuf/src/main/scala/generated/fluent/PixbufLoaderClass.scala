package sn.gnome.gdkpixbuf

import _root_.sn.gnome.gdkpixbuf.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdkpixbuf.internal.GdkPixbufLoaderClass
import sn.gnome.gobject.ObjectClass

class PixbufLoaderClass private[gnome] (raw: Ptr[GdkPixbufLoaderClass]):

  def getUnsafeRawPointer(): Ptr[GdkPixbufLoaderClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field size_prepared]: Field is missing <type>")
  private def sizePrepared__ = ???
  @annotation.compileTimeOnly("[field area_prepared]: Field is missing <type>")
  private def areaPrepared__ = ???
  @annotation.compileTimeOnly("[field area_updated]: Field is missing <type>")
  private def areaUpdated__ = ???
  @annotation.compileTimeOnly("[field closed]: Field is missing <type>")
  private def closed__ = ???
end PixbufLoaderClass

object PixbufLoaderClass:
  def fromRaw(ptr: Ptr[GdkPixbufLoaderClass]): PixbufLoaderClass =
    new PixbufLoaderClass(ptr)
end PixbufLoaderClass
