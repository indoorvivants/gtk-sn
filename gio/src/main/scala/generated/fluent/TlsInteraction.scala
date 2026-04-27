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

class TlsInteraction(raw: Ptr[GTlsInteraction])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def askPassword(
      password: TlsPassword,
      cancellable: Cancellable
  ): GResult[GTlsInteractionResult] = GResult.wrap(__errorPtr =>
    g_tls_interaction_ask_password(
      this.raw.asInstanceOf,
      password.getUnsafeRawPointer().asInstanceOf,
      cancellable.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  def askPasswordAsync(
      password: TlsPassword,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_tls_interaction_ask_password_async(
    this.raw.asInstanceOf,
    password.getUnsafeRawPointer().asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def askPasswordFinish(result: AsyncResult): GResult[GTlsInteractionResult] =
    GResult.wrap(__errorPtr =>
      g_tls_interaction_ask_password_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      )
    )

  def invokeAskPassword(
      password: TlsPassword,
      cancellable: Cancellable
  ): GResult[GTlsInteractionResult] = GResult.wrap(__errorPtr =>
    g_tls_interaction_invoke_ask_password(
      this.raw.asInstanceOf,
      password.getUnsafeRawPointer().asInstanceOf,
      cancellable.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  def invokeRequestCertificate(
      connection: TlsConnection,
      flags: GTlsCertificateRequestFlags,
      cancellable: Cancellable
  ): GResult[GTlsInteractionResult] = GResult.wrap(__errorPtr =>
    g_tls_interaction_invoke_request_certificate(
      this.raw.asInstanceOf,
      connection.getUnsafeRawPointer().asInstanceOf,
      flags,
      cancellable.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  def requestCertificate(
      connection: TlsConnection,
      flags: GTlsCertificateRequestFlags,
      cancellable: Cancellable
  ): GResult[GTlsInteractionResult] = GResult.wrap(__errorPtr =>
    g_tls_interaction_request_certificate(
      this.raw.asInstanceOf,
      connection.getUnsafeRawPointer().asInstanceOf,
      flags,
      cancellable.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  def requestCertificateAsync(
      connection: TlsConnection,
      flags: GTlsCertificateRequestFlags,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_tls_interaction_request_certificate_async(
    this.raw.asInstanceOf,
    connection.getUnsafeRawPointer().asInstanceOf,
    flags,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def requestCertificateFinish(
      result: AsyncResult
  ): GResult[GTlsInteractionResult] = GResult.wrap(__errorPtr =>
    g_tls_interaction_request_certificate_finish(
      this.raw.asInstanceOf,
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

end TlsInteraction
