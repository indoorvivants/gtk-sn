package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.LayoutManager
import sn.gnome.gtk4.internal.GtkBinLayout

class BinLayout(raw: Ptr[GtkBinLayout]) extends LayoutManager(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end BinLayout

object BinLayout:
  def apply(): BinLayout = new BinLayout(gtk_bin_layout_new().asInstanceOf)
end BinLayout
