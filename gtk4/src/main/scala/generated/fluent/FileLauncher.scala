package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.File
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkFileLauncher

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkFileLauncher` object collects the arguments that are needed to open a
  * file with an application.
  *
  * Depending on system configuration, user preferences and available APIs, this
  * may or may not show an app chooser dialog or launch the default application
  * right away.
  *
  * The operation is started with the [method@Gtk.FileLauncher.launch] function.
  * This API follows the GIO async pattern, and the result can be obtained by
  * calling [method@Gtk.FileLauncher.launch_finish].
  *
  * To launch uris that don't represent files, use [class@Gtk.UriLauncher].
  */
class FileLauncher(raw: Ptr[GtkFileLauncher]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether to ask the user to choose an app for opening the file.
    */
  def getAlwaysAsk(): Boolean =
    gtk_file_launcher_get_always_ask(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the file that will be opened.
    */
  def getFile(): File = new File.Abstract(
    gtk_file_launcher_get_file(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Launch an application to open the file.
    *
    * This may present an app chooser dialog to the user.
    *
    * The @callback will be called when the operation is completed. It should
    * call [method@Gtk.FileLauncher.launch_finish] to obtain the result.
    */
  def launch(
      parent: Window,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = gtk_file_launcher_launch(
    this.raw.asInstanceOf,
    parent.getUnsafeRawPointer().asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes the [method@Gtk.FileLauncher.launch] call and returns the result.
    */
  def launchFinish(result: AsyncResult): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      gtk_file_launcher_launch_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Launch a file manager to show the file in its parent directory.
    *
    * This is only supported native files. It will fail if @file is e.g. a
    * http:// uri.
    *
    * The @callback will be called when the operation is completed. It should
    * call [method@Gtk.FileLauncher.open_containing_folder_finish] to obtain the
    * result.
    */
  def openContainingFolder(
      parent: Window,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = gtk_file_launcher_open_containing_folder(
    this.raw.asInstanceOf,
    parent.getUnsafeRawPointer().asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes the [method@Gtk.FileLauncher.open_containing_folder] call and
    * returns the result.
    */
  def openContainingFolderFinish(result: AsyncResult): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      gtk_file_launcher_open_containing_folder_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether to awlays ask the user to choose an app for opening the file.
    * If `FALSE`, the file might be opened with a default app or the previous
    * choice.
    */
  def setAlwaysAsk(always_ask: Boolean): Unit =
    gtk_file_launcher_set_always_ask(
      this.raw.asInstanceOf,
      gboolean(gint((if always_ask == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the file that will be opened.
    */
  def setFile(file: File): Unit = gtk_file_launcher_set_file(
    this.raw.asInstanceOf,
    file.getUnsafeRawPointer().asInstanceOf
  )

end FileLauncher

object FileLauncher:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkFileLauncher` object.
    */
  def apply(file: File): FileLauncher = new FileLauncher(
    gtk_file_launcher_new(file.getUnsafeRawPointer().asInstanceOf).asInstanceOf
  )
end FileLauncher
