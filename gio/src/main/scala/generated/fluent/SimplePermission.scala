package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Permission
import sn.gnome.gio.internal.GSimplePermission
import sn.gnome.glib.internal.{gboolean, gint}

/** #GSimplePermission is a trivial implementation of #GPermission that
  * represents a permission that is either always or never allowed. The value is
  * given at construction and doesn't change.
  *
  * Calling request or release will result in errors.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SimplePermission(raw: Ptr[GSimplePermission])
    extends Permission(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end SimplePermission

object SimplePermission:
  /** Creates a new #GPermission instance that represents an action that is
    * either always or never allowed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      allowed: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): SimplePermission = new SimplePermission(
    g_simple_permission_new(
      gboolean(gint((if allowed == true then 1 else 0)))
    ).asInstanceOf
  )
end SimplePermission
