package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.SocketControlMessageClass
import sn.gnome.gio.internal.GUnixCredentialsMessageClass

/** Class structure for #GUnixCredentialsMessage.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class UnixCredentialsMessageClass private[gnome] (
    raw: Ptr[GUnixCredentialsMessageClass]
):

  def getUnsafeRawPointer(): Ptr[GUnixCredentialsMessageClass] = this.raw

  def parentClass: sn.gnome.gio.SocketControlMessageClass /* None */ =
    (!raw).parent_class.asInstanceOf[GSocketControlMessageClass]
  @annotation.compileTimeOnly("[field _g_reserved1]: Field is missing <type>")
  private def GReserved1__ = ???
  @annotation.compileTimeOnly("[field _g_reserved2]: Field is missing <type>")
  private def GReserved2__ = ???
end UnixCredentialsMessageClass

object UnixCredentialsMessageClass:
  def fromRaw(
      ptr: Ptr[GUnixCredentialsMessageClass]
  ): UnixCredentialsMessageClass = new UnixCredentialsMessageClass(ptr)
end UnixCredentialsMessageClass
