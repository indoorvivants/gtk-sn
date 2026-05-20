package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.{InetAddress, InetAddressMask, Initable, SocketFamily}
import sn.gnome.gio.internal.GInetAddressMask
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.{gboolean, gchar, gint, guint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/** #GInetAddressMask represents a range of IPv4 or IPv6 addresses described by
  * a base address and a length indicating how many bits of the base address are
  * relevant for matching purposes. These are often given in string form. Eg,
  * "10.0.0.0/8", or "fe80::/10".
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class InetAddressMask private[gnome] (raw: Ptr[GInetAddressMask])
    extends Object(raw.asInstanceOf),
      Initable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Tests if @mask and @mask2 are the same mask.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def equal(
      mask2: sn.gnome.gio.InetAddressMask /* Some(Ptr[GInetAddressMask]) */
  )(using Runtime): Boolean /* None */ =
    g_inet_address_mask_equal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GInetAddressMask]],
      mask2.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end equal

  /** Gets @mask's base address
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAddress()(using Runtime): sn.gnome.gio.InetAddress /* None */ =
    sn.gnome.gio.InetAddress.applyUnsafe(
      g_inet_address_mask_get_address(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GInetAddressMask]]
      ).asInstanceOf
    )
  end getAddress

  /** Gets the #GSocketFamily of @mask's address
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFamily(): sn.gnome.gio.SocketFamily /* None */ =
    sn.gnome.gio.SocketFamily.fromRaw(
      g_inet_address_mask_get_family(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GInetAddressMask]]
      )
    )
  end getFamily

  /** Gets @mask's length
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLength(): UInt /* None */ =
    g_inet_address_mask_get_length(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GInetAddressMask]]
    ).value
  end getLength

  /** Tests if @address falls within the range described by @mask.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def matches(
      address: sn.gnome.gio.InetAddress /* Some(Ptr[GInetAddress]) */
  )(using Runtime): Boolean /* None */ =
    g_inet_address_mask_matches(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GInetAddressMask]],
      address.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end matches

  /** Converts @mask back to its corresponding string form.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toString()(using Zone): scala.Predef.String /* None */ =
    fromCString(
      g_inet_address_mask_to_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GInetAddressMask]]
      ).asInstanceOf
    )
  end toString

end InetAddressMask

object InetAddressMask:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GInetAddressMask])(using Runtime) =
    summon[Runtime].getOrCreate[InetAddressMask](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new InetAddressMask(ptr)
    )

  /** Creates a new #GInetAddressMask representing all addresses whose first @length
    * bits match @addr.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      addr: sn.gnome.gio.InetAddress /* Some(Ptr[GInetAddress]) */,
      length: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  )(using Runtime): GResult[InetAddressMask] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] = g_inet_address_mask_new(
        addr.getUnsafeRawPointer().asInstanceOf,
        guint(length),
        __errorPtr
      ).asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime].getOrCreate[InetAddressMask](
          raw,
          r => InetAddressMask.applyUnsafe(r.asInstanceOf)
        )

  end apply

  /** Parses @mask_string as an IP address and (optional) length, and creates a
    * new #GInetAddressMask. The length, if present, is delimited by a "/". If
    * it is not present, then the length is assumed to be the full length of the
    * address.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromString(
      mask_string: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Runtime): GResult[InetAddressMask] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] = g_inet_address_mask_new_from_string(
        summon[Runtime].inZone(toCString(mask_string)).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime].getOrCreate[InetAddressMask](
          raw,
          r => InetAddressMask.applyUnsafe(r.asInstanceOf)
        )

  end fromString
end InetAddressMask
