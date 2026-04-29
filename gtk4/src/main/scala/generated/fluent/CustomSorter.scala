package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GCompareDataFunc
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gpointer
import sn.gnome.gtk4.fluent.Sorter
import sn.gnome.gtk4.internal.GtkCustomSorter

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkCustomSorter` is a `GtkSorter` implementation that sorts via a callback
  * function.
  */
class CustomSorter(raw: Ptr[GtkCustomSorter]) extends Sorter(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets (or unsets) the function used for sorting items.
    *
    * If @sort_func is %NULL, all items are considered equal.
    *
    * If the sort func changes its sorting behavior, gtk_sorter_changed() needs
    * to be called.
    *
    * If a previous function was set, its @user_destroy will be called now.
    */
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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkSorter` that works by calling
    * @sort_func
    *   to compare items.
    *
    * If @sort_func is %NULL, all items are considered equal.
    */
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
