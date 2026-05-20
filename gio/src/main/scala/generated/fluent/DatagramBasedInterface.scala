package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDatagramBasedInterface
import sn.gnome.gobject.TypeInterface

/** Provides an interface for socket-like objects which have datagram semantics,
  * following the Berkeley sockets API. The interface methods are thin wrappers
  * around the corresponding virtual methods, and no pre-processing of inputs is
  * implemented — so implementations of this API must handle all functionality
  * documented in the interface methods.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DatagramBasedInterface private[gnome] (raw: Ptr[GDatagramBasedInterface]):

  def getUnsafeRawPointer(): Ptr[GDatagramBasedInterface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly(
    "[field receive_messages]: Field is missing <type>"
  )
  private def receiveMessages__ = ???
  @annotation.compileTimeOnly("[field send_messages]: Field is missing <type>")
  private def sendMessages__ = ???
  @annotation.compileTimeOnly("[field create_source]: Field is missing <type>")
  private def createSource__ = ???
  @annotation.compileTimeOnly(
    "[field condition_check]: Field is missing <type>"
  )
  private def conditionCheck__ = ???
  @annotation.compileTimeOnly("[field condition_wait]: Field is missing <type>")
  private def conditionWait__ = ???
end DatagramBasedInterface

object DatagramBasedInterface:
  def fromRaw(ptr: Ptr[GDatagramBasedInterface]): DatagramBasedInterface =
    new DatagramBasedInterface(ptr)
end DatagramBasedInterface
