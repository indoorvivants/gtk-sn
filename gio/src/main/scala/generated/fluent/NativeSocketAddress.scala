package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.SocketAddress
import sn.gnome.gio.fluent.SocketConnectable
import sn.gnome.gio.internal.GNativeSocketAddress
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.gsize

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A socket address of some unknown native type.
  */
class NativeSocketAddress(raw: Ptr[GNativeSocketAddress])
    extends SocketAddress(raw.asInstanceOf),
      SocketConnectable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end NativeSocketAddress

object NativeSocketAddress:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GNativeSocketAddress for @native and @len.
    */
  def apply(
      native: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      len: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gsize) */
  ): NativeSocketAddress = new NativeSocketAddress(
    g_native_socket_address_new(
      native
        .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
      gsize(len)
    ).asInstanceOf
  )
end NativeSocketAddress
