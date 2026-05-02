package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.CellRendererText
import sn.gnome.gtk4.internal.GtkCellRendererSpin

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Renders a spin button in a cell
  *
  * `GtkCellRendererSpin` renders text in a cell like `GtkCellRendererText` from
  * which it is derived. But while `GtkCellRendererText` offers a simple entry
  * to edit the text, `GtkCellRendererSpin` offers a `GtkSpinButton` widget. Of
  * course, that means that the text has to be parseable as a floating point
  * number.
  *
  * The range of the spinbutton is taken from the adjustment property of the
  * cell renderer, which can be set explicitly or mapped to a column in the tree
  * model, like all properties of cell renders. `GtkCellRendererSpin` also has
  * properties for the `GtkCellRendererSpin:climb-rate` and the number of
  * `GtkCellRendererSpin:digits` to display. Other `GtkSpinButton` properties
  * can be set in a handler for the `GtkCellRenderer::editing-started` signal.
  */
class CellRendererSpin(raw: Ptr[GtkCellRendererSpin])
    extends CellRendererText(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CellRendererSpin

object CellRendererSpin:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkCellRendererSpin`.
    */
  def apply(): CellRendererSpin = new CellRendererSpin(
    gtk_cell_renderer_spin_new().asInstanceOf
  )
end CellRendererSpin
