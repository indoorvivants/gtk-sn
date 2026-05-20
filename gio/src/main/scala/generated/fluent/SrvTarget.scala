package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.SrvTarget
import sn.gnome.gio.internal.GSrvTarget
import sn.gnome.glib.internal.{gchar, guint16}

/** SRV (service) records are used by some network protocols to provide
  * service-specific aliasing and load-balancing. For example, XMPP (Jabber)
  * uses SRV records to locate the XMPP server for a domain; rather than
  * connecting directly to "example.com" or assuming a specific server hostname
  * like "xmpp.example.com", an XMPP client would look up the "xmpp-client" SRV
  * record for "example.com", and then connect to whatever host was pointed to
  * by that record.
  *
  * You can use g_resolver_lookup_service() or g_resolver_lookup_service_async()
  * to find the #GSrvTargets for a given service. However, if you are simply
  * planning to connect to the remote service, you can use #GNetworkService's
  * #GSocketConnectable interface and not need to worry about #GSrvTarget at
  * all.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SrvTarget private[gnome] (raw: Ptr[GSrvTarget]):

  def getUnsafeRawPointer(): Ptr[GSrvTarget] = this.raw

  /** Copies @target
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.gio.SrvTarget /* None */ =
    sn.gnome.gio.SrvTarget.fromRaw(
      g_srv_target_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSrvTarget]]
      )
    )
  end copy

  /** Frees @target
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    g_srv_target_free(this.getUnsafeRawPointer().asInstanceOf[Ptr[GSrvTarget]])
  end free

  /** Gets @target's hostname (in ASCII form; if you are going to present this
    * to the user, you should use g_hostname_is_ascii_encoded() to check if it
    * contains encoded Unicode segments, and use g_hostname_to_unicode() to
    * convert it if it does.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHostname(): scala.Predef.String /* None */ =
    fromCString(
      g_srv_target_get_hostname(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSrvTarget]]
      ).asInstanceOf
    )
  end getHostname

  /** Gets @target's port
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPort(): UShort /* None */ =
    g_srv_target_get_port(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSrvTarget]]
    ).value
  end getPort

  /** Gets @target's priority. You should not need to look at this; #GResolver
    * already sorts the targets according to the algorithm in RFC 2782.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPriority(): UShort /* None */ =
    g_srv_target_get_priority(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSrvTarget]]
    ).value
  end getPriority

  /** Gets @target's weight. You should not need to look at this; #GResolver
    * already sorts the targets according to the algorithm in RFC 2782.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWeight(): UShort /* None */ =
    g_srv_target_get_weight(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSrvTarget]]
    ).value
  end getWeight

end SrvTarget

object SrvTarget:
  def fromRaw(ptr: Ptr[GSrvTarget]): SrvTarget = new SrvTarget(ptr)
end SrvTarget
