package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GIOStreamPrivate

class IOStreamPrivate private[gnome] (raw: Ptr[GIOStreamPrivate]):

  def getUnsafeRawPointer(): Ptr[GIOStreamPrivate] = this.raw
end IOStreamPrivate

object IOStreamPrivate:
  def fromRaw(ptr: Ptr[GIOStreamPrivate]): IOStreamPrivate =
    new IOStreamPrivate(ptr)
end IOStreamPrivate
