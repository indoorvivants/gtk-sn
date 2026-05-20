package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GSimpleAsyncResultClass

class SimpleAsyncResultClass private[gnome] (raw: Ptr[GSimpleAsyncResultClass]):

  def getUnsafeRawPointer(): Ptr[GSimpleAsyncResultClass] = this.raw
end SimpleAsyncResultClass

object SimpleAsyncResultClass:
  def fromRaw(ptr: Ptr[GSimpleAsyncResultClass]): SimpleAsyncResultClass =
    new SimpleAsyncResultClass(ptr)
end SimpleAsyncResultClass
