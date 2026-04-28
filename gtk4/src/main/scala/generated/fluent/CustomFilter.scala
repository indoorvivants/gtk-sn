package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gpointer
import sn.gnome.gtk4.fluent.Filter
import sn.gnome.gtk4.internal.GtkCustomFilter
import sn.gnome.gtk4.internal.GtkCustomFilterFunc

class CustomFilter(raw: Ptr[GtkCustomFilter]) extends Filter(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def setFilterFunc(
      match_func: GtkCustomFilterFunc,
      user_data: Ptr[Byte],
      user_destroy: GDestroyNotify
  ): Unit = gtk_custom_filter_set_filter_func(
    this.raw.asInstanceOf,
    match_func,
    gpointer(user_data),
    user_destroy
  )

end CustomFilter

object CustomFilter:
  def apply(
      match_func: GtkCustomFilterFunc,
      user_data: Ptr[Byte],
      user_destroy: GDestroyNotify
  ): CustomFilter = new CustomFilter(
    gtk_custom_filter_new(
      match_func,
      gpointer(user_data),
      user_destroy
    ).asInstanceOf
  )
end CustomFilter
