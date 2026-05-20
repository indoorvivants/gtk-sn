package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkPrintOperationPrivate

class PrintOperationPrivate private[gnome] (raw: Ptr[GtkPrintOperationPrivate]):

  def getUnsafeRawPointer(): Ptr[GtkPrintOperationPrivate] = this.raw
end PrintOperationPrivate

object PrintOperationPrivate:
  def fromRaw(ptr: Ptr[GtkPrintOperationPrivate]): PrintOperationPrivate =
    new PrintOperationPrivate(ptr)
end PrintOperationPrivate
