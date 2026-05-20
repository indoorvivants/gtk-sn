package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GTlsCertificateClass
import sn.gnome.gobject.ObjectClass

class TlsCertificateClass private[gnome] (raw: Ptr[GTlsCertificateClass]):

  def getUnsafeRawPointer(): Ptr[GTlsCertificateClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field verify]: Field is missing <type>")
  private def verify__ = ???

end TlsCertificateClass

object TlsCertificateClass:
  def fromRaw(ptr: Ptr[GTlsCertificateClass]): TlsCertificateClass =
    new TlsCertificateClass(ptr)
end TlsCertificateClass
