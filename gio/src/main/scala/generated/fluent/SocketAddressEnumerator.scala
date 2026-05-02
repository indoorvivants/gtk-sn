package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.SocketAddress
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GSocketAddressEnumerator
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GSocketAddressEnumerator is an enumerator type for #GSocketAddress
  * instances. It is returned by enumeration functions such as
  * g_socket_connectable_enumerate(), which returns a #GSocketAddressEnumerator
  * to list each #GSocketAddress which could be used to connect to that
  * #GSocketConnectable.
  *
  * Enumeration is typically a blocking operation, so the asynchronous methods
  * g_socket_address_enumerator_next_async() and
  * g_socket_address_enumerator_next_finish() should be used where possible.
  *
  * Each #GSocketAddressEnumerator can only be enumerated once. Once
  * g_socket_address_enumerator_next() has returned %NULL, further enumeration
  * with that #GSocketAddressEnumerator is not possible, and it can be unreffed.
  */
class SocketAddressEnumerator(raw: Ptr[GSocketAddressEnumerator])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the next #GSocketAddress from @enumerator. Note that this may
    * block for some amount of time. (Eg, a #GNetworkAddress may need to do a
    * DNS lookup before it can return an address.) Use
    * g_socket_address_enumerator_next_async() if you need to avoid blocking.
    *
    * If @enumerator is expected to yield addresses, but for some reason is
    * unable to (eg, because of a DNS error), then the first call to
    * g_socket_address_enumerator_next() will return an appropriate error in
    * *@error. However, if the first call to g_socket_address_enumerator_next()
    * succeeds, then any further internal errors (other than @cancellable being
    * triggered) will be ignored.
    */
  def next(
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[SocketAddress /* None */ ] = GResult.wrap(__errorPtr =>
    new SocketAddress(
      g_socket_address_enumerator_next(
        this.raw.asInstanceOf,
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).asInstanceOf
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asynchronously retrieves the next #GSocketAddress from @enumerator and
    * then calls @callback, which must call
    * g_socket_address_enumerator_next_finish() to get the result.
    *
    * It is an error to call this multiple times before the previous callback
    * has finished.
    */
  def nextAsync(
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ],
      callback: Option[GAsyncReadyCallback /* Some(GAsyncReadyCallback) */ ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ = g_socket_address_enumerator_next_async(
    this.raw.asInstanceOf,
    cancellable
      .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
    callback
      .map[GAsyncReadyCallback](o => o)
      .getOrElse(null.asInstanceOf[GAsyncReadyCallback]),
    user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the result of a completed call to
    * g_socket_address_enumerator_next_async(). See
    * g_socket_address_enumerator_next() for more information about error
    * handling.
    */
  def nextFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[SocketAddress /* None */ ] = GResult.wrap(__errorPtr =>
    new SocketAddress(
      g_socket_address_enumerator_next_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

end SocketAddressEnumerator
