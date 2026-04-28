package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.LayoutManager
import sn.gnome.gtk4.internal.GtkCustomAllocateFunc
import sn.gnome.gtk4.internal.GtkCustomLayout
import sn.gnome.gtk4.internal.GtkCustomMeasureFunc
import sn.gnome.gtk4.internal.GtkCustomRequestModeFunc

class CustomLayout(raw: Ptr[GtkCustomLayout])
    extends LayoutManager(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CustomLayout

object CustomLayout:
  def apply(
      request_mode: GtkCustomRequestModeFunc,
      measure: GtkCustomMeasureFunc,
      allocate: GtkCustomAllocateFunc
  ): CustomLayout = new CustomLayout(
    gtk_custom_layout_new(request_mode, measure, allocate).asInstanceOf
  )
end CustomLayout
