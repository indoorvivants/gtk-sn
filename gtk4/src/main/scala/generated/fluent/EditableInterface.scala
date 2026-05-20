package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.TypeInterface
import sn.gnome.gtk4.internal.GtkEditableInterface

class EditableInterface private[gnome] (raw: Ptr[GtkEditableInterface]):

  def getUnsafeRawPointer(): Ptr[GtkEditableInterface] = this.raw

  def baseIface: sn.gnome.gobject.TypeInterface /* None */ = (!raw).base_iface
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field insert_text]: Field is missing <type>")
  private def insertText__ = ???
  @annotation.compileTimeOnly("[field delete_text]: Field is missing <type>")
  private def deleteText__ = ???
  @annotation.compileTimeOnly("[field changed]: Field is missing <type>")
  private def changed__ = ???
  @annotation.compileTimeOnly("[field get_text]: Field is missing <type>")
  private def getText__ = ???
  @annotation.compileTimeOnly("[field do_insert_text]: Field is missing <type>")
  private def doInsertText__ = ???
  @annotation.compileTimeOnly("[field do_delete_text]: Field is missing <type>")
  private def doDeleteText__ = ???
  @annotation.compileTimeOnly(
    "[field get_selection_bounds]: Field is missing <type>"
  )
  private def getSelectionBounds__ = ???
  @annotation.compileTimeOnly(
    "[field set_selection_bounds]: Field is missing <type>"
  )
  private def setSelectionBounds__ = ???
  @annotation.compileTimeOnly("[field get_delegate]: Field is missing <type>")
  private def getDelegate__ = ???
end EditableInterface

object EditableInterface:
  def fromRaw(ptr: Ptr[GtkEditableInterface]): EditableInterface =
    new EditableInterface(ptr)
end EditableInterface
