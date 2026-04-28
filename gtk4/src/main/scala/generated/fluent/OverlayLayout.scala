package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.LayoutManager
import sn.gnome.gtk4.internal.GtkOverlayLayout

class OverlayLayout(raw: Ptr[GtkOverlayLayout])
    extends LayoutManager(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end OverlayLayout

object OverlayLayout:
  def apply(): OverlayLayout = new OverlayLayout(
    gtk_overlay_layout_new().asInstanceOf
  )
end OverlayLayout
