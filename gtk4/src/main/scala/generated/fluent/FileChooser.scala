package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{File, ListModel}
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{FileChooserAction, FileFilter}
import sn.gnome.runtime.*

trait FileChooser:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Adds a 'choice' to the file chooser.
    *
    * This is typically implemented as a combobox or, for boolean choices, as a
    * checkbutton. You can select a value using
    * [method@Gtk.FileChooser.set_choice] before the dialog is shown, and you
    * can obtain the user-selected value in the [signal@Gtk.Dialog::response]
    * signal handler using [method@Gtk.FileChooser.get_choice].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addChoice(
      id: String /* Some(CString) */,
      label: String /* Some(CString) */,
      options: Option[Array[String] /* Some(Ptr[CString]) */ ],
      option_labels: Option[Array[String] /* Some(Ptr[CString]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_file_chooser_add_choice(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileChooser]],
      summon[Runtime].inZone(toCString(id)),
      summon[Runtime].inZone(toCString(label)),
      options
        .map[Ptr[CString]](o =>
          summon[Runtime].inZone(MemoryWrite.nullTerminatedStringArray(o))
        )
        .getOrElse(null.asInstanceOf[Ptr[CString]]),
      option_labels
        .map[Ptr[CString]](o =>
          summon[Runtime].inZone(MemoryWrite.nullTerminatedStringArray(o))
        )
        .getOrElse(null.asInstanceOf[Ptr[CString]])
    )
  end addChoice

  /** Adds @filter to the list of filters that the user can select between.
    *
    * When a filter is selected, only files that are passed by that filter are
    * displayed.
    *
    * Note that the @chooser takes ownership of the filter if it is floating, so
    * you have to ref and sink it if you want to keep a reference.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addFilter(
      filter: sn.gnome.gtk4.FileFilter /* Some(Ptr[GtkFileFilter]) */
  )(using Runtime): Unit /* None */ =
    gtk_file_chooser_add_filter(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileChooser]],
      filter.getUnsafeRawPointer().asInstanceOf
    )
  end addFilter

  /** Adds a folder to be displayed with the shortcut folders in a file chooser.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addShortcutFolder(
      folder: File /* Some(Ptr[_root_.sn.gnome.gio.internal.GFile]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      gtk_file_chooser_add_shortcut_folder(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileChooser]],
        folder.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end addShortcutFolder

  /** Gets the type of operation that the file chooser is performing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAction(): FileChooserAction /* None */ =
    FileChooserAction.fromRaw(
      gtk_file_chooser_get_action(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileChooser]]
      )
    )
  end getAction

  /** Gets the currently selected option in the 'choice' with the given ID.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChoice(
      id: String /* Some(CString) */
  )(using Runtime): String /* None */ =
    fromCString(
      gtk_file_chooser_get_choice(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileChooser]],
        summon[Runtime].inZone(toCString(id))
      ).asInstanceOf
    )
  end getChoice

  /** Gets whether file chooser will offer to create new folders.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCreateFolders(): Boolean /* None */ =
    gtk_file_chooser_get_create_folders(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileChooser]]
    ).value.!=(0)
  end getCreateFolders

  /** Gets the current folder of @chooser as `GFile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCurrentFolder(): File /* None */ =
    new File.Abstract(
      gtk_file_chooser_get_current_folder(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileChooser]]
      ).asInstanceOf
    )
  end getCurrentFolder

  /** Gets the current name in the file selector, as entered by the user.
    *
    * This is meant to be used in save dialogs, to get the currently typed
    * filename when the file itself does not exist yet.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCurrentName(): String /* None */ =
    fromCString(
      gtk_file_chooser_get_current_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileChooser]]
      ).asInstanceOf
    )
  end getCurrentName

  /** Gets the `GFile` for the currently selected file in the file selector.
    *
    * If multiple files are selected, one of the files will be returned at
    * random.
    *
    * If the file chooser is in folder mode, this function returns the selected
    * folder.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFile(): File /* None */ =
    new File.Abstract(
      gtk_file_chooser_get_file(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileChooser]]
      ).asInstanceOf
    )
  end getFile

  /** Lists all the selected files and subfolders in the current folder of @chooser
    * as `GFile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFiles(): ListModel /* None */ =
    new ListModel.Abstract(
      gtk_file_chooser_get_files(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileChooser]]
      ).asInstanceOf
    )
  end getFiles

  /** Gets the current filter.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFilter()(using Runtime): sn.gnome.gtk4.FileFilter /* None */ =
    sn.gnome.gtk4.FileFilter.applyUnsafe(
      gtk_file_chooser_get_filter(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileChooser]]
      ).asInstanceOf
    )
  end getFilter

  /** Gets the current set of user-selectable filters, as a list model.
    *
    * See [method@Gtk.FileChooser.add_filter] and
    * [method@Gtk.FileChooser.remove_filter] for changing individual filters.
    *
    * You should not modify the returned list model. Future changes to
    * @chooser
    *   may or may not affect the returned model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFilters(): ListModel /* None */ =
    new ListModel.Abstract(
      gtk_file_chooser_get_filters(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileChooser]]
      ).asInstanceOf
    )
  end getFilters

  /** Gets whether multiple files can be selected in the file chooser.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSelectMultiple(): Boolean /* None */ =
    gtk_file_chooser_get_select_multiple(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileChooser]]
    ).value.!=(0)
  end getSelectMultiple

  /** Queries the list of shortcut folders in the file chooser.
    *
    * You should not modify the returned list model. Future changes to
    * @chooser
    *   may or may not affect the returned model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShortcutFolders(): ListModel /* None */ =
    new ListModel.Abstract(
      gtk_file_chooser_get_shortcut_folders(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileChooser]]
      ).asInstanceOf
    )
  end getShortcutFolders

  /** Removes a 'choice' that has been added with gtk_file_chooser_add_choice().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeChoice(
      id: String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    gtk_file_chooser_remove_choice(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileChooser]],
      summon[Runtime].inZone(toCString(id))
    )
  end removeChoice

  /** Removes @filter from the list of filters that the user can select between.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeFilter(
      filter: sn.gnome.gtk4.FileFilter /* Some(Ptr[GtkFileFilter]) */
  )(using Runtime): Unit /* None */ =
    gtk_file_chooser_remove_filter(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileChooser]],
      filter.getUnsafeRawPointer().asInstanceOf
    )
  end removeFilter

  /** Removes a folder from the shortcut folders in a file chooser.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeShortcutFolder(
      folder: File /* Some(Ptr[_root_.sn.gnome.gio.internal.GFile]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      gtk_file_chooser_remove_shortcut_folder(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileChooser]],
        folder.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end removeShortcutFolder

  /** Sets the type of operation that the chooser is performing.
    *
    * The user interface is adapted to suit the selected action.
    *
    * For example, an option to create a new folder might be shown if the action
    * is %GTK_FILE_CHOOSER_ACTION_SAVE but not if the action is
    * %GTK_FILE_CHOOSER_ACTION_OPEN.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAction(
      action: FileChooserAction /* Some(GtkFileChooserAction) */
  ): Unit /* None */ =
    gtk_file_chooser_set_action(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileChooser]],
      action.raw
    )
  end setAction

  /** Selects an option in a 'choice' that has been added with
    * gtk_file_chooser_add_choice().
    *
    * For a boolean choice, the possible options are "true" and "false".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setChoice(
      id: String /* Some(CString) */,
      option: String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    gtk_file_chooser_set_choice(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileChooser]],
      summon[Runtime].inZone(toCString(id)),
      summon[Runtime].inZone(toCString(option))
    )
  end setChoice

  /** Sets whether file chooser will offer to create new folders.
    *
    * This is only relevant if the action is not set to be
    * %GTK_FILE_CHOOSER_ACTION_OPEN.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCreateFolders(
      create_folders: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_file_chooser_set_create_folders(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileChooser]],
      gboolean(gint((if create_folders == true then 1 else 0)))
    )
  end setCreateFolders

  /** Sets the current folder for @chooser from a `GFile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCurrentFolder(
      file: Option[File /* Some(Ptr[_root_.sn.gnome.gio.internal.GFile]) */ ]
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      gtk_file_chooser_set_current_folder(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileChooser]],
        file
          .map[Ptr[_root_.sn.gnome.gio.internal.GFile]](o =>
            o.getUnsafeRawPointer().asInstanceOf
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GFile]]
          ),
        __errorPtr
      ).value.!=(0)
    )
  end setCurrentFolder

  /** Sets the current name in the file selector, as if entered by the user.
    *
    * Note that the name passed in here is a UTF-8 string rather than a
    * filename. This function is meant for such uses as a suggested name in a
    * “Save As...” dialog. You can pass “Untitled.doc” or a similarly suitable
    * suggestion for the @name.
    *
    * If you want to preselect a particular existing file, you should use
    * [method@Gtk.FileChooser.set_file] instead.
    *
    * Please see the documentation for those functions for an example of using
    * [method@Gtk.FileChooser.set_current_name] as well.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCurrentName(
      name: String /* Some(CString) */
  )(using Runtime): Unit /* None */ =
    gtk_file_chooser_set_current_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileChooser]],
      summon[Runtime].inZone(toCString(name))
    )
  end setCurrentName

  /** Sets @file as the current filename for the file chooser.
    *
    * This includes changing to the file’s parent folder and actually selecting
    * the file in list. If the @chooser is in %GTK_FILE_CHOOSER_ACTION_SAVE
    * mode, the file’s base name will also appear in the dialog’s file name
    * entry.
    *
    * If the file name isn’t in the current folder of @chooser, then the current
    * folder of @chooser will be changed to the folder containing @file.
    *
    * Note that the file must exist, or nothing will be done except for the
    * directory change.
    *
    * If you are implementing a save dialog, you should use this function if you
    * already have a file name to which the user may save; for example, when the
    * user opens an existing file and then does “Save As…”. If you don’t have a
    * file name already — for example, if the user just created a new file and
    * is saving it for the first time, do not call this function.
    *
    * Instead, use something similar to this:
    *
    * ```c
    * static void
    * prepare_file_chooser (GtkFileChooser *chooser,
    *                       GFile          *existing_file)
    * {
    *   gboolean document_is_new = (existing_file == NULL);
    *
    *   if (document_is_new)
    *     {
    *       GFile *default_file_for_saving = g_file_new_for_path ("./out.txt");
    *       // the user just created a new document
    *       gtk_file_chooser_set_current_folder (chooser, default_file_for_saving, NULL);
    *       gtk_file_chooser_set_current_name (chooser, "Untitled document");
    *       g_object_unref (default_file_for_saving);
    *     }
    *   else
    *     {
    *       // the user edited an existing document
    *       gtk_file_chooser_set_file (chooser, existing_file, NULL);
    *     }
    * }
    * ```
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFile(
      file: File /* Some(Ptr[_root_.sn.gnome.gio.internal.GFile]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      gtk_file_chooser_set_file(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileChooser]],
        file.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end setFile

  /** Sets the current filter.
    *
    * Only the files that pass the filter will be displayed. If the
    * user-selectable list of filters is non-empty, then the filter should be
    * one of the filters in that list.
    *
    * Setting the current filter when the list of filters is empty is useful if
    * you want to restrict the displayed set of files without letting the user
    * change it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFilter(
      filter: sn.gnome.gtk4.FileFilter /* Some(Ptr[GtkFileFilter]) */
  )(using Runtime): Unit /* None */ =
    gtk_file_chooser_set_filter(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileChooser]],
      filter.getUnsafeRawPointer().asInstanceOf
    )
  end setFilter

  /** Sets whether multiple files can be selected in the file chooser.
    *
    * This is only relevant if the action is set to be
    * %GTK_FILE_CHOOSER_ACTION_OPEN or %GTK_FILE_CHOOSER_ACTION_SELECT_FOLDER.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSelectMultiple(
      select_multiple: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_file_chooser_set_select_multiple(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFileChooser]],
      gboolean(gint((if select_multiple == true then 1 else 0)))
    )
  end setSelectMultiple

end FileChooser

object FileChooser:
  class Abstract(raw: Ptr[Byte]) extends FileChooser:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end FileChooser
