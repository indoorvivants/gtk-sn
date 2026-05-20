package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkPrintBackend

class PrintBackend private[gnome] (raw: Ptr[GtkPrintBackend]):

  def getUnsafeRawPointer(): Ptr[GtkPrintBackend] = this.raw

end PrintBackend
object PrintBackend:
  def fromRaw(ptr: Ptr[GtkPrintBackend]): PrintBackend = new PrintBackend(ptr)
end PrintBackend
