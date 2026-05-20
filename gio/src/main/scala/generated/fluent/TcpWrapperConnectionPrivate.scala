package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GTcpWrapperConnectionPrivate

class TcpWrapperConnectionPrivate private[gnome] (
    raw: Ptr[GTcpWrapperConnectionPrivate]
):

  def getUnsafeRawPointer(): Ptr[GTcpWrapperConnectionPrivate] = this.raw
end TcpWrapperConnectionPrivate

object TcpWrapperConnectionPrivate:
  def fromRaw(
      ptr: Ptr[GTcpWrapperConnectionPrivate]
  ): TcpWrapperConnectionPrivate = new TcpWrapperConnectionPrivate(ptr)
end TcpWrapperConnectionPrivate
