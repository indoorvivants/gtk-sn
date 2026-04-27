package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.SocketAddress
import sn.gnome.gio.fluent.SocketConnectable
import sn.gnome.gio.internal.GUnixSocketAddress
import sn.gnome.gio.internal.GUnixSocketAddressType
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gsize

class UnixSocketAddress(raw: Ptr[GUnixSocketAddress])
    extends SocketAddress(raw.asInstanceOf),
      SocketConnectable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAddressType(): GUnixSocketAddressType =
    g_unix_socket_address_get_address_type(this.raw.asInstanceOf)

  def getIsAbstract(): Boolean =
    g_unix_socket_address_get_is_abstract(this.raw.asInstanceOf).value.!=(0)

  def getPath()(using Zone): String = fromCString(
    g_unix_socket_address_get_path(this.raw.asInstanceOf).asInstanceOf
  )

  def getPathLen(): CUnsignedLongInt = g_unix_socket_address_get_path_len(
    this.raw.asInstanceOf
  ).value

end UnixSocketAddress

object UnixSocketAddress:
  def apply(path: String | CString)(using Zone): UnixSocketAddress =
    new UnixSocketAddress(
      g_unix_socket_address_new(
        __sn_extract_string(path).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end UnixSocketAddress
