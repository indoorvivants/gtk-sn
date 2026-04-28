package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ListModel
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.MultiFilter
import sn.gnome.gtk4.internal.GtkEveryFilter

class EveryFilter(raw: Ptr[GtkEveryFilter])
    extends MultiFilter(raw.asInstanceOf),
      ListModel,
      Buildable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end EveryFilter

object EveryFilter:
  def apply(): EveryFilter = new EveryFilter(
    gtk_every_filter_new().asInstanceOf
  )
end EveryFilter
