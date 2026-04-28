package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GCompareDataFunc
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gpointer
import sn.gnome.gtk4.fluent.Sorter
import sn.gnome.gtk4.internal.GtkCustomSorter

class CustomSorter(raw: Ptr[GtkCustomSorter]) extends Sorter(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def setSortFunc(
      sort_func: GCompareDataFunc,
      user_data: Ptr[Byte],
      user_destroy: GDestroyNotify
  ): Unit = gtk_custom_sorter_set_sort_func(
    this.raw.asInstanceOf,
    sort_func,
    gpointer(user_data),
    user_destroy
  )

end CustomSorter

object CustomSorter:
  def apply(
      sort_func: GCompareDataFunc,
      user_data: Ptr[Byte],
      user_destroy: GDestroyNotify
  ): CustomSorter = new CustomSorter(
    gtk_custom_sorter_new(
      sort_func,
      gpointer(user_data),
      user_destroy
    ).asInstanceOf
  )
end CustomSorter
