package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GTlsDatabaseClass
import sn.gnome.gobject.ObjectClass

/** The class for #GTlsDatabase. Derived classes should implement the various
  * virtual methods. _async and _finish methods have a default implementation
  * that runs the corresponding sync method in a thread.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TlsDatabaseClass private[gnome] (raw: Ptr[GTlsDatabaseClass]):

  def getUnsafeRawPointer(): Ptr[GTlsDatabaseClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field verify_chain]: Field is missing <type>")
  private def verifyChain__ = ???
  @annotation.compileTimeOnly(
    "[field verify_chain_async]: Field is missing <type>"
  )
  private def verifyChainAsync__ = ???
  @annotation.compileTimeOnly(
    "[field verify_chain_finish]: Field is missing <type>"
  )
  private def verifyChainFinish__ = ???
  @annotation.compileTimeOnly(
    "[field create_certificate_handle]: Field is missing <type>"
  )
  private def createCertificateHandle__ = ???
  @annotation.compileTimeOnly(
    "[field lookup_certificate_for_handle]: Field is missing <type>"
  )
  private def lookupCertificateForHandle__ = ???
  @annotation.compileTimeOnly(
    "[field lookup_certificate_for_handle_async]: Field is missing <type>"
  )
  private def lookupCertificateForHandleAsync__ = ???
  @annotation.compileTimeOnly(
    "[field lookup_certificate_for_handle_finish]: Field is missing <type>"
  )
  private def lookupCertificateForHandleFinish__ = ???
  @annotation.compileTimeOnly(
    "[field lookup_certificate_issuer]: Field is missing <type>"
  )
  private def lookupCertificateIssuer__ = ???
  @annotation.compileTimeOnly(
    "[field lookup_certificate_issuer_async]: Field is missing <type>"
  )
  private def lookupCertificateIssuerAsync__ = ???
  @annotation.compileTimeOnly(
    "[field lookup_certificate_issuer_finish]: Field is missing <type>"
  )
  private def lookupCertificateIssuerFinish__ = ???
  @annotation.compileTimeOnly(
    "[field lookup_certificates_issued_by]: Field is missing <type>"
  )
  private def lookupCertificatesIssuedBy__ = ???
  @annotation.compileTimeOnly(
    "[field lookup_certificates_issued_by_async]: Field is missing <type>"
  )
  private def lookupCertificatesIssuedByAsync__ = ???
  @annotation.compileTimeOnly(
    "[field lookup_certificates_issued_by_finish]: Field is missing <type>"
  )
  private def lookupCertificatesIssuedByFinish__ = ???

end TlsDatabaseClass

object TlsDatabaseClass:
  def fromRaw(ptr: Ptr[GTlsDatabaseClass]): TlsDatabaseClass =
    new TlsDatabaseClass(ptr)
end TlsDatabaseClass
