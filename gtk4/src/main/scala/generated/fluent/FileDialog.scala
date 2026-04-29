package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.File
import sn.gnome.gio.fluent.ListModel
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.FileFilter
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkFileDialog

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkFileDialog` object collects the arguments that are needed to present a
  * file chooser dialog to the user, such as a title for the dialog and whether
  * it should be modal.
  *
  * The dialog is shown with [method@Gtk.FileDialog.open],
  * [method@Gtk.FileDialog.save], etc. These APIs follow the GIO async pattern,
  * and the result can be obtained by calling the corresponding finish function,
  * for example [method@Gtk.FileDialog.open_finish].
  */
class FileDialog(raw: Ptr[GtkFileDialog]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAcceptLabel()(using Zone): String = fromCString(
    gtk_file_dialog_get_accept_label(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the filter that will be selected by default in the file chooser
    * dialog.
    */
  def getDefaultFilter(): FileFilter = new FileFilter(
    gtk_file_dialog_get_default_filter(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the filters that will be offered to the user in the file chooser
    * dialog.
    */
  def getFilters(): ListModel = new ListModel.Abstract(
    gtk_file_dialog_get_filters(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the file that will be initially selected in the file chooser dialog.
    */
  def getInitialFile(): File = new File.Abstract(
    gtk_file_dialog_get_initial_file(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the folder that will be set as the initial folder in the file chooser
    * dialog.
    */
  def getInitialFolder(): File = new File.Abstract(
    gtk_file_dialog_get_initial_folder(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the name for the file that should be initially set.
    */
  def getInitialName()(using Zone): String = fromCString(
    gtk_file_dialog_get_initial_name(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the file chooser dialog blocks interaction with the parent
    * window while it is presented.
    */
  def getModal(): Boolean =
    gtk_file_dialog_get_modal(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the title that will be shown on the file chooser dialog.
    */
  def getTitle()(using Zone): String = fromCString(
    gtk_file_dialog_get_title(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function initiates a file selection operation by presenting a file
    * chooser dialog to the user.
    *
    * The @callback will be called when the dialog is dismissed. It should call
    * [method@Gtk.FileDialog.open_finish] to obtain the result.
    */
  def open(
      parent: Window,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = gtk_file_dialog_open(
    this.raw.asInstanceOf,
    parent.getUnsafeRawPointer().asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes the [method@Gtk.FileDialog.open] call and returns the resulting
    * file.
    */
  def openFinish(result: AsyncResult): GResult[File] =
    GResult.wrap(__errorPtr =>
      new File.Abstract(
        gtk_file_dialog_open_finish(
          this.raw.asInstanceOf,
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function initiates a multi-file selection operation by presenting a
    * file chooser dialog to the user.
    *
    * The file chooser will initially be opened in the directory
    * [property@Gtk.FileDialog:initial-folder].
    *
    * The @callback will be called when the dialog is dismissed. It should call
    * [method@Gtk.FileDialog.open_multiple_finish] to obtain the result.
    */
  def openMultiple(
      parent: Window,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = gtk_file_dialog_open_multiple(
    this.raw.asInstanceOf,
    parent.getUnsafeRawPointer().asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes the [method@Gtk.FileDialog.open] call and returns the resulting
    * files in a `GListModel`.
    */
  def openMultipleFinish(result: AsyncResult): GResult[ListModel] =
    GResult.wrap(__errorPtr =>
      new ListModel.Abstract(
        gtk_file_dialog_open_multiple_finish(
          this.raw.asInstanceOf,
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function initiates a file save operation by presenting a file chooser
    * dialog to the user.
    *
    * The @callback will be called when the dialog is dismissed. It should call
    * [method@Gtk.FileDialog.save_finish] to obtain the result.
    */
  def save(
      parent: Window,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = gtk_file_dialog_save(
    this.raw.asInstanceOf,
    parent.getUnsafeRawPointer().asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes the [method@Gtk.FileDialog.save] call and returns the resulting
    * file.
    */
  def saveFinish(result: AsyncResult): GResult[File] =
    GResult.wrap(__errorPtr =>
      new File.Abstract(
        gtk_file_dialog_save_finish(
          this.raw.asInstanceOf,
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function initiates a directory selection operation by presenting a
    * file chooser dialog to the user.
    *
    * If you pass @initial_folder, the file chooser will initially be opened in
    * the parent directory of that folder, otherwise, it will be in the
    * directory [property@Gtk.FileDialog:initial-folder].
    *
    * The @callback will be called when the dialog is dismissed. It should call
    * [method@Gtk.FileDialog.select_folder_finish] to obtain the result.
    */
  def selectFolder(
      parent: Window,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = gtk_file_dialog_select_folder(
    this.raw.asInstanceOf,
    parent.getUnsafeRawPointer().asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes the [method@Gtk.FileDialog.select_folder] call and returns the
    * resulting file.
    */
  def selectFolderFinish(result: AsyncResult): GResult[File] =
    GResult.wrap(__errorPtr =>
      new File.Abstract(
        gtk_file_dialog_select_folder_finish(
          this.raw.asInstanceOf,
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function initiates a multi-directory selection operation by
    * presenting a file chooser dialog to the user.
    *
    * The file chooser will initially be opened in the directory
    * [property@Gtk.FileDialog:initial-folder].
    *
    * The @callback will be called when the dialog is dismissed. It should call
    * [method@Gtk.FileDialog.select_multiple_folders_finish] to obtain the
    * result.
    */
  def selectMultipleFolders(
      parent: Window,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = gtk_file_dialog_select_multiple_folders(
    this.raw.asInstanceOf,
    parent.getUnsafeRawPointer().asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes the [method@Gtk.FileDialog.select_multiple_folders] call and
    * returns the resulting files in a `GListModel`.
    */
  def selectMultipleFoldersFinish(result: AsyncResult): GResult[ListModel] =
    GResult.wrap(__errorPtr =>
      new ListModel.Abstract(
        gtk_file_dialog_select_multiple_folders_finish(
          this.raw.asInstanceOf,
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the label shown on the file chooser's accept button.
    *
    * Leaving the accept label unset or setting it as `NULL` will fall back to a
    * default label, depending on what API is used to launch the file dialog.
    */
  def setAcceptLabel(accept_label: String | CString)(using Zone): Unit =
    gtk_file_dialog_set_accept_label(
      this.raw.asInstanceOf,
      __sn_extract_string(accept_label)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the filter that will be selected by default in the file chooser
    * dialog.
    *
    * If set to %NULL, the first item in [property@Gtk.FileDialog:filters] will
    * be used as the default filter. If that list is empty, the dialog will be
    * unfiltered.
    */
  def setDefaultFilter(filter: FileFilter): Unit =
    gtk_file_dialog_set_default_filter(
      this.raw.asInstanceOf,
      filter.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the filters that will be offered to the user in the file chooser
    * dialog.
    */
  def setFilters(filters: ListModel): Unit = gtk_file_dialog_set_filters(
    this.raw.asInstanceOf,
    filters.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the file that will be initially selected in the file chooser dialog.
    *
    * This function is a shortcut for calling both
    * gtk_file_dialog_set_initial_folder() and
    * gtk_file_dialog_set_initial_name() with the directory and name of @file
    * respectively.
    */
  def setInitialFile(file: File): Unit = gtk_file_dialog_set_initial_file(
    this.raw.asInstanceOf,
    file.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the folder that will be set as the initial folder in the file chooser
    * dialog.
    */
  def setInitialFolder(folder: File): Unit = gtk_file_dialog_set_initial_folder(
    this.raw.asInstanceOf,
    folder.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the name for the file that should be initially set. For saving
    * dialogs, this will usually be pre-entered into the name field.
    *
    * If a file with this name already exists in the directory set via
    * [property@Gtk.FileDialog:initial-folder], the dialog should preselect it.
    */
  def setInitialName(name: String | CString)(using Zone): Unit =
    gtk_file_dialog_set_initial_name(
      this.raw.asInstanceOf,
      __sn_extract_string(name)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the file chooser dialog blocks interaction with the parent
    * window while it is presented.
    */
  def setModal(modal: Boolean): Unit = gtk_file_dialog_set_modal(
    this.raw.asInstanceOf,
    gboolean(gint((if modal == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the title that will be shown on the file chooser dialog.
    */
  def setTitle(title: String | CString)(using Zone): Unit =
    gtk_file_dialog_set_title(this.raw.asInstanceOf, __sn_extract_string(title))

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end FileDialog

object FileDialog:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkFileDialog` object.
    */
  def apply(): FileDialog = new FileDialog(gtk_file_dialog_new().asInstanceOf)
end FileDialog
