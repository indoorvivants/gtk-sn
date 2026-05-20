package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GPollableOutputStreamInterface
import sn.gnome.gobject.TypeInterface

/** The interface for pollable output streams.
  *
  * The default implementation of @can_poll always returns %TRUE.
  *
  * The default implementation of @write_nonblocking calls
  * g_pollable_output_stream_is_writable(), and then calls
  * g_output_stream_write() if it returns %TRUE. This means you only need to
  * override it if it is possible that your @is_writable implementation may
  * return %TRUE when the stream is not actually writable.
  *
  * The default implementation of @writev_nonblocking calls
  * g_pollable_output_stream_write_nonblocking() for each vector, and converts
  * its return value and error (if set) to a #GPollableReturn. You should
  * override this where possible to avoid having to allocate a #GError to return
  * %G_IO_ERROR_WOULD_BLOCK.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PollableOutputStreamInterface private[gnome] (
    raw: Ptr[GPollableOutputStreamInterface]
):

  def getUnsafeRawPointer(): Ptr[GPollableOutputStreamInterface] = this.raw

  /** The parent interface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field can_poll]: Field is missing <type>")
  private def canPoll__ = ???
  @annotation.compileTimeOnly("[field is_writable]: Field is missing <type>")
  private def isWritable__ = ???
  @annotation.compileTimeOnly("[field create_source]: Field is missing <type>")
  private def createSource__ = ???
  @annotation.compileTimeOnly(
    "[field write_nonblocking]: Field is missing <type>"
  )
  private def writeNonblocking__ = ???
  @annotation.compileTimeOnly(
    "[field writev_nonblocking]: Field is missing <type>"
  )
  private def writevNonblocking__ = ???
end PollableOutputStreamInterface

object PollableOutputStreamInterface:
  def fromRaw(
      ptr: Ptr[GPollableOutputStreamInterface]
  ): PollableOutputStreamInterface = new PollableOutputStreamInterface(ptr)
end PollableOutputStreamInterface
