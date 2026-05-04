package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{Credentials, IOStream}
import sn.gnome.gio.internal.GDBusAuthObserver
import sn.gnome.glib.internal.{gboolean, gchar, gint}
import sn.gnome.gobject.fluent.Object

/**  COMMENT FOR THE ORIGINAL C DEFINITION
  *
  *  The #GDBusAuthObserver type provides a mechanism for participating
  *  in how a #GDBusServer (or a #GDBusConnection) authenticates remote
  *  peers. Simply instantiate a #GDBusAuthObserver and connect to the
  *  signals you are interested in. Note that new signals may be added
  *  in the future
  *
  *  ## Controlling Authentication Mechanisms
  *
  *  By default, a #GDBusServer or server-side #GDBusConnection will allow
  *  any authentication mechanism to be used. If you only
  *  want to allow D-Bus connections with the `EXTERNAL` mechanism,
  *  which makes use of credentials passing and is the recommended
  *  mechanism for modern Unix platforms such as Linux and the BSD family,
  *  you would use a signal handler like this:
  *
  *  |[<!-- language="C" -->
  *  static gboolean
  *  on_allow_mechanism (GDBusAuthObserver *observer,
  *                      const gchar       *mechanism,
  *                      gpointer           user_data)
  *  {
  *    if (g_strcmp0 (mechanism, "EXTERNAL") == 0)
  *      {
  *        return TRUE;
  *      }
  *
  *    return FALSE;
  *  }
  *  ]|
  *
  *  ## Controlling Authorization # {#auth-observer}
  *
  *  By default, a #GDBusServer or server-side #GDBusConnection will accept
  *  connections from any successfully authenticated user (but not from
  *  anonymous connections using the `ANONYMOUS` mechanism). If you only
  *  want to allow D-Bus connections from processes owned by the same uid
  *  as the server, since GLib 2.68, you should use the
  *  %G_DBUS_SERVER_FLAGS_AUTHENTICATION_REQUIRE_SAME_USER flag. It’s equivalent
  *  to the following signal handler:
  *
  *  |[<!-- language="C" -->
  *  static gboolean
  *  on_authorize_authenticated_peer (GDBusAuthObserver *observer,
  *                                   GIOStream         *stream,
  *                                   GCredentials      *credentials,
  *                                   gpointer           user_data)
  *  {
  *    gboolean authorized;
  *
  *    authorized = FALSE;
  *    if (credentials != NULL)
  *      {
  *        GCredentials *own_credentials;
  *        own_credentials = g_credentials_new ();
  *        if (g_credentials_is_same_user (credentials, own_credentials, NULL))
  *          authorized = TRUE;
  *        g_object_unref (own_credentials);
  *      }
  *
  *    return authorized;
  *  }
  *  ]|
  */
class DBusAuthObserver(raw: Ptr[GDBusAuthObserver])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Emits the #GDBusAuthObserver::allow-mechanism signal on @observer.
    */
  def allowMechanism(
      mechanism: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* None */ = g_dbus_auth_observer_allow_mechanism(
    this.raw.asInstanceOf[Ptr[GDBusAuthObserver]],
    __sn_extract_string(mechanism).asInstanceOf[Ptr[gchar]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Emits the #GDBusAuthObserver::authorize-authenticated-peer signal on @observer.
    */
  def authorizeAuthenticatedPeer(
      stream: IOStream /* Some(Ptr[GIOStream]) */,
      credentials: Option[Credentials /* Some(Ptr[GCredentials]) */ ]
  ): Boolean /* None */ = g_dbus_auth_observer_authorize_authenticated_peer(
    this.raw.asInstanceOf[Ptr[GDBusAuthObserver]],
    stream.getUnsafeRawPointer().asInstanceOf,
    credentials
      .map[Ptr[GCredentials]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GCredentials]])
  ).value.!=(0)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DBusAuthObserver

object DBusAuthObserver:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GDBusAuthObserver object.
    */
  def apply(): DBusAuthObserver = new DBusAuthObserver(
    g_dbus_auth_observer_new().asInstanceOf
  )
end DBusAuthObserver
