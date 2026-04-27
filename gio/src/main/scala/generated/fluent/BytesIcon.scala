package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Icon
import sn.gnome.gio.fluent.LoadableIcon
import sn.gnome.gio.internal.GBytesIcon
import sn.gnome.glib.internal.GBytes
import sn.gnome.gobject.fluent.Object

class BytesIcon(raw: Ptr[GBytesIcon])
    extends Object(raw.asInstanceOf),
      Icon,
      LoadableIcon:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getBytes(): Ptr[GBytes] = g_bytes_icon_get_bytes(this.raw.asInstanceOf)

end BytesIcon

object BytesIcon:
  def apply(bytes: Ptr[GBytes]): BytesIcon = new BytesIcon(
    g_bytes_icon_new(bytes).asInstanceOf
  )
end BytesIcon
