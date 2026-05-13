package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{Accessible, Buildable, ConstraintTarget, Widget}
import sn.gnome.gtk4.internal.GtkWindowHandle

/** `GtkWindowHandle` is a titlebar area widget.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class WindowHandle private[gnome] (raw: Ptr[GtkWindowHandle])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the child widget of @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChild()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_window_handle_get_child(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWindowHandle]]
      ).asInstanceOf
    )
  end getChild

  /** Sets the child widget of @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setChild(child: Option[sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */ ])(
      using Runtime
  ): Unit /* None */ =
    gtk_window_handle_set_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWindowHandle]],
      child
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setChild

end WindowHandle

object WindowHandle:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkWindowHandle])(using Runtime) =
    summon[Runtime].getOrCreate[WindowHandle](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new WindowHandle(ptr)
    )

  /** Creates a new `GtkWindowHandle`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): WindowHandle =
    val raw: Ptr[Byte] = gtk_window_handle_new().asInstanceOf
    summon[Runtime].getOrCreate[WindowHandle](
      raw,
      r => WindowHandle.applyUnsafe(r.asInstanceOf)
    )
  end apply
end WindowHandle
