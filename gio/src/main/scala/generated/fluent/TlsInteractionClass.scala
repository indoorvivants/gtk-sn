package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GTlsInteractionClass

/** The class for #GTlsInteraction. Derived classes implement the various
  * virtual interaction methods to handle TLS interactions.
  *
  * Derived classes can choose to implement whichever interactions methods
  * they'd like to support by overriding those virtual methods in their class
  * initialization function. If a derived class implements an async method, it
  * must also implement the corresponding finish method.
  *
  * The synchronous interaction methods should implement to display modal
  * dialogs, and the asynchronous methods to display modeless dialogs.
  *
  * If the user cancels an interaction, then the result should be
  * %G_TLS_INTERACTION_FAILED and the error should be set with a domain of
  * %G_IO_ERROR and code of %G_IO_ERROR_CANCELLED.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TlsInteractionClass private[gnome] (raw: Ptr[GTlsInteractionClass]):

  def getUnsafeRawPointer(): Ptr[GTlsInteractionClass] = this.raw

  @annotation.compileTimeOnly("[field ask_password]: Field is missing <type>")
  private def askPassword__ = ???
  @annotation.compileTimeOnly(
    "[field ask_password_async]: Field is missing <type>"
  )
  private def askPasswordAsync__ = ???
  @annotation.compileTimeOnly(
    "[field ask_password_finish]: Field is missing <type>"
  )
  private def askPasswordFinish__ = ???
  @annotation.compileTimeOnly(
    "[field request_certificate]: Field is missing <type>"
  )
  private def requestCertificate__ = ???
  @annotation.compileTimeOnly(
    "[field request_certificate_async]: Field is missing <type>"
  )
  private def requestCertificateAsync__ = ???
  @annotation.compileTimeOnly(
    "[field request_certificate_finish]: Field is missing <type>"
  )
  private def requestCertificateFinish__ = ???

end TlsInteractionClass

object TlsInteractionClass:
  def fromRaw(ptr: Ptr[GTlsInteractionClass]): TlsInteractionClass =
    new TlsInteractionClass(ptr)
end TlsInteractionClass
