package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.ShortcutAction
import sn.gnome.gtk4.internal.GtkSignalAction

/** A `GtkShortcut`Action that emits a signal.
  *
  * Signals that are used in this way are referred to as keybinding signals, and
  * they are expected to be defined with the %G_SIGNAL_ACTION flag.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SignalAction(raw: Ptr[GtkSignalAction])
    extends ShortcutAction(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the name of the signal that will be emitted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSignalName()(using Zone): String /* None */ = fromCString(
    gtk_signal_action_get_signal_name(
      this.raw.asInstanceOf[Ptr[GtkSignalAction]]
    ).asInstanceOf
  )

end SignalAction

object SignalAction:
  /** Creates an action that when activated, emits the given action signal on
    * the provided widget.
    *
    * It will also unpack the args into arguments passed to the signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      signal_name: String | CString /* Some(CString) */
  )(using Zone): SignalAction = new SignalAction(
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
