package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.PageSetup
import sn.gnome.gtk4.fluent.PrintOperationPreview
import sn.gnome.gtk4.fluent.PrintSettings
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkPrintOperation
import sn.gnome.gtk4.internal.GtkPrintOperationAction
import sn.gnome.gtk4.internal.GtkPrintOperationResult
import sn.gnome.gtk4.internal.GtkPrintStatus
import sn.gnome.gtk4.internal.GtkUnit

class PrintOperation(raw: Ptr[GtkPrintOperation])
    extends Object(raw.asInstanceOf),
      PrintOperationPreview:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def cancel(): Unit = gtk_print_operation_cancel(this.raw.asInstanceOf)

  def drawPageFinish(): Unit = gtk_print_operation_draw_page_finish(
    this.raw.asInstanceOf
  )

  def getDefaultPageSetup(): PageSetup = new PageSetup(
    gtk_print_operation_get_default_page_setup(
      this.raw.asInstanceOf
    ).asInstanceOf
  )

  def getEmbedPageSetup(): Boolean =
    gtk_print_operation_get_embed_page_setup(this.raw.asInstanceOf).value.!=(0)

  def getError(): GResult[Unit] = GResult.wrap(__errorPtr =>
    gtk_print_operation_get_error(this.raw.asInstanceOf, __errorPtr)
  )

  def getHasSelection(): Boolean =
    gtk_print_operation_get_has_selection(this.raw.asInstanceOf).value.!=(0)

  def getNPagesToPrint(): Int = gtk_print_operation_get_n_pages_to_print(
    this.raw.asInstanceOf
  )

  def getPrintSettings(): PrintSettings = new PrintSettings(
    gtk_print_operation_get_print_settings(this.raw.asInstanceOf).asInstanceOf
  )

  def getStatus(): GtkPrintStatus = gtk_print_operation_get_status(
    this.raw.asInstanceOf
  )

  def getStatusString()(using Zone): String = fromCString(
    gtk_print_operation_get_status_string(this.raw.asInstanceOf).asInstanceOf
  )

  def getSupportSelection(): Boolean =
    gtk_print_operation_get_support_selection(this.raw.asInstanceOf).value.!=(0)

  def isFinished(): Boolean =
    gtk_print_operation_is_finished(this.raw.asInstanceOf).value.!=(0)

  def run(
      action: GtkPrintOperationAction,
      parent: Window
  ): GResult[GtkPrintOperationResult] = GResult.wrap(__errorPtr =>
    gtk_print_operation_run(
      this.raw.asInstanceOf,
      action,
      parent.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  def setAllowAsync(allow_async: Boolean): Unit =
    gtk_print_operation_set_allow_async(
      this.raw.asInstanceOf,
      gboolean(gint((if allow_async == true then 1 else 0)))
    )

  def setCurrentPage(current_page: Int): Unit =
    gtk_print_operation_set_current_page(this.raw.asInstanceOf, current_page)

  def setCustomTabLabel(label: String | CString)(using Zone): Unit =
    gtk_print_operation_set_custom_tab_label(
      this.raw.asInstanceOf,
      __sn_extract_string(label)
    )

  def setDefaultPageSetup(default_page_setup: PageSetup): Unit =
    gtk_print_operation_set_default_page_setup(
      this.raw.asInstanceOf,
      default_page_setup.getUnsafeRawPointer().asInstanceOf
    )

  def setDeferDrawing(): Unit = gtk_print_operation_set_defer_drawing(
    this.raw.asInstanceOf
  )

  def setEmbedPageSetup(embed: Boolean): Unit =
    gtk_print_operation_set_embed_page_setup(
      this.raw.asInstanceOf,
      gboolean(gint((if embed == true then 1 else 0)))
    )

  def setExportFilename(filename: String | CString)(using Zone): Unit =
    gtk_print_operation_set_export_filename(
      this.raw.asInstanceOf,
      __sn_extract_string(filename)
    )

  def setHasSelection(has_selection: Boolean): Unit =
    gtk_print_operation_set_has_selection(
      this.raw.asInstanceOf,
      gboolean(gint((if has_selection == true then 1 else 0)))
    )

  def setJobName(job_name: String | CString)(using Zone): Unit =
    gtk_print_operation_set_job_name(
      this.raw.asInstanceOf,
      __sn_extract_string(job_name)
    )

  def setNPages(n_pages: Int): Unit =
    gtk_print_operation_set_n_pages(this.raw.asInstanceOf, n_pages)

  def setPrintSettings(print_settings: PrintSettings): Unit =
    gtk_print_operation_set_print_settings(
      this.raw.asInstanceOf,
      print_settings.getUnsafeRawPointer().asInstanceOf
    )

  def setShowProgress(show_progress: Boolean): Unit =
    gtk_print_operation_set_show_progress(
      this.raw.asInstanceOf,
      gboolean(gint((if show_progress == true then 1 else 0)))
    )

  def setSupportSelection(support_selection: Boolean): Unit =
    gtk_print_operation_set_support_selection(
      this.raw.asInstanceOf,
      gboolean(gint((if support_selection == true then 1 else 0)))
    )

  def setTrackPrintStatus(track_status: Boolean): Unit =
    gtk_print_operation_set_track_print_status(
      this.raw.asInstanceOf,
      gboolean(gint((if track_status == true then 1 else 0)))
    )

  def setUnit(unit: GtkUnit): Unit =
    gtk_print_operation_set_unit(this.raw.asInstanceOf, unit)

  def setUseFullPage(full_page: Boolean): Unit =
    gtk_print_operation_set_use_full_page(
      this.raw.asInstanceOf,
      gboolean(gint((if full_page == true then 1 else 0)))
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end PrintOperation

object PrintOperation:
  def apply(): PrintOperation = new PrintOperation(
    gtk_print_operation_new().asInstanceOf
  )
end PrintOperation
