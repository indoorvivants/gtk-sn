package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GApplicationPrivate

class ApplicationPrivate private[gnome] (raw: Ptr[GApplicationPrivate]):

  def getUnsafeRawPointer(): Ptr[GApplicationPrivate] = this.raw
end ApplicationPrivate

object ApplicationPrivate:
  def fromRaw(ptr: Ptr[GApplicationPrivate]): ApplicationPrivate =
    new ApplicationPrivate(ptr)
end ApplicationPrivate
