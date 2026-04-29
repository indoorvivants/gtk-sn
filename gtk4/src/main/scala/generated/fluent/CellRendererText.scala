package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.CellRenderer
import sn.gnome.gtk4.internal.GtkCellRendererText

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Renders text in a cell
  *
  * A `GtkCellRendererText` renders a given text in its cell, using the font,
  * color and style information provided by its properties. The text will be
  * ellipsized if it is too long and the `GtkCellRendererText:ellipsize`
  * property allows it.
  *
  * If the `GtkCellRenderer:mode` is %GTK_CELL_RENDERER_MODE_EDITABLE, the
  * `GtkCellRendererText` allows to edit its text using an entry.
  */
class CellRendererText(raw: Ptr[GtkCellRendererText])
    extends CellRenderer(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the height of a renderer to explicitly be determined by the “font”
    * and “y_pad” property set on it. Further changes in these properties do not
    * affect the height, so they must be accompanied by a subsequent call to
    * this function. Using this function is inflexible, and should really only
    * be used if calculating the size of a cell is too slow (ie, a massive
    * number of cells displayed). If @number_of_rows is -1, then the fixed
    * height is unset, and the height is determined by the properties again.
    */
  def setFixedHeightFromFont(number_of_rows: Int): Unit =
    gtk_cell_renderer_text_set_fixed_height_from_font(
      this.raw.asInstanceOf,
      number_of_rows
    )

end CellRendererText

object CellRendererText:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkCellRendererText`. Adjust how text is drawn using object
    * properties. Object properties can be set globally (with g_object_set()).
    * Also, with `GtkTreeViewColumn`, you can bind a property to a value in a
    * `GtkTreeModel`. For example, you can bind the “text” property on the cell
    * renderer to a string value in the model, thus rendering a different string
    * in each row of the `GtkTreeView`.
    */
  def apply(): CellRendererText = new CellRendererText(
    gtk_cell_renderer_text_new().asInstanceOf
  )
end CellRendererText
