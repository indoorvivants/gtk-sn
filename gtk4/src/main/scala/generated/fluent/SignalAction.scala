package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.ShortcutAction
import sn.gnome.gtk4.internal.GtkSignalAction

class SignalAction(raw: Ptr[GtkSignalAction])
    extends ShortcutAction(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getSignalName()(using Zone): String = fromCString(
    gtk_signal_action_get_signal_name(this.raw.asInstanceOf).asInstanceOf
  )

end SignalAction

object SignalAction:
  def apply(signal_name: String | CString)(using Zone): SignalAction =
    new SignalAction(
      gtk_signal_action_new(__sn_extract_string(signal_name)).asInstanceOf
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end SignalAction
