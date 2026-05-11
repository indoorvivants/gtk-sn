package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkNotebookPage

/** `GtkNotebookPage` is an auxiliary object used by `GtkNotebook`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class NotebookPage private[gnome] (raw: Ptr[GtkNotebookPage])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the notebook child to which @page belongs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild()(using Runtime): sn.gnome.gtk4.fluent.Widget /* None */ =
    sn.gnome.gtk4.fluent.Widget.applyUnsafe(
      gtk_notebook_page_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNotebookPage]]
      ).asInstanceOf
    )
  end getChild

end NotebookPage

object NotebookPage:
  def applyUnsafe(ptr: Ptr[GtkNotebookPage])(using Runtime) =
    summon[Runtime].getOrCreate[NotebookPage](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new NotebookPage(ptr)
    )

end NotebookPage
