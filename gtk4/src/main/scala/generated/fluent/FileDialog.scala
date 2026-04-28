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

class FileDialog(raw: Ptr[GtkFileDialog]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAcceptLabel()(using Zone): String = fromCString(
    gtk_file_dialog_get_accept_label(this.raw.asInstanceOf).asInstanceOf
  )

  def getDefaultFilter(): FileFilter = new FileFilter(
    gtk_file_dialog_get_default_filter(this.raw.asInstanceOf).asInstanceOf
  )

  def getFilters(): ListModel = new ListModel.Abstract(
    gtk_file_dialog_get_filters(this.raw.asInstanceOf).asInstanceOf
  )

  def getInitialFile(): File = new File.Abstract(
    gtk_file_dialog_get_initial_file(this.raw.asInstanceOf).asInstanceOf
  )

  def getInitialFolder(): File = new File.Abstract(
    gtk_file_dialog_get_initial_folder(this.raw.asInstanceOf).asInstanceOf
  )

  def getInitialName()(using Zone): String = fromCString(
    gtk_file_dialog_get_initial_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getModal(): Boolean =
    gtk_file_dialog_get_modal(this.raw.asInstanceOf).value.!=(0)

  def getTitle()(using Zone): String = fromCString(
    gtk_file_dialog_get_title(this.raw.asInstanceOf).asInstanceOf
  )

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

  def setAcceptLabel(accept_label: String | CString)(using Zone): Unit =
    gtk_file_dialog_set_accept_label(
      this.raw.asInstanceOf,
      __sn_extract_string(accept_label)
    )

  def setDefaultFilter(filter: FileFilter): Unit =
    gtk_file_dialog_set_default_filter(
      this.raw.asInstanceOf,
      filter.getUnsafeRawPointer().asInstanceOf
    )

  def setFilters(filters: ListModel): Unit = gtk_file_dialog_set_filters(
    this.raw.asInstanceOf,
    filters.getUnsafeRawPointer().asInstanceOf
  )

  def setInitialFile(file: File): Unit = gtk_file_dialog_set_initial_file(
    this.raw.asInstanceOf,
    file.getUnsafeRawPointer().asInstanceOf
  )

  def setInitialFolder(folder: File): Unit = gtk_file_dialog_set_initial_folder(
    this.raw.asInstanceOf,
    folder.getUnsafeRawPointer().asInstanceOf
  )

  def setInitialName(name: String | CString)(using Zone): Unit =
    gtk_file_dialog_set_initial_name(
      this.raw.asInstanceOf,
      __sn_extract_string(name)
    )

  def setModal(modal: Boolean): Unit = gtk_file_dialog_set_modal(
    this.raw.asInstanceOf,
    gboolean(gint((if modal == true then 1 else 0)))
  )

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
  def apply(): FileDialog = new FileDialog(gtk_file_dialog_new().asInstanceOf)
end FileDialog
