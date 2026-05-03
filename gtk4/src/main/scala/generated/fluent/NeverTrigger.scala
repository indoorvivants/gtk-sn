package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.NeverTrigger
import sn.gnome.gtk4.fluent.ShortcutTrigger
import sn.gnome.gtk4.internal.GtkNeverTrigger

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkShortcutTrigger` that never triggers.
  */
class NeverTrigger(raw: Ptr[GtkNeverTrigger])
    extends ShortcutTrigger(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end NeverTrigger

object NeverTrigger:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the never trigger.
    *
    * This is a singleton for a trigger that never triggers. Use this trigger
    * instead of %NULL because it implements all virtual functions.
    */
  def get(): NeverTrigger /* None */ = new NeverTrigger(
    gtk_never_trigger_get().asInstanceOf
  )

end NeverTrigger
