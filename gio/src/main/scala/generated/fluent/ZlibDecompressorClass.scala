package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GZlibDecompressorClass
import sn.gnome.gobject.ObjectClass

class ZlibDecompressorClass private[gnome] (raw: Ptr[GZlibDecompressorClass]):

  def getUnsafeRawPointer(): Ptr[GZlibDecompressorClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end ZlibDecompressorClass

object ZlibDecompressorClass:
  def fromRaw(ptr: Ptr[GZlibDecompressorClass]): ZlibDecompressorClass =
    new ZlibDecompressorClass(ptr)
end ZlibDecompressorClass
