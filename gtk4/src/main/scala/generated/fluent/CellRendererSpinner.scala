package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.CellRenderer
import sn.gnome.gtk4.internal.GtkCellRendererSpinner

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Renders a spinning animation in a cell
  *
  * `GtkCellRendererSpinner` renders a spinning animation in a cell, very
  * similar to `GtkSpinner`. It can often be used as an alternative to a
  * `GtkCellRendererProgress` for displaying indefinite activity, instead of
  * actual progress.
  *
  * To start the animation in a cell, set the `GtkCellRendererSpinner:active`
  * property to %TRUE and increment the `GtkCellRendererSpinner:pulse` property
  * at regular intervals. The usual way to set the cell renderer properties for
  * each cell is to bind them to columns in your tree model using e.g.
  * gtk_tree_view_column_add_attribute().
  */
class CellRendererSpinner(raw: Ptr[GtkCellRendererSpinner])
    extends CellRenderer(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CellRendererSpinner

object CellRendererSpinner:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns a new cell renderer which will show a spinner to indicate
    * activity.
    */
  def apply(): CellRendererSpinner = new CellRendererSpinner(
    gtk_cell_renderer_spinner_new().asInstanceOf
  )
end CellRendererSpinner
