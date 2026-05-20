package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkFrameClockPrivate

class FrameClockPrivate private[gnome] (raw: Ptr[GdkFrameClockPrivate]):

  def getUnsafeRawPointer(): Ptr[GdkFrameClockPrivate] = this.raw
end FrameClockPrivate

object FrameClockPrivate:
  def fromRaw(ptr: Ptr[GdkFrameClockPrivate]): FrameClockPrivate =
    new FrameClockPrivate(ptr)
end FrameClockPrivate
