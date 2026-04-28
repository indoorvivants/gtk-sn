package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Permission
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Actionable
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.Button
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.internal.GtkLockButton

class LockButton(raw: Ptr[GtkLockButton])
    extends Button(raw.asInstanceOf),
      Accessible,
      Actionable,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getPermission(): Permission = new Permission(
    gtk_lock_button_get_permission(this.raw.asInstanceOf).asInstanceOf
  )

  def setPermission(permission: Permission): Unit =
    gtk_lock_button_set_permission(
      this.raw.asInstanceOf,
      permission.getUnsafeRawPointer().asInstanceOf
    )

end LockButton

object LockButton:
  def apply(permission: Permission): LockButton = new LockButton(
    gtk_lock_button_new(
      permission.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end LockButton
