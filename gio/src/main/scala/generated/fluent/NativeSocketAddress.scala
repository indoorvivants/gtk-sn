package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.{SocketAddress, SocketConnectable}
import sn.gnome.gio.internal.GNativeSocketAddress
import sn.gnome.glib.internal.{gpointer, gsize}
import sn.gnome.gobject.runtime.*

/** A socket address of some unknown native type.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class NativeSocketAddress(raw: Ptr[GNativeSocketAddress])
    extends SocketAddress(raw.asInstanceOf),
      SocketConnectable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end NativeSocketAddress

object NativeSocketAddress:
  /** Creates a new #GNativeSocketAddress for @native and @len.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      native: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      len: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gsize) */
  )(using Runtime): NativeSocketAddress =
    val raw: Ptr[Byte] = g_native_socket_address_new(
      native
        .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
      gsize(len)
    ).asInstanceOf
    summon[Runtime].getOrCreate[NativeSocketAddress](
      raw,
      r => new NativeSocketAddress(r.asInstanceOf)
    )
  end apply
end NativeSocketAddress
