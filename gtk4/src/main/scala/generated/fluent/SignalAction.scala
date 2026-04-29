package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.ShortcutAction
import sn.gnome.gtk4.internal.GtkSignalAction

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkShortcut`Action that emits a signal.
  *
  * Signals that are used in this way are referred to as keybinding signals, and
  * they are expected to be defined with the %G_SIGNAL_ACTION flag.
  */
class SignalAction(raw: Ptr[GtkSignalAction])
    extends ShortcutAction(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the name of the signal that will be emitted.
    */
  def getSignalName()(using Zone): String = fromCString(
    gtk_signal_action_get_signal_name(this.raw.asInstanceOf).asInstanceOf
  )

end SignalAction

object SignalAction:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates an action that when activated, emits the given action signal on
    * the provided widget.
    *
    * It will also unpack the args into arguments passed to the signal.
    */
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
