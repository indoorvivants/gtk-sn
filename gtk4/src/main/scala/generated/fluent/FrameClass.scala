package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkFrameClass

class FrameClass private[gnome] (raw: Ptr[GtkFrameClass]):

  def getUnsafeRawPointer(): Ptr[GtkFrameClass] = this.raw

  /** The parent class.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]
  @annotation.compileTimeOnly(
    "[field compute_child_allocation]: Field is missing <type>"
  )
  private def computeChildAllocation__ = ???

end FrameClass

object FrameClass:
  def fromRaw(ptr: Ptr[GtkFrameClass]): FrameClass = new FrameClass(ptr)
end FrameClass
