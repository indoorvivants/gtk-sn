package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Permission
import sn.gnome.gtk4.fluent.{
  Accessible,
  Actionable,
  Buildable,
  Button,
  ConstraintTarget
}
import sn.gnome.gtk4.internal.GtkLockButton

/** `GtkLockButton` is a widget to obtain and revoke authorizations needed to
  * operate the controls.
  *
  * ![An example GtkLockButton](lock-button.png)
  *
  * It is typically used in preference dialogs or control panels.
  *
  * The required authorization is represented by a `GPermission` object.
  * Concrete implementations of `GPermission` may use PolicyKit or some other
  * authorization framework. To obtain a PolicyKit-based `GPermission`, use
  * `polkit_permission_new()`.
  *
  * If the user is not currently allowed to perform the action, but can obtain
  * the permission, the widget looks like this:
  *
  * ![](lockbutton-locked.png)
  *
  * and the user can click the button to request the permission. Depending on
  * the platform, this may pop up an authentication dialog or ask the user to
  * authenticate in some other way. Once the user has obtained the permission,
  * the widget changes to this:
  *
  * ![](lockbutton-unlocked.png)
  *
  * and the permission can be dropped again by clicking the button. If the user
  * is not able to obtain the permission at all, the widget looks like this:
  *
  * ![](lockbutton-sorry.png)
  *
  * If the user has the permission and cannot drop it, the button is hidden.
  *
  * The text (and tooltips) that are shown in the various cases can be adjusted
  * with the [property@Gtk.LockButton:text-lock],
  * [property@Gtk.LockButton:text-unlock],
  * [property@Gtk.LockButton:tooltip-lock],
  * [property@Gtk.LockButton:tooltip-unlock] and
  * [property@Gtk.LockButton:tooltip-not-authorized] properties.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class LockButton(raw: Ptr[GtkLockButton])
    extends Button(raw.asInstanceOf),
      Accessible,
      Actionable,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Obtains the `GPermission` object that controls @button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPermission(): Permission /* None */ = new Permission(
    gtk_lock_button_get_permission(
      this.raw.asInstanceOf[Ptr[GtkLockButton]]
    ).asInstanceOf
  )

  /** Sets the `GPermission` object that controls @button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPermission(
      permission: Option[
        Permission /* Some(Ptr[_root_.sn.gnome.gio.internal.GPermission]) */
      ]
  ): Unit /* None */ = gtk_lock_button_set_permission(
    this.raw.asInstanceOf[Ptr[GtkLockButton]],
    permission
      .map[Ptr[_root_.sn.gnome.gio.internal.GPermission]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GPermission]]
      )
  )

end LockButton

object LockButton:
  /** Creates a new lock button which reflects the @permission.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      permission: Option[
        Permission /* Some(Ptr[_root_.sn.gnome.gio.internal.GPermission]) */
      ]
  ): LockButton = new LockButton(
    gtk_lock_button_new(
      permission
        .map[Ptr[_root_.sn.gnome.gio.internal.GPermission]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GPermission]]
        )
    ).asInstanceOf
  )
end LockButton
