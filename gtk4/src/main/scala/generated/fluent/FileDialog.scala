package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{AsyncResult, File, ListModel}
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.FileFilter
import sn.gnome.gtk4.internal.GtkFileDialog

/** A `GtkFileDialog` object collects the arguments that are needed to present a
  * file chooser dialog to the user, such as a title for the dialog and whether
  * it should be modal.
  *
  * The dialog is shown with [method@Gtk.FileDialog.open],
  * [method@Gtk.FileDialog.save], etc. These APIs follow the GIO async pattern,
  * and the result can be obtained by calling the corresponding finish function,
  * for example [method@Gtk.FileDialog.open_finish].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FileDialog(raw: Ptr[GtkFileDialog]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAcceptLabel()(using Zone): String /* None */ = fromCString(
    gtk_file_dialog_get_accept_label(
      this.raw.asInstanceOf[Ptr[GtkFileDialog]]
    ).asInstanceOf
  )

  /** Gets the filter that will be selected by default in the file chooser
    * dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDefaultFilter(): FileFilter /* None */ = new FileFilter(
    gtk_file_dialog_get_default_filter(
      this.raw.asInstanceOf[Ptr[GtkFileDialog]]
    ).asInstanceOf
  )

  /** Gets the filters that will be offered to the user in the file chooser
    * dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFilters(): ListModel /* None */ = new ListModel.Abstract(
    gtk_file_dialog_get_filters(
      this.raw.asInstanceOf[Ptr[GtkFileDialog]]
    ).asInstanceOf
  )

  /** Gets the file that will be initially selected in the file chooser dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInitialFile(): File /* None */ = new File.Abstract(
    gtk_file_dialog_get_initial_file(
      this.raw.asInstanceOf[Ptr[GtkFileDialog]]
    ).asInstanceOf
  )

  /** Gets the folder that will be set as the initial folder in the file chooser
    * dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInitialFolder(): File /* None */ = new File.Abstract(
    gtk_file_dialog_get_initial_folder(
      this.raw.asInstanceOf[Ptr[GtkFileDialog]]
    ).asInstanceOf
  )

  /** Gets the name for the file that should be initially set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInitialName()(using Zone): String /* None */ = fromCString(
    gtk_file_dialog_get_initial_name(
      this.raw.asInstanceOf[Ptr[GtkFileDialog]]
    ).asInstanceOf
  )

  /** Returns whether the file chooser dialog blocks interaction with the parent
    * window while it is presented.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModal(): Boolean /* None */ = gtk_file_dialog_get_modal(
    this.raw.asInstanceOf[Ptr[GtkFileDialog]]
  ).value.!=(0)

  /** Returns the title that will be shown on the file chooser dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTitle()(using Zone): String /* None */ = fromCString(
    gtk_file_dialog_get_title(
      this.raw.asInstanceOf[Ptr[GtkFileDialog]]
    ).asInstanceOf
  )

  /** This function initiates a file selection operation by presenting a file
    * chooser dialog to the user.
    *
    * The @callback will be called when the dialog is dismissed. It should call
    * [method@Gtk.FileDialog.open_finish] to obtain the result.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[open/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def open__ = ???

  /** Finishes the [method@Gtk.FileDialog.open] call and returns the resulting
    * file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def openFinish(
      result: AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  ): GResult[File /* None */ ] = GResult.wrap(__errorPtr =>
    new File.Abstract(
      gtk_file_dialog_open_finish(
        this.raw.asInstanceOf[Ptr[GtkFileDialog]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  /** This function initiates a multi-file selection operation by presenting a
    * file chooser dialog to the user.
    *
    * The file chooser will initially be opened in the directory
    * [property@Gtk.FileDialog:initial-folder].
    *
    * The @callback will be called when the dialog is dismissed. It should call
    * [method@Gtk.FileDialog.open_multiple_finish] to obtain the result.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[open_multiple/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def openMultiple__ = ???

  /** Finishes the [method@Gtk.FileDialog.open] call and returns the resulting
    * files in a `GListModel`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def openMultipleFinish(
      result: AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  ): GResult[ListModel /* None */ ] = GResult.wrap(__errorPtr =>
    new ListModel.Abstract(
      gtk_file_dialog_open_multiple_finish(
        this.raw.asInstanceOf[Ptr[GtkFileDialog]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  /** This function initiates a file save operation by presenting a file chooser
    * dialog to the user.
    *
    * The @callback will be called when the dialog is dismissed. It should call
    * [method@Gtk.FileDialog.save_finish] to obtain the result.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[save/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def save__ = ???

  /** Finishes the [method@Gtk.FileDialog.save] call and returns the resulting
    * file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def saveFinish(
      result: AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  ): GResult[File /* None */ ] = GResult.wrap(__errorPtr =>
    new File.Abstract(
      gtk_file_dialog_save_finish(
        this.raw.asInstanceOf[Ptr[GtkFileDialog]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  /** This function initiates a directory selection operation by presenting a
    * file chooser dialog to the user.
    *
    * If you pass @initial_folder, the file chooser will initially be opened in
    * the parent directory of that folder, otherwise, it will be in the
    * directory [property@Gtk.FileDialog:initial-folder].
    *
    * The @callback will be called when the dialog is dismissed. It should call
    * [method@Gtk.FileDialog.select_folder_finish] to obtain the result.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[select_folder/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def selectFolder__ = ???

  /** Finishes the [method@Gtk.FileDialog.select_folder] call and returns the
    * resulting file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def selectFolderFinish(
      result: AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  ): GResult[File /* None */ ] = GResult.wrap(__errorPtr =>
    new File.Abstract(
      gtk_file_dialog_select_folder_finish(
        this.raw.asInstanceOf[Ptr[GtkFileDialog]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  /** This function initiates a multi-directory selection operation by
    * presenting a file chooser dialog to the user.
    *
    * The file chooser will initially be opened in the directory
    * [property@Gtk.FileDialog:initial-folder].
    *
    * The @callback will be called when the dialog is dismissed. It should call
    * [method@Gtk.FileDialog.select_multiple_folders_finish] to obtain the
    * result.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[select_multiple_folders/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def selectMultipleFolders__ = ???

  /** Finishes the [method@Gtk.FileDialog.select_multiple_folders] call and
    * returns the resulting files in a `GListModel`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def selectMultipleFoldersFinish(
      result: AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  ): GResult[ListModel /* None */ ] = GResult.wrap(__errorPtr =>
    new ListModel.Abstract(
      gtk_file_dialog_select_multiple_folders_finish(
        this.raw.asInstanceOf[Ptr[GtkFileDialog]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  /** Sets the label shown on the file chooser's accept button.
    *
    * Leaving the accept label unset or setting it as `NULL` will fall back to a
    * default label, depending on what API is used to launch the file dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAcceptLabel(
      accept_label: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_file_dialog_set_accept_label(
    this.raw.asInstanceOf[Ptr[GtkFileDialog]],
    accept_label
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Sets the filter that will be selected by default in the file chooser
    * dialog.
    *
    * If set to %NULL, the first item in [property@Gtk.FileDialog:filters] will
    * be used as the default filter. If that list is empty, the dialog will be
    * unfiltered.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDefaultFilter(
      filter: Option[FileFilter /* Some(Ptr[GtkFileFilter]) */ ]
  ): Unit /* None */ = gtk_file_dialog_set_default_filter(
    this.raw.asInstanceOf[Ptr[GtkFileDialog]],
    filter
      .map[Ptr[GtkFileFilter]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkFileFilter]])
  )

  /** Sets the filters that will be offered to the user in the file chooser
    * dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFilters(
      filters: Option[
        ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */
      ]
  ): Unit /* None */ = gtk_file_dialog_set_filters(
    this.raw.asInstanceOf[Ptr[GtkFileDialog]],
    filters
      .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
      )
  )

  /** Sets the file that will be initially selected in the file chooser dialog.
    *
    * This function is a shortcut for calling both
    * gtk_file_dialog_set_initial_folder() and
    * gtk_file_dialog_set_initial_name() with the directory and name of @file
    * respectively.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInitialFile(
      file: Option[File /* Some(Ptr[_root_.sn.gnome.gio.internal.GFile]) */ ]
  ): Unit /* None */ = gtk_file_dialog_set_initial_file(
    this.raw.asInstanceOf[Ptr[GtkFileDialog]],
    file
      .map[Ptr[_root_.sn.gnome.gio.internal.GFile]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GFile]])
  )

  /** Sets the folder that will be set as the initial folder in the file chooser
    * dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInitialFolder(
      folder: Option[File /* Some(Ptr[_root_.sn.gnome.gio.internal.GFile]) */ ]
  ): Unit /* None */ = gtk_file_dialog_set_initial_folder(
    this.raw.asInstanceOf[Ptr[GtkFileDialog]],
    folder
      .map[Ptr[_root_.sn.gnome.gio.internal.GFile]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GFile]])
  )

  /** Sets the name for the file that should be initially set. For saving
    * dialogs, this will usually be pre-entered into the name field.
    *
    * If a file with this name already exists in the directory set via
    * [property@Gtk.FileDialog:initial-folder], the dialog should preselect it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInitialName(
      name: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_file_dialog_set_initial_name(
    this.raw.asInstanceOf[Ptr[GtkFileDialog]],
    name
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Sets whether the file chooser dialog blocks interaction with the parent
    * window while it is presented.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModal(
      modal: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_file_dialog_set_modal(
    this.raw.asInstanceOf[Ptr[GtkFileDialog]],
    gboolean(gint((if modal == true then 1 else 0)))
  )

  /** Sets the title that will be shown on the file chooser dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTitle(
      title: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gtk_file_dialog_set_title(
    this.raw.asInstanceOf[Ptr[GtkFileDialog]],
    __sn_extract_string(title)
  )

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
  /** Creates a new `GtkFileDialog` object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): FileDialog = new FileDialog(gtk_file_dialog_new().asInstanceOf)
end FileDialog
