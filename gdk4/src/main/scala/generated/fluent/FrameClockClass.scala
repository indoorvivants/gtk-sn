package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkFrameClockClass

class FrameClockClass private[gnome] (raw: Ptr[GdkFrameClockClass]):

  def getUnsafeRawPointer(): Ptr[GdkFrameClockClass] = this.raw
end FrameClockClass

object FrameClockClass:
  def fromRaw(ptr: Ptr[GdkFrameClockClass]): FrameClockClass =
    new FrameClockClass(ptr)
end FrameClockClass
