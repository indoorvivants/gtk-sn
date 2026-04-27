package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Permission
import sn.gnome.gio.internal.GSimplePermission
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint

class SimplePermission(raw: Ptr[GSimplePermission])
    extends Permission(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end SimplePermission

object SimplePermission:
  def apply(allowed: Boolean): SimplePermission = new SimplePermission(
    g_simple_permission_new(
      gboolean(gint((if allowed == true then 1 else 0)))
    ).asInstanceOf
  )
end SimplePermission
