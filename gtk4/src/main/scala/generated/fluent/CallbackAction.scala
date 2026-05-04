package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.ShortcutAction
import sn.gnome.gtk4.internal.GtkCallbackAction

/** A `GtkShortcutAction` that invokes a callback.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CallbackAction(raw: Ptr[GtkCallbackAction])
    extends ShortcutAction(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CallbackAction

object CallbackAction:
  /** Create a custom action that calls the given @callback when activated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ShortcutFunc), @type -> DataRecord(GtkShortcutFunc)))"
  )
  private def `new`() = ???

end CallbackAction
