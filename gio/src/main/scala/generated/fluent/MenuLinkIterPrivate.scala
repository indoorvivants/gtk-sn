package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GMenuLinkIterPrivate

class MenuLinkIterPrivate private[gnome] (raw: Ptr[GMenuLinkIterPrivate]):

  def getUnsafeRawPointer(): Ptr[GMenuLinkIterPrivate] = this.raw
end MenuLinkIterPrivate

object MenuLinkIterPrivate:
  def fromRaw(ptr: Ptr[GMenuLinkIterPrivate]): MenuLinkIterPrivate =
    new MenuLinkIterPrivate(ptr)
end MenuLinkIterPrivate
