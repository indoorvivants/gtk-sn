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

class FileLauncher(raw: Ptr[GtkFileLauncher]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAlwaysAsk(): Boolean =
    gtk_file_launcher_get_always_ask(this.raw.asInstanceOf).value.!=(0)

  def getFile(): File = new File.Abstract(
    gtk_file_launcher_get_file(this.raw.asInstanceOf).asInstanceOf
  )

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

  def launchFinish(result: AsyncResult): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      gtk_file_launcher_launch_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

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

  def openContainingFolderFinish(result: AsyncResult): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      gtk_file_launcher_open_containing_folder_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def setAlwaysAsk(always_ask: Boolean): Unit =
    gtk_file_launcher_set_always_ask(
      this.raw.asInstanceOf,
      gboolean(gint((if always_ask == true then 1 else 0)))
    )

  def setFile(file: File): Unit = gtk_file_launcher_set_file(
    this.raw.asInstanceOf,
    file.getUnsafeRawPointer().asInstanceOf
  )

end FileLauncher

object FileLauncher:
  def apply(file: File): FileLauncher = new FileLauncher(
    gtk_file_launcher_new(file.getUnsafeRawPointer().asInstanceOf).asInstanceOf
  )
end FileLauncher
