package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Display
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkMountOperation
import sn.gnome.gio.fluent.MountOperation as _MountOperation

/** `GtkMountOperation` is an implementation of `GMountOperation`.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MountOperation(raw: Ptr[GtkMountOperation])
    extends _MountOperation(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the display on which windows of the `GtkMountOperation` will be
    * shown.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDisplay(): Display /* None */ = new Display(
    gtk_mount_operation_get_display(
      this.raw.asInstanceOf[Ptr[GtkMountOperation]]
    ).asInstanceOf
  )

  /** Gets the transient parent used by the `GtkMountOperation`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getParent(): Window /* None */ = new Window(
    gtk_mount_operation_get_parent(
      this.raw.asInstanceOf[Ptr[GtkMountOperation]]
    ).asInstanceOf
  )

  /** Returns whether the `GtkMountOperation` is currently displaying a window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isShowing(): Boolean /* None */ = gtk_mount_operation_is_showing(
    this.raw.asInstanceOf[Ptr[GtkMountOperation]]
  ).value.!=(0)

  /** Sets the display to show windows of the `GtkMountOperation` on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDisplay(
      display: Display /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkDisplay]) */
  ): Unit /* None */ = gtk_mount_operation_set_display(
    this.raw.asInstanceOf[Ptr[GtkMountOperation]],
    display.getUnsafeRawPointer().asInstanceOf
  )

  /** Sets the transient parent for windows shown by the `GtkMountOperation`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
  /** Creates a new `GtkMountOperation`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(parent: Option[Window /* Some(Ptr[GtkWindow]) */ ])(using
      Runtime
  ): MountOperation =
    val raw: Ptr[Byte] = gtk_mount_operation_new(
      parent
        .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWindow]])
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[MountOperation](raw, r => new MountOperation(r.asInstanceOf))
  end apply
end MountOperation
