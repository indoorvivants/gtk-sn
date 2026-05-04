package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Display
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.{Accessible, AccessibleRole}
import sn.gnome.gtk4.internal.GtkATContext

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkATContext` is an abstract class provided by GTK to communicate to
  * platform-specific assistive technologies API.
  *
  * Each platform supported by GTK implements a `GtkATContext` subclass, and is
  * responsible for updating the accessible state in response to state changes
  * in `GtkAccessible`.
  */
class ATContext(raw: Ptr[GtkATContext]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the `GtkAccessible` using this context.
    */
  def getAccessible(): Accessible /* None */ = new Accessible.Abstract(
    gtk_at_context_get_accessible(
      this.raw.asInstanceOf[Ptr[GtkATContext]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the accessible role of this context.
    */
  def getAccessibleRole(): AccessibleRole /* None */ = AccessibleRole.fromRaw(
    gtk_at_context_get_accessible_role(this.raw.asInstanceOf[Ptr[GtkATContext]])
  )

end ATContext

object ATContext:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkATContext` instance for the given accessible role,
    * accessible instance, and display connection.
    *
    * The `GtkATContext` implementation being instantiated will depend on the
    * platform.
    */
  def create(
      accessible_role: AccessibleRole /* Some(GtkAccessibleRole) */,
      accessible: Accessible /* Some(Ptr[GtkAccessible]) */,
      display: Display /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkDisplay]) */
  ): ATContext = new ATContext(
    gtk_at_context_create(
      accessible_role.raw,
      accessible.getUnsafeRawPointer().asInstanceOf,
      display.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end ATContext
