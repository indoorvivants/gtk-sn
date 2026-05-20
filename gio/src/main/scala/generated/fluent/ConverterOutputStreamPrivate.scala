package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GConverterOutputStreamPrivate

class ConverterOutputStreamPrivate private[gnome] (
    raw: Ptr[GConverterOutputStreamPrivate]
):

  def getUnsafeRawPointer(): Ptr[GConverterOutputStreamPrivate] = this.raw
end ConverterOutputStreamPrivate

object ConverterOutputStreamPrivate:
  def fromRaw(
      ptr: Ptr[GConverterOutputStreamPrivate]
  ): ConverterOutputStreamPrivate = new ConverterOutputStreamPrivate(ptr)
end ConverterOutputStreamPrivate
