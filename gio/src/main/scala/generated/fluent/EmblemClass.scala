package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GEmblemClass

class EmblemClass private[gnome] (raw: Ptr[GEmblemClass]):

  def getUnsafeRawPointer(): Ptr[GEmblemClass] = this.raw
end EmblemClass

object EmblemClass:
  def fromRaw(ptr: Ptr[GEmblemClass]): EmblemClass = new EmblemClass(ptr)
end EmblemClass
