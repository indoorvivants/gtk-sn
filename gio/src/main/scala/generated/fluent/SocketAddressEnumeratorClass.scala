package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GSocketAddressEnumeratorClass

/** Class structure for #GSocketAddressEnumerator.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SocketAddressEnumeratorClass private[gnome] (
    raw: Ptr[GSocketAddressEnumeratorClass]
):

  def getUnsafeRawPointer(): Ptr[GSocketAddressEnumeratorClass] = this.raw

  @annotation.compileTimeOnly("[field next]: Field is missing <type>")
  private def next__ = ???
  @annotation.compileTimeOnly("[field next_async]: Field is missing <type>")
  private def nextAsync__ = ???
  @annotation.compileTimeOnly("[field next_finish]: Field is missing <type>")
  private def nextFinish__ = ???
end SocketAddressEnumeratorClass

object SocketAddressEnumeratorClass:
  def fromRaw(
      ptr: Ptr[GSocketAddressEnumeratorClass]
  ): SocketAddressEnumeratorClass = new SocketAddressEnumeratorClass(ptr)
end SocketAddressEnumeratorClass
