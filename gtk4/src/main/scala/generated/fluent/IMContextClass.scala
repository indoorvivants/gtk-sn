package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkIMContextClass

class IMContextClass private[gnome] (raw: Ptr[GtkIMContextClass]):

  def getUnsafeRawPointer(): Ptr[GtkIMContextClass] = this.raw

  @annotation.compileTimeOnly("[field preedit_start]: Field is missing <type>")
  private def preeditStart__ = ???
  @annotation.compileTimeOnly("[field preedit_end]: Field is missing <type>")
  private def preeditEnd__ = ???
  @annotation.compileTimeOnly(
    "[field preedit_changed]: Field is missing <type>"
  )
  private def preeditChanged__ = ???
  @annotation.compileTimeOnly("[field commit]: Field is missing <type>")
  private def commit__ = ???
  @annotation.compileTimeOnly(
    "[field retrieve_surrounding]: Field is missing <type>"
  )
  private def retrieveSurrounding__ = ???
  @annotation.compileTimeOnly(
    "[field delete_surrounding]: Field is missing <type>"
  )
  private def deleteSurrounding__ = ???
  @annotation.compileTimeOnly(
    "[field set_client_widget]: Field is missing <type>"
  )
  private def setClientWidget__ = ???
  @annotation.compileTimeOnly(
    "[field get_preedit_string]: Field is missing <type>"
  )
  private def getPreeditString__ = ???
  @annotation.compileTimeOnly(
    "[field filter_keypress]: Field is missing <type>"
  )
  private def filterKeypress__ = ???
  @annotation.compileTimeOnly("[field focus_in]: Field is missing <type>")
  private def focusIn__ = ???
  @annotation.compileTimeOnly("[field focus_out]: Field is missing <type>")
  private def focusOut__ = ???
  @annotation.compileTimeOnly("[field reset]: Field is missing <type>")
  private def reset__ = ???
  @annotation.compileTimeOnly(
    "[field set_cursor_location]: Field is missing <type>"
  )
  private def setCursorLocation__ = ???
  @annotation.compileTimeOnly(
    "[field set_use_preedit]: Field is missing <type>"
  )
  private def setUsePreedit__ = ???
  @annotation.compileTimeOnly(
    "[field set_surrounding]: Field is missing <type>"
  )
  private def setSurrounding__ = ???
  @annotation.compileTimeOnly(
    "[field get_surrounding]: Field is missing <type>"
  )
  private def getSurrounding__ = ???
  @annotation.compileTimeOnly(
    "[field set_surrounding_with_selection]: Field is missing <type>"
  )
  private def setSurroundingWithSelection__ = ???
  @annotation.compileTimeOnly(
    "[field get_surrounding_with_selection]: Field is missing <type>"
  )
  private def getSurroundingWithSelection__ = ???
  @annotation.compileTimeOnly("[field activate_osk]: Field is missing <type>")
  private def activateOsk__ = ???
  @annotation.compileTimeOnly(
    "[field _gtk_reserved1]: Field _gtk_reserved1 has no target types"
  )
  private def GtkReserved1__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved2]: Field is missing <type>")
  private def GtkReserved2__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved3]: Field is missing <type>")
  private def GtkReserved3__ = ???
  @annotation.compileTimeOnly("[field _gtk_reserved4]: Field is missing <type>")
  private def GtkReserved4__ = ???
end IMContextClass

object IMContextClass:
  def fromRaw(ptr: Ptr[GtkIMContextClass]): IMContextClass = new IMContextClass(
    ptr
  )
end IMContextClass
