package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

trait PrintOperationPreview:
  def getUnsafeRawPointer(): Ptr[Byte]
end PrintOperationPreview

object PrintOperationPreview:
  class Abstract(raw: Ptr[Byte]) extends PrintOperationPreview:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end PrintOperationPreview
