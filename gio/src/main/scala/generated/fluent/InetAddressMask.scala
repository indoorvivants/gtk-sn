package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.{
  InetAddress,
  InetAddressMask,
  Initable,
  SocketFamily
}
import sn.gnome.gio.internal.GInetAddressMask
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gchar, gint, guint}
import sn.gnome.gobject.fluent.Object

/** #GInetAddressMask represents a range of IPv4 or IPv6 addresses described by
  * a base address and a length indicating how many bits of the base address are
  * relevant for matching purposes. These are often given in string form. Eg,
  * "10.0.0.0/8", or "fe80::/10".
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class InetAddressMask(raw: Ptr[GInetAddressMask])
    extends Object(raw.asInstanceOf),
      Initable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Tests if @mask and @mask2 are the same mask.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def equal(
      mask2: InetAddressMask /* Some(Ptr[GInetAddressMask]) */
  ): Boolean /* None */ = g_inet_address_mask_equal(
    this.raw.asInstanceOf[Ptr[GInetAddressMask]],
    mask2.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  /** Gets @mask's base address
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAddress(): InetAddress /* None */ = new InetAddress(
    g_inet_address_mask_get_address(
      this.raw.asInstanceOf[Ptr[GInetAddressMask]]
    ).asInstanceOf
  )

  /** Gets the #GSocketFamily of @mask's address
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFamily(): SocketFamily /* None */ = SocketFamily.fromRaw(
    g_inet_address_mask_get_family(this.raw.asInstanceOf[Ptr[GInetAddressMask]])
  )

  /** Gets @mask's length
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLength(): UInt /* None */ = g_inet_address_mask_get_length(
    this.raw.asInstanceOf[Ptr[GInetAddressMask]]
  ).value

  /** Tests if @address falls within the range described by @mask.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def matches(
      address: InetAddress /* Some(Ptr[GInetAddress]) */
  ): Boolean /* None */ = g_inet_address_mask_matches(
    this.raw.asInstanceOf[Ptr[GInetAddressMask]],
    address.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  /** Converts @mask back to its corresponding string form.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toString()(using Zone): String /* None */ = fromCString(
    g_inet_address_mask_to_string(
      this.raw.asInstanceOf[Ptr[GInetAddressMask]]
    ).asInstanceOf
  )

end InetAddressMask

object InetAddressMask:
  /** Creates a new #GInetAddressMask representing all addresses whose first @length
    * bits match @addr.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      addr: InetAddress /* Some(Ptr[GInetAddress]) */,
      length: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): GResult[InetAddressMask] = GResult.wrap(__errorPtr =>
    new InetAddressMask(
      g_inet_address_mask_new(
        addr.getUnsafeRawPointer().asInstanceOf,
        guint(length),
        __errorPtr
      ).asInstanceOf
    )
  )

  /** Parses @mask_string as an IP address and (optional) length, and creates a
    * new #GInetAddressMask. The length, if present, is delimited by a "/". If
    * it is not present, then the length is assumed to be the full length of the
    * address.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromString(
      mask_string: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
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
