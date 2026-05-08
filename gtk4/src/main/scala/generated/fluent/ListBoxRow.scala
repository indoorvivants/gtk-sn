package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  Actionable,
  Buildable,
  ConstraintTarget,
  Widget
}
import sn.gnome.gtk4.internal.GtkListBoxRow
import sn.gnome.runtime.*

/** `GtkListBoxRow` is the kind of widget that can be added to a `GtkListBox`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ListBoxRow(raw: Ptr[GtkListBoxRow])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Actionable,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Marks @row as changed, causing any state that depends on this to be
    * updated.
    *
    * This affects sorting, filtering and headers.
    *
    * Note that calls to this method must be in sync with the data used for the
    * row functions. For instance, if the list is mirroring some external data
    * set, and *two* rows changed in the external data set then when you call
    * gtk_list_box_row_changed() on the first row the sort function must only
    * read the new data for the first of the two changed rows, otherwise the
    * resorting of the rows will be wrong.
    *
    * This generally means that if you don’t fully control the data model you
    * have to duplicate the data that affects the listbox row functions into the
    * row widgets themselves. Another alternative is to call
    * [method@Gtk.ListBox.invalidate_sort] on any model change, but that is more
    * expensive.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def changed(): Unit /* None */ = gtk_list_box_row_changed(
    this.raw.asInstanceOf[Ptr[GtkListBoxRow]]
  )

  /** Gets whether the row is activatable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActivatable(): Boolean /* None */ = gtk_list_box_row_get_activatable(
    this.raw.asInstanceOf[Ptr[GtkListBoxRow]]
  ).value.!=(0)

  /** Gets the child widget of @row.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild(): Widget /* None */ = new Widget(
    gtk_list_box_row_get_child(
      this.raw.asInstanceOf[Ptr[GtkListBoxRow]]
    ).asInstanceOf
  )

  /** Returns the current header of the @row.
    *
    * This can be used in a [callback@Gtk.ListBoxUpdateHeaderFunc] to see if
    * there is a header set already, and if so to update the state of it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHeader(): Widget /* None */ = new Widget(
    gtk_list_box_row_get_header(
      this.raw.asInstanceOf[Ptr[GtkListBoxRow]]
    ).asInstanceOf
  )

  /** Gets the current index of the @row in its `GtkListBox` container.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIndex(): Int /* None */ = gtk_list_box_row_get_index(
    this.raw.asInstanceOf[Ptr[GtkListBoxRow]]
  )

  /** Gets whether the row can be selected.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSelectable(): Boolean /* None */ = gtk_list_box_row_get_selectable(
    this.raw.asInstanceOf[Ptr[GtkListBoxRow]]
  ).value.!=(0)

  /** Returns whether the child is currently selected in its `GtkListBox`
    * container.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isSelected(): Boolean /* None */ = gtk_list_box_row_is_selected(
    this.raw.asInstanceOf[Ptr[GtkListBoxRow]]
  ).value.!=(0)

  /** Set whether the row is activatable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setActivatable(
      activatable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_list_box_row_set_activatable(
    this.raw.asInstanceOf[Ptr[GtkListBoxRow]],
    gboolean(gint((if activatable == true then 1 else 0)))
  )

  /** Sets the child widget of @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setChild(
      child: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_list_box_row_set_child(
    this.raw.asInstanceOf[Ptr[GtkListBoxRow]],
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** Sets the current header of the @row.
    *
    * This is only allowed to be called from a
    * [callback@Gtk.ListBoxUpdateHeaderFunc]. It will replace any existing
    * header in the row, and be shown in front of the row in the listbox.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHeader(
      header: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_list_box_row_set_header(
    this.raw.asInstanceOf[Ptr[GtkListBoxRow]],
    header
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** Set whether the row can be selected.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSelectable(
      selectable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_list_box_row_set_selectable(
    this.raw.asInstanceOf[Ptr[GtkListBoxRow]],
    gboolean(gint((if selectable == true then 1 else 0)))
  )

  /** This is a keybinding signal, which will cause this row to be activated.
    *
    * If you want to be notified when the user activates a row (by key or not),
    * use the [signal@Gtk.ListBox::row-activated] signal on the row’s parent
    * `GtkListBox`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onActivate(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkListBoxRow],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"activate"
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
  end onActivate
end ListBoxRow

object ListBoxRow:
  /** Creates a new `GtkListBoxRow`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): ListBoxRow =
    val raw: Ptr[Byte] = gtk_list_box_row_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[ListBoxRow](raw, r => new ListBoxRow(r.asInstanceOf))
  end apply
end ListBoxRow
