package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkEventSequence

/** `GdkEventSequence` is an opaque type representing a sequence of related
  * touch events.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class EventSequence private[gnome] (raw: Ptr[GdkEventSequence]):

  def getUnsafeRawPointer(): Ptr[GdkEventSequence] = this.raw
end EventSequence

object EventSequence:
  def fromRaw(ptr: Ptr[GdkEventSequence]): EventSequence = new EventSequence(
    ptr
  )
end EventSequence
