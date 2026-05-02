package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkNotebookPage

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkNotebookPage` is an auxiliary object used by `GtkNotebook`.
  */
class NotebookPage(raw: Ptr[GtkNotebookPage]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the notebook child to which @page belongs.
    */
  def getChild(): Widget /* None */ = new Widget(
    gtk_notebook_page_get_child(this.raw.asInstanceOf).asInstanceOf
  )

end NotebookPage
