package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GFilenameCompleterClass
import sn.gnome.gobject.ObjectClass

class FilenameCompleterClass private[gnome] (raw: Ptr[GFilenameCompleterClass]):

  def getUnsafeRawPointer(): Ptr[GFilenameCompleterClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly(
    "[field got_completion_data]: Field is missing <type>"
  )
  private def gotCompletionData__ = ???
  @annotation.compileTimeOnly("[field _g_reserved1]: Field is missing <type>")
  private def GReserved1__ = ???
  @annotation.compileTimeOnly("[field _g_reserved2]: Field is missing <type>")
  private def GReserved2__ = ???
  @annotation.compileTimeOnly("[field _g_reserved3]: Field is missing <type>")
  private def GReserved3__ = ???
end FilenameCompleterClass

object FilenameCompleterClass:
  def fromRaw(ptr: Ptr[GFilenameCompleterClass]): FilenameCompleterClass =
    new FilenameCompleterClass(ptr)
end FilenameCompleterClass
