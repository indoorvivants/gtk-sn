package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.SocketConnectable
import sn.gnome.gio.internal.GNetworkService
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*

/** Like #GNetworkAddress does with hostnames, #GNetworkService provides an easy
  * way to resolve a SRV record, and then attempt to connect to one of the hosts
  * that implements that service, handling service priority/weighting, multiple
  * IP addresses, and multiple address families.
  *
  * See #GSrvTarget for more information about SRV records, and see
  * #GSocketConnectable for an example of using the connectable interface.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class NetworkService private[gnome] (raw: Ptr[GNetworkService])
    extends Object(raw.asInstanceOf),
      SocketConnectable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the domain that @srv serves. This might be either UTF-8 or
    * ASCII-encoded, depending on what @srv was created with.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDomain()(using Zone): String /* None */ =
    fromCString(
      g_network_service_get_domain(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GNetworkService]]
      ).asInstanceOf
    )
  end getDomain

  /** Gets @srv's protocol name (eg, "tcp").
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getProtocol()(using Zone): String /* None */ =
    fromCString(
      g_network_service_get_protocol(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GNetworkService]]
      ).asInstanceOf
    )
  end getProtocol

  /** Gets the URI scheme used to resolve proxies. By default, the service name
    * is used as scheme.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getScheme()(using Zone): String /* None */ =
    fromCString(
      g_network_service_get_scheme(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GNetworkService]]
      ).asInstanceOf
    )
  end getScheme

  /** Gets @srv's service name (eg, "ldap").
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getService()(using Zone): String /* None */ =
    fromCString(
      g_network_service_get_service(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GNetworkService]]
      ).asInstanceOf
    )
  end getService

  /** Set's the URI scheme used to resolve proxies. By default, the service name
    * is used as scheme.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setScheme(
      scheme: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ =
    g_network_service_set_scheme(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GNetworkService]],
      toCString(scheme).asInstanceOf[Ptr[gchar]]
    )
  end setScheme

end NetworkService

object NetworkService:
  def applyUnsafe(ptr: Ptr[GNetworkService])(using Runtime) =
    summon[Runtime].getOrCreate[NetworkService](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new NetworkService(ptr)
    )

  /** Creates a new #GNetworkService representing the given @service,
    * @protocol,
    *   and @domain. This will initially be unresolved; use the
    *   #GSocketConnectable interface to resolve it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      service: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      protocol: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      domain: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone, Runtime): NetworkService =
    val raw: Ptr[Byte] = g_network_service_new(
      toCString(service).asInstanceOf[Ptr[gchar]],
      toCString(protocol).asInstanceOf[Ptr[gchar]],
      toCString(domain).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
    summon[Runtime].getOrCreate[NetworkService](
      raw,
      r => NetworkService.applyUnsafe(r.asInstanceOf)
    )
  end apply
end NetworkService
