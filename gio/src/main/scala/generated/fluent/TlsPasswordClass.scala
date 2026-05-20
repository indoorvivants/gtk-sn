package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GTlsPasswordClass
import sn.gnome.gobject.ObjectClass

/** Class structure for #GTlsPassword.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TlsPasswordClass private[gnome] (raw: Ptr[GTlsPasswordClass]):

  def getUnsafeRawPointer(): Ptr[GTlsPasswordClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field get_value]: Field is missing <type>")
  private def getValue__ = ???
  @annotation.compileTimeOnly("[field set_value]: Field is missing <type>")
  private def setValue__ = ???
  @annotation.compileTimeOnly(
    "[field get_default_warning]: Field is missing <type>"
  )
  private def getDefaultWarning__ = ???

end TlsPasswordClass

object TlsPasswordClass:
  def fromRaw(ptr: Ptr[GTlsPasswordClass]): TlsPasswordClass =
    new TlsPasswordClass(ptr)
end TlsPasswordClass
