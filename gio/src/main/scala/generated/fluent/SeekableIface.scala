package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GSeekableIface
import sn.gnome.gobject.TypeInterface

/** Provides an interface for implementing seekable functionality on I/O
  * Streams.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SeekableIface private[gnome] (raw: Ptr[GSeekableIface]):

  def getUnsafeRawPointer(): Ptr[GSeekableIface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field tell]: Field is missing <type>")
  private def tell__ = ???
  @annotation.compileTimeOnly("[field can_seek]: Field is missing <type>")
  private def canSeek__ = ???
  @annotation.compileTimeOnly("[field seek]: Field is missing <type>")
  private def seek__ = ???
  @annotation.compileTimeOnly("[field can_truncate]: Field is missing <type>")
  private def canTruncate__ = ???
  @annotation.compileTimeOnly("[field truncate_fn]: Field is missing <type>")
  private def truncateFn__ = ???
end SeekableIface

object SeekableIface:
  def fromRaw(ptr: Ptr[GSeekableIface]): SeekableIface = new SeekableIface(ptr)
end SeekableIface
