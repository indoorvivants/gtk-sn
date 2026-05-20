package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.RangeClass
import sn.gnome.gtk4.internal.GtkScaleClass

class ScaleClass private[gnome] (raw: Ptr[GtkScaleClass]):

  def getUnsafeRawPointer(): Ptr[GtkScaleClass] = this.raw

  def parentClass: sn.gnome.gtk4.RangeClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkRangeClass]
  @annotation.compileTimeOnly(
    "[field get_layout_offsets]: Field is missing <type>"
  )
  private def getLayoutOffsets__ = ???

end ScaleClass

object ScaleClass:
  def fromRaw(ptr: Ptr[GtkScaleClass]): ScaleClass = new ScaleClass(ptr)
end ScaleClass
