package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.SocketAddressEnumerator
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.runtime.*

trait SocketConnectable:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Creates a #GSocketAddressEnumerator for @connectable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def enumerate()(using
      Runtime
  ): sn.gnome.gio.fluent.SocketAddressEnumerator /* None */ =
    sn.gnome.gio.fluent.SocketAddressEnumerator.applyUnsafe(
      g_socket_connectable_enumerate(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketConnectable]]
      ).asInstanceOf
    )
  end enumerate

  /** Creates a #GSocketAddressEnumerator for @connectable that will return a
    * #GProxyAddress for each of its addresses that you must connect to via a
    * proxy.
    *
    * If @connectable does not implement g_socket_connectable_proxy_enumerate(),
    * this will fall back to calling g_socket_connectable_enumerate().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def proxyEnumerate()(using
      Runtime
  ): sn.gnome.gio.fluent.SocketAddressEnumerator /* None */ =
    sn.gnome.gio.fluent.SocketAddressEnumerator.applyUnsafe(
      g_socket_connectable_proxy_enumerate(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketConnectable]]
      ).asInstanceOf
    )
  end proxyEnumerate

  /** Format a #GSocketConnectable as a string. This is a human-readable format
    * for use in debugging output, and is not a stable serialization format. It
    * is not suitable for use in user interfaces as it exposes too much
    * information for a user.
    *
    * If the #GSocketConnectable implementation does not support string
    * formatting, the implementation’s type name will be returned as a fallback.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toString()(using Zone): String /* None */ =
    fromCString(
      g_socket_connectable_to_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSocketConnectable]]
      ).asInstanceOf
    )
  end toString

end SocketConnectable

object SocketConnectable:
  class Abstract(raw: Ptr[Byte]) extends SocketConnectable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end SocketConnectable
