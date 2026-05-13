package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.CellRenderer
import sn.gnome.gtk4.internal.GtkCellRendererPixbuf

/** Renders a pixbuf in a cell
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CellRendererPixbuf private[gnome] (raw: Ptr[GtkCellRendererPixbuf])
    extends CellRenderer(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end CellRendererPixbuf

object CellRendererPixbuf:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkCellRendererPixbuf])(using Runtime) =
    summon[Runtime].getOrCreate[CellRendererPixbuf](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new CellRendererPixbuf(ptr)
    )

  /** Creates a new `GtkCellRendererPixbuf`. Adjust rendering parameters using
    * object properties. Object properties can be set globally (with
    * g_object_set()). Also, with `GtkTreeViewColumn`, you can bind a property
    * to a value in a `GtkTreeModel`. For example, you can bind the “pixbuf”
    * property on the cell renderer to a pixbuf value in the model, thus
    * rendering a different image in each row of the `GtkTreeView`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): CellRendererPixbuf =
    val raw: Ptr[Byte] = gtk_cell_renderer_pixbuf_new().asInstanceOf
    summon[Runtime].getOrCreate[CellRendererPixbuf](
      raw,
      r => CellRendererPixbuf.applyUnsafe(r.asInstanceOf)
    )
  end apply
end CellRendererPixbuf
