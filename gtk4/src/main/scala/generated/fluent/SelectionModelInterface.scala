package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkSelectionModelInterface

/** The list of virtual functions for the `GtkSelectionModel` interface. No
  * function must be implemented, but unless `GtkSelectionModel::is_selected()`
  * is implemented, it will not be possible to select items in the set.
  *
  * The model does not need to implement any functions to support either
  * selecting or unselecting items. Of course, if the model does not do that, it
  * means that users cannot select or unselect items in a list widget using the
  * model.
  *
  * All selection functions fall back to `GtkSelectionModel::set_selection()` so
  * it is sufficient to implement just that function for full selection support.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SelectionModelInterface private[gnome] (
    raw: Ptr[GtkSelectionModelInterface]
):

  def getUnsafeRawPointer(): Ptr[GtkSelectionModelInterface] = this.raw

  @annotation.compileTimeOnly("[field is_selected]: Field is missing <type>")
  private def isSelected__ = ???
  @annotation.compileTimeOnly(
    "[field get_selection_in_range]: Field is missing <type>"
  )
  private def getSelectionInRange__ = ???
  @annotation.compileTimeOnly("[field select_item]: Field is missing <type>")
  private def selectItem__ = ???
  @annotation.compileTimeOnly("[field unselect_item]: Field is missing <type>")
  private def unselectItem__ = ???
  @annotation.compileTimeOnly("[field select_range]: Field is missing <type>")
  private def selectRange__ = ???
  @annotation.compileTimeOnly("[field unselect_range]: Field is missing <type>")
  private def unselectRange__ = ???
  @annotation.compileTimeOnly("[field select_all]: Field is missing <type>")
  private def selectAll__ = ???
  @annotation.compileTimeOnly("[field unselect_all]: Field is missing <type>")
  private def unselectAll__ = ???
  @annotation.compileTimeOnly("[field set_selection]: Field is missing <type>")
  private def setSelection__ = ???
end SelectionModelInterface

object SelectionModelInterface:
  def fromRaw(ptr: Ptr[GtkSelectionModelInterface]): SelectionModelInterface =
    new SelectionModelInterface(ptr)
end SelectionModelInterface
