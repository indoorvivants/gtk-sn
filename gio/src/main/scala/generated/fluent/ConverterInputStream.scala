package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Converter
import sn.gnome.gio.fluent.FilterInputStream
import sn.gnome.gio.fluent.InputStream
import sn.gnome.gio.fluent.PollableInputStream
import sn.gnome.gio.internal.GConverterInputStream

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Converter input stream implements #GInputStream and allows conversion of
  * data of various types during reading.
  *
  * As of GLib 2.34, #GConverterInputStream implements #GPollableInputStream.
  */
class ConverterInputStream(raw: Ptr[GConverterInputStream])
    extends FilterInputStream(raw.asInstanceOf),
      PollableInputStream:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the #GConverter that is used by @converter_stream.
    */
  def getConverter(): Converter = new Converter.Abstract(
    g_converter_input_stream_get_converter(this.raw.asInstanceOf).asInstanceOf
  )

end ConverterInputStream

object ConverterInputStream:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new converter input stream for the @base_stream.
    */
  def apply(
      base_stream: InputStream,
      converter: Converter
  ): ConverterInputStream = new ConverterInputStream(
    g_converter_input_stream_new(
      base_stream.getUnsafeRawPointer().asInstanceOf,
      converter.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end ConverterInputStream
