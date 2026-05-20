package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.pango.internal.PangoRendererPrivate

class RendererPrivate private[gnome] (raw: Ptr[PangoRendererPrivate]):

  def getUnsafeRawPointer(): Ptr[PangoRendererPrivate] = this.raw
end RendererPrivate

object RendererPrivate:
  def fromRaw(ptr: Ptr[PangoRendererPrivate]): RendererPrivate =
    new RendererPrivate(ptr)
end RendererPrivate
