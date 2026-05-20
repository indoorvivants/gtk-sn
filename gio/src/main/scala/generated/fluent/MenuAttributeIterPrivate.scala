package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GMenuAttributeIterPrivate

class MenuAttributeIterPrivate private[gnome] (
    raw: Ptr[GMenuAttributeIterPrivate]
):

  def getUnsafeRawPointer(): Ptr[GMenuAttributeIterPrivate] = this.raw
end MenuAttributeIterPrivate

object MenuAttributeIterPrivate:
  def fromRaw(ptr: Ptr[GMenuAttributeIterPrivate]): MenuAttributeIterPrivate =
    new MenuAttributeIterPrivate(ptr)
end MenuAttributeIterPrivate
