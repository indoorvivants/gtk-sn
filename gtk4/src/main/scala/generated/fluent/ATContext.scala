package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Display
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.internal.GtkATContext
import sn.gnome.gtk4.internal.GtkAccessibleRole

class ATContext(raw: Ptr[GtkATContext]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAccessible(): Accessible = new Accessible.Abstract(
    gtk_at_context_get_accessible(this.raw.asInstanceOf).asInstanceOf
  )

  def getAccessibleRole(): GtkAccessibleRole =
    gtk_at_context_get_accessible_role(this.raw.asInstanceOf)

end ATContext

object ATContext:
  def create(
      accessible_role: GtkAccessibleRole,
      accessible: Accessible,
      display: Display
  ): ATContext = new ATContext(
    gtk_at_context_create(
      accessible_role,
      accessible.getUnsafeRawPointer().asInstanceOf,
      display.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end ATContext
