package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.Sorter
import sn.gnome.gtk4.internal.GtkMultiSorter

class MultiSorter(raw: Ptr[GtkMultiSorter])
    extends Sorter(raw.asInstanceOf),
      ListModel,
      Buildable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def append(sorter: Sorter): Unit = gtk_multi_sorter_append(
    this.raw.asInstanceOf,
    sorter.getUnsafeRawPointer().asInstanceOf
  )

  def remove(position: UInt): Unit =
    gtk_multi_sorter_remove(this.raw.asInstanceOf, guint(position))

end MultiSorter

object MultiSorter:
  def apply(): MultiSorter = new MultiSorter(
    gtk_multi_sorter_new().asInstanceOf
  )
end MultiSorter
