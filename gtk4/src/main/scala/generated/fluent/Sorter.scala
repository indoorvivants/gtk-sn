package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.internal.GtkOrdering
import sn.gnome.gtk4.internal.GtkSorter
import sn.gnome.gtk4.internal.GtkSorterChange
import sn.gnome.gtk4.internal.GtkSorterOrder

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkSorter` is an object to describe sorting criteria.
  *
  * Its primary user is [class@Gtk.SortListModel]
  *
  * The model will use a sorter to determine the order in which its items should
  * appear by calling [method@Gtk.Sorter.compare] for pairs of items.
  *
  * Sorters may change their sorting behavior through their lifetime. In that
  * case, they will emit the [signal@Gtk.Sorter::changed] signal to notify that
  * the sort order is no longer valid and should be updated by calling
  * gtk_sorter_compare() again.
  *
  * GTK provides various pre-made sorter implementations for common sorting
  * operations. [class@Gtk.ColumnView] has built-in support for sorting lists
  * via the [property@Gtk.ColumnViewColumn:sorter] property, where the user can
  * change the sorting by clicking on list headers.
  *
  * Of course, in particular for large lists, it is also possible to subclass
  * `GtkSorter` and provide one's own sorter.
  */
class Sorter(raw: Ptr[GtkSorter]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Notifies all users of the sorter that it has changed.
    *
    * This emits the [signal@Gtk.Sorter::changed] signal. Users of the sorter
    * should then update the sort order via [method@Gtk.Sorter.compare].
    *
    * Depending on the @change parameter, it may be possible to update the sort
    * order without a full resorting. Refer to the [enum@Gtk.SorterChange]
    * documentation for details.
    *
    * This function is intended for implementors of `GtkSorter` subclasses and
    * should not be called from other functions.
    */
  def changed(change: GtkSorterChange): Unit =
    gtk_sorter_changed(this.raw.asInstanceOf, change)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Compares two given items according to the sort order implemented by the
    * sorter.
    *
    * Sorters implement a partial order:
    *
    * * It is reflexive, ie a = a * It is antisymmetric, ie if a < b and b < a,
    * then a = b * It is transitive, ie given any 3 items with a ≤ b and b ≤ c,
    * then a ≤ c
    *
    * The sorter may signal it conforms to additional constraints via the return
    * value of [method@Gtk.Sorter.get_order].
    */
  def compare(item1: Object, item2: Object): GtkOrdering = gtk_sorter_compare(
    this.raw.asInstanceOf,
    gpointer(item1.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]),
    gpointer(item2.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the order that @self conforms to.
    *
    * See [enum@Gtk.SorterOrder] for details of the possible return values.
    *
    * This function is intended to allow optimizations.
    */
  def getOrder(): GtkSorterOrder = gtk_sorter_get_order(this.raw.asInstanceOf)

end Sorter
