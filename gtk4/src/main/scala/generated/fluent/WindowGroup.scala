package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkWindowGroup

/** `GtkWindowGroup` makes group of windows behave like separate applications.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class WindowGroup(raw: Ptr[GtkWindowGroup]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds a window to a `GtkWindowGroup`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addWindow(window: Window /* Some(Ptr[GtkWindow]) */ ): Unit /* None */ =
    gtk_window_group_add_window(
      this.raw.asInstanceOf[Ptr[GtkWindowGroup]],
      window.getUnsafeRawPointer().asInstanceOf
    )

  /** Returns a list of the `GtkWindows` that belong to @window_group.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method list_windows/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(Window))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def listWindows__ = ???

  /** Removes a window from a `GtkWindowGroup`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeWindow(
      window: Window /* Some(Ptr[GtkWindow]) */
  ): Unit /* None */ = gtk_window_group_remove_window(
    this.raw.asInstanceOf[Ptr[GtkWindowGroup]],
    window.getUnsafeRawPointer().asInstanceOf
  )

end WindowGroup

object WindowGroup:
  /** Creates a new `GtkWindowGroup` object.
    *
    * Modality of windows only affects windows within the same `GtkWindowGroup`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): WindowGroup =
    val raw: Ptr[Byte] = gtk_window_group_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[WindowGroup](raw, r => new WindowGroup(r.asInstanceOf))
  end apply
end WindowGroup
