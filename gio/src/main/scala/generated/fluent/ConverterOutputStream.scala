package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Converter
import sn.gnome.gio.fluent.FilterOutputStream
import sn.gnome.gio.fluent.OutputStream
import sn.gnome.gio.fluent.PollableOutputStream
import sn.gnome.gio.internal.GConverterOutputStream

class ConverterOutputStream(raw: Ptr[GConverterOutputStream])
    extends FilterOutputStream(raw.asInstanceOf),
      PollableOutputStream:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getConverter(): Converter = new Converter.Abstract(
    g_converter_output_stream_get_converter(this.raw.asInstanceOf).asInstanceOf
  )

end ConverterOutputStream

object ConverterOutputStream:
  def apply(
      base_stream: OutputStream,
      converter: Converter
  ): ConverterOutputStream = new ConverterOutputStream(
    g_converter_output_stream_new(
      base_stream.getUnsafeRawPointer().asInstanceOf,
      converter.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end ConverterOutputStream
