package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{
  Converter,
  FilterOutputStream,
  OutputStream,
  PollableOutputStream
}
import sn.gnome.gio.internal.GConverterOutputStream

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Converter output stream implements #GOutputStream and allows conversion of
  * data of various types during reading.
  *
  * As of GLib 2.34, #GConverterOutputStream implements #GPollableOutputStream.
  */
class ConverterOutputStream(raw: Ptr[GConverterOutputStream])
    extends FilterOutputStream(raw.asInstanceOf),
      PollableOutputStream:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the #GConverter that is used by @converter_stream.
    */
  def getConverter(): Converter /* None */ = new Converter.Abstract(
    g_converter_output_stream_get_converter(
      this.raw.asInstanceOf[Ptr[GConverterOutputStream]]
    ).asInstanceOf
  )

end ConverterOutputStream

object ConverterOutputStream:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new converter output stream for the @base_stream.
    */
  def apply(
      base_stream: OutputStream /* Some(Ptr[GOutputStream]) */,
      converter: Converter /* Some(Ptr[GConverter]) */
  ): ConverterOutputStream = new ConverterOutputStream(
    g_converter_output_stream_new(
      base_stream.getUnsafeRawPointer().asInstanceOf,
      converter.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end ConverterOutputStream
