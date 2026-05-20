package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GSocketAddressClass
import sn.gnome.gobject.ObjectClass

class SocketAddressClass private[gnome] (raw: Ptr[GSocketAddressClass]):

  def getUnsafeRawPointer(): Ptr[GSocketAddressClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field get_family]: Field is missing <type>")
  private def getFamily__ = ???
  @annotation.compileTimeOnly(
    "[field get_native_size]: Field is missing <type>"
  )
  private def getNativeSize__ = ???
  @annotation.compileTimeOnly("[field to_native]: Field is missing <type>")
  private def toNative__ = ???
end SocketAddressClass

object SocketAddressClass:
  def fromRaw(ptr: Ptr[GSocketAddressClass]): SocketAddressClass =
    new SocketAddressClass(ptr)
end SocketAddressClass
