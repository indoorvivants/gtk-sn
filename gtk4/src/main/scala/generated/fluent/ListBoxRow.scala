package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Actionable
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkListBoxRow

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkListBoxRow` is the kind of widget that can be added to a `GtkListBox`.
  */
class ListBoxRow(raw: Ptr[GtkListBoxRow])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Actionable,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Marks @row as changed, causing any state that depends on this to be
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
    */
  def changed(): Unit /* None */ = gtk_list_box_row_changed(
    this.raw.asInstanceOf[Ptr[GtkListBoxRow]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the row is activatable.
    */
  def getActivatable(): Boolean /* None */ = gtk_list_box_row_get_activatable(
    this.raw.asInstanceOf[Ptr[GtkListBoxRow]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child widget of @row.
    */
  def getChild(): Widget /* None */ = new Widget(
    gtk_list_box_row_get_child(
      this.raw.asInstanceOf[Ptr[GtkListBoxRow]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the current header of the @row.
    *
    * This can be used in a [callback@Gtk.ListBoxUpdateHeaderFunc] to see if
    * there is a header set already, and if so to update the state of it.
    */
  def getHeader(): Widget /* None */ = new Widget(
    gtk_list_box_row_get_header(
      this.raw.asInstanceOf[Ptr[GtkListBoxRow]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the current index of the @row in its `GtkListBox` container.
    */
  def getIndex(): Int /* None */ = gtk_list_box_row_get_index(
    this.raw.asInstanceOf[Ptr[GtkListBoxRow]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the row can be selected.
    */
  def getSelectable(): Boolean /* None */ = gtk_list_box_row_get_selectable(
    this.raw.asInstanceOf[Ptr[GtkListBoxRow]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the child is currently selected in its `GtkListBox`
    * container.
    */
  def isSelected(): Boolean /* None */ = gtk_list_box_row_is_selected(
    this.raw.asInstanceOf[Ptr[GtkListBoxRow]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Set whether the row is activatable.
    */
  def setActivatable(
      activatable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_list_box_row_set_activatable(
    this.raw.asInstanceOf[Ptr[GtkListBoxRow]],
    gboolean(gint((if activatable == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the child widget of @self.
    */
  def setChild(
      child: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_list_box_row_set_child(
    this.raw.asInstanceOf[Ptr[GtkListBoxRow]],
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the current header of the @row.
    *
    * This is only allowed to be called from a
    * [callback@Gtk.ListBoxUpdateHeaderFunc]. It will replace any existing
    * header in the row, and be shown in front of the row in the listbox.
    */
  def setHeader(
      header: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_list_box_row_set_header(
    this.raw.asInstanceOf[Ptr[GtkListBoxRow]],
    header
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Set whether the row can be selected.
    */
  def setSelectable(
      selectable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_list_box_row_set_selectable(
    this.raw.asInstanceOf[Ptr[GtkListBoxRow]],
    gboolean(gint((if selectable == true then 1 else 0)))
  )

end ListBoxRow

object ListBoxRow:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkListBoxRow`.
    */
  def apply(): ListBoxRow = new ListBoxRow(gtk_list_box_row_new().asInstanceOf)
end ListBoxRow
