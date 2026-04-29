package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.IOStream
import sn.gnome.gio.fluent.InputStream
import sn.gnome.gio.fluent.OutputStream
import sn.gnome.gio.internal.GSimpleIOStream

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * GSimpleIOStream creates a #GIOStream from an arbitrary #GInputStream and
  * #GOutputStream. This allows any pair of input and output streams to be used
  * with #GIOStream methods.
  *
  * This is useful when you obtained a #GInputStream and a #GOutputStream by
  * other means, for instance creating them with platform specific methods as
  * g_unix_input_stream_new() or g_win32_input_stream_new(), and you want to
  * take advantage of the methods provided by #GIOStream.
  */
class SimpleIOStream(raw: Ptr[GSimpleIOStream])
    extends IOStream(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end SimpleIOStream

object SimpleIOStream:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GSimpleIOStream wrapping @input_stream and @output_stream.
    * See also #GIOStream.
    */
  def apply(
      input_stream: InputStream,
      output_stream: OutputStream
  ): SimpleIOStream = new SimpleIOStream(
    g_simple_io_stream_new(
      input_stream.getUnsafeRawPointer().asInstanceOf,
      output_stream.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end SimpleIOStream
