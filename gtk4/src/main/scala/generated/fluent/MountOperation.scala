package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Display
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkMountOperation
import sn.gnome.gio.fluent.MountOperation as _MountOperation

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkMountOperation` is an implementation of `GMountOperation`.
  *
  * The functions and objects described here make working with GTK and GIO more
  * convenient.
  *
  * `GtkMountOperation` is needed when mounting volumes: It is an implementation
  * of `GMountOperation` that can be used with GIO functions for mounting
  * volumes such as g_file_mount_enclosing_volume(), g_file_mount_mountable(),
  * g_volume_mount(), g_mount_unmount_with_operation() and others.
  *
  * When necessary, `GtkMountOperation` shows dialogs to let the user enter
  * passwords, ask questions or show processes blocking unmount.
  */
class MountOperation(raw: Ptr[GtkMountOperation])
    extends _MountOperation(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the display on which windows of the `GtkMountOperation` will be
    * shown.
    */
  def getDisplay(): Display /* None */ = new Display(
    gtk_mount_operation_get_display(
      this.raw.asInstanceOf[Ptr[GtkMountOperation]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the transient parent used by the `GtkMountOperation`.
    */
  def getParent(): Window /* None */ = new Window(
    gtk_mount_operation_get_parent(
      this.raw.asInstanceOf[Ptr[GtkMountOperation]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the `GtkMountOperation` is currently displaying a window.
    */
  def isShowing(): Boolean /* None */ = gtk_mount_operation_is_showing(
    this.raw.asInstanceOf[Ptr[GtkMountOperation]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the display to show windows of the `GtkMountOperation` on.
    */
  def setDisplay(
      display: Display /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkDisplay]) */
  ): Unit /* None */ = gtk_mount_operation_set_display(
    this.raw.asInstanceOf[Ptr[GtkMountOperation]],
    display.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the transient parent for windows shown by the `GtkMountOperation`.
    */
  def setParent(
      parent: Option[Window /* Some(Ptr[GtkWindow]) */ ]
  ): Unit /* None */ = gtk_mount_operation_set_parent(
    this.raw.asInstanceOf[Ptr[GtkMountOperation]],
    parent
      .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWindow]])
  )

end MountOperation

object MountOperation:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkMountOperation`.
    */
  def apply(
      parent: Option[Window /* Some(Ptr[GtkWindow]) */ ]
  ): MountOperation = new MountOperation(
    gtk_mount_operation_new(
      parent
        .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWindow]])
    ).asInstanceOf
  )
end MountOperation
