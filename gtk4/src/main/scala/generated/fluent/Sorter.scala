package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gchar, gpointer}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{Ordering, SorterChange, SorterOrder}
import sn.gnome.gtk4.internal.{GtkSorter, GtkSorterChange}

/** `GtkSorter` is an object to describe sorting criteria.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Sorter(raw: Ptr[GtkSorter]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Notifies all users of the sorter that it has changed.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def changed(
      change: SorterChange /* Some(GtkSorterChange) */
  ): Unit /* None */ =
    gtk_sorter_changed(this.raw.asInstanceOf[Ptr[GtkSorter]], change.raw)

  /** Compares two given items according to the sort order implemented by the
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def compare(
      item1: Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      item2: Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */
  ): Ordering /* None */ = Ordering.fromRaw(
    gtk_sorter_compare(
      this.raw.asInstanceOf[Ptr[GtkSorter]],
      item1.getUnsafeRawPointer().asInstanceOf,
      item2.getUnsafeRawPointer().asInstanceOf
    )
  )

  /** Gets the order that @self conforms to.
    *
    * See [enum@Gtk.SorterOrder] for details of the possible return values.
    *
    * This function is intended to allow optimizations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getOrder(): SorterOrder /* None */ = SorterOrder.fromRaw(
    gtk_sorter_get_order(this.raw.asInstanceOf[Ptr[GtkSorter]])
  )

  /** Emitted whenever the sorter changed.
    *
    * Users of the sorter should then update the sort order again via
    * gtk_sorter_compare().
    *
    * [class@Gtk.SortListModel] handles this signal automatically.
    *
    * Depending on the @change parameter, it may be possible to update the sort
    * order without a full resorting. Refer to the [enum@Gtk.SorterChange]
    * documentation for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onChanged(handler: ((change: SorterChange)) => Unit)(using Runtime) =
    type SignalRegType =
      SignalRegistration[this.type, (change: SorterChange), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkSorter],
          change: GtkSorterChange /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((change = SorterChange.fromRaw(change)))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"changed"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onChanged
end Sorter
