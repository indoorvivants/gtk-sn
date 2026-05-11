package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{Credentials, IOStream}
import sn.gnome.gio.internal.{GCredentials, GDBusAuthObserver, GIOStream}
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/**  The #GDBusAuthObserver type provides a mechanism for participating
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
  *
  *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
  */
class DBusAuthObserver private[gnome] (raw: Ptr[GDBusAuthObserver])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Emits the #GDBusAuthObserver::allow-mechanism signal on @observer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def allowMechanism(
      mechanism: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Boolean /* None */ =
    g_dbus_auth_observer_allow_mechanism(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusAuthObserver]],
      toCString(mechanism).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)
  end allowMechanism

  /** Emits the #GDBusAuthObserver::authorize-authenticated-peer signal on @observer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def authorizeAuthenticatedPeer(
      stream: sn.gnome.gio.fluent.IOStream /* Some(Ptr[GIOStream]) */,
      credentials: Option[
        sn.gnome.gio.fluent.Credentials /* Some(Ptr[GCredentials]) */
      ]
  )(using Runtime): Boolean /* None */ =
    g_dbus_auth_observer_authorize_authenticated_peer(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusAuthObserver]],
      stream.getUnsafeRawPointer().asInstanceOf,
      credentials
        .map[Ptr[GCredentials]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCredentials]])
    ).value.!=(0)
  end authorizeAuthenticatedPeer

  /** Emitted to check if @mechanism is allowed to be used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onAllowMechanism(handler: ((mechanism: String)) => Boolean)(using
      Runtime
  ) =
    type SignalRegType =
      SignalRegistration[this.type, (mechanism: String), Boolean]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GDBusAuthObserver],
          mechanism: CString /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((mechanism = fromCString(mechanism)))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"allow-mechanism"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onAllowMechanism

  /** Emitted to check if a peer that is successfully authenticated is
    * authorized.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onAuthorizeAuthenticatedPeer(
      handler: ((stream: IOStream, credentials: Credentials)) => Boolean
  )(using Runtime) =
    type SignalRegType = SignalRegistration[
      this.type,
      (stream: IOStream, credentials: Credentials),
      Boolean
    ]
    val c_handler = CFuncPtr4.fromScalaFunction {
      (
          self: Ptr[GDBusAuthObserver],
          stream: Ptr[GIOStream] /* param */,
          credentials: Ptr[GCredentials] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (
            stream = sr.runtime.get[IOStream](stream.asInstanceOf[Ptr[Byte]]),
            credentials =
              sr.runtime.get[Credentials](credentials.asInstanceOf[Ptr[Byte]])
          )
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"authorize-authenticated-peer"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onAuthorizeAuthenticatedPeer
end DBusAuthObserver

object DBusAuthObserver:
  def applyUnsafe(ptr: Ptr[GDBusAuthObserver])(using Runtime) =
    summon[Runtime].getOrCreate[DBusAuthObserver](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new DBusAuthObserver(ptr)
    )

  /** Creates a new #GDBusAuthObserver object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): DBusAuthObserver =
    val raw: Ptr[Byte] = g_dbus_auth_observer_new().asInstanceOf
    summon[Runtime].getOrCreate[DBusAuthObserver](
      raw,
      r => DBusAuthObserver.applyUnsafe(r.asInstanceOf)
    )
  end apply
end DBusAuthObserver
