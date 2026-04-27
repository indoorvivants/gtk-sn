package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.InetAddress
import sn.gnome.gio.fluent.InetAddressMask
import sn.gnome.gio.fluent.Initable
import sn.gnome.gio.internal.GInetAddressMask
import sn.gnome.gio.internal.GSocketFamily
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object

class InetAddressMask(raw: Ptr[GInetAddressMask])
    extends Object(raw.asInstanceOf),
      Initable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def equal(mask2: InetAddressMask): Boolean = g_inet_address_mask_equal(
    this.raw.asInstanceOf,
    mask2.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  def getAddress(): InetAddress = new InetAddress(
    g_inet_address_mask_get_address(this.raw.asInstanceOf).asInstanceOf
  )

  def getFamily(): GSocketFamily = g_inet_address_mask_get_family(
    this.raw.asInstanceOf
  )

  def getLength(): UInt = g_inet_address_mask_get_length(
    this.raw.asInstanceOf
  ).value

  def matches(address: InetAddress): Boolean = g_inet_address_mask_matches(
    this.raw.asInstanceOf,
    address.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  def toString()(using Zone): String = fromCString(
    g_inet_address_mask_to_string(this.raw.asInstanceOf).asInstanceOf
  )

end InetAddressMask

object InetAddressMask:
  def apply(addr: InetAddress, length: UInt): GResult[InetAddressMask] =
    GResult.wrap(__errorPtr =>
      new InetAddressMask(
        g_inet_address_mask_new(
          addr.getUnsafeRawPointer().asInstanceOf,
          guint(length),
          __errorPtr
        ).asInstanceOf
      )
    )
  def fromString(
      mask_string: String | CString
  )(using Zone): GResult[InetAddressMask] = GResult.wrap(__errorPtr =>
    new InetAddressMask(
      g_inet_address_mask_new_from_string(
        __sn_extract_string(mask_string).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).asInstanceOf
    )
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end InetAddressMask
