package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GEmblemedIconPrivate

class EmblemedIconPrivate private[gnome] (raw: Ptr[GEmblemedIconPrivate]):

  def getUnsafeRawPointer(): Ptr[GEmblemedIconPrivate] = this.raw
end EmblemedIconPrivate

object EmblemedIconPrivate:
  def fromRaw(ptr: Ptr[GEmblemedIconPrivate]): EmblemedIconPrivate =
    new EmblemedIconPrivate(ptr)
end EmblemedIconPrivate
