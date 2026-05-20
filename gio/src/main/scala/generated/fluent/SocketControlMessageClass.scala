package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GSocketControlMessageClass
import sn.gnome.gobject.ObjectClass

/** Class structure for #GSocketControlMessage.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SocketControlMessageClass private[gnome] (
    raw: Ptr[GSocketControlMessageClass]
):

  def getUnsafeRawPointer(): Ptr[GSocketControlMessageClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field get_size]: Field is missing <type>")
  private def getSize__ = ???
  @annotation.compileTimeOnly("[field get_level]: Field is missing <type>")
  private def getLevel__ = ???
  @annotation.compileTimeOnly("[field get_type]: Field is missing <type>")
  private def getType__ = ???
  @annotation.compileTimeOnly("[field serialize]: Field is missing <type>")
  private def serialize__ = ???
  @annotation.compileTimeOnly("[field deserialize]: Field is missing <type>")
  private def deserialize__ = ???
  @annotation.compileTimeOnly("[field _g_reserved1]: Field is missing <type>")
  private def GReserved1__ = ???
  @annotation.compileTimeOnly("[field _g_reserved2]: Field is missing <type>")
  private def GReserved2__ = ???
  @annotation.compileTimeOnly("[field _g_reserved3]: Field is missing <type>")
  private def GReserved3__ = ???
  @annotation.compileTimeOnly("[field _g_reserved4]: Field is missing <type>")
  private def GReserved4__ = ???
  @annotation.compileTimeOnly("[field _g_reserved5]: Field is missing <type>")
  private def GReserved5__ = ???
end SocketControlMessageClass

object SocketControlMessageClass:
  def fromRaw(ptr: Ptr[GSocketControlMessageClass]): SocketControlMessageClass =
    new SocketControlMessageClass(ptr)
end SocketControlMessageClass
