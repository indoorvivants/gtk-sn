package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkEntryBufferClass

class EntryBufferClass private[gnome] (raw: Ptr[GtkEntryBufferClass]):

  def getUnsafeRawPointer(): Ptr[GtkEntryBufferClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field inserted_text]: Field is missing <type>")
  private def insertedText__ = ???
  @annotation.compileTimeOnly("[field deleted_text]: Field is missing <type>")
  private def deletedText__ = ???
  @annotation.compileTimeOnly("[field get_text]: Field is missing <type>")
  private def getText__ = ???
  @annotation.compileTimeOnly("[field get_length]: Field is missing <type>")
  private def getLength__ = ???
  @annotation.compileTimeOnly("[field insert_text]: Field is missing <type>")
  private def insertText__ = ???
  @annotation.compileTimeOnly("[field delete_text]: Field is missing <type>")
  private def deleteText__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved1]: Field is missing <type>")
  private def GtkReserved1__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved2]: Field is missing <type>")
  private def GtkReserved2__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved3]: Field is missing <type>")
  private def GtkReserved3__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved4]: Field is missing <type>")
  private def GtkReserved4__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved5]: Field is missing <type>")
  private def GtkReserved5__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved6]: Field is missing <type>")
  private def GtkReserved6__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved7]: Field is missing <type>")
  private def GtkReserved7__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved8]: Field is missing <type>")
  private def GtkReserved8__ = ???
end EntryBufferClass

object EntryBufferClass:
  def fromRaw(ptr: Ptr[GtkEntryBufferClass]): EntryBufferClass =
    new EntryBufferClass(ptr)
end EntryBufferClass
