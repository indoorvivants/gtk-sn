package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{
  AsyncResult,
  Cancellable,
  TlsCertificateRequestFlags,
  TlsConnection,
  TlsInteractionResult,
  TlsPassword
}
import sn.gnome.gio.internal.GTlsInteraction
import sn.gnome.glib.fluent.GResult
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*

/** #GTlsInteraction provides a mechanism for the TLS connection and database
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TlsInteraction private[gnome] (raw: Ptr[GTlsInteraction])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Run synchronous interaction to ask the user for a password. In general,
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
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def askPassword(
      password: sn.gnome.gio.fluent.TlsPassword /* Some(Ptr[GTlsPassword]) */,
      cancellable: Option[
        sn.gnome.gio.fluent.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[TlsInteractionResult /* None */ ] =
    GResult.wrap(__errorPtr =>
      TlsInteractionResult.fromRaw(
        g_tls_interaction_ask_password(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsInteraction]],
          password.getUnsafeRawPointer().asInstanceOf,
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        )
      )
    )
  end askPassword

  /** Run asynchronous interaction to ask the user for a password. In general,
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method ask_password_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def askPasswordAsync__ = ???

  /** Complete an ask password user interaction request. This should be once the
    * g_tls_interaction_ask_password_async() completion callback is called.
    *
    * If %G_TLS_INTERACTION_HANDLED is returned, then the #GTlsPassword passed
    * to g_tls_interaction_ask_password() will have its password filled in.
    *
    * If the interaction is cancelled by the cancellation object, or by the user
    * then %G_TLS_INTERACTION_FAILED will be returned with an error that
    * contains a %G_IO_ERROR_CANCELLED error code.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def askPasswordFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[TlsInteractionResult /* None */ ] =
    GResult.wrap(__errorPtr =>
      TlsInteractionResult.fromRaw(
        g_tls_interaction_ask_password_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsInteraction]],
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        )
      )
    )
  end askPasswordFinish

  /** Invoke the interaction to ask the user for a password. It invokes this
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def invokeAskPassword(
      password: sn.gnome.gio.fluent.TlsPassword /* Some(Ptr[GTlsPassword]) */,
      cancellable: Option[
        sn.gnome.gio.fluent.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[TlsInteractionResult /* None */ ] =
    GResult.wrap(__errorPtr =>
      TlsInteractionResult.fromRaw(
        g_tls_interaction_invoke_ask_password(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsInteraction]],
          password.getUnsafeRawPointer().asInstanceOf,
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        )
      )
    )
  end invokeAskPassword

  /** Invoke the interaction to ask the user to choose a certificate to use with
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def invokeRequestCertificate(
      connection: sn.gnome.gio.fluent.TlsConnection /* Some(Ptr[GTlsConnection]) */,
      flags: TlsCertificateRequestFlags /* Some(GTlsCertificateRequestFlags) */,
      cancellable: Option[
        sn.gnome.gio.fluent.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[TlsInteractionResult /* None */ ] =
    GResult.wrap(__errorPtr =>
      TlsInteractionResult.fromRaw(
        g_tls_interaction_invoke_request_certificate(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsInteraction]],
          connection.getUnsafeRawPointer().asInstanceOf,
          flags.raw,
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        )
      )
    )
  end invokeRequestCertificate

  /** Run synchronous interaction to ask the user to choose a certificate to use
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def requestCertificate(
      connection: sn.gnome.gio.fluent.TlsConnection /* Some(Ptr[GTlsConnection]) */,
      flags: TlsCertificateRequestFlags /* Some(GTlsCertificateRequestFlags) */,
      cancellable: Option[
        sn.gnome.gio.fluent.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[TlsInteractionResult /* None */ ] =
    GResult.wrap(__errorPtr =>
      TlsInteractionResult.fromRaw(
        g_tls_interaction_request_certificate(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsInteraction]],
          connection.getUnsafeRawPointer().asInstanceOf,
          flags.raw,
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        )
      )
    )
  end requestCertificate

  /** Run asynchronous interaction to ask the user for a certificate to use with
    * the connection. In general, g_tls_interaction_invoke_request_certificate()
    * should be used instead of this function.
    *
    * Derived subclasses usually implement a certificate selector, although they
    * may also choose to provide a certificate from elsewhere. @callback will be
    * called when the operation completes. Alternatively the user may abort this
    * certificate request, which will usually abort the TLS connection.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method request_certificate_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def requestCertificateAsync__ = ???

  /** Complete a request certificate user interaction request. This should be
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def requestCertificateFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[TlsInteractionResult /* None */ ] =
    GResult.wrap(__errorPtr =>
      TlsInteractionResult.fromRaw(
        g_tls_interaction_request_certificate_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GTlsInteraction]],
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        )
      )
    )
  end requestCertificateFinish

end TlsInteraction

object TlsInteraction:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GTlsInteraction])(using Runtime) =
    summon[Runtime].getOrCreate[TlsInteraction](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new TlsInteraction(ptr)
    )

end TlsInteraction
