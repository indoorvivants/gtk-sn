package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.CellRenderer
import sn.gnome.gtk4.internal.GtkCellRendererPixbuf

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Renders a pixbuf in a cell
  *
  * A `GtkCellRendererPixbuf` can be used to render an image in a cell. It
  * allows to render either a given `GdkPixbuf` (set via the
  * `GtkCellRendererPixbuf:pixbuf` property) or a named icon (set via the
  * `GtkCellRendererPixbuf:icon-name` property).
  *
  * To support the tree view, `GtkCellRendererPixbuf` also supports rendering
  * two alternative pixbufs, when the `GtkCellRenderer:is-expander` property is
  * %TRUE. If the `GtkCellRenderer:is-expanded property` is %TRUE and the
  * `GtkCellRendererPixbuf:pixbuf-expander-open` property is set to a pixbuf, it
  * renders that pixbuf, if the `GtkCellRenderer:is-expanded` property is %FALSE
  * and the `GtkCellRendererPixbuf:pixbuf-expander-closed` property is set to a
  * pixbuf, it renders that one.
  */
class CellRendererPixbuf(raw: Ptr[GtkCellRendererPixbuf])
    extends CellRenderer(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CellRendererPixbuf

object CellRendererPixbuf:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkCellRendererPixbuf`. Adjust rendering parameters using
    * object properties. Object properties can be set globally (with
    * g_object_set()). Also, with `GtkTreeViewColumn`, you can bind a property
    * to a value in a `GtkTreeModel`. For example, you can bind the “pixbuf”
    * property on the cell renderer to a pixbuf value in the model, thus
    * rendering a different image in each row of the `GtkTreeView`.
    */
  def apply(): CellRendererPixbuf = new CellRendererPixbuf(
    gtk_cell_renderer_pixbuf_new().asInstanceOf
  )
end CellRendererPixbuf
