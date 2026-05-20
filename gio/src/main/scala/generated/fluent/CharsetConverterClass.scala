package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GCharsetConverterClass
import sn.gnome.gobject.ObjectClass

class CharsetConverterClass private[gnome] (raw: Ptr[GCharsetConverterClass]):

  def getUnsafeRawPointer(): Ptr[GCharsetConverterClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end CharsetConverterClass

object CharsetConverterClass:
  def fromRaw(ptr: Ptr[GCharsetConverterClass]): CharsetConverterClass =
    new CharsetConverterClass(ptr)
end CharsetConverterClass
