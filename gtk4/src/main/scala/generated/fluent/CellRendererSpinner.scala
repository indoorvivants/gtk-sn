package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.CellRenderer
import sn.gnome.gtk4.internal.GtkCellRendererSpinner

/** Renders a spinning animation in a cell
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CellRendererSpinner(raw: Ptr[GtkCellRendererSpinner])
    extends CellRenderer(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CellRendererSpinner

object CellRendererSpinner:
  /** Returns a new cell renderer which will show a spinner to indicate
    * activity.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): CellRendererSpinner =
    val raw: Ptr[Byte] = gtk_cell_renderer_spinner_new().asInstanceOf
    summon[Runtime].getOrCreate[CellRendererSpinner](
      raw,
      r => new CellRendererSpinner(r.asInstanceOf)
    )
  end apply
end CellRendererSpinner
