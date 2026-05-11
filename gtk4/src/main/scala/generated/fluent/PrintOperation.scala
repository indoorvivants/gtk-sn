package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  GObject,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  GTKUnit,
  PageSetup,
  PrintContext,
  PrintOperationAction,
  PrintOperationPreview,
  PrintOperationResult,
  PrintSettings,
  PrintStatus,
  Widget,
  Window
}
import sn.gnome.gtk4.internal.{
  GtkPageSetup,
  GtkPrintContext,
  GtkPrintOperation,
  GtkPrintOperationResult,
  GtkPrintSettings,
  GtkWidget
}
import sn.gnome.runtime.*

/** `GtkPrintOperation` is the high-level, portable printing API.
  *
  * It looks a bit different than other GTK dialogs such as the
  * `GtkFileChooser`, since some platforms don’t expose enough infrastructure to
  * implement a good print dialog. On such platforms, `GtkPrintOperation` uses
  * the native print dialog. On platforms which do not provide a native print
  * dialog, GTK uses its own, see [class@Gtk.PrintUnixDialog].
  *
  * The typical way to use the high-level printing API is to create a
  * `GtkPrintOperation` object with [ctor@Gtk.PrintOperation.new] when the user
  * selects to print. Then you set some properties on it, e.g. the page size,
  * any [class@Gtk.PrintSettings] from previous print operations, the number of
  * pages, the current page, etc.
  *
  * Then you start the print operation by calling
  * [method@Gtk.PrintOperation.run]. It will then show a dialog, let the user
  * select a printer and options. When the user finished the dialog, various
  * signals will be emitted on the `GtkPrintOperation`, the main one being
  * [signal@Gtk.PrintOperation::draw-page], which you are supposed to handle and
  * render the page on the provided [class@Gtk.PrintContext] using Cairo.
  *
  * # The high-level printing API
  *
  * ```c
  * static GtkPrintSettings *settings = NULL;
  *
  * static void
  * do_print (void)
  * {
  *   GtkPrintOperation *print;
  *   GtkPrintOperationResult res;
  *
  *   print = gtk_print_operation_new ();
  *
  *   if (settings != NULL)
  *     gtk_print_operation_set_print_settings (print, settings);
  *
  *   g_signal_connect (print, "begin_print", G_CALLBACK (begin_print), NULL);
  *   g_signal_connect (print, "draw_page", G_CALLBACK (draw_page), NULL);
  *
  *   res = gtk_print_operation_run (print, GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG,
  *                                  GTK_WINDOW (main_window), NULL);
  *
  *   if (res == GTK_PRINT_OPERATION_RESULT_APPLY)
  *     {
  *       if (settings != NULL)
  *         g_object_unref (settings);
  *       settings = g_object_ref (gtk_print_operation_get_print_settings (print));
  *     }
  *
  *   g_object_unref (print);
  * }
  * ```
  *
  * By default `GtkPrintOperation` uses an external application to do print
  * preview. To implement a custom print preview, an application must connect to
  * the preview signal. The functions
  * [method@Gtk.PrintOperationPreview.render_page],
  * [method@Gtk.PrintOperationPreview.end_preview] and
  * [method@Gtk.PrintOperationPreview.is_selected] are useful when implementing
  * a print preview.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PrintOperation private[gnome] (raw: Ptr[GtkPrintOperation])
    extends Object(raw.asInstanceOf),
      PrintOperationPreview:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Cancels a running print operation.
    *
    * This function may be called from a
    * [signal@Gtk.PrintOperation::begin-print],
    * [signal@Gtk.PrintOperation::paginate] or
    * [signal@Gtk.PrintOperation::draw-page] signal handler to stop the
    * currently running print operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def cancel(): Unit /* None */ =
    gtk_print_operation_cancel(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]]
    )
  end cancel

  /** Signal that drawing of particular page is complete.
    *
    * It is called after completion of page drawing (e.g. drawing in another
    * thread). If [method@Gtk.PrintOperation.set_defer_drawing] was called
    * before, then this function has to be called by application. Otherwise it
    * is called by GTK itself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def drawPageFinish(): Unit /* None */ =
    gtk_print_operation_draw_page_finish(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]]
    )
  end drawPageFinish

  /** Returns the default page setup.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDefaultPageSetup()(using
      Runtime
  ): sn.gnome.gtk4.fluent.PageSetup /* None */ =
    sn.gnome.gtk4.fluent.PageSetup.applyUnsafe(
      gtk_print_operation_get_default_page_setup(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]]
      ).asInstanceOf
    )
  end getDefaultPageSetup

  /** Gets whether page setup selection combos are embedded
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEmbedPageSetup(): Boolean /* None */ =
    gtk_print_operation_get_embed_page_setup(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]]
    ).value.!=(0)
  end getEmbedPageSetup

  /** Call this when the result of a print operation is
    * %GTK_PRINT_OPERATION_RESULT_ERROR.
    *
    * It can be called either after [method@Gtk.PrintOperation.run] returns, or
    * in the [signal@Gtk.PrintOperation::done] signal handler.
    *
    * The returned `GError` will contain more details on what went wrong.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getError(): GResult[Unit /* None */ ] =
    GResult.wrap(__errorPtr =>
      gtk_print_operation_get_error(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]],
        __errorPtr
      )
    )
  end getError

  /** Gets whether there is a selection.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHasSelection(): Boolean /* None */ =
    gtk_print_operation_get_has_selection(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]]
    ).value.!=(0)
  end getHasSelection

  /** Returns the number of pages that will be printed.
    *
    * Note that this value is set during print preparation phase
    * (%GTK_PRINT_STATUS_PREPARING), so this function should never be called
    * before the data generation phase (%GTK_PRINT_STATUS_GENERATING_DATA). You
    * can connect to the [signal@Gtk.PrintOperation::status-changed] signal and
    * call gtk_print_operation_get_n_pages_to_print() when print status is
    * %GTK_PRINT_STATUS_GENERATING_DATA.
    *
    * This is typically used to track the progress of print operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNPagesToPrint(): Int /* None */ =
    gtk_print_operation_get_n_pages_to_print(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]]
    )
  end getNPagesToPrint

  /** Returns the current print settings.
    *
    * Note that the return value is %NULL until either
    * [method@Gtk.PrintOperation.set_print_settings] or
    * [method@Gtk.PrintOperation.run] have been called.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPrintSettings()(using
      Runtime
  ): sn.gnome.gtk4.fluent.PrintSettings /* None */ =
    sn.gnome.gtk4.fluent.PrintSettings.applyUnsafe(
      gtk_print_operation_get_print_settings(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]]
      ).asInstanceOf
    )
  end getPrintSettings

  /** Returns the status of the print operation.
    *
    * Also see [method@Gtk.PrintOperation.get_status_string].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStatus(): PrintStatus /* None */ =
    PrintStatus.fromRaw(
      gtk_print_operation_get_status(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]]
      )
    )
  end getStatus

  /** Returns a string representation of the status of the print operation.
    *
    * The string is translated and suitable for displaying the print status e.g.
    * in a `GtkStatusbar`.
    *
    * Use [method@Gtk.PrintOperation.get_status] to obtain a status value that
    * is suitable for programmatic use.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStatusString()(using Zone): String /* None */ =
    fromCString(
      gtk_print_operation_get_status_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]]
      ).asInstanceOf
    )
  end getStatusString

  /** Gets whether the application supports print of selection
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSupportSelection(): Boolean /* None */ =
    gtk_print_operation_get_support_selection(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]]
    ).value.!=(0)
  end getSupportSelection

  /** A convenience function to find out if the print operation is finished.
    *
    * a print operation is finished if its status is either
    * %GTK_PRINT_STATUS_FINISHED or %GTK_PRINT_STATUS_FINISHED_ABORTED.
    *
    * Note: when you enable print status tracking the print operation can be in
    * a non-finished state even after done has been called, as the operation
    * status then tracks the print job status on the printer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isFinished(): Boolean /* None */ =
    gtk_print_operation_is_finished(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]]
    ).value.!=(0)
  end isFinished

  /** Runs the print operation.
    *
    * Normally that this function does not return until the rendering of all
    * pages is complete. You can connect to the
    * [signal@Gtk.PrintOperation::status-changed] signal on @op to obtain some
    * information about the progress of the print operation.
    *
    * Furthermore, it may use a recursive mainloop to show the print dialog.
    *
    * If you set the [Gtk.PrintOperation:allow-async] property, the operation
    * will run asynchronously if this is supported on the platform. The
    * [signal@Gtk.PrintOperation::done] signal will be emitted with the result
    * of the operation when the it is done (i.e. when the dialog is canceled, or
    * when the print succeeds or fails).
    *
    * ```c
    * if (settings != NULL)
    *   gtk_print_operation_set_print_settings (print, settings);
    *
    * if (page_setup != NULL)
    *   gtk_print_operation_set_default_page_setup (print, page_setup);
    *
    * g_signal_connect (print, "begin-print",
    *                   G_CALLBACK (begin_print), &data);
    * g_signal_connect (print, "draw-page",
    *                   G_CALLBACK (draw_page), &data);
    *
    * res = gtk_print_operation_run (print,
    *                                GTK_PRINT_OPERATION_ACTION_PRINT_DIALOG,
    *                                parent,
    *                                &error);
    *
    * if (res == GTK_PRINT_OPERATION_RESULT_ERROR)
    *  {
    *    error_dialog = gtk_message_dialog_new (GTK_WINDOW (parent),
    *   			                     GTK_DIALOG_DESTROY_WITH_PARENT,
    * 					     GTK_MESSAGE_ERROR,
    * 					     GTK_BUTTONS_CLOSE,
    * 					     "Error printing file:\n%s",
    * 					     error->message);
    *    g_signal_connect (error_dialog, "response",
    *                      G_CALLBACK (gtk_window_destroy), NULL);
    *    gtk_window_present (GTK_WINDOW (error_dialog));
    *    g_error_free (error);
    *  }
    * else if (res == GTK_PRINT_OPERATION_RESULT_APPLY)
    *  {
    *    if (settings != NULL)
    * g_object_unref (settings);
    *    settings = g_object_ref (gtk_print_operation_get_print_settings (print));
    *  }
    * ```
    *
    * Note that gtk_print_operation_run() can only be called once on a given
    * `GtkPrintOperation`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def run(
      action: PrintOperationAction /* Some(GtkPrintOperationAction) */,
      parent: Option[sn.gnome.gtk4.fluent.Window /* Some(Ptr[GtkWindow]) */ ]
  )(using Runtime): GResult[PrintOperationResult /* None */ ] =
    GResult.wrap(__errorPtr =>
      PrintOperationResult.fromRaw(
        gtk_print_operation_run(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]],
          action.raw,
          parent
            .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GtkWindow]]),
          __errorPtr
        )
      )
    )
  end run

  /** Sets whether gtk_print_operation_run() may return before the print
    * operation is completed.
    *
    * Note that some platforms may not allow asynchronous operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAllowAsync(
      allow_async: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_print_operation_set_allow_async(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]],
      gboolean(gint((if allow_async == true then 1 else 0)))
    )
  end setAllowAsync

  /** Sets the current page.
    *
    * If this is called before [method@Gtk.PrintOperation.run], the user will be
    * able to select to print only the current page.
    *
    * Note that this only makes sense for pre-paginated documents.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCurrentPage(current_page: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_print_operation_set_current_page(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]],
      current_page
    )
  end setCurrentPage

  /** Sets the label for the tab holding custom widgets.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCustomTabLabel(
      label: Option[String /* Some(CString) */ ]
  )(using Zone): Unit /* None */ =
    gtk_print_operation_set_custom_tab_label(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]],
      label
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setCustomTabLabel

  /** Makes @default_page_setup the default page setup for @op.
    *
    * This page setup will be used by [method@Gtk.PrintOperation.run], but it
    * can be overridden on a per-page basis by connecting to the
    * [signal@Gtk.PrintOperation::request-page-setup] signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDefaultPageSetup(
      default_page_setup: Option[
        sn.gnome.gtk4.fluent.PageSetup /* Some(Ptr[GtkPageSetup]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_print_operation_set_default_page_setup(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]],
      default_page_setup
        .map[Ptr[GtkPageSetup]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkPageSetup]])
    )
  end setDefaultPageSetup

  /** Sets up the `GtkPrintOperation` to wait for calling of
    * [method@Gtk.PrintOperation.draw_page_finish from application.
    *
    * This can be used for drawing page in another thread.
    *
    * This function must be called in the callback of the
    * [signal@Gtk.PrintOperation::draw-page] signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDeferDrawing(): Unit /* None */ =
    gtk_print_operation_set_defer_drawing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]]
    )
  end setDeferDrawing

  /** Embed page size combo box and orientation combo box into page setup page.
    *
    * Selected page setup is stored as default page setup in
    * `GtkPrintOperation`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setEmbedPageSetup(
      embed: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_print_operation_set_embed_page_setup(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]],
      gboolean(gint((if embed == true then 1 else 0)))
    )
  end setEmbedPageSetup

  /** Sets up the `GtkPrintOperation` to generate a file instead of showing the
    * print dialog.
    *
    * The intended use of this function is for implementing “Export to PDF”
    * actions. Currently, PDF is the only supported format.
    *
    * “Print to PDF” support is independent of this and is done by letting the
    * user pick the “Print to PDF” item from the list of printers in the print
    * dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setExportFilename(
      filename: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_print_operation_set_export_filename(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]],
      toCString(filename)
    )
  end setExportFilename

  /** Sets whether there is a selection to print.
    *
    * Application has to set number of pages to which the selection will draw by
    * [method@Gtk.PrintOperation.set_n_pages] in a handler for the
    * [signal@Gtk.PrintOperation::begin-print] signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHasSelection(
      has_selection: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_print_operation_set_has_selection(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]],
      gboolean(gint((if has_selection == true then 1 else 0)))
    )
  end setHasSelection

  /** Sets the name of the print job.
    *
    * The name is used to identify the job (e.g. in monitoring applications like
    * eggcups).
    *
    * If you don’t set a job name, GTK picks a default one by numbering
    * successive print jobs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setJobName(
      job_name: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_print_operation_set_job_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]],
      toCString(job_name)
    )
  end setJobName

  /** Sets the number of pages in the document.
    *
    * This must be set to a positive number before the rendering starts. It may
    * be set in a [signal@Gtk.PrintOperation::begin-print] signal handler.
    *
    * Note that the page numbers passed to the
    * [signal@Gtk.PrintOperation::request-page-setup] and
    * [signal@Gtk.PrintOperation::draw-page] signals are 0-based, i.e. if the
    * user chooses to print all pages, the last ::draw-page signal will be for
    * page @n_pages - 1.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setNPages(n_pages: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_print_operation_set_n_pages(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]],
      n_pages
    )
  end setNPages

  /** Sets the print settings for @op.
    *
    * This is typically used to re-establish print settings from a previous
    * print operation, see [method@Gtk.PrintOperation.run].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPrintSettings(
      print_settings: Option[
        sn.gnome.gtk4.fluent.PrintSettings /* Some(Ptr[GtkPrintSettings]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_print_operation_set_print_settings(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]],
      print_settings
        .map[Ptr[GtkPrintSettings]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkPrintSettings]])
    )
  end setPrintSettings

  /** If @show_progress is %TRUE, the print operation will show a progress
    * dialog during the print operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShowProgress(
      show_progress: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_print_operation_set_show_progress(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]],
      gboolean(gint((if show_progress == true then 1 else 0)))
    )
  end setShowProgress

  /** Sets whether selection is supported by `GtkPrintOperation`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSupportSelection(
      support_selection: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_print_operation_set_support_selection(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]],
      gboolean(gint((if support_selection == true then 1 else 0)))
    )
  end setSupportSelection

  /** If track_status is %TRUE, the print operation will try to continue report
    * on the status of the print job in the printer queues and printer.
    *
    * This can allow your application to show things like “out of paper” issues,
    * and when the print job actually reaches the printer.
    *
    * This function is often implemented using some form of polling, so it
    * should not be enabled unless needed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTrackPrintStatus(
      track_status: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_print_operation_set_track_print_status(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]],
      gboolean(gint((if track_status == true then 1 else 0)))
    )
  end setTrackPrintStatus

  /** Sets up the transformation for the cairo context obtained from
    * `GtkPrintContext` in such a way that distances are measured in units of @unit.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUnit(unit: GTKUnit /* Some(GtkUnit) */ ): Unit /* None */ =
    gtk_print_operation_set_unit(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]],
      unit.raw
    )
  end setUnit

  /** If @full_page is %TRUE, the transformation for the cairo context obtained
    * from `GtkPrintContext` puts the origin at the top left corner of the page.
    *
    * This may not be the top left corner of the sheet, depending on page
    * orientation and the number of pages per sheet). Otherwise, the origin is
    * at the top left corner of the imageable area (i.e. inside the margins).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUseFullPage(
      full_page: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_print_operation_set_use_full_page(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkPrintOperation]],
      gboolean(gint((if full_page == true then 1 else 0)))
    )
  end setUseFullPage

  /** Emitted after the user has finished changing print settings in the dialog,
    * before the actual rendering starts.
    *
    * A typical use for ::begin-print is to use the parameters from the
    * [class@Gtk.PrintContext] and paginate the document accordingly, and then
    * set the number of pages with [method@Gtk.PrintOperation.set_n_pages].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onBeginPrint(handler: ((context: PrintContext)) => Unit)(using Runtime) =
    type SignalRegType =
      SignalRegistration[this.type, (context: PrintContext), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkPrintOperation],
          context: Ptr[GtkPrintContext] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (context =
            sr.runtime.get[PrintContext](context.asInstanceOf[Ptr[Byte]])
          )
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"begin-print"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onBeginPrint

  /** Emitted when displaying the print dialog.
    *
    * If you return a widget in a handler for this signal it will be added to a
    * custom tab in the print dialog. You typically return a container widget
    * with multiple widgets in it.
    *
    * The print dialog owns the returned widget, and its lifetime is not
    * controlled by the application. However, the widget is guaranteed to stay
    * around until the [signal@Gtk.PrintOperation::custom-widget-apply] signal
    * is emitted on the operation. Then you can read out any information you
    * need from the widgets.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onCreateCustomWidget(handler: => Object)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Object]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkPrintOperation],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"create-custom-widget"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onCreateCustomWidget

  /** Emitted right before ::begin-print if you added a custom widget in the
    * ::create-custom-widget handler.
    *
    * When you get this signal you should read the information from the custom
    * widgets, as the widgets are not guaranteed to be around at a later time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onCustomWidgetApply(handler: ((widget: Widget)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (widget: Widget), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkPrintOperation],
          widget: Ptr[GtkWidget] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (widget = sr.runtime.get[Widget](widget.asInstanceOf[Ptr[Byte]]))
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"custom-widget-apply"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onCustomWidgetApply

  /** Emitted when the print operation run has finished doing everything
    * required for printing.
    *
    * @result
    *   gives you information about what happened during the run. If @result is
    *   %GTK_PRINT_OPERATION_RESULT_ERROR then you can call
    *   [method@Gtk.PrintOperation.get_error] for more information.
    *
    * If you enabled print status tracking then
    * [method@Gtk.PrintOperation.is_finished] may still return %FALSE after the
    * ::done signal was emitted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onDone(handler: ((result: PrintOperationResult)) => Unit)(using Runtime) =
    type SignalRegType =
      SignalRegistration[this.type, (result: PrintOperationResult), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkPrintOperation],
          result: GtkPrintOperationResult /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((result = PrintOperationResult.fromRaw(result)))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"done"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onDone

  /** Emitted for every page that is printed.
    *
    * The signal handler must render the @page_nr's page onto the cairo context
    * obtained from @context using [method@Gtk.PrintContext.get_cairo_context].
    *
    * ```c
    * static void
    * draw_page (GtkPrintOperation *operation,
    *            GtkPrintContext   *context,
    *            int                page_nr,
    *            gpointer           user_data)
    * {
    *   cairo_t *cr;
    *   PangoLayout *layout;
    *   double width, text_height;
    *   int layout_height;
    *   PangoFontDescription *desc;
    *
    *   cr = gtk_print_context_get_cairo_context (context);
    *   width = gtk_print_context_get_width (context);
    *
    *   cairo_rectangle (cr, 0, 0, width, HEADER_HEIGHT);
    *
    *   cairo_set_source_rgb (cr, 0.8, 0.8, 0.8);
    *   cairo_fill (cr);
    *
    *   layout = gtk_print_context_create_pango_layout (context);
    *
    *   desc = pango_font_description_from_string ("sans 14");
    *   pango_layout_set_font_description (layout, desc);
    *   pango_font_description_free (desc);
    *
    *   pango_layout_set_text (layout, "some text", -1);
    *   pango_layout_set_width (layout, width * PANGO_SCALE);
    *   pango_layout_set_alignment (layout, PANGO_ALIGN_CENTER);
    *
    *   pango_layout_get_size (layout, NULL, &layout_height);
    *   text_height = (double)layout_height / PANGO_SCALE;
    *
    *   cairo_move_to (cr, width / 2,  (HEADER_HEIGHT - text_height) / 2);
    *   pango_cairo_show_layout (cr, layout);
    *
    *   g_object_unref (layout);
    * }
    * ```
    *
    * Use [method@Gtk.PrintOperation.set_use_full_page] and
    * [method@Gtk.PrintOperation.set_unit] before starting the print operation
    * to set up the transformation of the cairo context according to your needs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onDrawPage(handler: ((context: PrintContext, pageNr: Int)) => Unit)(using
      Runtime
  ) =
    type SignalRegType =
      SignalRegistration[this.type, (context: PrintContext, pageNr: Int), Unit]
    val c_handler = CFuncPtr4.fromScalaFunction {
      (
          self: Ptr[GtkPrintOperation],
          context: Ptr[GtkPrintContext] /* param */,
          pageNr: Int /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (
            context =
              sr.runtime.get[PrintContext](context.asInstanceOf[Ptr[Byte]]),
            pageNr = pageNr
          )
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"draw-page"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onDrawPage

  /** Emitted after all pages have been rendered.
    *
    * A handler for this signal can clean up any resources that have been
    * allocated in the [signal@Gtk.PrintOperation::begin-print] handler.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onEndPrint(handler: ((context: PrintContext)) => Unit)(using Runtime) =
    type SignalRegType =
      SignalRegistration[this.type, (context: PrintContext), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkPrintOperation],
          context: Ptr[GtkPrintContext] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (context =
            sr.runtime.get[PrintContext](context.asInstanceOf[Ptr[Byte]])
          )
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"end-print"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onEndPrint

  /** Emitted after the ::begin-print signal, but before the actual rendering
    * starts.
    *
    * It keeps getting emitted until a connected signal handler returns %TRUE.
    *
    * The ::paginate signal is intended to be used for paginating a document in
    * small chunks, to avoid blocking the user interface for a long time. The
    * signal handler should update the number of pages using
    * [method@Gtk.PrintOperation.set_n_pages], and return %TRUE if the document
    * has been completely paginated.
    *
    * If you don't need to do pagination in chunks, you can simply do it all in
    * the ::begin-print handler, and set the number of pages from there.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onPaginate(handler: ((context: PrintContext)) => Boolean)(using Runtime) =
    type SignalRegType =
      SignalRegistration[this.type, (context: PrintContext), Boolean]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkPrintOperation],
          context: Ptr[GtkPrintContext] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (context =
            sr.runtime.get[PrintContext](context.asInstanceOf[Ptr[Byte]])
          )
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"paginate"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onPaginate

  /** Gets emitted when a preview is requested from the native dialog.
    *
    * The default handler for this signal uses an external viewer application to
    * preview.
    *
    * To implement a custom print preview, an application must return %TRUE from
    * its handler for this signal. In order to use the provided @context for the
    * preview implementation, it must be given a suitable cairo context with
    * [method@Gtk.PrintContext.set_cairo_context].
    *
    * The custom preview implementation can use
    * [method@Gtk.PrintOperationPreview.is_selected] and
    * [method@Gtk.PrintOperationPreview.render_page] to find pages which are
    * selected for print and render them. The preview must be finished by
    * calling [method@Gtk.PrintOperationPreview.end_preview] (typically in
    * response to the user clicking a close button).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal preview]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(PrintOperationPreview)))"
  )
  private def onPreview = ???

  /** Emitted once for every page that is printed.
    *
    * This gives the application a chance to modify the page setup. Any changes
    * done to @setup will be in force only for printing this page.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onRequestPageSetup(
      handler: ((context: PrintContext, pageNr: Int, setup: PageSetup)) => Unit
  )(using Runtime) =
    type SignalRegType = SignalRegistration[
      this.type,
      (context: PrintContext, pageNr: Int, setup: PageSetup),
      Unit
    ]
    val c_handler = CFuncPtr5.fromScalaFunction {
      (
          self: Ptr[GtkPrintOperation],
          context: Ptr[GtkPrintContext] /* param */,
          pageNr: Int /* param */,
          setup: Ptr[GtkPageSetup] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (
            context =
              sr.runtime.get[PrintContext](context.asInstanceOf[Ptr[Byte]]),
            pageNr = pageNr,
            setup = sr.runtime.get[PageSetup](setup.asInstanceOf[Ptr[Byte]])
          )
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"request-page-setup"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onRequestPageSetup

  /** Emitted at between the various phases of the print operation.
    *
    * See [enum@Gtk.PrintStatus] for the phases that are being discriminated.
    * Use [method@Gtk.PrintOperation.get_status] to find out the current status.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onStatusChanged(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkPrintOperation],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"status-changed"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onStatusChanged

  /** Emitted after change of selected printer.
    *
    * The actual page setup and print settings are passed to the custom widget,
    * which can actualize itself according to this change.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onUpdateCustomWidget(
      handler: (
          (widget: Widget, setup: PageSetup, settings: PrintSettings)
      ) => Unit
  )(using Runtime) =
    type SignalRegType = SignalRegistration[
      this.type,
      (widget: Widget, setup: PageSetup, settings: PrintSettings),
      Unit
    ]
    val c_handler = CFuncPtr5.fromScalaFunction {
      (
          self: Ptr[GtkPrintOperation],
          widget: Ptr[GtkWidget] /* param */,
          setup: Ptr[GtkPageSetup] /* param */,
          settings: Ptr[GtkPrintSettings] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (
            widget = sr.runtime.get[Widget](widget.asInstanceOf[Ptr[Byte]]),
            setup = sr.runtime.get[PageSetup](setup.asInstanceOf[Ptr[Byte]]),
            settings =
              sr.runtime.get[PrintSettings](settings.asInstanceOf[Ptr[Byte]])
          )
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"update-custom-widget"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onUpdateCustomWidget
end PrintOperation

object PrintOperation:
  def applyUnsafe(ptr: Ptr[GtkPrintOperation])(using Runtime) =
    summon[Runtime].getOrCreate[PrintOperation](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new PrintOperation(ptr)
    )

  /** Creates a new `GtkPrintOperation`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): PrintOperation =
    val raw: Ptr[Byte] = gtk_print_operation_new().asInstanceOf
    summon[Runtime].getOrCreate[PrintOperation](
      raw,
      r => PrintOperation.applyUnsafe(r.asInstanceOf)
    )
  end apply
end PrintOperation
