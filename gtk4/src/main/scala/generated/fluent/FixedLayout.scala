package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.LayoutManager
import sn.gnome.gtk4.internal.GtkFixedLayout

class FixedLayout(raw: Ptr[GtkFixedLayout])
    extends LayoutManager(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end FixedLayout

object FixedLayout:
  def apply(): FixedLayout = new FixedLayout(
    gtk_fixed_layout_new().asInstanceOf
  )
end FixedLayout
