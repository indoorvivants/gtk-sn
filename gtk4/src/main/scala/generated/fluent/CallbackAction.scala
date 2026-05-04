package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.ShortcutAction
import sn.gnome.gtk4.internal.GtkCallbackAction

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkShortcutAction` that invokes a callback.
  */
class CallbackAction(raw: Ptr[GtkCallbackAction])
    extends ShortcutAction(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CallbackAction

object CallbackAction:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a custom action that calls the given @callback when activated.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(ShortcutFunc), @type -> DataRecord(GtkShortcutFunc)))"
  )
  def `new`() = ???

end CallbackAction
