package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{AsyncResult, File, ListModel}
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*
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
class FileDialog private[gnome] (raw: Ptr[GtkFileDialog])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAcceptLabel()(using Zone): String /* None */ =
    fromCString(
      gtk_file_dialog_get_accept_label(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileDialog]]
      ).asInstanceOf
    )
  end getAcceptLabel

  /** Gets the filter that will be selected by default in the file chooser
    * dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDefaultFilter()(using
      Runtime
  ): sn.gnome.gtk4.fluent.FileFilter /* None */ =
    sn.gnome.gtk4.fluent.FileFilter.applyUnsafe(
      gtk_file_dialog_get_default_filter(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileDialog]]
      ).asInstanceOf
    )
  end getDefaultFilter

  /** Gets the filters that will be offered to the user in the file chooser
    * dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFilters(): ListModel /* None */ =
    new ListModel.Abstract(
      gtk_file_dialog_get_filters(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileDialog]]
      ).asInstanceOf
    )
  end getFilters

  /** Gets the file that will be initially selected in the file chooser dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInitialFile(): File /* None */ =
    new File.Abstract(
      gtk_file_dialog_get_initial_file(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileDialog]]
      ).asInstanceOf
    )
  end getInitialFile

  /** Gets the folder that will be set as the initial folder in the file chooser
    * dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInitialFolder(): File /* None */ =
    new File.Abstract(
      gtk_file_dialog_get_initial_folder(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileDialog]]
      ).asInstanceOf
    )
  end getInitialFolder

  /** Gets the name for the file that should be initially set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInitialName()(using Zone): String /* None */ =
    fromCString(
      gtk_file_dialog_get_initial_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileDialog]]
      ).asInstanceOf
    )
  end getInitialName

  /** Returns whether the file chooser dialog blocks interaction with the parent
    * window while it is presented.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModal(): Boolean /* None */ =
    gtk_file_dialog_get_modal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileDialog]]
    ).value.!=(0)
  end getModal

  /** Returns the title that will be shown on the file chooser dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTitle()(using Zone): String /* None */ =
    fromCString(
      gtk_file_dialog_get_title(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileDialog]]
      ).asInstanceOf
    )
  end getTitle

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
    "[method open/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
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
  ): GResult[File /* None */ ] =
    GResult.wrap(__errorPtr =>
      new File.Abstract(
        gtk_file_dialog_open_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileDialog]],
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end openFinish

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
    "[method open_multiple/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
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
  ): GResult[ListModel /* None */ ] =
    GResult.wrap(__errorPtr =>
      new ListModel.Abstract(
        gtk_file_dialog_open_multiple_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileDialog]],
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end openMultipleFinish

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
    "[method save/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
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
  ): GResult[File /* None */ ] =
    GResult.wrap(__errorPtr =>
      new File.Abstract(
        gtk_file_dialog_save_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileDialog]],
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end saveFinish

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
    "[method select_folder/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
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
  ): GResult[File /* None */ ] =
    GResult.wrap(__errorPtr =>
      new File.Abstract(
        gtk_file_dialog_select_folder_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileDialog]],
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end selectFolderFinish

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
    "[method select_multiple_folders/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
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
  ): GResult[ListModel /* None */ ] =
    GResult.wrap(__errorPtr =>
      new ListModel.Abstract(
        gtk_file_dialog_select_multiple_folders_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileDialog]],
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end selectMultipleFoldersFinish

  /** Sets the label shown on the file chooser's accept button.
    *
    * Leaving the accept label unset or setting it as `NULL` will fall back to a
    * default label, depending on what API is used to launch the file dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAcceptLabel(
      accept_label: Option[String /* Some(CString) */ ]
  )(using Zone): Unit /* None */ =
    gtk_file_dialog_set_accept_label(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileDialog]],
      accept_label
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setAcceptLabel

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
      filter: Option[
        sn.gnome.gtk4.fluent.FileFilter /* Some(Ptr[GtkFileFilter]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_file_dialog_set_default_filter(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileDialog]],
      filter
        .map[Ptr[GtkFileFilter]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkFileFilter]])
    )
  end setDefaultFilter

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
  ): Unit /* None */ =
    gtk_file_dialog_set_filters(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileDialog]],
      filters
        .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
        )
    )
  end setFilters

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
  ): Unit /* None */ =
    gtk_file_dialog_set_initial_file(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileDialog]],
      file
        .map[Ptr[_root_.sn.gnome.gio.internal.GFile]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GFile]])
    )
  end setInitialFile

  /** Sets the folder that will be set as the initial folder in the file chooser
    * dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInitialFolder(
      folder: Option[File /* Some(Ptr[_root_.sn.gnome.gio.internal.GFile]) */ ]
  ): Unit /* None */ =
    gtk_file_dialog_set_initial_folder(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileDialog]],
      folder
        .map[Ptr[_root_.sn.gnome.gio.internal.GFile]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GFile]])
    )
  end setInitialFolder

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
      name: Option[String /* Some(CString) */ ]
  )(using Zone): Unit /* None */ =
    gtk_file_dialog_set_initial_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileDialog]],
      name.map[CString](o => toCString(o)).getOrElse(null.asInstanceOf[CString])
    )
  end setInitialName

  /** Sets whether the file chooser dialog blocks interaction with the parent
    * window while it is presented.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModal(
      modal: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_file_dialog_set_modal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileDialog]],
      gboolean(gint((if modal == true then 1 else 0)))
    )
  end setModal

  /** Sets the title that will be shown on the file chooser dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTitle(
      title: String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    gtk_file_dialog_set_title(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileDialog]],
      toCString(title)
    )
  end setTitle

end FileDialog

object FileDialog:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkFileDialog])(using Runtime) =
    summon[Runtime].getOrCreate[FileDialog](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new FileDialog(ptr)
    )

  /** Creates a new `GtkFileDialog` object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): FileDialog =
    val raw: Ptr[Byte] = gtk_file_dialog_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[FileDialog](raw, r => FileDialog.applyUnsafe(r.asInstanceOf))
  end apply
end FileDialog
