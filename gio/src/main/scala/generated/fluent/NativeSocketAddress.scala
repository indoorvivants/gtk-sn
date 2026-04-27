package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.SocketAddress
import sn.gnome.gio.fluent.SocketConnectable
import sn.gnome.gio.internal.GNativeSocketAddress
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.gsize

class NativeSocketAddress(raw: Ptr[GNativeSocketAddress])
    extends SocketAddress(raw.asInstanceOf),
      SocketConnectable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end NativeSocketAddress

object NativeSocketAddress:
  def apply(native: Ptr[Byte], len: CUnsignedLongInt): NativeSocketAddress =
    new NativeSocketAddress(
      g_native_socket_address_new(gpointer(native), gsize(len)).asInstanceOf
    )
end NativeSocketAddress
