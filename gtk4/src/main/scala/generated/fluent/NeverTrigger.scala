package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{NeverTrigger, ShortcutTrigger}
import sn.gnome.gtk4.internal.GtkNeverTrigger

/** A `GtkShortcutTrigger` that never triggers.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class NeverTrigger private[gnome] (raw: Ptr[GtkNeverTrigger])
    extends ShortcutTrigger(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end NeverTrigger

object NeverTrigger:
  def applyUnsafe(ptr: Ptr[GtkNeverTrigger])(using Runtime) =
    summon[Runtime].getOrCreate[NeverTrigger](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new NeverTrigger(ptr)
    )

  /** Gets the never trigger.
    *
    * This is a singleton for a trigger that never triggers. Use this trigger
    * instead of %NULL because it implements all virtual functions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def get()(using
      Runtime
  ): sn.gnome.gtk4.fluent.NeverTrigger /* Some(Ptr[GtkShortcutTrigger]) */ =
    sn.gnome.gtk4.fluent.NeverTrigger
      .applyUnsafe(gtk_never_trigger_get().asInstanceOf)

end NeverTrigger
