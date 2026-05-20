package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GInetAddressClass
import sn.gnome.gobject.ObjectClass

class InetAddressClass private[gnome] (raw: Ptr[GInetAddressClass]):

  def getUnsafeRawPointer(): Ptr[GInetAddressClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field to_string]: Field is missing <type>")
  private def toString__ = ???
  @annotation.compileTimeOnly("[field to_bytes]: Field is missing <type>")
  private def toBytes__ = ???
end InetAddressClass

object InetAddressClass:
  def fromRaw(ptr: Ptr[GInetAddressClass]): InetAddressClass =
    new InetAddressClass(ptr)
end InetAddressClass
