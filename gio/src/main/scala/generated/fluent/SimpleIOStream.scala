package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{IOStream, InputStream, OutputStream}
import sn.gnome.gio.internal.GSimpleIOStream
import sn.gnome.gobject.runtime.*

/** GSimpleIOStream creates a #GIOStream from an arbitrary #GInputStream and
  * #GOutputStream. This allows any pair of input and output streams to be used
  * with #GIOStream methods.
  *
  * This is useful when you obtained a #GInputStream and a #GOutputStream by
  * other means, for instance creating them with platform specific methods as
  * g_unix_input_stream_new() or g_win32_input_stream_new(), and you want to
  * take advantage of the methods provided by #GIOStream.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SimpleIOStream private[gnome] (raw: Ptr[GSimpleIOStream])
    extends IOStream(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end SimpleIOStream

object SimpleIOStream:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GSimpleIOStream])(using Runtime) =
    summon[Runtime].getOrCreate[SimpleIOStream](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new SimpleIOStream(ptr)
    )

  /** Creates a new #GSimpleIOStream wrapping @input_stream and @output_stream.
    * See also #GIOStream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      input_stream: sn.gnome.gio.fluent.InputStream /* Some(Ptr[GInputStream]) */,
      output_stream: sn.gnome.gio.fluent.OutputStream /* Some(Ptr[GOutputStream]) */
  )(using Runtime): SimpleIOStream =
    val raw: Ptr[Byte] = g_simple_io_stream_new(
      input_stream.getUnsafeRawPointer().asInstanceOf,
      output_stream.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime].getOrCreate[SimpleIOStream](
      raw,
      r => SimpleIOStream.applyUnsafe(r.asInstanceOf)
    )
  end apply
end SimpleIOStream
