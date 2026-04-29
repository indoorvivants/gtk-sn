package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GList
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkWindowGroup

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkWindowGroup` makes group of windows behave like separate applications.
  *
  * It achieves this by limiting the effect of GTK grabs and modality to windows
  * in the same group.
  *
  * A window can be a member in at most one window group at a time. Windows that
  * have not been explicitly assigned to a group are implicitly treated like
  * windows of the default window group.
  *
  * `GtkWindowGroup` objects are referenced by each window in the group, so once
  * you have added all windows to a `GtkWindowGroup`, you can drop the initial
  * reference to the window group with g_object_unref(). If the windows in the
  * window group are subsequently destroyed, then they will be removed from the
  * window group and drop their references on the window group; when all window
  * have been removed, the window group will be freed.
  */
class WindowGroup(raw: Ptr[GtkWindowGroup]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a window to a `GtkWindowGroup`.
    */
  def addWindow(window: Window): Unit = gtk_window_group_add_window(
    this.raw.asInstanceOf,
    window.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns a list of the `GtkWindows` that belong to @window_group.
    */
  def listWindows(): Ptr[GList] = gtk_window_group_list_windows(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes a window from a `GtkWindowGroup`.
    */
  def removeWindow(window: Window): Unit = gtk_window_group_remove_window(
    this.raw.asInstanceOf,
    window.getUnsafeRawPointer().asInstanceOf
  )

end WindowGroup

object WindowGroup:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkWindowGroup` object.
    *
    * Modality of windows only affects windows within the same `GtkWindowGroup`.
    */
  def apply(): WindowGroup = new WindowGroup(
    gtk_window_group_new().asInstanceOf
  )
end WindowGroup
