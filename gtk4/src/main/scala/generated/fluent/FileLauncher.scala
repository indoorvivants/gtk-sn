package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{AsyncResult, File}
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object
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
  def getAlwaysAsk(): Boolean /* None */ = gtk_file_launcher_get_always_ask(
    this.raw.asInstanceOf[Ptr[GtkFileLauncher]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the file that will be opened.
    */
  def getFile(): File /* None */ = new File.Abstract(
    gtk_file_launcher_get_file(
      this.raw.asInstanceOf[Ptr[GtkFileLauncher]]
    ).asInstanceOf
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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  def launch__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes the [method@Gtk.FileLauncher.launch] call and returns the result.
    */
  def launchFinish(
      result: AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    gtk_file_launcher_launch_finish(
      this.raw.asInstanceOf[Ptr[GtkFileLauncher]],
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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  def openContainingFolder__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes the [method@Gtk.FileLauncher.open_containing_folder] call and
    * returns the result.
    */
  def openContainingFolderFinish(
      result: AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    gtk_file_launcher_open_containing_folder_finish(
      this.raw.asInstanceOf[Ptr[GtkFileLauncher]],
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
  def setAlwaysAsk(
      always_ask: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_file_launcher_set_always_ask(
    this.raw.asInstanceOf[Ptr[GtkFileLauncher]],
    gboolean(gint((if always_ask == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the file that will be opened.
    */
  def setFile(
      file: Option[File /* Some(Ptr[_root_.sn.gnome.gio.internal.GFile]) */ ]
  ): Unit /* None */ = gtk_file_launcher_set_file(
    this.raw.asInstanceOf[Ptr[GtkFileLauncher]],
    file
      .map[Ptr[_root_.sn.gnome.gio.internal.GFile]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GFile]])
  )

end FileLauncher

object FileLauncher:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkFileLauncher` object.
    */
  def apply(
      file: Option[File /* Some(Ptr[_root_.sn.gnome.gio.internal.GFile]) */ ]
  ): FileLauncher = new FileLauncher(
    gtk_file_launcher_new(
      file
        .map[Ptr[_root_.sn.gnome.gio.internal.GFile]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GFile]])
    ).asInstanceOf
  )
end FileLauncher
