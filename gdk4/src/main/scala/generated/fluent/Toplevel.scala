package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait Toplevel:
  def getUnsafeRawPointer(): Ptr[Byte]
end Toplevel

object Toplevel:
  class Abstract(raw: Ptr[Byte]) extends Toplevel:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Toplevel
