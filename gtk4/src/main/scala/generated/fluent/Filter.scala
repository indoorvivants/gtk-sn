package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{FilterChange, FilterMatch}
import sn.gnome.gtk4.internal.{GtkFilter, GtkFilterChange}
import sn.gnome.runtime.*

/** A `GtkFilter` object describes the filtering to be performed by a
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Filter private[gnome] (raw: Ptr[GtkFilter])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Notifies all users of the filter that it has changed.
    *
    * This emits the [signal@Gtk.Filter::changed] signal. Users of the filter
    * should then check items again via [method@Gtk.Filter.match].
    *
    * Depending on the @change parameter, not all items need to be changed, but
    * only some. Refer to the [enum@Gtk.FilterChange] documentation for details.
    *
    * This function is intended for implementors of `GtkFilter` subclasses and
    * should not be called from other functions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def changed(
      change: FilterChange /* Some(GtkFilterChange) */
  ): Unit /* None */ =
    gtk_filter_changed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFilter]],
      change.raw
    )
  end changed

  /** Gets the known strictness of @filters.
    *
    * If the strictness is not known, %GTK_FILTER_MATCH_SOME is returned.
    *
    * This value may change after emission of the [signal@Gtk.Filter::changed]
    * signal.
    *
    * This function is meant purely for optimization purposes, filters can
    * choose to omit implementing it, but `GtkFilterListModel` uses it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStrictness(): FilterMatch /* None */ =
    FilterMatch.fromRaw(
      gtk_filter_get_strictness(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFilter]]
      )
    )
  end getStrictness

  /** Checks if the given @item is matched by the filter or not.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def `match`(
      item: sn.gnome.gobject.Object /* Some(_root_.sn.gnome.glib.internal.gpointer) */
  )(using Runtime): Boolean /* None */ =
    gtk_filter_match(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFilter]],
      item.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end `match`

  /** Emitted whenever the filter changed.
    *
    * Users of the filter should then check items again via
    * [method@Gtk.Filter.match].
    *
    * `GtkFilterListModel` handles this signal automatically.
    *
    * Depending on the @change parameter, not all items need to be checked, but
    * only some. Refer to the [enum@Gtk.FilterChange] documentation for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onChanged(handler: ((change: FilterChange)) => Unit)(using Runtime) =
    type SignalRegType =
      SignalRegistration[this.type, (change: FilterChange), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkFilter],
          change: GtkFilterChange /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((change = FilterChange.fromRaw(change)))
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
end Filter

object Filter:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkFilter])(using Runtime) = summon[Runtime]
    .getOrCreate[Filter](ptr.asInstanceOf[Ptr[Byte]], p => new Filter(ptr))

end Filter
