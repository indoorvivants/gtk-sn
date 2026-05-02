package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gpointer
import sn.gnome.gtk4.fluent.Filter
import sn.gnome.gtk4.internal.GtkCustomFilter
import sn.gnome.gtk4.internal.GtkCustomFilterFunc

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkCustomFilter` determines whether to include items with a callback.
  */
class CustomFilter(raw: Ptr[GtkCustomFilter]) extends Filter(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the function used for filtering items.
    *
    * If @match_func is %NULL, the filter matches all items.
    *
    * If the filter func changes its filtering behavior, gtk_filter_changed()
    * needs to be called.
    *
    * If a previous function was set, its @user_destroy will be called now.
    */
  def setFilterFunc(
      match_func: Option[GtkCustomFilterFunc /* Some(GtkCustomFilterFunc) */ ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      user_destroy: GDestroyNotify /* Some(_root_.sn.gnome.glib.internal.GDestroyNotify) */
  ): Unit /* None */ = gtk_custom_filter_set_filter_func(
    this.raw.asInstanceOf,
    match_func
      .map[GtkCustomFilterFunc](o => o)
      .getOrElse(null.asInstanceOf[GtkCustomFilterFunc]),
    user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
    user_destroy
  )

end CustomFilter

object CustomFilter:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new filter using the given @match_func to filter items.
    *
    * If @match_func is %NULL, the filter matches all items.
    *
    * If the filter func changes its filtering behavior, gtk_filter_changed()
    * needs to be called.
    */
  def apply(
      match_func: Option[GtkCustomFilterFunc /* Some(GtkCustomFilterFunc) */ ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      user_destroy: GDestroyNotify /* Some(_root_.sn.gnome.glib.internal.GDestroyNotify) */
  ): CustomFilter = new CustomFilter(
    gtk_custom_filter_new(
      match_func
        .map[GtkCustomFilterFunc](o => o)
        .getOrElse(null.asInstanceOf[GtkCustomFilterFunc]),
      user_data
        .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
      user_destroy
    ).asInstanceOf
  )
end CustomFilter
