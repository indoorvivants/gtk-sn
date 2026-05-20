package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GConverterInputStreamPrivate

class ConverterInputStreamPrivate private[gnome] (
    raw: Ptr[GConverterInputStreamPrivate]
):

  def getUnsafeRawPointer(): Ptr[GConverterInputStreamPrivate] = this.raw
end ConverterInputStreamPrivate

object ConverterInputStreamPrivate:
  def fromRaw(
      ptr: Ptr[GConverterInputStreamPrivate]
  ): ConverterInputStreamPrivate = new ConverterInputStreamPrivate(ptr)
end ConverterInputStreamPrivate
