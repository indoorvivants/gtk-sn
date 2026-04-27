package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

trait PollableInputStream:
  def getUnsafeRawPointer(): Ptr[Byte]
end PollableInputStream

object PollableInputStream:
  class Abstract(raw: Ptr[Byte]) extends PollableInputStream:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end PollableInputStream
