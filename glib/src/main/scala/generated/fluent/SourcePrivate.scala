package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GSourcePrivate

class SourcePrivate private[gnome] (raw: Ptr[GSourcePrivate]):

  def getUnsafeRawPointer(): Ptr[GSourcePrivate] = this.raw
end SourcePrivate

object SourcePrivate:
  def fromRaw(ptr: Ptr[GSourcePrivate]): SourcePrivate = new SourcePrivate(ptr)
end SourcePrivate
