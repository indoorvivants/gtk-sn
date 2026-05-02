package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.CellRendererText
import sn.gnome.gtk4.internal.GtkCellRendererAccel

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Renders a keyboard accelerator in a cell
  *
  * `GtkCellRendererAccel` displays a keyboard accelerator (i.e. a key
  * combination like `Control + a`). If the cell renderer is editable, the
  * accelerator can be changed by simply typing the new combination.
  */
class CellRendererAccel(raw: Ptr[GtkCellRendererAccel])
    extends CellRendererText(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CellRendererAccel

object CellRendererAccel:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkCellRendererAccel`.
    */
  def apply(): CellRendererAccel = new CellRendererAccel(
    gtk_cell_renderer_accel_new().asInstanceOf
  )
end CellRendererAccel
