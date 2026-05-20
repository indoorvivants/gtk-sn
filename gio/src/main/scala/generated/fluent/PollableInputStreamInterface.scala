package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GPollableInputStreamInterface
import sn.gnome.gobject.TypeInterface

/** The interface for pollable input streams.
  *
  * The default implementation of @can_poll always returns %TRUE.
  *
  * The default implementation of @read_nonblocking calls
  * g_pollable_input_stream_is_readable(), and then calls g_input_stream_read()
  * if it returns %TRUE. This means you only need to override it if it is
  * possible that your @is_readable implementation may return %TRUE when the
  * stream is not actually readable.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PollableInputStreamInterface private[gnome] (
    raw: Ptr[GPollableInputStreamInterface]
):

  def getUnsafeRawPointer(): Ptr[GPollableInputStreamInterface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field can_poll]: Field is missing <type>")
  private def canPoll__ = ???
  @annotation.compileTimeOnly("[field is_readable]: Field is missing <type>")
  private def isReadable__ = ???
  @annotation.compileTimeOnly("[field create_source]: Field is missing <type>")
  private def createSource__ = ???
  @annotation.compileTimeOnly(
    "[field read_nonblocking]: Field is missing <type>"
  )
  private def readNonblocking__ = ???
end PollableInputStreamInterface

object PollableInputStreamInterface:
  def fromRaw(
      ptr: Ptr[GPollableInputStreamInterface]
  ): PollableInputStreamInterface = new PollableInputStreamInterface(ptr)
end PollableInputStreamInterface
