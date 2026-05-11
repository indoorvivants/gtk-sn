package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.LayoutManager
import sn.gnome.gtk4.internal.GtkCustomLayout

/** `GtkCustomLayout` uses closures for size negotiation.
  *
  * A `GtkCustomLayout `uses closures matching to the old `GtkWidget` virtual
  * functions for size negotiation, as a convenience API to ease the porting
  * towards the corresponding `GtkLayoutManager virtual functions.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CustomLayout private[gnome] (raw: Ptr[GtkCustomLayout])
    extends LayoutManager(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CustomLayout

object CustomLayout:
  def applyUnsafe(ptr: Ptr[GtkCustomLayout])(using Runtime) =
    summon[Runtime].getOrCreate[CustomLayout](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new CustomLayout(ptr)
    )

  /** Creates a new legacy layout manager.
    *
    * Legacy layout managers map to the old `GtkWidget` size negotiation virtual
    * functions, and are meant to be used during the transition from layout
    * containers to layout manager delegates.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[request_mode]: Cannot render type Type(List(),ListMap(@name -> DataRecord(CustomRequestModeFunc), @type -> DataRecord(GtkCustomRequestModeFunc)))"
  )
  private def `new`() = ???

end CustomLayout
