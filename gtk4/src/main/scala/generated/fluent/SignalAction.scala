package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
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
class SignalAction private[gnome] (raw: Ptr[GtkSignalAction])
    extends ShortcutAction(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the name of the signal that will be emitted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSignalName()(using Zone): String /* None */ =
    fromCString(
      gtk_signal_action_get_signal_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSignalAction]]
      ).asInstanceOf
    )
  end getSignalName

end SignalAction

object SignalAction:
  def applyUnsafe(ptr: Ptr[GtkSignalAction])(using Runtime) =
    summon[Runtime].getOrCreate[SignalAction](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new SignalAction(ptr)
    )

  /** Creates an action that when activated, emits the given action signal on
    * the provided widget.
    *
    * It will also unpack the args into arguments passed to the signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      signal_name: String /* Some(CString) */
  )(using Zone, Runtime): SignalAction =
    val raw: Ptr[Byte] = gtk_signal_action_new(
      toCString(signal_name)
    ).asInstanceOf
    summon[Runtime].getOrCreate[SignalAction](
      raw,
      r => SignalAction.applyUnsafe(r.asInstanceOf)
    )
  end apply
end SignalAction
