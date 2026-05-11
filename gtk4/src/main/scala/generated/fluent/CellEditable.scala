package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Event
import sn.gnome.gobject.runtime.*

trait CellEditable:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Emits the `GtkCellEditable::editing-done` signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def editingDone(): Unit /* None */ =
    gtk_cell_editable_editing_done(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCellEditable]]
    )
  end editingDone

  /** Emits the `GtkCellEditable::remove-widget` signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeWidget(): Unit /* None */ =
    gtk_cell_editable_remove_widget(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCellEditable]]
    )
  end removeWidget

  /** Begins editing on a @cell_editable.
    *
    * The `GtkCellRenderer` for the cell creates and returns a `GtkCellEditable`
    * from gtk_cell_renderer_start_editing(), configured for the
    * `GtkCellRenderer` type.
    *
    * gtk_cell_editable_start_editing() can then set up @cell_editable suitably
    * for editing a cell, e.g. making the Esc key emit
    * `GtkCellEditable::editing-done`.
    *
    * Note that the @cell_editable is created on-demand for the current edit;
    * its lifetime is temporary and does not persist across other edits and/or
    * cells.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def startEditing(
      event: Option[
        sn.gnome.gdk4.fluent.Event /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_cell_editable_start_editing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkCellEditable]],
      event
        .map[Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent]]
        )
    )
  end startEditing

end CellEditable

object CellEditable:
  class Abstract(raw: Ptr[Byte]) extends CellEditable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end CellEditable
