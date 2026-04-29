package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.CellRendererText
import sn.gnome.gtk4.internal.GtkCellRendererCombo

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Renders a combobox in a cell
  *
  * `GtkCellRendererCombo` renders text in a cell like `GtkCellRendererText`
  * from which it is derived. But while `GtkCellRendererText` offers a simple
  * entry to edit the text, `GtkCellRendererCombo` offers a `GtkComboBox` widget
  * to edit the text. The values to display in the combo box are taken from the
  * tree model specified in the `GtkCellRendererCombo`:model property.
  *
  * The combo cell renderer takes care of adding a text cell renderer to the
  * combo box and sets it to display the column specified by its
  * `GtkCellRendererCombo`:text-column property. Further properties of the combo
  * box can be set in a handler for the `GtkCellRenderer::editing-started`
  * signal.
  */
class CellRendererCombo(raw: Ptr[GtkCellRendererCombo])
    extends CellRendererText(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CellRendererCombo

object CellRendererCombo:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkCellRendererCombo`. Adjust how text is drawn using
    * object properties. Object properties can be set globally (with
    * g_object_set()). Also, with `GtkTreeViewColumn`, you can bind a property
    * to a value in a `GtkTreeModel`. For example, you can bind the “text”
    * property on the cell renderer to a string value in the model, thus
    * rendering a different string in each row of the `GtkTreeView`.
    */
  def apply(): CellRendererCombo = new CellRendererCombo(
    gtk_cell_renderer_combo_new().asInstanceOf
  )
end CellRendererCombo
