package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.TlsConnection
import sn.gnome.gio.fluent.TlsPassword
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GTlsCertificateRequestFlags
import sn.gnome.gio.internal.GTlsInteraction
import sn.gnome.gio.internal.GTlsInteractionResult
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GTlsInteraction provides a mechanism for the TLS connection and database
  * code to interact with the user. It can be used to ask the user for
  * passwords.
  *
  * To use a #GTlsInteraction with a TLS connection use
  * g_tls_connection_set_interaction().
  *
  * Callers should instantiate a derived class that implements the various
  * interaction methods to show the required dialogs.
  *
  * Callers should use the 'invoke' functions like
  * g_tls_interaction_invoke_ask_password() to run interaction methods. These
  * functions make sure that the interaction is invoked in the main loop and not
  * in the current thread, if the current thread is not running the main loop.
  *
  * Derived classes can choose to implement whichever interactions methods
  * they'd like to support by overriding those virtual methods in their class
  * initialization function. Any interactions not implemented will return
  * %G_TLS_INTERACTION_UNHANDLED. If a derived class implements an async method,
  * it must also implement the corresponding finish method.
  */
class TlsInteraction(raw: Ptr[GTlsInteraction])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Run synchronous interaction to ask the user for a password. In general,
    * g_tls_interaction_invoke_ask_password() should be used instead of this
    * function.
    *
    * Derived subclasses usually implement a password prompt, although they may
    * also choose to provide a password from elsewhere. The @password value will
    * be filled in and then @callback will be called. Alternatively the user may
    * abort this password request, which will usually abort the TLS connection.
    *
    * If the interaction is cancelled by the cancellation object, or by the user
    * then %G_TLS_INTERACTION_FAILED will be returned with an error that
    * contains a %G_IO_ERROR_CANCELLED error code. Certain implementations may
    * not support immediate cancellation.
    */
  def askPassword(
      password: TlsPassword /* Some(Ptr[GTlsPassword]) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[GTlsInteractionResult /* None */ ] = GResult.wrap(__errorPtr =>
    g_tls_interaction_ask_password(
      this.raw.asInstanceOf[Ptr[GTlsInteraction]],
      password.getUnsafeRawPointer().asInstanceOf,
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Run asynchronous interaction to ask the user for a password. In general,
    * g_tls_interaction_invoke_ask_password() should be used instead of this
    * function.
    *
    * Derived subclasses usually implement a password prompt, although they may
    * also choose to provide a password from elsewhere. The @password value will
    * be filled in and then @callback will be called. Alternatively the user may
    * abort this password request, which will usually abort the TLS connection.
    *
    * If the interaction is cancelled by the cancellation object, or by the user
    * then %G_TLS_INTERACTION_FAILED will be returned with an error that
    * contains a %G_IO_ERROR_CANCELLED error code. Certain implementations may
    * not support immediate cancellation.
    *
    * Certain implementations may not support immediate cancellation.
    */
  def askPasswordAsync(
      password: TlsPassword /* Some(Ptr[GTlsPassword]) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ],
      callback: Option[GAsyncReadyCallback /* Some(GAsyncReadyCallback) */ ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ = g_tls_interaction_ask_password_async(
    this.raw.asInstanceOf[Ptr[GTlsInteraction]],
    password.getUnsafeRawPointer().asInstanceOf,
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
    * Complete an ask password user interaction request. This should be once the
    * g_tls_interaction_ask_password_async() completion callback is called.
    *
    * If %G_TLS_INTERACTION_HANDLED is returned, then the #GTlsPassword passed
    * to g_tls_interaction_ask_password() will have its password filled in.
    *
    * If the interaction is cancelled by the cancellation object, or by the user
    * then %G_TLS_INTERACTION_FAILED will be returned with an error that
    * contains a %G_IO_ERROR_CANCELLED error code.
    */
  def askPasswordFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[GTlsInteractionResult /* None */ ] = GResult.wrap(__errorPtr =>
    g_tls_interaction_ask_password_finish(
      this.raw.asInstanceOf[Ptr[GTlsInteraction]],
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Invoke the interaction to ask the user for a password. It invokes this
    * interaction in the main loop, specifically the #GMainContext returned by
    * g_main_context_get_thread_default() when the interaction is created. This
    * is called by called by #GTlsConnection or #GTlsDatabase to ask the user
    * for a password.
    *
    * Derived subclasses usually implement a password prompt, although they may
    * also choose to provide a password from elsewhere. The @password value will
    * be filled in and then @callback will be called. Alternatively the user may
    * abort this password request, which will usually abort the TLS connection.
    *
    * The implementation can either be a synchronous (eg: modal dialog) or an
    * asynchronous one (eg: modeless dialog). This function will take care of
    * calling which ever one correctly.
    *
    * If the interaction is cancelled by the cancellation object, or by the user
    * then %G_TLS_INTERACTION_FAILED will be returned with an error that
    * contains a %G_IO_ERROR_CANCELLED error code. Certain implementations may
    * not support immediate cancellation.
    */
  def invokeAskPassword(
      password: TlsPassword /* Some(Ptr[GTlsPassword]) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[GTlsInteractionResult /* None */ ] = GResult.wrap(__errorPtr =>
    g_tls_interaction_invoke_ask_password(
      this.raw.asInstanceOf[Ptr[GTlsInteraction]],
      password.getUnsafeRawPointer().asInstanceOf,
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Invoke the interaction to ask the user to choose a certificate to use with
    * the connection. It invokes this interaction in the main loop, specifically
    * the #GMainContext returned by g_main_context_get_thread_default() when the
    * interaction is created. This is called by called by #GTlsConnection when
    * the peer requests a certificate during the handshake.
    *
    * Derived subclasses usually implement a certificate selector, although they
    * may also choose to provide a certificate from elsewhere. Alternatively the
    * user may abort this certificate request, which may or may not abort the
    * TLS connection.
    *
    * The implementation can either be a synchronous (eg: modal dialog) or an
    * asynchronous one (eg: modeless dialog). This function will take care of
    * calling which ever one correctly.
    *
    * If the interaction is cancelled by the cancellation object, or by the user
    * then %G_TLS_INTERACTION_FAILED will be returned with an error that
    * contains a %G_IO_ERROR_CANCELLED error code. Certain implementations may
    * not support immediate cancellation.
    */
  def invokeRequestCertificate(
      connection: TlsConnection /* Some(Ptr[GTlsConnection]) */,
      flags: GTlsCertificateRequestFlags /* Some(GTlsCertificateRequestFlags) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[GTlsInteractionResult /* None */ ] = GResult.wrap(__errorPtr =>
    g_tls_interaction_invoke_request_certificate(
      this.raw.asInstanceOf[Ptr[GTlsInteraction]],
      connection.getUnsafeRawPointer().asInstanceOf,
      flags,
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Run synchronous interaction to ask the user to choose a certificate to use
    * with the connection. In general,
    * g_tls_interaction_invoke_request_certificate() should be used instead of
    * this function.
    *
    * Derived subclasses usually implement a certificate selector, although they
    * may also choose to provide a certificate from elsewhere. Alternatively the
    * user may abort this certificate request, which will usually abort the TLS
    * connection.
    *
    * If %G_TLS_INTERACTION_HANDLED is returned, then the #GTlsConnection passed
    * to g_tls_interaction_request_certificate() will have had its
    * #GTlsConnection:certificate filled in.
    *
    * If the interaction is cancelled by the cancellation object, or by the user
    * then %G_TLS_INTERACTION_FAILED will be returned with an error that
    * contains a %G_IO_ERROR_CANCELLED error code. Certain implementations may
    * not support immediate cancellation.
    */
  def requestCertificate(
      connection: TlsConnection /* Some(Ptr[GTlsConnection]) */,
      flags: GTlsCertificateRequestFlags /* Some(GTlsCertificateRequestFlags) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[GTlsInteractionResult /* None */ ] = GResult.wrap(__errorPtr =>
    g_tls_interaction_request_certificate(
      this.raw.asInstanceOf[Ptr[GTlsInteraction]],
      connection.getUnsafeRawPointer().asInstanceOf,
      flags,
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Run asynchronous interaction to ask the user for a certificate to use with
    * the connection. In general, g_tls_interaction_invoke_request_certificate()
    * should be used instead of this function.
    *
    * Derived subclasses usually implement a certificate selector, although they
    * may also choose to provide a certificate from elsewhere. @callback will be
    * called when the operation completes. Alternatively the user may abort this
    * certificate request, which will usually abort the TLS connection.
    */
  def requestCertificateAsync(
      connection: TlsConnection /* Some(Ptr[GTlsConnection]) */,
      flags: GTlsCertificateRequestFlags /* Some(GTlsCertificateRequestFlags) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ],
      callback: Option[GAsyncReadyCallback /* Some(GAsyncReadyCallback) */ ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ = g_tls_interaction_request_certificate_async(
    this.raw.asInstanceOf[Ptr[GTlsInteraction]],
    connection.getUnsafeRawPointer().asInstanceOf,
    flags,
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
    * Complete a request certificate user interaction request. This should be
    * once the g_tls_interaction_request_certificate_async() completion callback
    * is called.
    *
    * If %G_TLS_INTERACTION_HANDLED is returned, then the #GTlsConnection passed
    * to g_tls_interaction_request_certificate_async() will have had its
    * #GTlsConnection:certificate filled in.
    *
    * If the interaction is cancelled by the cancellation object, or by the user
    * then %G_TLS_INTERACTION_FAILED will be returned with an error that
    * contains a %G_IO_ERROR_CANCELLED error code.
    */
  def requestCertificateFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[GTlsInteractionResult /* None */ ] = GResult.wrap(__errorPtr =>
    g_tls_interaction_request_certificate_finish(
      this.raw.asInstanceOf[Ptr[GTlsInteraction]],
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

end TlsInteraction
