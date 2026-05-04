package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.{Accessible, Buildable, ConstraintTarget, Widget}
import sn.gnome.gtk4.internal.GtkWindowHandle

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkWindowHandle` is a titlebar area widget.
  *
  * When added into a window, it can be dragged to move the window, and handles
  * right click, double click and middle click as expected of a titlebar.
  *
  * # CSS nodes
  *
  * `GtkWindowHandle` has a single CSS node with the name `windowhandle`.
  *
  * # Accessibility
  *
  * Until GTK 4.10, `GtkWindowHandle` used the `GTK_ACCESSIBLE_ROLE_GROUP` role.
  *
  * Starting from GTK 4.12, `GtkWindowHandle` uses the
  * `GTK_ACCESSIBLE_ROLE_GENERIC` role.
  */
class WindowHandle(raw: Ptr[GtkWindowHandle])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the child widget of @self.
    */
  def getChild(): Widget /* None */ = new Widget(
    gtk_window_handle_get_child(
      this.raw.asInstanceOf[Ptr[GtkWindowHandle]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the child widget of @self.
    */
  def setChild(
      child: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_window_handle_set_child(
    this.raw.asInstanceOf[Ptr[GtkWindowHandle]],
    child
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

end WindowHandle

object WindowHandle:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkWindowHandle`.
    */
  def apply(): WindowHandle = new WindowHandle(
    gtk_window_handle_new().asInstanceOf
  )
end WindowHandle
