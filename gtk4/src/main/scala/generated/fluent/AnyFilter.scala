package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ListModel
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.MultiFilter
import sn.gnome.gtk4.internal.GtkAnyFilter

class AnyFilter(raw: Ptr[GtkAnyFilter])
    extends MultiFilter(raw.asInstanceOf),
      ListModel,
      Buildable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end AnyFilter

object AnyFilter:
  def apply(): AnyFilter = new AnyFilter(gtk_any_filter_new().asInstanceOf)
end AnyFilter
