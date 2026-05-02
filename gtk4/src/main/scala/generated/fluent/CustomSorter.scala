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
      sort_func: Option[
        GCompareDataFunc /* Some(_root_.sn.gnome.glib.internal.GCompareDataFunc) */
      ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      user_destroy: GDestroyNotify /* Some(_root_.sn.gnome.glib.internal.GDestroyNotify) */
  ): Unit /* None */ = gtk_custom_sorter_set_sort_func(
    this.raw.asInstanceOf[Ptr[GtkCustomSorter]],
    sort_func
      .map[_root_.sn.gnome.glib.internal.GCompareDataFunc](o => o)
      .getOrElse(
        null.asInstanceOf[_root_.sn.gnome.glib.internal.GCompareDataFunc]
      ),
    user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
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
      sort_func: Option[
        GCompareDataFunc /* Some(_root_.sn.gnome.glib.internal.GCompareDataFunc) */
      ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      user_destroy: Option[
        GDestroyNotify /* Some(_root_.sn.gnome.glib.internal.GDestroyNotify) */
      ]
  ): CustomSorter = new CustomSorter(
    gtk_custom_sorter_new(
      sort_func
        .map[_root_.sn.gnome.glib.internal.GCompareDataFunc](o => o)
        .getOrElse(
          null.asInstanceOf[_root_.sn.gnome.glib.internal.GCompareDataFunc]
        ),
      user_data
        .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
      user_destroy
        .map[_root_.sn.gnome.glib.internal.GDestroyNotify](o => o)
        .getOrElse(
          null.asInstanceOf[_root_.sn.gnome.glib.internal.GDestroyNotify]
        )
    ).asInstanceOf
  )
end CustomSorter
