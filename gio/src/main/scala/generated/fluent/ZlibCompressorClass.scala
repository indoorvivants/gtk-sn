package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GZlibCompressorClass
import sn.gnome.gobject.ObjectClass

class ZlibCompressorClass private[gnome] (raw: Ptr[GZlibCompressorClass]):

  def getUnsafeRawPointer(): Ptr[GZlibCompressorClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end ZlibCompressorClass

object ZlibCompressorClass:
  def fromRaw(ptr: Ptr[GZlibCompressorClass]): ZlibCompressorClass =
    new ZlibCompressorClass(ptr)
end ZlibCompressorClass
