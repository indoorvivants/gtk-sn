package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.CellRendererText
import sn.gnome.gtk4.internal.GtkCellRendererSpin

/** Renders a spin button in a cell
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CellRendererSpin private[gnome] (raw: Ptr[GtkCellRendererSpin])
    extends CellRendererText(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CellRendererSpin

object CellRendererSpin:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkCellRendererSpin])(using Runtime) =
    summon[Runtime].getOrCreate[CellRendererSpin](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new CellRendererSpin(ptr)
    )

  /** Creates a new `GtkCellRendererSpin`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): CellRendererSpin =
    val raw: Ptr[Byte] = gtk_cell_renderer_spin_new().asInstanceOf
    summon[Runtime].getOrCreate[CellRendererSpin](
      raw,
      r => CellRendererSpin.applyUnsafe(r.asInstanceOf)
    )
  end apply
end CellRendererSpin
