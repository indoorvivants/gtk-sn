package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.internal.GtkFilter
import sn.gnome.gtk4.internal.GtkFilterChange
import sn.gnome.gtk4.internal.GtkFilterMatch

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkFilter` object describes the filtering to be performed by a
  * [class@Gtk.FilterListModel].
  *
  * The model will use the filter to determine if it should include items or not
  * by calling [method@Gtk.Filter.match] for each item and only keeping the ones
  * that the function returns %TRUE for.
  *
  * Filters may change what items they match through their lifetime. In that
  * case, they will emit the [signal@Gtk.Filter::changed] signal to notify that
  * previous filter results are no longer valid and that items should be checked
  * again via [method@Gtk.Filter.match].
  *
  * GTK provides various pre-made filter implementations for common filtering
  * operations. These filters often include properties that can be linked to
  * various widgets to easily allow searches.
  *
  * However, in particular for large lists or complex search methods, it is also
  * possible to subclass `GtkFilter` and provide one's own filter.
  */
class Filter(raw: Ptr[GtkFilter]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Notifies all users of the filter that it has changed.
    *
    * This emits the [signal@Gtk.Filter::changed] signal. Users of the filter
    * should then check items again via [method@Gtk.Filter.match].
    *
    * Depending on the @change parameter, not all items need to be changed, but
    * only some. Refer to the [enum@Gtk.FilterChange] documentation for details.
    *
    * This function is intended for implementors of `GtkFilter` subclasses and
    * should not be called from other functions.
    */
  def changed(
      change: GtkFilterChange /* Some(GtkFilterChange) */
  ): Unit /* None */ = gtk_filter_changed(this.raw.asInstanceOf, change)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the known strictness of @filters.
    *
    * If the strictness is not known, %GTK_FILTER_MATCH_SOME is returned.
    *
    * This value may change after emission of the [signal@Gtk.Filter::changed]
    * signal.
    *
    * This function is meant purely for optimization purposes, filters can
    * choose to omit implementing it, but `GtkFilterListModel` uses it.
    */
  def getStrictness(): GtkFilterMatch /* None */ = gtk_filter_get_strictness(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if the given @item is matched by the filter or not.
    */
  def `match`(
      item: Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */
  ): Boolean /* None */ = gtk_filter_match(
    this.raw.asInstanceOf,
    gpointer(item.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]])
  ).value.!=(0)

end Filter
