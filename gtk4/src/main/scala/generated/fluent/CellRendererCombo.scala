package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.CellRendererText
import sn.gnome.gtk4.internal.GtkCellRendererCombo

/** Renders a combobox in a cell
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CellRendererCombo private[gnome] (raw: Ptr[GtkCellRendererCombo])
    extends CellRendererText(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** This signal is emitted each time after the user selected an item in the
    * combo box, either by using the mouse or the arrow keys. Contrary to
    * GtkComboBox, GtkCellRendererCombo::changed is not emitted for changes made
    * to a selected item in the entry. The argument @new_iter corresponds to the
    * newly selected item in the combo box and it is relative to the
    * GtkTreeModel set via the model property on GtkCellRendererCombo.
    *
    * Note that as soon as you change the model displayed in the tree view, the
    * tree view will immediately cease the editing operating. This means that
    * you most probably want to refrain from changing the model until the combo
    * cell renderer emits the edited or editing_canceled signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal changed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TreeIter)))"
  )
  private def onChanged = ???

end CellRendererCombo

object CellRendererCombo:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkCellRendererCombo])(using Runtime) =
    summon[Runtime].getOrCreate[CellRendererCombo](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new CellRendererCombo(ptr)
    )

  /** Creates a new `GtkCellRendererCombo`. Adjust how text is drawn using
    * object properties. Object properties can be set globally (with
    * g_object_set()). Also, with `GtkTreeViewColumn`, you can bind a property
    * to a value in a `GtkTreeModel`. For example, you can bind the “text”
    * property on the cell renderer to a string value in the model, thus
    * rendering a different string in each row of the `GtkTreeView`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): CellRendererCombo =
    val raw: Ptr[Byte] = gtk_cell_renderer_combo_new().asInstanceOf
    summon[Runtime].getOrCreate[CellRendererCombo](
      raw,
      r => CellRendererCombo.applyUnsafe(r.asInstanceOf)
    )
  end apply
end CellRendererCombo
