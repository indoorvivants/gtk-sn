package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}

trait PrintOperationPreview:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Ends a preview.
    *
    * This function must be called to finish a custom print preview.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def endPreview(): Unit /* None */ =
    gtk_print_operation_preview_end_preview(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperationPreview]]
    )
  end endPreview

  /** Returns whether the given page is included in the set of pages that have
    * been selected for printing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isSelected(page_nr: Int /* Some(CInt) */ ): Boolean /* None */ =
    gtk_print_operation_preview_is_selected(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperationPreview]],
      page_nr
    ).value.!=(0)
  end isSelected

  /** Renders a page to the preview.
    *
    * This is using the print context that was passed to the
    * [signal@Gtk.PrintOperation::preview] handler together with @preview.
    *
    * A custom print preview should use this function to render the currently
    * selected page.
    *
    * Note that this function requires a suitable cairo context to be associated
    * with the print context.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def renderPage(page_nr: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_print_operation_preview_render_page(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperationPreview]],
      page_nr
    )
  end renderPage

end PrintOperationPreview

object PrintOperationPreview:
  class Abstract(raw: Ptr[Byte]) extends PrintOperationPreview:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end PrintOperationPreview
