package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{
  Converter,
  FilterInputStream,
  InputStream,
  PollableInputStream
}
import sn.gnome.gio.internal.GConverterInputStream

/** Converter input stream implements #GInputStream and allows conversion of
  * data of various types during reading.
  *
  * As of GLib 2.34, #GConverterInputStream implements #GPollableInputStream.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ConverterInputStream(raw: Ptr[GConverterInputStream])
    extends FilterInputStream(raw.asInstanceOf),
      PollableInputStream:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the #GConverter that is used by @converter_stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getConverter(): Converter /* None */ = new Converter.Abstract(
    g_converter_input_stream_get_converter(
      this.raw.asInstanceOf[Ptr[GConverterInputStream]]
    ).asInstanceOf
  )

end ConverterInputStream

object ConverterInputStream:
  /** Creates a new converter input stream for the @base_stream.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      base_stream: InputStream /* Some(Ptr[GInputStream]) */,
      converter: Converter /* Some(Ptr[GConverter]) */
  ): ConverterInputStream = new ConverterInputStream(
    g_converter_input_stream_new(
      base_stream.getUnsafeRawPointer().asInstanceOf,
      converter.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end ConverterInputStream
