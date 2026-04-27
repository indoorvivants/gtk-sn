package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait PollableOutputStream:
  def getUnsafeRawPointer(): Ptr[Byte]
end PollableOutputStream

object PollableOutputStream:
  class Abstract(raw: Ptr[Byte]) extends PollableOutputStream:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end PollableOutputStream
