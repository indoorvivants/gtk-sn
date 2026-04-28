package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.ShortcutAction
import sn.gnome.gtk4.internal.GtkNamedAction

class NamedAction(raw: Ptr[GtkNamedAction])
    extends ShortcutAction(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getActionName()(using Zone): String = fromCString(
    gtk_named_action_get_action_name(this.raw.asInstanceOf).asInstanceOf
  )

end NamedAction

object NamedAction:
  def apply(name: String | CString)(using Zone): NamedAction = new NamedAction(
    gtk_named_action_new(__sn_extract_string(name)).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end NamedAction
