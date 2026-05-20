package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkRangeClass

class RangeClass private[gnome] (raw: Ptr[GtkRangeClass]):

  def getUnsafeRawPointer(): Ptr[GtkRangeClass] = this.raw

  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]
  @annotation.compileTimeOnly("[field value_changed]: Field is missing <type>")
  private def valueChanged__ = ???
  @annotation.compileTimeOnly("[field adjust_bounds]: Field is missing <type>")
  private def adjustBounds__ = ???
  @annotation.compileTimeOnly("[field move_slider]: Field is missing <type>")
  private def moveSlider__ = ???
  @annotation.compileTimeOnly(
    "[field get_range_border]: Field is missing <type>"
  )
  private def getRangeBorder__ = ???
  @annotation.compileTimeOnly("[field change_value]: Field is missing <type>")
  private def changeValue__ = ???

end RangeClass

object RangeClass:
  def fromRaw(ptr: Ptr[GtkRangeClass]): RangeClass = new RangeClass(ptr)
end RangeClass
